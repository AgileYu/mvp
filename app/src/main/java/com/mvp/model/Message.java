package com.mvp.model;

import java.util.HashMap;

/**
 * Created by ycl on 2017/8/15.
 */

public class Message
{

    public Message(int type) {
        this.type = type;
    }



    public Message(HashMap<String, Object> data, int type) {
        this.data = data;
        this.type = type;
    }


    private int type;

    public HashMap<String, Object> getData() {
        return data;
    }

    public int getType() {
        return type;
    }

    private HashMap<String,Object> data;



}
