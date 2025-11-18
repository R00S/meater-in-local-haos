package com.flurry.sdk;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.b4 */
/* loaded from: classes2.dex */
public final class C6006b4 extends AbstractC6144q6 {

    /* renamed from: b */
    public final int f15687b;

    /* renamed from: c */
    public final String f15688c;

    /* renamed from: d */
    public final String f15689d;

    /* renamed from: e */
    public final String f15690e;

    /* renamed from: f */
    public final String f15691f;

    /* renamed from: g */
    public final String f15692g;

    /* renamed from: h */
    public final String f15693h;

    /* renamed from: i */
    public final int f15694i;

    public C6006b4(int i2, String str, String str2, String str3, String str4, String str5, String str6, int i3) {
        this.f16292a = 2;
        this.f15687b = i2 < 0 ? -1 : i2;
        this.f15688c = str;
        this.f15689d = str2;
        this.f15690e = str3;
        this.f15691f = str4;
        this.f15692g = str5;
        this.f15693h = str6;
        this.f15694i = i3;
    }

    @Override // com.flurry.sdk.AbstractC6144q6, com.flurry.sdk.InterfaceC6169t6
    /* renamed from: a */
    public final JSONObject mo12963a() throws JSONException {
        JSONObject jSONObjectMo12963a = super.mo12963a();
        jSONObjectMo12963a.put("fl.network.status", this.f15687b);
        String str = this.f15688c;
        if (str != null) {
            jSONObjectMo12963a.put("fl.cellular.name", str);
            jSONObjectMo12963a.put("fl.cellular.operator", this.f15689d);
            jSONObjectMo12963a.put("fl.cellular.sim.operator", this.f15690e);
            jSONObjectMo12963a.put("fl.cellular.sim.id", this.f15691f);
            jSONObjectMo12963a.put("fl.cellular.sim.name", this.f15692g);
            jSONObjectMo12963a.put("fl.cellular.band", this.f15693h);
            jSONObjectMo12963a.put("fl.cellular.signal.strength", this.f15694i);
        }
        return jSONObjectMo12963a;
    }
}
