package com.erail.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DatabaseConnection {

	@Value("${spring.datasource.driverClassName}")
	private String driverClassName;
	
	@Value("${spring.datasource.url}")
	private String datasourceUrl;
	
	@Value("${spring.datasource.username}")
	private String dbUsername;
	
	@Value("${spring.datasource.password}")
	private String dbPassword;
	
	
	 public Connection connectDatabase() {
		 try {
			 Class.forName(driverClassName);
			 Connection con=DriverManager.getConnection( datasourceUrl ,dbUsername,dbPassword);  
			 return con;
		 }catch(Exception ex){
			ex.printStackTrace();
			return null;
		 }
	}
}
