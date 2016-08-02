package com.sixthc.dao;

import com.sixthc.model.Pkg;

public interface PkgDao {

	public void save(Pkg pkg);
	public void update(Pkg pkg);
	public void delete(Pkg pkg);
	public Pkg findById(int id);
	public Pkg findByName(String name);
}
