package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public final class zzcyw implements zzdti<zzbbl> {

    /* renamed from: a */
    private static final zzcyw f25356a = new zzcyw();

    /* renamed from: a */
    public static zzcyw m19086a() {
        return f25356a;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbbl) zzdto.m19874b(zzbbm.m17381a(Executors.newSingleThreadExecutor()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
