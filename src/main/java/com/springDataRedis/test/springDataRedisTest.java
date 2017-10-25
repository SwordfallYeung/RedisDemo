package com.springDataRedis.test;

import com.springDataRedis.model.User;
import com.springDataRedis.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author y15079
 * @create 2017-10-24 17:27
 * @desc
 **/
public class springDataRedisTest {

	public static void main(String[] args) {
		ApplicationContext ac =  new ClassPathXmlApplicationContext("classpath:/spring-data-singleton-redis.xml");
		UserService userService=(UserService)ac.getBean("userService");
		User user=new User("1","xiaobai","12");
		userService.saveUser(user);
		User user2=userService.getUser("1");
		System.out.println(user2.getName());

	}
}
