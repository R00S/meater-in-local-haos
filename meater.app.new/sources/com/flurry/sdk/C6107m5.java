package com.flurry.sdk;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.m5 */
/* loaded from: classes2.dex */
public final class C6107m5 extends AbstractC6144q6 {

    /* renamed from: b */
    public boolean f16145b;

    /* renamed from: c */
    public Map<String, String> f16146c;

    public C6107m5(boolean z, Map<String, String> map) {
        this.f16145b = z;
        this.f16146c = map;
    }

    @Override // com.flurry.sdk.AbstractC6144q6, com.flurry.sdk.InterfaceC6169t6
    /* renamed from: a */
    public final JSONObject mo12963a() throws JSONException {
        JSONObject jSONObjectMo12963a = super.mo12963a();
        jSONObjectMo12963a.put("fl.consent.isGdprScope", this.f16145b);
        JSONObject jSONObject = new JSONObject();
        Map<String, String> map = this.f16146c;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        }
        jSONObjectMo12963a.put("fl.consent.strings", jSONObject);
        return jSONObjectMo12963a;
    }
}
