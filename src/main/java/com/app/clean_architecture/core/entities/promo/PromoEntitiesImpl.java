package com.app.clean_architecture.core.entities.promo;

import com.app.clean_architecture.application.stereotype.EntitiesBusiness;
import com.app.clean_architecture.infrastructure.mysql.gateway.PromoJpaGateway;

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
