package org.kosta.udonmarket.model;
import javax.sql.DataSource;
import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

public class DataSourceManager {
	private static DataSourceManager instance = new DataSourceManager();
	private static DataSource datasource;
	
	public DataSourceManager() {
		BasicDataSource dbcp = new BasicDataSource();
		dbcp.setUrl("jdbc:oracle:thin:@127.0.0.1:1521:xe");
		dbcp.setUsername("scott");
		dbcp.setPassword("tiger");
		datasource = dbcp;
	}
	public DataSourceManager getInstance() {
		return instance;
	}
	public DataSource getDataSource() {
		return datasource;
	}
}
