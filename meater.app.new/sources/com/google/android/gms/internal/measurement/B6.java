package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
public final class B6 implements C6 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC2610w3<Boolean> f33672a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC2610w3<Boolean> f33673b;

    static {
        F3 f3E = new F3(C2586t3.a("com.google.android.gms.measurement")).f().e();
        f33672a = f3E.d("measurement.set_default_event_parameters_propagate_clear.client.dev", false);
        f33673b = f3E.d("measurement.set_default_event_parameters_propagate_clear.service", false);
        f3E.b("measurement.id.set_default_event_parameters_propagate_clear.experiment_id", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.C6
    public final boolean a() {
        return f33672a.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.C6
    public final boolean b() {
        return f33673b.e().booleanValue();
    }
}
