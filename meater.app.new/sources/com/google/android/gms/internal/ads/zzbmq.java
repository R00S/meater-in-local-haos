package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzbmq implements zzdti<zzbmn> {

    /* renamed from: a */
    private final zzdtu<zzaly> f23257a;

    /* renamed from: b */
    private final zzdtu<zzbml> f23258b;

    /* renamed from: c */
    private final zzdtu<Executor> f23259c;

    /* renamed from: d */
    private final zzdtu<zzbmg> f23260d;

    /* renamed from: e */
    private final zzdtu<Clock> f23261e;

    private zzbmq(zzdtu<zzaly> zzdtuVar, zzdtu<zzbml> zzdtuVar2, zzdtu<Executor> zzdtuVar3, zzdtu<zzbmg> zzdtuVar4, zzdtu<Clock> zzdtuVar5) {
        this.f23257a = zzdtuVar;
        this.f23258b = zzdtuVar2;
        this.f23259c = zzdtuVar3;
        this.f23260d = zzdtuVar4;
        this.f23261e = zzdtuVar5;
    }

    /* renamed from: a */
    public static zzbmq m17899a(zzdtu<zzaly> zzdtuVar, zzdtu<zzbml> zzdtuVar2, zzdtu<Executor> zzdtuVar3, zzdtu<zzbmg> zzdtuVar4, zzdtu<Clock> zzdtuVar5) {
        return new zzbmq(zzdtuVar, zzdtuVar2, zzdtuVar3, zzdtuVar4, zzdtuVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzbmn(this.f23257a.get(), this.f23258b.get(), this.f23259c.get(), this.f23260d.get(), this.f23261e.get());
    }
}
