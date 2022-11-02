package org.kosta.udonmarket.model;

import javax.sql.DataSource;

public class MemberDAO {
	
	private static MemberDAO instance = new MemberDAO();
	
	private DataSource dataSource;
	
	private MemberDAO() {
		dataSource = DataSourceManager.getInstance().getDataSource();
	}
	
	public static MemberDAO getInstance() {
		return instance;
	}
	
	
}
