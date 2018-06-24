package com.learning.beans;

public class Address {

	private int pinCode;
	private String country;
	private String state;
	private String area;
	private String buildingName;
	private String buildingNumber;

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public void setBuildingNumber(String buildingNumber) {
		this.buildingNumber = buildingNumber;
	}

	@Override
	public String toString() {
		return "Address [pinCode=" + pinCode + ", country=" + country + ", state=" + state + ", area=" + area
				+ ", buildingName=" + buildingName + ", buildingNumber=" + buildingNumber + "]";
	}

}
