package com.sixthc.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sixthc.dao.PkgDao;
import com.sixthc.model.Pkg;
import com.sixthc.util.CustomHibernateDaoSupport;

@Repository("PkgDao")
public class PkgDaoImpl extends CustomHibernateDaoSupport implements PkgDao {

	@Override
	public void save(Pkg pkg) {
		getHibernateTemplate().save(pkg);
		// TODO : I know this way of setting default date is kludge. should
		// probably write an even handler or use jpa
	}

	@Override
	public void update(Pkg pkg) {
		getHibernateTemplate().update(pkg);
	}

	@Override
	public void delete(Pkg pkg) {
		getHibernateTemplate().delete(pkg);
	}

	@Override
	public Pkg findById(int id) {
		List<Pkg> list = getHibernateTemplate().find("from Pkg where id=?", id);
		if (list.size() > 0)
			return (Pkg) list.get(0);
		return null;
	}

	public Pkg findByName(String name) {
		List<Pkg> list = getHibernateTemplate().find("from Pkg where name = ?",
				name);
		if (list.size() > 0)
			return (Pkg) list.get(0);
		return null;
	}

}
