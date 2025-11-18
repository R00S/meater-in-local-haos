package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzcgy implements zzdti<zzbbh<zzarx>> {

    /* renamed from: a */
    private final zzdtu<zzczt> f24286a;

    /* renamed from: b */
    private final zzdtu<zzbbh<Bundle>> f24287b;

    /* renamed from: c */
    private final zzdtu<zzbai> f24288c;

    /* renamed from: d */
    private final zzdtu<ApplicationInfo> f24289d;

    /* renamed from: e */
    private final zzdtu<String> f24290e;

    /* renamed from: f */
    private final zzdtu<List<String>> f24291f;

    /* renamed from: g */
    private final zzdtu<PackageInfo> f24292g;

    /* renamed from: h */
    private final zzdtu<zzbbh<String>> f24293h;

    /* renamed from: i */
    private final zzdtu<zzaxb> f24294i;

    /* renamed from: j */
    private final zzdtu<String> f24295j;

    private zzcgy(zzdtu<zzczt> zzdtuVar, zzdtu<zzbbh<Bundle>> zzdtuVar2, zzdtu<zzbai> zzdtuVar3, zzdtu<ApplicationInfo> zzdtuVar4, zzdtu<String> zzdtuVar5, zzdtu<List<String>> zzdtuVar6, zzdtu<PackageInfo> zzdtuVar7, zzdtu<zzbbh<String>> zzdtuVar8, zzdtu<zzaxb> zzdtuVar9, zzdtu<String> zzdtuVar10) {
        this.f24286a = zzdtuVar;
        this.f24287b = zzdtuVar2;
        this.f24288c = zzdtuVar3;
        this.f24289d = zzdtuVar4;
        this.f24290e = zzdtuVar5;
        this.f24291f = zzdtuVar6;
        this.f24292g = zzdtuVar7;
        this.f24293h = zzdtuVar8;
        this.f24294i = zzdtuVar9;
        this.f24295j = zzdtuVar10;
    }

    /* renamed from: a */
    public static zzcgy m18780a(zzdtu<zzczt> zzdtuVar, zzdtu<zzbbh<Bundle>> zzdtuVar2, zzdtu<zzbai> zzdtuVar3, zzdtu<ApplicationInfo> zzdtuVar4, zzdtu<String> zzdtuVar5, zzdtu<List<String>> zzdtuVar6, zzdtu<PackageInfo> zzdtuVar7, zzdtu<zzbbh<String>> zzdtuVar8, zzdtu<zzaxb> zzdtuVar9, zzdtu<String> zzdtuVar10) {
        return new zzcgy(zzdtuVar, zzdtuVar2, zzdtuVar3, zzdtuVar4, zzdtuVar5, zzdtuVar6, zzdtuVar7, zzdtuVar8, zzdtuVar9, zzdtuVar10);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        zzczt zzcztVar = this.f24286a.get();
        final zzbbh<Bundle> zzbbhVar = this.f24287b.get();
        final zzbai zzbaiVar = this.f24288c.get();
        final ApplicationInfo applicationInfo = this.f24289d.get();
        final String str = this.f24290e.get();
        final List<String> list = this.f24291f.get();
        final PackageInfo packageInfo = this.f24292g.get();
        final zzbbh<String> zzbbhVar2 = this.f24293h.get();
        final zzaxb zzaxbVar = this.f24294i.get();
        final String str2 = this.f24295j.get();
        return (zzbbh) zzdto.m19874b(zzcztVar.m19098b(zzczs.REQUEST_PARCEL, zzbbhVar, zzbbhVar2).m19102a(new Callable(zzbbhVar, zzbaiVar, applicationInfo, str, list, packageInfo, zzbbhVar2, zzaxbVar, str2) { // from class: com.google.android.gms.internal.ads.zi

            /* renamed from: f */
            private final zzbbh f21455f;

            /* renamed from: g */
            private final zzbai f21456g;

            /* renamed from: h */
            private final ApplicationInfo f21457h;

            /* renamed from: i */
            private final String f21458i;

            /* renamed from: j */
            private final List f21459j;

            /* renamed from: k */
            private final PackageInfo f21460k;

            /* renamed from: l */
            private final zzbbh f21461l;

            /* renamed from: m */
            private final zzaxb f21462m;

            /* renamed from: n */
            private final String f21463n;

            {
                this.f21455f = zzbbhVar;
                this.f21456g = zzbaiVar;
                this.f21457h = applicationInfo;
                this.f21458i = str;
                this.f21459j = list;
                this.f21460k = packageInfo;
                this.f21461l = zzbbhVar2;
                this.f21462m = zzaxbVar;
                this.f21463n = str2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzbbh zzbbhVar3 = this.f21455f;
                zzbai zzbaiVar2 = this.f21456g;
                ApplicationInfo applicationInfo2 = this.f21457h;
                String str3 = this.f21458i;
                List list2 = this.f21459j;
                PackageInfo packageInfo2 = this.f21460k;
                zzbbh zzbbhVar4 = this.f21461l;
                zzaxb zzaxbVar2 = this.f21462m;
                return new zzarx((Bundle) zzbbhVar3.get(), zzbaiVar2, applicationInfo2, str3, list2, packageInfo2, (String) zzbbhVar4.get(), zzaxbVar2.mo17109w(), this.f21463n);
            }
        }).m19112f(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
