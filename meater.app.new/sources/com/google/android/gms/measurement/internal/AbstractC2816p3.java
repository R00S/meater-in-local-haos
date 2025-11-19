package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.p3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2816p3 extends C2795m3 {

    /* renamed from: b, reason: collision with root package name */
    private boolean f35510b;

    AbstractC2816p3(P2 p22) {
        super(p22);
        this.f35457a.q();
    }

    protected final void q() {
        if (!t()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void r() {
        if (this.f35510b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (u()) {
            return;
        }
        this.f35457a.p();
        this.f35510b = true;
    }

    public final void s() {
        if (this.f35510b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        p();
        this.f35457a.p();
        this.f35510b = true;
    }

    final boolean t() {
        return this.f35510b;
    }

    protected abstract boolean u();

    protected void p() {
    }
}
