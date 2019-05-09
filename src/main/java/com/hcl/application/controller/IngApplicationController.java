
package com.hcl.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.application.dto.IngProviderResponse;
import com.hcl.application.service.IngAppService;

@RestController
@RequestMapping("/api")
public class IngApplicationController {

	@Autowired
	IngAppService ingAppService;

	@GetMapping("/getProviderInfo/{provider}")
	public List<IngProviderResponse> fetchPending(@PathVariable("provider") String provider) {

		List<IngProviderResponse> response = null;

		if (provider != null) {
		//	response = ingAppService.fetchProvider(provider);
		}

		return response;
	}
}