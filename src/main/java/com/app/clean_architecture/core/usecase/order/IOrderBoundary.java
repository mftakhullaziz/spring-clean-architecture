package com.app.clean_architecture.core.usecase.order;

import com.app.clean_architecture.domain.order.OrderRequest;

public interface IOrderBoundary {
    void executeOrder(OrderRequest orderRequest, OOrderBoundary oOrderBoundary);
}
