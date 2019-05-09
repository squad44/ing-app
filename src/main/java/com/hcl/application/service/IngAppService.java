package com.hcl.application.service;

import java.util.List;

import com.hcl.application.dto.IngProviderResponse;

public interface IngAppService {
	
	public List<?>  fetchCommission(Integer productCode,Integer activityCode);
	public List<?> getTransactionDetails(Long provider);

	
}
