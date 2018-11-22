package com.htcs.flowabledemo.controller;

import com.htcs.flowabledemo.model.SystemGroup;
import com.htcs.flowabledemo.model.SystemUser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/login")
@RestController
public class FlowableProcess {

    private static final String RESOLVE_ACTION_NEW_VERSION = "newVersino";

    /**
     * 方法实现说明
     *      登陆验证
     * @author      Y
     * @date        2018/11/22 16:40
     */
    @RequestMapping(value = "/rest/account", method = RequestMethod.GET)
    public SystemUser getAccount(){
        SystemUser systemUser = new SystemUser();

        systemUser.setId("admin");
        systemUser.setFirstName("test");
        systemUser.setLastName("YliangY");
        systemUser.setEmail("admin111@qq.com");
        systemUser.setFullname("testYliangY");


        List<SystemGroup> groups = new ArrayList<>();
        SystemGroup systemGroup = new SystemGroup();
        systemGroup.setId("1001");
        systemGroup.setName("开发");
        systemGroup.setType("security-roile");
        groups.add(systemGroup);

        systemUser.setGroups(groups);
        systemUser.setPrivileges(null);

        return systemUser;
    }

    /**
     * 方法实现说明
     *      退出登录
     * @author      Y
     * @param
     * @return
     * @date        2018/11/22 17:51
     */
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(){
        System.out.println("退出定路");
        return null;
    }
}