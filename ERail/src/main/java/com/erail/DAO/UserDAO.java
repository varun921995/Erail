package com.erail.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.erail.Database.DatabaseConnection;

@Component
public class UserDAO {
	
	@Autowired
	DatabaseConnection db;

	public void getAllUser() {
		try{
			Connection con = db.connectDatabase();
			Statement stm = con.createStatement();
			ResultSet result = stm.executeQuery("select * from student");
			while(result.next()) {
				System.out.println(result.getInt(1) + " " + result.getString(2));
			}
			con.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
