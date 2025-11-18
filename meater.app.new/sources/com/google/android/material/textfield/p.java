package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import s1.X;
import t1.c;

/* compiled from: DropdownMenuEndIconDelegate.java */
/* loaded from: classes2.dex */
class p extends s {

    /* renamed from: s, reason: collision with root package name */
    private static final boolean f37354s = true;

    /* renamed from: e, reason: collision with root package name */
    private final int f37355e;

    /* renamed from: f, reason: collision with root package name */
    private final int f37356f;

    /* renamed from: g, reason: collision with root package name */
    private final TimeInterpolator f37357g;

    /* renamed from: h, reason: collision with root package name */
    private AutoCompleteTextView f37358h;

    /* renamed from: i, reason: collision with root package name */
    private final View.OnClickListener f37359i;

    /* renamed from: j, reason: collision with root package name */
    private final View.OnFocusChangeListener f37360j;

    /* renamed from: k, reason: collision with root package name */
    private final c.a f37361k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f37362l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f37363m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f37364n;

    /* renamed from: o, reason: collision with root package name */
    private long f37365o;

    /* renamed from: p, reason: collision with root package name */
    private AccessibilityManager f37366p;

    /* renamed from: q, reason: collision with root package name */
    private ValueAnimator f37367q;

    /* renamed from: r, reason: collision with root package name */
    private ValueAnimator f37368r;

