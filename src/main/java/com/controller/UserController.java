package com.controller;

import com.bean.User;
import com.repository.UserRepository;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者  :      fireworkor  3159553637@qq.com
 * 日期  :        2018/05/18  23:24  星期五
 * 描述  :
 */
@ApiModel(value = "用户实体类")
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @ApiOperation( "添加一个")
    @PostMapping("/user/save")
    public void save(User user) {
        System.out.println(user);
        userRepository.save(user);
    }
    @ApiOperation("删除一个")
    @PostMapping("/user/delete")
    public void delete(User user) {
        System.out.println(user);
        userRepository.delete(user);
    }
    @ApiOperation("通过Id删")
    @PostMapping("/user/deleteById")
    public void deleteById(User user) {
        System.out.println(user);
        userRepository.deleteById(user.getId());
    }
    @ApiOperation("删除所有")
    @PostMapping("/user/deleteAll")
    public void delete() {
        userRepository.deleteAll();
    }

    @ApiOperation("查找所有")

    @GetMapping("/user/findAll")
    public List<User> findAll() {

        ArrayList<User> list = new ArrayList<>();

        Iterable<User> all = userRepository.findAll( );
        all.forEach(x->list.add(x));
        return list;
    }
    @ApiOperation("通过名字查找")

    @PostMapping("/user/findByUsername")
    public User findByUsername(User user) {
        return userRepository.findByUsername(user.getUsername());
    }
}
