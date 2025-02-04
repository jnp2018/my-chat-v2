package com.vit.mychat.cache;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class PrefUtils {

    private static final String PREF_NAME = "MY_CHAT_PREF";

    private SharedPreferences prefs;

    @Inject
    public PrefUtils(Application application) {
        prefs = application.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
    }

    public void set(String key, String value) {
        prefs.edit().putString(key, value).apply();
    }

    public String get(String key, String defValue) {
        return prefs.getString(key, defValue);
    }

    public void set(String key, int value) {
        prefs.edit().putInt(key, value).apply();
    }

    public int get(String key, int defValue) {
        return prefs.getInt(key, defValue);
    }

    public void set(String key, boolean value) {
        prefs.edit().putBoolean(key, value).apply();
    }

    public boolean get(String key, boolean defValue) {
        return prefs.getBoolean(key, defValue);
    }

    public void set(String key, long value) {
        prefs.edit().putLong(key, value).apply();
    }

    public long get(String key, long defValue) {
        return prefs.getLong(key, defValue);
    }

    public void clearKey(String key) {
        prefs.edit().remove(key).apply();
    }

    public void clearAllKey() {
        prefs.edit().clear().apply();
    }

    public interface PREF_KEY {
        String CURRENT_USER_ID = "CURRENT_USER_ID";

    }

}