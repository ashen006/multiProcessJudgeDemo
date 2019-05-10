package com.curry.demo.dao;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Curry
 * @Date: 2019/3/30 15:34
 * 模拟数据库存储数据
 */
public class PayDao {

    static Map<String,Goods> goodsMap = new HashMap<>();
    static Map<String,Channel> channelMap = new HashMap<>();
    static {

        goodsMap.put("1001",new Goods("1001",new BigDecimal(5480)));
        goodsMap.put("1002",new Goods("1002",new BigDecimal(6280)));
        channelMap.put("cmbc",new Channel("cmbc",new BigDecimal(0.95)));
        channelMap.put("icbc",new Channel("icbc",new BigDecimal(0.8)));

        /*goodsMap.put("1001",new Goods("1001",new BigDecimal("5480")));
        goodsMap.put("1002",new Goods("1002",new BigDecimal("6280")));
        channelMap.put("cmbc",new Channel("cmbc",new BigDecimal("0.95")));
        channelMap.put("icbc",new Channel("icbc",new BigDecimal("0.8")));*/
    }

    public static Goods getGood(String goodId){
        return goodsMap.get(goodId);
    }
    public static Channel getChannel(String channelId){
        return channelMap.get(channelId);
    }

}