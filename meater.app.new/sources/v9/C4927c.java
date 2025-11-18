package v9;

import android.util.Log;

/* compiled from: LogWrapper.java */
/* renamed from: v9.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C4927c {

    /* renamed from: a, reason: collision with root package name */
    private static C4927c f51593a;

    private C4927c() {
    }

    public static synchronized C4927c c() {
        try {
            if (f51593a == null) {
                f51593a = new C4927c();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f51593a;
    }

    void a(String str) {
        Log.d("FirebasePerformance", str);
    }

    void b(String str) {
        Log.e("FirebasePerformance", str);
    }

    void d(String str) {
        Log.i("FirebasePerformance", str);
    }

    void e(String str) {
        Log.w("FirebasePerformance", str);
    }
}
