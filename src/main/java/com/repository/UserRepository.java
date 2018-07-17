package com.repository;

import com.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 作者  :      fireworkor  3159553637@qq.com
 * 日期  :        2018/05/18  22:57  星期五
 * 描述  :
 */
@ResponseBody
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String name);
    User findByUsernameAndPassword(String name,String password);
    void deleteByUsername(String name);
}
