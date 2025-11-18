package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.mp */
/* loaded from: classes2.dex */
final class C6940mp implements zzcva<zzcuz<JSONObject>> {

    /* renamed from: a */
    private final JSONObject f19935a;

    C6940mp(Context context) {
        this.f19935a = zzasj.m16917c(context);
    }

    /* renamed from: a */
    final /* synthetic */ void m15557a(JSONObject jSONObject) throws JSONException {
        try {
            jSONObject.put("gms_sdk_env", this.f19935a);
        } catch (JSONException unused) {
            zzawz.m17082m("Failed putting version constants.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    /* renamed from: b */
    public final zzbbh<zzcuz<JSONObject>> mo14982b() {
        return zzbar.m17378o(new zzcuz(this) { // from class: com.google.android.gms.internal.ads.np

            /* renamed from: a */
            private final C6940mp f20102a;

            {
                this.f20102a = this;
            }

            @Override // com.google.android.gms.internal.ads.zzcuz
            /* renamed from: a */
            public final void mo15076a(Object obj) throws JSONException {
                this.f20102a.m15557a((JSONObject) obj);
            }
        });
    }
}
