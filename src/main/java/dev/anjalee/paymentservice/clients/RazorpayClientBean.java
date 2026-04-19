package dev.anjalee.paymentservice.clients;

import com.razorpay.RazorpayException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RazorpayClientBean {


    @Value("${razorpay.keyId}")
    private String razorpayKeyId;

    @Value("${razorpay.keySecret}")
    private String razorpayKeySecret;

    @Bean
    public com.razorpay.RazorpayClient getRazorpayClient() throws RazorpayException {
        // Logic to create and return a Razorpay client instance
        return new com.razorpay.RazorpayClient(razorpayKeyId, razorpayKeySecret);
    }
}
