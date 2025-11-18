package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* compiled from: ViewUtilsApi19.java */
/* loaded from: classes.dex */
class E {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f29421a = true;

    /* renamed from: b, reason: collision with root package name */
    private static Field f29422b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f29423c;

    /* compiled from: ViewUtilsApi19.java */
    static class a {
        static float a(View view) {
            return view.getTransitionAlpha();
        }

        static void b(View view, float f10) {
            view.setTransitionAlpha(f10);
        }
    }

    E() {
    }

    @SuppressLint({"NewApi"})
    public float b(View view) {
        if (f29421a) {
            try {
                return a.a(view);
            } catch (NoSuchMethodError unused) {
                f29421a = false;
            }
        }
        return view.getAlpha();
    }

    @SuppressLint({"BanUncheckedReflection"})
    public void d(View view, int i10, int i11, int i12, int i13) {
        throw null;
    }

    @SuppressLint({"NewApi"})
    public void e(View view, float f10) {
        if (f29421a) {
            try {
                a.b(view, f10);
                return;
            } catch (NoSuchMethodError unused) {
                f29421a = false;
            }
        }
        view.setAlpha(f10);
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public void f(View view, int i10) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (!f29423c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f29422b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f29423c = true;
        }
        Field field = f29422b;
        if (field != null) {
            try {
                f29422b.setInt(view, i10 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void g(View view, Matrix matrix) {
        throw null;
    }

    public void h(View view, Matrix matrix) {
        throw null;
    }

    public void a(View view) {
    }

    public void c(View view) {
    }
}
