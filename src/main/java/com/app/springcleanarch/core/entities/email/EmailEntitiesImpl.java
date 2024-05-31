package com.app.springcleanarch.core.entities.email;

import com.app.springcleanarch.application.stereotype.EntitiesBusiness;
import com.app.springcleanarch.infrastructure.googlemail.GoogleMailGateway;

@EntitiesBusiness
public class EmailEntitiesImpl implements EmailEntities {

    private final GoogleMailGateway googleMailGateway;

    public EmailEntitiesImpl(GoogleMailGateway googleMailGateway) {
        this.googleMailGateway = googleMailGateway;
    }

    @Override
    public void sendEmailActivation(String to) {
        // build logic set email
        // build logic set subject
        // build logic to sed message body
        googleMailGateway.sendMailActivateRegister(to);
    }

}
