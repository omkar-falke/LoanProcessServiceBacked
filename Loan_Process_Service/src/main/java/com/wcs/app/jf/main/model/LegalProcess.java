package com.wcs.app.jf.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LegalProcess {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int legalId;
	private double EMI;
	private int count_Bucket;
	private String customerName;
	private  double emiPaidDate;
	private double loanAmount;
	private String emailId;
	private int  firstNoticeSend;
	private String caseregistred;
	
	
	
	
	public int getFirstNoticeSend() {
		return firstNoticeSend;
	}
	public void setFirstNoticeSend(int firstNoticeSend) {
		this.firstNoticeSend = firstNoticeSend;
	}
	public String getCaseregistred() {
		return caseregistred;
	}
	public void setCaseregistred(String caseregistred) {
		this.caseregistred = caseregistred;
	}
	public int getLegalId() {
		return legalId;
	}
	public void setLegalId(int legalId) {
		this.legalId = legalId;
	}
	public double getEMI() {
		return EMI;
	}
	public void setEMI(double eMI) {
		EMI = eMI;
	}
	public int getCount_Bucket() {
		return count_Bucket;
	}
	public void setCount_Bucket(int count_Bucket) {
		this.count_Bucket = count_Bucket;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getEmiPaidDate() {
		return emiPaidDate;
	}
	public void setEmiPaidDate(double emiPaidDate) {
		this.emiPaidDate = emiPaidDate;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
}
