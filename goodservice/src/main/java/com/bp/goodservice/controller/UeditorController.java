package com.bp.goodservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author Qiu Baoping
 * @E-mail sssrrr879@126.com
 * @Phone 15849311404
 * @Date Create on 2018/11/12/012 21:51
 */
//@RequestMapping(value = "/ue")
public interface UeditorController {
    @RequestMapping(value="/ue",method = RequestMethod.GET)
    String getUeditor();

    @RequestMapping(value="/ue/config")
    void config(HttpServletRequest request, HttpServletResponse response);
}
