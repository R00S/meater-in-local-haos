package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
final class Q2 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ C2836s3 f35135B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ P2 f35136C;

    Q2(P2 p22, C2836s3 c2836s3) {
        this.f35135B = c2836s3;
        this.f35136C = p22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        P2.h(this.f35136C, this.f35135B);
        this.f35136C.d(this.f35135B.f35627g);
    }
}
