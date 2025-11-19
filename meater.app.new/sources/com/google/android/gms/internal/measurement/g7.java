package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
public final class g7 implements h7 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC2610w3<Boolean> f34132a;

    static {
        F3 f3E = new F3(C2586t3.a("com.google.android.gms.measurement")).f().e();
        f3E.d("measurement.collection.enable_session_stitching_token.client.dev", true);
        f3E.d("measurement.collection.enable_session_stitching_token.first_open_fix", true);
        f34132a = f3E.d("measurement.session_stitching_token_enabled", false);
        f3E.d("measurement.link_sst_to_sid", true);
    }

    @Override // com.google.android.gms.internal.measurement.h7
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.h7
    public final boolean b() {
        return f34132a.e().booleanValue();
    }
}
