package s1;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.InputDevice;
import android.view.ViewConfiguration;
import java.util.Objects;

/* compiled from: ViewConfigurationCompat.java */
/* renamed from: s1.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4422a0 {

    /* compiled from: ViewConfigurationCompat.java */
    /* renamed from: s1.a0$a */
    static class a {
        static float a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }

        static float b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
    }

    /* compiled from: ViewConfigurationCompat.java */
    /* renamed from: s1.a0$b */
    static class b {
        static boolean a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }

    /* compiled from: ViewConfigurationCompat.java */
    /* renamed from: s1.a0$c */
    static class c {
        static int a(ViewConfiguration viewConfiguration, int i10, int i11, int i12) {
            return viewConfiguration.getScaledMaximumFlingVelocity(i10, i11, i12);
        }

        static int b(ViewConfiguration viewConfiguration, int i10, int i11, int i12) {
            return viewConfiguration.getScaledMinimumFlingVelocity(i10, i11, i12);
        }
    }

    private static int a(Resources resources, int i10, r1.j<Integer> jVar, int i11) {
        int dimensionPixelSize;
        return i10 != -1 ? (i10 == 0 || (dimensionPixelSize = resources.getDimensionPixelSize(i10)) < 0) ? i11 : dimensionPixelSize : jVar.get().intValue();
    }

    private static int b(Resources resources, String str, String str2) {
        return resources.getIdentifier(str, str2, "android");
    }

    private static int c(Resources resources, int i10, int i11) {
        if (i10 == 4194304 && i11 == 26) {
            return b(resources, "config_viewMaxRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    private static int d(Resources resources, int i10, int i11) {
        if (i10 == 4194304 && i11 == 26) {
            return b(resources, "config_viewMinRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    public static float e(ViewConfiguration viewConfiguration, Context context) {
        return a.a(viewConfiguration);
    }

    public static int f(Context context, final ViewConfiguration viewConfiguration, int i10, int i11, int i12) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.a(viewConfiguration, i10, i11, i12);
        }
        if (!i(i10, i11, i12)) {
            return Integer.MIN_VALUE;
        }
        Resources resources = context.getResources();
        int iC = c(resources, i12, i11);
        Objects.requireNonNull(viewConfiguration);
        return a(resources, iC, new r1.j() { // from class: s1.Y
            @Override // r1.j
            public final Object get() {
                return Integer.valueOf(viewConfiguration.getScaledMaximumFlingVelocity());
            }
        }, Integer.MIN_VALUE);
    }

    public static int g(Context context, final ViewConfiguration viewConfiguration, int i10, int i11, int i12) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.b(viewConfiguration, i10, i11, i12);
        }
        if (!i(i10, i11, i12)) {
            return Integer.MAX_VALUE;
        }
        Resources resources = context.getResources();
        int iD = d(resources, i12, i11);
        Objects.requireNonNull(viewConfiguration);
        return a(resources, iD, new r1.j() { // from class: s1.Z
            @Override // r1.j
            public final Object get() {
                return Integer.valueOf(viewConfiguration.getScaledMinimumFlingVelocity());
            }
        }, Integer.MAX_VALUE);
    }

    public static float h(ViewConfiguration viewConfiguration, Context context) {
        return a.b(viewConfiguration);
    }

    private static boolean i(int i10, int i11, int i12) {
        InputDevice device = InputDevice.getDevice(i10);
        return (device == null || device.getMotionRange(i11, i12) == null) ? false : true;
    }

    public static boolean j(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.a(viewConfiguration);
        }
        Resources resources = context.getResources();
        int iB = b(resources, "config_showMenuShortcutsWhenKeyboardPresent", "bool");
        return iB != 0 && resources.getBoolean(iB);
    }
}
