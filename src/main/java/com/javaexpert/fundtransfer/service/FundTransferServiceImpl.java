package com.javaexpert.fundtransfer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaexpert.fundtransfer.model.FundTransfer;
import com.javaexpert.fundtransfer.repository.FundTransferRepository;

@Service
public class FundTransferServiceImpl implements FundTransferService{
	
	@Autowired
	FundTransferRepository fundTransferRepository;

	@Override
	public FundTransfer processTxn(FundTransfer fundTransfer) {
		return fundTransferRepository.save(fundTransfer);
	}

	@Override
	public List<FundTransfer> getTxns() {
		return fundTransferRepository.findAll();
	}

}
