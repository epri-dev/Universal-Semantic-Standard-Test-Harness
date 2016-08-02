package com.sixthc.dao;

import com.sixthc.model.EpriLog;

public interface EpriLogDao {

	public void save(EpriLog log);
	public void update(EpriLog log);
	public void delete(EpriLog log);
	public EpriLog findById(int id);
	public long getMessageIdSequence();
	public void setInterface(EpriLog log);
	public void saveOrUpdate(EpriLog log);
}
