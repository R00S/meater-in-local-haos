package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.e3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2739e3 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ E5 f35338B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ S2 f35339C;

    RunnableC2739e3(S2 s22, E5 e52) {
        this.f35338B = e52;
        this.f35339C = s22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35339C.f35164B.N0();
        this.f35339C.f35164B.v0(this.f35338B);
    }
}
