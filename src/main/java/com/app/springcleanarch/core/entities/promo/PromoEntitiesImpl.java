package com.app.springcleanarch.core.entities.promo;

import com.app.springcleanarch.application.stereotype.EntitiesBusiness;
import com.app.springcleanarch.infrastructure.mysql.gateway.PromoJpaGateway;

@EntitiesBusiness
public class PromoEntitiesImpl implements PromoEntities {

    private final PromoJpaGateway promoJpaGateway;

    public PromoEntitiesImpl(PromoJpaGateway promoJpaGateway) {
        this.promoJpaGateway = promoJpaGateway;
    }

    @Override
    public void applyPromoByCode(String promoCode) {
        if (promoJpaGateway.checkPromoIsExist(promoCode)) {
            promoJpaGateway.applyPromo(promoCode);
        }
    }
}
