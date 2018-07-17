package com.controller;

import com.bean.Comment;
import com.repository.CommentRepository;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者  :      fireworkor  3159553637@qq.com
 * 日期  :        2018/05/05  10:44  星期六
 * 描述  :
 */

@ApiModel(value = "评论实体类")
@RestController
public class CommentController {
    @Autowired
    private CommentRepository commentRepository;

    @ApiOperation("添加一个")
    @PostMapping("/comment/save")
    public void save(Comment comment) {
        System.out.println(comment);
        commentRepository.save(comment);
    }


    @ApiOperation("删除一个")
    @PostMapping("/comment/delete")
    public void delete(Comment comment) {
        System.out.println(comment);
        commentRepository.delete(comment);
    }


    @ApiOperation("通过Id删")
    @PostMapping("/comment/deleteById")
    public void deleteById(Comment comment) {
        System.out.println(comment);
        commentRepository.deleteById(comment.getId());
    }

    @ApiOperation("删除所有")
    @PostMapping("/comment/deleteAll")
    public void delete() {
        commentRepository.deleteAll();
    }

    @ApiOperation("更新一个")
    @PostMapping("/comment/update")
    public void update(  Comment comment) {
        commentRepository.save(comment);
    }
    @ApiOperation("查询所有")
    @GetMapping("/comment/findAll")
    public List<Comment> findAll() {
        ArrayList<Comment> list = new ArrayList<>();
        Iterable<Comment>  all  = commentRepository.findAll();
        all.forEach(x -> list.add(x));
        return list;
    }

    @ApiOperation("通过用户名查多个")
    @PostMapping("/comment/findByUserName")
    public List<Comment> findByUserName(Comment comment) {
        return commentRepository.findByUsername(comment.getUsername());
    }

//    @PostMapping("/comment/findById")
//    public Comment findById(Comment comment) {
//        return commentRepository.findById(comment.getId()).get();
//    }

}
