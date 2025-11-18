package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import java.util.regex.Pattern;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
/* renamed from: com.google.firebase.messaging.q0 */
/* loaded from: classes2.dex */
final class C8454q0 {

    /* renamed from: a */
    private static final Pattern f32039a = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: b */
    private final String f32040b;

    /* renamed from: c */
    private final String f32041c;

    /* renamed from: d */
    private final String f32042d;

    private C8454q0(String str, String str2) {
        this.f32040b = m26626d(str2, str);
        this.f32041c = str;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("!");
        sb.append(str2);
        this.f32042d = sb.toString();
    }

    /* renamed from: a */
    static C8454q0 m26625a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("!", -1);
        if (strArrSplit.length != 2) {
            return null;
        }
        return new C8454q0(strArrSplit[0], strArrSplit[1]);
    }

    /* renamed from: d */
    private static String m26626d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str == null || !f32039a.matcher(str).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        return str;
    }

    /* renamed from: b */
    public String m26627b() {
        return this.f32041c;
    }

    /* renamed from: c */
    public String m26628c() {
        return this.f32040b;
    }

    /* renamed from: e */
    public String m26629e() {
        return this.f32042d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8454q0)) {
            return false;
        }
        C8454q0 c8454q0 = (C8454q0) obj;
        return this.f32040b.equals(c8454q0.f32040b) && this.f32041c.equals(c8454q0.f32041c);
    }

    public int hashCode() {
        return Objects.m14356b(this.f32041c, this.f32040b);
    }
}
