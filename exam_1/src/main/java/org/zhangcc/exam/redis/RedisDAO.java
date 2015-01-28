package org.zhangcc.exam.redis;

import java.io.Serializable;

public interface RedisDAO {
	public void sendMessage(String channel, Serializable message);
}
