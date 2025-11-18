package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.a0;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import j.C3699a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k1.C3784a;
import s1.C4462v;
import s1.X;
import t1.c;

/* compiled from: EndCompoundLayout.java */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
class r extends LinearLayout {

    /* renamed from: B, reason: collision with root package name */
    final TextInputLayout f37370B;

    /* renamed from: C, reason: collision with root package name */
    private final FrameLayout f37371C;

    /* renamed from: D, reason: collision with root package name */
    private final CheckableImageButton f37372D;

    /* renamed from: E, reason: collision with root package name */
    private ColorStateList f37373E;

    /* renamed from: F, reason: collision with root package name */
    private PorterDuff.Mode f37374F;

    /* renamed from: G, reason: collision with root package name */
    private View.OnLongClickListener f37375G;

    /* renamed from: H, reason: collision with root package name */
    private final CheckableImageButton f37376H;

    /* renamed from: I, reason: collision with root package name */
    private final d f37377I;

    /* renamed from: J, reason: collision with root package name */
    private int f37378J;

    /* renamed from: K, reason: collision with root package name */
    private final LinkedHashSet<TextInputLayout.g> f37379K;

    /* renamed from: L, reason: collision with root package name */
    private ColorStateList f37380L;

    /* renamed from: M, reason: collision with root package name */
    private PorterDuff.Mode f37381M;

    /* renamed from: N, reason: collision with root package name */
    private int f37382N;

    /* renamed from: O, reason: collision with root package name */
    private ImageView.ScaleType f37383O;

    /* renamed from: P, reason: collision with root package name */
    private View.OnLongClickListener f37384P;

    /* renamed from: Q, reason: collision with root package name */
    private CharSequence f37385Q;

    /* renamed from: R, reason: collision with root package name */
    private final TextView f37386R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f37387S;

    /* renamed from: T, reason: collision with root package name */
    private EditText f37388T;

    /* renamed from: U, reason: collision with root package name */
    private final AccessibilityManager f37389U;

    /* renamed from: V, reason: collision with root package name */
    private c.a f37390V;

    /* renamed from: W, reason: collision with root package name */
    private final TextWatcher f37391W;

    /* renamed from: a0, reason: collision with root package name */
    private final TextInputLayout.f f37392a0;

    /* compiled from: EndCompoundLayout.java */
    class a extends com.google.android.material.internal.q {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            r.this.m().a(editable);
        }

