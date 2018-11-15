package com.htcs.flowabledemo;

import java.util.LinkedList;
import java.util.List;

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
	
    @Test
    public void contextLoads() {
    	List<SystemUser> list = new LinkedList<>();
    	for(int i=0; i<5; i++) {
    		SystemUser systemUser = new SystemUser();
    		systemUser.setUserId(i+1);
    		systemUser.setUserName("A"+i);
    		list.add(systemUser);
    	}
    	try {
			systemUserService.addUser(list);
		} catch (Exception e) {
			System.out.println("出现异常："+e.getLocalizedMessage());
		}
    }

}
