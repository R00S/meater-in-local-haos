package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.f7 */
/* loaded from: classes2.dex */
abstract class AbstractC7703f7 extends C7721h7 {

    /* renamed from: c */
    private boolean f28640c;

    AbstractC7703f7(zzkc zzkcVar) {
        super(zzkcVar);
        this.f28693b.m23460s(this);
    }

    /* renamed from: s */
    final boolean m22777s() {
        return this.f28640c;
    }

    /* renamed from: t */
    protected final void m22778t() {
        if (!m22777s()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: u */
    public final void m22779u() {
        if (this.f28640c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        mo22757v();
        this.f28693b.m23454f0();
        this.f28640c = true;
    }

    /* renamed from: v */
    protected abstract boolean mo22757v();
}
