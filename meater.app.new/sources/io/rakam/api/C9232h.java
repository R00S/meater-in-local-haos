package io.rakam.api;

import android.util.Log;

/* compiled from: RakamLog.java */
/* renamed from: io.rakam.api.h */
/* loaded from: classes2.dex */
public class C9232h {

    /* renamed from: a */
    protected static C9232h f35722a = new C9232h();

    /* renamed from: b */
    private volatile boolean f35723b = true;

    /* renamed from: c */
    private volatile int f35724c = 4;

    private C9232h() {
    }

    /* renamed from: d */
    public static C9232h m29964d() {
        return f35722a;
    }

    /* renamed from: a */
    int m29965a(String str, String str2) {
        if (!this.f35723b || this.f35724c > 3) {
            return 0;
        }
        return Log.d(str, str2);
    }

    /* renamed from: b */
    int m29966b(String str, String str2) {
        if (!this.f35723b || this.f35724c > 6) {
            return 0;
        }
        return Log.e(str, str2);
    }

    /* renamed from: c */
    int m29967c(String str, String str2, Throwable th) {
        if (!this.f35723b || this.f35724c > 6) {
            return 0;
        }
        return Log.e(str, str2, th);
    }

    /* renamed from: e */
    int m29968e(String str, String str2) {
        if (!this.f35723b || this.f35724c > 4) {
            return 0;
        }
        return Log.i(str, str2);
    }

    /* renamed from: f */
    C9232h m29969f(int i2) {
        this.f35724c = i2;
        return f35722a;
    }

    /* renamed from: g */
    int m29970g(String str, String str2) {
        if (!this.f35723b || this.f35724c > 5) {
            return 0;
        }
        return Log.w(str, str2);
    }

    /* renamed from: h */
    int m29971h(String str, Throwable th) {
        if (!this.f35723b || this.f35724c > 5) {
            return 0;
        }
        return Log.w(str, th);
    }
}
