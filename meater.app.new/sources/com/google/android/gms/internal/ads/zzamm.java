package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzard
/* loaded from: classes2.dex */
public final class zzamm {

    /* renamed from: a */
    public final List<zzaml> f22147a;

    /* renamed from: b */
    private final long f22148b;

    /* renamed from: c */
    private final List<String> f22149c;

    /* renamed from: d */
    private final List<String> f22150d;

    /* renamed from: e */
    private final List<String> f22151e;

    /* renamed from: f */
    private final List<String> f22152f;

    /* renamed from: g */
    private final List<String> f22153g;

    /* renamed from: h */
    private final boolean f22154h;

    /* renamed from: i */
    private final String f22155i;

    /* renamed from: j */
    private final long f22156j;

    /* renamed from: k */
    private final String f22157k;

    /* renamed from: l */
    private final int f22158l;

    /* renamed from: m */
    private final int f22159m;

    /* renamed from: n */
    private final long f22160n;

    /* renamed from: o */
    private final boolean f22161o;

    /* renamed from: p */
    private final boolean f22162p;

    /* renamed from: q */
    private final boolean f22163q;

    /* renamed from: r */
    private final boolean f22164r;

    /* renamed from: s */
    private int f22165s;

    /* renamed from: t */
    private int f22166t;

    /* renamed from: u */
    private boolean f22167u;

    public zzamm(JSONObject jSONObject) throws JSONException {
        if (zzbad.m17345a(2)) {
            String strValueOf = String.valueOf(jSONObject.toString(2));
            zzawz.m17082m(strValueOf.length() != 0 ? "Mediation Response JSON: ".concat(strValueOf) : new String("Mediation Response JSON: "));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i2 = -1;
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            try {
                zzaml zzamlVar = new zzaml(jSONArray.getJSONObject(i3));
                boolean z = true;
                if ("banner".equalsIgnoreCase(zzamlVar.f22145v)) {
                    this.f22167u = true;
                }
                arrayList.add(zzamlVar);
                if (i2 < 0) {
                    Iterator<String> it = zzamlVar.f22126c.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                break;
                            }
                        } else {
                            z = false;
                            break;
                        }
                    }
                    if (z) {
                        i2 = i3;
                    }
                }
            } catch (JSONException unused) {
            }
        }
        this.f22165s = i2;
        this.f22166t = jSONArray.length();
        this.f22147a = Collections.unmodifiableList(arrayList);
        this.f22155i = jSONObject.optString("qdata");
        this.f22159m = jSONObject.optInt("fs_model_type", -1);
        this.f22160n = jSONObject.optLong("timeout_ms", -1L);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("settings");
        if (jSONObjectOptJSONObject == null) {
            this.f22148b = -1L;
            this.f22149c = null;
            this.f22150d = null;
            this.f22151e = null;
            this.f22152f = null;
            this.f22153g = null;
            this.f22156j = -1L;
            this.f22157k = null;
            this.f22158l = 0;
            this.f22161o = false;
            this.f22154h = false;
            this.f22162p = false;
            this.f22163q = false;
            this.f22164r = false;
            return;
        }
        this.f22148b = jSONObjectOptJSONObject.optLong("ad_network_timeout_millis", -1L);
        zzk.zzly();
        this.f22149c = zzamn.m16689a(jSONObjectOptJSONObject, "click_urls");
        zzk.zzly();
        this.f22150d = zzamn.m16689a(jSONObjectOptJSONObject, "imp_urls");
        zzk.zzly();
        this.f22151e = zzamn.m16689a(jSONObjectOptJSONObject, "downloaded_imp_urls");
        zzk.zzly();
        this.f22152f = zzamn.m16689a(jSONObjectOptJSONObject, "nofill_urls");
        zzk.zzly();
        this.f22153g = zzamn.m16689a(jSONObjectOptJSONObject, "remote_ping_urls");
        this.f22154h = jSONObjectOptJSONObject.optBoolean("render_in_browser", false);
        long jOptLong = jSONObjectOptJSONObject.optLong("refresh", -1L);
        this.f22156j = jOptLong > 0 ? 1000 * jOptLong : -1L;
        zzato zzatoVarM16942y = zzato.m16942y(jSONObjectOptJSONObject.optJSONArray("rewards"));
        if (zzatoVarM16942y == null) {
            this.f22157k = null;
            this.f22158l = 0;
        } else {
            this.f22157k = zzatoVarM16942y.f22516f;
            this.f22158l = zzatoVarM16942y.f22517g;
        }
        this.f22161o = jSONObjectOptJSONObject.optBoolean("use_displayed_impression", false);
        this.f22162p = jSONObjectOptJSONObject.optBoolean("allow_pub_rendered_attribution", false);
        this.f22163q = jSONObjectOptJSONObject.optBoolean("allow_pub_owned_ad_view", false);
        this.f22164r = jSONObjectOptJSONObject.optBoolean("allow_custom_click_gesture", false);
    }
}
