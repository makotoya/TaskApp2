package jp.techacademy.makoto.yaguchi.taskapp;

/**
 * Created by Makoto Yaguchi on 2017/11/28.
 */

import android.app.Application;

import io.realm.Realm;

public class TaskApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}