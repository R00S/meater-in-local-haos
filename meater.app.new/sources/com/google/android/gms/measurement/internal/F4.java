package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
final class F4 extends A {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ C2837s4 f34842e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    F4(C2837s4 c2837s4, InterfaceC2809o3 interfaceC2809o3) {
        super(interfaceC2809o3);
        this.f34842e = c2837s4;
    }

    @Override // com.google.android.gms.measurement.internal.A
    public final void d() {
        this.f34842e.k().M().a("Tasks have been queued for a long time");
    }
}
