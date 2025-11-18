package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbms implements zzdti<Set<zzbuz<zzbrw>>> {

    /* renamed from: a */
    private final zzdtu<zzbmn> f23265a;

    /* renamed from: b */
    private final zzdtu<Executor> f23266b;

    /* renamed from: c */
    private final zzdtu<JSONObject> f23267c;

    private zzbms(zzdtu<zzbmn> zzdtuVar, zzdtu<Executor> zzdtuVar2, zzdtu<JSONObject> zzdtuVar3) {
        this.f23265a = zzdtuVar;
        this.f23266b = zzdtuVar2;
        this.f23267c = zzdtuVar3;
    }

    /* renamed from: a */
    public static zzbms m17901a(zzdtu<zzbmn> zzdtuVar, zzdtu<Executor> zzdtuVar2, zzdtu<JSONObject> zzdtuVar3) {
        return new zzbms(zzdtuVar, zzdtuVar2, zzdtuVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (Set) zzdto.m19874b(this.f23267c.get() == null ? Collections.emptySet() : Collections.singleton(new zzbuz(this.f23265a.get(), this.f23266b.get())), "Cannot return null from a non-@Nullable @Provides method");
    }
}
