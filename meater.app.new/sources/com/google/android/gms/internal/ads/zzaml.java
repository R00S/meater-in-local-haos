package com.google.android.gms.internal.ads;

import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import com.google.android.gms.ads.internal.zzk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzard
/* loaded from: classes2.dex */
public final class zzaml {

    /* renamed from: a */
    private final String f22124a;

    /* renamed from: b */
    private final String f22125b;

    /* renamed from: c */
    public final List<String> f22126c;

    /* renamed from: d */
    private final String f22127d;

    /* renamed from: e */
    private final String f22128e;

    /* renamed from: f */
    private final List<String> f22129f;

    /* renamed from: g */
    private final List<String> f22130g;

    /* renamed from: h */
    private final List<String> f22131h;

    /* renamed from: i */
    private final List<String> f22132i;

    /* renamed from: j */
    private final List<String> f22133j;

    /* renamed from: k */
    public final String f22134k;

    /* renamed from: l */
    private final List<String> f22135l;

    /* renamed from: m */
    private final List<String> f22136m;

    /* renamed from: n */
    private final List<String> f22137n;

    /* renamed from: o */
    private final String f22138o;

    /* renamed from: p */
    private final String f22139p;

    /* renamed from: q */
    private final String f22140q;

    /* renamed from: r */
    private final String f22141r;

    /* renamed from: s */
    private final String f22142s;

    /* renamed from: t */
    private final List<String> f22143t;

    /* renamed from: u */
    private final String f22144u;

    /* renamed from: v */
    public final String f22145v;

    /* renamed from: w */
    private final long f22146w;

    public zzaml(JSONObject jSONObject) throws JSONException {
        List<String> listM16689a;
        this.f22125b = jSONObject.optString(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID);
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            arrayList.add(jSONArray.getString(i2));
        }
        this.f22126c = Collections.unmodifiableList(arrayList);
        this.f22127d = jSONObject.optString("allocation_id", null);
        zzk.zzly();
        this.f22129f = zzamn.m16689a(jSONObject, "clickurl");
        zzk.zzly();
        this.f22130g = zzamn.m16689a(jSONObject, "imp_urls");
        zzk.zzly();
        this.f22131h = zzamn.m16689a(jSONObject, "downloaded_imp_urls");
        zzk.zzly();
        this.f22133j = zzamn.m16689a(jSONObject, "fill_urls");
        zzk.zzly();
        this.f22135l = zzamn.m16689a(jSONObject, "video_start_urls");
        zzk.zzly();
        this.f22137n = zzamn.m16689a(jSONObject, "video_complete_urls");
        zzk.zzly();
        this.f22136m = zzamn.m16689a(jSONObject, "video_reward_urls");
        this.f22138o = jSONObject.optString("transaction_id");
        this.f22139p = jSONObject.optString("valid_from_timestamp");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ad");
        if (jSONObjectOptJSONObject != null) {
            zzk.zzly();
            listM16689a = zzamn.m16689a(jSONObjectOptJSONObject, "manual_impression_urls");
        } else {
            listM16689a = null;
        }
        this.f22132i = listM16689a;
        this.f22124a = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.toString() : null;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("data");
        this.f22134k = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.toString() : null;
        this.f22128e = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("class_name") : null;
        this.f22140q = jSONObject.optString("html_template", null);
        this.f22141r = jSONObject.optString("ad_base_url", null);
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("assets");
        this.f22142s = jSONObjectOptJSONObject3 != null ? jSONObjectOptJSONObject3.toString() : null;
        zzk.zzly();
        this.f22143t = zzamn.m16689a(jSONObject, "template_ids");
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        this.f22144u = jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.toString() : null;
        this.f22145v = jSONObject.optString("response_type", null);
        this.f22146w = jSONObject.optLong("ad_network_timeout_millis", -1L);
    }
}
