package dev.anjalee.paymentservice.strategies;

import com.razorpay.RazorpayException;

public interface PaymentGateway {

        public String generatePaymentLink(String orderId,
                                          Long amount,
                                          String phoneNumber,
                                          String name,
                                          String email) throws RazorpayException;
}
