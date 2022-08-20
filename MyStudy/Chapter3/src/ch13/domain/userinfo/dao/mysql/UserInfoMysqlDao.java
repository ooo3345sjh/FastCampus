package ch13.domain.userinfo.dao.mysql;

import ch13.domain.userinfo.*;
import ch13.domain.userinfo.dao.*;

public class UserInfoMysqlDao implements UserInfoDao {

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("Insert into MySQL DB userID = " + userInfo.getUserId());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("Update into MySQL DB userID = " + userInfo.getUserId());
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("Delete into MySQL DB userID = " + userInfo.getUserId());
		
	}

}
