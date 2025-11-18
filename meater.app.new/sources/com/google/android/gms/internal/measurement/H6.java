package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
public final class H6 implements I6 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC2610w3<Boolean> f33774a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC2610w3<Boolean> f33775b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC2610w3<Boolean> f33776c;

    static {
        F3 f3E = new F3(C2586t3.a("com.google.android.gms.measurement")).f().e();
        f3E.d("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f33774a = f3E.d("measurement.audience.refresh_event_count_filters_timestamp", false);
        f33775b = f3E.d("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f33776c = f3E.d("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // com.google.android.gms.internal.measurement.I6
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.I6
    public final boolean b() {
        return f33774a.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.I6
    public final boolean d() {
        return f33775b.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.I6
    public final boolean f() {
        return f33776c.e().booleanValue();
    }
}
