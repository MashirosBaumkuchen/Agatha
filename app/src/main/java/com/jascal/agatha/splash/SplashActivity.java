package com.jascal.agatha.splash;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.widget.TextView;
import com.jascal.agatha.R;
import com.jascal.agatha.login.LoginActivity;
import com.jascal.kernel.base.BaseActivity;

/**
 * @author ihave4cat
 * @describe TODO
 * @data on 2019-09-05 20:26
 * @email jascal@163.com
 */
public class SplashActivity extends BaseActivity {
    private static final String TAG = SplashActivity.class.getSimpleName();
    private TextView logo;

    @Override
    public void initView() {
        logo = findViewById(R.id.splash_logo);
    }

    @Override
    public void initAnim() {

    }

    @Override
    protected int layout() {
        return R.layout.activity_splash;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        new Handler(getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                LoginActivity.startWithAnim(SplashActivity.this, logo);
            }
        }, 2000);
    }
}
