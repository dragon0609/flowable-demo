package com.htcs.flowabledemo.controller;

import org.flowable.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/process")
@RestController
public class FlowableProcess {

    @Autowired
    RuntimeService runtimeService;


    @RequestMapping("/start")
    @ResponseBody
    public String start(){
        String bizKey = UUID.randomUUID().toString();
        runtimeService.startProcessInstanceByKey("BusinessProcess", bizKey);
        return  null;
    }
}