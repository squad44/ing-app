package com.hcl.application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hcl.application.entity.ISPCommissionInfo;
@Repository
public interface IngAppCalculateCommissionRepository extends JpaRepository<ISPCommissionInfo, Integer> {
	
	//@Query("SELECT u FROM ISPCommissionInfo u WHERE u.productCode = :productCode and u.activityCode = :activityCode")
	@Query(value="SELECT  amountToBePaid  FROM ISPCommissionInfo WHERE productCode = :productCode and activityCode = :activityCode",nativeQuery=true)
	public List<?>   getActivityCode(@Param("productCode")Integer productCode,@Param("activityCode")Integer activityCode);
	
	
}
