package com.gzliu.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.gzliu.service.UserService;
import com.gzliu.vo.User;

@Controller()
@RequestMapping("/user")
public class UserController {
	 /** 日志实例 */  
    private static final Logger logger = Logger.getLogger(UserController.class);  
    @Autowired
    private UserService userService;
    
	@RequestMapping(value="index",method=RequestMethod.GET)
	public ModelAndView index(){
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("index");
		User user = new User();
		user.setuName("test");
		mav.addObject("user",user);
		userService.inserUser(user);
		return mav;
	}
	
	/**
	 * JSON方式处理
	 * @param user
	 * @return
	 */
	@RequestMapping(value="/ajaxPost",method=RequestMethod.POST)
	public@ResponseBody User ajaxPost(User user){
		logger.info("################"+user.toString());
		User us = new User();
		us.setuName("小红");
		
		return us;
	}
	
	/**
	 * REST风格1
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/login/{id}",method=RequestMethod.GET)
	public@ResponseBody User login(@PathVariable("id") int id){
		logger.info("###############"+id);
		User user = new User();
		user.setuID(10);
		user.setuName("小红");
		
		return user;
	}
	
/*	
 * $.ajax({
    url: dekota.url + 'person',
    type: 'POST',//注意在传参数时，加：_method:'PATCH'　将对应后台的PATCH请求方法
    dataType: 'json',
    data: {_method:'PATCH',name: '张三'}
 * @RequestMapping(value = "/person", method = RequestMethod.PATCH)
    public @ResponseBody
    List<Person> listPerson(@RequestParam(value = "name", required = false, defaultValue = "") String name) {
 
        logger.info("查询人员name like " + name);
        List<Person> lstPersons = new ArrayList<Person>();
 
        Person person = new Person();
        person.setName("张三");
        person.setSex("男");
        person.setAge(25);
        person.setId(101);
        lstPersons.add(person);
 
        Person person2 = new Person();
        person2.setName("李四");
        person2.setSex("女");
        person2.setAge(23);
        person2.setId(102);
        lstPersons.add(person2);
 
        Person person3 = new Person();
        person3.setName("王五");
        person3.setSex("男");
        person3.setAge(27);
        person3.setId(103);
        lstPersons.add(person3);
 
        return lstPersons;
    }*/
 

}
