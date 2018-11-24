package com.bp.goodservice.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * @Author Qiu Baoping
 * @E-mail sssrrr879@126.com
 * @Phone 15849311404
 * @Date Create on 2018/11/10/010 22:13
 */

public interface GoodsController {

    @RequestMapping(value="/hi",method = RequestMethod.GET)
    String test(Model model);
}
