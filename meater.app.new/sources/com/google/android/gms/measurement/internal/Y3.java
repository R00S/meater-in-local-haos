package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
final class Y3 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ C f35225B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ C2843t3 f35226C;

    Y3(C2843t3 c2843t3, C c10) {
        this.f35225B = c10;
        this.f35226C = c2843t3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f35226C.h().A(this.f35225B)) {
            this.f35226C.k().K().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(this.f35225B.a()));
            return;
        }
        this.f35226C.k().L().b("Setting DMA consent(FE)", this.f35225B);
        if (this.f35226C.v().o0()) {
            this.f35226C.v().j0();
        } else {
            this.f35226C.v().b0(false);
        }
    }
}
