package com.wcs.app.jf.main.dto;

public class LegalProcessDto {

	private int legalId;
	private double EMI;
	private int count_Bucket;
	private String customerName;
	private  double emiPaidDate;
	private double loanAmount;
	private String emailId;
	private int  firstNoticeSend;	

	public LegalProcessDto(int legalId, double eMI, int count_Bucket, String customerName, double emiPaidDate,
			double loanAmount, String emailId, int firstNoticeSend) {
		super();
		this.legalId = legalId;
		EMI = eMI;
		this.count_Bucket = count_Bucket;
		this.customerName = customerName;
		this.emiPaidDate = emiPaidDate;
		this.loanAmount = loanAmount;
		this.emailId = emailId;
		this.firstNoticeSend = firstNoticeSend;
	}



	public int getFirstNoticeSend() {
		return firstNoticeSend;
	}



	public void setFirstNoticeSend(int firstNoticeSend) {
		this.firstNoticeSend = firstNoticeSend;
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
