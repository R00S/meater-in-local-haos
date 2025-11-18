package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
final class Z3 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ Boolean f35242B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ C2843t3 f35243C;

    Z3(C2843t3 c2843t3, Boolean bool) {
        this.f35242B = bool;
        this.f35243C = c2843t3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35243C.f0(this.f35242B, true);
    }
}
