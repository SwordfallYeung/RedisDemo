package com.redis.redis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;


/**
 * @author y15079
 * @create 2017-10-24 18:56
 * @desc
 **/
@Service
public class RedisDataSourceImpl implements RedisDataSource{

	private static final Logger log= LoggerFactory.getLogger(RedisDataSourceImpl.class);

	@Autowired
	private ShardedJedisPool shardedJedisPool;

//	public ShardedJedisPool getShardedJedisPool() {
//		return shardedJedisPool;
//	}
//
//	public void setShardedJedisPool(ShardedJedisPool shardedJedisPool) {
//		this.shardedJedisPool = shardedJedisPool;
//	}

	//取得redis的客户端，可以执行命令了
	public ShardedJedis getRedisClient() {
		try {
			ShardedJedis shardedJedis=shardedJedisPool.getResource();
			return shardedJedis;
		} catch (Exception e) {
			log.error("getRedisClent error", e);
			System.out.println(e.getMessage());
		}
		return null;
	}

	//出现异常后，将资源返还给pool
	public void returnResource(ShardedJedis shardedJedis, boolean broken) {
			if (broken){
				shardedJedisPool.returnBrokenResource(shardedJedis);
			}else {
				shardedJedisPool.returnResource(shardedJedis);
			}
	}
}
