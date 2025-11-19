package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

/* compiled from: ClearTextEndIconDelegate.java */
/* loaded from: classes2.dex */
class f extends s {

    /* renamed from: e, reason: collision with root package name */
    private final int f37334e;

    /* renamed from: f, reason: collision with root package name */
    private final int f37335f;

    /* renamed from: g, reason: collision with root package name */
    private final TimeInterpolator f37336g;

    /* renamed from: h, reason: collision with root package name */
    private final TimeInterpolator f37337h;

    /* renamed from: i, reason: collision with root package name */
    private EditText f37338i;

    /* renamed from: j, reason: collision with root package name */
    private final View.OnClickListener f37339j;

    /* renamed from: k, reason: collision with root package name */
    private final View.OnFocusChangeListener f37340k;

    /* renamed from: l, reason: collision with root package name */
    private AnimatorSet f37341l;

    /* renamed from: m, reason: collision with root package name */
    private ValueAnimator f37342m;

    /* compiled from: ClearTextEndIconDelegate.java */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            f.this.f37401b.a0(true);
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f.this.f37401b.a0(false);
        }
    }

    f(r rVar) {
        super(rVar);
        this.f37339j = new View.OnClickListener() { // from class: com.google.android.material.textfield.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f37329B.G(view);
            }
        };
        this.f37340k = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.b
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                this.f37330a.H(view, z10);
            }
        };
        Context context = rVar.getContext();
        int i10 = C7.c.f2288L;
        this.f37334e = R7.i.f(context, i10, 100);
        this.f37335f = R7.i.f(rVar.getContext(), i10, 150);
        this.f37336g = R7.i.g(rVar.getContext(), C7.c.f2293Q, D7.a.f3486a);
        this.f37337h = R7.i.g(rVar.getContext(), C7.c.f2292P, D7.a.f3489d);
    }

    private void A(boolean z10) {
        boolean z11 = this.f37401b.F() == z10;
        if (z10 && !this.f37341l.isRunning()) {
            this.f37342m.cancel();
            this.f37341l.start();
            if (z11) {
                this.f37341l.end();
                return;
            }
            return;
        }
        if (z10) {
            return;
        }
        this.f37341l.cancel();
        this.f37342m.start();
        if (z11) {
            this.f37342m.end();
        }
    }

    private ValueAnimator B(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f37336g);
        valueAnimatorOfFloat.setDuration(this.f37334e);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f37331a.E(valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    private ValueAnimator C() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f37337h);
        valueAnimatorOfFloat.setDuration(this.f37335f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f37333a.F(valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    private void D() {
        ValueAnimator valueAnimatorC = C();
        ValueAnimator valueAnimatorB = B(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f37341l = animatorSet;
        animatorSet.playTogether(valueAnimatorC, valueAnimatorB);
        this.f37341l.addListener(new a());
        ValueAnimator valueAnimatorB2 = B(1.0f, 0.0f);
        this.f37342m = valueAnimatorB2;
        valueAnimatorB2.addListener(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(ValueAnimator valueAnimator) {
        this.f37403d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f37403d.setScaleX(fFloatValue);
        this.f37403d.setScaleY(fFloatValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(View view) {
        EditText editText = this.f37338i;
        if (editText == null) {
            return;
        }
        Editable text = editText.getText();
        if (text != null) {
            text.clear();
        }
        r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(View view, boolean z10) {
        A(J());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I() {
        A(true);
    }

    private boolean J() {
        EditText editText = this.f37338i;
        return editText != null && (editText.hasFocus() || this.f37403d.hasFocus()) && this.f37338i.getText().length() > 0;
    }

    @Override // com.google.android.material.textfield.s
    void a(Editable editable) {
        if (this.f37401b.w() != null) {
            return;
        }
        A(J());
    }

    @Override // com.google.android.material.textfield.s
    int c() {
        return C7.k.f2536e;
    }

    @Override // com.google.android.material.textfield.s
    int d() {
        return C7.f.f2441k;
    }

    @Override // com.google.android.material.textfield.s
    View.OnFocusChangeListener e() {
        return this.f37340k;
    }

    @Override // com.google.android.material.textfield.s
    View.OnClickListener f() {
        return this.f37339j;
    }

    @Override // com.google.android.material.textfield.s
    View.OnFocusChangeListener g() {
        return this.f37340k;
    }

    @Override // com.google.android.material.textfield.s
    public void n(EditText editText) {
        this.f37338i = editText;
        this.f37400a.setEndIconVisible(J());
    }

    @Override // com.google.android.material.textfield.s
    void q(boolean z10) {
        if (this.f37401b.w() == null) {
            return;
        }
        A(z10);
    }

    @Override // com.google.android.material.textfield.s
    void s() {
        D();
    }

    @Override // com.google.android.material.textfield.s
    void u() {
        EditText editText = this.f37338i;
        if (editText != null) {
            editText.post(new Runnable() { // from class: com.google.android.material.textfield.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37332B.I();
                }
            });
        }
    }
}
