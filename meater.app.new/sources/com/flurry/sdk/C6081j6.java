package com.flurry.sdk;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.j6 */
/* loaded from: classes2.dex */
public final class C6081j6 extends AbstractC6144q6 {

    /* renamed from: b */
    public final Map<EnumC6101m, String> f16032b;

    /* renamed from: c */
    public final boolean f16033c;

    public C6081j6(Map<EnumC6101m, String> map, boolean z) {
        this.f16032b = new HashMap(map);
        this.f16033c = z;
    }

    @Override // com.flurry.sdk.AbstractC6144q6, com.flurry.sdk.InterfaceC6169t6
    /* renamed from: a */
    public final JSONObject mo12963a() throws JSONException {
        JSONObject jSONObjectMo12963a = super.mo12963a();
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<EnumC6101m, String> entry : this.f16032b.entrySet()) {
            jSONObject.put(entry.getKey().name(), entry.getValue());
        }
        jSONObjectMo12963a.put("fl.reported.id", jSONObject);
        jSONObjectMo12963a.put("fl.ad.tracking", this.f16033c);
        return jSONObjectMo12963a;
    }
}
