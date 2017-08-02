package com.vnext.service;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.exceptions.TooManyResultsException;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.vnext.core.ServiceException;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.entity.Example;

public abstract class BaseService<T> {
	
	@Autowired
	private Mapper<T> mapper;
	
	private Class<T> modelClass;    // 当前泛型真实类型的Class
	
	@SuppressWarnings("unchecked")
	public BaseService() {
        ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
        modelClass = (Class<T>) pt.getActualTypeArguments()[0];
    }

	/**
	 * 根据id查询数据
	 * 
	 * @param id
	 * @return
	 */
	public T queryById(String id) {
		return mapper.selectByPrimaryKey(id);
	}

	/**
	 * 查询所有数据
	 * 
	 * @return
	 */
	public List<T> queryAll() {
		return mapper.select(null);
	}

	/**
	 * 根据条件查询一条数据,如果有多条数据会抛出异常
	 * @param record
	 * @return
	 */
	public T queryOne(T record) throws TooManyResultsException{
		return mapper.selectOne(record);
	}
	
	/**
	 * 根据某个字段值获取一条数据,如果查询出多条数据会报错,查询字段值唯一的那一列.
	 * @param fieldName
	 * @param value
	 * @return
	 * @throws TooManyResultsException
	 */
	public T queryByFieldName(String fieldName, Object value) throws TooManyResultsException {
        try {
            T model = modelClass.newInstance();
            Field field = modelClass.getDeclaredField(fieldName);
            field.setAccessible(true);
            field.set(model, value);
            return mapper.selectOne(model);
        } catch (ReflectiveOperationException e) {
            throw new ServiceException(e.getMessage(), e);
        }
    }

	/**
	 * 根据条件查询数据列表
	 * 
	 * @param record
	 * @return
	 */
	public List<T> queryListByWhere(T record) {
		return mapper.select(record);
	}

	/**
	 * 分页查询
	 * 
	 * @param page
	 * @param rows
	 * @param record
	 * @return
	 */
	public PageInfo<T> queryPageListByWhere(T record,Integer page, Integer rows) {
		// 设置分页条件
		PageHelper.startPage(page, rows);
		List<T> list = this.queryListByWhere(record);
		return new PageInfo<T>(list);
	}
	
	/**
	 * 分页排序查询
	 * 
	 * @param page
	 * @param rows
	 * @param record
	 * @return
	 */
	public PageInfo<T> queryPageListByWhereAndOrderBy(T record,Integer page, Integer rows, String sortField, String sortOrder) {
		// 需要对排序的javabean属性进行解析,解析成数据库字段
		//String sortField = CamelToUnderlineUtil.underlineToCamel(sort);
		//String sortField = sort;
		// 设置分页条件
		PageHelper.startPage(page, rows);
		Example example = new Example(record.getClass());
		if (StringUtils.isNotEmpty(sortField) && StringUtils.isNotEmpty(sortOrder)) {
			String orderBy = sortField + " " + sortOrder;
			example.setOrderByClause(orderBy); // 设置排序信息
		}
		List<T> list = this.mapper.selectByExample(example);
		return new PageInfo<T>(list);
	}

	/**
	 * 新增数据，返回成功的条数
	 * 
	 * @param record
	 * @return
	 */
	public Integer save(T record) {
		return mapper.insert(record);
	}

	/**
	 * 新增数据，使用不为null的字段，返回成功的条数
	 * 
	 * @param record
	 * @return
	 */
	public Integer saveSelective(T record) {
		return mapper.insertSelective(record);
	}
	
	/**
	 * 批量持久化
	 * @param models
	 */
	/*public void save(List<T> models) {
        mapper.insertList(models);
    }*/

	/**
	 * 修改数据，返回成功的条数
	 * 
	 * @param record
	 * @return
	 */
	public Integer update(T record) {
		return mapper.updateByPrimaryKey(record);
	}

	/**
	 * 修改数据，使用不为null的字段，返回成功的条数
	 * 
	 * @param record
	 * @return
	 */
	public Integer updateSelective(T record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	/**
	 * 根据id删除数据
	 * 
	 * @param id
	 * @return
	 */
	public Integer deleteById(String id) {
		return mapper.deleteByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 * 
	 * @param clazz
	 * @param property
	 * @param values
	 * @return
	 */
	public Integer deleteByIds(Class<T> clazz, String property, List<Object> values) {
		Example example = new Example(clazz);
		example.createCriteria().andIn(property, values);
		return mapper.deleteByExample(example);
	}

	/**
	 * 根据条件做删除
	 * 
	 * @param record
	 * @return
	 */
	public Integer deleteByWhere(T record) {
		return mapper.delete(record);
	}

}