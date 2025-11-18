package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzlh implements zzli {

    /* renamed from: a */
    private static final zzcl<Boolean> f28326a;

    /* renamed from: b */
    private static final zzcl<Boolean> f28327b;

    /* renamed from: c */
    private static final zzcl<Boolean> f28328c;

    static {
        zzcr zzcrVar = new zzcr(zzcm.m22118a("com.google.android.gms.measurement"));
        f28326a = zzcrVar.m22122d("measurement.lifecycle.app_backgrounded_engagement", false);
        f28327b = zzcrVar.m22122d("measurement.lifecycle.app_backgrounded_tracking", false);
        f28328c = zzcrVar.m22122d("measurement.lifecycle.app_in_background_parameter", false);
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    /* renamed from: a */
    public final boolean mo22492a() {
        return f28326a.m22117n().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    /* renamed from: b */
    public final boolean mo22493b() {
        return f28327b.m22117n().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    /* renamed from: c */
    public final boolean mo22494c() {
        return f28328c.m22117n().booleanValue();
    }
}
