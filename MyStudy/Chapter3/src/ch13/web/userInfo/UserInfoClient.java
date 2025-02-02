package ch13.web.userInfo;

import java.io.*;
import java.util.*;

import ch13.domain.userinfo.*;
import ch13.domain.userinfo.dao.*;
import ch13.domain.userinfo.dao.oracle.*;
import ch13.domain.userinfo.dao.mysql.*;

public class UserInfoClient {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("db.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		
		String dbType = prop.getProperty("DBTYPE");
		
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId("12345");
		userInfo.setPassword("!#&*@#!");
		userInfo.setUserName("Kim");
		
		UserInfoDao userInfoDao = null;
		
		if(dbType.equals("ORACLE")) {
			userInfoDao = new UserInfoOracleDao();
		} 
		else if(dbType.equals("MYSQL")) {
			userInfoDao = new UserInfoMysqlDao();
		} 
		else {
			System.out.println("db error");
			return;
			
		}
		
		userInfoDao.insertUserInfo(userInfo);
		userInfoDao.updateUserInfo(userInfo);
		userInfoDao.deleteUserInfo(userInfo);
			
		
	}
}
