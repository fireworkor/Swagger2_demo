package com.repository;

import com.bean.Comment;
import com.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 作者  :      fireworkor  3159553637@qq.com
 * 日期  :        2018/05/18  22:57  星期五
 * 描述  :
 */
@ResponseBody
public interface CommentRepository extends JpaRepository<Comment,Long> {

      List<Comment> findByUsername(String username);
      List<Comment> findByTitle(String title);
      void deleteByUsername(String username);
}
