package com.flurry.sdk;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.l6 */
/* loaded from: classes2.dex */
public final class C6099l6 extends AbstractC6144q6 {

    /* renamed from: b */
    public final long f16109b;

    /* renamed from: c */
    public final long f16110c;

    /* renamed from: d */
    public final long f16111d;

    /* renamed from: e */
    public final int f16112e;

    public C6099l6(long j2, long j3, long j4, int i2) {
        this.f16109b = j2;
        this.f16110c = j3;
        this.f16111d = j4;
        this.f16112e = i2;
    }

    @Override // com.flurry.sdk.AbstractC6144q6, com.flurry.sdk.InterfaceC6169t6
    /* renamed from: a */
    public final JSONObject mo12963a() throws JSONException {
        JSONObject jSONObjectMo12963a = super.mo12963a();
        jSONObjectMo12963a.put("fl.session.id", this.f16109b);
        jSONObjectMo12963a.put("fl.session.elapsed.start.time", this.f16110c);
        long j2 = this.f16111d;
        if (j2 >= this.f16110c) {
            jSONObjectMo12963a.put("fl.session.elapsed.end.time", j2);
        }
        jSONObjectMo12963a.put("fl.session.id.current.state", this.f16112e);
        return jSONObjectMo12963a;
    }
}
