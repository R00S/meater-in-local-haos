package com.google.android.gms.internal.ads;

import android.location.Location;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcwp implements zzcuz<JSONObject> {

    /* renamed from: a */
    private final Location f25199a;

    public zzcwp(Location location) {
        this.f25199a = location;
    }

    @Override // com.google.android.gms.internal.ads.zzcuz
    /* renamed from: a */
    public final /* synthetic */ void mo15076a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        try {
            if (this.f25199a != null) {
                JSONObject jSONObject3 = new JSONObject();
                Float fValueOf = Float.valueOf(this.f25199a.getAccuracy() * 1000.0f);
                Long lValueOf = Long.valueOf(this.f25199a.getTime() * 1000);
                Long lValueOf2 = Long.valueOf((long) (this.f25199a.getLatitude() * 1.0E7d));
                Long lValueOf3 = Long.valueOf((long) (this.f25199a.getLongitude() * 1.0E7d));
                jSONObject3.put("radius", fValueOf);
                jSONObject3.put("lat", lValueOf2);
                jSONObject3.put("long", lValueOf3);
                jSONObject3.put("time", lValueOf);
                jSONObject2.put("uule", jSONObject3);
            }
        } catch (JSONException e2) {
            zzawz.m17081l("Failed adding location to the request JSON.", e2);
        }
    }
}
