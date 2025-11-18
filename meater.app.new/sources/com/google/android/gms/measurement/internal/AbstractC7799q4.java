package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.q4 */
/* loaded from: classes2.dex */
abstract class AbstractC7799q4 extends C7808r4 {

    /* renamed from: b */
    private boolean f28836b;

    AbstractC7799q4(zzfx zzfxVar) {
        super(zzfxVar);
        this.f28874a.m23232i(this);
    }

    /* renamed from: o */
    protected void mo22806o() {
    }

    /* renamed from: p */
    protected final void m22807p() {
        if (!m22811t()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: q */
    public final void m22808q() {
        if (this.f28836b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (mo22810s()) {
            return;
        }
        this.f28874a.m23240t();
        this.f28836b = true;
    }

    /* renamed from: r */
    public final void m22809r() {
        if (this.f28836b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        mo22806o();
        this.f28874a.m23240t();
        this.f28836b = true;
    }

    /* renamed from: s */
    protected abstract boolean mo22810s();

    /* renamed from: t */
    final boolean m22811t() {
        return this.f28836b;
    }
}
