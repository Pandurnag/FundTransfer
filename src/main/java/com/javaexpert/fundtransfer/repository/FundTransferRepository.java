package com.javaexpert.fundtransfer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javaexpert.fundtransfer.model.FundTransfer;

@Repository
public interface FundTransferRepository extends JpaRepository<FundTransfer, String>{

}
