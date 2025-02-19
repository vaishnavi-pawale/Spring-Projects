package com.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
	
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	private String ename;

	private String eaddress;

	private String edob;

	private long emob;

	private int eage;

	private int eheight;

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
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

	public long getEmob() {
		return emob;
	}

	public void setEmob(long emob) {
		this.emob = emob;
	}

	public int getEage() {
		return eage;
	}

	public void setEage(int eage) {
		this.eage = eage;
	}

	public int getEheight() {
		return eheight;
	}

	public void setEheight(int eheight) {
		this.eheight = eheight;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eaddress=" + eaddress + ", edob=" + edob + ", emob="
				+ emob + ", eage=" + eage + ", eheight=" + eheight + "]";
	}

}
