package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.n0 */
/* loaded from: classes2.dex */
final class C6952n0 implements zzahw {

    /* renamed from: a */
    private final /* synthetic */ zzbbr f19947a;

    C6952n0(zzahu zzahuVar, zzbbr zzbbrVar) {
        this.f19947a = zzbbrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzahw
    /* renamed from: a */
    public final void mo15332a(JSONObject jSONObject) {
        this.f19947a.m17385a(jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzahw
    public final void onFailure(String str) {
        this.f19947a.m17386c(new zzali(str));
    }
}
