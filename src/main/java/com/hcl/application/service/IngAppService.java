package com.hcl.application.service;

import java.util.List;

import com.hcl.application.dto.IngProviderResponse;
import com.hcl.application.entity.ISPCommissionInfo;

public interface IngAppService {
	
	public List<IngProviderResponse> fetchProvider(int provider);
	public List<ISPCommissionInfo>  fetchCommission(Integer productCode,Integer activityCode);
	
}
