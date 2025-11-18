package com.flurry.sdk;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.p6 */
/* loaded from: classes2.dex */
public final class C6135p6 extends AbstractC6144q6 {

    /* renamed from: b */
    public final int f16251b;

    /* renamed from: c */
    public final long f16252c;

    /* renamed from: d */
    public final String f16253d;

    /* renamed from: e */
    public final List<String> f16254e;

    /* renamed from: f */
    public final a f16255f;

    /* renamed from: com.flurry.sdk.p6$a */
    public enum a {
        Set(1),
        Add(2),
        Remove(3),
        Clear(4),
        Assign(5),
        Flag(6),
        Unknown(0);


        /* renamed from: n */
        private final int f16264n;

        a(int i2) {
            this.f16264n = i2;
        }
    }

    public C6135p6(int i2, long j2, String str, List<String> list, a aVar) {
        this.f16251b = i2;
        this.f16252c = j2;
        this.f16253d = str;
        this.f16254e = list;
        this.f16255f = aVar;
    }

    @Override // com.flurry.sdk.AbstractC6144q6, com.flurry.sdk.InterfaceC6169t6
    /* renamed from: a */
    public final JSONObject mo12963a() throws JSONException {
        JSONObject jSONObjectMo12963a = super.mo12963a();
        jSONObjectMo12963a.put("fl.user.property.id", this.f16251b);
        jSONObjectMo12963a.put("fl.user.property.uptime", this.f16252c);
        jSONObjectMo12963a.put("fl.user.property.key", this.f16253d);
        List<String> list = this.f16254e;
        JSONArray jSONArray = new JSONArray();
        if (list != null && !list.isEmpty()) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
        }
        jSONObjectMo12963a.put("fl.user.property.values", jSONArray);
        jSONObjectMo12963a.put("fl.user.property.call.type", this.f16255f.f16264n);
        return jSONObjectMo12963a;
    }
}
