package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcvt implements zzcuz<JSONObject> {

    /* renamed from: a */
    private final String f25165a;

    public zzcvt(String str) {
        this.f25165a = str;
    }

    @Override // com.google.android.gms.internal.ads.zzcuz
    /* renamed from: a */
    public final /* synthetic */ void mo15076a(JSONObject jSONObject) throws JSONException {
        try {
            jSONObject.put("ms", this.f25165a);
        } catch (JSONException e2) {
            zzawz.m17081l("Failed putting Ad ID.", e2);
        }
    }
}
