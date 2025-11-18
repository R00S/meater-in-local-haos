package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class zzcrz implements zzcva<Object> {

    /* renamed from: a */
    private final String f24996a;

    /* renamed from: b */
    private final String f24997b;

    /* renamed from: c */
    private final zzbqe f24998c;

    /* renamed from: d */
    private final zzcyi f24999d;

    /* renamed from: e */
    private final zzcxv f25000e;

    public zzcrz(String str, String str2, zzbqe zzbqeVar, zzcyi zzcyiVar, zzcxv zzcxvVar) {
        this.f24996a = str;
        this.f24997b = str2;
        this.f24998c = zzbqeVar;
        this.f24999d = zzcyiVar;
        this.f25000e = zzcxvVar;
    }

    /* renamed from: a */
    final /* synthetic */ void m18962a(Bundle bundle) {
        this.f24998c.m18257b(this.f25000e.f25293d);
        bundle.putBundle("quality_signals", this.f24999d.m19075b());
        bundle.putString("seq_num", this.f24996a);
        bundle.putString("session_id", this.f24997b);
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    /* renamed from: b */
    public final zzbbh<Object> mo14982b() {
        return zzbar.m17378o(new zzcuz(this) { // from class: com.google.android.gms.internal.ads.xn

            /* renamed from: a */
            private final zzcrz f20979a;

            {
                this.f20979a = this;
            }

            @Override // com.google.android.gms.internal.ads.zzcuz
            /* renamed from: a */
            public final void mo15076a(Object obj) {
                this.f20979a.m18962a((Bundle) obj);
            }
        });
    }
}
