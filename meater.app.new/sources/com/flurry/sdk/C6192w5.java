package com.flurry.sdk;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.w5 */
/* loaded from: classes2.dex */
public final class C6192w5 extends AbstractC6144q6 {

    /* renamed from: b */
    public final String f16500b;

    /* renamed from: c */
    public final List<String> f16501c;

    public C6192w5(String str, List<String> list) {
        this.f16500b = str;
        this.f16501c = list;
    }

    @Override // com.flurry.sdk.AbstractC6144q6, com.flurry.sdk.InterfaceC6169t6
    /* renamed from: a */
    public final JSONObject mo12963a() throws JSONException {
        JSONObject jSONObjectMo12963a = super.mo12963a();
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = this.f16501c.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        jSONObjectMo12963a.put("fl.launch.options.key", this.f16500b);
        jSONObjectMo12963a.put("fl.launch.options.values", jSONArray);
        return jSONObjectMo12963a;
    }
}
