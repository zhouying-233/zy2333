package com.njxzc.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.code.kaptcha.Constants;
import com.njxzc.model.User;
import com.njxzc.service.UserService;

@Controller
@RequestMapping(value="")
public class UserController {

	
	@Resource(name="userServiceImpl")
	 UserService userService;
	
	@RequestMapping(value="/user/findalluser")
	@ResponseBody
	public List<User> findalluser() {
		User user=new User();
		List<User> userlist=userService.selectUser(user);
		System.out.print(userlist);
		return userlist;
	}
	//访问8080：hospital/user/login.do
	@RequestMapping(value="/login")
	public  ModelAndView login(String username,String userpwd,String code,HttpServletRequest req) {
		
		ModelAndView mv = new ModelAndView();
		//获取session对象
		HttpSession session =req.getSession();
		
		//获取随机生成的验证码
		String randomCore =session.getAttribute(Constants.KAPTCHA_SESSION_KEY).toString();
		
		//判断验证码输入是否正确
		if(code.equalsIgnoreCase(randomCore)) {
			//equalsIgnoreCase忽略大小写
			//equals区分大小写
			
			//判断用户名，密码是否正确
			
			User user=userService.login(username, userpwd);
			
			if(user!= null) {
				mv.setViewName("user");//输入正确跳转到主页面
			}else {
				mv.setViewName("login");//输入错误
			}		
		}else {
			
			mv.setViewName("login");//login.jsp
		}	
		return mv;	
		
	}
		
		
		
		
	
	}
