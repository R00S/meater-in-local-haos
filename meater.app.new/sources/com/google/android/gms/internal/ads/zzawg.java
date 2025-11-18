package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

@zzard
/* loaded from: classes2.dex */
public final class zzawg implements zzawi {
    @Override // com.google.android.gms.internal.ads.zzawi
    /* renamed from: a */
    public final zzbbh<AdvertisingIdClient.Info> mo17027a(Context context) {
        zzbbr zzbbrVar = new zzbbr();
        zzyt.m20844a();
        if (zzazt.m17309n(context)) {
            zzaxg.m17119b(new RunnableC7178t4(this, context, zzbbrVar));
        }
        return zzbbrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzawi
    /* renamed from: b */
    public final zzbbh<String> mo17028b(String str, PackageInfo packageInfo) {
        return zzbar.m17378o(str);
    }
}
