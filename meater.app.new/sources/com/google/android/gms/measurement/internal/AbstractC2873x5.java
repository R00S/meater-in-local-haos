package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.x5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2873x5 extends C2825q5 {

    /* renamed from: c, reason: collision with root package name */
    private boolean f35715c;

    AbstractC2873x5(C2880y5 c2880y5) {
        super(c2880y5);
        this.f35538b.Q0();
    }

    protected final void v() {
        if (!x()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void w() {
        if (this.f35715c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        y();
        this.f35538b.P0();
        this.f35715c = true;
    }

    final boolean x() {
        return this.f35715c;
    }

    protected abstract boolean y();
}
