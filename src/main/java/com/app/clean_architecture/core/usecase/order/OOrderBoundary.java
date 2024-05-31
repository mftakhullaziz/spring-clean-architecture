package com.app.clean_architecture.core.usecase.order;

import com.app.clean_architecture.domain.order.OrderResponse;

public interface OOrderBoundary {
    void presenter(OrderResponse orderResponse);
}
