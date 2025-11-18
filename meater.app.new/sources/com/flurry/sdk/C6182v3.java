package com.flurry.sdk;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.v3 */
/* loaded from: classes2.dex */
public final class C6182v3 extends AbstractC6144q6 {

    /* renamed from: b */
    public final String f16432b;

    /* renamed from: c */
    public int f16433c;

    /* renamed from: d */
    public final a f16434d;

    /* renamed from: e */
    public final Map<String, String> f16435e;

    /* renamed from: f */
    public final Map<String, String> f16436f;

    /* renamed from: g */
    public final boolean f16437g;

    /* renamed from: h */
    public final boolean f16438h;

    /* renamed from: i */
    public final long f16439i;

    /* renamed from: j */
    public final long f16440j;

    /* renamed from: k */
    public long f16441k;

    /* renamed from: com.flurry.sdk.v3$a */
    public enum a {
        UNKNOWN(0),
        CUSTOM(1),
        PURCHASE(8),
        MESSAGE(9),
        USER_STANDARD(10),
        PERFORMANCE(1),
        SDK_LOG(1);


        /* renamed from: n */
        final int f16450n;

        a(int i2) {
            this.f16450n = i2;
        }
    }

    public C6182v3(String str, int i2, a aVar, Map<String, String> map, Map<String, String> map2, boolean z, boolean z2, long j2, long j3, long j4) {
        this.f16292a = 2;
        this.f16432b = str;
        this.f16433c = i2;
        this.f16434d = aVar;
        this.f16435e = map;
        this.f16436f = map2;
        this.f16437g = z;
        this.f16438h = z2;
        this.f16439i = j2;
        this.f16440j = j3;
        this.f16441k = j4;
    }

    /* renamed from: b */
    private static Map<String, String> m13330b(Map<String, String> map, List<String> list) {
        String strM12992h;
        String value;
        HashMap map2 = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (list.contains(entry.getKey())) {
                strM12992h = C6013c2.m12992h(entry.getKey());
                value = entry.getValue();
            } else {
                strM12992h = C6013c2.m12992h(entry.getKey());
                value = C6013c2.m12992h(entry.getValue());
            }
            if (!TextUtils.isEmpty(strM12992h)) {
                map2.put(strM12992h, value);
            }
        }
        return map2;
    }

    @Override // com.flurry.sdk.AbstractC6144q6, com.flurry.sdk.InterfaceC6169t6
    /* renamed from: a */
    public final JSONObject mo12963a() throws JSONException {
        JSONObject jSONObjectMo12963a = super.mo12963a();
        jSONObjectMo12963a.put("fl.event.name", this.f16432b);
        jSONObjectMo12963a.put("fl.event.id", this.f16433c);
        jSONObjectMo12963a.put("fl.event.type", this.f16434d.f16450n);
        jSONObjectMo12963a.put("fl.event.timed", this.f16437g);
        jSONObjectMo12963a.put("fl.timed.event.starting", this.f16438h);
        long j2 = this.f16441k;
        if (j2 > 0) {
            jSONObjectMo12963a.put("fl.timed.event.duration", j2);
        }
        jSONObjectMo12963a.put("fl.event.timestamp", this.f16439i);
        jSONObjectMo12963a.put("fl.event.uptime", this.f16440j);
        jSONObjectMo12963a.put("fl.event.user.parameters", C6032e2.m13052a(this.f16435e));
        jSONObjectMo12963a.put("fl.event.flurry.parameters", C6032e2.m13052a(this.f16436f));
        return jSONObjectMo12963a;
    }

    public C6182v3(String str, int i2, a aVar, Map<String, String> map, Map<String, String> map2, List<String> list, boolean z, boolean z2, long j2, long j3) {
        this(C6013c2.m12992h(C6013c2.m12986b(str)), i2, aVar, (Map<String, String>) (map != null ? m13330b(map, list) : new HashMap()), (Map<String, String>) (map2 != null ? m13330b(map2, list) : new HashMap()), z, z2, j2, j3, 0L);
    }
}
