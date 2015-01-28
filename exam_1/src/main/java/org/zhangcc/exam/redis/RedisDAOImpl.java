package org.zhangcc.exam.redis;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

public class RedisDAOImpl implements RedisDAO {
	@Autowired
    private RedisTemplate<String, Object> redisTemplate ;
 
    public RedisDAOImpl() {
 
    }
 
    @Override
    public void sendMessage(String channel, Serializable message) {
        redisTemplate.convertAndSend(channel, message);
    }
 
 
    public RedisTemplate getRedisTemplate() {
        return redisTemplate;
    }
 
    public void setRedisTemplate(RedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }
}
