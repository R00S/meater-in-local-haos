package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcwm implements zzcuz<JSONObject> {

    /* renamed from: a */
    private List<String> f25195a;

    public zzcwm(List<String> list) {
        this.f25195a = list;
    }

    @Override // com.google.android.gms.internal.ads.zzcuz
    /* renamed from: a */
    public final /* synthetic */ void mo15076a(JSONObject jSONObject) throws JSONException {
        try {
            jSONObject.put("eid", TextUtils.join(",", this.f25195a));
        } catch (JSONException unused) {
            zzawz.m17082m("Failed putting experiment ids.");
        }
    }
}
