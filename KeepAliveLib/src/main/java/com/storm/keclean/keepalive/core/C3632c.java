package com.storm.keclean.keepalive.core;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;

/* renamed from: com.dkle.c */
/* compiled from: docleaner */
public class C3632c {

    /* renamed from: a */
    public static String[] f9115a = new String[6];

    /* renamed from: b */
    public static String[] f9116b = new String[3];

    /* renamed from: a */
    public static String[] m11993a(Context context, int i, int i2) {
        if (TextUtils.isEmpty(f9115a[0])) {
            File filesDir = context.getFilesDir();
            int i3 = 0;
            while (true) {
                String[] strArr = f9115a;
                if (i3 >= strArr.length) {
                    break;
                }
                strArr[i3] = filesDir.getAbsolutePath() + "/lxke" + i3 + "xner";
                File file = new File(f9115a[i3]);
                if (!file.exists()) {
                    try {
                        file.createNewFile();
                    } catch (Exception unused) {
                    }
                }
                i3++;
            }
        }
        String[] strArr2 = f9115a;
        return new String[]{strArr2[i], strArr2[i2]};
    }

    /* renamed from: a */
    public static String m11992a(Context context, int i) {
        int i2 = 0;
        if (TextUtils.isEmpty(f9116b[0])) {
            File filesDir = context.getFilesDir();
            while (true) {
                String[] strArr = f9116b;
                if (i2 >= strArr.length) {
                    break;
                }
                strArr[i2] = filesDir.getAbsolutePath() + "/dlem" + i2 + "ne";
                File file = new File(f9116b[i2]);
                if (!file.exists()) {
                    try {
                        file.createNewFile();
                    } catch (Exception unused) {
                    }
                }
                i2++;
            }
        }
        return f9116b[i];
    }
}
