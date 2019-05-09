package com.hcl.application.service;

import java.util.List;

import com.hcl.application.dto.IngProviderResponse;

public interface IngAppService {
	
	public List<IngProviderResponse> fetchProvider(String provider);
	
}