    /* compiled from: DropdownMenuEndIconDelegate.java */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            p.this.r();
            p.this.f37368r.start();
        }
    }

    p(r rVar) {
        super(rVar);
        this.f37359i = new View.OnClickListener() { // from class: com.google.android.material.textfield.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f37350B.J(view);
            }
        };
        this.f37360j = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.m
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                this.f37351a.K(view, z10);
            }
        };
        this.f37361k = new c.a() { // from class: com.google.android.material.textfield.n
            @Override // t1.c.a
            public final void onTouchExplorationStateChanged(boolean z10) {
                this.f37352a.L(z10);
            }
        };
        this.f37365o = Long.MAX_VALUE;
        Context context = rVar.getContext();
        int i10 = C7.c.f2288L;
        this.f37356f = R7.i.f(context, i10, 67);
        this.f37355e = R7.i.f(rVar.getContext(), i10, 50);
        this.f37357g = R7.i.g(rVar.getContext(), C7.c.f2293Q, D7.a.f3486a);
    }

    private static AutoCompleteTextView D(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private ValueAnimator E(int i10, float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f37357g);
        valueAnimatorOfFloat.setDuration(i10);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.i
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f37347a.I(valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    private void F() {
        this.f37368r = E(this.f37356f, 0.0f, 1.0f);
        ValueAnimator valueAnimatorE = E(this.f37355e, 1.0f, 0.0f);
        this.f37367q = valueAnimatorE;
        valueAnimatorE.addListener(new a());
    }

    private boolean G() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f37365o;
        return jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H() {
        boolean zIsPopupShowing = this.f37358h.isPopupShowing();
        O(zIsPopupShowing);
        this.f37363m = zIsPopupShowing;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(ValueAnimator valueAnimator) {
        this.f37403d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(View view) {
        Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(View view, boolean z10) {
        this.f37362l = z10;
        r();
        if (z10) {
            return;
        }
        O(false);
        this.f37363m = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(boolean z10) {
        AutoCompleteTextView autoCompleteTextView = this.f37358h;
        if (autoCompleteTextView == null || q.a(autoCompleteTextView)) {
            return;
        }
        X.x0(this.f37403d, z10 ? 2 : 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean M(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (G()) {
                this.f37363m = false;
            }
            Q();
            R();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N() {
        R();
        O(false);
    }

    private void O(boolean z10) {
        if (this.f37364n != z10) {
            this.f37364n = z10;
            this.f37368r.cancel();
            this.f37367q.start();
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void P() {
        this.f37358h.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.textfield.j
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f37348B.M(view, motionEvent);
            }
        });
        if (f37354s) {
            this.f37358h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.google.android.material.textfield.k
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    this.f37349a.N();
                }
            });
        }
        this.f37358h.setThreshold(0);
    }

    private void Q() {
        if (this.f37358h == null) {
            return;
        }
        if (G()) {
            this.f37363m = false;
        }
        if (this.f37363m) {
            this.f37363m = false;
            return;
        }
        if (f37354s) {
            O(!this.f37364n);
        } else {
            this.f37364n = !this.f37364n;
            r();
        }
        if (!this.f37364n) {
            this.f37358h.dismissDropDown();
        } else {
            this.f37358h.requestFocus();
            this.f37358h.showDropDown();
        }
    }

    private void R() {
        this.f37363m = true;
        this.f37365o = System.currentTimeMillis();
    }

    @Override // com.google.android.material.textfield.s
    public void a(Editable editable) {
        if (this.f37366p.isTouchExplorationEnabled() && q.a(this.f37358h) && !this.f37403d.hasFocus()) {
            this.f37358h.dismissDropDown();
        }
        this.f37358h.post(new Runnable() { // from class: com.google.android.material.textfield.o
            @Override // java.lang.Runnable
            public final void run() {
                this.f37353B.H();
            }
        });
    }

    @Override // com.google.android.material.textfield.s
    int c() {
        return C7.k.f2538g;
    }

    @Override // com.google.android.material.textfield.s
    int d() {
        return f37354s ? C7.f.f2439i : C7.f.f2440j;
    }

    @Override // com.google.android.material.textfield.s
    View.OnFocusChangeListener e() {
        return this.f37360j;
    }

    @Override // com.google.android.material.textfield.s
    View.OnClickListener f() {
        return this.f37359i;
    }

    @Override // com.google.android.material.textfield.s
    public c.a h() {
        return this.f37361k;
    }

    @Override // com.google.android.material.textfield.s
    boolean i(int i10) {
        return i10 != 0;
    }

    @Override // com.google.android.material.textfield.s
    boolean j() {
        return true;
    }

    @Override // com.google.android.material.textfield.s
    boolean k() {
        return this.f37362l;
    }

    @Override // com.google.android.material.textfield.s
    boolean l() {
        return true;
    }

    @Override // com.google.android.material.textfield.s
    boolean m() {
        return this.f37364n;
    }

    @Override // com.google.android.material.textfield.s
    public void n(EditText editText) {
        this.f37358h = D(editText);
        P();
        this.f37400a.setErrorIconDrawable((Drawable) null);
        if (!q.a(editText) && this.f37366p.isTouchExplorationEnabled()) {
            X.x0(this.f37403d, 2);
        }
        this.f37400a.setEndIconVisible(true);
    }

    @Override // com.google.android.material.textfield.s
    public void o(View view, t1.t tVar) {
        if (!q.a(this.f37358h)) {
            tVar.h0(Spinner.class.getName());
        }
        if (tVar.R()) {
            tVar.v0(null);
        }
    }

    @Override // com.google.android.material.textfield.s
    @SuppressLint({"WrongConstant"})
    public void p(View view, AccessibilityEvent accessibilityEvent) {
        if (!this.f37366p.isEnabled() || q.a(this.f37358h)) {
            return;
        }
        boolean z10 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f37364n && !this.f37358h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z10) {
            Q();
            R();
        }
    }

    @Override // com.google.android.material.textfield.s
    void s() {
        F();
        this.f37366p = (AccessibilityManager) this.f37402c.getSystemService("accessibility");
    }

    @Override // com.google.android.material.textfield.s
    boolean t() {
        return true;
    }

    @Override // com.google.android.material.textfield.s
    @SuppressLint({"ClickableViewAccessibility"})
    void u() {
        AutoCompleteTextView autoCompleteTextView = this.f37358h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            if (f37354s) {
                this.f37358h.setOnDismissListener(null);
            }
        }
    }
}
