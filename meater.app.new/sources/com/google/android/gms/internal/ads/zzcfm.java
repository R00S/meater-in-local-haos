package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzcfm implements zzdti<zzcfk> {

    /* renamed from: a */
    private final zzdtu<zzcfi> f24225a;

    /* renamed from: b */
    private final zzdtu<Set<C6785ii>> f24226b;

    /* renamed from: c */
    private final zzdtu<Clock> f24227c;

    private zzcfm(zzdtu<zzcfi> zzdtuVar, zzdtu<Set<C6785ii>> zzdtuVar2, zzdtu<Clock> zzdtuVar3) {
        this.f24225a = zzdtuVar;
        this.f24226b = zzdtuVar2;
        this.f24227c = zzdtuVar3;
    }

    /* renamed from: a */
    public static zzcfm m18733a(zzdtu<zzcfi> zzdtuVar, zzdtu<Set<C6785ii>> zzdtuVar2, zzdtu<Clock> zzdtuVar3) {
        return new zzcfm(zzdtuVar, zzdtuVar2, zzdtuVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcfk(this.f24225a.get(), this.f24226b.get(), this.f24227c.get());
    }
}
