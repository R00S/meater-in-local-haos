package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcvn implements zzcuz<JSONObject> {

    /* renamed from: a */
    private final Context f25154a;

    /* renamed from: b */
    private final AdvertisingIdClient.Info f25155b;

    /* renamed from: c */
    private final String f25156c;

    public zzcvn(AdvertisingIdClient.Info info, Context context, String str) {
        this.f25154a = context;
        this.f25155b = info;
        this.f25156c = str;
    }

    @Override // com.google.android.gms.internal.ads.zzcuz
    /* renamed from: a */
    public final /* synthetic */ void mo15076a(JSONObject jSONObject) throws JSONException {
        try {
            JSONObject jSONObjectM17269k = zzazc.m17269k(jSONObject, "pii");
            String id = null;
            boolean zIsLimitAdTrackingEnabled = false;
            AdvertisingIdClient.Info info = this.f25155b;
            if (info != null) {
                id = info.getId();
                zIsLimitAdTrackingEnabled = this.f25155b.isLimitAdTrackingEnabled();
            }
            if (TextUtils.isEmpty(id)) {
                jSONObjectM17269k.put("pdid", this.f25156c);
                jSONObjectM17269k.put("pdidtype", "ssaid");
            } else {
                jSONObjectM17269k.put("rdid", id);
                jSONObjectM17269k.put("is_lat", zIsLimitAdTrackingEnabled);
                jSONObjectM17269k.put("idtype", "adid");
            }
        } catch (JSONException e2) {
            zzawz.m17081l("Failed putting Ad ID.", e2);
        }
    }
}
