package com.flurry.sdk;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.q5 */
/* loaded from: classes2.dex */
public final class C6143q5 extends AbstractC6144q6 {

    /* renamed from: b */
    public final boolean f16290b = true;

    /* renamed from: c */
    public final String f16291c;

    public C6143q5(String str) {
        this.f16291c = str;
    }

    @Override // com.flurry.sdk.AbstractC6144q6, com.flurry.sdk.InterfaceC6169t6
    /* renamed from: a */
    public final JSONObject mo12963a() throws JSONException {
        JSONObject jSONObjectMo12963a = super.mo12963a();
        jSONObjectMo12963a.put("fl.background.enabled", this.f16290b);
        jSONObjectMo12963a.put("fl.sdk.version.code", this.f16291c);
        return jSONObjectMo12963a;
    }
}
