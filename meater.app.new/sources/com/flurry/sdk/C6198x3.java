package com.flurry.sdk;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.x3 */
/* loaded from: classes2.dex */
public final class C6198x3 extends AbstractC6144q6 {

    /* renamed from: b */
    public final int f16515b;

    /* renamed from: c */
    public final boolean f16516c;

    public C6198x3(int i2, boolean z) {
        this.f16515b = i2;
        this.f16516c = z;
    }

    @Override // com.flurry.sdk.AbstractC6144q6, com.flurry.sdk.InterfaceC6169t6
    /* renamed from: a */
    public final JSONObject mo12963a() throws JSONException {
        JSONObject jSONObjectMo12963a = super.mo12963a();
        jSONObjectMo12963a.put("fl.event.count", this.f16515b);
        jSONObjectMo12963a.put("fl.event.set.complete", this.f16516c);
        return jSONObjectMo12963a;
    }
}
