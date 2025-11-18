package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* loaded from: classes2.dex */
public final class zzbxh implements zzdti<zzbxg> {

    /* renamed from: a */
    private final zzdtu<zzavf> f23687a;

    /* renamed from: b */
    private final zzdtu<Context> f23688b;

    /* renamed from: c */
    private final zzdtu<zzavg> f23689c;

    /* renamed from: d */
    private final zzdtu<View> f23690d;

    /* renamed from: e */
    private final zzdtu<Integer> f23691e;

    private zzbxh(zzdtu<zzavf> zzdtuVar, zzdtu<Context> zzdtuVar2, zzdtu<zzavg> zzdtuVar3, zzdtu<View> zzdtuVar4, zzdtu<Integer> zzdtuVar5) {
        this.f23687a = zzdtuVar;
        this.f23688b = zzdtuVar2;
        this.f23689c = zzdtuVar3;
        this.f23690d = zzdtuVar4;
        this.f23691e = zzdtuVar5;
    }

    /* renamed from: a */
    public static zzbxh m18429a(zzdtu<zzavf> zzdtuVar, zzdtu<Context> zzdtuVar2, zzdtu<zzavg> zzdtuVar3, zzdtu<View> zzdtuVar4, zzdtu<Integer> zzdtuVar5) {
        return new zzbxh(zzdtuVar, zzdtuVar2, zzdtuVar3, zzdtuVar4, zzdtuVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzbxg(this.f23687a.get(), this.f23688b.get(), this.f23689c.get(), this.f23690d.get(), this.f23691e.get().intValue());
    }
}
