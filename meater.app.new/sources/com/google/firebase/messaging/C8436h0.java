package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
/* renamed from: com.google.firebase.messaging.h0 */
/* loaded from: classes2.dex */
public class C8436h0 {

    /* renamed from: a */
    private final Bundle f31998a;

    public C8436h0(Bundle bundle) {
        if (bundle == null) {
            throw new NullPointerException("data");
        }
        this.f31998a = new Bundle(bundle);
    }

    /* renamed from: d */
    private static int m26548d(String str) {
        int color = Color.parseColor(str);
        if (color != -16777216) {
            return color;
        }
        throw new IllegalArgumentException("Transparent color is invalid");
    }

    /* renamed from: s */
    private static boolean m26549s(String str) {
        return str.startsWith("google.c.a.") || str.equals("from");
    }

    /* renamed from: t */
    public static boolean m26550t(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString(m26552v("gcm.n.e")));
    }

    /* renamed from: u */
    private static boolean m26551u(String str) {
        return str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.");
    }

    /* renamed from: v */
    private static String m26552v(String str) {
        return !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
    }

    /* renamed from: w */
    private String m26553w(String str) {
        if (!this.f31998a.containsKey(str) && str.startsWith("gcm.n.")) {
            String strM26552v = m26552v(str);
            if (this.f31998a.containsKey(strM26552v)) {
                return strM26552v;
            }
        }
        return str;
    }

    /* renamed from: z */
    private static String m26554z(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    /* renamed from: a */
    public boolean m26555a(String str) {
        String strM26569p = m26569p(str);
        return "1".equals(strM26569p) || Boolean.parseBoolean(strM26569p);
    }

    /* renamed from: b */
    public Integer m26556b(String str) {
        String strM26569p = m26569p(str);
        if (TextUtils.isEmpty(strM26569p)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strM26569p));
        } catch (NumberFormatException unused) {
            String strM26554z = m26554z(str);
            StringBuilder sb = new StringBuilder(String.valueOf(strM26554z).length() + 38 + String.valueOf(strM26569p).length());
            sb.append("Couldn't parse value of ");
            sb.append(strM26554z);
            sb.append("(");
            sb.append(strM26569p);
            sb.append(") into an int");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    /* renamed from: c */
    public JSONArray m26557c(String str) {
        String strM26569p = m26569p(str);
        if (TextUtils.isEmpty(strM26569p)) {
            return null;
        }
        try {
            return new JSONArray(strM26569p);
        } catch (JSONException unused) {
            String strM26554z = m26554z(str);
            StringBuilder sb = new StringBuilder(String.valueOf(strM26554z).length() + 50 + String.valueOf(strM26569p).length());
            sb.append("Malformed JSON for key ");
            sb.append(strM26554z);
            sb.append(": ");
            sb.append(strM26569p);
            sb.append(", falling back to default");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    /* renamed from: e */
    int[] m26558e() throws JSONException {
        JSONArray jSONArrayM26557c = m26557c("gcm.n.light_settings");
        if (jSONArrayM26557c == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (jSONArrayM26557c.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            iArr[0] = m26548d(jSONArrayM26557c.optString(0));
            iArr[1] = jSONArrayM26557c.optInt(1);
            iArr[2] = jSONArrayM26557c.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e2) {
            String strValueOf = String.valueOf(jSONArrayM26557c);
            String message = e2.getMessage();
            StringBuilder sb = new StringBuilder(strValueOf.length() + 60 + String.valueOf(message).length());
            sb.append("LightSettings is invalid: ");
            sb.append(strValueOf);
            sb.append(". ");
            sb.append(message);
            sb.append(". Skipping setting LightSettings");
            Log.w("NotificationParams", sb.toString());
            return null;
        } catch (JSONException unused) {
            String strValueOf2 = String.valueOf(jSONArrayM26557c);
            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 58);
            sb2.append("LightSettings is invalid: ");
            sb2.append(strValueOf2);
            sb2.append(". Skipping setting LightSettings");
            Log.w("NotificationParams", sb2.toString());
            return null;
        }
    }

    /* renamed from: f */
    public Uri m26559f() {
        String strM26569p = m26569p("gcm.n.link_android");
        if (TextUtils.isEmpty(strM26569p)) {
            strM26569p = m26569p("gcm.n.link");
        }
        if (TextUtils.isEmpty(strM26569p)) {
            return null;
        }
        return Uri.parse(strM26569p);
    }

    /* renamed from: g */
    public Object[] m26560g(String str) {
        JSONArray jSONArrayM26557c = m26557c(String.valueOf(str).concat("_loc_args"));
        if (jSONArrayM26557c == null) {
            return null;
        }
        int length = jSONArrayM26557c.length();
        String[] strArr = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            strArr[i2] = jSONArrayM26557c.optString(i2);
        }
        return strArr;
    }

    /* renamed from: h */
    public String m26561h(String str) {
        return m26569p(String.valueOf(str).concat("_loc_key"));
    }

    /* renamed from: i */
    public String m26562i(Resources resources, String str, String str2) {
        String strM26561h = m26561h(str2);
        if (TextUtils.isEmpty(strM26561h)) {
            return null;
        }
        int identifier = resources.getIdentifier(strM26561h, "string", str);
        if (identifier == 0) {
            String strM26554z = m26554z(String.valueOf(str2).concat("_loc_key"));
            StringBuilder sb = new StringBuilder(String.valueOf(strM26554z).length() + 49 + String.valueOf(str2).length());
            sb.append(strM26554z);
            sb.append(" resource not found: ");
            sb.append(str2);
            sb.append(" Default value will be used.");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
        Object[] objArrM26560g = m26560g(str2);
        if (objArrM26560g == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, objArrM26560g);
        } catch (MissingFormatArgumentException e2) {
            String strM26554z2 = m26554z(str2);
            String string = Arrays.toString(objArrM26560g);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strM26554z2).length() + 58 + String.valueOf(string).length());
            sb2.append("Missing format argument for ");
            sb2.append(strM26554z2);
            sb2.append(": ");
            sb2.append(string);
            sb2.append(" Default value will be used.");
            Log.w("NotificationParams", sb2.toString(), e2);
            return null;
        }
    }

    /* renamed from: j */
    public Long m26563j(String str) {
        String strM26569p = m26569p(str);
        if (TextUtils.isEmpty(strM26569p)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(strM26569p));
        } catch (NumberFormatException unused) {
            String strM26554z = m26554z(str);
            StringBuilder sb = new StringBuilder(String.valueOf(strM26554z).length() + 38 + String.valueOf(strM26569p).length());
            sb.append("Couldn't parse value of ");
            sb.append(strM26554z);
            sb.append("(");
            sb.append(strM26569p);
            sb.append(") into a long");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    /* renamed from: k */
    public String m26564k() {
        return m26569p("gcm.n.android_channel_id");
    }

    /* renamed from: l */
    Integer m26565l() {
        Integer numM26556b = m26556b("gcm.n.notification_count");
        if (numM26556b == null) {
            return null;
        }
        if (numM26556b.intValue() >= 0) {
            return numM26556b;
        }
        String strValueOf = String.valueOf(numM26556b);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 67);
        sb.append("notificationCount is invalid: ");
        sb.append(strValueOf);
        sb.append(". Skipping setting notificationCount.");
        Log.w("FirebaseMessaging", sb.toString());
        return null;
    }

    /* renamed from: m */
    Integer m26566m() {
        Integer numM26556b = m26556b("gcm.n.notification_priority");
        if (numM26556b == null) {
            return null;
        }
        if (numM26556b.intValue() >= -2 && numM26556b.intValue() <= 2) {
            return numM26556b;
        }
        String strValueOf = String.valueOf(numM26556b);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 72);
        sb.append("notificationPriority is invalid ");
        sb.append(strValueOf);
        sb.append(". Skipping setting notificationPriority.");
        Log.w("FirebaseMessaging", sb.toString());
        return null;
    }

    /* renamed from: n */
    public String m26567n(Resources resources, String str, String str2) {
        String strM26569p = m26569p(str2);
        return !TextUtils.isEmpty(strM26569p) ? strM26569p : m26562i(resources, str, str2);
    }

    /* renamed from: o */
    public String m26568o() {
        String strM26569p = m26569p("gcm.n.sound2");
        return TextUtils.isEmpty(strM26569p) ? m26569p("gcm.n.sound") : strM26569p;
    }

    /* renamed from: p */
    public String m26569p(String str) {
        return this.f31998a.getString(m26553w(str));
    }

    /* renamed from: q */
    public long[] m26570q() throws JSONException {
        JSONArray jSONArrayM26557c = m26557c("gcm.n.vibrate_timings");
        if (jSONArrayM26557c == null) {
            return null;
        }
        try {
            if (jSONArrayM26557c.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = jSONArrayM26557c.length();
            long[] jArr = new long[length];
            for (int i2 = 0; i2 < length; i2++) {
                jArr[i2] = jSONArrayM26557c.optLong(i2);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            String strValueOf = String.valueOf(jSONArrayM26557c);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 74);
            sb.append("User defined vibrateTimings is invalid: ");
            sb.append(strValueOf);
            sb.append(". Skipping setting vibrateTimings.");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    /* renamed from: r */
    Integer m26571r() {
        Integer numM26556b = m26556b("gcm.n.visibility");
        if (numM26556b == null) {
            return null;
        }
        if (numM26556b.intValue() >= -1 && numM26556b.intValue() <= 1) {
            return numM26556b;
        }
        String strValueOf = String.valueOf(numM26556b);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 53);
        sb.append("visibility is invalid: ");
        sb.append(strValueOf);
        sb.append(". Skipping setting visibility.");
        Log.w("NotificationParams", sb.toString());
        return null;
    }

    /* renamed from: x */
    public Bundle m26572x() {
        Bundle bundle = new Bundle(this.f31998a);
        for (String str : this.f31998a.keySet()) {
            if (!m26549s(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    /* renamed from: y */
    public Bundle m26573y() {
        Bundle bundle = new Bundle(this.f31998a);
        for (String str : this.f31998a.keySet()) {
            if (m26551u(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }
}
