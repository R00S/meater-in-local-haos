package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import android.util.Log;
import androidx.core.graphics.drawable.C0265a;
import androidx.core.graphics.drawable.InterfaceC0267c;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import p024c.p025a.p028l.p029a.C0836c;

/* compiled from: DrawableUtils.java */
@SuppressLint({"RestrictedAPI"})
/* renamed from: androidx.appcompat.widget.y */
/* loaded from: classes.dex */
public class C0200y {

    /* renamed from: a */
    private static final int[] f1325a = {R.attr.state_checked};

    /* renamed from: b */
    private static final int[] f1326b = new int[0];

    /* renamed from: c */
    public static final Rect f1327c = new Rect();

    /* renamed from: d */
    private static Class<?> f1328d;

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                f1328d = Class.forName("android.graphics.Insets");
            } catch (ClassNotFoundException unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static boolean m1234a(Drawable drawable) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 15 && (drawable instanceof InsetDrawable)) {
            return false;
        }
        if (i2 < 15 && (drawable instanceof GradientDrawable)) {
            return false;
        }
        if (i2 < 17 && (drawable instanceof LayerDrawable)) {
            return false;
        }
        if (!(drawable instanceof DrawableContainer)) {
            if (drawable instanceof InterfaceC0267c) {
                return m1234a(((InterfaceC0267c) drawable).mo1823b());
            }
            if (drawable instanceof C0836c) {
                return m1234a(((C0836c) drawable).m5326a());
            }
            if (drawable instanceof ScaleDrawable) {
                return m1234a(((ScaleDrawable) drawable).getDrawable());
            }
            return true;
        }
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
            return true;
        }
        for (Drawable drawable2 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
            if (!m1234a(drawable2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    static void m1235b(Drawable drawable) {
        if (Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            m1236c(drawable);
        }
    }

    /* renamed from: c */
    private static void m1236c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f1325a);
        } else {
            drawable.setState(f1326b);
        }
        drawable.setState(state);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: d */
    public static Rect m1237d(Drawable drawable) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 29) {
            Insets opticalInsets = drawable.getOpticalInsets();
            Rect rect = new Rect();
            rect.left = opticalInsets.left;
            rect.right = opticalInsets.right;
            rect.top = opticalInsets.top;
            rect.bottom = opticalInsets.bottom;
            return rect;
        }
        if (f1328d != null) {
            try {
                Drawable drawableM1820q = C0265a.m1820q(drawable);
                Object objInvoke = drawableM1820q.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(drawableM1820q, new Object[0]);
                if (objInvoke != null) {
                    Rect rect2 = new Rect();
                    for (Field field : f1328d.getFields()) {
                        String name = field.getName();
                        char c2 = 65535;
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals("bottom")) {
                                    c2 = 3;
                                    break;
                                }
                                break;
                            case 115029:
                                if (name.equals("top")) {
                                    c2 = 1;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (name.equals("left")) {
                                    c2 = 0;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (name.equals("right")) {
                                    c2 = 2;
                                    break;
                                }
                                break;
                        }
                        if (c2 == 0) {
                            rect2.left = field.getInt(objInvoke);
                        } else if (c2 == 1) {
                            rect2.top = field.getInt(objInvoke);
                        } else if (c2 == 2) {
                            rect2.right = field.getInt(objInvoke);
                        } else if (c2 == 3) {
                            rect2.bottom = field.getInt(objInvoke);
                        }
                    }
                    return rect2;
                }
            } catch (Exception unused) {
                Log.e("DrawableUtils", "Couldn't obtain the optical insets. Ignoring.");
            }
        }
        return f1327c;
    }

    /* renamed from: e */
    public static PorterDuff.Mode m1238e(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
