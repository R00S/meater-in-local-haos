package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

@zzard
/* loaded from: classes2.dex */
public final class zzbid {

    /* renamed from: a */
    private static final Pattern f23065a = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);

    /* renamed from: b */
    private static final Pattern f23066b = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);

    /* renamed from: a */
    public static String m17731a() throws JSONException {
        String str = (String) zzyt.m20848e().m16421c(zzacu.f21763c0);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", str);
            jSONObject.put("sdk", "Google Mobile Ads");
            jSONObject.put("sdkVersion", "12.4.51-000");
            return "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
        } catch (JSONException e2) {
            zzbad.m17348d("Unable to build MRAID_ENV", e2);
            return null;
        }
    }

    /* renamed from: b */
    public static String m17732b(String str, String... strArr) {
        if (strArr.length == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        Matcher matcher = f23065a.matcher(str);
        int i2 = 0;
        if (matcher.find()) {
            int iEnd = matcher.end();
            sb.append(str.substring(0, iEnd));
            int length = strArr.length;
            while (i2 < length) {
                String str2 = strArr[i2];
                if (str2 != null) {
                    sb.append(str2);
                }
                i2++;
            }
            sb.append(str.substring(iEnd));
        } else {
            if (!f23066b.matcher(str).find()) {
                int length2 = strArr.length;
                while (i2 < length2) {
                    String str3 = strArr[i2];
                    if (str3 != null) {
                        sb.append(str3);
                    }
                    i2++;
                }
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
