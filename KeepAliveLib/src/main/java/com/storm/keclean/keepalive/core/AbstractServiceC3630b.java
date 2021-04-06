package com.storm.keclean.keepalive.core;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.nio.channels.FileLock;

/* renamed from: com.dkle.b */
/* compiled from: docleaner */
public abstract class AbstractServiceC3630b extends Service {

    /* renamed from: a */
    FileLock[] f9113a = new FileLock[2];

    /* access modifiers changed from: package-private */
    /* renamed from: com.dkle.b$a */
    /* compiled from: docleaner */
    public class ServiceConnectionC3631a implements ServiceConnection {
        ServiceConnectionC3631a() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: a */
    private void m11987a(int i, int i2) {
        String[] a = C3632c.m11993a(this, i, i2);
        if ((!KMain.m11968b(a[1])) && KMain.m11967a(C3632c.m11992a(this, Math.min(i, i2)))) {
            KMain.m11966a(getApplicationInfo().sourceDir, a[0], a[1], Math.min(i, i2) + 1);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Intent[] mo20538a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int[] mo20539b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract int[] mo20540c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract int[] mo20541d();

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        Intent[] a = mo20538a();
        if (a != null) {
            for (Intent intent : a) {
                bindService(intent, new ServiceConnectionC3631a(), Context.BIND_AUTO_CREATE);
            }
        }
        int[] d = mo20541d();
        String[] a2 = C3632c.m11993a(this, d[0], d[1]);
        for (int i = 0; i < a2.length; i++) {
            this.f9113a[i] = KMain.m11965a(a2[i], true);
        }
        int[] b = mo20539b();
        int[] c = mo20540c();
        m11987a(b[0], b[1]);
        m11987a(c[0], c[1]);
    }
}
