package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzard
/* loaded from: classes2.dex */
public final class zzamn {
    /* renamed from: a */
    public static List<String> m16689a(JSONObject jSONObject, String str) throws JSONException {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jSONArrayOptJSONArray.length());
        for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
            arrayList.add(jSONArrayOptJSONArray.getString(i2));
        }
        return Collections.unmodifiableList(arrayList);
    }
}
