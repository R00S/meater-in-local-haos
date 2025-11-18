package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzbyl implements zzdti<zzbmy> {

    /* renamed from: a */
    private final zzdtu<zzty> f23773a;

    /* renamed from: b */
    private final zzdtu<Executor> f23774b;

    /* renamed from: c */
    private final zzdtu<Context> f23775c;

    /* renamed from: d */
    private final zzdtu<Clock> f23776d;

    public zzbyl(zzdtu<zzty> zzdtuVar, zzdtu<Executor> zzdtuVar2, zzdtu<Context> zzdtuVar3, zzdtu<Clock> zzdtuVar4) {
        this.f23773a = zzdtuVar;
        this.f23774b = zzdtuVar2;
        this.f23775c = zzdtuVar3;
        this.f23776d = zzdtuVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        zzty zztyVar = this.f23773a.get();
        Executor executor = this.f23774b.get();
        Context context = this.f23775c.get();
        return (zzbmy) zzdto.m19874b(new zzbmy(executor, new zzbml(context, zztyVar), this.f23776d.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
