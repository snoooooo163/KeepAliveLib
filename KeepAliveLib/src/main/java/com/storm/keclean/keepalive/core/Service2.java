package com.storm.keclean.keepalive.core;

import android.content.Intent;
import android.os.Build;



/* compiled from: docleaner */
public class Service2 extends AbstractServiceC3630b {
    /* access modifiers changed from: protected */
    @Override // com.dkle.AbstractServiceC3630b
    /* renamed from: a */
    public Intent[] mo20538a() {
        return new Intent[]{new Intent(this, Service1.class), new Intent(this, Service3.class)};
    }

    /* access modifiers changed from: protected */
    @Override // com.dkle.AbstractServiceC3630b
    /* renamed from: b */
    public int[] mo20539b() {
        return new int[]{2, 4};
    }

    /* access modifiers changed from: protected */
    @Override // com.dkle.AbstractServiceC3630b
    /* renamed from: c */
    public int[] mo20540c() {
        return new int[]{3, 0};
    }

    /* access modifiers changed from: protected */
    @Override // com.dkle.AbstractServiceC3630b
    /* renamed from: d */
    public int[] mo20541d() {
        return new int[]{2, 3};
    }

    @Override // com.dkle.AbstractServiceC3630b
    public void onCreate() {
        super.onCreate();
    }
}
