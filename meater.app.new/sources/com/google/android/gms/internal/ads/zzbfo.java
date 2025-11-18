package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzard
/* loaded from: classes2.dex */
public final class zzbfo implements zzaho<zzbdf> {

    /* renamed from: a */
    private boolean f22964a;

    /* renamed from: b */
    private static int m17617b(Context context, Map<String, String> map, String str, int i2) {
        String str2 = map.get(str);
        if (str2 == null) {
            return i2;
        }
        try {
            zzyt.m20844a();
            return zzazt.m17300a(context, Integer.parseInt(str2));
        } catch (NumberFormatException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + str2.length());
            sb.append("Could not parse ");
            sb.append(str);
            sb.append(" in a video GMSG: ");
            sb.append(str2);
            zzbad.m17353i(sb.toString());
            return i2;
        }
    }

    /* renamed from: c */
    private static void m17618c(zzbcq zzbcqVar, Map<String, String> map) {
        String str = map.get("minBufferMs");
        String str2 = map.get("maxBufferMs");
        String str3 = map.get("bufferForPlaybackMs");
        String str4 = map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                zzbcqVar.m17454u(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                zzbad.m17353i(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", str, str2));
                return;
            }
        }
        if (str2 != null) {
            zzbcqVar.m17455v(Integer.parseInt(str2));
        }
        if (str3 != null) {
            zzbcqVar.m17457y(Integer.parseInt(str3));
        }
        if (str4 != null) {
            zzbcqVar.m17458z(Integer.parseInt(str4));
        }
        if (str5 != null) {
            zzbcqVar.m17440A(Integer.parseInt(str5));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaho
    /* renamed from: a */
    public final /* synthetic */ void mo14739a(zzbdf zzbdfVar, Map map) throws NumberFormatException {
        int i2;
        zzbdf zzbdfVar2 = zzbdfVar;
        String str = (String) map.get("action");
        if (str == null) {
            zzbad.m17353i("Action missing from video GMSG.");
            return;
        }
        if (zzbad.m17345a(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String string = jSONObject.toString();
            StringBuilder sb = new StringBuilder(str.length() + 13 + String.valueOf(string).length());
            sb.append("Video GMSG: ");
            sb.append(str);
            sb.append(" ");
            sb.append(string);
            zzbad.m17349e(sb.toString());
        }
        if ("background".equals(str)) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                zzbad.m17353i("Color parameter missing from color video GMSG.");
                return;
            }
            try {
                zzbdfVar2.setBackgroundColor(Color.parseColor(str2));
                return;
            } catch (IllegalArgumentException unused) {
                zzbad.m17353i("Invalid color parameter in video GMSG.");
                return;
            }
        }
        if ("decoderProps".equals(str)) {
            String str3 = (String) map.get("mimeTypes");
            if (str3 == null) {
                zzbad.m17353i("No MIME types specified for decoder properties inspection.");
                zzbcq.m17436p(zzbdfVar2, "missingMimeTypes");
                return;
            }
            if (Build.VERSION.SDK_INT < 16) {
                zzbad.m17353i("Video decoder properties available on API versions >= 16.");
                zzbcq.m17436p(zzbdfVar2, "deficientApiVersion");
                return;
            }
            HashMap map2 = new HashMap();
            for (String str4 : str3.split(",")) {
                map2.put(str4, zzazr.m17291b(str4.trim()));
            }
            zzbcq.m17437q(zzbdfVar2, map2);
            return;
        }
        zzbcw zzbcwVarMo14914i0 = zzbdfVar2.mo14914i0();
        if (zzbcwVarMo14914i0 == null) {
            zzbad.m17353i("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean zEquals = "new".equals(str);
        boolean zEquals2 = "position".equals(str);
        if (zEquals || zEquals2) {
            Context context = zzbdfVar2.getContext();
            int iM17617b = m17617b(context, map, "x", 0);
            int iM17617b2 = m17617b(context, map, "y", 0);
            int iM17617b3 = m17617b(context, map, "w", -1);
            int iM17617b4 = m17617b(context, map, "h", -1);
            int iMin = Math.min(iM17617b3, zzbdfVar2.mo14892U() - iM17617b);
            int iMin2 = Math.min(iM17617b4, zzbdfVar2.mo14908f0() - iM17617b2);
            try {
                i2 = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException unused2) {
                i2 = 0;
            }
            boolean z = Boolean.parseBoolean((String) map.get("spherical"));
            if (!zEquals || zzbcwVarMo14914i0.m17463e() != null) {
                zzbcwVarMo14914i0.m17462d(iM17617b, iM17617b2, iMin, iMin2);
                return;
            }
            zzbcwVarMo14914i0.m17461c(iM17617b, iM17617b2, iMin, iMin2, i2, z, new zzbde((String) map.get("flags")));
            zzbcq zzbcqVarM17463e = zzbcwVarMo14914i0.m17463e();
            if (zzbcqVarM17463e != null) {
                m17618c(zzbcqVarM17463e, map);
                return;
            }
            return;
        }
        zzbhq zzbhqVarMo14911h = zzbdfVar2.mo14911h();
        if (zzbhqVarMo14911h != null) {
            if ("timeupdate".equals(str)) {
                String str5 = (String) map.get("currentTime");
                if (str5 == null) {
                    zzbad.m17353i("currentTime parameter missing from timeupdate video GMSG.");
                    return;
                }
                try {
                    zzbhqVarMo14911h.m17711n7(Float.parseFloat(str5));
                    return;
                } catch (NumberFormatException unused3) {
                    zzbad.m17353i(str5.length() != 0 ? "Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str5) : new String("Could not parse currentTime parameter from timeupdate video GMSG: "));
                    return;
                }
            }
            if ("skip".equals(str)) {
                zzbhqVarMo14911h.m17708k7();
                return;
            }
        }
        zzbcq zzbcqVarM17463e2 = zzbcwVarMo14914i0.m17463e();
        if (zzbcqVarM17463e2 == null) {
            zzbcq.m17438s(zzbdfVar2);
            return;
        }
        if ("click".equals(str)) {
            Context context2 = zzbdfVar2.getContext();
            int iM17617b5 = m17617b(context2, map, "x", 0);
            int iM17617b6 = m17617b(context2, map, "y", 0);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, iM17617b5, iM17617b6, 0);
            zzbcqVarM17463e2.m17441B(motionEventObtain);
            motionEventObtain.recycle();
            return;
        }
        if ("currentTime".equals(str)) {
            String str6 = (String) map.get("time");
            if (str6 == null) {
                zzbad.m17353i("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                zzbcqVarM17463e2.m17450m((int) (Float.parseFloat(str6) * 1000.0f));
                return;
            } catch (NumberFormatException unused4) {
                zzbad.m17353i(str6.length() != 0 ? "Could not parse time parameter from currentTime video GMSG: ".concat(str6) : new String("Could not parse time parameter from currentTime video GMSG: "));
                return;
            }
        }
        if ("hide".equals(str)) {
            zzbcqVarM17463e2.setVisibility(4);
            return;
        }
        if ("load".equals(str)) {
            zzbcqVarM17463e2.m17442C();
            return;
        }
        if ("loadControl".equals(str)) {
            m17618c(zzbcqVarM17463e2, map);
            return;
        }
        if ("muted".equals(str)) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                zzbcqVarM17463e2.m17443D();
                return;
            } else {
                zzbcqVarM17463e2.m17444E();
                return;
            }
        }
        if ("pause".equals(str)) {
            zzbcqVarM17463e2.m17448k();
            return;
        }
        if ("play".equals(str)) {
            zzbcqVarM17463e2.m17449l();
            return;
        }
        if ("show".equals(str)) {
            zzbcqVarM17463e2.setVisibility(0);
            return;
        }
        if ("src".equals(str)) {
            String str7 = (String) map.get("src");
            String[] strArr = {str7};
            String str8 = (String) map.get("demuxed");
            if (str8 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str8);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                        strArr2[i3] = jSONArray.getString(i3);
                    }
                    strArr = strArr2;
                } catch (JSONException unused5) {
                    zzbad.m17353i(str8.length() != 0 ? "Malformed demuxed URL list for playback: ".concat(str8) : new String("Malformed demuxed URL list for playback: "));
                    strArr = new String[]{str7};
                }
            }
            zzbcqVarM17463e2.m17453t(str7, strArr);
            return;
        }
        if ("touchMove".equals(str)) {
            Context context3 = zzbdfVar2.getContext();
            zzbcqVarM17463e2.m17451n(m17617b(context3, map, "dx", 0), m17617b(context3, map, "dy", 0));
            if (this.f22964a) {
                return;
            }
            zzbdfVar2.mo14886N();
            this.f22964a = true;
            return;
        }
        if (!"volume".equals(str)) {
            if ("watermark".equals(str)) {
                zzbcqVarM17463e2.m17445F();
                return;
            } else {
                zzbad.m17353i(str.length() != 0 ? "Unknown video action: ".concat(str) : new String("Unknown video action: "));
                return;
            }
        }
        String str9 = (String) map.get("volume");
        if (str9 == null) {
            zzbad.m17353i("Level parameter missing from volume video GMSG.");
            return;
        }
        try {
            zzbcqVarM17463e2.setVolume(Float.parseFloat(str9));
        } catch (NumberFormatException unused6) {
            zzbad.m17353i(str9.length() != 0 ? "Could not parse volume parameter from volume video GMSG: ".concat(str9) : new String("Could not parse volume parameter from volume video GMSG: "));
        }
    }
}
