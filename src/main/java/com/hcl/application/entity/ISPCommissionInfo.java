package com.hcl.application.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ISPCommissionInfo")
public class ISPCommissionInfo implements Serializable {
	private static final long serialVersionUID = 3748378277930880050L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private Integer productCode;

	private Integer activityCode;

	private String providerName;

	private String processingStatus;

	private Date startDate;

	private String subject;

	private Double amountToBePaid;

	private Date endDate;

	
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getProductCode() {
		return productCode;
	}

	public void setProductCode(Integer productCode) {
		this.productCode = productCode;
	}

	public Integer getActivityCode() {
		return activityCode;
	}

	public void setActivityCode(Integer activityCode) {
		this.activityCode = activityCode;
	}



	

	
	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public String getProcessingStatus() {
		return processingStatus;
	}

	public void setProcessingStatus(String processingStatus) {
		this.processingStatus = processingStatus;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Double getAmountToBePaid() {
		return amountToBePaid;
	}

	public void setAmountToBePaid(Double amountToBePaid) {
		this.amountToBePaid = amountToBePaid;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}
