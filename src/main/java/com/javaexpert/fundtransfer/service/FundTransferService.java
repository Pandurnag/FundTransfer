package com.javaexpert.fundtransfer.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.javaexpert.fundtransfer.model.FundTransfer;


public interface FundTransferService {
	public FundTransfer processTxn(FundTransfer fundTransfer);
	public List<FundTransfer> getTxns();

}
