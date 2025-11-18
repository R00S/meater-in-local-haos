package androidx.appcompat.widget;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import androidx.core.view.C0311u;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: ViewUtils.java */
/* renamed from: androidx.appcompat.widget.w0 */
/* loaded from: classes.dex */
public class C0197w0 {

    /* renamed from: a */
    private static Method f1324a;

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                f1324a = declaredMethod;
                if (declaredMethod.isAccessible()) {
                    return;
                }
                f1324a.setAccessible(true);
            } catch (NoSuchMethodException unused) {
                Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
            }
        }
    }

    /* renamed from: a */
    public static void m1230a(View view, Rect rect, Rect rect2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = f1324a;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception e2) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e2);
            }
        }
    }

    /* renamed from: b */
    public static boolean m1231b(View view) {
        return C0311u.m2162y(view) == 1;
    }

    /* renamed from: c */
    public static void m1232c(View view) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 16) {
            try {
                Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                if (!method.isAccessible()) {
                    method.setAccessible(true);
                }
                method.invoke(view, new Object[0]);
            } catch (IllegalAccessException e2) {
                Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
            } catch (NoSuchMethodException unused) {
                Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
            } catch (InvocationTargetException e3) {
                Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e3);
            }
        }
    }
}
