package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcam implements zzdti<zzbuz<VideoController.VideoLifecycleCallbacks>> {

    /* renamed from: a */
    private final zzcag f23963a;

    /* renamed from: b */
    private final zzdtu<zzccw> f23964b;

    /* renamed from: c */
    private final zzdtu<Executor> f23965c;

    public zzcam(zzcag zzcagVar, zzdtu<zzccw> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        this.f23963a = zzcagVar;
        this.f23964b = zzdtuVar;
        this.f23965c = zzdtuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbuz) zzdto.m19874b(new zzbuz(this.f23964b.get(), this.f23965c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
