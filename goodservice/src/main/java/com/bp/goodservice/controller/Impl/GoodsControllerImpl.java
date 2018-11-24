package com.bp.goodservice.controller.Impl;

import com.bp.goodservice.controller.GoodsController;
import com.bp.goodservice.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

/**
 * @Author Qiu Baoping
 * @E-mail sssrrr879@126.com
 * @Phone 15849311404
 * @Date Create on 2018/11/10/010 22:15
 */
@Controller
public class GoodsControllerImpl implements GoodsController{

    @Autowired
    GoodsService gs;

    @Override
    public String test(Model model) {
        model.addAttribute("welcome",gs.test());
        return "index";
    }
}
