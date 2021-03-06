package com.yuyixi.aboutspring.controller;

import com.yuyixi.aboutspring.entity.User;
import com.yuyixi.aboutspring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("add")
    public Object addUser(@RequestBody User user) {
        try {
            userService.addUser(user);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @PostMapping("addUserWithTranscationAndTryIsNoUse")
    public Object addUserWithTranscationAndTryIsNoUse(@RequestBody User user) {
        try {
            userService.addUserWithTranscationAndTryIsNoUse(user);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @PostMapping("addUserWithTranscationAndTryIsNoUseButWeCanThrow")
    public Object addUserWithTranscationAndTryIsNoUseButWeCanThrow(@RequestBody User user) {
        try {
            userService.addUserWithTranscationAndTryIsNoUseButWeCanThrow(user);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @PostMapping("addUserWithTranscationAndTryIsNoUseButWeCanHandleBySelf")
    public Object addUserWithTranscationAndTryIsNoUseButWeCanHandleBySelf(@RequestBody User user) {
        try {
            userService.addUserWithTranscationAndTryIsNoUseButWeCanHandleBySelf(user);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
