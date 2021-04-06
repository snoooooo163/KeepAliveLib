package com.storm.keclean.keepalive.core;

import android.content.Intent;

/* compiled from: docleaner */
public class Service3 extends AbstractServiceC3630b {
    /* access modifiers changed from: protected */
    @Override // com.dkle.AbstractServiceC3630b
    /* renamed from: a */
    public Intent[] mo20538a() {
        return new Intent[]{new Intent(this, Service2.class), new Intent(this, Service1.class)};
    }

    /* access modifiers changed from: protected */
    @Override // com.dkle.AbstractServiceC3630b
    /* renamed from: b */
    public int[] mo20539b() {
        return new int[]{4, 2};
    }

    /* access modifiers changed from: protected */
    @Override // com.dkle.AbstractServiceC3630b
    /* renamed from: c */
    public int[] mo20540c() {
        return new int[]{5, 1};
    }

    /* access modifiers changed from: protected */
    @Override // com.dkle.AbstractServiceC3630b
    /* renamed from: d */
    public int[] mo20541d() {
        return new int[]{4, 5};
    }

    @Override // com.dkle.AbstractServiceC3630b
    public void onCreate() {
        super.onCreate();
    }
}
