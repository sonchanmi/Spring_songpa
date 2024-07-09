package com.springbook.ioc.injection;

import java.util.List;
import java.util.Map;

public class CollectionBean {
	private Map<String, String> addressList;

	public Map<String, String> getAddressList(){
		return addressList;
	}

	public void setAddressList(Map<String, String> addressList) {
		this.addressList = addressList;
	}
	

	/*
	 * public void setAddressList(List<String> addressList) { this.addressList =
	 * addressList; }
	 * 
	 * 
	 * 
	 * public List<String> getAddressList() { return addressList; }
	 */

}
