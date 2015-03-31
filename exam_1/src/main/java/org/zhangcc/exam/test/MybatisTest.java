package org.zhangcc.exam.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zhangcc.exam.service.TestDeviceService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml"})
public class MybatisTest extends AbstractJUnit4SpringContextTests {
	@Autowired
	private TestDeviceService testDeviceService;
	@Test
	public void s() {
		Map param =new HashMap();
		testDeviceService.queryTestDevice(param);
	}
}

