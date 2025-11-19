package u1;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* compiled from: PathInterpolatorCompat.java */
/* renamed from: u1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4661a {

    /* compiled from: PathInterpolatorCompat.java */
    /* renamed from: u1.a$a, reason: collision with other inner class name */
    static class C0717a {
        static Interpolator a(float f10, float f11, float f12, float f13) {
            return new PathInterpolator(f10, f11, f12, f13);
        }

        static Interpolator b(Path path) {
            return new PathInterpolator(path);
        }
    }

    public static Interpolator a(float f10, float f11, float f12, float f13) {
        return C0717a.a(f10, f11, f12, f13);
    }

    public static Interpolator b(Path path) {
        return C0717a.b(path);
    }
}
