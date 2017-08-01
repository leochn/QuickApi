package com.vnext.controller;

import com.vnext.core.Result;
import com.vnext.core.ResultGenerator;
import com.vnext.pojo.SysUser;
import com.vnext.service.SysUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
* Created by CodeGenerator on 2017/08/01.
*/
@RestController
@RequestMapping("/sysUser")
public class SysUserController {
    @Resource
    private SysUserService sysUserService;  

    @GetMapping("/{id}")
    public Result detail(@PathVariable String id) {
    	System.out.println("id=============" + id);
        SysUser sysUser = sysUserService.queryById(id);
        //int b = 10 / 0;
        return ResultGenerator.genSuccessResult(sysUser);
    }

}
