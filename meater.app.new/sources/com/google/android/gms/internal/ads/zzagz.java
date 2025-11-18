package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzard
/* loaded from: classes2.dex */
public final class zzagz {

    /* renamed from: a */
    public static final zzaho<zzbgz> f22017a = C7395z.f21346a;

    /* renamed from: b */
    public static final zzaho<zzbgz> f22018b = C6471a0.f18064a;

    /* renamed from: c */
    public static final zzaho<zzbgz> f22019c = C6508b0.f18209a;

    /* renamed from: d */
    public static final zzaho<zzbgz> f22020d = new C6619e0();

    /* renamed from: e */
    public static final zzaho<zzbgz> f22021e = new C6656f0();

    /* renamed from: f */
    public static final zzaho<zzbgz> f22022f = C6545c0.f18374a;

    /* renamed from: g */
    public static final zzaho<Object> f22023g = new C6693g0();

    /* renamed from: h */
    public static final zzaho<zzbgz> f22024h = new C6730h0();

    /* renamed from: i */
    public static final zzaho<zzbgz> f22025i = C6582d0.f18476a;

    /* renamed from: j */
    public static final zzaho<zzbgz> f22026j = new C6767i0();

    /* renamed from: k */
    public static final zzaho<zzbgz> f22027k = new C6804j0();

    /* renamed from: l */
    public static final zzaho<zzbdf> f22028l = new zzbfo();

    /* renamed from: m */
    public static final zzaho<zzbdf> f22029m = new zzbfp();

    /* renamed from: n */
    public static final zzaho<zzbgz> f22030n = new zzagy();

    /* renamed from: o */
    public static final zzahu f22031o = new zzahu();

    /* renamed from: p */
    public static final zzaho<zzbgz> f22032p = new C6841k0();

    /* renamed from: q */
    public static final zzaho<zzbgz> f22033q = new C6878l0();

    /* renamed from: r */
    public static final zzaho<zzbgz> f22034r = new C6915m0();

    /* renamed from: a */
    static final /* synthetic */ void m16563a(zzaji zzajiVar, Map map) throws zzdi {
        String str = (String) map.get("u");
        if (str == null) {
            zzbad.m17353i("URL missing from click GMSG.");
            return;
        }
        Uri uriM19452a = Uri.parse(str);
        try {
            zzdh zzdhVarMo14903d = ((zzbif) zzajiVar).mo14903d();
            if (zzdhVarMo14903d != null && zzdhVarMo14903d.m19454e(uriM19452a)) {
                uriM19452a = zzdhVarMo14903d.m19452a(uriM19452a, ((zzbhx) zzajiVar).getContext(), ((zzbih) zzajiVar).getView(), ((zzbhx) zzajiVar).mo14897a());
            }
        } catch (zzdi unused) {
            zzbad.m17353i(str.length() != 0 ? "Unable to append parameter to URL: ".concat(str) : new String("Unable to append parameter to URL: "));
        }
        zzbhx zzbhxVar = (zzbhx) zzajiVar;
        new zzazi(zzbhxVar.getContext(), ((zzbig) zzajiVar).mo14899b().f22750f, zzavx.m17020b(uriM19452a, zzbhxVar.getContext())).zzvi();
    }

    /* renamed from: b */
    static final /* synthetic */ void m16564b(zzbhx zzbhxVar, Map map) {
        String str = (String) map.get("u");
        if (str == null) {
            zzbad.m17353i("URL missing from httpTrack GMSG.");
        } else {
            new zzazi(zzbhxVar.getContext(), ((zzbig) zzbhxVar).mo14899b().f22750f, str).zzvi();
        }
    }

    /* renamed from: c */
    static final /* synthetic */ void m16565c(zzbif zzbifVar, Map map) throws NumberFormatException {
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int i2 = Integer.parseInt(str);
            int i3 = Integer.parseInt(str2);
            int i4 = Integer.parseInt(str3);
            zzdh zzdhVarMo14903d = zzbifVar.mo14903d();
            if (zzdhVarMo14903d != null) {
                zzdhVarMo14903d.m19455f().zza(i2, i3, i4);
            }
        } catch (NumberFormatException unused) {
            zzbad.m17353i("Could not parse touch parameters from gmsg.");
        }
    }

    /* renamed from: d */
    static final /* synthetic */ void m16566d(zzbhx zzbhxVar, Map map) throws JSONException, URISyntaxException {
        PackageManager packageManager = zzbhxVar.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                        String strOptString = jSONObject2.optString(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID);
                        String strOptString2 = jSONObject2.optString("u");
                        String strOptString3 = jSONObject2.optString("i");
                        String strOptString4 = jSONObject2.optString("m");
                        String strOptString5 = jSONObject2.optString("p");
                        String strOptString6 = jSONObject2.optString("c");
                        jSONObject2.optString("f");
                        jSONObject2.optString("e");
                        String strOptString7 = jSONObject2.optString("intent_url");
                        Intent uri = null;
                        if (!TextUtils.isEmpty(strOptString7)) {
                            try {
                                uri = Intent.parseUri(strOptString7, 0);
                            } catch (URISyntaxException e2) {
                                String strValueOf = String.valueOf(strOptString7);
                                zzbad.m17347c(strValueOf.length() != 0 ? "Error parsing the url: ".concat(strValueOf) : new String("Error parsing the url: "), e2);
                            }
                        }
                        if (uri == null) {
                            uri = new Intent();
                            if (!TextUtils.isEmpty(strOptString2)) {
                                uri.setData(Uri.parse(strOptString2));
                            }
                            if (!TextUtils.isEmpty(strOptString3)) {
                                uri.setAction(strOptString3);
                            }
                            if (!TextUtils.isEmpty(strOptString4)) {
                                uri.setType(strOptString4);
                            }
                            if (!TextUtils.isEmpty(strOptString5)) {
                                uri.setPackage(strOptString5);
                            }
                            if (!TextUtils.isEmpty(strOptString6)) {
                                String[] strArrSplit = strOptString6.split("/", 2);
                                if (strArrSplit.length == 2) {
                                    uri.setComponent(new ComponentName(strArrSplit[0], strArrSplit[1]));
                                }
                            }
                        }
                        try {
                            jSONObject.put(strOptString, packageManager.resolveActivity(uri, 65536) != null);
                        } catch (JSONException e3) {
                            zzbad.m17347c("Error constructing openable urls response.", e3);
                        }
                    } catch (JSONException e4) {
                        zzbad.m17347c("Error parsing the intent data.", e4);
                    }
                }
                ((zzaji) zzbhxVar).mo14915j("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((zzaji) zzbhxVar).mo14915j("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((zzaji) zzbhxVar).mo14915j("openableIntents", new JSONObject());
        }
    }

    /* renamed from: e */
    static final /* synthetic */ void m16567e(zzbhx zzbhxVar, Map map) {
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            zzbad.m17353i("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] strArrSplit = str.split(",");
        HashMap map2 = new HashMap();
        PackageManager packageManager = zzbhxVar.getContext().getPackageManager();
        for (String str2 : strArrSplit) {
            String[] strArrSplit2 = str2.split(";", 2);
            boolean z = true;
            if (packageManager.resolveActivity(new Intent(strArrSplit2.length > 1 ? strArrSplit2[1].trim() : "android.intent.action.VIEW", Uri.parse(strArrSplit2[0].trim())), 65536) == null) {
                z = false;
            }
            map2.put(str2, Boolean.valueOf(z));
        }
        ((zzaji) zzbhxVar).mo14940y("openableURLs", map2);
    }
}
