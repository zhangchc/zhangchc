package org.zhangcc.exam.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zhangcc.exam.dao.TestDevicesDao;
import org.zhangcc.exam.domain.TestDevices;
import org.zhangcc.exam.service.TestDeviceService;
@Service
public class TestDevicesServiceImpl implements TestDeviceService {
	@Autowired
	private TestDevicesDao testDevicesDao;
	@Override
	public List<TestDevices> queryTestDevice(Map param) {
		return testDevicesDao.query(param);
	}

}
