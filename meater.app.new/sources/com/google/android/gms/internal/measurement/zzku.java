package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzku implements zzkr {

    /* renamed from: a */
    private static final zzcl<Boolean> f28309a;

    /* renamed from: b */
    private static final zzcl<Boolean> f28310b;

    static {
        zzcr zzcrVar = new zzcr(zzcm.m22118a("com.google.android.gms.measurement"));
        f28309a = zzcrVar.m22122d("measurement.collection.efficient_engagement_reporting_enabled", false);
        f28310b = zzcrVar.m22122d("measurement.collection.redundant_engagement_removal_enabled", false);
    }

    @Override // com.google.android.gms.internal.measurement.zzkr
    /* renamed from: a */
    public final boolean mo22467a() {
        return f28309a.m22117n().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzkr
    /* renamed from: b */
    public final boolean mo22468b() {
        return f28310b.m22117n().booleanValue();
    }
}
