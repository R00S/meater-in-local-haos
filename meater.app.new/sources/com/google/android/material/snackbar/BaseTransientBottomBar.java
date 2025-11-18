package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b8.C2272a;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.u;
import com.google.android.material.internal.w;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.c;
import java.util.List;
import k1.C3784a;
import s1.C4421a;
import s1.C4469y0;
import s1.I;
import s1.X;
import t1.t;

/* loaded from: classes2.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: a, reason: collision with root package name */
    private final int f37075a;

    /* renamed from: b, reason: collision with root package name */
    private final int f37076b;

    /* renamed from: c, reason: collision with root package name */
    private final int f37077c;

    /* renamed from: d, reason: collision with root package name */
    private final TimeInterpolator f37078d;

    /* renamed from: e, reason: collision with root package name */
    private final TimeInterpolator f37079e;

    /* renamed from: f, reason: collision with root package name */
    private final TimeInterpolator f37080f;

    /* renamed from: g, reason: collision with root package name */
    private final ViewGroup f37081g;

    /* renamed from: h, reason: collision with root package name */
    private final Context f37082h;

    /* renamed from: i, reason: collision with root package name */
    protected final s f37083i;

    /* renamed from: j, reason: collision with root package name */
    private final com.google.android.material.snackbar.a f37084j;

    /* renamed from: k, reason: collision with root package name */
    private int f37085k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f37086l;

    /* renamed from: o, reason: collision with root package name */
    private int f37089o;

    /* renamed from: p, reason: collision with root package name */
    private int f37090p;

    /* renamed from: q, reason: collision with root package name */
    private int f37091q;

    /* renamed from: r, reason: collision with root package name */
    private int f37092r;

    /* renamed from: s, reason: collision with root package name */
    private int f37093s;

    /* renamed from: t, reason: collision with root package name */
    private int f37094t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f37095u;

    /* renamed from: v, reason: collision with root package name */
    private List<q<B>> f37096v;

    /* renamed from: w, reason: collision with root package name */
    private Behavior f37097w;

    /* renamed from: x, reason: collision with root package name */
    private final AccessibilityManager f37098x;

    /* renamed from: z, reason: collision with root package name */
    private static final TimeInterpolator f37074z = D7.a.f3487b;

    /* renamed from: A, reason: collision with root package name */
    private static final TimeInterpolator f37068A = D7.a.f3486a;

    /* renamed from: B, reason: collision with root package name */
    private static final TimeInterpolator f37069B = D7.a.f3489d;

    /* renamed from: D, reason: collision with root package name */
    private static final boolean f37071D = false;

    /* renamed from: E, reason: collision with root package name */
    private static final int[] f37072E = {C7.c.f2300X};

    /* renamed from: F, reason: collision with root package name */
    private static final String f37073F = BaseTransientBottomBar.class.getSimpleName();

    /* renamed from: C, reason: collision with root package name */
    static final Handler f37070C = new Handler(Looper.getMainLooper(), new h());

    /* renamed from: m, reason: collision with root package name */
    private boolean f37087m = false;

    /* renamed from: n, reason: collision with root package name */
    private final Runnable f37088n = new i();

    /* renamed from: y, reason: collision with root package name */
    c.b f37099y = new l();

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: M, reason: collision with root package name */
        private final r f37100M = new r(this);

        /* JADX INFO: Access modifiers changed from: private */
        public void U(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f37100M.c(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean J(View view) {
            return this.f37100M.a(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f37100M.b(coordinatorLayout, view, motionEvent);
            return super.o(coordinatorLayout, view, motionEvent);
        }
    }

    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f37101a;

        a(int i10) {
            this.f37101a = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.P(this.f37101a);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f37083i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.f37083i.setScaleX(fFloatValue);
            BaseTransientBottomBar.this.f37083i.setScaleY(fFloatValue);
        }
    }

    class d extends AnimatorListenerAdapter {
        d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.Q();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f37084j.a(BaseTransientBottomBar.this.f37077c - BaseTransientBottomBar.this.f37075a, BaseTransientBottomBar.this.f37075a);
        }
    }

    class e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        private int f37106a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f37107b;

        e(int i10) {
            this.f37107b = i10;
            this.f37106a = i10;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f37071D) {
                X.Y(BaseTransientBottomBar.this.f37083i, iIntValue - this.f37106a);
            } else {
                BaseTransientBottomBar.this.f37083i.setTranslationY(iIntValue);
            }
            this.f37106a = iIntValue;
        }
    }

    class f extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f37109a;

        f(int i10) {
            this.f37109a = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.P(this.f37109a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f37084j.b(0, BaseTransientBottomBar.this.f37076b);
        }
    }

    class g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        private int f37111a = 0;

        g() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f37071D) {
                X.Y(BaseTransientBottomBar.this.f37083i, iIntValue - this.f37111a);
            } else {
                BaseTransientBottomBar.this.f37083i.setTranslationY(iIntValue);
            }
            this.f37111a = iIntValue;
        }
    }

    class h implements Handler.Callback {
        h() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                ((BaseTransientBottomBar) message.obj).X();
                return true;
            }
            if (i10 != 1) {
                return false;
            }
            ((BaseTransientBottomBar) message.obj).J(message.arg1);
            return true;
        }
    }

    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f37083i == null || baseTransientBottomBar.f37082h == null) {
                return;
            }
            int iHeight = (w.a(BaseTransientBottomBar.this.f37082h).height() - BaseTransientBottomBar.this.H()) + ((int) BaseTransientBottomBar.this.f37083i.getTranslationY());
            if (iHeight >= BaseTransientBottomBar.this.f37093s) {
                BaseTransientBottomBar baseTransientBottomBar2 = BaseTransientBottomBar.this;
                baseTransientBottomBar2.f37094t = baseTransientBottomBar2.f37093s;
                return;
            }
            ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.f37083i.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                Log.w(BaseTransientBottomBar.f37073F, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                return;
            }
            BaseTransientBottomBar baseTransientBottomBar3 = BaseTransientBottomBar.this;
            baseTransientBottomBar3.f37094t = baseTransientBottomBar3.f37093s;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.f37093s - iHeight;
            BaseTransientBottomBar.this.f37083i.requestLayout();
        }
    }

    class j implements I {
        j() {
        }

        @Override // s1.I
        public C4469y0 a(View view, C4469y0 c4469y0) {
            BaseTransientBottomBar.this.f37089o = c4469y0.i();
            BaseTransientBottomBar.this.f37090p = c4469y0.j();
            BaseTransientBottomBar.this.f37091q = c4469y0.k();
            BaseTransientBottomBar.this.d0();
            return c4469y0;
        }
    }

    class k extends C4421a {
        k() {
        }

        @Override // s1.C4421a
        public void g(View view, t tVar) {
            super.g(view, tVar);
            tVar.a(1048576);
            tVar.n0(true);
        }

        @Override // s1.C4421a
        public boolean j(View view, int i10, Bundle bundle) {
            if (i10 != 1048576) {
                return super.j(view, i10, bundle);
            }
            BaseTransientBottomBar.this.x();
            return true;
        }
    }

    class l implements c.b {
        l() {
        }

        @Override // com.google.android.material.snackbar.c.b
        public void b() {
            Handler handler = BaseTransientBottomBar.f37070C;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.c.b
        public void c(int i10) {
            Handler handler = BaseTransientBottomBar.f37070C;
            handler.sendMessage(handler.obtainMessage(1, i10, 0, BaseTransientBottomBar.this));
        }
    }

    class m implements Runnable {
        m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar.this.P(3);
        }
    }

    class n implements SwipeDismissBehavior.c {
        n() {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void a(View view) {
            if (view.getParent() != null) {
                view.setVisibility(8);
            }
            BaseTransientBottomBar.this.y(0);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void b(int i10) {
            if (i10 == 0) {
                com.google.android.material.snackbar.c.c().k(BaseTransientBottomBar.this.f37099y);
            } else if (i10 == 1 || i10 == 2) {
                com.google.android.material.snackbar.c.c().j(BaseTransientBottomBar.this.f37099y);
            }
        }
    }

    class o implements Runnable {
        o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            s sVar = BaseTransientBottomBar.this.f37083i;
            if (sVar == null) {
                return;
            }
            if (sVar.getParent() != null) {
                BaseTransientBottomBar.this.f37083i.setVisibility(0);
            }
            if (BaseTransientBottomBar.this.f37083i.getAnimationMode() == 1) {
                BaseTransientBottomBar.this.Z();
            } else {
                BaseTransientBottomBar.this.b0();
            }
        }
    }

    class p extends AnimatorListenerAdapter {
        p() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.Q();
        }
    }

    public static class r {

        /* renamed from: a, reason: collision with root package name */
        private c.b f37121a;

        public r(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.Q(0.1f);
            swipeDismissBehavior.O(0.6f);
            swipeDismissBehavior.R(0);
        }

        public boolean a(View view) {
            return view instanceof s;
        }

        public void b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.B(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    com.google.android.material.snackbar.c.c().j(this.f37121a);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                com.google.android.material.snackbar.c.c().k(this.f37121a);
            }
        }

        public void c(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f37121a = baseTransientBottomBar.f37099y;
        }
    }

    protected static class s extends FrameLayout {

        /* renamed from: M, reason: collision with root package name */
        private static final View.OnTouchListener f37122M = new a();

        /* renamed from: B, reason: collision with root package name */
        private BaseTransientBottomBar<?> f37123B;

        /* renamed from: C, reason: collision with root package name */
        X7.k f37124C;

        /* renamed from: D, reason: collision with root package name */
        private int f37125D;

        /* renamed from: E, reason: collision with root package name */
        private final float f37126E;

        /* renamed from: F, reason: collision with root package name */
        private final float f37127F;

        /* renamed from: G, reason: collision with root package name */
        private final int f37128G;

        /* renamed from: H, reason: collision with root package name */
        private final int f37129H;

        /* renamed from: I, reason: collision with root package name */
        private ColorStateList f37130I;

        /* renamed from: J, reason: collision with root package name */
        private PorterDuff.Mode f37131J;

        /* renamed from: K, reason: collision with root package name */
        private Rect f37132K;

        /* renamed from: L, reason: collision with root package name */
        private boolean f37133L;

        class a implements View.OnTouchListener {
            a() {
            }

            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        protected s(Context context, AttributeSet attributeSet) {
            super(C2272a.c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C7.m.f3128z6);
            if (typedArrayObtainStyledAttributes.hasValue(C7.m.f2657G6)) {
                X.v0(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(r2, 0));
            }
            this.f37125D = typedArrayObtainStyledAttributes.getInt(C7.m.f2617C6, 0);
            if (typedArrayObtainStyledAttributes.hasValue(C7.m.f2677I6) || typedArrayObtainStyledAttributes.hasValue(C7.m.f2687J6)) {
                this.f37124C = X7.k.e(context2, attributeSet, 0, 0).m();
            }
            this.f37126E = typedArrayObtainStyledAttributes.getFloat(C7.m.f2627D6, 1.0f);
            setBackgroundTintList(U7.c.a(context2, typedArrayObtainStyledAttributes, C7.m.f2637E6));
            setBackgroundTintMode(u.i(typedArrayObtainStyledAttributes.getInt(C7.m.f2647F6, -1), PorterDuff.Mode.SRC_IN));
            this.f37127F = typedArrayObtainStyledAttributes.getFloat(C7.m.f2607B6, 1.0f);
            this.f37128G = typedArrayObtainStyledAttributes.getDimensionPixelSize(C7.m.f2597A6, -1);
            this.f37129H = typedArrayObtainStyledAttributes.getDimensionPixelSize(C7.m.f2667H6, -1);
            typedArrayObtainStyledAttributes.recycle();
            setOnTouchListener(f37122M);
            setFocusable(true);
            if (getBackground() == null) {
                X.r0(this, d());
            }
        }

        private Drawable d() {
            int iK = M7.a.k(this, C7.c.f2331p, C7.c.f2325l, getBackgroundOverlayColorAlpha());
            X7.k kVar = this.f37124C;
            Drawable drawableW = kVar != null ? BaseTransientBottomBar.w(iK, kVar) : BaseTransientBottomBar.v(iK, getResources());
            if (this.f37130I == null) {
                return C3784a.r(drawableW);
            }
            Drawable drawableR = C3784a.r(drawableW);
            C3784a.o(drawableR, this.f37130I);
            return drawableR;
        }

        private void e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f37132K = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f37123B = baseTransientBottomBar;
        }

        void c(ViewGroup viewGroup) {
            this.f37133L = true;
            viewGroup.addView(this);
            this.f37133L = false;
        }

        float getActionTextColorAlpha() {
            return this.f37127F;
        }

        int getAnimationMode() {
            return this.f37125D;
        }

        float getBackgroundOverlayColorAlpha() {
            return this.f37126E;
        }

        int getMaxInlineActionWidth() {
            return this.f37129H;
        }

        int getMaxWidth() {
            return this.f37128G;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f37123B;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.M();
            }
            X.k0(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f37123B;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.N();
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f37123B;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.O();
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (this.f37128G > 0) {
                int measuredWidth = getMeasuredWidth();
                int i12 = this.f37128G;
                if (measuredWidth > i12) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
                }
            }
        }

        void setAnimationMode(int i10) {
            this.f37125D = i10;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.f37130I != null) {
                drawable = C3784a.r(drawable.mutate());
                C3784a.o(drawable, this.f37130I);
                C3784a.p(drawable, this.f37131J);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f37130I = colorStateList;
            if (getBackground() != null) {
                Drawable drawableR = C3784a.r(getBackground().mutate());
                C3784a.o(drawableR, colorStateList);
                C3784a.p(drawableR, this.f37131J);
                if (drawableR != getBackground()) {
                    super.setBackgroundDrawable(drawableR);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f37131J = mode;
            if (getBackground() != null) {
                Drawable drawableR = C3784a.r(getBackground().mutate());
                C3784a.p(drawableR, mode);
                if (drawableR != getBackground()) {
                    super.setBackgroundDrawable(drawableR);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.f37133L || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            e((ViewGroup.MarginLayoutParams) layoutParams);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f37123B;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.d0();
            }
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f37122M);
            super.setOnClickListener(onClickListener);
        }
    }

    protected BaseTransientBottomBar(Context context, ViewGroup viewGroup, View view, com.google.android.material.snackbar.a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        }
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.f37081g = viewGroup;
        this.f37084j = aVar;
        this.f37082h = context;
        com.google.android.material.internal.r.a(context);
        s sVar = (s) LayoutInflater.from(context).inflate(E(), viewGroup, false);
        this.f37083i = sVar;
        sVar.setBaseTransientBottomBar(this);
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
            snackbarContentLayout.c(sVar.getActionTextColorAlpha());
            snackbarContentLayout.setMaxInlineActionWidth(sVar.getMaxInlineActionWidth());
        }
        sVar.addView(view);
        X.p0(sVar, 1);
        X.x0(sVar, 1);
        X.w0(sVar, true);
        X.B0(sVar, new j());
        X.n0(sVar, new k());
        this.f37098x = (AccessibilityManager) context.getSystemService("accessibility");
        int i10 = C7.c.f2282F;
        this.f37077c = R7.i.f(context, i10, 250);
        this.f37075a = R7.i.f(context, i10, 150);
        this.f37076b = R7.i.f(context, C7.c.f2283G, 75);
        int i11 = C7.c.f2292P;
        this.f37078d = R7.i.g(context, i11, f37068A);
        this.f37080f = R7.i.g(context, i11, f37069B);
        this.f37079e = R7.i.g(context, i11, f37074z);
    }

    private ValueAnimator D(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f37080f);
        valueAnimatorOfFloat.addUpdateListener(new c());
        return valueAnimatorOfFloat;
    }

    private int F() {
        int height = this.f37083i.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f37083i.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int H() {
        int[] iArr = new int[2];
        this.f37083i.getLocationInWindow(iArr);
        return iArr[1] + this.f37083i.getHeight();
    }

    private boolean L() {
        ViewGroup.LayoutParams layoutParams = this.f37083i.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) layoutParams).f() instanceof SwipeDismissBehavior);
    }

    private void R() {
        this.f37092r = u();
        d0();
    }

    private void T(CoordinatorLayout.f fVar) {
        SwipeDismissBehavior<? extends View> swipeDismissBehaviorC = this.f37097w;
        if (swipeDismissBehaviorC == null) {
            swipeDismissBehaviorC = C();
        }
        if (swipeDismissBehaviorC instanceof Behavior) {
            ((Behavior) swipeDismissBehaviorC).U(this);
        }
        swipeDismissBehaviorC.P(new n());
        fVar.o(swipeDismissBehaviorC);
        if (A() == null) {
            fVar.f24693g = 80;
        }
    }

    private boolean V() {
        return this.f37093s > 0 && !this.f37086l && L();
    }

    private void Y() {
        if (U()) {
            s();
            return;
        }
        if (this.f37083i.getParent() != null) {
            this.f37083i.setVisibility(0);
        }
        Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z() {
        ValueAnimator valueAnimatorZ = z(0.0f, 1.0f);
        ValueAnimator valueAnimatorD = D(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorZ, valueAnimatorD);
        animatorSet.setDuration(this.f37075a);
        animatorSet.addListener(new p());
        animatorSet.start();
    }

    private void a0(int i10) {
        ValueAnimator valueAnimatorZ = z(1.0f, 0.0f);
        valueAnimatorZ.setDuration(this.f37076b);
        valueAnimatorZ.addListener(new a(i10));
        valueAnimatorZ.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0() {
        int iF = F();
        if (f37071D) {
            X.Y(this.f37083i, iF);
        } else {
            this.f37083i.setTranslationY(iF);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(iF, 0);
        valueAnimator.setInterpolator(this.f37079e);
        valueAnimator.setDuration(this.f37077c);
        valueAnimator.addListener(new d());
        valueAnimator.addUpdateListener(new e(iF));
        valueAnimator.start();
    }

    private void c0(int i10) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, F());
        valueAnimator.setInterpolator(this.f37079e);
        valueAnimator.setDuration(this.f37077c);
        valueAnimator.addListener(new f(i10));
        valueAnimator.addUpdateListener(new g());
        valueAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0() {
        ViewGroup.LayoutParams layoutParams = this.f37083i.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            Log.w(f37073F, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (this.f37083i.f37132K == null) {
            Log.w(f37073F, "Unable to update margins because original view margins are not set");
            return;
        }
        if (this.f37083i.getParent() == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i10 = this.f37083i.f37132K.bottom + (A() != null ? this.f37092r : this.f37089o);
        int i11 = this.f37083i.f37132K.left + this.f37090p;
        int i12 = this.f37083i.f37132K.right + this.f37091q;
        int i13 = this.f37083i.f37132K.top;
        boolean z10 = (marginLayoutParams.bottomMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12 && marginLayoutParams.topMargin == i13) ? false : true;
        if (z10) {
            marginLayoutParams.bottomMargin = i10;
            marginLayoutParams.leftMargin = i11;
            marginLayoutParams.rightMargin = i12;
            marginLayoutParams.topMargin = i13;
            this.f37083i.requestLayout();
        }
        if ((z10 || this.f37094t != this.f37093s) && Build.VERSION.SDK_INT >= 29 && V()) {
            this.f37083i.removeCallbacks(this.f37088n);
            this.f37083i.post(this.f37088n);
        }
    }

    private void t(int i10) {
        if (this.f37083i.getAnimationMode() == 1) {
            a0(i10);
        } else {
            c0(i10);
        }
    }

    private int u() {
        if (A() == null) {
            return 0;
        }
        int[] iArr = new int[2];
        A().getLocationOnScreen(iArr);
        int i10 = iArr[1];
        int[] iArr2 = new int[2];
        this.f37081g.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f37081g.getHeight()) - i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static GradientDrawable v(int i10, Resources resources) throws Resources.NotFoundException {
        float dimension = resources.getDimension(C7.e.f2422v0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(i10);
        return gradientDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static X7.g w(int i10, X7.k kVar) {
        X7.g gVar = new X7.g(kVar);
        gVar.b0(ColorStateList.valueOf(i10));
        return gVar;
    }

    private ValueAnimator z(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f37078d);
        valueAnimatorOfFloat.addUpdateListener(new b());
        return valueAnimatorOfFloat;
    }

    public View A() {
        return null;
    }

    public int B() {
        return this.f37085k;
    }

    protected SwipeDismissBehavior<? extends View> C() {
        return new Behavior();
    }

    protected int E() {
        return I() ? C7.i.f2525w : C7.i.f2505c;
    }

    public View G() {
        return this.f37083i;
    }

    protected boolean I() {
        TypedArray typedArrayObtainStyledAttributes = this.f37082h.obtainStyledAttributes(f37072E);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    final void J(int i10) {
        if (U() && this.f37083i.getVisibility() == 0) {
            t(i10);
        } else {
            P(i10);
        }
    }

    public boolean K() {
        return com.google.android.material.snackbar.c.c().e(this.f37099y);
    }

    void M() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = this.f37083i.getRootWindowInsets()) == null) {
            return;
        }
        this.f37093s = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
        d0();
    }

    void N() {
        if (K()) {
            f37070C.post(new m());
        }
    }

    void O() {
        if (this.f37095u) {
            Y();
            this.f37095u = false;
        }
    }

    void P(int i10) {
        com.google.android.material.snackbar.c.c().h(this.f37099y);
        List<q<B>> list = this.f37096v;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f37096v.get(size).a(this, i10);
            }
        }
        ViewParent parent = this.f37083i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f37083i);
        }
    }

    void Q() {
        com.google.android.material.snackbar.c.c().i(this.f37099y);
        List<q<B>> list = this.f37096v;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f37096v.get(size).b(this);
            }
        }
    }

    public B S(int i10) {
        this.f37085k = i10;
        return this;
    }

    boolean U() {
        AccessibilityManager accessibilityManager = this.f37098x;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    public void W() {
        com.google.android.material.snackbar.c.c().m(B(), this.f37099y);
    }

    final void X() {
        if (this.f37083i.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f37083i.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                T((CoordinatorLayout.f) layoutParams);
            }
            this.f37083i.c(this.f37081g);
            R();
            this.f37083i.setVisibility(4);
        }
        if (X.R(this.f37083i)) {
            Y();
        } else {
            this.f37095u = true;
        }
    }

    void s() {
        this.f37083i.post(new o());
    }

    public void x() {
        y(3);
    }

    protected void y(int i10) {
        com.google.android.material.snackbar.c.c().b(this.f37099y, i10);
    }

    public static abstract class q<B> {
        public void b(B b10) {
        }

        public void a(B b10, int i10) {
        }
    }
}
