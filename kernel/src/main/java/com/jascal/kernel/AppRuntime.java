package com.jascal.kernel;

import android.content.Context;

import com.jascal.kernel.core.db.SQLiteHelper;
import com.jascal.kernel.core.file.FileHelper;
import com.jascal.kernel.core.sp.SharedPreferencesHelper;

/**
 * @author ihave4cat
 * @describe runtime information manager
 * @data on 2019-09-05 13:05
 * @email jascal@163.com
 */
public class AppRuntime {
    private static Kernel kernel;

    public AppRuntime() {
    }

    public static void init(Context context){
        kernel = new Kernel(context);
    }

    public static SharedPreferencesHelper getSharedPreferencesHelper(){
        return kernel.sharedPreferencesHelper;
    }

    public static SQLiteHelper getSQLiteHelper(){
        return null;
    }

    public static FileHelper getFilerHelper(){
        return kernel.fileHelper;
    }
}
