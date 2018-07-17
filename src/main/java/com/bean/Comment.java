package com.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 作者  :      fireworkor  3159553637@qq.com
 * 日期  :        2018/05/18  22:55  星期五
 * 描述  :
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @ApiModelProperty("评论id")
    private long   id;
    @ApiModelProperty("评论题目")
    private String title;
    @ApiModelProperty("评论内容")
    private String content;
    @ApiModelProperty("评论的用户名字")
    private String username;
}
