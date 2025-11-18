package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcwi implements zzcuz<JSONObject> {

    /* renamed from: a */
    private String f25187a;

    /* renamed from: b */
    private String f25188b;

    public zzcwi(String str, String str2) {
        this.f25187a = str;
        this.f25188b = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzcuz
    /* renamed from: a */
    public final /* synthetic */ void mo15076a(JSONObject jSONObject) throws JSONException {
        try {
            JSONObject jSONObjectM17269k = zzazc.m17269k(jSONObject, "pii");
            jSONObjectM17269k.put("doritos", this.f25187a);
            jSONObjectM17269k.put("doritos_v2", this.f25188b);
        } catch (JSONException unused) {
            zzawz.m17082m("Failed putting doritos string.");
        }
    }
}
