package com.hcl.application.service;

import java.util.List;

public interface IngAppService {
	
	public List<?>  fetchCommission(Integer productCode,Integer activityCode);
	public List<?> getTransactionDetails(Long provider);

	
}
