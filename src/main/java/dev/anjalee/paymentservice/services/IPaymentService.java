package dev.anjalee.paymentservice.services;

import com.razorpay.RazorpayException;
import org.springframework.stereotype.Service;


public interface IPaymentService {

    public String generatePaymentLink(String orderId,Long amount,String phoneNumber,String name,String email) throws RazorpayException;
}
