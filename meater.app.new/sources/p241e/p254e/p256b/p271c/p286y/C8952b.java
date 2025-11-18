package p241e.p254e.p256b.p271c.p286y;

import android.R;
import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import p024c.p052i.p053e.C0923a;

/* compiled from: RippleUtils.java */
/* renamed from: e.e.b.c.y.b */
/* loaded from: classes2.dex */
public class C8952b {

    /* renamed from: a */
    public static final boolean f34450a;

    /* renamed from: b */
    private static final int[] f34451b;

    /* renamed from: c */
    private static final int[] f34452c;

    /* renamed from: d */
    private static final int[] f34453d;

    /* renamed from: e */
    private static final int[] f34454e;

    /* renamed from: f */
    private static final int[] f34455f;

    /* renamed from: g */
    private static final int[] f34456g;

    /* renamed from: h */
    private static final int[] f34457h;

    /* renamed from: i */
    private static final int[] f34458i;

    /* renamed from: j */
    private static final int[] f34459j;

    /* renamed from: k */
    private static final int[] f34460k;

    /* renamed from: l */
    static final String f34461l;

    static {
        f34450a = Build.VERSION.SDK_INT >= 21;
        f34451b = new int[]{R.attr.state_pressed};
        f34452c = new int[]{R.attr.state_hovered, R.attr.state_focused};
        f34453d = new int[]{R.attr.state_focused};
        f34454e = new int[]{R.attr.state_hovered};
        f34455f = new int[]{R.attr.state_selected, R.attr.state_pressed};
        f34456g = new int[]{R.attr.state_selected, R.attr.state_hovered, R.attr.state_focused};
        f34457h = new int[]{R.attr.state_selected, R.attr.state_focused};
        f34458i = new int[]{R.attr.state_selected, R.attr.state_hovered};
        f34459j = new int[]{R.attr.state_selected};
        f34460k = new int[]{R.attr.state_enabled, R.attr.state_pressed};
        f34461l = C8952b.class.getSimpleName();
    }

    private C8952b() {
    }

    /* renamed from: a */
    public static ColorStateList m28519a(ColorStateList colorStateList) {
        if (f34450a) {
            return new ColorStateList(new int[][]{f34459j, StateSet.NOTHING}, new int[]{m28521c(colorStateList, f34455f), m28521c(colorStateList, f34451b)});
        }
        int[] iArr = f34455f;
        int[] iArr2 = f34456g;
        int[] iArr3 = f34457h;
        int[] iArr4 = f34458i;
        int[] iArr5 = f34451b;
        int[] iArr6 = f34452c;
        int[] iArr7 = f34453d;
        int[] iArr8 = f34454e;
        return new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, f34459j, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{m28521c(colorStateList, iArr), m28521c(colorStateList, iArr2), m28521c(colorStateList, iArr3), m28521c(colorStateList, iArr4), 0, m28521c(colorStateList, iArr5), m28521c(colorStateList, iArr6), m28521c(colorStateList, iArr7), m28521c(colorStateList, iArr8), 0});
    }

    @TargetApi(21)
    /* renamed from: b */
    private static int m28520b(int i2) {
        return C0923a.m5887o(i2, Math.min(Color.alpha(i2) * 2, 255));
    }

    /* renamed from: c */
    private static int m28521c(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return f34450a ? m28520b(colorForState) : colorForState;
    }

    /* renamed from: d */
    public static ColorStateList m28522d(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 22 && i2 <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f34460k, 0)) != 0) {
            Log.w(f34461l, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    /* renamed from: e */
    public static boolean m28523e(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i2 : iArr) {
            if (i2 == 16842910) {
                z = true;
            } else if (i2 == 16842908 || i2 == 16842919 || i2 == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
