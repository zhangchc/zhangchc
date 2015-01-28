package org.zhangcc.exam.redis;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class MessageDelegateListenerImpl implements MessageDelegateListener {
	 
    @Override
    public void handleMessage1(Serializable message) {
    	System.out.println("节点1写文件：");
        //什么都不做,只输出
        if(message == null){
            System.out.println("接受 消息："+"null");
        } else if(message.getClass().isArray()){
            System.out.println("接受 消息："+Arrays.toString((Object[])message));
        } else if(message instanceof List<?>) {
            System.out.println("接受 消息："+message);
        } else if(message instanceof Map<? , ?>) {
            System.out.println("接受 消息："+message);
        } else {
            System.out.println("接受 消息："+message);
        }
    }
    @Override
    public void handleMessage2(Serializable message) {
    	System.out.println("节点2写文件：");
        //什么都不做,只输出
        if(message == null){
            System.out.println("接受 消息："+"null");
        } else if(message.getClass().isArray()){
            System.out.println("接受 消息："+Arrays.toString((Object[])message));
        } else if(message instanceof List<?>) {
            System.out.println("接受 消息："+message);
        } else if(message instanceof Map<? , ?>) {
            System.out.println("接受 消息："+message);
        } else {
            System.out.println("接受 消息："+message);
        }
    }
}
