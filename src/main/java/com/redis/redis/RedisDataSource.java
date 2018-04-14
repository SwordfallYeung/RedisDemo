package com.redis.redis;

import redis.clients.jedis.ShardedJedis;

/**
 * @author y15079
 * @create 2017-10-24 18:56
 * @desc
 **/
public interface RedisDataSource {
	//取得redis的客户端，可以执行命令了
	public abstract ShardedJedis getRedisClient();

	//出现异常后，将资源返还给pool
	public void returnResource(ShardedJedis shardedJedis,boolean broken);
}
