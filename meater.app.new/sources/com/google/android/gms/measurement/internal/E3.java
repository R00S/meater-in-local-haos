package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
final class E3 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ boolean f34802B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ C2843t3 f34803C;

    E3(C2843t3 c2843t3, boolean z10) {
        this.f34802B = z10;
        this.f34803C = c2843t3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zS = this.f34803C.f35457a.s();
        boolean zR = this.f34803C.f35457a.r();
        this.f34803C.f35457a.m(this.f34802B);
        if (zR == this.f34802B) {
            this.f34803C.f35457a.k().L().b("Default data collection state already set to", Boolean.valueOf(this.f34802B));
        }
        if (this.f34803C.f35457a.s() == zS || this.f34803C.f35457a.s() != this.f34803C.f35457a.r()) {
            this.f34803C.f35457a.k().N().c("Default data collection is different than actual status", Boolean.valueOf(this.f34802B), Boolean.valueOf(zS));
        }
        this.f34803C.Q0();
    }
}
