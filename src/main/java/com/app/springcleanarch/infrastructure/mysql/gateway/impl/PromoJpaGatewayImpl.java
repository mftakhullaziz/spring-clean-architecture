package com.app.springcleanarch.infrastructure.mysql.gateway.impl;

import com.app.springcleanarch.application.stereotype.Gateway;
import com.app.springcleanarch.infrastructure.mysql.gateway.PromoJpaGateway;
import com.app.springcleanarch.infrastructure.mysql.repository.PromoRepository;

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
