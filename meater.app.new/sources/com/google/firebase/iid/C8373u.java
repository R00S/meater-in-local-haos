package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.C0255a;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p024c.p041e.C0867a;

/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
/* renamed from: com.google.firebase.iid.u */
/* loaded from: classes2.dex */
class C8373u {

    /* renamed from: a */
    final SharedPreferences f31761a;

    /* renamed from: b */
    final Context f31762b;

    /* renamed from: c */
    private final Map<String, Long> f31763c = new C0867a();

    /* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
    /* renamed from: com.google.firebase.iid.u$a */
    static class a {

        /* renamed from: a */
        private static final long f31764a = TimeUnit.DAYS.toMillis(7);

        /* renamed from: b */
        final String f31765b;

        /* renamed from: c */
        final String f31766c;

        /* renamed from: d */
        final long f31767d;

        private a(String str, String str2, long j2) {
            this.f31765b = str;
            this.f31766c = str2;
            this.f31767d = j2;
        }

        /* renamed from: a */
        static String m26235a(String str, String str2, long j2) throws JSONException {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j2);
                return jSONObject.toString();
            } catch (JSONException e2) {
                String strValueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 24);
                sb.append("Failed to encode token: ");
                sb.append(strValueOf);
                Log.w("FirebaseInstanceId", sb.toString());
                return null;
            }
        }

        /* renamed from: b */
        static String m26236b(a aVar) {
            if (aVar == null) {
                return null;
            }
            return aVar.f31765b;
        }

        /* renamed from: d */
        static a m26237d(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new a(str, null, 0L);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e2) {
                String strValueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 23);
                sb.append("Failed to parse token: ");
                sb.append(strValueOf);
                Log.w("FirebaseInstanceId", sb.toString());
                return null;
            }
        }

        /* renamed from: c */
        boolean m26238c(String str) {
            return System.currentTimeMillis() > this.f31767d + f31764a || !str.equals(this.f31766c);
        }
    }

    public C8373u(Context context) {
        this.f31762b = context;
        this.f31761a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        m26225a("com.google.android.gms.appid-no-backup");
    }

    /* renamed from: a */
    private void m26225a(String str) {
        File file = new File(C0255a.m1680i(this.f31762b), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || m26232g()) {
                return;
            }
            Log.i("FirebaseInstanceId", "App restored, clearing state");
            m26230d();
        } catch (IOException e2) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String strValueOf = String.valueOf(e2.getMessage());
                Log.d("FirebaseInstanceId", strValueOf.length() != 0 ? "Error creating file in no backup dir: ".concat(strValueOf) : new String("Error creating file in no backup dir: "));
            }
        }
    }

    /* renamed from: b */
    static String m26226b(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 6);
        sb.append(str);
        sb.append("|S|cre");
        return sb.toString();
    }

    /* renamed from: c */
    private String m26227c(String str, String str2, String str3) {
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: e */
    private long m26228e(String str) {
        String string = this.f31761a.getString(m26226b(str, "cre"), null);
        if (string == null) {
            return 0L;
        }
        try {
            return Long.parseLong(string);
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    /* renamed from: j */
    private long m26229j(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f31761a.contains(m26226b(str, "cre"))) {
            return m26228e(str);
        }
        SharedPreferences.Editor editorEdit = this.f31761a.edit();
        editorEdit.putString(m26226b(str, "cre"), String.valueOf(jCurrentTimeMillis));
        editorEdit.commit();
        return jCurrentTimeMillis;
    }

    /* renamed from: d */
    public synchronized void m26230d() {
        this.f31763c.clear();
        this.f31761a.edit().clear().commit();
    }

    /* renamed from: f */
    public synchronized a m26231f(String str, String str2, String str3) {
        return a.m26237d(this.f31761a.getString(m26227c(str, str2, str3), null));
    }

    /* renamed from: g */
    public synchronized boolean m26232g() {
        return this.f31761a.getAll().isEmpty();
    }

    /* renamed from: h */
    public synchronized void m26233h(String str, String str2, String str3, String str4, String str5) {
        String strM26235a = a.m26235a(str4, str5, System.currentTimeMillis());
        if (strM26235a == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f31761a.edit();
        editorEdit.putString(m26227c(str, str2, str3), strM26235a);
        editorEdit.commit();
    }

    /* renamed from: i */
    public synchronized long m26234i(String str) {
        long jM26229j;
        jM26229j = m26229j(str);
        this.f31763c.put(str, Long.valueOf(jM26229j));
        return jM26229j;
    }
}
