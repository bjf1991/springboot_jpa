package com.binbinbin.controller;

import com.binbinbin.PageableTools;
import com.binbinbin.dao.TestRepository;
import com.binbinbin.entity.TestEntity;
import com.binbinbin.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2018/1/18.
 */
@RestController
public class TestController {
    @Autowired
    TestRepository testRepository;
    @RequestMapping("/hello")
    public String say(){
        return "Hello SpringBoot!";
    }
    @GetMapping(value = "/list")
    private Page<TestEntity> testList() {
        return testRepository.findAll(PageableTools.basicPage(1));
    }
    /*@GetMapping(value = "/list2")
    private Page<TestEntity> testList2() {
        return testService.queryPageForList();
    }*/
}
