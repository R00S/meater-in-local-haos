package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzje implements zzjb {

    /* renamed from: a */
    private static final zzcl<Boolean> f28222a;

    /* renamed from: b */
    private static final zzcl<Long> f28223b;

    static {
        zzcr zzcrVar = new zzcr(zzcm.m22118a("com.google.android.gms.measurement"));
        f28222a = zzcrVar.m22122d("measurement.app_launch.event_ordering_fix", false);
        f28223b = zzcrVar.m22120b("measurement.id.app_launch.event_ordering_fix", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzjb
    /* renamed from: a */
    public final boolean mo22349a() {
        return f28222a.m22117n().booleanValue();
    }
}
