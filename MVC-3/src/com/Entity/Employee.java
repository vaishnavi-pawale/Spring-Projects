package com.Entity;

public class Employee {

	private String ename;

	private String esalary;
	
	private String ephone;
	
	private String eaddress;
	
	private String edob;

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEsalary() {
		return esalary;
	}

	public void setEsalary(String esalary) {
		this.esalary = esalary;
	}

	public String getEphone() {
		return ephone;
	}

	public void setEphone(String ephone) {
		this.ephone = ephone;
	}

	public String getEaddress() {
		return eaddress;
	}

	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}

	public String getEdob() {
		return edob;
	}

	public void setEdob(String edob) {
		this.edob = edob;
	}

	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", esalary=" + esalary + ", ephone=" + ephone + ", eaddress=" + eaddress
				+ ", edob=" + edob + "]";
	}

}
