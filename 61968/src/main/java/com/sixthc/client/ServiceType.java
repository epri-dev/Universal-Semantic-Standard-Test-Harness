package com.sixthc.client;

public enum ServiceType {
	REPLY ("Reply"),
	SEND ("Send"),
	REQUEST ("Request"),
	GET ("Get");
	
	private String name;
	ServiceType(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
