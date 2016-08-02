package com.sixthc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="interface")
public class Iface {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	@Column(name="proxy_flag")
	private int proxyFlag;
	@Column(name="required_flag")
	private int required;
	@ManyToOne
	@JoinColumn(name = "PACKAGE_ID", referencedColumnName="ID")
	private Pkg pkg;
	@ManyToOne
	@JoinColumn(name = "VENDOR_ROLE_TYPE_ID", referencedColumnName="ID")
	private VendorRoleType vendorRoleType;
	
	public Pkg getPackage() {
		return pkg;
	}
	
	public void setPackage(Pkg pkg) {
		this.pkg = pkg;
	}
		
	public int getRequired() {
		return required;
	}

	public void setRequired(int required) {
		this.required = required;
	}

	public VendorRoleType getVendorRoleType() {
		return vendorRoleType;
	}

	public void setVendorRoleType(VendorRoleType vendorRoleType) {
		this.vendorRoleType = vendorRoleType;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getProxyFlag() {
		return proxyFlag;
	}
	public void setProxyFlag(int proxyFlag) {
		this.proxyFlag = proxyFlag;
	}	
}
