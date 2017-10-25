package com.springDataRedis.service;

import com.springDataRedis.model.User;
import com.springDataRedis.redis.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * @author y15079
 * @create 2017-10-24 17:01
 * @desc
 **/

public class UserServiceImpl implements UserService{

	protected RedisUtil redisUtil;

	public RedisUtil getRedisUtil() {
		return redisUtil;
	}

	public void setRedisUtil(RedisUtil redisUtil) {
		this.redisUtil = redisUtil;
	}

	public void saveUser(final User user){
		redisUtil.set("user.id."+user.getId(),user.getName());
	}

	public User getUser(final String id){
		User user=new User();
		user.setId(id);
		String username= (String) redisUtil.get("user.id."+id);
		user.setName(username);
		return user;
	}
}
