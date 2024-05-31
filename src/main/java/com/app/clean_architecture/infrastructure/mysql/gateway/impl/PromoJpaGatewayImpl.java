package com.app.clean_architecture.infrastructure.mysql.gateway.impl;

import com.app.clean_architecture.application.stereotype.Gateway;
import com.app.clean_architecture.infrastructure.mysql.gateway.PromoJpaGateway;
import com.app.clean_architecture.infrastructure.mysql.repository.PromoRepository;

@Gateway
public class PromoJpaGatewayImpl implements PromoJpaGateway {

    private final PromoRepository promoRepository;

    public PromoJpaGatewayImpl(PromoRepository promoRepository) {
        this.promoRepository = promoRepository;
    }

    @Override
    public boolean checkPromoIsExist(String promoCode) {
        return false;
    }

    @Override
    public void applyPromo(String promoCode) {

    }
}
