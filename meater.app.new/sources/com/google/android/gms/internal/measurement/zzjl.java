package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzjl implements zzjm {

    /* renamed from: a */
    private static final zzcl<Boolean> f28265a;

    /* renamed from: b */
    private static final zzcl<Long> f28266b;

    static {
        zzcr zzcrVar = new zzcr(zzcm.m22118a("com.google.android.gms.measurement"));
        f28265a = zzcrVar.m22122d("measurement.service.disable_install_state_reporting", false);
        f28266b = zzcrVar.m22120b("measurement.id.service.disable_install_state_reporting", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzjm
    /* renamed from: a */
    public final boolean mo22427a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzjm
    /* renamed from: b */
    public final boolean mo22428b() {
        return f28265a.m22117n().booleanValue();
    }
}
