package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzard
/* loaded from: classes2.dex */
public final class zzbgc implements zzaho<zzbdf> {
    /* renamed from: b */
    private static Integer m17644b(Map<String, String> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(map.get(str)));
        } catch (NumberFormatException unused) {
            String str2 = map.get(str);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 39 + String.valueOf(str2).length());
            sb.append("Precache invalid numeric parameter '");
            sb.append(str);
            sb.append("': ");
            sb.append(str2);
            zzbad.m17353i(sb.toString());
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaho
    /* renamed from: a */
    public final /* synthetic */ void mo14739a(zzbdf zzbdfVar, Map map) {
        zzbft zzbftVarMo17616a;
        zzbdf zzbdfVar2 = zzbdfVar;
        if (zzbad.m17345a(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String strValueOf = String.valueOf(jSONObject);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 15);
            sb.append("Precache GMSG: ");
            sb.append(strValueOf);
            zzbad.m17349e(sb.toString());
        }
        zzk.zzmc();
        if (map.containsKey("abort")) {
            if (zzbfs.m17619g(zzbdfVar2)) {
                return;
            }
            zzbad.m17353i("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        strArr2[i2] = jSONArray.getString(i2);
                    }
                    strArr = strArr2;
                } catch (JSONException unused) {
                    zzbad.m17353i(str2.length() != 0 ? "Malformed demuxed URL list for precache: ".concat(str2) : new String("Malformed demuxed URL list for precache: "));
                    strArr = null;
                }
            }
            if (strArr == null) {
                strArr = new String[]{str};
            }
            if (zzbfs.m17620h(zzbdfVar2) != null) {
                zzbad.m17353i("Precache task is already running.");
                return;
            }
            if (zzbdfVar2.mo14901c() == null) {
                zzbad.m17353i("Precache requires a dependency provider.");
                return;
            }
            zzbde zzbdeVar = new zzbde((String) map.get("flags"));
            Integer numM17644b = m17644b(map, "player");
            if (numM17644b == null) {
                numM17644b = 0;
            }
            zzbftVarMo17616a = zzbdfVar2.mo14901c().zzbqr.mo17616a(zzbdfVar2, numM17644b.intValue(), null, zzbdeVar);
            new zzbfq(zzbdfVar2, zzbftVarMo17616a, str, strArr).zzvi();
        } else {
            zzbfq zzbfqVarM17620h = zzbfs.m17620h(zzbdfVar2);
            if (zzbfqVarM17620h == null) {
                zzbad.m17353i("Precache must specify a source.");
                return;
            }
            zzbftVarMo17616a = zzbfqVarM17620h.f22966b;
        }
        Integer numM17644b2 = m17644b(map, "minBufferMs");
        if (numM17644b2 != null) {
            zzbftVarMo17616a.mo17635t(numM17644b2.intValue());
        }
        Integer numM17644b3 = m17644b(map, "maxBufferMs");
        if (numM17644b3 != null) {
            zzbftVarMo17616a.mo17636u(numM17644b3.intValue());
        }
        Integer numM17644b4 = m17644b(map, "bufferForPlaybackMs");
        if (numM17644b4 != null) {
            zzbftVarMo17616a.mo17637v(numM17644b4.intValue());
        }
        Integer numM17644b5 = m17644b(map, "bufferForPlaybackAfterRebufferMs");
        if (numM17644b5 != null) {
            zzbftVarMo17616a.mo17638w(numM17644b5.intValue());
        }
    }
}
