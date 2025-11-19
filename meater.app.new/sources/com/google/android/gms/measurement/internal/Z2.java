package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
final class Z2 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ C2749g f35239B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ E5 f35240C;

    /* renamed from: D, reason: collision with root package name */
    private final /* synthetic */ S2 f35241D;

    Z2(S2 s22, C2749g c2749g, E5 e52) {
        this.f35239B = c2749g;
        this.f35240C = e52;
        this.f35241D = s22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35241D.f35164B.N0();
        if (this.f35239B.f35353D.f0() == null) {
            this.f35241D.f35164B.x(this.f35239B, this.f35240C);
        } else {
            this.f35241D.f35164B.i0(this.f35239B, this.f35240C);
        }
    }
}
