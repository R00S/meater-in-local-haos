package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final /* synthetic */ class zzajr {
    /* renamed from: a */
    public static void m16610a(zzajq zzajqVar, String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("(");
        sb.append(str2);
        sb.append(");");
        zzajqVar.mo14917k(sb.toString());
    }

    /* renamed from: b */
    public static void m16611b(zzajq zzajqVar, String str, Map map) {
        try {
            zzajqVar.mo14915j(str, zzk.zzlg().m17176Y(map));
        } catch (JSONException unused) {
            zzbad.m17353i("Could not convert parameters to JSON.");
        }
    }

    /* renamed from: c */
    public static void m16612c(zzajq zzajqVar, String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        zzajqVar.mo15685X(str, jSONObject.toString());
    }

    /* renamed from: d */
    public static void m16613d(zzajq zzajqVar, String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String string = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("'");
        sb.append(",");
        sb.append(string);
        sb.append(");");
        String strValueOf = String.valueOf(sb.toString());
        zzbad.m17349e(strValueOf.length() != 0 ? "Dispatching AFMA event: ".concat(strValueOf) : new String("Dispatching AFMA event: "));
        zzajqVar.mo14917k(sb.toString());
    }
}
