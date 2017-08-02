package com.vnext.controller;

import com.github.pagehelper.PageInfo;
import com.vnext.core.Result;
import com.vnext.core.ResultGenerator;
import com.vnext.pojo.SysUser;
import com.vnext.service.SysUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by CodeGenerator on 2017/08/02.
 */
@RestController
@RequestMapping("/api")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;  

    /**
     * 分页获取数据,并根据字段排序
     * @param page
     * @param rows
     * @param sortField
     * @param sortOrder
     * @return
     */
    @GetMapping("/sysUserList")
    public Result getPageListAndOrderBy(
    		@RequestParam(value = "page") Integer page,
			@RequestParam(value = "rows") Integer rows,
			@RequestParam(value = "sortField", defaultValue = "ID") String sortField,
			@RequestParam(value = "sortOrder", defaultValue = "asc") String sortOrder) {
    	PageInfo<SysUser> pageInfo = this.sysUserService.queryPageListByWhereAndOrderBy(new SysUser(), page, rows, sortField, sortOrder);
		if (pageInfo != null) {
			return ResultGenerator.genSuccessResult(pageInfo.getTotal(), pageInfo.getList());
		}
		return ResultGenerator.genNotFoundResult();
    }
    
    /**
     * 获取全部数据
     * @return
     */
	@GetMapping("/sysUsers")
	public Result all() {
		List<SysUser> list = this.sysUserService.queryAll();
		if (list != null) {
			return ResultGenerator.genSuccessResult(list.size(), list);
		}
		return ResultGenerator.genNotFoundResult();
	}
	
	/**
     * 获取单个数据
     * @param id
     * @return
     */
    @GetMapping("/sysUser/{id}")
    public Result detail(@PathVariable String id) {
        SysUser record = this.sysUserService.queryById(id);
        if (record != null) {
        	return ResultGenerator.genSuccessResult(1,record);
		}
        return ResultGenerator.genNotFoundResult();
    }
    
    /**
	 * 新增一条信息
	 * @return
	 */
	@PostMapping("/sysUser")
	public Result add(@RequestBody SysUser record) {
		Integer num = this.sysUserService.saveSelective(record);
		if (num == 1) {
			return ResultGenerator.genSuccessResult();
		}
		return ResultGenerator.genFailResult();
	}
	
	/**
	 * 根据某个字段值获取一条数据
	 * @param fieldName
	 * @param value
	 * @return
	 */
	@GetMapping("/sysUser/{fieldName}/{value}")
	public Result queryByFieldName(
			@PathVariable("fieldName") String fieldName,
			@PathVariable("value") String value) {
		SysUser record = this.sysUserService.queryByFieldName(fieldName, value);
		if (record != null) {
			return ResultGenerator.genSuccessResult(1, record);
		}
		return ResultGenerator.genFailResult();
	}
	
	/**
	 * 更新数据
	 * @param id
	 * @param record
	 * @return
	 */
	@PutMapping("/sysUser/{id}")
	public Result update(@PathVariable("id") String id, @RequestBody SysUser record) {
		Integer num = this.sysUserService.updateSelective(record);
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
		Integer num = this.sysUserService.deleteById(id);
		if (num == 1) {
			return ResultGenerator.genSuccessResult();
		}
		return ResultGenerator.genFailResult();
	}

}
