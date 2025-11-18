package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.r5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2831r5 extends A {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ C2811o5 f35594e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2831r5(C2811o5 c2811o5, InterfaceC2809o3 interfaceC2809o3) {
        super(interfaceC2809o3);
        this.f35594e = c2811o5;
    }

    @Override // com.google.android.gms.measurement.internal.A
    public final void d() {
        this.f35594e.A();
        this.f35594e.k().L().a("Starting upload from DelayedRunnable");
        this.f35594e.f35538b.S0();
    }
}
