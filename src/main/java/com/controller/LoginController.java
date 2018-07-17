package com.controller;

import com.bean.User;
import com.repository.UserRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 作者  :      fireworkor  3159553637@qq.com
 * 日期  :        2018/05/05  10:44  星期六
 * 描述  :
 */
@ApiModel(value = "用户实体类")
@RestController
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String tologin() {
        return "login";
    }

    @PostMapping("/login")
    public String Index(User user) {
        System.out.println(user);
        User u = userRepository.findByUsernameAndPassword(user.getUsername(),user.getPassword());
        System.out.println(u);
        if (user.getUsername().equals(u.getUsername())&&user.getPassword().equals(u.getPassword())) {
            return "index";
        }
        return "error";
    }
    @GetMapping("/toindex")
    public String toIndex() {
            return "index";
    }


}
