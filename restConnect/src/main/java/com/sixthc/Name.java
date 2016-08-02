package com.sixthc;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "Name", namespace="http://sixthc.com/name")
public class Name {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
