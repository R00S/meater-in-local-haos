package com.flurry.sdk;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.f6 */
/* loaded from: classes2.dex */
public final class C6045f6 extends AbstractC6144q6 {

    /* renamed from: b */
    public final boolean f15882b;

    public C6045f6(boolean z) {
        this.f15882b = z;
    }

    @Override // com.flurry.sdk.AbstractC6144q6, com.flurry.sdk.InterfaceC6169t6
    /* renamed from: a */
    public final JSONObject mo12963a() throws JSONException {
        JSONObject jSONObjectMo12963a = super.mo12963a();
        jSONObjectMo12963a.put("fl.report.previous.success", this.f15882b);
        return jSONObjectMo12963a;
    }
}
