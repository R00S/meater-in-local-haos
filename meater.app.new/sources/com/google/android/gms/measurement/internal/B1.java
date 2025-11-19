package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
abstract class B1 extends Z1 {

    /* renamed from: b, reason: collision with root package name */
    private boolean f34751b;

    B1(P2 p22) {
        super(p22);
        this.f35457a.q();
    }

    public final void A() {
        if (this.f34751b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (y()) {
            return;
        }
        this.f35457a.p();
        this.f34751b = true;
    }

    public final void B() {
        if (this.f34751b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        C();
        this.f35457a.p();
        this.f34751b = true;
    }

    final boolean x() {
        return this.f34751b;
    }

    protected abstract boolean y();

    protected final void z() {
        if (!x()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    protected void C() {
    }
}
