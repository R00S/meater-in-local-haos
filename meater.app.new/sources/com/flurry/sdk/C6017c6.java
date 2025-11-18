package com.flurry.sdk;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.c6 */
/* loaded from: classes2.dex */
public final class C6017c6 extends AbstractC6144q6 {

    /* renamed from: b */
    public final String f15738b;

    /* renamed from: c */
    public final Map<String, String> f15739c;

    public C6017c6(String str, Map<String, String> map) {
        this.f15738b = str;
        this.f15739c = map == null ? new HashMap<>() : map;
    }

    @Override // com.flurry.sdk.AbstractC6144q6, com.flurry.sdk.InterfaceC6169t6
    /* renamed from: a */
    public final JSONObject mo12963a() throws JSONException {
        JSONObject jSONObjectMo12963a = super.mo12963a();
        JSONObject jSONObjectM13052a = C6032e2.m13052a(this.f15739c);
        jSONObjectMo12963a.put("fl.origin.attribute.name", this.f15738b);
        jSONObjectMo12963a.put("fl.origin.attribute.parameters", jSONObjectM13052a);
        return jSONObjectMo12963a;
    }
}
