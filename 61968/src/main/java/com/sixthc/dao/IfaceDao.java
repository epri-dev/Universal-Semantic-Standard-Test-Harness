package com.sixthc.dao;

import com.sixthc.model.Iface;
import com.sixthc.model.Pkg;
import com.sixthc.model.VendorRoleType;

public interface IfaceDao {

	public void save(Iface face);
	public void update(Iface face);
	public void delete(Iface face);
	public Iface findById(int id);
	public Iface findByName(String name);
	public Iface find(String name, Pkg pkg);
	public Iface find(String name, Pkg pkg, VendorRoleType vendorRoleType);
}
