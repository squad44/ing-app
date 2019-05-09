package com.hcl.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.application.repository.IngAppCalculateCommissionRepository;
import com.hcl.application.repository.IngAppProviderRepository;

@Service
public class IngAppServiceImpl implements IngAppService {

	@Autowired
	IngAppProviderRepository ingAppServiceRepository;
	@Autowired
	public IngAppCalculateCommissionRepository ingAppCalculateCommissionRepository;

	@Override
	public List<?> getTransactionDetails(Long provider) {

		List<?> providerResponse = ingAppServiceRepository.fetch(provider);

//		List<IngTransactionResponse> ingTransactionResponses = (List<IngTransactionResponse>) providerResponse;

		return providerResponse;
	}

	

	@Override
	public List<?> fetchCommission(Integer productCode,
			Integer activityCode) {
		// TODO Auto-generated method stub
		return ingAppCalculateCommissionRepository.getActivityCode(productCode,activityCode);
	}




}
