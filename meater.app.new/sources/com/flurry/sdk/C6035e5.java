package com.flurry.sdk;

import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.e5 */
/* loaded from: classes2.dex */
public final class C6035e5 extends AbstractC6144q6 {

    /* renamed from: b */
    public final String f15816b;

    /* renamed from: c */
    public final String f15817c;

    /* renamed from: d */
    public final String f15818d;

    /* renamed from: e */
    public final String f15819e;

    /* renamed from: f */
    public final int f15820f;

    public C6035e5(String str, String str2, String str3, String str4) {
        this.f15816b = str;
        this.f15817c = str2 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str2;
        this.f15818d = str3;
        this.f15819e = str4;
        this.f15820f = 3;
    }

    /* renamed from: b */
    private static void m13054b(JSONObject jSONObject, String str, String str2) throws JSONException {
        if (str2 != null) {
            jSONObject.put(str, str2);
        }
    }

    @Override // com.flurry.sdk.AbstractC6144q6, com.flurry.sdk.InterfaceC6169t6
    /* renamed from: a */
    public final JSONObject mo12963a() throws JSONException {
        JSONObject jSONObjectMo12963a = super.mo12963a();
        m13054b(jSONObjectMo12963a, "fl.app.version", this.f15816b);
        m13054b(jSONObjectMo12963a, "fl.app.version.override", this.f15817c);
        m13054b(jSONObjectMo12963a, "fl.app.version.code", this.f15818d);
        m13054b(jSONObjectMo12963a, "fl.bundle.id", this.f15819e);
        jSONObjectMo12963a.put("fl.build.environment", this.f15820f);
        return jSONObjectMo12963a;
    }
}
