package com.google.android.gms.internal.ads;

import java.util.HashSet;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcxf implements zzdti<zzcvb<JSONObject>> {
    /* renamed from: a */
    public static zzcvb<JSONObject> m19015a(Object obj, zzcvu zzcvuVar, zzcwn zzcwnVar, zzdte<zzcvo> zzdteVar, zzdte<zzcvy> zzdteVar2, zzdte<zzcwc> zzdteVar3, zzdte<zzcwj> zzdteVar4, zzdte<zzcwq> zzdteVar5, zzdte<zzcwu> zzdteVar6, zzdte<zzcxh> zzdteVar7, Executor executor) {
        HashSet hashSet = new HashSet();
        hashSet.add((C6940mp) obj);
        hashSet.add(zzcvuVar);
        hashSet.add(zzcwnVar);
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21597A4)).booleanValue()) {
            hashSet.add(zzdteVar.get());
        }
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21603B4)).booleanValue()) {
            hashSet.add(zzdteVar2.get());
        }
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21609C4)).booleanValue()) {
            hashSet.add(zzdteVar3.get());
        }
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21615D4)).booleanValue()) {
            hashSet.add(zzdteVar4.get());
        }
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21633G4)).booleanValue()) {
            hashSet.add(zzdteVar5.get());
        }
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21645I4)).booleanValue()) {
            hashSet.add(zzdteVar6.get());
        }
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21651J4)).booleanValue()) {
            hashSet.add(zzdteVar7.get());
        }
        return (zzcvb) zzdto.m19874b(new zzcvb(executor, hashSet), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        throw new NoSuchMethodError();
    }
}
