package com.app.springcleanarch.infrastructure.mysql.gateway;

public interface PromoJpaGateway {
    boolean checkPromoIsExist(String promoCode);
    void applyPromo(String promoCode);
}
