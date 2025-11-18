package c7;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* renamed from: c7.H, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2330H {

    /* renamed from: e, reason: collision with root package name */
    private static final C2330H f31060e = new C2330H(true, 3, 1, null, null);

    /* renamed from: a, reason: collision with root package name */
    final boolean f31061a;

    /* renamed from: b, reason: collision with root package name */
    final String f31062b;

    /* renamed from: c, reason: collision with root package name */
    final Throwable f31063c;

    /* renamed from: d, reason: collision with root package name */
    final int f31064d;

    private C2330H(boolean z10, int i10, int i11, String str, Throwable th) {
        this.f31061a = z10;
        this.f31064d = i10;
        this.f31062b = str;
        this.f31063c = th;
    }

    @Deprecated
    static C2330H b() {
        return f31060e;
    }

    static C2330H c(String str) {
        return new C2330H(false, 1, 5, str, null);
    }

    static C2330H d(String str, Throwable th) {
        return new C2330H(false, 1, 5, str, th);
    }

    static C2330H f(int i10) {
        return new C2330H(true, i10, 1, null, null);
    }

    static C2330H g(int i10, int i11, String str, Throwable th) {
        return new C2330H(false, i10, i11, str, th);
    }

    String a() {
        return this.f31062b;
    }

    final void e() {
        if (this.f31061a || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.f31063c != null) {
            Log.d("GoogleCertificatesRslt", a(), this.f31063c);
        } else {
            Log.d("GoogleCertificatesRslt", a());
        }
    }
}
