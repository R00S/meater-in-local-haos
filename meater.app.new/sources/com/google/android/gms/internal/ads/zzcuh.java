package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes2.dex */
public final class zzcuh implements zzcva<zzcuz<Bundle>> {

    /* renamed from: a */
    private final Context f25086a;

    /* renamed from: b */
    private final String f25087b;

    zzcuh(Context context, String str) {
        this.f25086a = context;
        this.f25087b = str;
    }

    /* renamed from: a */
    final /* synthetic */ void m18986a(Bundle bundle) {
        bundle.putString("rewarded_sku_package", this.f25086a.getPackageName());
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    /* renamed from: b */
    public final zzbbh<zzcuz<Bundle>> mo14982b() {
        return zzbar.m17378o(this.f25087b == null ? null : new zzcuz(this) { // from class: com.google.android.gms.internal.ads.so

            /* renamed from: a */
            private final zzcuh f20530a;

            {
                this.f20530a = this;
            }

            @Override // com.google.android.gms.internal.ads.zzcuz
            /* renamed from: a */
            public final void mo15076a(Object obj) {
                this.f20530a.m18986a((Bundle) obj);
            }
        });
    }
}
