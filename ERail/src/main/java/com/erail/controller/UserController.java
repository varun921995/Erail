package com.erail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.erail.DAO.UserDAO;
import com.erail.Database.DatabaseConnection;

@RestController
public class UserController {

	@Autowired
	DatabaseConnection db;
	
	@Autowired
	UserDAO userDao;
	
	@RequestMapping(value = "/getUser", method = RequestMethod.GET )
	@ResponseBody
	public String getUser () {
		try {
			userDao.getAllUser();
			 
		}catch(Exception ex) {
			
		}
		
		return "hello";
		
	}
}
