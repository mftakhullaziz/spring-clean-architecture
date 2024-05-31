package com.app.springcleanarch.core.usecase.order;

import com.app.springcleanarch.domain.order.OrderRequest;

public interface IOrderBoundary {
    void executeOrder(OrderRequest orderRequest, OOrderBoundary oOrderBoundary);
}
