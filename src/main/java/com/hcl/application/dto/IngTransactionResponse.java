package com.hcl.application.dto;

public class IngTransactionResponse {

	
	private Long productCode;

	private Long productID;

	private Long activityCode;

	private Long countOfActualStatus;

	public Long getProductCode() {
		return productCode;
	}

	public void setProductCode(Long productCode) {
		this.productCode = productCode;
	}

	public Long getProductId() {
		return productID;
	}

	public void setProductId(Long productId) {
		this.productID = productId;
	}

	public Long getActivityCode() {
		return activityCode;
	}

	public void setActivityCode(Long activityCode) {
		this.activityCode = activityCode;
	}

	public Long getCountOfActualStatus() {
		return countOfActualStatus;
	}

	public void setCountOfActualStatus(Long countOfActualStatus) {
		this.countOfActualStatus = countOfActualStatus;
	}

}
