package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
final class X2 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ E5 f35204B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ S2 f35205C;

    X2(S2 s22, E5 e52) {
        this.f35204B = e52;
        this.f35205C = s22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35205C.f35164B.N0();
        this.f35205C.f35164B.r0(this.f35204B);
    }
}
