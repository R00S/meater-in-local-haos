package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzbal;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbbh;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
final /* synthetic */ class zze implements zzbal {
    static final zzbal zzbqz = new zze();

    private zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzbal
    public final zzbbh zzf(Object obj) throws JSONException {
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject.optBoolean("isSuccessful", false)) {
            zzk.zzlk().m17061r().mo17089c(jSONObject.getString("appSettingsJson"));
        }
        return zzbar.m17378o(null);
    }
}
