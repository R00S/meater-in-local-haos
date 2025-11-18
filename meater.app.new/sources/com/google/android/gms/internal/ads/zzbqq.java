package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzbqq {
    /* renamed from: a */
    public static <T> zzbbh<T> m18273a(zzczt zzcztVar, zzbbh<zzcxu> zzbbhVar, zzblq zzblqVar, zzcmx<T> zzcmxVar) {
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21873t4)).booleanValue()) {
            return zzcztVar.m19099c(zzczs.RENDERER, zzbbhVar).m19109b(zzblqVar).m19109b(zzcmxVar).m19112f();
        }
        return zzcztVar.m19099c(zzczs.RENDERER, zzbbhVar).m19109b(zzblqVar).m19109b(zzcmxVar).m19108a(((Integer) zzyt.m20848e().m16421c(zzacu.f21879u4)).intValue(), TimeUnit.SECONDS).m19112f();
    }
}
