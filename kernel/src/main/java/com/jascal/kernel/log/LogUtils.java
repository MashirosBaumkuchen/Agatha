package com.jascal.kernel.log;

import android.util.Log;

import com.jascal.kernel.config.Config;

/**
 * @author ihave4cat
 * @describe print log
 * @data on 2019-09-05 20:09
 * @email jascal@163.com
 */
public class LogUtils {
    public static void i(String tag, String msg) {
        if (Config.debug)
            Log.i(tag, msg);
    }

    public static void e(String tag, String msg){
        if(Config.debug)
            Log.e(tag, msg);
    }

    public static void d(String tag, String msg){
        if(Config.debug)
            Log.d(tag, msg);
    }

    public static void v(String tag, String msg){
        if(Config.debug)
            Log.v(tag, msg);
    }
}
