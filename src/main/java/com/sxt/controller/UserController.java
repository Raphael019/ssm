package com.sxt.controller;

import com.sxt.po.User;
import com.sxt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("getUser")
    @ResponseBody
    public User getUser(Integer id) throws Exception {
        return userService.queryById(id);
    }

    @RequestMapping("userList")
    @ResponseBody
    public List<User> queryByName(String name) throws Exception {
        List<User> userList = userService.queryByName(name);
        return  userList;
    }

    @RequestMapping("updatByUser")
    @ResponseBody
    public Integer updateById(User user) throws Exception {
        return userService.update(user);
    }

    @RequestMapping("queryByNameList")
    @ResponseBody
    public Integer queryByNameList(String name){
        System.out.println(name+"+++++++++++++++++++++++++");
       int  row = userService.queryByNameList(name);
       return row;
    }
}
