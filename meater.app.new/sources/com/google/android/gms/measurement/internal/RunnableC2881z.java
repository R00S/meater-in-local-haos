package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2881z implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ InterfaceC2809o3 f35777B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ A f35778C;

    RunnableC2881z(A a10, InterfaceC2809o3 interfaceC2809o3) {
        this.f35777B = interfaceC2809o3;
        this.f35778C = a10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35777B.f();
        if (C2742f.a()) {
            this.f35777B.o().E(this);
            return;
        }
        boolean zE = this.f35778C.e();
        this.f35778C.f34736c = 0L;
        if (zE) {
            this.f35778C.d();
        }
    }
}
