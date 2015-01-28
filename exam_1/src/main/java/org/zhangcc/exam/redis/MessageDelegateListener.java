package org.zhangcc.exam.redis;

import java.io.Serializable;

public interface MessageDelegateListener {
	 void handleMessage1(Serializable message);
	 void handleMessage2(Serializable message);
}
