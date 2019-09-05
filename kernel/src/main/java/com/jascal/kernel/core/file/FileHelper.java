package com.jascal.kernel.core.file;

import android.content.Context;

import org.json.JSONObject;

/**
 * @author ihave4cat
 * @describe TODO
 * @data on 2019-09-05 13:26
 * @email jascal@163.com
 */
public class FileHelper {
    private static final String TAG = FileHelper.class.getSimpleName();
    private static final String FILE_FORWORD_NAME = "agatha_";
    private String root;
    private JSONObject tree;

    public FileHelper(Context context) {
        root = context.getFilesDir().getAbsolutePath();
        tree = new JSONObject();
    }

    public void printTree(){

    }

    public void write(){

    }

    public void read(){

    }
}
