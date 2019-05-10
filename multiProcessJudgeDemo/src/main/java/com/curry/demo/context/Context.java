package com.curry.demo.context;

import com.curry.factory.ChannelFactory;
import com.curry.pay.Pay;

import java.math.BigDecimal;

/**
 * @Author: Curry
 * @Date: 2019/3/31 11:12
 */
public class Context {

    public BigDecimal pay(String channel,String goodsId){
        ChannelFactory channelFactory = ChannelFactory.getInstance();
        Pay payInstance = channelFactory.create(channel);
        return payInstance.callPay(goodsId,channel);
    }
}
