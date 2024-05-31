package com.app.clean_architecture.core.entities.order;

import com.app.clean_architecture.application.stereotype.EntitiesBusiness;

@EntitiesBusiness
public class OrderEntitiesImpl implements OrderEntities {

    @Override
    public Integer createOrder() {
        return 0;
    }

}
