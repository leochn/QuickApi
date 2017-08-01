package com.vnext.controller;

import com.vnext.core.Result;
import com.vnext.core.ResultGenerator;
import com.vnext.pojo.Function;
import com.vnext.service.FunctionService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2017/08/01.
*/
@RestController
@RequestMapping("/function")
public class FunctionController {
    @Resource
    private FunctionService functionService;  

    @GetMapping("/function/{id}")
    public Result detail(@PathVariable String id) {
        Function function = functionService.queryById(id);
        return ResultGenerator.genSuccessResult(function);
    }

}
