package com.hcl.application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hcl.application.dto.IngProviderResponse;
import com.hcl.application.entity.ISPTransactions;

@Repository
public interface IngAppProviderRepository extends JpaRepository<ISPTransactions, Long> {

	@Query("SELECT provider,productId,productCode,activityCode,count(status) as countOfActualStatus " + "FROM Provider "
			+ "WHERE status = 1 and provider = ?1" 
		 + "GROUP BY (provider,productId,productCode,activityCode)")
	public List<IngProviderResponse> fetch(String provider);

}