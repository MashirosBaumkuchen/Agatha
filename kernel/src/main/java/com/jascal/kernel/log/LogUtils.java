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
    private static final String prefix = "Agatha, 鲜血のアガサ ---- ";

    public static void i(String tag, String msg) {
        if (Config.debug)
            Log.i(prefix + tag, msg);
    }

    public static void e(String tag, String msg) {
        if (Config.debug)
            Log.e(prefix + tag, msg);
    }

    public static void d(String tag, String msg) {
        if (Config.debug)
            Log.d(prefix + tag, msg);
    }

    public static void v(String tag, String msg) {
        if (Config.debug)
            Log.v(prefix + tag, msg);
    }
}
