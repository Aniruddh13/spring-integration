package ani.spring.integration.service;

import ani.spring.integration.model.OrderConfirmation;

public interface OrderService {

    public OrderConfirmation order(String clientId, String productId, int quantity);
}