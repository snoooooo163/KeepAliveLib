package com.storm.keclean.keepalive.core;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;

/* compiled from: docleaner */
public class MiniService extends Service {

    /* renamed from: a */
    private boolean f9112a;

    public MiniService() {
        this.f9112a = Build.VERSION.SDK_INT >= 26;
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        Intent intent = new Intent("bc.hpcore");
        intent.setPackage(getPackageName());
        intent.addFlags(32);
        sendBroadcast(intent);
        stopSelf();
        System.exit(0);
    }
}
