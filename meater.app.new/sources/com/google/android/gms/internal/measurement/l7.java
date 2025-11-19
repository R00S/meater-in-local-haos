package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
public final class l7 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC2610w3<Boolean> f34202a;

    static {
        F3 f3E = new F3(C2586t3.a("com.google.android.gms.measurement")).f().e();
        f3E.d("measurement.client.sessions.background_sessions_enabled", true);
        f34202a = f3E.d("measurement.client.sessions.enable_fix_background_engagement", false);
        f3E.d("measurement.client.sessions.immediate_start_enabled_foreground", true);
        f3E.d("measurement.client.sessions.enable_pause_engagement_in_background", true);
        f3E.d("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        f3E.d("measurement.client.sessions.session_id_enabled", true);
        f3E.b("measurement.id.client.sessions.enable_fix_background_engagement", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.i7
    public final boolean a() {
        return f34202a.e().booleanValue();
    }
}
