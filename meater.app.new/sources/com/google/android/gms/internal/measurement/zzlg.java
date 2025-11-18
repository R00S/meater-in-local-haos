package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzlg implements zzld {

    /* renamed from: a */
    private static final zzcl<Boolean> f28322a;

    /* renamed from: b */
    private static final zzcl<Boolean> f28323b;

    /* renamed from: c */
    private static final zzcl<Boolean> f28324c;

    /* renamed from: d */
    private static final zzcl<Boolean> f28325d;

    static {
        zzcr zzcrVar = new zzcr(zzcm.m22118a("com.google.android.gms.measurement"));
        f28322a = zzcrVar.m22122d("measurement.sdk.collection.last_deep_link_referrer", false);
        f28323b = zzcrVar.m22122d("measurement.sdk.collection.last_deep_link_referrer_campaign", false);
        f28324c = zzcrVar.m22122d("measurement.sdk.collection.last_gclid_from_referrer", false);
        f28325d = zzcrVar.m22122d("measurement.sdk.collection.worker_thread_referrer", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzld
    /* renamed from: a */
    public final boolean mo22479a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzld
    /* renamed from: b */
    public final boolean mo22480b() {
        return f28322a.m22117n().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzld
    /* renamed from: c */
    public final boolean mo22481c() {
        return f28323b.m22117n().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzld
    /* renamed from: d */
    public final boolean mo22482d() {
        return f28324c.m22117n().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzld
    /* renamed from: e */
    public final boolean mo22483e() {
        return f28325d.m22117n().booleanValue();
    }
}
