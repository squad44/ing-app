
package com.hcl.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.application.dto.IngProviderResponse;
import com.hcl.application.entity.ISPCommissionInfo;
import com.hcl.application.service.IngAppService;

@RestController
@RequestMapping("/api")
public class IngApplicationController {

	@Autowired
	IngAppService ingAppService;

	@GetMapping("/getProviderInfo/{partyId}")
	public List<IngProviderResponse> fetchPending(@PathVariable("partyId") int partyId) {

		List<IngProviderResponse> response = null;

		response = ingAppService.fetchProvider(partyId);

		return response;
	}
	@PostMapping("/api/calculateCommision/{productCode}/{activityCode}")
	public List<?> calculateCommision(@PathVariable("productCode") Integer productCode,@PathVariable("activityCode") Integer activityCode){
		
		
		List<ISPCommissionInfo> commission = null;

		List<?> list =ingAppService.fetchCommission(productCode, activityCode);
		System.out.println("list ====>>"+list);
		System.out.println("list size====>>"+list.size());
		return list;
		
		
	}
	
	
	
	
}