package org.zhangcc.exam.memcached;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.danga.MemCached.MemCachedClient;
import com.danga.MemCached.SockIOPool;

public class CacheHelper {
	// ��������ͻ���
	@Autowired
	private  MemCachedClient cachedClient;
//	//����
//	private static MemCachedClient cachedClientBack;
//	// ����ģʽʵ�ֿͻ��˹�����
//	private static CacheHelper INSTANCE = new CacheHelper();

//	private CacheHelper() {
//		cachedClient = new MemCachedClient();
//		initPool(); 
//	}
	
//	public void initPool(){
//		// ��ȡ���ӳ�ʵ��
//				SockIOPool pool = SockIOPool.getInstance();
//				// ���û����������ַ���������ö��ʵ�ֲַ�ʽ����
//				pool.setServers(new String[] { "127.0.0.1:11211" });
//				// ���ó�ʼ����5
//				pool.setInitConn(5);
//				// ������С����5
//				pool.setMinConn(5);
//				// �����������250
//				pool.setMaxConn(250);
//				// ����ÿ������������ʱ��3��Сʱ
//				pool.setMaxIdle(1000 * 60 * 60 * 3);
//				pool.setMaintSleep(30);
//				pool.setNagle(false);
//				pool.setSocketTO(3000);
//				pool.setSocketConnectTO(0);
//				pool.initialize();
//	}
//
//	public void initPoolBack(){
//		// ��ȡ���ӳ�ʵ��
//				SockIOPool pool = SockIOPool.getInstance();
//				// ���û����������ַ���������ö��ʵ�ֲַ�ʽ����
//				pool.setServers(new String[] { "127.0.0.1:11212" });
//				// ���ó�ʼ����5
//				pool.setInitConn(5);
//				// ������С����5
//				pool.setMinConn(5);
//				// �����������250
//				pool.setMaxConn(250);
//				// ����ÿ������������ʱ��3��Сʱ
//				pool.setMaxIdle(1000 * 60 * 60 * 3);
//				pool.setMaintSleep(30);
//				pool.setNagle(false);
//				pool.setSocketTO(3000);
//				pool.setSocketConnectTO(0);
//				pool.initialize();
//	}
	/**
	 * ��ȡ���������Ψһʵ��
	 * 
	 * @return
	 */
//	public static CacheHelper getInstance() {
//		return INSTANCE;
//	}

	public void add(String key, Object value) {
		cachedClient.set(key, value);
	}

	public void add(String key, Object value, int milliseconds) {
		cachedClient.set(key, value, milliseconds);
	}

	public void remove(String key) {
		cachedClient.delete(key);
	}

	public void remove(String key, int milliseconds) {
		cachedClient.delete(key, milliseconds, new Date());
	}

	public void update(String key, Object value, int milliseconds) {
		cachedClient.replace(key, value, milliseconds);
	}

	public void update(String key, Object value) {
		cachedClient.replace(key, value);
	}

	public Object get(String key) {
		return cachedClient.get(key);
	}


}
