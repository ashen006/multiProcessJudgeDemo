package com.curry.demo.pay;

import java.math.BigDecimal;

/**
 * @Author: Curry
 * @Date: 2019/3/30 15:31
 * 支付接口
 */
public interface Pay {
    BigDecimal callPay(String goodsId, String payChannelId);
}
