package org.kosta.udonmarket.model;

import javax.sql.DataSource;

public class CommentDAO {
	
	private static CommentDAO instance = new CommentDAO();

	private DataSource dataSource;

	private CommentDAO() {
		dataSource = DataSourceManager.getInstance().getDataSource();
	}

	public static CommentDAO getInstance() {
		return instance;
	}
}
