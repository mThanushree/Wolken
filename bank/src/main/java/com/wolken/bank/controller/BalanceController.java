package com.wolken.bank.controller;

import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class BalanceController {
 
	Logger logger = LoggerFactory.getLogger(this.getClass());
	@GetMapping("getBalance")
	String getBalance() {
		logger.info( "Net Balance");
		return "zero balance";
	}
	
	@GetMapping("getAccountDetails")
	String getAccountDetails() {
		logger.info("Details of Account");
		return "Customer name-Thanushree" + 
	           "Account type-Savings" +
	           "Bank name-SBI";
		
	}
}
