package com.fuicuiedu.xc.eventbus_20170331;

/**
 * Created by Administrator on 2017/3/31 0031.
 */

public class MessageEvent {

    private String msg;

    public MessageEvent(String msg){
        this.msg = msg;
    }

    public String getMsg(){
        return msg;
    }
}
