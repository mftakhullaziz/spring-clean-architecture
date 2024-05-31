package com.app.springcleanarch.core.usecase.order;

import com.app.springcleanarch.application.stereotype.Usecase;
import com.app.springcleanarch.core.entities.cart.CartEntities;
import com.app.springcleanarch.core.entities.order.OrderEntities;
import com.app.springcleanarch.core.entities.promo.PromoEntities;
import com.app.springcleanarch.domain.order.OrderRequest;
import com.app.springcleanarch.domain.order.OrderResponse;

@Usecase
public class OrderUsecase implements IOrderBoundary {

    private final PromoEntities promoEntities;
    private final CartEntities cartEntities;
    private final OrderEntities orderEntities;

    public OrderUsecase(PromoEntities promoEntities, CartEntities cartEntities, OrderEntities orderEntities) {
        this.promoEntities = promoEntities;
        this.cartEntities = cartEntities;
        this.orderEntities = orderEntities;
    }

    @Override
    public void executeOrder(OrderRequest orderRequest, OOrderBoundary oOrderBoundary) {
        // validate request
        if (orderRequest == null) {
            throw new IllegalArgumentException("OrderRequest cannot be null");
        }

        // get carts
        cartEntities.getCartByCustomerId(orderRequest.getCustomerId());

        // apply promo code
        promoEntities.applyPromoByCode(orderRequest.getPromoCode());

        // create order
        Integer orderId = orderEntities.createOrder();

        OrderResponse orderResponse = new OrderResponse();
        oOrderBoundary.presenter(orderResponse);
    }


}
