package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import j1.C3718c;

/* compiled from: ThemeUtils.java */
/* loaded from: classes.dex */
public class V {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f21579a = new ThreadLocal<>();

    /* renamed from: b, reason: collision with root package name */
    static final int[] f21580b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    static final int[] f21581c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    static final int[] f21582d = {R.attr.state_activated};

    /* renamed from: e, reason: collision with root package name */
    static final int[] f21583e = {R.attr.state_pressed};

    /* renamed from: f, reason: collision with root package name */
    static final int[] f21584f = {R.attr.state_checked};

    /* renamed from: g, reason: collision with root package name */
    static final int[] f21585g = {R.attr.state_selected};

    /* renamed from: h, reason: collision with root package name */
    static final int[] f21586h = {-16842919, -16842908};

    /* renamed from: i, reason: collision with root package name */
    static final int[] f21587i = new int[0];

    /* renamed from: j, reason: collision with root package name */
    private static final int[] f21588j = new int[1];

    public static void a(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i.j.f42805y0);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(i.j.f42578D0)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i10) {
        ColorStateList colorStateListE = e(context, i10);
        if (colorStateListE != null && colorStateListE.isStateful()) {
            return colorStateListE.getColorForState(f21580b, colorStateListE.getDefaultColor());
        }
        TypedValue typedValueF = f();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValueF, true);
        return d(context, i10, typedValueF.getFloat());
    }

    public static int c(Context context, int i10) {
        int[] iArr = f21588j;
        iArr[0] = i10;
        a0 a0VarU = a0.u(context, null, iArr);
        try {
            return a0VarU.b(0, 0);
        } finally {
            a0VarU.x();
        }
    }

    static int d(Context context, int i10, float f10) {
        return C3718c.k(c(context, i10), Math.round(Color.alpha(r0) * f10));
    }

    public static ColorStateList e(Context context, int i10) {
        int[] iArr = f21588j;
        iArr[0] = i10;
        a0 a0VarU = a0.u(context, null, iArr);
        try {
            return a0VarU.c(0);
        } finally {
            a0VarU.x();
        }
    }

    private static TypedValue f() {
        ThreadLocal<TypedValue> threadLocal = f21579a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
