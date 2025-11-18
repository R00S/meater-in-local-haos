package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbmt implements zzdti<zzty> {

    /* renamed from: a */
    private final zzdtu<zzcxm> f23268a;

    /* renamed from: b */
    private final zzdtu<zzbai> f23269b;

    /* renamed from: c */
    private final zzdtu<JSONObject> f23270c;

    /* renamed from: d */
    private final zzdtu<String> f23271d;

    private zzbmt(zzdtu<zzcxm> zzdtuVar, zzdtu<zzbai> zzdtuVar2, zzdtu<JSONObject> zzdtuVar3, zzdtu<String> zzdtuVar4) {
        this.f23268a = zzdtuVar;
        this.f23269b = zzdtuVar2;
        this.f23270c = zzdtuVar3;
        this.f23271d = zzdtuVar4;
    }

    /* renamed from: a */
    public static zzbmt m17902a(zzdtu<zzcxm> zzdtuVar, zzdtu<zzbai> zzdtuVar2, zzdtu<JSONObject> zzdtuVar3, zzdtu<String> zzdtuVar4) {
        return new zzbmt(zzdtuVar, zzdtuVar2, zzdtuVar3, zzdtuVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        this.f23268a.get();
        zzbai zzbaiVar = this.f23269b.get();
        JSONObject jSONObject = this.f23270c.get();
        String str = this.f23271d.get();
        boolean zEquals = "native".equals(str);
        zzk.zzlg();
        return (zzty) zzdto.m19874b(new zzty(zzaxi.m17158j0(), zzbaiVar, str, jSONObject, false, zEquals), "Cannot return null from a non-@Nullable @Provides method");
    }
}
