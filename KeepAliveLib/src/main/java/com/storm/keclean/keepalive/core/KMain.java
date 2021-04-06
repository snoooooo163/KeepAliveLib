package com.storm.keclean.keepalive.core;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Process;
import android.util.Log;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.channels.FileLock;

/* compiled from: docleaner */
public class KMain {

    /* renamed from: a */
    public Parcel f9103a;

    /* renamed from: b */
    public IBinder f9104b;

    /* renamed from: c */
    public Parcel f9105c;

    /* renamed from: d */
    public int f9106d;

    /* renamed from: e */
    public Parcel f9107e;

    /* renamed from: f */
    public int f9108f;

    /* renamed from: g */
    public int f9109g;
    public static final String LINE_SEP = "\n";

    /* renamed from: com.dkle.KMain$a */
    /* compiled from: docleaner */
    public class C3627a extends Thread {

        /* renamed from: a */
        public final String f9110a;

        public C3627a(String str) {
            this.f9110a = str;
        }

        public void run() {
            setPriority(10);
            KMain.m11965a(this.f9110a, false);
            KMain.this.mo20534d();
            KMain.this.mo20532b();
            KMain.this.mo20533c();
        }
    }

    public KMain(int i) {
    }

    public static void main(String[] strArr) {
        try {
            Log.e("KMAIN","KMAIN RUN");
            Method declaredMethod = Process.class.getDeclaredMethod("setArgV0", String.class);
            declaredMethod.invoke(null, "assist_" + System.currentTimeMillis());
        } catch (Exception unused) {
            unused.printStackTrace();
        }
        KMain kMain = new KMain(Integer.parseInt(strArr[2]));
        kMain.mo20531a(strArr);
        kMain.mo20534d();
        kMain.mo20532b();
        kMain.mo20533c();
        Process.killProcess(Process.myPid());
    }

