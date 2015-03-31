package org.zhangcc.exam.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;
import org.zhangcc.exam.domain.TestDevices;
@Repository
public interface TestDevicesDao {
public List<TestDevices> query(Map param);
}
