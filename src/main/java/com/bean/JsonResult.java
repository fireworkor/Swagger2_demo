package com.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 作者  :      fireworkor  3159553637@qq.com
 * 日期  :        2018/05/19  14:09  星期六
 * 描述  :
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JsonResult {

    private String status = null;

    private Object result = null;

}
