package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbmx implements zzdti<Set<zzbuz<com.google.android.gms.ads.internal.overlay.zzo>>> {

    /* renamed from: a */
    private final zzdtu<zzbmn> f23279a;

    /* renamed from: b */
    private final zzdtu<Executor> f23280b;

    /* renamed from: c */
    private final zzdtu<JSONObject> f23281c;

    private zzbmx(zzdtu<zzbmn> zzdtuVar, zzdtu<Executor> zzdtuVar2, zzdtu<JSONObject> zzdtuVar3) {
        this.f23279a = zzdtuVar;
        this.f23280b = zzdtuVar2;
        this.f23281c = zzdtuVar3;
    }

    /* renamed from: a */
    public static zzbmx m17906a(zzdtu<zzbmn> zzdtuVar, zzdtu<Executor> zzdtuVar2, zzdtu<JSONObject> zzdtuVar3) {
        return new zzbmx(zzdtuVar, zzdtuVar2, zzdtuVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (Set) zzdto.m19874b(this.f23281c.get() == null ? Collections.emptySet() : Collections.singleton(new zzbuz(this.f23279a.get(), this.f23280b.get())), "Cannot return null from a non-@Nullable @Provides method");
    }
}
