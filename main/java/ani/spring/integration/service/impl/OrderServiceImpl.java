package ani.spring.integration.service.impl;

import java.util.Calendar;

import org.springframework.stereotype.Service;

import ani.spring.integration.exception.ClientNotFoundException;
import ani.spring.integration.model.OrderConfirmation;
import ani.spring.integration.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
    private static final String VALID_CLIENT_ID = "123";

    @Override
    public OrderConfirmation order(String clientId, String productId, int quantity) {
        if (!VALID_CLIENT_ID.equals(clientId)) {
            throw new ClientNotFoundException("Client ["+clientId+"] not found");
        }

        OrderConfirmation response = new OrderConfirmation();
        response.setAmount(55.99f);
        response.setConfirmationId("GHKG34L");
        Calendar cal = Calendar.getInstance();
        cal.set(2024, 1, 12);
        response.setOrderDate(cal.getTime());

        return response;
    }
}
