package com.sixthc.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.sixthc.dao.IfaceDao;
import com.sixthc.model.Iface;
import com.sixthc.model.Pkg;
import com.sixthc.model.VendorRoleType;
import com.sixthc.util.CustomHibernateDaoSupport;

@Repository("IfaceDao")
public class IfaceDaoImpl extends CustomHibernateDaoSupport implements IfaceDao {
	private static org.apache.log4j.Logger log = Logger
	.getLogger(IfaceDaoImpl.class);
	@Override
	public void save(Iface face) {
		getHibernateTemplate().save(face);
		// TODO : I know this way of setting default date is kludge. should
		// probably write an even handler or use jpa
	}

	@Override
	public void update(Iface face) {
		getHibernateTemplate().update(face);
	}

	@Override
	public void delete(Iface face) {
		getHibernateTemplate().delete(face);
	}

	@Override
	public Iface findById(int id) {
		List<Iface> list = getHibernateTemplate().find("from Iface where id=?",
				id);
		return (Iface) list.get(0);
	}

	public Iface findByName(String name) {
		List<Iface> list = getHibernateTemplate().find(
				"from Iface where name = ? ", name);
		if (list.size() > 0)
			return (Iface) list.get(0);
		return null;
	}

	public Iface find(String name, Pkg pkg) {
		List<Iface> list = getHibernateTemplate().find(
				"from Iface where name = ? and package_id = ?", name,
				new Integer(pkg.getId()));
		if (list.size() > 0)
			return (Iface) list.get(0);
		return null;
	}

	public Iface find(String name, Pkg pkg, VendorRoleType vendorRoleType) {
		List<Iface> list = getHibernateTemplate()
				.find("from Iface where name = ? and package_id = ? and vendor_role_type_id = ?",
						name, new Integer(pkg.getId()),
						new Integer(vendorRoleType.getId()));
		if (list.size() > 0)
			return (Iface) list.get(0);
		return null;
	}
}
