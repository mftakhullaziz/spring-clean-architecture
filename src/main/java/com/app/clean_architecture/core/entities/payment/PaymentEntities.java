package com.app.clean_architecture.core.entities.payment;

public interface PaymentEntities {
    void createPayment(String customerId, Integer amount);
}
