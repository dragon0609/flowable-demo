package com.htcs.flowabledemo.controller;

import com.htcs.flowabledemo.model.SystemGroup;
import com.htcs.flowabledemo.model.SystemUser;
import org.flowable.ui.common.model.GroupRepresentation;
import org.flowable.ui.common.model.UserRepresentation;
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
     *     登陆验证
     * @author      Y
     * @date        2018/11/22 16:40
     */
    @RequestMapping(value = "/rest/account", method = RequestMethod.GET)
    public UserRepresentation getAccount(){
        UserRepresentation userRepresentation = new UserRepresentation();

        userRepresentation.setId("admin");
        userRepresentation.setFirstName("Test");
        userRepresentation.setLastName("Yliang");
        userRepresentation.setEmail("admin111@qq.com");
        userRepresentation.setFullName("TestYliang");

        List<GroupRepresentation> groups = new ArrayList<>();
        GroupRepresentation groupRepresentation = new GroupRepresentation();
        groupRepresentation.setId("1001");
        groupRepresentation.setName("开发");
        groupRepresentation.setType("security-roile");
        groups.add(groupRepresentation);

        userRepresentation.setGroups(groups);
        userRepresentation.setPrivileges(null);

        return userRepresentation;
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