package com.google.firebase.crashlytics.internal;

import android.util.Log;

/* compiled from: Logger.java */
/* renamed from: com.google.firebase.crashlytics.h.h */
/* loaded from: classes2.dex */
public class C8179h {

    /* renamed from: a */
    static final C8179h f30860a = new C8179h("FirebaseCrashlytics");

    /* renamed from: b */
    private final String f30861b;

    /* renamed from: c */
    private int f30862c = 4;

    public C8179h(String str) {
        this.f30861b = str;
    }

    /* renamed from: a */
    private boolean m25175a(int i2) {
        return this.f30862c <= i2 || Log.isLoggable(this.f30861b, i2);
    }

    /* renamed from: f */
    public static C8179h m25176f() {
        return f30860a;
    }

    /* renamed from: b */
    public void m25177b(String str) {
        m25178c(str, null);
    }

    /* renamed from: c */
    public void m25178c(String str, Throwable th) {
        if (m25175a(3)) {
            Log.d(this.f30861b, str, th);
        }
    }

    /* renamed from: d */
    public void m25179d(String str) {
        m25180e(str, null);
    }

    /* renamed from: e */
    public void m25180e(String str, Throwable th) {
        if (m25175a(6)) {
            Log.e(this.f30861b, str, th);
        }
    }

    /* renamed from: g */
    public void m25181g(String str) {
        m25182h(str, null);
    }

    /* renamed from: h */
    public void m25182h(String str, Throwable th) {
        if (m25175a(4)) {
            Log.i(this.f30861b, str, th);
        }
    }

    /* renamed from: i */
    public void m25183i(String str) {
        m25184j(str, null);
    }

    /* renamed from: j */
    public void m25184j(String str, Throwable th) {
        if (m25175a(2)) {
            Log.v(this.f30861b, str, th);
        }
    }

    /* renamed from: k */
    public void m25185k(String str) {
        m25186l(str, null);
    }

    /* renamed from: l */
    public void m25186l(String str, Throwable th) {
        if (m25175a(5)) {
            Log.w(this.f30861b, str, th);
        }
    }
}
