package com.sixthc.dao;

import com.sixthc.model.VendorRoleType;

public interface VendorRoleTypeDao {

	public void save(VendorRoleType vendorRoleType);
	public void update(VendorRoleType vendorRoleType);
	public void delete(VendorRoleType vendorRoleType);
	public VendorRoleType findById(int id);
	public VendorRoleType findByName(String name);
}
