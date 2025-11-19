package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
final class Y2 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ C2749g f35223B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ S2 f35224C;

    Y2(S2 s22, C2749g c2749g) {
        this.f35223B = c2749g;
        this.f35224C = s22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35224C.f35164B.N0();
        if (this.f35223B.f35353D.f0() == null) {
            this.f35224C.f35164B.w(this.f35223B);
        } else {
            this.f35224C.f35164B.h0(this.f35223B);
        }
    }
}
