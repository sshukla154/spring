package com.learning.beans;

public class Address {

	private int pinCode;
	private String country;
	private String state;
	private String area;
	private String buildingName;
	private String buildingNumber;

	//For implementing c-namespace in xml 
	public Address(int pinCode, String country, String state, String area, String buildingName, String buildingNumber) {
		super();
		this.pinCode = pinCode;
		this.country = country;
		this.state = state;
		this.area = area;
		this.buildingName = buildingName;
		this.buildingNumber = buildingNumber;
	}

	@Override
	public String toString() {
		return "Address [pinCode=" + pinCode + ", country=" + country + ", state=" + state + ", area=" + area
				+ ", buildingName=" + buildingName + ", buildingNumber=" + buildingNumber + "]";
	}

}
