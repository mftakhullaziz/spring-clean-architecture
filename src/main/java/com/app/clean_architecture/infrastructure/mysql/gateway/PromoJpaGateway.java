package com.app.clean_architecture.infrastructure.mysql.gateway;

public interface PromoJpaGateway {
    boolean checkPromoIsExist(String promoCode);
    void applyPromo(String promoCode);
}
