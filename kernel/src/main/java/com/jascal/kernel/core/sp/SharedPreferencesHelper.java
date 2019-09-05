package com.jascal.kernel.core.sp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * @author ihave4cat
 * @describe sharedPreference utils
 * @data on 2019-09-05 13:23
 * @email jascal@163.com
 */
public class SharedPreferencesHelper {
    private static final String TAG = SharedPreferencesHelper.class.getSimpleName();
    private static final String SP_NAME = "SP_DEFAULT_NAME";

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    @SuppressLint("CommitPrefEdits")
    public SharedPreferencesHelper(Context context) {
        if (context == null) {
            throw new SharedPreferenceException("try to init SharedPreference instance on null context.");
        }
        sharedPreferences = context.getSharedPreferences(SP_NAME, Context.MODE_PRIVATE);
        editor = this.sharedPreferences.edit();
    }

    public void putInt(String key, int value) {
        if(editor == null){
            throw new SharedPreferenceException();
        }
        editor.putInt(key, value);
        editor.commit();
    }

    public void putFloat(String key, float value) {
        if(editor == null){
            throw new SharedPreferenceException();
        }
        editor.putFloat(key, value);
        editor.commit();
    }

    public void putLong(String key, long value) {
        if(editor == null){
            throw new SharedPreferenceException();
        }
        editor.putLong(key, value);
        editor.commit();
    }

    public void putBoolean(String key, boolean value) {
        if(editor == null){
            throw new SharedPreferenceException();
        }
        editor.putBoolean(key, value);
        editor.commit();
    }

    public void putString(String key, String value) {
        if(editor == null){
            throw new SharedPreferenceException();
        }
        editor.putString(key, value);
        editor.commit();
    }

    public int getInt(String key, int defaultValue) {
        if(sharedPreferences == null){
            throw new SharedPreferenceException();
        }
        return sharedPreferences.getInt(key, defaultValue);
    }

    public float getFloat(String key, float defaultValue) {
        if(sharedPreferences == null){
            throw new SharedPreferenceException();
        }
        return sharedPreferences.getFloat(key, defaultValue);
    }

    public long getLong(String key, long defaultValue) {
        if(sharedPreferences == null){
            throw new SharedPreferenceException();
        }
        return sharedPreferences.getLong(key, defaultValue);
    }

    public boolean getBoolean(String key, boolean defaultValue) {
        if(sharedPreferences == null){
            throw new SharedPreferenceException();
        }
        return sharedPreferences.getBoolean(key, defaultValue);
    }

    public String getString(String key, String defaultValue) {
        if(sharedPreferences == null){
            throw new SharedPreferenceException();
        }
        return sharedPreferences.getString(key, defaultValue);
    }
}

class SharedPreferenceException extends RuntimeException {
    SharedPreferenceException() {
        super("SharedPreference should init first.");
    }

    SharedPreferenceException(String message) {
        super(message);
    }
}
