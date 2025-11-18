package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import p024c.p025a.C0832j;
import p024c.p052i.p053e.C0923a;

/* compiled from: ThemeUtils.java */
/* renamed from: androidx.appcompat.widget.l0 */
/* loaded from: classes.dex */
public class C0175l0 {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f1205a = new ThreadLocal<>();

    /* renamed from: b */
    static final int[] f1206b = {-16842910};

    /* renamed from: c */
    static final int[] f1207c = {R.attr.state_focused};

    /* renamed from: d */
    static final int[] f1208d = {R.attr.state_activated};

    /* renamed from: e */
    static final int[] f1209e = {R.attr.state_pressed};

    /* renamed from: f */
    static final int[] f1210f = {R.attr.state_checked};

    /* renamed from: g */
    static final int[] f1211g = {R.attr.state_selected};

    /* renamed from: h */
    static final int[] f1212h = {-16842919, -16842908};

    /* renamed from: i */
    static final int[] f1213i = new int[0];

    /* renamed from: j */
    private static final int[] f1214j = new int[1];

    /* renamed from: a */
    public static void m1068a(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C0832j.f5454z0);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(C0832j.f5220E0)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static int m1069b(Context context, int i2) {
        ColorStateList colorStateListM1072e = m1072e(context, i2);
        if (colorStateListM1072e != null && colorStateListM1072e.isStateful()) {
            return colorStateListM1072e.getColorForState(f1206b, colorStateListM1072e.getDefaultColor());
        }
        TypedValue typedValueM1073f = m1073f();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValueM1073f, true);
        return m1071d(context, i2, typedValueM1073f.getFloat());
    }

    /* renamed from: c */
    public static int m1070c(Context context, int i2) {
        int[] iArr = f1214j;
        iArr[0] = i2;
        C0185q0 c0185q0M1090u = C0185q0.m1090u(context, null, iArr);
        try {
            return c0185q0M1090u.m1093b(0, 0);
        } finally {
            c0185q0M1090u.m1111w();
        }
    }

    /* renamed from: d */
    static int m1071d(Context context, int i2, float f2) {
        return C0923a.m5887o(m1070c(context, i2), Math.round(Color.alpha(r0) * f2));
    }

    /* renamed from: e */
    public static ColorStateList m1072e(Context context, int i2) {
        int[] iArr = f1214j;
        iArr[0] = i2;
        C0185q0 c0185q0M1090u = C0185q0.m1090u(context, null, iArr);
        try {
            return c0185q0M1090u.m1094c(0);
        } finally {
            c0185q0M1090u.m1111w();
        }
    }

    /* renamed from: f */
    private static TypedValue m1073f() {
        ThreadLocal<TypedValue> threadLocal = f1205a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
