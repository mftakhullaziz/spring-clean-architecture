package com.app.springcleanarch.core.entities.payment;

import com.app.springcleanarch.application.stereotype.EntitiesBusiness;
import com.app.springcleanarch.infrastructure.midtrans.MidtransGateway;

@EntitiesBusiness
public class PaymentEntitiesImpl implements PaymentEntities {

    private final MidtransGateway midtransGateway;

    public PaymentEntitiesImpl(MidtransGateway midtransGateway) {
        this.midtransGateway = midtransGateway;
    }

    @Override
    public void createPayment(String customerId, Integer amount) {
        midtransGateway.createPayment();
    }
}
