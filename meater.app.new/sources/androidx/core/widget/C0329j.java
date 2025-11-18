package androidx.core.widget;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.view.C0286d;
import androidx.core.view.C0311u;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PopupWindowCompat.java */
/* renamed from: androidx.core.widget.j */
/* loaded from: classes.dex */
public final class C0329j {

    /* renamed from: a */
    private static Method f2512a;

    /* renamed from: b */
    private static boolean f2513b;

    /* renamed from: c */
    private static Field f2514c;

    /* renamed from: d */
    private static boolean f2515d;

    /* renamed from: a */
    public static void m2317a(PopupWindow popupWindow, boolean z) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            popupWindow.setOverlapAnchor(z);
            return;
        }
        if (i2 >= 21) {
            if (!f2515d) {
                try {
                    Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                    f2514c = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e2);
                }
                f2515d = true;
            }
            Field field = f2514c;
            if (field != null) {
                try {
                    field.set(popupWindow, Boolean.valueOf(z));
                } catch (IllegalAccessException e3) {
                    Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e3);
                }
            }
        }
    }

    /* renamed from: b */
    public static void m2318b(PopupWindow popupWindow, int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 23) {
            popupWindow.setWindowLayoutType(i2);
            return;
        }
        if (!f2513b) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f2512a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f2513b = true;
        }
        Method method = f2512a;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i2));
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: c */
    public static void m2319c(PopupWindow popupWindow, View view, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 19) {
            popupWindow.showAsDropDown(view, i2, i3, i4);
            return;
        }
        if ((C0286d.m1932b(i4, C0311u.m2162y(view)) & 7) == 5) {
            i2 -= popupWindow.getWidth() - view.getWidth();
        }
        popupWindow.showAsDropDown(view, i2, i3);
    }
}
