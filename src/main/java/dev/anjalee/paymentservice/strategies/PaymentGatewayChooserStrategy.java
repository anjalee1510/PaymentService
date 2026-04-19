package dev.anjalee.paymentservice.strategies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.ThreadLocalRandom;

@Component
public class PaymentGatewayChooserStrategy {

    @Autowired
    private RazorPayGateway razorpayGateway;
    @Autowired
    private StripeGateway stripeGateway;

    private static final double RAZORPAY_WEIGHT = 0.7;

    public PaymentGateway getBestPaymentGateway(){
        /*
            * Logic to choose the best payment gateway can be implemented here.
         */
//        return razorpayGateway;
         // 70%


            double random = ThreadLocalRandom.current().nextDouble();
            return random < RAZORPAY_WEIGHT ? razorpayGateway : stripeGateway;
    }
}
