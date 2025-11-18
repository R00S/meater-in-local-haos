package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcji {

    /* renamed from: a */
    private int f24391a = 0;

    /* renamed from: b */
    private long f24392b = 0;

    /* renamed from: c */
    private long f24393c = 0;

    /* renamed from: d */
    private long f24394d = 0;

    /* renamed from: e */
    private final Object f24395e = new Object();

    /* renamed from: f */
    private final Object f24396f = new Object();

    /* renamed from: g */
    private final Object f24397g = new Object();

    /* renamed from: h */
    private final Object f24398h = new Object();

    /* renamed from: a */
    public final int m18820a() {
        int i2;
        synchronized (this.f24395e) {
            i2 = this.f24391a;
        }
        return i2;
    }

    /* renamed from: b */
    public final long m18821b() {
        long j2;
        synchronized (this.f24396f) {
            j2 = this.f24392b;
        }
        return j2;
    }

    /* renamed from: c */
    public final synchronized long m18822c() {
        long j2;
        synchronized (this.f24397g) {
            j2 = this.f24393c;
        }
        return j2;
    }

    /* renamed from: d */
    public final synchronized long m18823d() {
        long j2;
        synchronized (this.f24398h) {
            j2 = this.f24394d;
        }
        return j2;
    }

    /* renamed from: e */
    public final void m18824e(int i2) {
        synchronized (this.f24395e) {
            this.f24391a = i2;
        }
    }

    /* renamed from: f */
    public final void m18825f(long j2) {
        synchronized (this.f24396f) {
            this.f24392b = j2;
        }
    }

    /* renamed from: g */
    public final synchronized void m18826g(long j2) {
        synchronized (this.f24398h) {
            this.f24394d = j2;
        }
    }

    /* renamed from: h */
    public final synchronized void m18827h(long j2) {
        synchronized (this.f24397g) {
            this.f24393c = j2;
        }
    }
}
