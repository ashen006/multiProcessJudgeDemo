package com.curry.demo.dao;

import java.math.BigDecimal;

/**
 * @Author: Curry
 * @Date: 2019/3/30 15:54
 * 模拟数据库支付渠道表
 */
public class Channel {
    /**
     * 支付渠道ID
     */
    private String channelId;
    /**
     * 支付渠道折扣
     */
    private BigDecimal discountRate;

    public Channel(String channelId, BigDecimal discountRate) {
        this.channelId = channelId;
        this.discountRate = discountRate;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public BigDecimal getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(BigDecimal discountRate) {
        this.discountRate = discountRate;
    }
}
