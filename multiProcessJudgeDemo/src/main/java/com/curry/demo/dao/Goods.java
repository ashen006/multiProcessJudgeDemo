package com.curry.demo.dao;

import java.math.BigDecimal;

/**
 * @Author: Curry
 * @Date: 2019/3/30 15:54
 * 模拟数据库货物表
 */
public class Goods {
    /**
     * 货物ID
     */
    private String goodsId;
    /**
     * 货物价格
     */
    private BigDecimal goodsPrice;

    public Goods(String goodsId, BigDecimal goodsPrice) {
        this.goodsId = goodsId;
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }
}
