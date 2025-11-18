package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzls implements zzlp {

    /* renamed from: a */
    private static final zzcl<Boolean> f28340a;

    /* renamed from: b */
    private static final zzcl<Double> f28341b;

    /* renamed from: c */
    private static final zzcl<Long> f28342c;

    /* renamed from: d */
    private static final zzcl<Long> f28343d;

    /* renamed from: e */
    private static final zzcl<String> f28344e;

    static {
        zzcr zzcrVar = new zzcr(zzcm.m22118a("com.google.android.gms.measurement"));
        f28340a = zzcrVar.m22122d("measurement.test.boolean_flag", false);
        f28341b = zzcrVar.m22119a("measurement.test.double_flag", -3.0d);
        f28342c = zzcrVar.m22120b("measurement.test.int_flag", -2L);
        f28343d = zzcrVar.m22120b("measurement.test.long_flag", -1L);
        f28344e = zzcrVar.m22121c("measurement.test.string_flag", "---");
    }

    @Override // com.google.android.gms.internal.measurement.zzlp
    /* renamed from: a */
    public final boolean mo22501a() {
        return f28340a.m22117n().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzlp
    /* renamed from: b */
    public final double mo22502b() {
        return f28341b.m22117n().doubleValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzlp
    /* renamed from: c */
    public final long mo22503c() {
        return f28342c.m22117n().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzlp
    /* renamed from: d */
    public final long mo22504d() {
        return f28343d.m22117n().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzlp
    /* renamed from: e */
    public final String mo22505e() {
        return f28344e.m22117n();
    }
}
