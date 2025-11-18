package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbmv implements zzdti<Set<zzbuz<zzbrx>>> {

    /* renamed from: a */
    private final zzdtu<zzbmn> f23273a;

    /* renamed from: b */
    private final zzdtu<Executor> f23274b;

    /* renamed from: c */
    private final zzdtu<JSONObject> f23275c;

    private zzbmv(zzdtu<zzbmn> zzdtuVar, zzdtu<Executor> zzdtuVar2, zzdtu<JSONObject> zzdtuVar3) {
        this.f23273a = zzdtuVar;
        this.f23274b = zzdtuVar2;
        this.f23275c = zzdtuVar3;
    }

    /* renamed from: a */
    public static zzbmv m17904a(zzdtu<zzbmn> zzdtuVar, zzdtu<Executor> zzdtuVar2, zzdtu<JSONObject> zzdtuVar3) {
        return new zzbmv(zzdtuVar, zzdtuVar2, zzdtuVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (Set) zzdto.m19874b(this.f23275c.get() == null ? Collections.emptySet() : Collections.singleton(new zzbuz(this.f23273a.get(), this.f23274b.get())), "Cannot return null from a non-@Nullable @Provides method");
    }
}
