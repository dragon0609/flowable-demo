package com.htcs.flowabledemo;

import java.util.LinkedList;
import java.util.List;

import org.flowable.engine.RuntimeService;
import org.flowable.engine.runtime.ProcessInstance;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.htcs.flowabledemo.service.SysteUserService;
import com.htcs.flowabledemo.model.SystemUser;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = FlowableDemoApplication.class)
public class FlowableDemoApplicationTests {

	@Autowired
	SysteUserService systemUserService;

	@Autowired
	RuntimeService runtimeService;

    @Test
    public void contextLoads() {
    	ProcessInstance pi = runtimeService.startProcessInstanceByKey("myeProcess", "kkkkeee");
		System.out.println(pi.getId());
    }

}
