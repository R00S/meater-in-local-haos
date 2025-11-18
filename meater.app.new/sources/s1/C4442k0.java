package s1;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* compiled from: WindowCompat.java */
/* renamed from: s1.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4442k0 {

    /* compiled from: WindowCompat.java */
    /* renamed from: s1.k0$a */
    static class a {
        static void a(Window window, boolean z10) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z10 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    /* compiled from: WindowCompat.java */
    /* renamed from: s1.k0$b */
    static class b {
        static void a(Window window, boolean z10) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z10 ? systemUiVisibility & (-257) : systemUiVisibility | 256);
            window.setDecorFitsSystemWindows(z10);
        }
    }

    /* compiled from: WindowCompat.java */
    /* renamed from: s1.k0$c */
    static class c {
        static void a(Window window, boolean z10) {
            window.setDecorFitsSystemWindows(z10);
        }
    }

    public static X0 a(Window window, View view) {
        return new X0(window, view);
    }

    public static void b(Window window, boolean z10) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            c.a(window, z10);
        } else if (i10 >= 30) {
            b.a(window, z10);
        } else {
            a.a(window, z10);
        }
    }
}
