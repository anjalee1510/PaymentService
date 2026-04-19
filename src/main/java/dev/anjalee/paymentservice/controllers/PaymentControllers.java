package dev.anjalee.paymentservice.controllers;

import com.razorpay.RazorpayException;
import com.stripe.exception.StripeException;
import dev.anjalee.paymentservice.dtos.PaymentRequestDTO;
import dev.anjalee.paymentservice.services.IPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
   /genratePaymentLink
   Type:POST
   Request:{
   "orderId":"12345"
   }
   Response:{
   "paymentLink" : "
 */

@RestController
@RequestMapping("/api/payments")
public class PaymentControllers {

    @Autowired
    private IPaymentService paymentService;

    @PostMapping
    public ResponseEntity<String> generatePaymentLink(@RequestBody PaymentRequestDTO requestDTO) throws RazorpayException, StripeException {
        String link= paymentService.generatePaymentLink(requestDTO.getOrderId(),requestDTO.getAmount(),
                requestDTO.getPhoneNumber(),requestDTO.getName(),requestDTO.getEmail());
        System.out.println("Payment link generated in controller: " + link);
        return ResponseEntity.ok(link);
    }

}

