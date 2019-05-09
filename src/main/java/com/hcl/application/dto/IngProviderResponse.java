package com.hcl.application.dto;

public class IngProviderResponse {

	private Long productCode;

	private Long productId;

	private Long activityCode;

	private String provider;

	private String countOfActualStatus;

	public Long getProductCode() {
		return productCode;
	}

	public void setProductCode(Long productCode) {
		this.productCode = productCode;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getActivityCode() {
		return activityCode;
	}

	public void setActivityCode(Long activityCode) {
		this.activityCode = activityCode;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getCountOfActualStatus() {
		return countOfActualStatus;
	}

	public void setCountOfActualStatus(String countOfActualStatus) {
		this.countOfActualStatus = countOfActualStatus;
	}

}
