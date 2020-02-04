package com.njxzc.service;

import java.util.List;

import com.njxzc.model.User;
import com.njxzc.model.UserExample;

public interface UserService {

	/**
	 * 查找
	 * @param example
	 * @return
	 */
	List<User> selectByExample(UserExample example );
	
	/**
	 * 登录
	 * @param username
	 * @param userpwd
	 * @return
	 */
	public User login(String username,String userpwd);

	User  selectByPrimaryKey(Integer uid);
	
	List<User> selectUser(User user);
	
	int updateByPrimaryKey(User record);

    int updateByPrimaryKeySelective(User record);
}
