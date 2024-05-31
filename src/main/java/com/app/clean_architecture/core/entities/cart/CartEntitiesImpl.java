package com.app.clean_architecture.core.entities.cart;

import com.app.clean_architecture.application.stereotype.EntitiesBusiness;

@EntitiesBusiness
public class CartEntitiesImpl implements CartEntities {

    @Override
    public void getCartByCustomerId(Integer customerId) {
        // todo get cart
    }
}
