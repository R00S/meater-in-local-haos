package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbyj implements zzdti<zzty> {

    /* renamed from: a */
    private final zzdtu<zzbai> f23769a;

    /* renamed from: b */
    private final zzdtu<String> f23770b;

    public zzbyj(zzdtu<zzbai> zzdtuVar, zzdtu<String> zzdtuVar2) {
        this.f23769a = zzdtuVar;
        this.f23770b = zzdtuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        zzbai zzbaiVar = this.f23769a.get();
        String str = this.f23770b.get();
        zzk.zzlg();
        return (zzty) zzdto.m19874b(new zzty(zzaxi.m17158j0(), zzbaiVar, str, new JSONObject(), false, true), "Cannot return null from a non-@Nullable @Provides method");
    }
}
