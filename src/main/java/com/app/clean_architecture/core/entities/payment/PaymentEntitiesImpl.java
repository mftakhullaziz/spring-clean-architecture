package com.app.clean_architecture.core.entities.payment;

import com.app.clean_architecture.application.stereotype.EntitiesBusiness;
import com.app.clean_architecture.infrastructure.midtrans.MidtransGateway;

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
