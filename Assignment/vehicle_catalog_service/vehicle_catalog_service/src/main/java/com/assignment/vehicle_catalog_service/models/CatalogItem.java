package com.assignment.vehicle_catalog_service.models;

public class CatalogItem {
	
	private String owner;
	private String ownerAddress;
	private String vin;
	private String regNo;
	private boolean status;
	
	
	public CatalogItem(String owner, String ownerAddress, String vin, String regNo, boolean status) {
		this.owner = owner;
		this.ownerAddress = ownerAddress;
		this.vin = vin;
		this.regNo = regNo;
		this.status = status;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getOwnerAddress() {
		return ownerAddress;
	}
	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
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
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
}
