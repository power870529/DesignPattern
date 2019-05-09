package com.design.pattern.structural.facade;

/**
 * @description:
 * @author: liuzh01
 * @create: 2019-05-08 09:41:54
 */
public class QualifyService {

    public boolean isAvailable(PointGift pointGift) {

        System.out.println("积分礼物：" + pointGift.getName() + "资格校验通过，可以进行兑换。");
        return true;
    }
}
