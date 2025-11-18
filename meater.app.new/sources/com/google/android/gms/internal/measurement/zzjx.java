package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzjx implements zzjy {

    /* renamed from: a */
    private static final zzcl<Boolean> f28279a;

    /* renamed from: b */
    private static final zzcl<Boolean> f28280b;

    /* renamed from: c */
    private static final zzcl<Boolean> f28281c;

    /* renamed from: d */
    private static final zzcl<Long> f28282d;

    static {
        zzcr zzcrVar = new zzcr(zzcm.m22118a("com.google.android.gms.measurement"));
        f28279a = zzcrVar.m22122d("measurement.sdk.dynamite.allow_remote_dynamite", false);
        f28280b = zzcrVar.m22122d("measurement.collection.init_params_control_enabled", true);
        f28281c = zzcrVar.m22122d("measurement.sdk.dynamite.use_dynamite2", false);
        f28282d = zzcrVar.m22120b("measurement.id.sdk.dynamite.use_dynamite", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzjy
    /* renamed from: a */
    public final boolean mo22438a() {
        return f28279a.m22117n().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzjy
    /* renamed from: b */
    public final boolean mo22439b() {
        return f28280b.m22117n().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzjy
    /* renamed from: c */
    public final boolean mo22440c() {
        return f28281c.m22117n().booleanValue();
    }
}
