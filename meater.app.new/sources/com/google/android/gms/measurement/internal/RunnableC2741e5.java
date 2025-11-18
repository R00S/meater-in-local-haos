package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.e5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2741e5 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ long f35340B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ C2727c5 f35341C;

    RunnableC2741e5(C2727c5 c2727c5, long j10) {
        this.f35340B = j10;
        this.f35341C = c2727c5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2727c5.E(this.f35341C, this.f35340B);
    }
}
