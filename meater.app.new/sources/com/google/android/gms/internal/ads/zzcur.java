package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class zzcur implements zzcuz<Bundle> {

    /* renamed from: a */
    private final String f25103a;

    /* renamed from: b */
    private final String f25104b;

    /* renamed from: c */
    private final String f25105c;

    /* renamed from: d */
    private final String f25106d;

    /* renamed from: e */
    private final Long f25107e;

    public zzcur(String str, String str2, String str3, String str4, Long l) {
        this.f25103a = str;
        this.f25104b = str2;
        this.f25105c = str3;
        this.f25106d = str4;
        this.f25107e = l;
    }

    @Override // com.google.android.gms.internal.ads.zzcuz
    /* renamed from: a */
    public final /* synthetic */ void mo15076a(Bundle bundle) {
        Bundle bundle2 = bundle;
        zzcxz.m19063e(bundle2, "gmp_app_id", this.f25103a);
        zzcxz.m19063e(bundle2, "fbs_aiid", this.f25104b);
        zzcxz.m19063e(bundle2, "fbs_aeid", this.f25105c);
        zzcxz.m19063e(bundle2, "apm_id_origin", this.f25106d);
        Long l = this.f25107e;
        if (l != null) {
            bundle2.putLong("sai_timeout", l.longValue());
        }
    }
}
