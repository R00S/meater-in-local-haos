package com.google.android.gms.internal.ads;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcvx implements zzcuz<JSONObject> {

    /* renamed from: a */
    private final JSONObject f25170a;

    public zzcvx(JSONObject jSONObject) {
        this.f25170a = jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzcuz
    /* renamed from: a */
    public final /* synthetic */ void mo15076a(JSONObject jSONObject) throws JSONException {
        try {
            JSONObject jSONObjectM17269k = zzazc.m17269k(jSONObject, "content_info");
            JSONObject jSONObject2 = this.f25170a;
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObjectM17269k.put(next, jSONObject2.get(next));
            }
        } catch (JSONException unused) {
            zzawz.m17082m("Failed putting app indexing json.");
        }
    }
}
