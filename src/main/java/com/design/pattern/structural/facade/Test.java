package com.design.pattern.structural.facade;

/**
 * @description:
 * @author: liuzh01
 * @create: 2019-05-08 09:50:52
 */
public class Test {

    public static void main(String[] args) {

        PointGift pointGift = new PointGift("T-shirt");
        GiftExchangeService giftExchangeService = new GiftExchangeService();

        giftExchangeService.giftChange(pointGift);
    }
}
