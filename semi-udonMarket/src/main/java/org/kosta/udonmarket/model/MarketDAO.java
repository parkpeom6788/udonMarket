package org.kosta.udonmarket.model;

import javax.sql.DataSource;

public class MarketDAO {

	private static MarketDAO instance = new MarketDAO();

	private DataSource dataSource;

	private MarketDAO() {
		dataSource = DataSourceManager.getInstance().getDataSource();
	}

	public static MarketDAO getInstance() {
		return instance;
	}
}
