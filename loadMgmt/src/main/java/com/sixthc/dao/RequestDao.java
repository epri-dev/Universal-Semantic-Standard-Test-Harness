package com.sixthc.dao;

import com.sixthc.model.Request;

public interface RequestDao {

	public void save(Request request);
	public void update(Request request);
	public void delete(Request request);
	public Request findById(int id);
	
}
