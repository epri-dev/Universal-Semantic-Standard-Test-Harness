package com.sixthc.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sixthc.dao.VendorRoleDao;
import com.sixthc.model.VendorRole;
import com.sixthc.util.CustomHibernateDaoSupport;

@Repository("VendorRoleDao")
public class VendorRoleDaoImpl extends CustomHibernateDaoSupport implements VendorRoleDao {

	@Override
	public void save(VendorRole vendorRole) {
		getHibernateTemplate().save(vendorRole);
		// TODO : I know this way of setting default date is kludge. should
		// probably write an even handler or use jpa
	}

	@Override
	public void update(VendorRole vendorRole) {
		getHibernateTemplate().update(vendorRole);
	}

	@Override
	public void delete(VendorRole vendorRole) {
		getHibernateTemplate().delete(vendorRole);
	}

	@Override
	public VendorRole findById(int id) {
		List<VendorRole> list = getHibernateTemplate().find("from VendorRole where id=?", id);
		if (list.size() > 0)
			return (VendorRole) list.get(0);
		return null;
	}

	public VendorRole findByName(String name) {
		List<VendorRole> list = getHibernateTemplate().find("from VendorRole where name = ?",
				name);
		if (list.size() > 0)
			return (VendorRole) list.get(0);
		return null;
	}

}
