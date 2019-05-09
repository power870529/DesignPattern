package com.design.pattern.structural.facade;

/**
 * @description:
 * @author: liuzh01
 * @create: 2019-05-08 09:47:41
 */
public class GiftExchangeService {

    private QualifyService qualifyService = new QualifyService();
    private PointPaymentService pointPaymentService = new PointPaymentService();
    private ShippingService shippingService = new ShippingService();

    public void giftChange(PointGift pointGift) {
        if (qualifyService.isAvailable(pointGift)) {
            // 资格审核通过

            if (pointPaymentService.pay(pointGift)) {
                // 支付完成

                String shipNo = shippingService.shipGift(pointGift);
                System.out.println(shipNo);
            }
        }
    }
}
