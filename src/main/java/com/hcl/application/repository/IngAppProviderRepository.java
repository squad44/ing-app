package com.hcl.application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hcl.application.entity.ISPTransactions;

@Repository
public interface IngAppProviderRepository extends JpaRepository<ISPTransactions, Long> {

	@Query(value = "SELECT partyID,productCode,activityCode,count(status) as countOfActualStatus FROM ISPTransaction WHERE status = 1 and partyID = :provider and partyID in (80145,80155,90125,90243,90692) GROUP BY partyID,productCode,activityCode", nativeQuery = true)
	public List<?> fetch(@Param("provider") Long provider);

}