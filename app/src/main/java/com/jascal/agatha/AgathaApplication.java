package com.jascal.agatha;

import android.app.Application;
import com.jascal.kernel.AppRuntime;

/**
 * @author ihave4cat
 * @describe app init
 * @data on 2019-09-05 19:33
 * @email jascal@163.com
 */
public class AgathaApplication extends Application {

    public AgathaApplication() {
        AppRuntime.init(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
