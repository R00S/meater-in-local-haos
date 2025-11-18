package com.flurry.sdk;

import com.flurry.sdk.C6019d;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.n6 */
/* loaded from: classes2.dex */
public final class C6117n6 extends AbstractC6144q6 {

    /* renamed from: b */
    public final int f16177b = 3;

    /* renamed from: c */
    public final int f16178c = 328;

    /* renamed from: d */
    public final String f16179d;

    /* renamed from: e */
    public final int f16180e;

    /* renamed from: f */
    public final boolean f16181f;

    /* renamed from: g */
    public final C6019d.d f16182g;

    public C6117n6(String str, int i2, boolean z, C6019d.d dVar) {
        this.f16179d = str;
        this.f16180e = i2;
        this.f16181f = z;
        this.f16182g = dVar;
    }

    @Override // com.flurry.sdk.AbstractC6144q6, com.flurry.sdk.InterfaceC6169t6
    /* renamed from: a */
    public final JSONObject mo12963a() throws JSONException {
        JSONObject jSONObjectMo12963a = super.mo12963a();
        jSONObjectMo12963a.put("fl.agent.version", this.f16178c);
        jSONObjectMo12963a.put("fl.agent.platform", this.f16177b);
        jSONObjectMo12963a.put("fl.apikey", this.f16179d);
        jSONObjectMo12963a.put("fl.agent.report.key", this.f16180e);
        jSONObjectMo12963a.put("fl.background.session.metrics", this.f16181f);
        jSONObjectMo12963a.put("fl.play.service.availability", this.f16182g.f15764o);
        return jSONObjectMo12963a;
    }
}
