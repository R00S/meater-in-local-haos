package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
public final class A6 implements InterfaceC2613w6 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC2610w3<Boolean> f33659a;

    static {
        F3 f3E = new F3(C2586t3.a("com.google.android.gms.measurement")).f().e();
        f3E.d("measurement.set_default_event_parameters_with_backfill.client.dev", false);
        f3E.d("measurement.defensively_copy_bundles_validate_default_params", true);
        f3E.d("measurement.set_default_event_parameters_with_backfill.service", true);
        f33659a = f3E.d("measurement.set_default_event_parameters.fix_deferred_analytics_collection", false);
        f3E.b("measurement.id.set_default_event_parameters.fix_deferred_analytics_collection", 0L);
        f3E.d("measurement.set_default_event_parameters.fix_subsequent_launches", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2613w6
    public final boolean a() {
        return f33659a.e().booleanValue();
    }
}
