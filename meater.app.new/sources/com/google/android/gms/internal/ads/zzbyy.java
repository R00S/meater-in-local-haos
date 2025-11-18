package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbyy extends zzbyx {

    /* renamed from: b */
    private final JSONObject f23836b;

    /* renamed from: c */
    private final boolean f23837c;

    /* renamed from: d */
    private final boolean f23838d;

    /* renamed from: e */
    private final boolean f23839e;

    public zzbyy(zzcxm zzcxmVar, JSONObject jSONObject) {
        super(zzcxmVar);
        this.f23836b = zzazc.m17263e(jSONObject, "tracking_urls_and_actions", "active_view");
        this.f23837c = zzazc.m17267i(false, jSONObject, "allow_pub_owned_ad_view");
        this.f23838d = zzazc.m17267i(false, jSONObject, "attribution", "allow_pub_rendering");
        this.f23839e = zzazc.m17267i(false, jSONObject, "enable_omid");
    }

    @Override // com.google.android.gms.internal.ads.zzbyx
    /* renamed from: a */
    public final JSONObject mo18556a() {
        JSONObject jSONObject = this.f23836b;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.f23835a.f25265w);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyx
    /* renamed from: b */
    public final boolean mo18557b() {
        return this.f23837c;
    }

    @Override // com.google.android.gms.internal.ads.zzbyx
    /* renamed from: c */
    public final boolean mo18558c() {
        return this.f23838d;
    }

    @Override // com.google.android.gms.internal.ads.zzbyx
    /* renamed from: d */
    public final boolean mo18559d() {
        return this.f23839e;
    }
}
