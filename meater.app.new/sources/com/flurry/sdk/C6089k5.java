package com.flurry.sdk;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.k5 */
/* loaded from: classes2.dex */
public final class C6089k5 extends AbstractC6144q6 {

    /* renamed from: b */
    public final boolean f16100b;

    public C6089k5(boolean z) {
        this.f16100b = z;
    }

    @Override // com.flurry.sdk.AbstractC6144q6, com.flurry.sdk.InterfaceC6169t6
    /* renamed from: a */
    public final JSONObject mo12963a() throws JSONException {
        JSONObject jSONObjectMo12963a = super.mo12963a();
        jSONObjectMo12963a.put("fl.ccpa.optout", this.f16100b);
        return jSONObjectMo12963a;
    }
}
