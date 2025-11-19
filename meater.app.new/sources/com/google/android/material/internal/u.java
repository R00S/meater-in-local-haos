package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import g1.C3377a;
import s1.C4469y0;
import s1.I;
import s1.X;
import s1.X0;

/* compiled from: ViewUtils.java */
/* loaded from: classes2.dex */
public class u {

    /* compiled from: ViewUtils.java */
    class a implements I {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ c f36799B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ d f36800C;

        a(c cVar, d dVar) {
            this.f36799B = cVar;
            this.f36800C = dVar;
        }

        @Override // s1.I
        public C4469y0 a(View view, C4469y0 c4469y0) {
            return this.f36799B.a(view, c4469y0, new d(this.f36800C));
        }
    }

    /* compiled from: ViewUtils.java */
    public interface c {
        C4469y0 a(View view, C4469y0 c4469y0, d dVar);
    }

    public static void b(View view, c cVar) {
        X.B0(view, new a(cVar, new d(X.E(view), view.getPaddingTop(), X.D(view), view.getPaddingBottom())));
        j(view);
    }

    public static float c(Context context, int i10) {
        return TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics());
    }

    public static Integer d(View view) {
        ColorStateList colorStateListF = com.google.android.material.drawable.d.f(view.getBackground());
        if (colorStateListF != null) {
            return Integer.valueOf(colorStateListF.getDefaultColor());
        }
        return null;
    }

    private static InputMethodManager e(View view) {
        return (InputMethodManager) C3377a.j(view.getContext(), InputMethodManager.class);
    }

    public static float f(View view) {
        float fU = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            fU += X.u((View) parent);
        }
        return fU;
    }

    public static boolean g(View view) {
        return X.z(view) == 1;
    }

    public static PorterDuff.Mode i(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
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

    public static void j(View view) {
        if (X.Q(view)) {
            X.k0(view);
        } else {
            view.addOnAttachStateChangeListener(new b());
        }
    }

    public static void k(final View view, final boolean z10) {
        view.requestFocus();
        view.post(new Runnable() { // from class: com.google.android.material.internal.t
            @Override // java.lang.Runnable
            public final void run() {
                u.l(view, z10);
            }
        });
    }

    public static void l(View view, boolean z10) {
        X0 x0J;
        if (!z10 || (x0J = X.J(view)) == null) {
            e(view).showSoftInput(view, 1);
        } else {
            x0J.d(C4469y0.l.c());
        }
    }

    /* compiled from: ViewUtils.java */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public int f36801a;

        /* renamed from: b, reason: collision with root package name */
        public int f36802b;

        /* renamed from: c, reason: collision with root package name */
        public int f36803c;

        /* renamed from: d, reason: collision with root package name */
        public int f36804d;

        public d(int i10, int i11, int i12, int i13) {
            this.f36801a = i10;
            this.f36802b = i11;
            this.f36803c = i12;
            this.f36804d = i13;
        }

        public void a(View view) {
            X.C0(view, this.f36801a, this.f36802b, this.f36803c, this.f36804d);
        }

        public d(d dVar) {
            this.f36801a = dVar.f36801a;
            this.f36802b = dVar.f36802b;
            this.f36803c = dVar.f36803c;
            this.f36804d = dVar.f36804d;
        }
    }

    /* compiled from: ViewUtils.java */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            X.k0(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}
