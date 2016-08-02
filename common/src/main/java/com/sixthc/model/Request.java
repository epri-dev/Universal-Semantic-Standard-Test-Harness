package com.sixthc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity 
@Table(name="request")
public class Request {

	private int id;
	private String request;
	private java.sql.Timestamp createDate;
	private String result;
	private String data;

	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRequest() {
		return request;
	}

	public void setRequest(String request) {
		this.request = request;
	}
	


	@Column(name="create_date")
	public java.sql.Timestamp getDate() {
		return createDate;
	}

	public void setDate(java.sql.Timestamp date) {
		this.createDate = date;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	public String toString() {
		return "Id = " + id + ", Request = " + request + ", Timestamp = " + createDate + ", data = " + data;
	}

}
