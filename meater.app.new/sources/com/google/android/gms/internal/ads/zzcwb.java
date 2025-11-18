package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcwb implements zzcuz<JSONObject> {

    /* renamed from: a */
    private JSONObject f25179a;

    public zzcwb(JSONObject jSONObject) {
        this.f25179a = jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzcuz
    /* renamed from: a */
    public final /* synthetic */ void mo15076a(JSONObject jSONObject) throws JSONException {
        try {
            jSONObject.put("cache_state", this.f25179a);
        } catch (JSONException unused) {
            zzawz.m17082m("Unable to get cache_state");
        }
    }
}
