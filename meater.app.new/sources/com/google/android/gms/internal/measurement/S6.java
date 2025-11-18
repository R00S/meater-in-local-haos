package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
public final class S6 implements P6 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC2610w3<Boolean> f33872a;

    static {
        F3 f3E = new F3(C2586t3.a("com.google.android.gms.measurement")).f().e();
        f3E.d("measurement.sdk.collection.enable_extend_user_property_size", true);
        f3E.d("measurement.sdk.collection.last_deep_link_referrer2", true);
        f33872a = f3E.d("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        f3E.b("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.P6
    public final boolean a() {
        return f33872a.e().booleanValue();
    }
}
