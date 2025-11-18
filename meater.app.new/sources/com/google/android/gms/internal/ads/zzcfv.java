package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcfv implements zzdti<Set<zzbuz<AppEventListener>>> {

    /* renamed from: a */
    private final zzcfp f24245a;

    /* renamed from: b */
    private final zzdtu<zzcfz> f24246b;

    /* renamed from: c */
    private final zzdtu<Executor> f24247c;

    private zzcfv(zzcfp zzcfpVar, zzdtu<zzcfz> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        this.f24245a = zzcfpVar;
        this.f24246b = zzdtuVar;
        this.f24247c = zzdtuVar2;
    }

    /* renamed from: a */
    public static zzcfv m18751a(zzcfp zzcfpVar, zzdtu<zzcfz> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        return new zzcfv(zzcfpVar, zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (Set) zzdto.m19874b(zzcfp.m18736b(this.f24246b.get(), this.f24247c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
