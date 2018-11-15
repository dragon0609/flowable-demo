/**   
* @Title: SystemUserController.java 
* @Package com.htcs.flowabledemo.controller 
* @Description: TODO(用一句话描述该文件做什么) 
* @author 你的名字   
* @date 2018年11月13日 下午2:04:50 
* @version V1.0   
*/
package com.htcs.flowabledemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.htcs.flowabledemo.model.SystemUser;
import com.htcs.flowabledemo.model.dto.SystemUserDto;
import com.htcs.flowabledemo.service.impl.SystemUserServiceImpl;

@RequestMapping("/user")
@Controller
public class SystemUserController {

	@Autowired
	SystemUserServiceImpl systemUserServiceImpl;
	
	@ResponseBody
	@Transactional(rollbackFor = {Exception.class}, propagation=Propagation.REQUIRED)
	@PostMapping(value = "/add",  consumes = "application/json; charset=utf-8")
	public String addUser(@RequestBody SystemUserDto systemUserDto) {
		int i = 0;
		try {
			i += add1(systemUserDto.getSystemUser());
			i += add2(systemUserDto.getSystemUser());
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		return String.valueOf(i);
	}
	
	public int add1(List<SystemUser>systemUser) {
		return systemUserServiceImpl.addUser1(systemUser);
	}
	public int add2(List<SystemUser>systemUser) throws Exception {
		return systemUserServiceImpl.addUser2(systemUser);
	}
}
