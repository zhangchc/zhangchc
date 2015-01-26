package org.zhangcc.exam.httpClient;



public class ThreadClient implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<3;i++){
	        HttpRequest.sendGet("http://localhost:8080/exam_1/testRedis","data=fffff"+i);
	    	}
	}

	
	public static void main(String[] args) {
		ThreadClient client =new ThreadClient();
		Thread t1 =new Thread(client);
		Thread t2 =new Thread(client);
		Thread t3 =new Thread(client);
		Thread t4 =new Thread(client); 
		Thread t5 =new Thread(client);
		Thread t6 =new Thread(client);
		Thread t7 =new Thread(client);
		Thread t8 =new Thread(client);
		Thread t9 =new Thread(client);
		Thread t10 =new Thread(client);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
	}
}
