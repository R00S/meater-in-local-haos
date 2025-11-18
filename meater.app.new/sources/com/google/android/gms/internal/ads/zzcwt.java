package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.zzk;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcwt implements zzcuz<JSONObject> {

    /* renamed from: a */
    private Bundle f25208a;

    public zzcwt(Bundle bundle) {
        this.f25208a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzcuz
    /* renamed from: a */
    public final /* synthetic */ void mo15076a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        if (this.f25208a != null) {
            try {
                zzazc.m17269k(zzazc.m17269k(jSONObject2, "device"), "play_store").put("parental_controls", zzk.zzlg().m17171N(this.f25208a));
            } catch (JSONException unused) {
                zzawz.m17082m("Failed putting parental controls bundle.");
            }
        }
    }
}
