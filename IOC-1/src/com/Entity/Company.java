package com.Entity;

public class Company {

	private int companyCode;
	
	private String componyName;

	public int getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}

	public String getComponyName() {
		return componyName;
	}

	public void setComponyName(String componyName) {
		this.componyName = componyName;
	}

	@Override
	public String toString() {
		return "Company [companyCode=" + companyCode + ", componyName=" + componyName + "]";
	}
	
	
	
}
