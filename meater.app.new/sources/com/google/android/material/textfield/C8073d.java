package com.google.android.material.textfield;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.core.view.C0311u;
import androidx.core.view.p004d0.C0289c;
import com.google.android.material.textfield.TextInputLayout;
import p024c.p025a.p026k.p027a.C0833a;
import p241e.p254e.p256b.p271c.C8908b;
import p241e.p254e.p256b.p271c.C8910d;
import p241e.p254e.p256b.p271c.C8911e;
import p241e.p254e.p256b.p271c.C8916j;
import p241e.p254e.p256b.p271c.p272a0.C8900g;
import p241e.p254e.p256b.p271c.p272a0.C8904k;
import p241e.p254e.p256b.p271c.p273m.C8919a;
import p241e.p254e.p256b.p271c.p278q.C8937a;

/* compiled from: DropdownMenuEndIconDelegate.java */
/* renamed from: com.google.android.material.textfield.d */
/* loaded from: classes2.dex */
class C8073d extends AbstractC8074e {

    /* renamed from: d */
    private static final boolean f30532d;

    /* renamed from: e */
    private final TextWatcher f30533e;

    /* renamed from: f */
    private final View.OnFocusChangeListener f30534f;

    /* renamed from: g */
    private final TextInputLayout.C8067e f30535g;

    /* renamed from: h */
    private final TextInputLayout.InterfaceC8068f f30536h;

    /* renamed from: i */
    @SuppressLint({"ClickableViewAccessibility"})
    private final TextInputLayout.InterfaceC8069g f30537i;

    /* renamed from: j */
    private boolean f30538j;

    /* renamed from: k */
    private boolean f30539k;

    /* renamed from: l */
    private long f30540l;

    /* renamed from: m */
    private StateListDrawable f30541m;

    /* renamed from: n */
    private C8900g f30542n;

    /* renamed from: o */
    private AccessibilityManager f30543o;

    /* renamed from: p */
    private ValueAnimator f30544p;

    /* renamed from: q */
    private ValueAnimator f30545q;

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.d$a */
    class a implements TextWatcher {

        /* compiled from: DropdownMenuEndIconDelegate.java */
        /* renamed from: com.google.android.material.textfield.d$a$a, reason: collision with other inner class name */
        class RunnableC11495a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ AutoCompleteTextView f30547f;

