package com.hcl.application.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ISPPayments implements Serializable {
	private static final long serialVersionUID = 3748378277930880050L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String paymentOrderId;

	private Integer numberOfTransactions;

	private Integer specId;

	private Integer specParty;

	private Long specAccNo;

	private Double specAmt;

	public String getPaymentOrderId() {
		return paymentOrderId;
	}

	public void setPaymentOrderId(String paymentOrderId) {
		this.paymentOrderId = paymentOrderId;
	}

	public Integer getNumberOfTransactions() {
		return numberOfTransactions;
	}

	public void setNumberOfTransactions(Integer numberOfTransactions) {
		this.numberOfTransactions = numberOfTransactions;
	}

	public Integer getSpecId() {
		return specId;
	}

	public void setSpecId(Integer specId) {
		this.specId = specId;
	}

	public Integer getSpecParty() {
		return specParty;
	}

	public void setSpecParty(Integer specParty) {
		this.specParty = specParty;
	}

	public Long getSpecAccNo() {
		return specAccNo;
	}

	public void setSpecAccNo(Long specAccNo) {
		this.specAccNo = specAccNo;
	}

	public Double getSpecAmt() {
		return specAmt;
	}

	public void setSpecAmt(Double specAmt) {
		this.specAmt = specAmt;
	}

}
