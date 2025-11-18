package com.flurry.sdk;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.f4 */
/* loaded from: classes2.dex */
public final class C6043f4 extends AbstractC6144q6 {

    /* renamed from: b */
    public final EnumC6039f0 f15875b;

    /* renamed from: c */
    public final long f15876c;

    /* renamed from: d */
    public final long f15877d;

    /* renamed from: e */
    public final long f15878e;

    /* renamed from: f */
    public final EnumC6030e0 f15879f;

    /* renamed from: g */
    public final boolean f15880g;

    public C6043f4(C6011c0 c6011c0) {
        this.f15875b = c6011c0.f15703a;
        this.f15876c = c6011c0.f15704b;
        this.f15877d = c6011c0.f15705c;
        this.f15878e = c6011c0.f15706d;
        this.f15879f = c6011c0.f15707e;
        this.f15880g = c6011c0.f15708f;
    }

    @Override // com.flurry.sdk.AbstractC6144q6, com.flurry.sdk.InterfaceC6169t6
    /* renamed from: a */
    public final JSONObject mo12963a() throws JSONException {
        JSONObject jSONObjectMo12963a = super.mo12963a();
        jSONObjectMo12963a.put("fl.session.timestamp", this.f15876c);
        jSONObjectMo12963a.put("fl.initial.timestamp", this.f15877d);
        jSONObjectMo12963a.put("fl.continue.session.millis", this.f15878e);
        jSONObjectMo12963a.put("fl.session.state", this.f15875b.f15845j);
        jSONObjectMo12963a.put("fl.session.event", this.f15879f.name());
        jSONObjectMo12963a.put("fl.session.manual", this.f15880g);
        return jSONObjectMo12963a;
    }
}
