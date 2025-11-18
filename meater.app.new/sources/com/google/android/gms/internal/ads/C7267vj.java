package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.vj */
/* loaded from: classes2.dex */
final class C7267vj implements zzalm<zzcir> {
    C7267vj() {
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    /* renamed from: b */
    public final /* synthetic */ JSONObject mo15021b(zzcir zzcirVar) throws JSONException {
        zzcir zzcirVar2 = zzcirVar;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject2.put("base_url", zzcirVar2.f24360d.m16904b());
        jSONObject2.put("signals", zzcirVar2.f24359c);
        jSONObject3.put("body", zzcirVar2.f24358b.f24374c);
        jSONObject3.put("headers", zzk.zzlg().m17176Y(zzcirVar2.f24358b.f24373b));
        jSONObject3.put("response_code", zzcirVar2.f24358b.f24372a);
        jSONObject3.put("latency", zzcirVar2.f24358b.f24375d);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", zzcirVar2.f24360d.m16907e());
        return jSONObject;
    }
}
