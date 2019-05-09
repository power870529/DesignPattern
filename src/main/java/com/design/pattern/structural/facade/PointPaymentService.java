package com.design.pattern.structural.facade;

/**
 * @description:
 * @author: liuzh01
 * @create: 2019-05-08 09:43:22
 */
public class PointPaymentService {

    public boolean pay(PointGift pointGift) {

        System.out.println("积分礼物:" + pointGift.getName() + "支付完成。");
        return true;
    }
}
