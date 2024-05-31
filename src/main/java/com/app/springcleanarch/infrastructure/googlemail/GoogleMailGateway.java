package com.app.springcleanarch.infrastructure.googlemail;

public interface GoogleMailGateway {
    void sendMailActivateRegister(String email);
    void sendMailNotificationPayment(String email);
    void sendMailNotificationOrder(String email);
}
