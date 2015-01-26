package org.zhangcc.exam.test;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml","classpath:memcached/spring-memcache.xml"})
public class SpringRedisTest extends AbstractJUnit4SpringContextTests {
	@Autowired
	private RedisTemplate<String, String> redisTemplate;
	@Test
	public void s() {
		Assert.assertNotNull(redisTemplate);
		redisTemplate.opsForList().leftPush("deviceInfo","{id:1,data:111,name:222,age:333,phone:15050541759}");
		redisTemplate.opsForList().leftPush("deviceInfo","{id:2,data:111,name:222,age:333,phone:15050541759}");
		redisTemplate.opsForList().leftPush("deviceInfo","{id:3,data:111,name:222,age:333,phone:15050541759}");
		redisTemplate.opsForList().leftPush("deviceInfo","{id:4,data:111,name:222,age:333,phone:15050541759}");
		redisTemplate.opsForList().leftPush("deviceInfo","{id:5,data:111,name:222,age:333,phone:15050541759}");
		System.out.println(redisTemplate.opsForList().range("deviceInfo", 0, -1));
	}
}
