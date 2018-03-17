package com.simplyusejava.junitex;

public class Address {
	
	private String addressLine1;
	
	private String addressLine2;
	
	private String country;

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public Address getDefaultAddress() {
		Address address = new Address();
		address.setAddressLine1("addr1");
		address.setAddressLine1("addr2");
		address.setCountry("country");
		return address;
	}
	

}
