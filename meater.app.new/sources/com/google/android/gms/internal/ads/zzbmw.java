package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbmw implements zzdti<Set<zzbuz<zzue>>> {

    /* renamed from: a */
    private final zzdtu<zzbmn> f23276a;

    /* renamed from: b */
    private final zzdtu<Executor> f23277b;

    /* renamed from: c */
    private final zzdtu<JSONObject> f23278c;

    private zzbmw(zzdtu<zzbmn> zzdtuVar, zzdtu<Executor> zzdtuVar2, zzdtu<JSONObject> zzdtuVar3) {
        this.f23276a = zzdtuVar;
        this.f23277b = zzdtuVar2;
        this.f23278c = zzdtuVar3;
    }

    /* renamed from: a */
    public static zzbmw m17905a(zzdtu<zzbmn> zzdtuVar, zzdtu<Executor> zzdtuVar2, zzdtu<JSONObject> zzdtuVar3) {
        return new zzbmw(zzdtuVar, zzdtuVar2, zzdtuVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (Set) zzdto.m19874b(this.f23278c.get() == null ? Collections.emptySet() : Collections.singleton(new zzbuz(this.f23276a.get(), this.f23277b.get())), "Cannot return null from a non-@Nullable @Provides method");
    }
}
