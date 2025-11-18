package s1;

import android.graphics.Insets;
import android.os.Build;
import android.view.DisplayCutout;
import j1.C3719d;
import r1.C4337d;

/* compiled from: DisplayCutoutCompat.java */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final DisplayCutout f49188a;

    /* compiled from: DisplayCutoutCompat.java */
    static class a {
        static int a(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        static int b(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        static int c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        static int d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    /* compiled from: DisplayCutoutCompat.java */
    static class b {
        static Insets a(DisplayCutout displayCutout) {
            return displayCutout.getWaterfallInsets();
        }
    }

    private r(DisplayCutout displayCutout) {
        this.f49188a = displayCutout;
    }

    static r f(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new r(displayCutout);
    }

    public int a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.a(this.f49188a);
        }
        return 0;
    }

    public int b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.b(this.f49188a);
        }
        return 0;
    }

    public int c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.c(this.f49188a);
        }
        return 0;
    }

    public int d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.d(this.f49188a);
        }
        return 0;
    }

    public C3719d e() {
        return Build.VERSION.SDK_INT >= 30 ? C3719d.d(b.a(this.f49188a)) : C3719d.f43449e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        return C4337d.a(this.f49188a, ((r) obj).f49188a);
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.f49188a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f49188a + "}";
    }
}
