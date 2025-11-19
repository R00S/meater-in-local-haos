package X3;

import L3.C1360e;
import L3.w;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;

/* compiled from: LogcatLogger.java */
/* loaded from: classes.dex */
public class c implements w {

    /* renamed from: a, reason: collision with root package name */
    private static final Set<String> f18717a = new HashSet();

    @Override // L3.w
    public void a(String str) {
        e(str, null);
    }

    @Override // L3.w
    public void b(String str, Throwable th) {
        if (C1360e.f9146a) {
            Log.d("LOTTIE", str, th);
        }
    }

    @Override // L3.w
    public void c(String str, Throwable th) {
        Set<String> set = f18717a;
        if (set.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th);
        set.add(str);
    }

    @Override // L3.w
    public void d(String str) {
        c(str, null);
    }

    public void e(String str, Throwable th) {
        if (C1360e.f9146a) {
            Log.d("LOTTIE", str, th);
        }
    }
}
