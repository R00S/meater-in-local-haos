package com.flurry.sdk;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.q6 */
/* loaded from: classes2.dex */
public abstract class AbstractC6144q6 implements InterfaceC6169t6 {

    /* renamed from: a */
    protected int f16292a = 1;

    @Override // com.flurry.sdk.InterfaceC6169t6
    /* renamed from: a */
    public JSONObject mo12963a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("fl.frame.version", this.f16292a);
        return jSONObject;
    }
}
