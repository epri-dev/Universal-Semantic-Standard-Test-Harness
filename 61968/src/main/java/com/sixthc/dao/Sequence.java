package com.sixthc.dao;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.jdbc.Work;

public class Sequence {
	private static org.apache.log4j.Logger log = Logger
	.getLogger(Sequence.class);
	private String name;
	private Session session;

	public Sequence(Session session, String name) {
		this.session = session;
		this.name = name;
	}

	public long getNext() {
		MyWork mw = new MyWork(name);
		session.doWork(mw);
		return mw.getValue();
	}

	private class MyWork implements Work {
		private String name;
		private long value;

		public MyWork(String name) {
			this.name = name;
		}

		public long getValue() {
			return value;
		}

		@Override
		public void execute(java.sql.Connection conn) throws SQLException {
			CallableStatement cs = null;
			try {
				log.debug("calling get message id sequence");
				cs = conn.prepareCall("{ ? = call nextval(?) }");
				cs.registerOutParameter(1, Types.INTEGER);
				cs.setString(2, name);
				cs.execute();
				value = cs.getLong(1);
			} catch (SQLException e) {
			} finally {
				if (cs != null) {
					try {
						cs.close();
					} catch (Exception e) {
					}
				}
			}
		}
	}
}
