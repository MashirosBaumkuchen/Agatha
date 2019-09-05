package com.jascal.kernel;

import android.content.Context;

import com.jascal.kernel.core.file.FileHelper;
import com.jascal.kernel.core.sp.SharedPreferencesHelper;

/**
 * @author ihave4cat
 * @describe comb-model
 * @data on 2019-09-05 19:28
 * @email jascal@163.com
 */
class Kernel {
    SharedPreferencesHelper sharedPreferencesHelper;
    FileHelper fileHelper;

    Kernel(Context context){
        sharedPreferencesHelper = new SharedPreferencesHelper(context);
        fileHelper = new FileHelper(context);
    }
}
