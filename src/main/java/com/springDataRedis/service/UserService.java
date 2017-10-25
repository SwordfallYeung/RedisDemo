package com.springDataRedis.service;


import com.springDataRedis.model.User;

/**
 * @author y15079
 * @create 2017-10-24 17:01
 * @desc
 **/
public interface UserService {

	void saveUser(final User user);

	User getUser(final String id);
}
