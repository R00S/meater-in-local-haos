package io.rakam.api;

import android.content.Context;
import android.content.SharedPreferences;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Utils.java */
/* renamed from: io.rakam.api.j */
/* loaded from: classes2.dex */
public class C9234j {

    /* renamed from: a */
    private static C9232h f35727a = C9232h.m29964d();

    /* renamed from: a */
    static JSONObject m29985a(JSONObject jSONObject) {
        JSONArray jSONArrayNames;
        if (jSONObject == null) {
            return null;
        }
        if (jSONObject.length() == 0) {
            return new JSONObject();
        }
        try {
            jSONArrayNames = jSONObject.names();
        } catch (ArrayIndexOutOfBoundsException e2) {
            f35727a.m29966b("io.rakam.api.Utils", e2.toString());
            jSONArrayNames = null;
        }
        int length = jSONArrayNames != null ? jSONArrayNames.length() : 0;
        String[] strArr = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            strArr[i2] = jSONArrayNames.optString(i2);
        }
        try {
            return new JSONObject(jSONObject, strArr);
        } catch (JSONException e3) {
            f35727a.m29966b("io.rakam.api.Utils", e3.toString());
            return null;
        }
    }

    /* renamed from: b */
    static SharedPreferences m29986b(Context context, String str) {
        return context.getSharedPreferences("io.rakam.api." + str + "." + context.getPackageName(), 4);
    }

    /* renamed from: c */
    static String m29987c(Context context, String str, String str2) {
        return m29986b(context, str).getString(str2, null);
    }

    /* renamed from: d */
    public static boolean m29988d(String str) {
        return str == null || str.length() == 0;
    }

    /* renamed from: e */
    static String m29989e(String str) {
        if (m29988d(str)) {
            str = "$default_instance";
        }
        return str.toLowerCase();
    }

    /* renamed from: f */
    static void m29990f(Context context, String str, String str2, String str3) {
        SharedPreferences.Editor editorEdit = m29986b(context, str).edit();
        editorEdit.putString(str2, str3);
        editorEdit.apply();
    }
}
