package com.bean;

import ch.qos.logback.classic.db.names.ColumnName;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.UniqueElements;
import javax.persistence.*;

/**
 * 作者  :      fireworkor  3159553637@qq.com
 * 日期  :        2018/05/18  22:55  星期五
 * 描述  :
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"username","id"})})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty("用户id")
    private Long   id;
    @ApiModelProperty("用户名字")
    @Column(unique = true )
//    @NotBlank
    private String username;

    @ApiModelProperty("用户密码")
    private String password;
}
