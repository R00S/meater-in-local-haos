package com.google.android.material.bottomsheet;

import C7.i;
import C7.l;
import X7.g;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.p;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.u;
import s1.C4421a;
import s1.C4442k0;
import s1.C4469y0;
import s1.I;
import s1.X;
import t1.t;

/* compiled from: BottomSheetDialog.java */
/* loaded from: classes2.dex */
public class a extends p {

    /* renamed from: G, reason: collision with root package name */
    private BottomSheetBehavior<FrameLayout> f36084G;

    /* renamed from: H, reason: collision with root package name */
    private FrameLayout f36085H;

    /* renamed from: I, reason: collision with root package name */
    private CoordinatorLayout f36086I;

    /* renamed from: J, reason: collision with root package name */
    private FrameLayout f36087J;

    /* renamed from: K, reason: collision with root package name */
    boolean f36088K;

    /* renamed from: L, reason: collision with root package name */
    boolean f36089L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f36090M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f36091N;

    /* renamed from: O, reason: collision with root package name */
    private f f36092O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f36093P;

    /* renamed from: Q, reason: collision with root package name */
    private R7.c f36094Q;

    /* renamed from: R, reason: collision with root package name */
    private BottomSheetBehavior.g f36095R;

    /* compiled from: BottomSheetDialog.java */
    /* renamed from: com.google.android.material.bottomsheet.a$a, reason: collision with other inner class name */
    class C0462a implements I {
        C0462a() {
        }

        @Override // s1.I
        public C4469y0 a(View view, C4469y0 c4469y0) {
            if (a.this.f36092O != null) {
                a.this.f36084G.E0(a.this.f36092O);
            }
            if (c4469y0 != null) {
                a aVar = a.this;
                aVar.f36092O = new f(aVar.f36087J, c4469y0, null);
                a.this.f36092O.e(a.this.getWindow());
                a.this.f36084G.c0(a.this.f36092O);
            }
            return c4469y0;
        }
    }

