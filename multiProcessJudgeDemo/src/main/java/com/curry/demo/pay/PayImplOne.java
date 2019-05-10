package com.curry.demo.pay;

import com.curry.dao.PayDao;

import java.math.BigDecimal;

/**
 * @Author: Curry
 * @Date: 2019/3/30 15:32
 */
@PayAnno(channel = "cmbc")
public class PayImplOne implements Pay {
    @Override
    public BigDecimal callPay(String goodsId,String payChannelId) {
        return PayDao.getGood(goodsId).getGoodsPrice()
                .multiply(PayDao.getChannel(payChannelId).getDiscountRate());
    }
}
