package com.bp.goodservice.controller.Impl;


import com.baidu.ueditor.ActionEnter;
import com.bp.goodservice.controller.UeditorController;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author Qiu Baoping
 * @E-mail sssrrr879@126.com
 * @Phone 15849311404
 * @Date Create on 2018/11/12/012 21:55
 */
@Controller
public class UeditorControllerImpl implements UeditorController {
    @Override
    public String getUeditor() {
        return "page/addItem";
    }

    @Override
    public void config(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("application/json");
        String rootPath = request.getSession().getServletContext().getRealPath("/");
        try {
            String exec = new ActionEnter(request, rootPath).exec();
            PrintWriter writer = response.getWriter();
            writer.write(exec);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
