package com.curry.demo.factory;

import com.curry.pay.Pay;
import com.curry.pay.PayAnno;

import org.reflections.Reflections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


/**
 * @Author: Curry
 * @Date: 2019/3/30 16:03
 * 支付渠道工厂类
 */
public class ChannelFactory {

    /**
     * 支付渠道集合
     */
    public static Map<String,String> map = new HashMap<>();
    static {
        Reflections reflections= new Reflections("com.curry.pay");
        Set<Class<?>> annoSet = reflections.getTypesAnnotatedWith(PayAnno.class);
        for (Class clzss:annoSet){
            PayAnno payAnno = (PayAnno) clzss.getAnnotation(PayAnno.class);
            map.put(payAnno.channel(),clzss.getCanonicalName());
        }
    }
    /**
     * 私有化构造函数
     */
    private ChannelFactory(){}
    /**
     * 返回单例
     */
    public static ChannelFactory getInstance(){
        return InnerFactory.channelFactory;
    }
    /**
     * 静态内部类实现实例创建
     */
    private static class InnerFactory{
        private static final ChannelFactory channelFactory = new ChannelFactory();
    }

    /**
     * 通过反射创建具体的支付渠道实例
     */
    public Pay create(String channelId){
        String className = map.get(channelId);
        try {
            Class payClass = Class.forName(className);
            return (Pay) payClass.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }
}

