package com.flurry.sdk;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.i5 */
/* loaded from: classes2.dex */
public final class C6071i5 extends AbstractC6144q6 {

    /* renamed from: b */
    public final int f15997b;

    /* renamed from: c */
    public final int f15998c;

    public C6071i5(int i2, int i3) {
        this.f15998c = i2 < 0 ? EnumC6055g7.UNKNOWN.f15931j : i2;
        this.f15997b = i3 < 0 ? EnumC6055g7.UNKNOWN.f15931j : i3;
    }

    @Override // com.flurry.sdk.AbstractC6144q6, com.flurry.sdk.InterfaceC6169t6
    /* renamed from: a */
    public final JSONObject mo12963a() throws JSONException {
        JSONObject jSONObjectMo12963a = super.mo12963a();
        jSONObjectMo12963a.put("fl.app.current.state", this.f15997b);
        jSONObjectMo12963a.put("fl.app.previous.state", this.f15998c);
        return jSONObjectMo12963a;
    }
}
