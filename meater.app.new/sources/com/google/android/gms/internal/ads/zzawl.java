package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import cm.aptoide.p092pt.reviews.RateAndReviewsFragment;
import com.google.android.gms.ads.internal.zzk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzard
/* loaded from: classes2.dex */
public final class zzawl {

    /* renamed from: a */
    private final long f22585a;

    /* renamed from: b */
    private final List<String> f22586b = new ArrayList();

    /* renamed from: c */
    private final List<String> f22587c = new ArrayList();

    /* renamed from: d */
    private final Map<String, zzamm> f22588d = new HashMap();

    /* renamed from: e */
    private String f22589e;

    /* renamed from: f */
    private String f22590f;

    /* renamed from: g */
    private JSONObject f22591g;

    /* renamed from: h */
    private boolean f22592h;

    public zzawl(String str, long j2) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        this.f22592h = false;
        this.f22590f = str;
        this.f22585a = j2;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f22591g = jSONObject;
            if (jSONObject.optInt("status", -1) != 1) {
                this.f22592h = false;
                zzbad.m17353i("App settings could not be fetched successfully.");
                return;
            }
            this.f22592h = true;
            this.f22589e = this.f22591g.optString(RateAndReviewsFragment.BundleCons.APP_ID);
            JSONArray jSONArrayOptJSONArray = this.f22591g.optJSONArray("ad_unit_id_settings");
            if (jSONArrayOptJSONArray != null) {
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i2);
                    String strOptString = jSONObject2.optString("format");
                    String strOptString2 = jSONObject2.optString("ad_unit_id");
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                        if ("interstitial".equalsIgnoreCase(strOptString)) {
                            this.f22587c.add(strOptString2);
                        } else if ("rewarded".equalsIgnoreCase(strOptString) && (jSONObjectOptJSONObject = jSONObject2.optJSONObject("mediation_config")) != null) {
                            this.f22588d.put(strOptString2, new zzamm(jSONObjectOptJSONObject));
                        }
                    }
                }
            }
            JSONArray jSONArrayOptJSONArray2 = this.f22591g.optJSONArray("persistable_banner_ad_unit_ids");
            if (jSONArrayOptJSONArray2 != null) {
                for (int i3 = 0; i3 < jSONArrayOptJSONArray2.length(); i3++) {
                    this.f22586b.add(jSONArrayOptJSONArray2.optString(i3));
                }
            }
        } catch (JSONException e2) {
            zzbad.m17348d("Exception occurred while processing app setting json", e2);
            zzk.zzlk().m17052e(e2, "AppSettings.parseAppSettingsJson");
        }
    }

    /* renamed from: a */
    public final long m17038a() {
        return this.f22585a;
    }

    /* renamed from: b */
    public final boolean m17039b() {
        return this.f22592h;
    }

    /* renamed from: c */
    public final String m17040c() {
        return this.f22590f;
    }

    /* renamed from: d */
    public final String m17041d() {
        return this.f22589e;
    }

    /* renamed from: e */
    public final Map<String, zzamm> m17042e() {
        return this.f22588d;
    }

    /* renamed from: f */
    public final JSONObject m17043f() {
        return this.f22591g;
    }
}
