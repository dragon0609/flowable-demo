/**   
* @Title: SystemUserServiceImpl.java 
* @Package com.htcs.flowabledemo.service.impl 
* @Description: TODO(用一句话描述该文件做什么) 
* @author 你的名字   
* @date 2018年11月13日 下午1:57:07 
* @version V1.0   
*/
package com.htcs.flowabledemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.htcs.flowabledemo.dao.SystemUserMapper;
import com.htcs.flowabledemo.model.SystemUser;
import com.htcs.flowabledemo.service.SysteUserService;


@Service
public class SystemUserServiceImpl implements SysteUserService {

	@Autowired
	SystemUserMapper systemUserMapper;
	
	@Transactional(rollbackFor= {Exception.class},propagation=Propagation.REQUIRED)
	@Override
	public int addUser(List<SystemUser > systemUser) throws Exception {
		int k = 0;
		for (SystemUser su : systemUser) {
			k += systemUserMapper.insertSelective(su);
		}
		if (k > 3) {
			throw new Exception("不能一次增加太多");
		}
		return k;
	}
	
	
	public int addUser1(List<SystemUser > systemUser) {
		int k = 0;
		for (SystemUser su : systemUser) {
			k += systemUserMapper.insertSelective(su);
		}
		return k;
	}
	
	public int addUser2(List<SystemUser > systemUser)throws Exception {
		int k = 0;
		for (SystemUser su : systemUser) {
			k += systemUserMapper.insertSelective(su);
		}
		if (k > 3) {
			throw new Exception("不能一次增加太多");
		}
		return k;
	}
}
