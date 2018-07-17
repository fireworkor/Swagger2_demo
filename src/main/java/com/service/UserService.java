package com.service;

import com.bean.User;
import com.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 作者  :      fireworkor  3159553637@qq.com
 * 日期  :        2018/05/19  10:52  星期六
 * 描述  :
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    public void save(User user) {
        userRepository.save(user);
    }


}
