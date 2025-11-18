package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzjw implements zzjt {

    /* renamed from: a */
    private static final zzcl<Boolean> f28277a;

    /* renamed from: b */
    private static final zzcl<Long> f28278b;

    static {
        zzcr zzcrVar = new zzcr(zzcm.m22118a("com.google.android.gms.measurement"));
        f28277a = zzcrVar.m22122d("measurement.upload_dsid_enabled", false);
        f28278b = zzcrVar.m22120b("measurement.id.upload_dsid_enabled", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzjt
    /* renamed from: a */
    public final boolean mo22433a() {
        return f28277a.m22117n().booleanValue();
    }
}
