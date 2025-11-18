package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import g7.C3443n;
import java.util.regex.Pattern;

/* compiled from: TopicOperation.java */
/* loaded from: classes2.dex */
final class Z {

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f38323d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a, reason: collision with root package name */
    private final String f38324a;

    /* renamed from: b, reason: collision with root package name */
    private final String f38325b;

    /* renamed from: c, reason: collision with root package name */
    private final String f38326c;

    private Z(String str, String str2) {
        this.f38324a = d(str2, str);
        this.f38325b = str;
        this.f38326c = str + "!" + str2;
    }

    static Z a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("!", -1);
        if (strArrSplit.length != 2) {
            return null;
        }
        return new Z(strArrSplit[0], strArrSplit[1]);
    }

    private static String d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str == null || !f38323d.matcher(str).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        return str;
    }

    public String b() {
        return this.f38325b;
    }

    public String c() {
        return this.f38324a;
    }

    public String e() {
        return this.f38326c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z10 = (Z) obj;
        return this.f38324a.equals(z10.f38324a) && this.f38325b.equals(z10.f38325b);
    }

    public int hashCode() {
        return C3443n.b(this.f38325b, this.f38324a);
    }
}
