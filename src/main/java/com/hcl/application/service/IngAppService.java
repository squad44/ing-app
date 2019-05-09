package com.hcl.application.service;

import java.util.List;

import com.hcl.application.dto.IngTransactionResponse;

public interface IngAppService {
	
	public List<?> getTransactionDetails(Long provider);
	
}
