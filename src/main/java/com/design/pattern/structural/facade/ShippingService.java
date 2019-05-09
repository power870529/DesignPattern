package com.design.pattern.structural.facade;

/**
 * @description:
 * @author: liuzh01
 * @create: 2019-05-08 09:45:18
 */
public class ShippingService {

    public String shipGift(PointGift pointGift) {

        String shipNo = "666";
        System.out.println("积分礼物：" + pointGift.getName() + "已发货，物流单号：" + shipNo + "。");
        return shipNo;
    }
}
