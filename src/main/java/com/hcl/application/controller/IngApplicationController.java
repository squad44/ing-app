package com.hcl.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.application.entity.ISPCommissionInfo;
import com.hcl.application.service.IngAppServiceImpl;

@RestController
@RequestMapping("/api")
public class IngApplicationController {

	@Autowired
	IngAppServiceImpl ingAppService;

	@GetMapping("/getTransactionDetails/{partyId}")
	public List<?> getTransactionDetails(@PathVariable("partyId") Long partyId) {

		List<?> response = null;

		response = ingAppService.getTransactionDetails(partyId);

		return response;
	}

	@PostMapping("/api/calculateCommision/{productCode}/{activityCode}")
	public List<?> calculateCommision(
			@PathVariable("productCode") Integer productCode,
			@PathVariable("activityCode") Integer activityCode) {

		List<ISPCommissionInfo> commission = null;

		List<?> list = ingAppService.fetchCommission(productCode, activityCode);
		return list;

	}

}