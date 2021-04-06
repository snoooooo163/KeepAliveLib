package com.storm.keclean.keepalive.core;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: com.dkle.a */
/* compiled from: docleaner */
public class C3628a extends BroadcastReceiver {

    /* renamed from: com.dkle.a$a */
    /* compiled from: docleaner */
    class ServiceConnectionC3629a implements ServiceConnection {
        ServiceConnectionC3629a(C3628a aVar) {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Intent[] mo20544a(Context context) {
        return new Intent[]{new Intent(context, Service2.class), new Intent(context, Service1.class), new Intent(context, Service3.class)};
    }

    public void onReceive(Context context, Intent intent) {
        Intent[] a;
        Context applicationContext = context.getApplicationContext();
        for (Intent intent2 : mo20544a(context)) {
            applicationContext.bindService(intent2, new ServiceConnectionC3629a(this), Context.BIND_AUTO_CREATE);
        }
    }
}
