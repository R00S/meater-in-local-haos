package com.liulishuo.filedownloader.model;

import android.content.ContentValues;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import java.util.List;
import p241e.p307h.p308a.p315k0.C9036f;

/* compiled from: ConnectionModel.java */
/* renamed from: com.liulishuo.filedownloader.model.a */
/* loaded from: classes2.dex */
public class C8699a {

    /* renamed from: a */
    private int f33027a;

    /* renamed from: b */
    private int f33028b;

    /* renamed from: c */
    private long f33029c;

    /* renamed from: d */
    private long f33030d;

    /* renamed from: e */
    private long f33031e;

    /* renamed from: f */
    public static long m27585f(List<C8699a> list) {
        long jM27586a = 0;
        for (C8699a c8699a : list) {
            jM27586a += c8699a.m27586a() - c8699a.m27590e();
        }
        return jM27586a;
    }

    /* renamed from: a */
    public long m27586a() {
        return this.f33030d;
    }

    /* renamed from: b */
    public long m27587b() {
        return this.f33031e;
    }

    /* renamed from: c */
    public int m27588c() {
        return this.f33027a;
    }

    /* renamed from: d */
    public int m27589d() {
        return this.f33028b;
    }

    /* renamed from: e */
    public long m27590e() {
        return this.f33029c;
    }

    /* renamed from: g */
    public void m27591g(long j2) {
        this.f33030d = j2;
    }

    /* renamed from: h */
    public void m27592h(long j2) {
        this.f33031e = j2;
    }

    /* renamed from: i */
    public void m27593i(int i2) {
        this.f33027a = i2;
    }

    /* renamed from: j */
    public void m27594j(int i2) {
        this.f33028b = i2;
    }

    /* renamed from: k */
    public void m27595k(long j2) {
        this.f33029c = j2;
    }

    /* renamed from: l */
    public ContentValues m27596l() {
        ContentValues contentValues = new ContentValues();
        contentValues.put(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID, Integer.valueOf(this.f33027a));
        contentValues.put("connectionIndex", Integer.valueOf(this.f33028b));
        contentValues.put("startOffset", Long.valueOf(this.f33029c));
        contentValues.put("currentOffset", Long.valueOf(this.f33030d));
        contentValues.put("endOffset", Long.valueOf(this.f33031e));
        return contentValues;
    }

    public String toString() {
        return C9036f.m29009o("id[%d] index[%d] range[%d, %d) current offset(%d)", Integer.valueOf(this.f33027a), Integer.valueOf(this.f33028b), Long.valueOf(this.f33029c), Long.valueOf(this.f33031e), Long.valueOf(this.f33030d));
    }
}
