package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* compiled from: ViewUtils.java */
/* loaded from: classes.dex */
class B {

    /* renamed from: a, reason: collision with root package name */
    private static final E f29418a;

    /* renamed from: b, reason: collision with root package name */
    static final Property<View, Float> f29419b;

    /* renamed from: c, reason: collision with root package name */
    static final Property<View, Rect> f29420c;

    /* compiled from: ViewUtils.java */
    class a extends Property<View, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(B.b(view));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f10) {
            B.e(view, f10.floatValue());
        }
    }

    /* compiled from: ViewUtils.java */
    class b extends Property<View, Rect> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return view.getClipBounds();
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f29418a = new M();
        } else {
            f29418a = new L();
        }
        f29419b = new a(Float.class, "translationAlpha");
        f29420c = new b(Rect.class, "clipBounds");
    }

    static void a(View view) {
        f29418a.a(view);
    }

    static float b(View view) {
        return f29418a.b(view);
    }

    static void c(View view) {
        f29418a.c(view);
    }

    static void d(View view, int i10, int i11, int i12, int i13) {
        f29418a.d(view, i10, i11, i12, i13);
    }

    static void e(View view, float f10) {
        f29418a.e(view, f10);
    }

    static void f(View view, int i10) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        f29418a.f(view, i10);
    }

    static void g(View view, Matrix matrix) {
        f29418a.g(view, matrix);
    }

    static void h(View view, Matrix matrix) {
        f29418a.h(view, matrix);
    }
}
