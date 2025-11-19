package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
final class N implements P {

    /* renamed from: a, reason: collision with root package name */
    private final Z2 f33820a;

    /* renamed from: b, reason: collision with root package name */
    private final String f33821b;

    public N(Z2 z22, String str) {
        this.f33820a = z22;
        this.f33821b = str;
    }

    @Override // com.google.android.gms.internal.measurement.P
    public final Z2 a(InterfaceC2574s interfaceC2574s) {
        Z2 z2D = this.f33820a.d();
        z2D.f(this.f33821b, interfaceC2574s);
        return z2D;
    }
}
