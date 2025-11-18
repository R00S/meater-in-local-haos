package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
final class F0 implements InterfaceC2640a1 {

    /* renamed from: b, reason: collision with root package name */
    private static final L0 f34484b = new D0();

    /* renamed from: a, reason: collision with root package name */
    private final L0 f34485a;

    public F0() {
        C2660h0 c2660h0C = C2660h0.c();
        int i10 = W0.f34535d;
        E0 e02 = new E0(c2660h0C, f34484b);
        byte[] bArr = C2689r0.f34653b;
        this.f34485a = e02;
    }

    @Override // com.google.android.gms.internal.wearable.InterfaceC2640a1
    public final Z0 a(Class cls) {
        int i10 = C2643b1.f34555b;
        if (!AbstractC2672l0.class.isAssignableFrom(cls)) {
            int i11 = W0.f34535d;
        }
        K0 k0B = this.f34485a.b(cls);
        if (k0B.b()) {
            int i12 = W0.f34535d;
            return R0.i(C2643b1.r(), C2645c0.a(), k0B.a());
        }
        int i13 = W0.f34535d;
        return Q0.v(cls, k0B, T0.a(), B0.a(), C2643b1.r(), k0B.d() + (-1) != 1 ? C2645c0.a() : null, J0.a());
    }
}
