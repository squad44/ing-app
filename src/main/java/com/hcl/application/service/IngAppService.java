package com.hcl.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hcl.application.dto.IngProviderResponse;
import com.hcl.application.entity.ISPCommissionInfo;

public interface IngAppService {
	
	public List<IngProviderResponse> fetchProvider(int provider);
	public List<?>  fetchCommission(Integer productCode,Integer activityCode);
	
}
