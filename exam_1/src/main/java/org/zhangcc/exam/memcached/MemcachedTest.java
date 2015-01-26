package org.zhangcc.exam.memcached;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:spring-memcache.xml"})
public class MemcachedTest extends AbstractJUnit4SpringContextTests {
	@Autowired
	private CacheHelper cacheHelper;
	@Test
	public void s() {
		cacheHelper.add("111", "222");
		System.out.println(cacheHelper.get("111"));
	}
}
