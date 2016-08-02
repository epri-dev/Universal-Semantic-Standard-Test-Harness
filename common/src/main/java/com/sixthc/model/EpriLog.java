package com.sixthc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="EpriLog")
public class EpriLog {

	@Id
	@GeneratedValue
	private int id;
	private String data;
	private String message;
	@Column(name = "create_date")
	private java.sql.Timestamp createDate;
	@Column(name = "address", length = 4000)
	private String address;
	private String contentType;
	private String encoding;
	@Column(name = "header", length = 4000)
	private String header;
	@Column(name = "httpMethod", length = 4000)
	private String httpMethod;
	@Column(name = "payload", length = 60000)
	private String payload;
	@Column(name = "responseCode", length = 4000)
	private String responseCode;
	@Column(name = "faultCode", length = 4000)
	private String faultCode;
	private String resultCode;
	private String operation;
	private String stage;
	private String messageId;
	@ManyToOne
	@JoinColumn(name = "INTERFACE_ID", referencedColumnName = "ID")
	private Iface iface;
	@Transient
	private String packageName;
	@Transient
	private String vendorRoleTypeName;
	@Transient
	private String interfaceName;

	public Iface getInterface() {
		return iface;
	}

	public void setInterface(Iface iface) {
		this.iface = iface;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public java.sql.Timestamp getCreateDate() {
		return createDate;
	}

	public void setCreateDate(java.sql.Timestamp createDate) {
		this.createDate = createDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getEncoding() {
		return encoding;
	}

	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getHttpMethod() {
		return httpMethod;
	}

	public void setHttpMethod(String httpMethod) {
		this.httpMethod = httpMethod;
	}

	public String getPayload() {
		return payload;
	}

	public void setPayload(String payload) {
		this.payload = payload;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getFaultCode() {
		return faultCode;
	}

	public void setFaultCode(String faultCode) {
		this.faultCode = faultCode;
	}

	public String toString() {
		return "Id = " + id + ", Message = " + message + ", Timestamp = "
				+ createDate + ", data = " + data;
	}

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	public String getMessageId() {
		return messageId;
	}
	
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getVendorRoleTypeName() {
		return vendorRoleTypeName;
	}

	public void setVendorRoleTypeName(String vendorRoleTypeName) {
		this.vendorRoleTypeName = vendorRoleTypeName;
	}

	public String getInterfaceName() {
		return interfaceName;
	}

	public void setInterfaceName(String interfaceName) {
		this.interfaceName = interfaceName;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}
	
	
	
}
