package com.sixthc.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.sixthc.dao.RequestDao;
import com.sixthc.model.Request;
import com.sixthc.util.CustomHibernateDaoSupport;

@Repository("requestDao")
public class RequestDaoImpl extends CustomHibernateDaoSupport implements
		RequestDao {

	@Override
	public void save(Request request) {
		getHibernateTemplate().save(request);
	}

	@Override
	public void update(Request request) {
		getHibernateTemplate().update(request);
	}

	@Override
	public void delete(Request request) {
		getHibernateTemplate().delete(request);
	}

	@Override
	public Request findById(int id) {
		List<Request> list = getHibernateTemplate().find(
				"from Request where id=?", id);
		if (list.size() > 0)
			return (Request) list.get(0);
		return null;
	}

}
