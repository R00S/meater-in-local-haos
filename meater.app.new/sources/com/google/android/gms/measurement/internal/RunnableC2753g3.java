package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.g3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2753g3 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ J f35362B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ E5 f35363C;

    /* renamed from: D, reason: collision with root package name */
    private final /* synthetic */ S2 f35364D;

    RunnableC2753g3(S2 s22, J j10, E5 e52) {
        this.f35362B = j10;
        this.f35363C = e52;
        this.f35364D = s22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35364D.E1(this.f35364D.A1(this.f35362B, this.f35363C), this.f35363C);
    }
}
