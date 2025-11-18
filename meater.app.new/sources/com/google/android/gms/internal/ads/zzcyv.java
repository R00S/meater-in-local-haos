package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcyv implements zzdti<Executor> {

    /* renamed from: a */
    private static final zzcyv f25355a = new zzcyv();

    /* renamed from: a */
    public static zzcyv m19085a() {
        return f25355a;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (Executor) zzdto.m19874b(zzbbm.f22757a, "Cannot return null from a non-@Nullable @Provides method");
    }
}
