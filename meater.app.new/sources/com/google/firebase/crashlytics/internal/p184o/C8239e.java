package com.google.firebase.crashlytics.internal.p184o;

import com.google.firebase.crashlytics.internal.C8179h;
import com.google.firebase.crashlytics.internal.p183n.C8228t;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import okhttp3.HttpUrl;

/* compiled from: KeysMap.java */
/* renamed from: com.google.firebase.crashlytics.h.o.e */
/* loaded from: classes2.dex */
class C8239e {

    /* renamed from: a */
    private final Map<String, String> f31076a = new HashMap();

    /* renamed from: b */
    private final int f31077b;

    /* renamed from: c */
    private final int f31078c;

    public C8239e(int i2, int i3) {
        this.f31077b = i2;
        this.f31078c = i3;
    }

    /* renamed from: b */
    private String m25468b(String str) {
        if (str != null) {
            return m25469c(str, this.f31078c);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    /* renamed from: c */
    public static String m25469c(String str, int i2) {
        if (str == null) {
            return str;
        }
        String strTrim = str.trim();
        return strTrim.length() > i2 ? strTrim.substring(0, i2) : strTrim;
    }

    /* renamed from: a */
    public synchronized Map<String, String> m25470a() {
        return Collections.unmodifiableMap(new HashMap(this.f31076a));
    }

    /* renamed from: d */
    public synchronized boolean m25471d(String str, String str2) {
        String strM25468b = m25468b(str);
        if (this.f31076a.size() >= this.f31077b && !this.f31076a.containsKey(strM25468b)) {
            C8179h.m25176f().m25185k("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f31077b);
            return false;
        }
        String strM25469c = m25469c(str2, this.f31078c);
        if (C8228t.m25354y(this.f31076a.get(strM25468b), strM25469c)) {
            return false;
        }
        Map<String, String> map = this.f31076a;
        if (str2 == null) {
            strM25469c = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        map.put(strM25468b, strM25469c);
        return true;
    }

    /* renamed from: e */
    public synchronized void m25472e(Map<String, String> map) {
        int i2 = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String strM25468b = m25468b(entry.getKey());
            if (this.f31076a.size() < this.f31077b || this.f31076a.containsKey(strM25468b)) {
                String value = entry.getValue();
                this.f31076a.put(strM25468b, value == null ? HttpUrl.FRAGMENT_ENCODE_SET : m25469c(value, this.f31078c));
            } else {
                i2++;
            }
        }
        if (i2 > 0) {
            C8179h.m25176f().m25185k("Ignored " + i2 + " entries when adding custom keys. Maximum allowable: " + this.f31077b);
        }
    }
}
