package com.dionlan.hrpayroll.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dionlan.hrpayroll.entities.Payment;
import com.dionlan.hrpayroll.entities.Worker;
import com.dionlan.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {

	@Autowired
	private WorkerFeignClient workerFeignClient;

	public Payment getPayment(Long workeId, Integer days) {
		
		Worker worker = workerFeignClient.findById(workeId).getBody();
		
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}