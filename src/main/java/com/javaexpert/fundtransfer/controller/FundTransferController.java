package com.javaexpert.fundtransfer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaexpert.fundtransfer.model.FundTransfer;
import com.javaexpert.fundtransfer.service.FundTransferService;

@RestController
@RequestMapping("/banking")
public class FundTransferController {
	
	@Autowired
	FundTransferService fundTransferService;
	
	
	@PostMapping("/processTxn")
	public FundTransfer processFundTransfer(@RequestBody  FundTransfer     fundTransfer) {
		return fundTransferService.processTxn(fundTransfer);
	}
	
	@GetMapping("/getTxns")
	public List<FundTransfer> getTxns(){
		return fundTransferService.getTxns();
	}
	

}
