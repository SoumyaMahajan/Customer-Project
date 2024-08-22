package com.hexaware.inh;

import java.util.Date;

public class Customer {
	 private int CustId;
	 private String CustName;
	 private String City;
	 private double Premium;
	 private Date DateOfBirth;
	 
	public Customer() {
		
	}
	
	

	public int getCustId() {
		return CustId;
	}



	public void setCustId(int custId) {
		CustId = custId;
	}



	public String getCustName() {
		return CustName;
	}



	public void setCustName(String custName) {
		CustName = custName;
	}



	public String getCity() {
		return City;
	}



	public void setCity(String city) {
		City = city;
	}



	public double getPremium() {
		return Premium;
	}



	public void setPremium(double premium) {
		Premium = premium;
	}



	public Date getDateOfBirth() {
		return DateOfBirth;
	}



	public void setDateOfBirth(Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}



	public Customer(int custId, String custName, String city, double premium, Date dateOfBirth) {
		CustId = custId;
		CustName = custName;
		City = city;
		Premium = premium;
		DateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "Customer [CustId=" + CustId + ", CustName=" + CustName + ", City=" + City + ", Premium=" + Premium
				+ ", DateOfBirth=" + DateOfBirth + "]";
	}
	
	
	 
}
