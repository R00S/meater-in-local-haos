package com.google.android.material.internal;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import androidx.core.view.C0285c0;
import androidx.core.view.C0311u;
import androidx.core.view.InterfaceC0306p;

/* compiled from: ViewUtils.java */
/* renamed from: com.google.android.material.internal.k */
/* loaded from: classes2.dex */
public class C8033k {

    /* compiled from: ViewUtils.java */
    /* renamed from: com.google.android.material.internal.k$a */
    static class a implements InterfaceC0306p {

        /* renamed from: a */
        final /* synthetic */ c f30423a;

        /* renamed from: b */
        final /* synthetic */ d f30424b;

        a(c cVar, d dVar) {
            this.f30423a = cVar;
            this.f30424b = dVar;
        }

        @Override // androidx.core.view.InterfaceC0306p
        /* renamed from: a */
        public C0285c0 mo363a(View view, C0285c0 c0285c0) {
            return this.f30423a.mo23945a(view, c0285c0, new d(this.f30424b));
        }
    }

    /* compiled from: ViewUtils.java */
    /* renamed from: com.google.android.material.internal.k$b */
    static class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            C0311u.m2125f0(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* compiled from: ViewUtils.java */
    /* renamed from: com.google.android.material.internal.k$c */
    public interface c {
        /* renamed from: a */
        C0285c0 mo23945a(View view, C0285c0 c0285c0, d dVar);
    }

    /* renamed from: a */
    public static void m24696a(View view, c cVar) {
        C0311u.m2157v0(view, new a(cVar, new d(C0311u.m2090D(view), view.getPaddingTop(), C0311u.m2088C(view), view.getPaddingBottom())));
        m24701f(view);
    }

    /* renamed from: b */
    public static float m24697b(Context context, int i2) {
        return TypedValue.applyDimension(1, i2, context.getResources().getDisplayMetrics());
    }

    /* renamed from: c */
    public static float m24698c(View view) {
        float fM2152t = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            fM2152t += C0311u.m2152t((View) parent);
        }
        return fM2152t;
    }

    /* renamed from: d */
    public static boolean m24699d(View view) {
        return C0311u.m2162y(view) == 1;
    }

    /* renamed from: e */
    public static PorterDuff.Mode m24700e(int i2, PorterDuff.Mode mode) {
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

    /* renamed from: f */
    public static void m24701f(View view) {
        if (C0311u.m2101N(view)) {
            C0311u.m2125f0(view);
        } else {
            view.addOnAttachStateChangeListener(new b());
        }
    }

    /* compiled from: ViewUtils.java */
    /* renamed from: com.google.android.material.internal.k$d */
    public static class d {

        /* renamed from: a */
        public int f30425a;

        /* renamed from: b */
        public int f30426b;

        /* renamed from: c */
        public int f30427c;

        /* renamed from: d */
        public int f30428d;

        public d(int i2, int i3, int i4, int i5) {
            this.f30425a = i2;
            this.f30426b = i3;
            this.f30427c = i4;
            this.f30428d = i5;
        }

        /* renamed from: a */
        public void m24702a(View view) {
            C0311u.m2159w0(view, this.f30425a, this.f30426b, this.f30427c, this.f30428d);
        }

        public d(d dVar) {
            this.f30425a = dVar.f30425a;
            this.f30426b = dVar.f30426b;
            this.f30427c = dVar.f30427c;
            this.f30428d = dVar.f30428d;
        }
    }
}
