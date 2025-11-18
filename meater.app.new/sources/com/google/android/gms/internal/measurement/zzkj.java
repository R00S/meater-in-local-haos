package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzkj implements zzkk {

    /* renamed from: a */
    private static final zzcl<Boolean> f28296a;

    /* renamed from: b */
    private static final zzcl<Long> f28297b;

    static {
        zzcr zzcrVar = new zzcr(zzcm.m22118a("com.google.android.gms.measurement"));
        f28296a = zzcrVar.m22122d("measurement.service.fix_gmp_version", false);
        f28297b = zzcrVar.m22120b("measurement.id.service.fix_gmp_version", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzkk
    /* renamed from: a */
    public final boolean mo22455a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzkk
    /* renamed from: b */
    public final boolean mo22456b() {
        return f28296a.m22117n().booleanValue();
    }
}
