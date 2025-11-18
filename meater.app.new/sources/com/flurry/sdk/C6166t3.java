package com.flurry.sdk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.t3 */
/* loaded from: classes2.dex */
public final class C6166t3 extends AbstractC6144q6 {

    /* renamed from: b */
    public final int f16378b;

    /* renamed from: c */
    public final String f16379c;

    /* renamed from: d */
    public final long f16380d;

    /* renamed from: e */
    public final String f16381e;

    /* renamed from: f */
    public final String f16382f;

    /* renamed from: g */
    public final String f16383g;

    /* renamed from: h */
    public final int f16384h;

    /* renamed from: i */
    public final int f16385i;

    /* renamed from: j */
    public final String f16386j;

    /* renamed from: k */
    public final String f16387k;

    /* renamed from: l */
    public final Map<String, String> f16388l;

    /* renamed from: m */
    public final Map<String, String> f16389m;

    /* renamed from: n */
    public int f16390n;

    /* renamed from: o */
    public List<C6109m7> f16391o;

    public C6166t3(int i2, String str, long j2, String str2, String str3, String str4, int i3, int i4, Map<String, String> map, Map<String, String> map2, int i5, List<C6109m7> list, String str5, String str6) {
        this.f16378b = i2;
        this.f16379c = str;
        this.f16380d = j2;
        this.f16381e = str2 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str2;
        this.f16382f = str3 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str3;
        this.f16383g = str4 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str4;
        this.f16384h = i3;
        this.f16385i = i4;
        this.f16388l = map == null ? new HashMap<>() : map;
        this.f16389m = map2 == null ? new HashMap<>() : map2;
        this.f16390n = i5;
        this.f16391o = list == null ? new ArrayList<>() : list;
        this.f16386j = str5 != null ? C6013c2.m12992h(str5) : HttpUrl.FRAGMENT_ENCODE_SET;
        this.f16387k = str6 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str6;
    }

    @Override // com.flurry.sdk.AbstractC6144q6, com.flurry.sdk.InterfaceC6169t6
    /* renamed from: a */
    public final JSONObject mo12963a() throws JSONException {
        JSONObject jSONObjectMo12963a = super.mo12963a();
        jSONObjectMo12963a.put("fl.error.id", this.f16378b);
        jSONObjectMo12963a.put("fl.error.name", this.f16379c);
        jSONObjectMo12963a.put("fl.error.timestamp", this.f16380d);
        jSONObjectMo12963a.put("fl.error.message", this.f16381e);
        jSONObjectMo12963a.put("fl.error.class", this.f16382f);
        jSONObjectMo12963a.put("fl.error.type", this.f16384h);
        jSONObjectMo12963a.put("fl.crash.report", this.f16383g);
        jSONObjectMo12963a.put("fl.crash.platform", this.f16385i);
        jSONObjectMo12963a.put("fl.error.user.crash.parameter", C6032e2.m13052a(this.f16389m));
        jSONObjectMo12963a.put("fl.error.sdk.crash.parameter", C6032e2.m13052a(this.f16388l));
        jSONObjectMo12963a.put("fl.breadcrumb.version", this.f16390n);
        JSONArray jSONArray = new JSONArray();
        List<C6109m7> list = this.f16391o;
        if (list != null) {
            for (C6109m7 c6109m7 : list) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("fl.breadcrumb.message", c6109m7.f16148b);
                jSONObject.put("fl.breadcrumb.timestamp", c6109m7.f16149c);
                jSONArray.put(jSONObject);
            }
        }
        jSONObjectMo12963a.put("fl.breadcrumb", jSONArray);
        jSONObjectMo12963a.put("fl.nativecrash.minidump", this.f16386j);
        jSONObjectMo12963a.put("fl.nativecrash.logcat", this.f16387k);
        return jSONObjectMo12963a;
    }
}
