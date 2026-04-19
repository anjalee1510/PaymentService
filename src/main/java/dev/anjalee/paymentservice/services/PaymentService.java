package dev.anjalee.paymentservice.services;

import com.razorpay.RazorpayException;
import dev.anjalee.paymentservice.strategies.PaymentGateway;
import dev.anjalee.paymentservice.strategies.PaymentGatewayChooserStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService implements IPaymentService {

    @Autowired
    private PaymentGatewayChooserStrategy paymentGatewayChooserStrategy;


    @Override
    public String generatePaymentLink(String orderId, Long amount, String phoneNumber, String name, String email) throws RazorpayException {

        PaymentGateway paymentGateway = paymentGatewayChooserStrategy.getBestPaymentGateway();

        String link =paymentGateway.generatePaymentLink(orderId, amount,
                phoneNumber, name, email);
        return link;
    }
}
