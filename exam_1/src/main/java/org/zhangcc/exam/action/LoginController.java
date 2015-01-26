package org.zhangcc.exam.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.zhangcc.exam.domain.LoginForm;

import com.danga.MemCached.MemCachedClient;

@Controller
public class LoginController {
	@Autowired
	 private MemCachedClient memcachedClient;
	@RequestMapping(value = "login")
	public ModelAndView login(HttpServletRequest request,
			HttpServletResponse response, LoginForm command) {
		 Logger logger = Logger.getLogger(LoginController.class);
		 memcachedClient.set("lalalalal","dfdfdfdf");
		 logger.info(memcachedClient.get("lalalalal"));
		String username = command.getUsername();
		LoginForm form =new LoginForm();
		form.setPassword(username);	
		Map<String,Object> map =new HashMap<String,Object>();
		map.put("loginInfo", form);
		return new ModelAndView("/index/index", map);
	}
	
	@RequestMapping(value = "testRedis")
	public ModelAndView testRedis(HttpServletRequest request,
			HttpServletResponse response, String data) {
		 Logger logger = Logger.getLogger(LoginController.class);
		LoginForm form =new LoginForm();
		Map<String,Object> map =new HashMap<String,Object>();
		map.put("loginInfo", form);
		return null;
	}
}
