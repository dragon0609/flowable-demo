/**   
* @Title: SysteUserService.java 
* @Package com.htcs.flowabledemo.service 
* @Description: TODO(用一句话描述该文件做什么) 
* @author 你的名字   
* @date 2018年11月13日 下午1:56:39 
* @version V1.0   
*/
package com.htcs.flowabledemo.service;

import java.util.List;

import com.htcs.flowabledemo.model.SystemUser;

public interface SysteUserService {

	int addUser(List<SystemUser > systemUser)throws Exception ;
	
	int addUser1(List<SystemUser > systemUser);
	int addUser2(List<SystemUser > systemUser)throws Exception ;
}
