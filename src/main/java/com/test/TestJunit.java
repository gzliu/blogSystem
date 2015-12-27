//package com.test;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//import com.gzliu.service.UserService;
//import com.gzliu.vo.User;
//
//
//public class TestJunit {
//	private UserService userService;
//	
//	@Before
//	public void befor(){
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:conf/spring.xml",
//				"classpath:conf/spring-mybatis.xml");
//		userService = (UserService)context.getBean("userServiceImpl");
//		
//	}
//	@Test
//	public void tests(){
//		User user = new User();
//		user.setuName("xx");
//		userService.inserUser(user);
//		
//	}
//}
