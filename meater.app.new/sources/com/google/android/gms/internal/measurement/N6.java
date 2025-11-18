package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
public final class N6 implements O6 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC2610w3<Boolean> f33824a;

    static {
        F3 f3E = new F3(C2586t3.a("com.google.android.gms.measurement")).f().e();
        f3E.d("measurement.gmscore_feature_tracking", true);
        f33824a = f3E.d("measurement.gmscore_client_telemetry", false);
    }

    @Override // com.google.android.gms.internal.measurement.O6
    public final boolean a() {
        return f33824a.e().booleanValue();
    }
}
