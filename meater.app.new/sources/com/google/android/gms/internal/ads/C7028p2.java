package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.p2 */
/* loaded from: classes2.dex */
final class C7028p2 implements zzahw {

    /* renamed from: a */
    private final zzbbr f20269a;

    /* renamed from: b */
    private final /* synthetic */ zzamd f20270b;

    public C7028p2(zzamd zzamdVar, zzbbr zzbbrVar) {
        this.f20270b = zzamdVar;
        this.f20269a = zzbbrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzahw
    /* renamed from: a */
    public final void mo15332a(JSONObject jSONObject) {
        try {
            this.f20269a.m17385a(this.f20270b.f22118a.mo14955a(jSONObject));
        } catch (IllegalStateException unused) {
        } catch (JSONException e2) {
            this.f20269a.m17385a(e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahw
    public final void onFailure(String str) {
        try {
            if (str == null) {
                this.f20269a.m17386c(new zzali());
            } else {
                this.f20269a.m17386c(new zzali(str));
            }
        } catch (IllegalStateException unused) {
        }
    }
}
