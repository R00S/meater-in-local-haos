package androidx.core.view.p005e0;

import android.os.Build;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* compiled from: PathInterpolatorCompat.java */
/* renamed from: androidx.core.view.e0.b */
/* loaded from: classes.dex */
public final class C0295b {
    /* renamed from: a */
    public static Interpolator m2041a(float f2, float f3, float f4, float f5) {
        return Build.VERSION.SDK_INT >= 21 ? new PathInterpolator(f2, f3, f4, f5) : new InterpolatorC0294a(f2, f3, f4, f5);
    }
}
