package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzmk implements zzmh {

    /* renamed from: a */
    private static final zzcl<Boolean> f28370a;

    /* renamed from: b */
    private static final zzcl<Boolean> f28371b;

    /* renamed from: c */
    private static final zzcl<Boolean> f28372c;

    static {
        zzcr zzcrVar = new zzcr(zzcm.m22118a("com.google.android.gms.measurement"));
        f28370a = zzcrVar.m22122d("measurement.service.sessions.remove_disabled_session_number", true);
        f28371b = zzcrVar.m22122d("measurement.service.sessions.session_number_enabled", true);
        f28372c = zzcrVar.m22122d("measurement.service.sessions.session_number_backfill_enabled", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzmh
    /* renamed from: a */
    public final boolean mo22537a() {
        return f28370a.m22117n().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmh
    /* renamed from: b */
    public final boolean mo22538b() {
        return f28371b.m22117n().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmh
    /* renamed from: c */
    public final boolean mo22539c() {
        return f28372c.m22117n().booleanValue();
    }
}
