package p024c.p088x;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: ViewUtilsBase.java */
/* renamed from: c.x.i0 */
/* loaded from: classes.dex */
class C1040i0 {

    /* renamed from: a */
    private static Method f6840a;

    /* renamed from: b */
    private static boolean f6841b;

    /* renamed from: c */
    private static Field f6842c;

    /* renamed from: d */
    private static boolean f6843d;

    C1040i0() {
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: b */
    private void m6594b() throws NoSuchMethodException, SecurityException {
        if (f6841b) {
            return;
        }
        try {
            Class cls = Integer.TYPE;
            Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
            f6840a = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException e2) {
            Log.i("ViewUtilsBase", "Failed to retrieve setFrame method", e2);
        }
        f6841b = true;
    }

    /* renamed from: a */
    public void mo6579a(View view) {
        if (view.getVisibility() == 0) {
            view.setTag(C1041j.f6844a, null);
        }
    }

    /* renamed from: c */
    public float mo6580c(View view) {
        Float f2 = (Float) view.getTag(C1041j.f6844a);
        return f2 != null ? view.getAlpha() / f2.floatValue() : view.getAlpha();
    }

    /* renamed from: d */
    public void mo6581d(View view) {
        int i2 = C1041j.f6844a;
        if (view.getTag(i2) == null) {
            view.setTag(i2, Float.valueOf(view.getAlpha()));
        }
    }

    /* renamed from: e */
    public void mo6588e(View view, int i2, int i3, int i4, int i5) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m6594b();
        Method method = f6840a;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }

    /* renamed from: f */
    public void mo6582f(View view, float f2) {
        Float f3 = (Float) view.getTag(C1041j.f6844a);
        if (f3 != null) {
            view.setAlpha(f3.floatValue() * f2);
        } else {
            view.setAlpha(f2);
        }
    }

    /* renamed from: g */
    public void mo6590g(View view, int i2) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        if (!f6843d) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f6842c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f6843d = true;
        }
        Field field = f6842c;
        if (field != null) {
            try {
                f6842c.setInt(view, i2 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* renamed from: h */
    public void mo6585h(View view, Matrix matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            mo6585h((View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        matrix.preConcat(matrix2);
    }

    /* renamed from: i */
    public void mo6586i(View view, Matrix matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            mo6586i((View) parent, matrix);
            matrix.postTranslate(r0.getScrollX(), r0.getScrollY());
        }
        matrix.postTranslate(-view.getLeft(), -view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        Matrix matrix3 = new Matrix();
        if (matrix2.invert(matrix3)) {
            matrix.postConcat(matrix3);
        }
    }
}
