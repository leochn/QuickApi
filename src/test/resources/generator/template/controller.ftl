package ${basePackage}.controller;

import com.github.pagehelper.PageInfo;
import ${basePackage}.core.Result;
import ${basePackage}.core.ResultGenerator;
import ${basePackage}.pojo.${modelNameUpperCamel};
import ${basePackage}.service.${modelNameUpperCamel}Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ${author} on ${date}.
 */
@RestController
@RequestMapping("/api")
public class ${modelNameUpperCamel}Controller {

    @Autowired
    private ${modelNameUpperCamel}Service ${modelNameLowerCamel}Service;  
    
    /**
     * 分页获取数据
     * @param page
     * @param rows
     * @return
     */
    @GetMapping("/${modelNameLowerCamel}List")
    public Result getPageList(
    		@RequestParam(value = "page") Integer page,
			@RequestParam(value = "rows") Integer rows) {
    	PageInfo<${modelNameUpperCamel}> pageInfo = this.${modelNameLowerCamel}Service.queryPageListByWhere(new ${modelNameUpperCamel}(), page, rows);
		if (pageInfo != null) {
			return ResultGenerator.genSuccessResult(pageInfo.getTotal(), pageInfo.getList());
		}
		return ResultGenerator.genNotFoundResult();
    }

    /**
     * 分页查询,并根据字段排序
     * @param page
     * @param rows
     * @param sortField
     * @param sortOrder
     * @return
     */
    @GetMapping("/${modelNameLowerCamel}ListOrderBy")
    public Result getPageListAndOrderBy(
    		@RequestParam(value = "page") Integer page,
			@RequestParam(value = "rows") Integer rows,
			@RequestParam(value = "sortField", defaultValue = "ID") String sortField,
			@RequestParam(value = "sortOrder", defaultValue = "asc") String sortOrder) {
    	PageInfo<${modelNameUpperCamel}> pageInfo = this.${modelNameLowerCamel}Service.queryPageListByWhereAndOrderBy(new ${modelNameUpperCamel}(), page, rows, sortField, sortOrder);
		if (pageInfo != null) {
			return ResultGenerator.genSuccessResult(pageInfo.getTotal(), pageInfo.getList());
		}
		return ResultGenerator.genNotFoundResult();
    }
    
    /**
     * 获取全部数据
     * @return
     */
	@GetMapping("/${modelNameLowerCamel}s")
	public Result all() {
		List<${modelNameUpperCamel}> list = this.${modelNameLowerCamel}Service.queryAll();
		if (list != null) {
			return ResultGenerator.genSuccessResult(list.size(), list);
		}
		return ResultGenerator.genNotFoundResult();
	}
	
	/**
     * 根据id,获取单个数据
     * @param id
     * @return
     */
    @GetMapping("/${modelNameLowerCamel}/{id}")
    public Result detail(@PathVariable String id) {
        ${modelNameUpperCamel} record = this.${modelNameLowerCamel}Service.queryById(id);
        if (record != null) {
        	return ResultGenerator.genSuccessResult(1,record);
		}
        return ResultGenerator.genNotFoundResult();
    }
    
    /**
	 * 根据某个字段值获取一条数据
	 * @param fieldName
	 * @param value
	 * @return
	 */
	@GetMapping("/${modelNameLowerCamel}/{fieldName}/{value}")
	public Result queryByFieldName(
			@PathVariable("fieldName") String fieldName,
			@PathVariable("value") String value) {
		${modelNameUpperCamel} record = this.${modelNameLowerCamel}Service.queryByFieldName(fieldName, value);
		if (record != null) {
			return ResultGenerator.genSuccessResult(1, record);
		}
		return ResultGenerator.genFailResult();
	}
    
    /**
	 * 新增一条信息
	 * @return
	 */
	@PostMapping("/${modelNameLowerCamel}")
	public Result add(@RequestBody ${modelNameUpperCamel} record) {
		Integer num = this.${modelNameLowerCamel}Service.saveSelective(record);
		if (num == 1) {
			return ResultGenerator.genSuccessResult();
		}
		return ResultGenerator.genFailResult();
	}
	
	/**
	 * 更新数据
	 * @param id
	 * @param record
	 * @return
	 */
	@PutMapping("/${modelNameLowerCamel}/{id}")
	public Result update(@PathVariable("id") String id, @RequestBody ${modelNameUpperCamel} record) {
		Integer num = this.${modelNameLowerCamel}Service.updateSelective(record);
		if (num == 1) {
			return ResultGenerator.genSuccessResult();
		}
		return ResultGenerator.genFailResult();
	}
	
	/**
	 * 根据id删除数据
	 * @param id
	 * @return
	 */
	@DeleteMapping("/${modelNameLowerCamel}/{id}")
	public Result delete(@PathVariable("id") String id) {
		Integer num = this.${modelNameLowerCamel}Service.deleteById(id);
		if (num == 1) {
			return ResultGenerator.genSuccessResult();
		}
		return ResultGenerator.genFailResult();
	}

}
