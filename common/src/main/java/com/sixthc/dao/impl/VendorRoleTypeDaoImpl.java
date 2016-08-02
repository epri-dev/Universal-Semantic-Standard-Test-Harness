package com.sixthc.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sixthc.dao.VendorRoleTypeDao;
import com.sixthc.model.VendorRoleType;
import com.sixthc.util.CustomHibernateDaoSupport;

@Repository("VendorRoleTypeDao")
public class VendorRoleTypeDaoImpl extends CustomHibernateDaoSupport implements VendorRoleTypeDao {

	@Override
	public void save(VendorRoleType vendorRoleType) {
		getHibernateTemplate().save(vendorRoleType);
		// TODO : I know this way of setting default date is kludge. should
		// probably write an even handler or use jpa
	}

	@Override
	public void update(VendorRoleType vendorRoleType) {
		getHibernateTemplate().update(vendorRoleType);
	}

	@Override
	public void delete(VendorRoleType vendorRoleType) {
		getHibernateTemplate().delete(vendorRoleType);
	}

	@Override
	public VendorRoleType findById(int id) {
		List<VendorRoleType> list = getHibernateTemplate().find("from VendorRoleType where id=?", id);
		if (list.size() > 0)
			return (VendorRoleType) list.get(0);
		return null;
	}

	public VendorRoleType findByName(String name) {
		List<VendorRoleType> list = getHibernateTemplate().find("from VendorRoleType where name = ?",
				name);
		if (list.size() > 0)
			return (VendorRoleType) list.get(0);
		return null;
	}

}
