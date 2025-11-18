package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.r0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2567r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC2567r0 f34281a;

    /* renamed from: b, reason: collision with root package name */
    static final AbstractC2567r0 f34282b;

    static {
        AbstractC2560q0 abstractC2560q0B = new C2488h0().e("").c(false).b(EnumC2583t0.ALL_CHECKS);
        EnumC2575s0 enumC2575s0 = EnumC2575s0.READ_AND_WRITE;
        f34281a = abstractC2560q0B.a(enumC2575s0).d();
        f34282b = new C2488h0().e("").c(false).b(EnumC2583t0.NO_CHECKS).a(enumC2575s0).d();
        new C2488h0().e("").c(false).b(EnumC2583t0.SKIP_COMPLIANCE_CHECK).a(enumC2575s0).d();
    }

    public abstract InterfaceC2480g0 a();

    public abstract InterfaceC2472f0 b();

    public abstract EnumC2583t0 c();

    public abstract EnumC2575s0 d();

    public abstract String e();

    public abstract boolean f();
}
