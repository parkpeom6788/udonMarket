package org.kosta.udonmarket.model;

import javax.sql.DataSource;

public class MarketBoardDAO {
	
	private static MarketBoardDAO instance = new MarketBoardDAO();

	private DataSource dataSource;

	private MarketBoardDAO() {
		dataSource = DataSourceManager.getInstance().getDataSource();
	}

	public static MarketBoardDAO getInstance() {
		return instance;
	}
}
