package com.storm.keclean.keepalive.core;

import android.app.Instrumentation;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* compiled from: docleaner */
public class InstruM extends Instrumentation {

    /* renamed from: com.dkle.InstruM$a */
    /* compiled from: docleaner */
    class ServiceConnectionC3626a implements ServiceConnection {
        ServiceConnectionC3626a(InstruM instruM) {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Intent[] mo20526a(Context context) {
        return new Intent[]{new Intent(context, Service2.class), new Intent(context, Service1.class), new Intent(context, Service3.class)};
    }

    public void onCreate(Bundle bundle) {
        Intent[] a;
        super.onCreate(bundle);
        Log.e("INSTRUMENT","INSTRUMENT RUN");

        Context applicationContext = getContext().getApplicationContext();
        for (Intent intent : mo20526a(applicationContext)) {
            applicationContext.bindService(intent, new ServiceConnectionC3626a(this), Context.BIND_AUTO_CREATE);
        }
    }
}
