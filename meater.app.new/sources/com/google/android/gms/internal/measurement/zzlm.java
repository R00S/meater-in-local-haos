package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzlm implements zzlj {

    /* renamed from: a */
    private static final zzcl<Boolean> f28333a;

    /* renamed from: b */
    private static final zzcl<Boolean> f28334b;

    static {
        zzcr zzcrVar = new zzcr(zzcm.m22118a("com.google.android.gms.measurement"));
        f28333a = zzcrVar.m22122d("measurement.personalized_ads_signals_collection_enabled", true);
        f28334b = zzcrVar.m22122d("measurement.personalized_ads_property_translation_enabled", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzlj
    /* renamed from: a */
    public final boolean mo22495a() {
        return f28333a.m22117n().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzlj
    /* renamed from: b */
    public final boolean mo22496b() {
        return f28334b.m22117n().booleanValue();
    }
}
