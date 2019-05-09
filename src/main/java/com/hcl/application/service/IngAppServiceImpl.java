package com.hcl.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.application.dto.IngProviderResponse;
import com.hcl.application.repository.IngAppProviderRepository;

@Service
public class IngAppServiceImpl implements IngAppService {

	@Autowired
	IngAppProviderRepository ingAppServiceRepository;

	@Override
	public List<IngProviderResponse> fetchProvider(String provider) {

		List<IngProviderResponse> providerResponse = ingAppServiceRepository.fetch(provider);
		return providerResponse;
	}

}
