package com.sixthc.dao;

import com.sixthc.model.VendorRole;

public interface VendorRoleDao {

	public void save(VendorRole vendorRole);
	public void update(VendorRole vendorRole);
	public void delete(VendorRole vendorRole);
	public VendorRole findById(int id);
	public VendorRole findByName(String name);
}
