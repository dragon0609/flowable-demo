/**   
* @Title: SystemUserDto.java 
* @Package com.htcs.flowabledemo.model.dto 
* @Description: TODO(用一句话描述该文件做什么) 
* @author 你的名字   
* @date 2018年11月13日 下午4:04:35 
* @version V1.0   
*/
package com.htcs.flowabledemo.model.dto;

import java.util.List;

import com.htcs.flowabledemo.model.SystemUser;

public class SystemUserDto {

	private List<SystemUser> systemUser;

	public List<SystemUser> getSystemUser() {
		return systemUser;
	}

	public void setSystemUser(List<SystemUser> systemUser) {
		this.systemUser = systemUser;
	}
	
}
