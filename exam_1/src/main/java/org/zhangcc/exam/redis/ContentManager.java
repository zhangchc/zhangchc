package org.zhangcc.exam.redis;

import java.io.Serializable;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;

public class ContentManager {
    @Autowired  
    private RedisTemplate<Serializable, Serializable> redisTemplate;  
	private ContentManager(){}
	public static ContentManager install;
	public static ContentManager getInstall(){
		if(null==install){
			install= new ContentManager();
		}
		return install;
	}
	private static ConcurrentHashMap<String, List> currentMap =new ConcurrentHashMap<String, List>();
	public  void setRedis(String key,List obj){
		currentMap.put(key, obj);
	}
public  Object getRedis(String key){
		return currentMap.get(key);
	}

}
