package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
final class A5 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ K5 f34742B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ C2880y5 f34743C;

    A5(C2880y5 c2880y5, K5 k52) {
        this.f34742B = k52;
        this.f34743C = c2880y5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2880y5.C(this.f34743C, this.f34742B);
        this.f34743C.R0();
    }
}
