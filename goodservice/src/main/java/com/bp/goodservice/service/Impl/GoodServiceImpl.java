package com.bp.goodservice.service.Impl;

import com.bp.goodservice.service.GoodsService;
import org.springframework.stereotype.Service;

/**
 * @Author Qiu Baoping
 * @E-mail sssrrr879@126.com
 * @Phone 15849311404
 * @Date Create on 2018/11/10/010 22:11
 */
@Service
public class GoodServiceImpl implements GoodsService {
    @Override
    public String test() {
        String content = "我是测试页";
        return content;
    }
}
