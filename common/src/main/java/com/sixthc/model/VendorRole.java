package com.sixthc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="vendor_role")
public class VendorRole {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	@ManyToOne
	@JoinColumn(name = "vendor_role_type_id", referencedColumnName="ID")
	private VendorRoleType vendorRoleType;
	
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
	public VendorRoleType getVendorRoleType() {
		return vendorRoleType;
	}
	public void setVendorRoleType(VendorRoleType vendorRoleType) {
		this.vendorRoleType = vendorRoleType;
	}
	
}
