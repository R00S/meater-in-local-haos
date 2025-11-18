package com.flurry.sdk;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.h6 */
/* loaded from: classes2.dex */
public final class C6063h6 extends AbstractC6144q6 {

    /* renamed from: b */
    public final Map<String, List<String>> f15953b;

    public C6063h6(Map<String, List<String>> map) {
        this.f15953b = map == null ? new HashMap<>() : map;
    }

    @Override // com.flurry.sdk.AbstractC6144q6, com.flurry.sdk.InterfaceC6169t6
    /* renamed from: a */
    public final JSONObject mo12963a() throws JSONException {
        JSONObject jSONObjectMo12963a = super.mo12963a();
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, List<String>> entry : this.f15953b.entrySet()) {
            JSONArray jSONArray = new JSONArray();
            for (String str : entry.getValue()) {
                if (!TextUtils.isEmpty(str)) {
                    jSONArray.put(str);
                }
            }
            if (jSONArray.length() > 0) {
                jSONObject.put(entry.getKey(), jSONArray);
            }
        }
        if (jSONObject.length() > 0) {
            jSONObjectMo12963a.put("fl.referrer.map", jSONObject);
        }
        return jSONObjectMo12963a;
    }
}
