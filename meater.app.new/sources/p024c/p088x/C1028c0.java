package p024c.p088x;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.core.view.C0311u;
import java.lang.reflect.InvocationTargetException;

/* compiled from: ViewUtils.java */
/* renamed from: c.x.c0 */
/* loaded from: classes.dex */
class C1028c0 {

    /* renamed from: a */
    private static final C1040i0 f6808a;

    /* renamed from: b */
    static final Property<View, Float> f6809b;

    /* renamed from: c */
    static final Property<View, Rect> f6810c;

    /* compiled from: ViewUtils.java */
    /* renamed from: c.x.c0$a */
    static class a extends Property<View, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(C1028c0.m6563c(view));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f2) {
            C1028c0.m6567g(view, f2.floatValue());
        }
    }

    /* compiled from: ViewUtils.java */
    /* renamed from: c.x.c0$b */
    static class b extends Property<View, Rect> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return C0311u.m2148r(view);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            C0311u.m2145p0(view, rect);
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            f6808a = new C1038h0();
        } else if (i2 >= 23) {
            f6808a = new C1036g0();
        } else if (i2 >= 22) {
            f6808a = new C1034f0();
        } else if (i2 >= 21) {
            f6808a = new C1032e0();
        } else if (i2 >= 19) {
            f6808a = new C1030d0();
        } else {
            f6808a = new C1040i0();
        }
        f6809b = new a(Float.class, "translationAlpha");
        f6810c = new b(Rect.class, "clipBounds");
    }

    /* renamed from: a */
    static void m6561a(View view) {
        f6808a.mo6579a(view);
    }

    /* renamed from: b */
    static InterfaceC1026b0 m6562b(View view) {
        return Build.VERSION.SDK_INT >= 18 ? new C1024a0(view) : C1061z.m6684e(view);
    }

    /* renamed from: c */
    static float m6563c(View view) {
        return f6808a.mo6580c(view);
    }

    /* renamed from: d */
    static InterfaceC1048m0 m6564d(View view) {
        return Build.VERSION.SDK_INT >= 18 ? new C1046l0(view) : new C1044k0(view.getWindowToken());
    }

    /* renamed from: e */
    static void m6565e(View view) {
        f6808a.mo6581d(view);
    }

    /* renamed from: f */
    static void m6566f(View view, int i2, int i3, int i4, int i5) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        f6808a.mo6588e(view, i2, i3, i4, i5);
    }

    /* renamed from: g */
    static void m6567g(View view, float f2) {
        f6808a.mo6582f(view, f2);
    }

    /* renamed from: h */
    static void m6568h(View view, int i2) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        f6808a.mo6590g(view, i2);
    }

    /* renamed from: i */
    static void m6569i(View view, Matrix matrix) {
        f6808a.mo6585h(view, matrix);
    }

    /* renamed from: j */
    static void m6570j(View view, Matrix matrix) {
        f6808a.mo6586i(view, matrix);
    }
}
