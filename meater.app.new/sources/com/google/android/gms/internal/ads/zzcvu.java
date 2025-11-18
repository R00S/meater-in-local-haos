package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcvu implements zzcva<zzcvt> {

    /* renamed from: a */
    private final zzawi f25166a;

    /* renamed from: b */
    private final Executor f25167b;

    /* renamed from: c */
    private final String f25168c;

    /* renamed from: d */
    private final PackageInfo f25169d;

    public zzcvu(zzawi zzawiVar, Executor executor, String str, PackageInfo packageInfo) {
        this.f25166a = zzawiVar;
        this.f25167b = executor;
        this.f25168c = str;
        this.f25169d = packageInfo;
    }

    /* renamed from: a */
    final /* synthetic */ zzbbh m19003a(Throwable th) throws Exception {
        return zzbar.m17378o(new zzcvt(this.f25168c));
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    /* renamed from: b */
    public final zzbbh<zzcvt> mo14982b() {
        return zzbar.m17368e(zzbar.m17367d(this.f25166a.mo17028b(this.f25168c, this.f25169d), C6755hp.f19242a, this.f25167b), Throwable.class, new zzbal(this) { // from class: com.google.android.gms.internal.ads.ip

            /* renamed from: a */
            private final zzcvu f19396a;

            {
                this.f19396a = this;
            }

            @Override // com.google.android.gms.internal.ads.zzbal
            public final zzbbh zzf(Object obj) {
                return this.f19396a.m19003a((Throwable) obj);
            }
        }, this.f25167b);
    }
}
