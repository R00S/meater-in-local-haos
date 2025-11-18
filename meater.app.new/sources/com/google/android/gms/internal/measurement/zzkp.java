package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzkp implements zzkq {

    /* renamed from: a */
    private static final zzcl<Boolean> f28303a;

    /* renamed from: b */
    private static final zzcl<Boolean> f28304b;

    static {
        zzcr zzcrVar = new zzcr(zzcm.m22118a("com.google.android.gms.measurement"));
        f28303a = zzcrVar.m22122d("measurement.client.sessions.check_on_startup", true);
        f28304b = zzcrVar.m22122d("measurement.client.sessions.start_session_before_view_screen", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzkq
    /* renamed from: a */
    public final boolean mo22464a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq
    /* renamed from: b */
    public final boolean mo22465b() {
        return f28303a.m22117n().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzkq
    /* renamed from: c */
    public final boolean mo22466c() {
        return f28304b.m22117n().booleanValue();
    }
}
