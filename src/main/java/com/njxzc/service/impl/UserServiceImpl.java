package com.njxzc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.njxzc.dao.UserMapper;
import com.njxzc.model.User;
import com.njxzc.model.UserExample;
import com.njxzc.model.UserExample.Criteria;
import com.njxzc.service.UserService;

@Service
public class UserServiceImpl implements UserService {


	@Autowired
	UserMapper userMapper;
	
	@Override
	public List<User> selectByExample(UserExample example ){
		return userMapper.selectByExample(example);
	}

	@Override
	public User login(String uname, String upwd) {
		
		UserExample example = new UserExample();
		
		Criteria  criteria=example.createCriteria();
		criteria.andUnameEqualTo(uname);
		criteria.andUpwdEqualTo(upwd);
		
		List<User> list =userMapper.selectByExample(example);
		
		return list.size()>0? list.get(0):null;
	}
	
	
	public User selectByPrimaryKey(Integer uid) {
		
		
		return userMapper.selectByPrimaryKey(uid);
		
	}

//	@Override
//	public List<User> selectUser(User user) {
//		// TODO Auto-generated method stub
//		return userMapper.selectUser(user);
//	}

	@Override
	public int updateByPrimaryKey(User record) {
		// TODO Auto-generated method stub
		return userMapper.updateByPrimaryKey(record);
	}

	@Override
	public int updateByPrimaryKeySelective(User record) {
		// TODO Auto-generated method stub
		return userMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public List<User> selectUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
