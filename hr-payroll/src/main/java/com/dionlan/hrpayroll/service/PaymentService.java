package com.dionlan.hrpayroll.service;

import org.springframework.stereotype.Service;

import com.dionlan.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(Long workeId, Integer days) {
		return new Payment("Bob", 200.00, days);
	}
	
}
