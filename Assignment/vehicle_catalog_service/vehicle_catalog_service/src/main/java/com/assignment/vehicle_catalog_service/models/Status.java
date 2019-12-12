package com.assignment.vehicle_catalog_service.models;

public class Status {

	private String vin;
	private boolean status;
	
	public Status(String vin, boolean status) {
		this.vin = vin;
		this.status = status;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
	
}
