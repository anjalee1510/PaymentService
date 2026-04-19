package dev.anjalee.paymentservice.strategies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentGatewayChooserStrategy {

    @Autowired
    private RazorPay razorpayGateway;

    public PaymentGateway getBestPaymentGateway(){
        /*
            * Logic to choose the best payment gateway can be implemented here.
         */
        return razorpayGateway;
    }
}
