# RedisDemo
Redis缓存框架的集群、主从集群、单节点，spring与redis的两种整合方法，一种使用spring-data-redis，一种不使用

### Redis集群部署
https://blog.csdn.net/yuliantao/article/details/78747316<br/>
https://rubygems.org/gems/redis/versions/3.2.1<br/>

### Redis常用的备份方式
https://blog.csdn.net/moshenglv/article/details/72847811

redis如果不配置主从，则redis写数据时只会在n台机器中的一台上

### Redis 范围分区与哈希分区
http://www.cnblogs.com/EasonJim/p/7624903.html

### Redis 分片集群连接ShardedJedis 这个有问题，连不上集群
http://www.codedocs.net/blog/470

### Redis 集群重启 redis-trib.tb fix
https://www.cnblogs.com/kevingrace/p/5569929.html

### Redis 当前库大小查看
dbsize则是当前库key的数量
