package com.app.springcleanarch.core.usecase.order;

import com.app.springcleanarch.domain.order.OrderResponse;

public interface OOrderBoundary {
    void presenter(OrderResponse orderResponse);
}
