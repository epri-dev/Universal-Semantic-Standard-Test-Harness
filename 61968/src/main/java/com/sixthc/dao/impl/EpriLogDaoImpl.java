package com.sixthc.dao.impl;

import java.sql.Timestamp;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sixthc.dao.EpriLogDao;
import com.sixthc.dao.IfaceDao;
import com.sixthc.dao.PkgDao;
import com.sixthc.dao.Sequence;
import com.sixthc.dao.VendorRoleTypeDao;
import com.sixthc.model.EpriLog;
import com.sixthc.model.Iface;
import com.sixthc.model.Pkg;
import com.sixthc.model.VendorRoleType;
import com.sixthc.util.CustomHibernateDaoSupport;

@Repository("epriLogDao")
public class EpriLogDaoImpl extends CustomHibernateDaoSupport implements
		EpriLogDao {
	private static org.apache.log4j.Logger log = Logger
			.getLogger(EpriLogDaoImpl.class);

	@Autowired
	private PkgDao pkgDao;

	@Autowired
	private VendorRoleTypeDao vendorRoleTypeDao;

	@Autowired
	private IfaceDao ifaceDao;

	public void setInterface(EpriLog epriLog) {
		Pkg pkg = null;
		VendorRoleType v = null;
		Iface iface = null;

		if (epriLog.getPackageName() == null) {
			log.error("package name not set");
			return;
		} else {
			pkg = pkgDao.findByName(epriLog.getPackageName());
			if (pkg == null) {
				log.error("findbyName for " + epriLog.getPackageName()
						+ " failed");
				return;
			}
		}

		if (epriLog.getVendorRoleTypeName() == null) {
			log.error("vendor role type name not set");
			return;
		} else {
			v = vendorRoleTypeDao.findByName(epriLog.getVendorRoleTypeName());
			if (v == null) {
				log.error("findbyName for " + epriLog.getVendorRoleTypeName()
						+ " failed");
				return;
			}
		}

		if (epriLog.getInterfaceName() == null) {
			log.error("interface name not set");
			return;
		} else {
			iface = ifaceDao.find(epriLog.getInterfaceName(), pkg, v);
			if (iface == null) {
				log.error("find for " + epriLog.getInterfaceName()
						+ ", with pkg " + pkg.getName() + ", " + v.getName()
						+ " failed");
			} else
				epriLog.setInterface(iface);
		}

	}

	@Override
	public void save(EpriLog log) {
		if (log.getCreateDate() == null)
			log.setCreateDate(new Timestamp(System.currentTimeMillis()));

		getHibernateTemplate().save(log);
		// TODO : I know this way of setting default date is kludge. should
		// probably write an even handler or use jpa
	}

	@Override
	public void update(EpriLog log) {
		getHibernateTemplate().update(log);
	}

	@Override
	public void delete(EpriLog log) {
		getHibernateTemplate().delete(log);
	}

	@Override
	public EpriLog findById(int id) {
		List<EpriLog> list = getHibernateTemplate().find(
				"from EpriLog where id=?", id);
		if (list.size() > 0)
			return (EpriLog) list.get(0);
		return null;
	}

	public long getMessageIdSequence() {
		final int id[] = new int[1];
		Sequence seq = new Sequence(getHibernateTemplate().getSessionFactory()
				.getCurrentSession(), "message_id");
		return seq.getNext();
	}

	public void saveOrUpdate(EpriLog log) {
		getHibernateTemplate().saveOrUpdate(log);
	}

}
