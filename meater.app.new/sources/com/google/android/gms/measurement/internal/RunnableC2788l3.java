package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.l3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2788l3 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ P5 f35436B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ E5 f35437C;

    /* renamed from: D, reason: collision with root package name */
    private final /* synthetic */ S2 f35438D;

    RunnableC2788l3(S2 s22, P5 p52, E5 e52) {
        this.f35436B = p52;
        this.f35437C = e52;
        this.f35438D = s22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35438D.f35164B.N0();
        if (this.f35436B.f0() == null) {
            this.f35438D.f35164B.O(this.f35436B.f35129C, this.f35437C);
        } else {
            this.f35438D.f35164B.E(this.f35436B, this.f35437C);
        }
    }
}