            RunnableC11495a(AutoCompleteTextView autoCompleteTextView) {
                this.f30547f = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean zIsPopupShowing = this.f30547f.isPopupShowing();
                C8073d.this.m24820C(zIsPopupShowing);
                C8073d.this.f30538j = zIsPopupShowing;
            }
        }

        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            C8073d c8073d = C8073d.this;
            AutoCompleteTextView autoCompleteTextViewM24843x = c8073d.m24843x(c8073d.f30559a.getEditText());
            autoCompleteTextViewM24843x.post(new RunnableC11495a(autoCompleteTextViewM24843x));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.d$b */
    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C8073d.this.f30561c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.d$c */
    class c implements View.OnFocusChangeListener {
        c() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            C8073d.this.f30559a.setEndIconActivated(z);
            if (z) {
                return;
            }
            C8073d.this.m24820C(false);
            C8073d.this.f30538j = false;
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.d$d */
    class d extends TextInputLayout.C8067e {
        d(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // com.google.android.material.textfield.TextInputLayout.C8067e, androidx.core.view.C0280a
        /* renamed from: g */
        public void mo1858g(View view, C0289c c0289c) {
            super.mo1858g(view, c0289c);
            c0289c.m1970Y(Spinner.class.getName());
            if (c0289c.m1961K()) {
                c0289c.m1987j0(null);
            }
        }

        @Override // androidx.core.view.C0280a
        /* renamed from: h */
        public void mo1859h(View view, AccessibilityEvent accessibilityEvent) {
            super.mo1859h(view, accessibilityEvent);
            C8073d c8073d = C8073d.this;
            AutoCompleteTextView autoCompleteTextViewM24843x = c8073d.m24843x(c8073d.f30559a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && C8073d.this.f30543o.isTouchExplorationEnabled()) {
                C8073d.this.m24823F(autoCompleteTextViewM24843x);
            }
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.d$e */
    class e implements TextInputLayout.InterfaceC8068f {
        e() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC8068f
        /* renamed from: a */
        public void mo24796a(TextInputLayout textInputLayout) {
            AutoCompleteTextView autoCompleteTextViewM24843x = C8073d.this.m24843x(textInputLayout.getEditText());
            C8073d.this.m24821D(autoCompleteTextViewM24843x);
            C8073d.this.m24840u(autoCompleteTextViewM24843x);
            C8073d.this.m24822E(autoCompleteTextViewM24843x);
            autoCompleteTextViewM24843x.setThreshold(0);
            autoCompleteTextViewM24843x.removeTextChangedListener(C8073d.this.f30533e);
            autoCompleteTextViewM24843x.addTextChangedListener(C8073d.this.f30533e);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            textInputLayout.setTextInputAccessibilityDelegate(C8073d.this.f30535g);
            textInputLayout.setEndIconVisible(true);
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.d$f */
    class f implements TextInputLayout.InterfaceC8069g {
        f() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC8069g
        /* renamed from: a */
        public void mo24797a(TextInputLayout textInputLayout, int i2) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView == null || i2 != 3) {
                return;
            }
            autoCompleteTextView.removeTextChangedListener(C8073d.this.f30533e);
            if (autoCompleteTextView.getOnFocusChangeListener() == C8073d.this.f30534f) {
                autoCompleteTextView.setOnFocusChangeListener(null);
            }
            autoCompleteTextView.setOnTouchListener(null);
            if (C8073d.f30532d) {
                autoCompleteTextView.setOnDismissListener(null);
            }
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.d$g */
    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C8073d.this.m24823F((AutoCompleteTextView) C8073d.this.f30559a.getEditText());
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.d$h */
    class h implements View.OnTouchListener {

        /* renamed from: f */
        final /* synthetic */ AutoCompleteTextView f30555f;

        h(AutoCompleteTextView autoCompleteTextView) {
            this.f30555f = autoCompleteTextView;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (C8073d.this.m24819B()) {
                    C8073d.this.f30538j = false;
                }
                C8073d.this.m24823F(this.f30555f);
            }
            return false;
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.d$i */
    class i implements AutoCompleteTextView.OnDismissListener {
        i() {
        }

        @Override // android.widget.AutoCompleteTextView.OnDismissListener
        public void onDismiss() {
            C8073d.this.f30538j = true;
            C8073d.this.f30540l = System.currentTimeMillis();
            C8073d.this.m24820C(false);
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.d$j */
    class j extends AnimatorListenerAdapter {
        j() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C8073d c8073d = C8073d.this;
            c8073d.f30561c.setChecked(c8073d.f30539k);
            C8073d.this.f30545q.start();
        }
    }

    static {
        f30532d = Build.VERSION.SDK_INT >= 21;
    }

    C8073d(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f30533e = new a();
        this.f30534f = new c();
        this.f30535g = new d(this.f30559a);
        this.f30536h = new e();
        this.f30537i = new f();
        this.f30538j = false;
        this.f30539k = false;
        this.f30540l = Long.MAX_VALUE;
    }

    /* renamed from: A */
    private void m24818A() {
        this.f30545q = m24844y(67, 0.0f, 1.0f);
        ValueAnimator valueAnimatorM24844y = m24844y(50, 1.0f, 0.0f);
        this.f30544p = valueAnimatorM24844y;
        valueAnimatorM24844y.addListener(new j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public boolean m24819B() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f30540l;
        return jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public void m24820C(boolean z) {
        if (this.f30539k != z) {
            this.f30539k = z;
            this.f30545q.cancel();
            this.f30544p.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public void m24821D(AutoCompleteTextView autoCompleteTextView) {
        if (f30532d) {
            int boxBackgroundMode = this.f30559a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f30542n);
            } else if (boxBackgroundMode == 1) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f30541m);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: E */
    public void m24822E(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new h(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(this.f30534f);
        if (f30532d) {
            autoCompleteTextView.setOnDismissListener(new i());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public void m24823F(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            return;
        }
        if (m24819B()) {
            this.f30538j = false;
        }
        if (this.f30538j) {
            this.f30538j = false;
            return;
        }
        if (f30532d) {
            m24820C(!this.f30539k);
        } else {
            this.f30539k = !this.f30539k;
            this.f30561c.toggle();
        }
        if (!this.f30539k) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            autoCompleteTextView.showDropDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public void m24840u(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView.getKeyListener() != null) {
            return;
        }
        int boxBackgroundMode = this.f30559a.getBoxBackgroundMode();
        C8900g boxBackground = this.f30559a.getBoxBackground();
        int iM28472c = C8937a.m28472c(autoCompleteTextView, C8908b.f33821k);
        int[][] iArr = {new int[]{R.attr.state_pressed}, new int[0]};
        if (boxBackgroundMode == 2) {
            m24842w(autoCompleteTextView, iM28472c, iArr, boxBackground);
        } else if (boxBackgroundMode == 1) {
            m24841v(autoCompleteTextView, iM28472c, iArr, boxBackground);
        }
    }

    /* renamed from: v */
    private void m24841v(AutoCompleteTextView autoCompleteTextView, int i2, int[][] iArr, C8900g c8900g) {
        int boxBackgroundColor = this.f30559a.getBoxBackgroundColor();
        int[] iArr2 = {C8937a.m28475f(i2, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (f30532d) {
            C0311u.m2139m0(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), c8900g, c8900g));
            return;
        }
        C8900g c8900g2 = new C8900g(c8900g.m28272D());
        c8900g2.m28284X(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{c8900g, c8900g2});
        int iM2090D = C0311u.m2090D(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int iM2088C = C0311u.m2088C(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        C0311u.m2139m0(autoCompleteTextView, layerDrawable);
        C0311u.m2159w0(autoCompleteTextView, iM2090D, paddingTop, iM2088C, paddingBottom);
    }

    /* renamed from: w */
    private void m24842w(AutoCompleteTextView autoCompleteTextView, int i2, int[][] iArr, C8900g c8900g) {
        LayerDrawable layerDrawable;
        int iM28472c = C8937a.m28472c(autoCompleteTextView, C8908b.f33825o);
        C8900g c8900g2 = new C8900g(c8900g.m28272D());
        int iM28475f = C8937a.m28475f(i2, iM28472c, 0.1f);
        c8900g2.m28284X(new ColorStateList(iArr, new int[]{iM28475f, 0}));
        if (f30532d) {
            c8900g2.setTint(iM28472c);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iM28475f, iM28472c});
            C8900g c8900g3 = new C8900g(c8900g.m28272D());
            c8900g3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c8900g2, c8900g3), c8900g});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{c8900g2, c8900g});
        }
        C0311u.m2139m0(autoCompleteTextView, layerDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public AutoCompleteTextView m24843x(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    /* renamed from: y */
    private ValueAnimator m24844y(int i2, float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(C8919a.f34370a);
        valueAnimatorOfFloat.setDuration(i2);
        valueAnimatorOfFloat.addUpdateListener(new b());
        return valueAnimatorOfFloat;
    }

    /* renamed from: z */
    private C8900g m24845z(float f2, float f3, float f4, int i2) {
        C8904k c8904kM28355m = C8904k.m28313a().m28367z(f2).m28353D(f2).m28359r(f3).m28363v(f3).m28355m();
        C8900g c8900gM28263m = C8900g.m28263m(this.f30560b, f4);
        c8900gM28263m.setShapeAppearanceModel(c8904kM28355m);
        c8900gM28263m.m28286Z(0, i2, 0, i2);
        return c8900gM28263m;
    }

    @Override // com.google.android.material.textfield.AbstractC8074e
    /* renamed from: a */
    void mo24807a() throws Resources.NotFoundException {
        float dimensionPixelOffset = this.f30560b.getResources().getDimensionPixelOffset(C8910d.f33860N);
        float dimensionPixelOffset2 = this.f30560b.getResources().getDimensionPixelOffset(C8910d.f33857K);
        int dimensionPixelOffset3 = this.f30560b.getResources().getDimensionPixelOffset(C8910d.f33858L);
        C8900g c8900gM24845z = m24845z(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        C8900g c8900gM24845z2 = m24845z(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f30542n = c8900gM24845z;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f30541m = stateListDrawable;
        stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, c8900gM24845z);
        this.f30541m.addState(new int[0], c8900gM24845z2);
        this.f30559a.setEndIconDrawable(C0833a.m5262d(this.f30560b, f30532d ? C8911e.f33896e : C8911e.f33897f));
        TextInputLayout textInputLayout = this.f30559a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C8916j.f33962f));
        this.f30559a.setEndIconOnClickListener(new g());
        this.f30559a.addOnEditTextAttachedListener(this.f30536h);
        this.f30559a.addOnEndIconChangedListener(this.f30537i);
        m24818A();
        C0311u.m2153t0(this.f30561c, 2);
        this.f30543o = (AccessibilityManager) this.f30560b.getSystemService("accessibility");
    }

    @Override // com.google.android.material.textfield.AbstractC8074e
    /* renamed from: b */
    boolean mo24846b(int i2) {
        return i2 != 0;
    }

    @Override // com.google.android.material.textfield.AbstractC8074e
    /* renamed from: d */
    boolean mo24847d() {
        return true;
    }
}
