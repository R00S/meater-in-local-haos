package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzml implements zzmm {

    /* renamed from: a */
    private static final zzcl<Boolean> f28373a;

    /* renamed from: b */
    private static final zzcl<Boolean> f28374b;

    /* renamed from: c */
    private static final zzcl<Boolean> f28375c;

    /* renamed from: d */
    private static final zzcl<Boolean> f28376d;

    static {
        zzcr zzcrVar = new zzcr(zzcm.m22118a("com.google.android.gms.measurement"));
        f28373a = zzcrVar.m22122d("measurement.client.sessions.background_sessions_enabled", true);
        f28374b = zzcrVar.m22122d("measurement.client.sessions.immediate_start_enabled_foreground", true);
        f28375c = zzcrVar.m22122d("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        f28376d = zzcrVar.m22122d("measurement.client.sessions.session_id_enabled", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzmm
    /* renamed from: a */
    public final boolean mo22547a() {
        return f28373a.m22117n().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmm
    /* renamed from: b */
    public final boolean mo22548b() {
        return f28374b.m22117n().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmm
    /* renamed from: c */
    public final boolean mo22549c() {
        return f28375c.m22117n().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmm
    /* renamed from: d */
    public final boolean mo22550d() {
        return f28376d.m22117n().booleanValue();
    }
}