    /* renamed from: a */
    public void mo20530a() {
        try {
            this.f9104b = (IBinder) Class.forName("android.os.ServiceManager").getMethod("getService", String.class).invoke(null, "activity");
            this.f9109g = m11964a("TRANSACTION_startService", "START_SERVICE_TRANSACTION");
            this.f9106d = m11964a("TRANSACTION_broadcastIntent", "BROADCAST_INTENT_TRANSACTION");
            int a = m11964a("TRANSACTION_startInstrumentation", "START_INSTRUMENTATION_TRANSACTION");
            this.f9108f = a;
            if (this.f9109g == -1 && this.f9106d == -1 && a == -1) {
                throw new RuntimeException("all binder code get failed");
            }
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.aprs.util", "com.storm.keclean.keepalive.core.MiniService"));
            if (intent.getComponent() != null) {
                Parcel obtain = Parcel.obtain();
                this.f9103a = obtain;
                obtain.writeInterfaceToken("android.app.IActivityManager");
                this.f9103a.writeStrongBinder(null);
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f9103a.writeInt(1);
                }
                intent.writeToParcel(this.f9103a, 0);
                this.f9103a.writeString(null);
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f9103a.writeInt(1);
                }
                if (Build.VERSION.SDK_INT > 22) {
                    this.f9103a.writeString(intent.getComponent().getPackageName());
                }
                this.f9103a.writeInt(0);
            }
            ComponentName componentName = new ComponentName("com.aprs.util", "com.storm.keclean.keepalive.core.InstruM");
            Parcel obtain2 = Parcel.obtain();
            this.f9107e = obtain2;
            obtain2.writeInterfaceToken("android.app.IActivityManager");
            if (Build.VERSION.SDK_INT >= 26) {
                this.f9107e.writeInt(1);
            }
            componentName.writeToParcel(this.f9107e, 0);
            this.f9107e.writeString(null);
            this.f9107e.writeInt(0);
            this.f9107e.writeInt(0);
            this.f9107e.writeStrongBinder(null);
            this.f9107e.writeStrongBinder(null);
            this.f9107e.writeInt(0);
            this.f9107e.writeString(null);
            Intent intent2 = new Intent();
            intent2.setAction("bc.hpcore");
            intent2.setPackage("com.aprs.util");
            intent2.addFlags(32);
            Parcel obtain3 = Parcel.obtain();
            this.f9105c = obtain3;
            obtain3.writeInterfaceToken("android.app.IActivityManager");
            this.f9105c.writeStrongBinder(null);
            if (Build.VERSION.SDK_INT >= 26) {
                this.f9105c.writeInt(1);
            }
            intent2.writeToParcel(this.f9105c, 0);
            this.f9105c.writeString(null);
            this.f9105c.writeStrongBinder(null);
            this.f9105c.writeInt(-1);
            this.f9105c.writeString(null);
            this.f9105c.writeInt(0);
            this.f9105c.writeStringArray(null);
            this.f9105c.writeInt(-1);
            this.f9105c.writeInt(0);
            this.f9105c.writeInt(0);
            this.f9105c.writeInt(0);
            this.f9105c.writeInt(0);
        } catch (Exception unused) {
            unused.printStackTrace();
        }
    }

    /* renamed from: b */
    public final void mo20532b() {
        IBinder iBinder;
        Parcel parcel = this.f9105c;
        if (parcel != null && (iBinder = this.f9104b) != null) {
            try {
                iBinder.transact(this.f9106d, parcel, null, 1);
            } catch (Exception unused) {
                unused.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    public final void mo20533c() {
        IBinder iBinder;
        Parcel parcel = this.f9107e;
        if (parcel != null && (iBinder = this.f9104b) != null) {
            try {
                iBinder.transact(this.f9108f, parcel, null, 1);
            } catch (Exception unused) {
                unused.printStackTrace();
            }
        }
    }

    /* renamed from: d */
    public final void mo20534d() {
        IBinder iBinder;
        Parcel parcel = this.f9103a;
        if (parcel != null && (iBinder = this.f9104b) != null) {
            try {
                iBinder.transact(this.f9109g, parcel, null, 1);
            } catch (Exception unused) {
                unused.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public static boolean m11968b(String str) {
        try {
            FileLock tryLock = new FileOutputStream(str, true).getChannel().tryLock();
            if (tryLock == null) {
                return false;
            }
            tryLock.release();
            return true;
        } catch ( Exception unused) {
            unused.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public static final int m11964a(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.app.IActivityManager$Stub");
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.getInt(cls);
        } catch (Exception unused) {
            unused.printStackTrace();

            try {
                Class<?> cls2 = Class.forName("android.app.IActivityManager");
                Field declaredField2 = cls2.getDeclaredField(str2);
                declaredField2.setAccessible(true);
                return declaredField2.getInt(cls2);
            } catch (Exception unused2) {
                unused2.printStackTrace();
                return -1;
            }
        }
    }

    /* renamed from: a */
    public final void mo20531a(String[] strArr) {
        try {
            mo20530a();
            new C3627a(strArr[0]).start();
            m11965a(strArr[1], false);
        } catch (Exception unused) {
            unused.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m11966a(String str, String str2, String str3, int i) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(Runtime.getRuntime().exec("sh").getOutputStream());
            dataOutputStream.writeBytes("export CLASSPATH=" + str + LINE_SEP);
            dataOutputStream.writeBytes("export _LD_LIBRARY_PATH=/system/lib/:/vendor/lib/ \n");
            dataOutputStream.writeBytes("exec /system/bin/app_process /system/bin  com.storm.keclean.keepalive.core.KMain " + str2 + " " + str3 + " " + i + "& \n");
            dataOutputStream.writeBytes("exit 100\n");
            dataOutputStream.flush();
        } catch (Exception unused) {
            unused.printStackTrace();
        }
    }

    /* renamed from: a */
    public static FileLock m11965a(String str, boolean z) {
        try {
            return new FileOutputStream(str, true).getChannel().lock();
        } catch (Exception unused) {
            unused.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m11967a(String str) {
        try {
            return new FileOutputStream(str, true).getChannel().tryLock() != null;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
