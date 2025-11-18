package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.u2 */
/* loaded from: classes2.dex */
abstract class AbstractC7833u2 extends C7744k3 {

    /* renamed from: b */
    private boolean f28930b;

    AbstractC7833u2(zzfx zzfxVar) {
        super(zzfxVar);
        this.f28874a.m23231d(this);
    }

    /* renamed from: A */
    protected abstract boolean mo22854A();

    /* renamed from: v */
    protected void mo22855v() {
    }

    /* renamed from: w */
    final boolean m22856w() {
        return this.f28930b;
    }

    /* renamed from: x */
    protected final void m22857x() {
        if (!m22856w()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: y */
    public final void m22858y() {
        if (this.f28930b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (mo22854A()) {
            return;
        }
        this.f28874a.m23240t();
        this.f28930b = true;
    }

    /* renamed from: z */
    public final void m22859z() {
        if (this.f28930b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        mo22855v();
        this.f28874a.m23240t();
        this.f28930b = true;
    }
}
