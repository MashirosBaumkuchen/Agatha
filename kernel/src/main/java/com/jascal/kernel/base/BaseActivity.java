package com.jascal.kernel.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * @author ihave4cat
 * @describe base activity
 * @data on 2019-09-06 10:36
 * @email jascal@163.com
 */
public abstract class BaseActivity extends AppCompatActivity {

    protected abstract void initView();

    protected abstract void initAnim();

    protected abstract int layout();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout());
        initView();
        initAnim();
    }
}
