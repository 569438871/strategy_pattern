package com.gp_stu.strategy;

public class EmptyStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("无促销活动！");
    }
}
