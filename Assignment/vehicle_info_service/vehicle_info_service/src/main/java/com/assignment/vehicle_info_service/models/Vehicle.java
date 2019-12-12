package com.assignment.vehicle_info_service.models;

public class Vehicle {
	
	private String vin;
	private String regNo;
	
	public Vehicle(String vin, String regNo) {
		this.vin = vin;
		this.regNo = regNo;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	
	
}
