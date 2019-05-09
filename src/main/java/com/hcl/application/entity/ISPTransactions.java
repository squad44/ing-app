package com.hcl.application.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ISPTransaction")
//@NamedQuery(name="ISPTransactions.fetch" ,query="SELECT partyID,productCode,activityCode,count(status) as countOfActualStatus FROM ISPTransactions" 
//		+" WHERE status = 1 and partyID = :provider GROUP BY (partyID,productCode,activityCode)")
public class ISPTransactions implements Serializable {
	private static final long serialVersionUID = 3748378277930880050L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "partyId")
	private Long partyId;

	@Column(name = "activityCode")
	private Long activityCode;

	@Column(name = "partyCode")
	private Long partyCode;

	@Column(name = "status")
	private Boolean status;

	@Column(name = "processingStatus")
	private String processingStatus;

	@Column(name = "serviceCode")
	private Date serviceCode;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Long getPartyId() {
		return partyId;
	}

	public void setPartyId(Long partyId) {
		this.partyId = partyId;
	}

	public Long getActivityCode() {
		return activityCode;
	}

	public void setActivityCode(Long activityCode) {
		this.activityCode = activityCode;
	}

	public Long getPartyCode() {
		return partyCode;
	}

	public void setPartyCode(Long partyCode) {
		this.partyCode = partyCode;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getProcessingStatus() {
		return processingStatus;
	}

	public void setProcessingStatus(String processingStatus) {
		this.processingStatus = processingStatus;
	}

	public Date getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(Date serviceCode) {
		this.serviceCode = serviceCode;
	}

}
