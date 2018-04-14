package com.redis.main;

import com.redis.redis.RedisClientUtils;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author y15079
 * @create 2017-10-24 19:37
 * @desc
 **/
public class RedisTest {

	public static void main(String[] args) {
		try {
			ApplicationContext ac =  new ClassPathXmlApplicationContext("classpath:/spring-redis.xml");
			RedisClientUtils redisClient = (RedisClientUtils)ac.getBean("redisClientUtils");
			redisClient.set("a", "abc");
			System.out.println(redisClient.get("a"));
		} catch (BeansException e) {
			e.printStackTrace();
		}
	}

}
