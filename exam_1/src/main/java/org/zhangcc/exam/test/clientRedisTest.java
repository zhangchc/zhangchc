package org.zhangcc.exam.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zhangcc.exam.redis.RedisDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml","classpath:memcached/spring-memcache.xml"})
public class clientRedisTest extends AbstractJUnit4SpringContextTests {
	@Autowired
    private RedisTemplate<String, Object> redisTemplate ;
	@Test
    public void testPublishMessage() throws Exception {
        String msg = "Hello, Redis!";
        redisTemplate.convertAndSend("java1", msg);
        Integer[] values = new Integer[]{21341,123123,12323};
        redisTemplate.convertAndSend("java2", values);  //发布一个数组消息
    }
}
