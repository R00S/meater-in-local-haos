package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public class zzmy {

    /* renamed from: a */
    private int f26606a;

    /* renamed from: a */
    public void mo20292a() {
        this.f26606a = 0;
    }

    /* renamed from: b */
    public final void m20293b(int i2) {
        this.f26606a = i2;
    }

    /* renamed from: c */
    public final void m20294c(int i2) {
        this.f26606a |= Integer.MIN_VALUE;
    }

    /* renamed from: d */
    protected final boolean m20295d(int i2) {
        return (this.f26606a & i2) == i2;
    }

    /* renamed from: e */
    public final boolean m20296e() {
        return m20295d(Integer.MIN_VALUE);
    }

    /* renamed from: f */
    public final boolean m20297f() {
        return m20295d(4);
    }

    /* renamed from: g */
    public final boolean m20298g() {
        return m20295d(1);
    }
}
