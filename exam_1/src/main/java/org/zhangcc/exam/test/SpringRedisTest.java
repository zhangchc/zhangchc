package org.zhangcc.exam.test;

import java.util.Date;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml","classpath:memcached/spring-memcache.xml","classpath:spring/spring-quzrtz.xml"})
public class SpringRedisTest extends AbstractJUnit4SpringContextTests {
	@Autowired
	private RedisTemplate<String, String> redisTemplate;
	@Test
	public void s() {
		Assert.assertNotNull(redisTemplate);
//		redisTemplate.opsForList().leftPush("deviceInfo","{id:1,data:111,name:222,age:333,phone:15050541759}");
//		redisTemplate.opsForList().leftPush("deviceInfo","{id:2,data:111,name:222,age:333,phone:15050541759}");
//		redisTemplate.opsForList().leftPush("deviceInfo","{id:3,data:111,name:222,age:333,phone:15050541759}");
//		redisTemplate.opsForList().leftPush("deviceInfo","{id:4,data:111,name:222,age:333,phone:15050541759}");
//		redisTemplate.opsForList().leftPush("deviceInfo","{id:5,data:111,name:222,age:333,phone:15050541759}");
//		System.out.println(redisTemplate.opsForList().range("deviceInfo", 0, -1));
		while (true) { //这里是一个死循环,目的就是让进程不退出,用于接收发布的消息
            try {
                System.out.println("current time: " + new Date());
 
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
		}}
}