        @Override // com.google.android.material.internal.q, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            r.this.m().b(charSequence, i10, i11, i12);
        }
    }

    /* compiled from: EndCompoundLayout.java */
    class b implements TextInputLayout.f {
        b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            if (r.this.f37388T == textInputLayout.getEditText()) {
                return;
            }
            if (r.this.f37388T != null) {
                r.this.f37388T.removeTextChangedListener(r.this.f37391W);
                if (r.this.f37388T.getOnFocusChangeListener() == r.this.m().e()) {
                    r.this.f37388T.setOnFocusChangeListener(null);
                }
            }
            r.this.f37388T = textInputLayout.getEditText();
            if (r.this.f37388T != null) {
                r.this.f37388T.addTextChangedListener(r.this.f37391W);
            }
            r.this.m().n(r.this.f37388T);
            r rVar = r.this;
            rVar.h0(rVar.m());
        }
    }

    /* compiled from: EndCompoundLayout.java */
    class c implements View.OnAttachStateChangeListener {
        c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            r.this.g();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            r.this.M();
        }
    }

    /* compiled from: EndCompoundLayout.java */
    private static class d {

        /* renamed from: a, reason: collision with root package name */
        private final SparseArray<s> f37396a = new SparseArray<>();

        /* renamed from: b, reason: collision with root package name */
        private final r f37397b;

        /* renamed from: c, reason: collision with root package name */
        private final int f37398c;

        /* renamed from: d, reason: collision with root package name */
        private final int f37399d;

        d(r rVar, a0 a0Var) {
            this.f37397b = rVar;
            this.f37398c = a0Var.n(C7.m.f3035q8, 0);
            this.f37399d = a0Var.n(C7.m.f2739O8, 0);
        }

        private s b(int i10) {
            if (i10 == -1) {
                return new g(this.f37397b);
            }
            if (i10 == 0) {
                return new w(this.f37397b);
            }
            if (i10 == 1) {
                return new y(this.f37397b, this.f37399d);
            }
            if (i10 == 2) {
                return new f(this.f37397b);
            }
            if (i10 == 3) {
                return new p(this.f37397b);
            }
            throw new IllegalArgumentException("Invalid end icon mode: " + i10);
        }

        s c(int i10) {
            s sVar = this.f37396a.get(i10);
            if (sVar != null) {
                return sVar;
            }
            s sVarB = b(i10);
            this.f37396a.append(i10, sVarB);
            return sVarB;
        }
    }

    r(TextInputLayout textInputLayout, a0 a0Var) {
        super(textInputLayout.getContext());
        this.f37378J = 0;
        this.f37379K = new LinkedHashSet<>();
        this.f37391W = new a();
        b bVar = new b();
        this.f37392a0 = bVar;
        this.f37389U = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f37370B = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f37371C = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonI = i(this, layoutInflaterFrom, C7.g.f2465V);
        this.f37372D = checkableImageButtonI;
        CheckableImageButton checkableImageButtonI2 = i(frameLayout, layoutInflaterFrom, C7.g.f2464U);
        this.f37376H = checkableImageButtonI2;
        this.f37377I = new d(this, a0Var);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f37386R = appCompatTextView;
        C(a0Var);
        B(a0Var);
        D(a0Var);
        frameLayout.addView(checkableImageButtonI2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(checkableImageButtonI);
        textInputLayout.i(bVar);
        addOnAttachStateChangeListener(new c());
    }

    private void B(a0 a0Var) {
        int i10 = C7.m.f2749P8;
        if (!a0Var.s(i10)) {
            int i11 = C7.m.f3079u8;
            if (a0Var.s(i11)) {
                this.f37380L = U7.c.b(getContext(), a0Var, i11);
            }
            int i12 = C7.m.f3090v8;
            if (a0Var.s(i12)) {
                this.f37381M = com.google.android.material.internal.u.i(a0Var.k(i12, -1), null);
            }
        }
        int i13 = C7.m.f3057s8;
        if (a0Var.s(i13)) {
            U(a0Var.k(i13, 0));
            int i14 = C7.m.f3024p8;
            if (a0Var.s(i14)) {
                Q(a0Var.p(i14));
            }
            O(a0Var.a(C7.m.f3013o8, true));
        } else if (a0Var.s(i10)) {
            int i15 = C7.m.f2759Q8;
            if (a0Var.s(i15)) {
                this.f37380L = U7.c.b(getContext(), a0Var, i15);
            }
            int i16 = C7.m.f2769R8;
            if (a0Var.s(i16)) {
                this.f37381M = com.google.android.material.internal.u.i(a0Var.k(i16, -1), null);
            }
            U(a0Var.a(i10, false) ? 1 : 0);
            Q(a0Var.p(C7.m.f2729N8));
        }
        T(a0Var.f(C7.m.f3046r8, getResources().getDimensionPixelSize(C7.e.f2412q0)));
        int i17 = C7.m.f3068t8;
        if (a0Var.s(i17)) {
            X(t.b(a0Var.k(i17, -1)));
        }
    }

    private void C(a0 a0Var) {
        int i10 = C7.m.f2599A8;
        if (a0Var.s(i10)) {
            this.f37373E = U7.c.b(getContext(), a0Var, i10);
        }
        int i11 = C7.m.f2609B8;
        if (a0Var.s(i11)) {
            this.f37374F = com.google.android.material.internal.u.i(a0Var.k(i11, -1), null);
        }
        int i12 = C7.m.f3130z8;
        if (a0Var.s(i12)) {
            c0(a0Var.g(i12));
        }
        this.f37372D.setContentDescription(getResources().getText(C7.k.f2537f));
        X.x0(this.f37372D, 2);
        this.f37372D.setClickable(false);
        this.f37372D.setPressable(false);
        this.f37372D.setFocusable(false);
    }

    private void D(a0 a0Var) {
        this.f37386R.setVisibility(8);
        this.f37386R.setId(C7.g.f2473b0);
        this.f37386R.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        X.p0(this.f37386R, 1);
        q0(a0Var.n(C7.m.f2926g9, 0));
        int i10 = C7.m.f2937h9;
        if (a0Var.s(i10)) {
            r0(a0Var.c(i10));
        }
        p0(a0Var.p(C7.m.f2915f9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M() {
        AccessibilityManager accessibilityManager;
        c.a aVar = this.f37390V;
        if (aVar == null || (accessibilityManager = this.f37389U) == null) {
            return;
        }
        t1.c.b(accessibilityManager, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f37390V == null || this.f37389U == null || !X.Q(this)) {
            return;
        }
        t1.c.a(this.f37389U, this.f37390V);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(s sVar) {
        if (this.f37388T == null) {
            return;
        }
        if (sVar.e() != null) {
            this.f37388T.setOnFocusChangeListener(sVar.e());
        }
        if (sVar.g() != null) {
            this.f37376H.setOnFocusChangeListener(sVar.g());
        }
    }

    private CheckableImageButton i(ViewGroup viewGroup, LayoutInflater layoutInflater, int i10) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(C7.i.f2510h, viewGroup, false);
        checkableImageButton.setId(i10);
        t.e(checkableImageButton);
        if (U7.c.j(getContext())) {
            C4462v.d((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    private void j(int i10) {
        Iterator<TextInputLayout.g> it = this.f37379K.iterator();
        while (it.hasNext()) {
            it.next().a(this.f37370B, i10);
        }
    }

    private void s0(s sVar) {
        sVar.s();
        this.f37390V = sVar.h();
        g();
    }

    private int t(s sVar) {
        int i10 = this.f37377I.f37398c;
        return i10 == 0 ? sVar.d() : i10;
    }

    private void t0(s sVar) {
        M();
        this.f37390V = null;
        sVar.u();
    }

    private void u0(boolean z10) {
        if (!z10 || n() == null) {
            t.a(this.f37370B, this.f37376H, this.f37380L, this.f37381M);
            return;
        }
        Drawable drawableMutate = C3784a.r(n()).mutate();
        C3784a.n(drawableMutate, this.f37370B.getErrorCurrentTextColors());
        this.f37376H.setImageDrawable(drawableMutate);
    }

    private void v0() {
        this.f37371C.setVisibility((this.f37376H.getVisibility() != 0 || G()) ? 8 : 0);
        setVisibility((F() || G() || !((this.f37385Q == null || this.f37387S) ? 8 : false)) ? 0 : 8);
    }

    private void w0() {
        this.f37372D.setVisibility(s() != null && this.f37370B.N() && this.f37370B.d0() ? 0 : 8);
        v0();
        x0();
        if (A()) {
            return;
        }
        this.f37370B.o0();
    }

    private void y0() {
        int visibility = this.f37386R.getVisibility();
        int i10 = (this.f37385Q == null || this.f37387S) ? 8 : 0;
        if (visibility != i10) {
            m().q(i10 == 0);
        }
        v0();
        this.f37386R.setVisibility(i10);
        this.f37370B.o0();
    }

    boolean A() {
        return this.f37378J != 0;
    }

    boolean E() {
        return A() && this.f37376H.isChecked();
    }

    boolean F() {
        return this.f37371C.getVisibility() == 0 && this.f37376H.getVisibility() == 0;
    }

    boolean G() {
        return this.f37372D.getVisibility() == 0;
    }

    void H(boolean z10) {
        this.f37387S = z10;
        y0();
    }

    void I() {
        w0();
        K();
        J();
        if (m().t()) {
            u0(this.f37370B.d0());
        }
    }

    void J() {
        t.d(this.f37370B, this.f37376H, this.f37380L);
    }

    void K() {
        t.d(this.f37370B, this.f37372D, this.f37373E);
    }

    void L(boolean z10) {
        boolean z11;
        boolean zIsActivated;
        boolean zIsChecked;
        s sVarM = m();
        boolean z12 = true;
        if (!sVarM.l() || (zIsChecked = this.f37376H.isChecked()) == sVarM.m()) {
            z11 = false;
        } else {
            this.f37376H.setChecked(!zIsChecked);
            z11 = true;
        }
        if (!sVarM.j() || (zIsActivated = this.f37376H.isActivated()) == sVarM.k()) {
            z12 = z11;
        } else {
            N(!zIsActivated);
        }
        if (z10 || z12) {
            J();
        }
    }

    void N(boolean z10) {
        this.f37376H.setActivated(z10);
    }

    void O(boolean z10) {
        this.f37376H.setCheckable(z10);
    }

    void P(int i10) {
        Q(i10 != 0 ? getResources().getText(i10) : null);
    }

    void Q(CharSequence charSequence) {
        if (l() != charSequence) {
            this.f37376H.setContentDescription(charSequence);
        }
    }

    void R(int i10) {
        S(i10 != 0 ? C3699a.b(getContext(), i10) : null);
    }

    void S(Drawable drawable) {
        this.f37376H.setImageDrawable(drawable);
        if (drawable != null) {
            t.a(this.f37370B, this.f37376H, this.f37380L, this.f37381M);
            J();
        }
    }

    void T(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i10 != this.f37382N) {
            this.f37382N = i10;
            t.g(this.f37376H, i10);
            t.g(this.f37372D, i10);
        }
    }

    void U(int i10) {
        if (this.f37378J == i10) {
            return;
        }
        t0(m());
        int i11 = this.f37378J;
        this.f37378J = i10;
        j(i11);
        a0(i10 != 0);
        s sVarM = m();
        R(t(sVarM));
        P(sVarM.c());
        O(sVarM.l());
        if (!sVarM.i(this.f37370B.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + this.f37370B.getBoxBackgroundMode() + " is not supported by the end icon mode " + i10);
        }
        s0(sVarM);
        V(sVarM.f());
        EditText editText = this.f37388T;
        if (editText != null) {
            sVarM.n(editText);
            h0(sVarM);
        }
        t.a(this.f37370B, this.f37376H, this.f37380L, this.f37381M);
        L(true);
    }

    void V(View.OnClickListener onClickListener) {
        t.h(this.f37376H, onClickListener, this.f37384P);
    }

    void W(View.OnLongClickListener onLongClickListener) {
        this.f37384P = onLongClickListener;
        t.i(this.f37376H, onLongClickListener);
    }

    void X(ImageView.ScaleType scaleType) {
        this.f37383O = scaleType;
        t.j(this.f37376H, scaleType);
        t.j(this.f37372D, scaleType);
    }

    void Y(ColorStateList colorStateList) {
        if (this.f37380L != colorStateList) {
            this.f37380L = colorStateList;
            t.a(this.f37370B, this.f37376H, colorStateList, this.f37381M);
        }
    }

    void Z(PorterDuff.Mode mode) {
        if (this.f37381M != mode) {
            this.f37381M = mode;
            t.a(this.f37370B, this.f37376H, this.f37380L, mode);
        }
    }

    void a0(boolean z10) {
        if (F() != z10) {
            this.f37376H.setVisibility(z10 ? 0 : 8);
            v0();
            x0();
            this.f37370B.o0();
        }
    }

    void b0(int i10) {
        c0(i10 != 0 ? C3699a.b(getContext(), i10) : null);
        K();
    }

    void c0(Drawable drawable) {
        this.f37372D.setImageDrawable(drawable);
        w0();
        t.a(this.f37370B, this.f37372D, this.f37373E, this.f37374F);
    }

    void d0(View.OnClickListener onClickListener) {
        t.h(this.f37372D, onClickListener, this.f37375G);
    }

    void e0(View.OnLongClickListener onLongClickListener) {
        this.f37375G = onLongClickListener;
        t.i(this.f37372D, onLongClickListener);
    }

    void f0(ColorStateList colorStateList) {
        if (this.f37373E != colorStateList) {
            this.f37373E = colorStateList;
            t.a(this.f37370B, this.f37372D, colorStateList, this.f37374F);
        }
    }

    void g0(PorterDuff.Mode mode) {
        if (this.f37374F != mode) {
            this.f37374F = mode;
            t.a(this.f37370B, this.f37372D, this.f37373E, mode);
        }
    }

    void h() {
        this.f37376H.performClick();
        this.f37376H.jumpDrawablesToCurrentState();
    }

    void i0(int i10) {
        j0(i10 != 0 ? getResources().getText(i10) : null);
    }

    void j0(CharSequence charSequence) {
        this.f37376H.setContentDescription(charSequence);
    }

    CheckableImageButton k() {
        if (G()) {
            return this.f37372D;
        }
        if (A() && F()) {
            return this.f37376H;
        }
        return null;
    }

    void k0(int i10) {
        l0(i10 != 0 ? C3699a.b(getContext(), i10) : null);
    }

    CharSequence l() {
        return this.f37376H.getContentDescription();
    }

    void l0(Drawable drawable) {
        this.f37376H.setImageDrawable(drawable);
    }

    s m() {
        return this.f37377I.c(this.f37378J);
    }

    void m0(boolean z10) {
        if (z10 && this.f37378J != 1) {
            U(1);
        } else {
            if (z10) {
                return;
            }
            U(0);
        }
    }

    Drawable n() {
        return this.f37376H.getDrawable();
    }

    void n0(ColorStateList colorStateList) {
        this.f37380L = colorStateList;
        t.a(this.f37370B, this.f37376H, colorStateList, this.f37381M);
    }

    int o() {
        return this.f37382N;
    }

    void o0(PorterDuff.Mode mode) {
        this.f37381M = mode;
        t.a(this.f37370B, this.f37376H, this.f37380L, mode);
    }

    int p() {
        return this.f37378J;
    }

    void p0(CharSequence charSequence) {
        this.f37385Q = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f37386R.setText(charSequence);
        y0();
    }

    ImageView.ScaleType q() {
        return this.f37383O;
    }

    void q0(int i10) {
        androidx.core.widget.j.q(this.f37386R, i10);
    }

    CheckableImageButton r() {
        return this.f37376H;
    }

    void r0(ColorStateList colorStateList) {
        this.f37386R.setTextColor(colorStateList);
    }

    Drawable s() {
        return this.f37372D.getDrawable();
    }

    CharSequence u() {
        return this.f37376H.getContentDescription();
    }

    Drawable v() {
        return this.f37376H.getDrawable();
    }

    CharSequence w() {
        return this.f37385Q;
    }

    ColorStateList x() {
        return this.f37386R.getTextColors();
    }

    void x0() {
        if (this.f37370B.f37251E == null) {
            return;
        }
        X.C0(this.f37386R, getContext().getResources().getDimensionPixelSize(C7.e.f2374V), this.f37370B.f37251E.getPaddingTop(), (F() || G()) ? 0 : X.D(this.f37370B.f37251E), this.f37370B.f37251E.getPaddingBottom());
    }

    int y() {
        return X.D(this) + X.D(this.f37386R) + ((F() || G()) ? this.f37376H.getMeasuredWidth() + C4462v.b((ViewGroup.MarginLayoutParams) this.f37376H.getLayoutParams()) : 0);
    }

    TextView z() {
        return this.f37386R;
    }
}
