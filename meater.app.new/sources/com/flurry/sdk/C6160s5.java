package com.flurry.sdk;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.s5 */
/* loaded from: classes2.dex */
public final class C6160s5 extends AbstractC6144q6 {

    /* renamed from: b */
    public int f16330b;

    /* renamed from: c */
    public String f16331c;

    public C6160s5(int i2, String str) {
        this.f16330b = 0;
        this.f16331c = "Unknown";
        this.f16330b = i2;
        this.f16331c = str;
    }

    @Override // com.flurry.sdk.AbstractC6144q6, com.flurry.sdk.InterfaceC6169t6
    /* renamed from: a */
    public final JSONObject mo12963a() throws JSONException {
        JSONObject jSONObjectMo12963a = super.mo12963a();
        jSONObjectMo12963a.put("fl.flush.frame.code", this.f16330b);
        jSONObjectMo12963a.put("fl.flush.frame.reason", this.f16331c);
        return jSONObjectMo12963a;
    }
}
