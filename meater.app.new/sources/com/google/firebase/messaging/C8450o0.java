package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.C0255a;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
/* renamed from: com.google.firebase.messaging.o0 */
/* loaded from: classes2.dex */
class C8450o0 {

    /* renamed from: a */
    final SharedPreferences f32027a;

    /* renamed from: b */
    final Context f32028b;

    /* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
    /* renamed from: com.google.firebase.messaging.o0$a */
    static class a {

        /* renamed from: a */
        private static final long f32029a = TimeUnit.DAYS.toMillis(7);

        /* renamed from: b */
        final String f32030b;

        /* renamed from: c */
        final String f32031c;

        /* renamed from: d */
        final long f32032d;

        private a(String str, String str2, long j2) {
            this.f32030b = str;
            this.f32031c = str2;
            this.f32032d = j2;
        }

        /* renamed from: a */
        static String m26609a(String str, String str2, long j2) throws JSONException {
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
                Log.w("FirebaseMessaging", sb.toString());
                return null;
            }
        }

        /* renamed from: c */
        static a m26610c(String str) {
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
                Log.w("FirebaseMessaging", sb.toString());
                return null;
            }
        }

        /* renamed from: b */
        boolean m26611b(String str) {
            return System.currentTimeMillis() > this.f32032d + f32029a || !str.equals(this.f32031c);
        }
    }

    public C8450o0(Context context) {
        this.f32028b = context;
        this.f32027a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        m26603a("com.google.android.gms.appid-no-backup");
    }

    /* renamed from: a */
    private void m26603a(String str) {
        File file = new File(C0255a.m1680i(this.f32028b), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || m26607e()) {
                return;
            }
            Log.i("FirebaseMessaging", "App restored, clearing state");
            m26605c();
        } catch (IOException e2) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                String strValueOf = String.valueOf(e2.getMessage());
                Log.d("FirebaseMessaging", strValueOf.length() != 0 ? "Error creating file in no backup dir: ".concat(strValueOf) : new String("Error creating file in no backup dir: "));
            }
        }
    }

    /* renamed from: b */
    private String m26604b(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 5 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|*");
        return sb.toString();
    }

    /* renamed from: c */
    public synchronized void m26605c() {
        this.f32027a.edit().clear().commit();
    }

    /* renamed from: d */
    public synchronized a m26606d(String str, String str2) {
        return a.m26610c(this.f32027a.getString(m26604b(str, str2), null));
    }

    /* renamed from: e */
    public synchronized boolean m26607e() {
        return this.f32027a.getAll().isEmpty();
    }

    /* renamed from: f */
    public synchronized void m26608f(String str, String str2, String str3, String str4) {
        String strM26609a = a.m26609a(str3, str4, System.currentTimeMillis());
        if (strM26609a == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f32027a.edit();
        editorEdit.putString(m26604b(str, str2), strM26609a);
        editorEdit.commit();
    }
}
