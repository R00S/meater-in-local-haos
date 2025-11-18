package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzdag implements zzdti<zzdae> {

    /* renamed from: a */
    private final zzdtu<Executor> f25429a;

    /* renamed from: b */
    private final zzdtu<zzbah> f25430b;

    /* renamed from: c */
    private final zzdtu<zzcmu> f25431c;

    /* renamed from: d */
    private final zzdtu<zzbai> f25432d;

    /* renamed from: e */
    private final zzdtu<String> f25433e;

    /* renamed from: f */
    private final zzdtu<String> f25434f;

    /* renamed from: g */
    private final zzdtu<Context> f25435g;

    /* renamed from: h */
    private final zzdtu<Clock> f25436h;

    private zzdag(zzdtu<Executor> zzdtuVar, zzdtu<zzbah> zzdtuVar2, zzdtu<zzcmu> zzdtuVar3, zzdtu<zzbai> zzdtuVar4, zzdtu<String> zzdtuVar5, zzdtu<String> zzdtuVar6, zzdtu<Context> zzdtuVar7, zzdtu<Clock> zzdtuVar8) {
        this.f25429a = zzdtuVar;
        this.f25430b = zzdtuVar2;
        this.f25431c = zzdtuVar3;
        this.f25432d = zzdtuVar4;
        this.f25433e = zzdtuVar5;
        this.f25434f = zzdtuVar6;
        this.f25435g = zzdtuVar7;
        this.f25436h = zzdtuVar8;
    }

    /* renamed from: a */
    public static zzdag m19138a(zzdtu<Executor> zzdtuVar, zzdtu<zzbah> zzdtuVar2, zzdtu<zzcmu> zzdtuVar3, zzdtu<zzbai> zzdtuVar4, zzdtu<String> zzdtuVar5, zzdtu<String> zzdtuVar6, zzdtu<Context> zzdtuVar7, zzdtu<Clock> zzdtuVar8) {
        return new zzdag(zzdtuVar, zzdtuVar2, zzdtuVar3, zzdtuVar4, zzdtuVar5, zzdtuVar6, zzdtuVar7, zzdtuVar8);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzdae(this.f25429a.get(), this.f25430b.get(), this.f25431c.get(), this.f25432d.get(), this.f25433e.get(), this.f25434f.get(), this.f25435g.get(), this.f25436h.get());
    }
}
