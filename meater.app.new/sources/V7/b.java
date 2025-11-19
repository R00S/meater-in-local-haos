package V7;

import android.R;
import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import j1.C3718c;

/* compiled from: RippleUtils.java */
/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f18152a = true;

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f18153b = {R.attr.state_pressed};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f18154c = {R.attr.state_hovered, R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f18155d = {R.attr.state_focused};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f18156e = {R.attr.state_hovered};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f18157f = {R.attr.state_selected, R.attr.state_pressed};

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f18158g = {R.attr.state_selected, R.attr.state_hovered, R.attr.state_focused};

    /* renamed from: h, reason: collision with root package name */
    private static final int[] f18159h = {R.attr.state_selected, R.attr.state_focused};

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f18160i = {R.attr.state_selected, R.attr.state_hovered};

    /* renamed from: j, reason: collision with root package name */
    private static final int[] f18161j = {R.attr.state_selected};

    /* renamed from: k, reason: collision with root package name */
    private static final int[] f18162k = {R.attr.state_enabled, R.attr.state_pressed};

    /* renamed from: l, reason: collision with root package name */
    static final String f18163l = b.class.getSimpleName();

    private b() {
    }

    public static ColorStateList a(ColorStateList colorStateList) {
        if (f18152a) {
            int[] iArr = f18155d;
            return new ColorStateList(new int[][]{f18161j, iArr, StateSet.NOTHING}, new int[]{c(colorStateList, f18157f), c(colorStateList, iArr), c(colorStateList, f18153b)});
        }
        int[] iArr2 = f18157f;
        int[] iArr3 = f18158g;
        int[] iArr4 = f18159h;
        int[] iArr5 = f18160i;
        int[] iArr6 = f18153b;
        int[] iArr7 = f18154c;
        int[] iArr8 = f18155d;
        int[] iArr9 = f18156e;
        return new ColorStateList(new int[][]{iArr2, iArr3, iArr4, iArr5, f18161j, iArr6, iArr7, iArr8, iArr9, StateSet.NOTHING}, new int[]{c(colorStateList, iArr2), c(colorStateList, iArr3), c(colorStateList, iArr4), c(colorStateList, iArr5), 0, c(colorStateList, iArr6), c(colorStateList, iArr7), c(colorStateList, iArr8), c(colorStateList, iArr9), 0});
    }

    @TargetApi(21)
    private static int b(int i10) {
        return C3718c.k(i10, Math.min(Color.alpha(i10) * 2, 255));
    }

    private static int c(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return f18152a ? b(colorForState) : colorForState;
    }

    public static ColorStateList d(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f18162k, 0)) != 0) {
            Log.w(f18163l, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean e(int[] iArr) {
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 : iArr) {
            if (i10 == 16842910) {
                z10 = true;
            } else if (i10 == 16842908 || i10 == 16842919 || i10 == 16843623) {
                z11 = true;
            }
        }
        return z10 && z11;
    }
}
