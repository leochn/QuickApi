package com.vnext.controller;

import com.github.pagehelper.PageInfo;
import com.vnext.core.Result;
import com.vnext.core.ResultGenerator;
import com.vnext.pojo.ServiceValuesToday;
import com.vnext.service.ServiceValuesTodayService;

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
 * Created by CodeGenerator on 2017/08/08.
 */
@RestController
@RequestMapping("/api")
public class ServiceValuesTodayController {

    @Autowired
    private ServiceValuesTodayService serviceValuesTodayService;  
    
    /**
     * 分页获取数据
     * @param page
     * @param rows
     * @return
     */
    @GetMapping("/serviceValuesTodayList")
    public Result getPageList(
    		@RequestParam(value = "page") Integer page,
			@RequestParam(value = "rows") Integer rows) {
    	PageInfo<ServiceValuesToday> pageInfo = this.serviceValuesTodayService.queryPageListByWhere(new ServiceValuesToday(), page, rows);
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
    @GetMapping("/serviceValuesTodayListOrderBy")
    public Result getPageListAndOrderBy(
    		@RequestParam(value = "page") Integer page,
			@RequestParam(value = "rows") Integer rows,
			@RequestParam(value = "sortField", defaultValue = "ID") String sortField,
			@RequestParam(value = "sortOrder", defaultValue = "asc") String sortOrder) {
    	PageInfo<ServiceValuesToday> pageInfo = this.serviceValuesTodayService.queryPageListByWhereAndOrderBy(new ServiceValuesToday(), page, rows, sortField, sortOrder);
		if (pageInfo != null) {
			return ResultGenerator.genSuccessResult(pageInfo.getTotal(), pageInfo.getList());
		}
		return ResultGenerator.genNotFoundResult();
    }
    
    /**
     * 获取全部数据
     * @return
     */
	@GetMapping("/serviceValuesTodays")
	public Result all() {
		List<ServiceValuesToday> list = this.serviceValuesTodayService.queryAll();
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
    @GetMapping("/serviceValuesToday/{id}")
    public Result detail(@PathVariable String id) {
        ServiceValuesToday record = this.serviceValuesTodayService.queryById(id);
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
	@GetMapping("/serviceValuesToday/{fieldName}/{value}")
	public Result queryByFieldName(
			@PathVariable("fieldName") String fieldName,
			@PathVariable("value") String value) {
		ServiceValuesToday record = this.serviceValuesTodayService.queryByFieldName(fieldName, value);
		if (record != null) {
			return ResultGenerator.genSuccessResult(1, record);
		}
		return ResultGenerator.genFailResult();
	}
    
    /**
	 * 新增一条信息
	 * @return
	 */
	@PostMapping("/serviceValuesToday")
	public Result add(@RequestBody ServiceValuesToday record) {
		Integer num = this.serviceValuesTodayService.saveSelective(record);
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
	@PutMapping("/serviceValuesToday/{id}")
	public Result update(@PathVariable("id") String id, @RequestBody ServiceValuesToday record) {
		Integer num = this.serviceValuesTodayService.updateSelective(record);
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
	@DeleteMapping("/sysUser/{id}")
	public Result delete(@PathVariable("id") String id) {
		Integer num = this.serviceValuesTodayService.deleteById(id);
		if (num == 1) {
			return ResultGenerator.genSuccessResult();
		}
		return ResultGenerator.genFailResult();
	}

}
