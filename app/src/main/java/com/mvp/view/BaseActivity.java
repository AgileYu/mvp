package com.mvp.view;


import android.app.Activity;
import android.os.Bundle;

import de.greenrobot.event.EventBus;

public class BaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        initView();
        initData();
        startTask();

    }

    public void initView() {


    }


    public void startTask() {


    }

    @Override
    protected void onResume() {
        super.onResume();
        if(!EventBus.getDefault().isRegistered(this)){
            EventBus.getDefault().register(this);

        }
    }

    public void initData() {


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(EventBus.getDefault().isRegistered(this)){
            EventBus.getDefault().unregister(this);
        }
    }


}

