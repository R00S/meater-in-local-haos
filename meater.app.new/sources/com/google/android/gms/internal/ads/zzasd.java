package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

@zzard
/* loaded from: classes2.dex */
public final class zzasd {

    /* renamed from: a */
    private final List<String> f22421a;

    /* renamed from: b */
    private final String f22422b;

    /* renamed from: c */
    private final String f22423c;

    /* renamed from: d */
    private final String f22424d;

    /* renamed from: e */
    private final boolean f22425e;

    /* renamed from: f */
    private final String f22426f;

    /* renamed from: g */
    private final String f22427g;

    /* renamed from: h */
    private String f22428h;

    /* renamed from: i */
    private final int f22429i;

    /* renamed from: j */
    private final boolean f22430j;

    /* renamed from: k */
    private final JSONObject f22431k;

    /* renamed from: l */
    private final String f22432l;

    /* renamed from: m */
    private final boolean f22433m;

    public zzasd(JSONObject jSONObject) {
        this.f22428h = jSONObject.optString("url");
        this.f22422b = jSONObject.optString("base_uri");
        this.f22423c = jSONObject.optString("post_parameters");
        String strOptString = jSONObject.optString("drt_include");
        this.f22425e = strOptString != null && (strOptString.equals("1") || strOptString.equals("true"));
        this.f22426f = jSONObject.optString("request_id");
        this.f22424d = jSONObject.optString("type");
        String strOptString2 = jSONObject.optString("errors");
        this.f22421a = strOptString2 == null ? null : Arrays.asList(strOptString2.split(","));
        this.f22429i = jSONObject.optInt("valid", 0) == 1 ? -2 : 1;
        this.f22427g = jSONObject.optString("fetched_ad");
        this.f22430j = jSONObject.optBoolean("render_test_ad_label");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.f22431k = jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
        this.f22432l = jSONObject.optString("analytics_query_ad_event_id");
        this.f22433m = jSONObject.optBoolean("is_analytics_logging_enabled");
    }

    /* renamed from: a */
    public final String m16903a() {
        return this.f22428h;
    }

    /* renamed from: b */
    public final String m16904b() {
        return this.f22422b;
    }

    /* renamed from: c */
    public final String m16905c() {
        return this.f22423c;
    }

    /* renamed from: d */
    public final boolean m16906d() {
        return this.f22425e;
    }

    /* renamed from: e */
    public final JSONObject m16907e() {
        return this.f22431k;
    }
}
