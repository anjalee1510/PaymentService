package dev.anjalee.paymentservice.strategies;

import org.springframework.stereotype.Component;

@Component
public class Stripe implements PaymentGateway{
    @Override
    public String generatePaymentLink(String orderId, Long amount, String phoneNumber, String name, String email) {
        return "";
    }
}