    /* compiled from: BottomSheetDialog.java */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a aVar = a.this;
            if (aVar.f36089L && aVar.isShowing() && a.this.u()) {
                a.this.cancel();
            }
        }
    }

    /* compiled from: BottomSheetDialog.java */
    class c extends C4421a {
        c() {
        }

        @Override // s1.C4421a
        public void g(View view, t tVar) {
            super.g(view, tVar);
            if (!a.this.f36089L) {
                tVar.n0(false);
            } else {
                tVar.a(1048576);
                tVar.n0(true);
            }
        }

        @Override // s1.C4421a
        public boolean j(View view, int i10, Bundle bundle) {
            if (i10 == 1048576) {
                a aVar = a.this;
                if (aVar.f36089L) {
                    aVar.cancel();
                    return true;
                }
            }
            return super.j(view, i10, bundle);
        }
    }

    /* compiled from: BottomSheetDialog.java */
    class d implements View.OnTouchListener {
        d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* compiled from: BottomSheetDialog.java */
    private static class f extends BottomSheetBehavior.g {

        /* renamed from: a, reason: collision with root package name */
        private final Boolean f36101a;

        /* renamed from: b, reason: collision with root package name */
        private final C4469y0 f36102b;

        /* renamed from: c, reason: collision with root package name */
        private Window f36103c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f36104d;

        /* synthetic */ f(View view, C4469y0 c4469y0, C0462a c0462a) {
            this(view, c4469y0);
        }

        private void d(View view) {
            if (view.getTop() < this.f36102b.l()) {
                Window window = this.f36103c;
                if (window != null) {
                    Boolean bool = this.f36101a;
                    com.google.android.material.internal.d.f(window, bool == null ? this.f36104d : bool.booleanValue());
                }
                view.setPadding(view.getPaddingLeft(), this.f36102b.l() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
                return;
            }
            if (view.getTop() != 0) {
                Window window2 = this.f36103c;
                if (window2 != null) {
                    com.google.android.material.internal.d.f(window2, this.f36104d);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        void a(View view) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(View view, float f10) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void c(View view, int i10) {
            d(view);
        }

        void e(Window window) {
            if (this.f36103c == window) {
                return;
            }
            this.f36103c = window;
            if (window != null) {
                this.f36104d = C4442k0.a(window, window.getDecorView()).a();
            }
        }

        private f(View view, C4469y0 c4469y0) {
            this.f36102b = c4469y0;
            g gVarT0 = BottomSheetBehavior.q0(view).t0();
            ColorStateList colorStateListX = gVarT0 != null ? gVarT0.x() : X.r(view);
            if (colorStateListX != null) {
                this.f36101a = Boolean.valueOf(M7.a.h(colorStateListX.getDefaultColor()));
                return;
            }
            Integer numD = u.d(view);
            if (numD != null) {
                this.f36101a = Boolean.valueOf(M7.a.h(numD.intValue()));
            } else {
                this.f36101a = null;
            }
        }
    }

    public a(Context context, int i10) {
        super(context, g(context, i10));
        this.f36089L = true;
        this.f36090M = true;
        this.f36095R = new e();
        l(1);
        this.f36093P = getContext().getTheme().obtainStyledAttributes(new int[]{C7.c.f2336u}).getBoolean(0, false);
    }

    private static int g(Context context, int i10) {
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(C7.c.f2311e, typedValue, true) ? typedValue.resourceId : l.f2569f;
    }

    private FrameLayout q() {
        if (this.f36085H == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), i.f2504b, null);
            this.f36085H = frameLayout;
            this.f36086I = (CoordinatorLayout) frameLayout.findViewById(C7.g.f2478e);
            FrameLayout frameLayout2 = (FrameLayout) this.f36085H.findViewById(C7.g.f2479f);
            this.f36087J = frameLayout2;
            BottomSheetBehavior<FrameLayout> bottomSheetBehaviorQ0 = BottomSheetBehavior.q0(frameLayout2);
            this.f36084G = bottomSheetBehaviorQ0;
            bottomSheetBehaviorQ0.c0(this.f36095R);
            this.f36084G.O0(this.f36089L);
            this.f36094Q = new R7.c(this.f36084G, this.f36087J);
        }
        return this.f36085H;
    }

    private void v() {
        R7.c cVar = this.f36094Q;
        if (cVar == null) {
            return;
        }
        if (this.f36089L) {
            cVar.b();
        } else {
            cVar.d();
        }
    }

    private View w(int i10, View view, ViewGroup.LayoutParams layoutParams) {
        q();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f36085H.findViewById(C7.g.f2478e);
        if (i10 != 0 && view == null) {
            view = getLayoutInflater().inflate(i10, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f36093P) {
            X.B0(this.f36087J, new C0462a());
        }
        this.f36087J.removeAllViews();
        if (layoutParams == null) {
            this.f36087J.addView(view);
        } else {
            this.f36087J.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(C7.g.f2475c0).setOnClickListener(new b());
        X.n0(this.f36087J, new c());
        this.f36087J.setOnTouchListener(new d());
        return this.f36085H;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior<FrameLayout> bottomSheetBehaviorR = r();
        if (!this.f36088K || bottomSheetBehaviorR.u0() == 5) {
            super.cancel();
        } else {
            bottomSheetBehaviorR.W0(5);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z10 = this.f36093P && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.f36085H;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z10);
            }
            CoordinatorLayout coordinatorLayout = this.f36086I;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z10);
            }
            C4442k0.b(window, !z10);
            f fVar = this.f36092O;
            if (fVar != null) {
                fVar.e(window);
            }
        }
        v();
    }

    @Override // androidx.appcompat.app.p, d.r, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        f fVar = this.f36092O;
        if (fVar != null) {
            fVar.e(null);
        }
        R7.c cVar = this.f36094Q;
        if (cVar != null) {
            cVar.d();
        }
    }

    @Override // d.r, android.app.Dialog
    protected void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f36084G;
        if (bottomSheetBehavior == null || bottomSheetBehavior.u0() != 5) {
            return;
        }
        this.f36084G.W0(4);
    }

    public BottomSheetBehavior<FrameLayout> r() {
        if (this.f36084G == null) {
            q();
        }
        return this.f36084G;
    }

    public boolean s() {
        return this.f36088K;
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z10) {
        super.setCancelable(z10);
        if (this.f36089L != z10) {
            this.f36089L = z10;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f36084G;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.O0(z10);
            }
            if (getWindow() != null) {
                v();
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z10) {
        super.setCanceledOnTouchOutside(z10);
        if (z10 && !this.f36089L) {
            this.f36089L = true;
        }
        this.f36090M = z10;
        this.f36091N = true;
    }

    @Override // androidx.appcompat.app.p, d.r, android.app.Dialog
    public void setContentView(int i10) {
        super.setContentView(w(i10, null, null));
    }

    void t() {
        this.f36084G.E0(this.f36095R);
    }

    boolean u() {
        if (!this.f36091N) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
            this.f36090M = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f36091N = true;
        }
        return this.f36090M;
    }

    @Override // androidx.appcompat.app.p, d.r, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(w(0, view, null));
    }

    @Override // androidx.appcompat.app.p, d.r, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(w(0, view, layoutParams));
    }

    /* compiled from: BottomSheetDialog.java */
    class e extends BottomSheetBehavior.g {
        e() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void c(View view, int i10) {
            if (i10 == 5) {
                a.this.cancel();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(View view, float f10) {
        }
    }
}
