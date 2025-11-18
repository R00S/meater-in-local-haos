package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
public final class T6 implements U6 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC2610w3<Boolean> f33886a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC2610w3<Long> f33887b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC2610w3<Double> f33888c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC2610w3<Long> f33889d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC2610w3<Long> f33890e;

    /* renamed from: f, reason: collision with root package name */
    private static final AbstractC2610w3<String> f33891f;

    static {
        F3 f3E = new F3(C2586t3.a("com.google.android.gms.measurement")).f().e();
        f33886a = f3E.d("measurement.test.boolean_flag", false);
        f33887b = f3E.b("measurement.test.cached_long_flag", -1L);
        f33888c = f3E.a("measurement.test.double_flag", -3.0d);
        f33889d = f3E.b("measurement.test.int_flag", -2L);
        f33890e = f3E.b("measurement.test.long_flag", -1L);
        f33891f = f3E.c("measurement.test.string_flag", "---");
    }

    @Override // com.google.android.gms.internal.measurement.U6
    public final double a() {
        return f33888c.e().doubleValue();
    }

    @Override // com.google.android.gms.internal.measurement.U6
    public final long b() {
        return f33887b.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.U6
    public final long d() {
        return f33889d.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.U6
    public final long f() {
        return f33890e.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.U6
    public final String h() {
        return f33891f.e();
    }

    @Override // com.google.android.gms.internal.measurement.U6
    public final boolean i() {
        return f33886a.e().booleanValue();
    }
}
