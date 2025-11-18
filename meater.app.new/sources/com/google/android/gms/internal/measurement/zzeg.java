package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* loaded from: classes2.dex */
public abstract class zzeg {

    /* renamed from: a */
    int f28041a;

    /* renamed from: b */
    int f28042b;

    /* renamed from: c */
    private int f28043c;

    /* renamed from: d */
    C7625z1 f28044d;

    /* renamed from: e */
    private boolean f28045e;

    private zzeg() {
        this.f28042b = 100;
        this.f28043c = Integer.MAX_VALUE;
        this.f28045e = false;
    }

    /* renamed from: b */
    public static long m22159b(long j2) {
        return (-(j2 & 1)) ^ (j2 >>> 1);
    }

    /* renamed from: c */
    static zzeg m22160c(byte[] bArr, int i2, int i3, boolean z) {
        C7613x1 c7613x1 = new C7613x1(bArr, 0, i3, false);
        try {
            c7613x1.mo21457h(i3);
            return c7613x1;
        } catch (zzfo e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    /* renamed from: k */
    public static int m22161k(int i2) {
        return (-(i2 & 1)) ^ (i2 >>> 1);
    }

    /* renamed from: A */
    public abstract boolean mo21450A() throws IOException;

    /* renamed from: B */
    public abstract int mo21451B();

    /* renamed from: a */
    public abstract int mo21452a() throws IOException;

    /* renamed from: d */
    public abstract void mo21453d(int i2) throws zzfo;

    /* renamed from: e */
    public abstract double mo21454e() throws IOException;

    /* renamed from: f */
    public abstract boolean mo21455f(int i2) throws IOException;

    /* renamed from: g */
    public abstract float mo21456g() throws IOException;

    /* renamed from: h */
    public abstract int mo21457h(int i2) throws zzfo;

    /* renamed from: i */
    public abstract long mo21458i() throws IOException;

    /* renamed from: j */
    public abstract void mo21459j(int i2);

    /* renamed from: l */
    public abstract long mo21460l() throws IOException;

    /* renamed from: m */
    public abstract int mo21461m() throws IOException;

    /* renamed from: n */
    public abstract long mo21462n() throws IOException;

    /* renamed from: o */
    public abstract int mo21463o() throws IOException;

    /* renamed from: p */
    public abstract boolean mo21464p() throws IOException;

    /* renamed from: q */
    public abstract String mo21465q() throws IOException;

    /* renamed from: r */
    public abstract String mo21466r() throws IOException;

    /* renamed from: s */
    public abstract zzdu mo21467s() throws IOException;

    /* renamed from: t */
    public abstract int mo21468t() throws IOException;

    /* renamed from: u */
    public abstract int mo21469u() throws IOException;

    /* renamed from: v */
    public abstract int mo21470v() throws IOException;

    /* renamed from: w */
    public abstract long mo21471w() throws IOException;

    /* renamed from: x */
    public abstract int mo21472x() throws IOException;

    /* renamed from: y */
    public abstract long mo21473y() throws IOException;

    /* renamed from: z */
    abstract long mo21474z() throws IOException;
}
