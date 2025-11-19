package com.google.android.material.textfield;

import X7.k;
import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C1987i;
import androidx.appcompat.widget.I;
import androidx.appcompat.widget.a0;
import androidx.transition.C2182c;
import b8.C2272a;
import com.google.android.material.internal.CheckableImageButton;
import g1.C3377a;
import j.C3699a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k1.C3784a;
import q1.C4260a;
import s1.C4421a;
import s1.C4462v;
import s1.X;
import y1.AbstractC5121a;

/* loaded from: classes2.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d1, reason: collision with root package name */
    private static final int f37242d1 = C7.l.f2577n;

    /* renamed from: e1, reason: collision with root package name */
    private static final int[][] f37243e1 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* renamed from: A0, reason: collision with root package name */
    private final Rect f37244A0;

    /* renamed from: B, reason: collision with root package name */
    private final FrameLayout f37245B;

    /* renamed from: B0, reason: collision with root package name */
    private final RectF f37246B0;

    /* renamed from: C, reason: collision with root package name */
    private final z f37247C;

    /* renamed from: C0, reason: collision with root package name */
    private Typeface f37248C0;

    /* renamed from: D, reason: collision with root package name */
    private final r f37249D;

    /* renamed from: D0, reason: collision with root package name */
    private Drawable f37250D0;

    /* renamed from: E, reason: collision with root package name */
    EditText f37251E;

    /* renamed from: E0, reason: collision with root package name */
    private int f37252E0;

    /* renamed from: F, reason: collision with root package name */
    private CharSequence f37253F;

    /* renamed from: F0, reason: collision with root package name */
    private final LinkedHashSet<f> f37254F0;

    /* renamed from: G, reason: collision with root package name */
    private int f37255G;

    /* renamed from: G0, reason: collision with root package name */
    private Drawable f37256G0;

    /* renamed from: H, reason: collision with root package name */
    private int f37257H;

    /* renamed from: H0, reason: collision with root package name */
    private int f37258H0;

    /* renamed from: I, reason: collision with root package name */
    private int f37259I;

    /* renamed from: I0, reason: collision with root package name */
    private Drawable f37260I0;

    /* renamed from: J, reason: collision with root package name */
    private int f37261J;

    /* renamed from: J0, reason: collision with root package name */
    private ColorStateList f37262J0;

    /* renamed from: K, reason: collision with root package name */
    private final u f37263K;

    /* renamed from: K0, reason: collision with root package name */
    private ColorStateList f37264K0;

    /* renamed from: L, reason: collision with root package name */
    boolean f37265L;

    /* renamed from: L0, reason: collision with root package name */
    private int f37266L0;

    /* renamed from: M, reason: collision with root package name */
    private int f37267M;

    /* renamed from: M0, reason: collision with root package name */
    private int f37268M0;

    /* renamed from: N, reason: collision with root package name */
    private boolean f37269N;

    /* renamed from: N0, reason: collision with root package name */
    private int f37270N0;

    /* renamed from: O, reason: collision with root package name */
    private e f37271O;

    /* renamed from: O0, reason: collision with root package name */
    private ColorStateList f37272O0;

    /* renamed from: P, reason: collision with root package name */
    private TextView f37273P;

    /* renamed from: P0, reason: collision with root package name */
    private int f37274P0;

    /* renamed from: Q, reason: collision with root package name */
    private int f37275Q;

    /* renamed from: Q0, reason: collision with root package name */
    private int f37276Q0;

    /* renamed from: R, reason: collision with root package name */
    private int f37277R;

    /* renamed from: R0, reason: collision with root package name */
    private int f37278R0;

    /* renamed from: S, reason: collision with root package name */
    private CharSequence f37279S;

    /* renamed from: S0, reason: collision with root package name */
    private int f37280S0;

    /* renamed from: T, reason: collision with root package name */
    private boolean f37281T;

    /* renamed from: T0, reason: collision with root package name */
    private int f37282T0;

    /* renamed from: U, reason: collision with root package name */
    private TextView f37283U;

    /* renamed from: U0, reason: collision with root package name */
    int f37284U0;

    /* renamed from: V, reason: collision with root package name */
    private ColorStateList f37285V;

    /* renamed from: V0, reason: collision with root package name */
    private boolean f37286V0;

    /* renamed from: W, reason: collision with root package name */
    private int f37287W;

    /* renamed from: W0, reason: collision with root package name */
    final com.google.android.material.internal.a f37288W0;

    /* renamed from: X0, reason: collision with root package name */
    private boolean f37289X0;

    /* renamed from: Y0, reason: collision with root package name */
    private boolean f37290Y0;

    /* renamed from: Z0, reason: collision with root package name */
    private ValueAnimator f37291Z0;

    /* renamed from: a0, reason: collision with root package name */
    private C2182c f37292a0;

    /* renamed from: a1, reason: collision with root package name */
    private boolean f37293a1;

    /* renamed from: b0, reason: collision with root package name */
    private C2182c f37294b0;

    /* renamed from: b1, reason: collision with root package name */
    private boolean f37295b1;

    /* renamed from: c0, reason: collision with root package name */
    private ColorStateList f37296c0;

    /* renamed from: c1, reason: collision with root package name */
    private boolean f37297c1;

    /* renamed from: d0, reason: collision with root package name */
    private ColorStateList f37298d0;

    /* renamed from: e0, reason: collision with root package name */
    private ColorStateList f37299e0;

    /* renamed from: f0, reason: collision with root package name */
    private ColorStateList f37300f0;

    /* renamed from: g0, reason: collision with root package name */
    private boolean f37301g0;

    /* renamed from: h0, reason: collision with root package name */
    private CharSequence f37302h0;

    /* renamed from: i0, reason: collision with root package name */
    private boolean f37303i0;

    /* renamed from: j0, reason: collision with root package name */
    private X7.g f37304j0;

    /* renamed from: k0, reason: collision with root package name */
    private X7.g f37305k0;

    /* renamed from: l0, reason: collision with root package name */
    private StateListDrawable f37306l0;

    /* renamed from: m0, reason: collision with root package name */
    private boolean f37307m0;

    /* renamed from: n0, reason: collision with root package name */
    private X7.g f37308n0;

    /* renamed from: o0, reason: collision with root package name */
    private X7.g f37309o0;

    /* renamed from: p0, reason: collision with root package name */
    private X7.k f37310p0;

    /* renamed from: q0, reason: collision with root package name */
    private boolean f37311q0;

    /* renamed from: r0, reason: collision with root package name */
    private final int f37312r0;

    /* renamed from: s0, reason: collision with root package name */
    private int f37313s0;

    /* renamed from: t0, reason: collision with root package name */
    private int f37314t0;

    /* renamed from: u0, reason: collision with root package name */
    private int f37315u0;

    /* renamed from: v0, reason: collision with root package name */
    private int f37316v0;

    /* renamed from: w0, reason: collision with root package name */
    private int f37317w0;

    /* renamed from: x0, reason: collision with root package name */
    private int f37318x0;

    /* renamed from: y0, reason: collision with root package name */
    private int f37319y0;

    /* renamed from: z0, reason: collision with root package name */
    private final Rect f37320z0;

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f37249D.h();
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f37288W0.c0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class d extends C4421a {

        /* renamed from: d, reason: collision with root package name */
        private final TextInputLayout f37326d;

        public d(TextInputLayout textInputLayout) {
            this.f37326d = textInputLayout;
        }

        @Override // s1.C4421a
        public void g(View view, t1.t tVar) {
            super.g(view, tVar);
            EditText editText = this.f37326d.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f37326d.getHint();
            CharSequence error = this.f37326d.getError();
            CharSequence placeholderText = this.f37326d.getPlaceholderText();
            int counterMaxLength = this.f37326d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f37326d.getCounterOverflowDescription();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            boolean zIsEmpty2 = TextUtils.isEmpty(hint);
            boolean zP = this.f37326d.P();
            boolean zIsEmpty3 = TextUtils.isEmpty(error);
            boolean z10 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
            String string = !zIsEmpty2 ? hint.toString() : "";
            this.f37326d.f37247C.A(tVar);
            if (!zIsEmpty) {
                tVar.P0(text);
            } else if (!TextUtils.isEmpty(string)) {
                tVar.P0(string);
                if (!zP && placeholderText != null) {
                    tVar.P0(string + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                tVar.P0(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                tVar.v0(string);
                tVar.M0(zIsEmpty);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            tVar.A0(counterMaxLength);
            if (z10) {
                if (zIsEmpty3) {
                    error = counterOverflowDescription;
                }
                tVar.q0(error);
            }
            View viewT = this.f37326d.f37263K.t();
            if (viewT != null) {
                tVar.x0(viewT);
            }
            this.f37326d.f37249D.m().o(view, tVar);
        }

        @Override // s1.C4421a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            this.f37326d.f37249D.m().p(view, accessibilityEvent);
        }
    }

    public interface e {
        int a(Editable editable);
    }

    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    public interface g {
        void a(TextInputLayout textInputLayout, int i10);
    }

    static class h extends AbstractC5121a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: D, reason: collision with root package name */
        CharSequence f37327D;

        /* renamed from: E, reason: collision with root package name */
        boolean f37328E;

        class a implements Parcelable.ClassLoaderCreator<h> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public h[] newArray(int i10) {
                return new h[i10];
            }
        }

        h(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f37327D) + "}";
        }

        @Override // y1.AbstractC5121a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            TextUtils.writeToParcel(this.f37327D, parcel, i10);
            parcel.writeInt(this.f37328E ? 1 : 0);
        }

        h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f37327D = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f37328E = parcel.readInt() == 1;
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7.c.f2324k0);
    }

    private C2182c A() {
        C2182c c2182c = new C2182c();
        c2182c.o0(R7.i.f(getContext(), C7.c.f2287K, 87));
        c2182c.q0(R7.i.g(getContext(), C7.c.f2293Q, D7.a.f3486a));
        return c2182c;
    }

    private boolean B() {
        return this.f37301g0 && !TextUtils.isEmpty(this.f37302h0) && (this.f37304j0 instanceof com.google.android.material.textfield.h);
    }

    private void C() {
        Iterator<f> it = this.f37254F0.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    private void D(Canvas canvas) {
        X7.g gVar;
        if (this.f37309o0 == null || (gVar = this.f37308n0) == null) {
            return;
        }
        gVar.draw(canvas);
        if (this.f37251E.isFocused()) {
            Rect bounds = this.f37309o0.getBounds();
            Rect bounds2 = this.f37308n0.getBounds();
            float fX = this.f37288W0.x();
            int iCenterX = bounds2.centerX();
            bounds.left = D7.a.c(iCenterX, bounds2.left, fX);
            bounds.right = D7.a.c(iCenterX, bounds2.right, fX);
            this.f37309o0.draw(canvas);
        }
    }

    private void E(Canvas canvas) {
        if (this.f37301g0) {
            this.f37288W0.l(canvas);
        }
    }

    private void F(boolean z10) {
        ValueAnimator valueAnimator = this.f37291Z0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f37291Z0.cancel();
        }
        if (z10 && this.f37290Y0) {
            l(0.0f);
        } else {
            this.f37288W0.c0(0.0f);
        }
        if (B() && ((com.google.android.material.textfield.h) this.f37304j0).r0()) {
            y();
        }
        this.f37286V0 = true;
        L();
        this.f37247C.l(true);
        this.f37249D.H(true);
    }

    private X7.g G(boolean z10) throws Resources.NotFoundException {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(C7.e.f2420u0);
        float f10 = z10 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f37251E;
        float popupElevation = editText instanceof v ? ((v) editText).getPopupElevation() : getResources().getDimensionPixelOffset(C7.e.f2356D);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(C7.e.f2408o0);
        X7.k kVarM = X7.k.a().A(f10).E(f10).s(dimensionPixelOffset).w(dimensionPixelOffset).m();
        EditText editText2 = this.f37251E;
        X7.g gVarM = X7.g.m(getContext(), popupElevation, editText2 instanceof v ? ((v) editText2).getDropDownBackgroundTintList() : null);
        gVarM.setShapeAppearanceModel(kVarM);
        gVarM.d0(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        return gVarM;
    }

    private static Drawable H(X7.g gVar, int i10, int i11, int[][] iArr) {
        return new RippleDrawable(new ColorStateList(iArr, new int[]{M7.a.j(i11, i10, 0.1f), i10}), gVar, gVar);
    }

    private int I(int i10, boolean z10) {
        return i10 + ((z10 || getPrefixText() == null) ? (!z10 || getSuffixText() == null) ? this.f37251E.getCompoundPaddingLeft() : this.f37249D.y() : this.f37247C.c());
    }

    private int J(int i10, boolean z10) {
        return i10 - ((z10 || getSuffixText() == null) ? (!z10 || getPrefixText() == null) ? this.f37251E.getCompoundPaddingRight() : this.f37247C.c() : this.f37249D.y());
    }

    private static Drawable K(Context context, X7.g gVar, int i10, int[][] iArr) {
        int iC = M7.a.c(context, C7.c.f2331p, "TextInputLayout");
        X7.g gVar2 = new X7.g(gVar.E());
        int iJ = M7.a.j(i10, iC, 0.1f);
        gVar2.b0(new ColorStateList(iArr, new int[]{iJ, 0}));
        gVar2.setTint(iC);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iJ, iC});
        X7.g gVar3 = new X7.g(gVar.E());
        gVar3.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), gVar});
    }

    private void L() {
        TextView textView = this.f37283U;
        if (textView == null || !this.f37281T) {
            return;
        }
        textView.setText((CharSequence) null);
        androidx.transition.s.a(this.f37245B, this.f37294b0);
        this.f37283U.setVisibility(4);
    }

    private boolean Q() {
        return d0() || (this.f37273P != null && this.f37269N);
    }

    private boolean S() {
        return this.f37313s0 == 1 && this.f37251E.getMinLines() <= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int T(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U() {
        this.f37251E.requestLayout();
    }

    private void V() {
        p();
        r0();
        A0();
        h0();
        k();
        if (this.f37313s0 != 0) {
            t0();
        }
        b0();
    }

    private void W() {
        if (B()) {
            RectF rectF = this.f37246B0;
            this.f37288W0.o(rectF, this.f37251E.getWidth(), this.f37251E.getGravity());
            if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                return;
            }
            o(rectF);
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f37315u0);
            ((com.google.android.material.textfield.h) this.f37304j0).u0(rectF);
        }
    }

    private void X() {
        if (!B() || this.f37286V0) {
            return;
        }
        y();
        W();
    }

    private static void Y(ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                Y((ViewGroup) childAt, z10);
            }
        }
    }

    private void a0() {
        TextView textView = this.f37283U;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void b0() {
        EditText editText = this.f37251E;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i10 = this.f37313s0;
                if (i10 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i10 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    private boolean e0() {
        return (this.f37249D.G() || ((this.f37249D.A() && M()) || this.f37249D.w() != null)) && this.f37249D.getMeasuredWidth() > 0;
    }

    private boolean f0() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f37247C.getMeasuredWidth() > 0;
    }

    private void g0() {
        if (this.f37283U == null || !this.f37281T || TextUtils.isEmpty(this.f37279S)) {
            return;
        }
        this.f37283U.setText(this.f37279S);
        androidx.transition.s.a(this.f37245B, this.f37292a0);
        this.f37283U.setVisibility(0);
        this.f37283U.bringToFront();
        announceForAccessibility(this.f37279S);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f37251E;
        if (!(editText instanceof AutoCompleteTextView) || q.a(editText)) {
            return this.f37304j0;
        }
        int iD = M7.a.d(this.f37251E, C7.c.f2321j);
        int i10 = this.f37313s0;
        if (i10 == 2) {
            return K(getContext(), this.f37304j0, iD, f37243e1);
        }
        if (i10 == 1) {
            return H(this.f37304j0, this.f37319y0, iD, f37243e1);
        }
        return null;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f37306l0 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f37306l0 = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f37306l0.addState(new int[0], G(false));
        }
        return this.f37306l0;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f37305k0 == null) {
            this.f37305k0 = G(true);
        }
        return this.f37305k0;
    }

    private void h0() {
        if (this.f37313s0 == 1) {
            if (U7.c.k(getContext())) {
                this.f37314t0 = getResources().getDimensionPixelSize(C7.e.f2370R);
            } else if (U7.c.j(getContext())) {
                this.f37314t0 = getResources().getDimensionPixelSize(C7.e.f2369Q);
            }
        }
    }

    private void i0(Rect rect) {
        X7.g gVar = this.f37308n0;
        if (gVar != null) {
            int i10 = rect.bottom;
            gVar.setBounds(rect.left, i10 - this.f37316v0, rect.right, i10);
        }
        X7.g gVar2 = this.f37309o0;
        if (gVar2 != null) {
            int i11 = rect.bottom;
            gVar2.setBounds(rect.left, i11 - this.f37317w0, rect.right, i11);
        }
    }

    private void j() {
        TextView textView = this.f37283U;
        if (textView != null) {
            this.f37245B.addView(textView);
            this.f37283U.setVisibility(0);
        }
    }

    private void j0() {
        if (this.f37273P != null) {
            EditText editText = this.f37251E;
            k0(editText == null ? null : editText.getText());
        }
    }

    private void k() {
        if (this.f37251E == null || this.f37313s0 != 1) {
            return;
        }
        if (U7.c.k(getContext())) {
            EditText editText = this.f37251E;
            X.C0(editText, X.E(editText), getResources().getDimensionPixelSize(C7.e.f2368P), X.D(this.f37251E), getResources().getDimensionPixelSize(C7.e.f2367O));
        } else if (U7.c.j(getContext())) {
            EditText editText2 = this.f37251E;
            X.C0(editText2, X.E(editText2), getResources().getDimensionPixelSize(C7.e.f2366N), X.D(this.f37251E), getResources().getDimensionPixelSize(C7.e.f2365M));
        }
    }

    private static void l0(Context context, TextView textView, int i10, int i11, boolean z10) {
        textView.setContentDescription(context.getString(z10 ? C7.k.f2534c : C7.k.f2533b, Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    private void m() {
        X7.g gVar = this.f37304j0;
        if (gVar == null) {
            return;
        }
        X7.k kVarE = gVar.E();
        X7.k kVar = this.f37310p0;
        if (kVarE != kVar) {
            this.f37304j0.setShapeAppearanceModel(kVar);
        }
        if (w()) {
            this.f37304j0.h0(this.f37315u0, this.f37318x0);
        }
        int iQ = q();
        this.f37319y0 = iQ;
        this.f37304j0.b0(ColorStateList.valueOf(iQ));
        n();
        r0();
    }

    private void m0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f37273P;
        if (textView != null) {
            c0(textView, this.f37269N ? this.f37275Q : this.f37277R);
            if (!this.f37269N && (colorStateList2 = this.f37296c0) != null) {
                this.f37273P.setTextColor(colorStateList2);
            }
            if (!this.f37269N || (colorStateList = this.f37298d0) == null) {
                return;
            }
            this.f37273P.setTextColor(colorStateList);
        }
    }

    private void n() {
        if (this.f37308n0 == null || this.f37309o0 == null) {
            return;
        }
        if (x()) {
            this.f37308n0.b0(this.f37251E.isFocused() ? ColorStateList.valueOf(this.f37266L0) : ColorStateList.valueOf(this.f37318x0));
            this.f37309o0.b0(ColorStateList.valueOf(this.f37318x0));
        }
        invalidate();
    }

    private void n0() {
        ColorStateList colorStateList;
        ColorStateList colorStateListG = this.f37299e0;
        if (colorStateListG == null) {
            colorStateListG = M7.a.g(getContext(), C7.c.f2319i);
        }
        EditText editText = this.f37251E;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = C3784a.r(this.f37251E.getTextCursorDrawable()).mutate();
        if (Q() && (colorStateList = this.f37300f0) != null) {
            colorStateListG = colorStateList;
        }
        C3784a.o(drawableMutate, colorStateListG);
    }

    private void o(RectF rectF) {
        float f10 = rectF.left;
        int i10 = this.f37312r0;
        rectF.left = f10 - i10;
        rectF.right += i10;
    }

    private void p() {
        int i10 = this.f37313s0;
        if (i10 == 0) {
            this.f37304j0 = null;
            this.f37308n0 = null;
            this.f37309o0 = null;
            return;
        }
        if (i10 == 1) {
            this.f37304j0 = new X7.g(this.f37310p0);
            this.f37308n0 = new X7.g();
            this.f37309o0 = new X7.g();
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException(this.f37313s0 + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.f37301g0 || (this.f37304j0 instanceof com.google.android.material.textfield.h)) {
                this.f37304j0 = new X7.g(this.f37310p0);
            } else {
                this.f37304j0 = com.google.android.material.textfield.h.p0(this.f37310p0);
            }
            this.f37308n0 = null;
            this.f37309o0 = null;
        }
    }

    private int q() {
        return this.f37313s0 == 1 ? M7.a.i(M7.a.e(this, C7.c.f2331p, 0), this.f37319y0) : this.f37319y0;
    }

    private void q0() {
        X.r0(this.f37251E, getEditTextBoxBackground());
    }

    private Rect r(Rect rect) {
        if (this.f37251E == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.f37244A0;
        boolean zG = com.google.android.material.internal.u.g(this);
        rect2.bottom = rect.bottom;
        int i10 = this.f37313s0;
        if (i10 == 1) {
            rect2.left = I(rect.left, zG);
            rect2.top = rect.top + this.f37314t0;
            rect2.right = J(rect.right, zG);
            return rect2;
        }
        if (i10 != 2) {
            rect2.left = I(rect.left, zG);
            rect2.top = getPaddingTop();
            rect2.right = J(rect.right, zG);
            return rect2;
        }
        rect2.left = rect.left + this.f37251E.getPaddingLeft();
        rect2.top = rect.top - v();
        rect2.right = rect.right - this.f37251E.getPaddingRight();
        return rect2;
    }

    private int s(Rect rect, Rect rect2, float f10) {
        return S() ? (int) (rect2.top + f10) : rect.bottom - this.f37251E.getCompoundPaddingBottom();
    }

    private boolean s0() {
        int iMax;
        if (this.f37251E == null || this.f37251E.getMeasuredHeight() >= (iMax = Math.max(this.f37249D.getMeasuredHeight(), this.f37247C.getMeasuredHeight()))) {
            return false;
        }
        this.f37251E.setMinimumHeight(iMax);
        return true;
    }

    private void setEditText(EditText editText) {
        if (this.f37251E != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f37251E = editText;
        int i10 = this.f37255G;
        if (i10 != -1) {
            setMinEms(i10);
        } else {
            setMinWidth(this.f37259I);
        }
        int i11 = this.f37257H;
        if (i11 != -1) {
            setMaxEms(i11);
        } else {
            setMaxWidth(this.f37261J);
        }
        this.f37307m0 = false;
        V();
        setTextInputAccessibilityDelegate(new d(this));
        this.f37288W0.i0(this.f37251E.getTypeface());
        this.f37288W0.a0(this.f37251E.getTextSize());
        int i12 = Build.VERSION.SDK_INT;
        this.f37288W0.X(this.f37251E.getLetterSpacing());
        int gravity = this.f37251E.getGravity();
        this.f37288W0.S((gravity & (-113)) | 48);
        this.f37288W0.Z(gravity);
        this.f37284U0 = X.A(editText);
        this.f37251E.addTextChangedListener(new a(editText));
        if (this.f37262J0 == null) {
            this.f37262J0 = this.f37251E.getHintTextColors();
        }
        if (this.f37301g0) {
            if (TextUtils.isEmpty(this.f37302h0)) {
                CharSequence hint = this.f37251E.getHint();
                this.f37253F = hint;
                setHint(hint);
                this.f37251E.setHint((CharSequence) null);
            }
            this.f37303i0 = true;
        }
        if (i12 >= 29) {
            n0();
        }
        if (this.f37273P != null) {
            k0(this.f37251E.getText());
        }
        p0();
        this.f37263K.f();
        this.f37247C.bringToFront();
        this.f37249D.bringToFront();
        C();
        this.f37249D.x0();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        v0(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f37302h0)) {
            return;
        }
        this.f37302h0 = charSequence;
        this.f37288W0.g0(charSequence);
        if (this.f37286V0) {
            return;
        }
        W();
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.f37281T == z10) {
            return;
        }
        if (z10) {
            j();
        } else {
            a0();
            this.f37283U = null;
        }
        this.f37281T = z10;
    }

    private int t(Rect rect, float f10) {
        return S() ? (int) (rect.centerY() - (f10 / 2.0f)) : rect.top + this.f37251E.getCompoundPaddingTop();
    }

    private void t0() {
        if (this.f37313s0 != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f37245B.getLayoutParams();
            int iV = v();
            if (iV != layoutParams.topMargin) {
                layoutParams.topMargin = iV;
                this.f37245B.requestLayout();
            }
        }
    }

    private Rect u(Rect rect) {
        if (this.f37251E == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.f37244A0;
        float fW = this.f37288W0.w();
        rect2.left = rect.left + this.f37251E.getCompoundPaddingLeft();
        rect2.top = t(rect, fW);
        rect2.right = rect.right - this.f37251E.getCompoundPaddingRight();
        rect2.bottom = s(rect, rect2, fW);
        return rect2;
    }

    private int v() {
        float fQ;
        if (!this.f37301g0) {
            return 0;
        }
        int i10 = this.f37313s0;
        if (i10 == 0) {
            fQ = this.f37288W0.q();
        } else {
            if (i10 != 2) {
                return 0;
            }
            fQ = this.f37288W0.q() / 2.0f;
        }
        return (int) fQ;
    }

    private void v0(boolean z10, boolean z11) {
        ColorStateList colorStateList;
        TextView textView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f37251E;
        boolean z12 = false;
        boolean z13 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f37251E;
        if (editText2 != null && editText2.hasFocus()) {
            z12 = true;
        }
        ColorStateList colorStateList2 = this.f37262J0;
        if (colorStateList2 != null) {
            this.f37288W0.M(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f37262J0;
            this.f37288W0.M(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f37282T0) : this.f37282T0));
        } else if (d0()) {
            this.f37288W0.M(this.f37263K.r());
        } else if (this.f37269N && (textView = this.f37273P) != null) {
            this.f37288W0.M(textView.getTextColors());
        } else if (z12 && (colorStateList = this.f37264K0) != null) {
            this.f37288W0.R(colorStateList);
        }
        if (z13 || !this.f37289X0 || (isEnabled() && z12)) {
            if (z11 || this.f37286V0) {
                z(z10);
                return;
            }
            return;
        }
        if (z11 || !this.f37286V0) {
            F(z10);
        }
    }

    private boolean w() {
        return this.f37313s0 == 2 && x();
    }

    private void w0() {
        EditText editText;
        if (this.f37283U == null || (editText = this.f37251E) == null) {
            return;
        }
        this.f37283U.setGravity(editText.getGravity());
        this.f37283U.setPadding(this.f37251E.getCompoundPaddingLeft(), this.f37251E.getCompoundPaddingTop(), this.f37251E.getCompoundPaddingRight(), this.f37251E.getCompoundPaddingBottom());
    }

    private boolean x() {
        return this.f37315u0 > -1 && this.f37318x0 != 0;
    }

    private void x0() {
        EditText editText = this.f37251E;
        y0(editText == null ? null : editText.getText());
    }

    private void y() {
        if (B()) {
            ((com.google.android.material.textfield.h) this.f37304j0).s0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y0(Editable editable) {
        if (this.f37271O.a(editable) != 0 || this.f37286V0) {
            L();
        } else {
            g0();
        }
    }

    private void z(boolean z10) {
        ValueAnimator valueAnimator = this.f37291Z0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f37291Z0.cancel();
        }
        if (z10 && this.f37290Y0) {
            l(1.0f);
        } else {
            this.f37288W0.c0(1.0f);
        }
        this.f37286V0 = false;
        if (B()) {
            W();
        }
        x0();
        this.f37247C.l(false);
        this.f37249D.H(false);
    }

    private void z0(boolean z10, boolean z11) {
        int defaultColor = this.f37272O0.getDefaultColor();
        int colorForState = this.f37272O0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f37272O0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z10) {
            this.f37318x0 = colorForState2;
        } else if (z11) {
            this.f37318x0 = colorForState;
        } else {
            this.f37318x0 = defaultColor;
        }
    }

    void A0() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.f37304j0 == null || this.f37313s0 == 0) {
            return;
        }
        boolean z10 = false;
        boolean z11 = isFocused() || ((editText2 = this.f37251E) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f37251E) != null && editText.isHovered())) {
            z10 = true;
        }
        if (!isEnabled()) {
            this.f37318x0 = this.f37282T0;
        } else if (d0()) {
            if (this.f37272O0 != null) {
                z0(z11, z10);
            } else {
                this.f37318x0 = getErrorCurrentTextColors();
            }
        } else if (!this.f37269N || (textView = this.f37273P) == null) {
            if (z11) {
                this.f37318x0 = this.f37270N0;
            } else if (z10) {
                this.f37318x0 = this.f37268M0;
            } else {
                this.f37318x0 = this.f37266L0;
            }
        } else if (this.f37272O0 != null) {
            z0(z11, z10);
        } else {
            this.f37318x0 = textView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            n0();
        }
        this.f37249D.I();
        Z();
        if (this.f37313s0 == 2) {
            int i10 = this.f37315u0;
            if (z11 && isEnabled()) {
                this.f37315u0 = this.f37317w0;
            } else {
                this.f37315u0 = this.f37316v0;
            }
            if (this.f37315u0 != i10) {
                X();
            }
        }
        if (this.f37313s0 == 1) {
            if (!isEnabled()) {
                this.f37319y0 = this.f37276Q0;
            } else if (z10 && !z11) {
                this.f37319y0 = this.f37280S0;
            } else if (z11) {
                this.f37319y0 = this.f37278R0;
            } else {
                this.f37319y0 = this.f37274P0;
            }
        }
        m();
    }

    public boolean M() {
        return this.f37249D.F();
    }

    public boolean N() {
        return this.f37263K.A();
    }

    public boolean O() {
        return this.f37263K.B();
    }

    final boolean P() {
        return this.f37286V0;
    }

    public boolean R() {
        return this.f37303i0;
    }

    public void Z() {
        this.f37247C.m();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i10, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f37245B.addView(view, layoutParams2);
        this.f37245B.setLayoutParams(layoutParams);
        t0();
        setEditText((EditText) view);
    }

    void c0(TextView textView, int i10) {
        try {
            androidx.core.widget.j.q(textView, i10);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        androidx.core.widget.j.q(textView, C7.l.f2566c);
        textView.setTextColor(C3377a.c(getContext(), C7.d.f2343b));
    }

    boolean d0() {
        return this.f37263K.l();
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i10) {
        EditText editText = this.f37251E;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.f37253F != null) {
            boolean z10 = this.f37303i0;
            this.f37303i0 = false;
            CharSequence hint = editText.getHint();
            this.f37251E.setHint(this.f37253F);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
                return;
            } finally {
                this.f37251E.setHint(hint);
                this.f37303i0 = z10;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i10);
        onProvideAutofillVirtualStructure(viewStructure, i10);
        viewStructure.setChildCount(this.f37245B.getChildCount());
        for (int i11 = 0; i11 < this.f37245B.getChildCount(); i11++) {
            View childAt = this.f37245B.getChildAt(i11);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i11);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i10);
            if (childAt == this.f37251E) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f37295b1 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f37295b1 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        E(canvas);
        D(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f37293a1) {
            return;
        }
        this.f37293a1 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        com.google.android.material.internal.a aVar = this.f37288W0;
        boolean zF0 = aVar != null ? aVar.f0(drawableState) : false;
        if (this.f37251E != null) {
            u0(X.R(this) && isEnabled());
        }
        p0();
        A0();
        if (zF0) {
            invalidate();
        }
        this.f37293a1 = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f37251E;
        return editText != null ? editText.getBaseline() + getPaddingTop() + v() : super.getBaseline();
    }

    X7.g getBoxBackground() {
        int i10 = this.f37313s0;
        if (i10 == 1 || i10 == 2) {
            return this.f37304j0;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f37319y0;
    }

    public int getBoxBackgroundMode() {
        return this.f37313s0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f37314t0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return com.google.android.material.internal.u.g(this) ? this.f37310p0.j().a(this.f37246B0) : this.f37310p0.l().a(this.f37246B0);
    }

    public float getBoxCornerRadiusBottomStart() {
        return com.google.android.material.internal.u.g(this) ? this.f37310p0.l().a(this.f37246B0) : this.f37310p0.j().a(this.f37246B0);
    }

    public float getBoxCornerRadiusTopEnd() {
        return com.google.android.material.internal.u.g(this) ? this.f37310p0.r().a(this.f37246B0) : this.f37310p0.t().a(this.f37246B0);
    }

    public float getBoxCornerRadiusTopStart() {
        return com.google.android.material.internal.u.g(this) ? this.f37310p0.t().a(this.f37246B0) : this.f37310p0.r().a(this.f37246B0);
    }

    public int getBoxStrokeColor() {
        return this.f37270N0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f37272O0;
    }

    public int getBoxStrokeWidth() {
        return this.f37316v0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f37317w0;
    }

    public int getCounterMaxLength() {
        return this.f37267M;
    }

    CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f37265L && this.f37269N && (textView = this.f37273P) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f37298d0;
    }

    public ColorStateList getCounterTextColor() {
        return this.f37296c0;
    }

    public ColorStateList getCursorColor() {
        return this.f37299e0;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f37300f0;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f37262J0;
    }

    public EditText getEditText() {
        return this.f37251E;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f37249D.l();
    }

    public Drawable getEndIconDrawable() {
        return this.f37249D.n();
    }

    public int getEndIconMinSize() {
        return this.f37249D.o();
    }

    public int getEndIconMode() {
        return this.f37249D.p();
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f37249D.q();
    }

    CheckableImageButton getEndIconView() {
        return this.f37249D.r();
    }

    public CharSequence getError() {
        if (this.f37263K.A()) {
            return this.f37263K.p();
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f37263K.n();
    }

    public CharSequence getErrorContentDescription() {
        return this.f37263K.o();
    }

    public int getErrorCurrentTextColors() {
        return this.f37263K.q();
    }

    public Drawable getErrorIconDrawable() {
        return this.f37249D.s();
    }

    public CharSequence getHelperText() {
        if (this.f37263K.B()) {
            return this.f37263K.s();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f37263K.u();
    }

    public CharSequence getHint() {
        if (this.f37301g0) {
            return this.f37302h0;
        }
        return null;
    }

    final float getHintCollapsedTextHeight() {
        return this.f37288W0.q();
    }

    final int getHintCurrentCollapsedTextColor() {
        return this.f37288W0.t();
    }

    public ColorStateList getHintTextColor() {
        return this.f37264K0;
    }

    public e getLengthCounter() {
        return this.f37271O;
    }

    public int getMaxEms() {
        return this.f37257H;
    }

    public int getMaxWidth() {
        return this.f37261J;
    }

    public int getMinEms() {
        return this.f37255G;
    }

    public int getMinWidth() {
        return this.f37259I;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f37249D.u();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f37249D.v();
    }

    public CharSequence getPlaceholderText() {
        if (this.f37281T) {
            return this.f37279S;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f37287W;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f37285V;
    }

    public CharSequence getPrefixText() {
        return this.f37247C.a();
    }

    public ColorStateList getPrefixTextColor() {
        return this.f37247C.b();
    }

    public TextView getPrefixTextView() {
        return this.f37247C.d();
    }

    public X7.k getShapeAppearanceModel() {
        return this.f37310p0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f37247C.e();
    }

    public Drawable getStartIconDrawable() {
        return this.f37247C.f();
    }

    public int getStartIconMinSize() {
        return this.f37247C.g();
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f37247C.h();
    }

    public CharSequence getSuffixText() {
        return this.f37249D.w();
    }

    public ColorStateList getSuffixTextColor() {
        return this.f37249D.x();
    }

    public TextView getSuffixTextView() {
        return this.f37249D.z();
    }

    public Typeface getTypeface() {
        return this.f37248C0;
    }

    public void i(f fVar) {
        this.f37254F0.add(fVar);
        if (this.f37251E != null) {
            fVar.a(this);
        }
    }

    void k0(Editable editable) {
        int iA = this.f37271O.a(editable);
        boolean z10 = this.f37269N;
        int i10 = this.f37267M;
        if (i10 == -1) {
            this.f37273P.setText(String.valueOf(iA));
            this.f37273P.setContentDescription(null);
            this.f37269N = false;
        } else {
            this.f37269N = iA > i10;
            l0(getContext(), this.f37273P, iA, this.f37267M, this.f37269N);
            if (z10 != this.f37269N) {
                m0();
            }
            this.f37273P.setText(C4260a.c().j(getContext().getString(C7.k.f2535d, Integer.valueOf(iA), Integer.valueOf(this.f37267M))));
        }
        if (this.f37251E == null || z10 == this.f37269N) {
            return;
        }
        u0(false);
        A0();
        p0();
    }

    void l(float f10) {
        if (this.f37288W0.x() == f10) {
            return;
        }
        if (this.f37291Z0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f37291Z0 = valueAnimator;
            valueAnimator.setInterpolator(R7.i.g(getContext(), C7.c.f2292P, D7.a.f3487b));
            this.f37291Z0.setDuration(R7.i.f(getContext(), C7.c.f2285I, 167));
            this.f37291Z0.addUpdateListener(new c());
        }
        this.f37291Z0.setFloatValues(this.f37288W0.x(), f10);
        this.f37291Z0.start();
    }

    boolean o0() {
        boolean z10;
        if (this.f37251E == null) {
            return false;
        }
        boolean z11 = true;
        if (f0()) {
            int measuredWidth = this.f37247C.getMeasuredWidth() - this.f37251E.getPaddingLeft();
            if (this.f37250D0 == null || this.f37252E0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f37250D0 = colorDrawable;
                this.f37252E0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] drawableArrA = androidx.core.widget.j.a(this.f37251E);
            Drawable drawable = drawableArrA[0];
            Drawable drawable2 = this.f37250D0;
            if (drawable != drawable2) {
                androidx.core.widget.j.k(this.f37251E, drawable2, drawableArrA[1], drawableArrA[2], drawableArrA[3]);
                z10 = true;
            }
            z10 = false;
        } else {
            if (this.f37250D0 != null) {
                Drawable[] drawableArrA2 = androidx.core.widget.j.a(this.f37251E);
                androidx.core.widget.j.k(this.f37251E, null, drawableArrA2[1], drawableArrA2[2], drawableArrA2[3]);
                this.f37250D0 = null;
                z10 = true;
            }
            z10 = false;
        }
        if (e0()) {
            int measuredWidth2 = this.f37249D.z().getMeasuredWidth() - this.f37251E.getPaddingRight();
            CheckableImageButton checkableImageButtonK = this.f37249D.k();
            if (checkableImageButtonK != null) {
                measuredWidth2 = measuredWidth2 + checkableImageButtonK.getMeasuredWidth() + C4462v.b((ViewGroup.MarginLayoutParams) checkableImageButtonK.getLayoutParams());
            }
            Drawable[] drawableArrA3 = androidx.core.widget.j.a(this.f37251E);
            Drawable drawable3 = this.f37256G0;
            if (drawable3 == null || this.f37258H0 == measuredWidth2) {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.f37256G0 = colorDrawable2;
                    this.f37258H0 = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = drawableArrA3[2];
                Drawable drawable5 = this.f37256G0;
                if (drawable4 != drawable5) {
                    this.f37260I0 = drawable4;
                    androidx.core.widget.j.k(this.f37251E, drawableArrA3[0], drawableArrA3[1], drawable5, drawableArrA3[3]);
                } else {
                    z11 = z10;
                }
            } else {
                this.f37258H0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                androidx.core.widget.j.k(this.f37251E, drawableArrA3[0], drawableArrA3[1], this.f37256G0, drawableArrA3[3]);
            }
        } else {
            if (this.f37256G0 == null) {
                return z10;
            }
            Drawable[] drawableArrA4 = androidx.core.widget.j.a(this.f37251E);
            if (drawableArrA4[2] == this.f37256G0) {
                androidx.core.widget.j.k(this.f37251E, drawableArrA4[0], drawableArrA4[1], this.f37260I0, drawableArrA4[3]);
            } else {
                z11 = z10;
            }
            this.f37256G0 = null;
        }
        return z11;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f37288W0.H(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f37249D.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f37297c1 = false;
        boolean zS0 = s0();
        boolean zO0 = o0();
        if (zS0 || zO0) {
            this.f37251E.post(new Runnable() { // from class: com.google.android.material.textfield.B
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37239B.U();
                }
            });
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        EditText editText = this.f37251E;
        if (editText != null) {
            Rect rect = this.f37320z0;
            com.google.android.material.internal.c.a(this, editText, rect);
            i0(rect);
            if (this.f37301g0) {
                this.f37288W0.a0(this.f37251E.getTextSize());
                int gravity = this.f37251E.getGravity();
                this.f37288W0.S((gravity & (-113)) | 48);
                this.f37288W0.Z(gravity);
                this.f37288W0.O(r(rect));
                this.f37288W0.W(u(rect));
                this.f37288W0.J();
                if (!B() || this.f37286V0) {
                    return;
                }
                W();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.f37297c1) {
            this.f37249D.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f37297c1 = true;
        }
        w0();
        this.f37249D.x0();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        setError(hVar.f37327D);
        if (hVar.f37328E) {
            post(new b());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        boolean z10 = i10 == 1;
        if (z10 != this.f37311q0) {
            float fA = this.f37310p0.r().a(this.f37246B0);
            float fA2 = this.f37310p0.t().a(this.f37246B0);
            X7.k kVarM = X7.k.a().z(this.f37310p0.s()).D(this.f37310p0.q()).r(this.f37310p0.k()).v(this.f37310p0.i()).A(fA2).E(fA).s(this.f37310p0.l().a(this.f37246B0)).w(this.f37310p0.j().a(this.f37246B0)).m();
            this.f37311q0 = z10;
            setShapeAppearanceModel(kVarM);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        if (d0()) {
            hVar.f37327D = getError();
        }
        hVar.f37328E = this.f37249D.E();
        return hVar;
    }

    void p0() {
        Drawable background;
        TextView textView;
        EditText editText = this.f37251E;
        if (editText == null || this.f37313s0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (I.a(background)) {
            background = background.mutate();
        }
        if (d0()) {
            background.setColorFilter(C1987i.e(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f37269N && (textView = this.f37273P) != null) {
            background.setColorFilter(C1987i.e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            C3784a.c(background);
            this.f37251E.refreshDrawableState();
        }
    }

    void r0() {
        EditText editText = this.f37251E;
        if (editText == null || this.f37304j0 == null) {
            return;
        }
        if ((this.f37307m0 || editText.getBackground() == null) && this.f37313s0 != 0) {
            q0();
            this.f37307m0 = true;
        }
    }

    public void setBoxBackgroundColor(int i10) {
        if (this.f37319y0 != i10) {
            this.f37319y0 = i10;
            this.f37274P0 = i10;
            this.f37278R0 = i10;
            this.f37280S0 = i10;
            m();
        }
    }

    public void setBoxBackgroundColorResource(int i10) {
        setBoxBackgroundColor(C3377a.c(getContext(), i10));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f37274P0 = defaultColor;
        this.f37319y0 = defaultColor;
        this.f37276Q0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f37278R0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f37280S0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        m();
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 == this.f37313s0) {
            return;
        }
        this.f37313s0 = i10;
        if (this.f37251E != null) {
            V();
        }
    }

    public void setBoxCollapsedPaddingTop(int i10) {
        this.f37314t0 = i10;
    }

    public void setBoxCornerFamily(int i10) {
        this.f37310p0 = this.f37310p0.v().y(i10, this.f37310p0.r()).C(i10, this.f37310p0.t()).q(i10, this.f37310p0.j()).u(i10, this.f37310p0.l()).m();
        m();
    }

    public void setBoxStrokeColor(int i10) {
        if (this.f37270N0 != i10) {
            this.f37270N0 = i10;
            A0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f37266L0 = colorStateList.getDefaultColor();
            this.f37282T0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f37268M0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f37270N0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f37270N0 != colorStateList.getDefaultColor()) {
            this.f37270N0 = colorStateList.getDefaultColor();
        }
        A0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f37272O0 != colorStateList) {
            this.f37272O0 = colorStateList;
            A0();
        }
    }

    public void setBoxStrokeWidth(int i10) {
        this.f37316v0 = i10;
        A0();
    }

    public void setBoxStrokeWidthFocused(int i10) {
        this.f37317w0 = i10;
        A0();
    }

    public void setBoxStrokeWidthFocusedResource(int i10) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(int i10) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setCounterEnabled(boolean z10) {
        if (this.f37265L != z10) {
            if (z10) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f37273P = appCompatTextView;
                appCompatTextView.setId(C7.g.f2466W);
                Typeface typeface = this.f37248C0;
                if (typeface != null) {
                    this.f37273P.setTypeface(typeface);
                }
                this.f37273P.setMaxLines(1);
                this.f37263K.e(this.f37273P, 2);
                C4462v.d((ViewGroup.MarginLayoutParams) this.f37273P.getLayoutParams(), getResources().getDimensionPixelOffset(C7.e.f2430z0));
                m0();
                j0();
            } else {
                this.f37263K.C(this.f37273P, 2);
                this.f37273P = null;
            }
            this.f37265L = z10;
        }
    }

    public void setCounterMaxLength(int i10) {
        if (this.f37267M != i10) {
            if (i10 > 0) {
                this.f37267M = i10;
            } else {
                this.f37267M = -1;
            }
            if (this.f37265L) {
                j0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.f37275Q != i10) {
            this.f37275Q = i10;
            m0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f37298d0 != colorStateList) {
            this.f37298d0 = colorStateList;
            m0();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.f37277R != i10) {
            this.f37277R = i10;
            m0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f37296c0 != colorStateList) {
            this.f37296c0 = colorStateList;
            m0();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f37299e0 != colorStateList) {
            this.f37299e0 = colorStateList;
            n0();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f37300f0 != colorStateList) {
            this.f37300f0 = colorStateList;
            if (Q()) {
                n0();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f37262J0 = colorStateList;
        this.f37264K0 = colorStateList;
        if (this.f37251E != null) {
            u0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        Y(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.f37249D.N(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.f37249D.O(z10);
    }

    public void setEndIconContentDescription(int i10) {
        this.f37249D.P(i10);
    }

    public void setEndIconDrawable(int i10) {
        this.f37249D.R(i10);
    }

    public void setEndIconMinSize(int i10) {
        this.f37249D.T(i10);
    }

    public void setEndIconMode(int i10) {
        this.f37249D.U(i10);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        this.f37249D.V(onClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f37249D.W(onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        this.f37249D.X(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        this.f37249D.Y(colorStateList);
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        this.f37249D.Z(mode);
    }

    public void setEndIconVisible(boolean z10) {
        this.f37249D.a0(z10);
    }

    public void setError(CharSequence charSequence) {
        if (!this.f37263K.A()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f37263K.w();
        } else {
            this.f37263K.Q(charSequence);
        }
    }

    public void setErrorAccessibilityLiveRegion(int i10) {
        this.f37263K.E(i10);
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f37263K.F(charSequence);
    }

    public void setErrorEnabled(boolean z10) {
        this.f37263K.G(z10);
    }

    public void setErrorIconDrawable(int i10) {
        this.f37249D.b0(i10);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        this.f37249D.d0(onClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f37249D.e0(onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f37249D.f0(colorStateList);
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        this.f37249D.g0(mode);
    }

    public void setErrorTextAppearance(int i10) {
        this.f37263K.H(i10);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f37263K.I(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.f37289X0 != z10) {
            this.f37289X0 = z10;
            u0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (O()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!O()) {
                setHelperTextEnabled(true);
            }
            this.f37263K.R(charSequence);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f37263K.L(colorStateList);
    }

    public void setHelperTextEnabled(boolean z10) {
        this.f37263K.K(z10);
    }

    public void setHelperTextTextAppearance(int i10) {
        this.f37263K.J(i10);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f37301g0) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.f37290Y0 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.f37301g0) {
            this.f37301g0 = z10;
            if (z10) {
                CharSequence hint = this.f37251E.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f37302h0)) {
                        setHint(hint);
                    }
                    this.f37251E.setHint((CharSequence) null);
                }
                this.f37303i0 = true;
            } else {
                this.f37303i0 = false;
                if (!TextUtils.isEmpty(this.f37302h0) && TextUtils.isEmpty(this.f37251E.getHint())) {
                    this.f37251E.setHint(this.f37302h0);
                }
                setHintInternal(null);
            }
            if (this.f37251E != null) {
                t0();
            }
        }
    }

    public void setHintTextAppearance(int i10) {
        this.f37288W0.P(i10);
        this.f37264K0 = this.f37288W0.p();
        if (this.f37251E != null) {
            u0(false);
            t0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f37264K0 != colorStateList) {
            if (this.f37262J0 == null) {
                this.f37288W0.R(colorStateList);
            }
            this.f37264K0 = colorStateList;
            if (this.f37251E != null) {
                u0(false);
            }
        }
    }

    public void setLengthCounter(e eVar) {
        this.f37271O = eVar;
    }

    public void setMaxEms(int i10) {
        this.f37257H = i10;
        EditText editText = this.f37251E;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxEms(i10);
    }

    public void setMaxWidth(int i10) {
        this.f37261J = i10;
        EditText editText = this.f37251E;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxWidth(i10);
    }

    public void setMaxWidthResource(int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinEms(int i10) {
        this.f37255G = i10;
        EditText editText = this.f37251E;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinEms(i10);
    }

    public void setMinWidth(int i10) {
        this.f37259I = i10;
        EditText editText = this.f37251E;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinWidth(i10);
    }

    public void setMinWidthResource(int i10) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i10) {
        this.f37249D.i0(i10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i10) {
        this.f37249D.k0(i10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        this.f37249D.m0(z10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f37249D.n0(colorStateList);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f37249D.o0(mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f37283U == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.f37283U = appCompatTextView;
            appCompatTextView.setId(C7.g.f2469Z);
            X.x0(this.f37283U, 2);
            C2182c c2182cA = A();
            this.f37292a0 = c2182cA;
            c2182cA.u0(67L);
            this.f37294b0 = A();
            setPlaceholderTextAppearance(this.f37287W);
            setPlaceholderTextColor(this.f37285V);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f37281T) {
                setPlaceholderTextEnabled(true);
            }
            this.f37279S = charSequence;
        }
        x0();
    }

    public void setPlaceholderTextAppearance(int i10) {
        this.f37287W = i10;
        TextView textView = this.f37283U;
        if (textView != null) {
            androidx.core.widget.j.q(textView, i10);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f37285V != colorStateList) {
            this.f37285V = colorStateList;
            TextView textView = this.f37283U;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f37247C.n(charSequence);
    }

    public void setPrefixTextAppearance(int i10) {
        this.f37247C.o(i10);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f37247C.p(colorStateList);
    }

    public void setShapeAppearanceModel(X7.k kVar) {
        X7.g gVar = this.f37304j0;
        if (gVar == null || gVar.E() == kVar) {
            return;
        }
        this.f37310p0 = kVar;
        m();
    }

    public void setStartIconCheckable(boolean z10) {
        this.f37247C.q(z10);
    }

    public void setStartIconContentDescription(int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconDrawable(int i10) {
        setStartIconDrawable(i10 != 0 ? C3699a.b(getContext(), i10) : null);
    }

    public void setStartIconMinSize(int i10) {
        this.f37247C.t(i10);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.f37247C.u(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f37247C.v(onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        this.f37247C.w(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        this.f37247C.x(colorStateList);
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        this.f37247C.y(mode);
    }

    public void setStartIconVisible(boolean z10) {
        this.f37247C.z(z10);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f37249D.p0(charSequence);
    }

    public void setSuffixTextAppearance(int i10) {
        this.f37249D.q0(i10);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f37249D.r0(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(d dVar) {
        EditText editText = this.f37251E;
        if (editText != null) {
            X.n0(editText, dVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f37248C0) {
            this.f37248C0 = typeface;
            this.f37288W0.i0(typeface);
            this.f37263K.N(typeface);
            TextView textView = this.f37273P;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    void u0(boolean z10) {
        v0(z10, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInputLayout(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f37242d1;
        super(C2272a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f37255G = -1;
        this.f37257H = -1;
        this.f37259I = -1;
        this.f37261J = -1;
        this.f37263K = new u(this);
        this.f37271O = new e() { // from class: com.google.android.material.textfield.C
            @Override // com.google.android.material.textfield.TextInputLayout.e
            public final int a(Editable editable) {
                return TextInputLayout.T(editable);
            }
        };
        this.f37320z0 = new Rect();
        this.f37244A0 = new Rect();
        this.f37246B0 = new RectF();
        this.f37254F0 = new LinkedHashSet<>();
        com.google.android.material.internal.a aVar = new com.google.android.material.internal.a(this);
        this.f37288W0 = aVar;
        this.f37297c1 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f37245B = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        TimeInterpolator timeInterpolator = D7.a.f3486a;
        aVar.h0(timeInterpolator);
        aVar.e0(timeInterpolator);
        aVar.S(8388659);
        int[] iArr = C7.m.f2728N7;
        int i12 = C7.m.f2969k8;
        int i13 = C7.m.f2947i8;
        int i14 = C7.m.f2619C8;
        int i15 = C7.m.f2669H8;
        int i16 = C7.m.f2709L8;
        a0 a0VarJ = com.google.android.material.internal.r.j(context2, attributeSet, iArr, i10, i11, i12, i13, i14, i15, i16);
        z zVar = new z(this, a0VarJ);
        this.f37247C = zVar;
        this.f37301g0 = a0VarJ.a(C7.m.f2699K8, true);
        setHint(a0VarJ.p(C7.m.f2778S7));
        this.f37290Y0 = a0VarJ.a(C7.m.f2689J8, true);
        this.f37289X0 = a0VarJ.a(C7.m.f2639E8, true);
        int i17 = C7.m.f2798U7;
        if (a0VarJ.s(i17)) {
            setMinEms(a0VarJ.k(i17, -1));
        } else {
            int i18 = C7.m.f2768R7;
            if (a0VarJ.s(i18)) {
                setMinWidth(a0VarJ.f(i18, -1));
            }
        }
        int i19 = C7.m.f2788T7;
        if (a0VarJ.s(i19)) {
            setMaxEms(a0VarJ.k(i19, -1));
        } else {
            int i20 = C7.m.f2758Q7;
            if (a0VarJ.s(i20)) {
                setMaxWidth(a0VarJ.f(i20, -1));
            }
        }
        this.f37310p0 = X7.k.e(context2, attributeSet, i10, i11).m();
        this.f37312r0 = context2.getResources().getDimensionPixelOffset(C7.e.f2424w0);
        this.f37314t0 = a0VarJ.e(C7.m.f2828X7, 0);
        this.f37316v0 = a0VarJ.f(C7.m.f2903e8, context2.getResources().getDimensionPixelSize(C7.e.f2426x0));
        this.f37317w0 = a0VarJ.f(C7.m.f2914f8, context2.getResources().getDimensionPixelSize(C7.e.f2428y0));
        this.f37315u0 = this.f37316v0;
        float fD = a0VarJ.d(C7.m.f2870b8, -1.0f);
        float fD2 = a0VarJ.d(C7.m.f2859a8, -1.0f);
        float fD3 = a0VarJ.d(C7.m.f2838Y7, -1.0f);
        float fD4 = a0VarJ.d(C7.m.f2848Z7, -1.0f);
        k.b bVarV = this.f37310p0.v();
        if (fD >= 0.0f) {
            bVarV.A(fD);
        }
        if (fD2 >= 0.0f) {
            bVarV.E(fD2);
        }
        if (fD3 >= 0.0f) {
            bVarV.w(fD3);
        }
        if (fD4 >= 0.0f) {
            bVarV.s(fD4);
        }
        this.f37310p0 = bVarV.m();
        ColorStateList colorStateListB = U7.c.b(context2, a0VarJ, C7.m.f2808V7);
        if (colorStateListB != null) {
            int defaultColor = colorStateListB.getDefaultColor();
            this.f37274P0 = defaultColor;
            this.f37319y0 = defaultColor;
            if (colorStateListB.isStateful()) {
                this.f37276Q0 = colorStateListB.getColorForState(new int[]{-16842910}, -1);
                this.f37278R0 = colorStateListB.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f37280S0 = colorStateListB.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f37278R0 = this.f37274P0;
                ColorStateList colorStateListA = C3699a.a(context2, C7.d.f2349h);
                this.f37276Q0 = colorStateListA.getColorForState(new int[]{-16842910}, -1);
                this.f37280S0 = colorStateListA.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f37319y0 = 0;
            this.f37274P0 = 0;
            this.f37276Q0 = 0;
            this.f37278R0 = 0;
            this.f37280S0 = 0;
        }
        int i21 = C7.m.f2748P7;
        if (a0VarJ.s(i21)) {
            ColorStateList colorStateListC = a0VarJ.c(i21);
            this.f37264K0 = colorStateListC;
            this.f37262J0 = colorStateListC;
        }
        int i22 = C7.m.f2881c8;
        ColorStateList colorStateListB2 = U7.c.b(context2, a0VarJ, i22);
        this.f37270N0 = a0VarJ.b(i22, 0);
        this.f37266L0 = C3377a.c(context2, C7.d.f2350i);
        this.f37282T0 = C3377a.c(context2, C7.d.f2351j);
        this.f37268M0 = C3377a.c(context2, C7.d.f2352k);
        if (colorStateListB2 != null) {
            setBoxStrokeColorStateList(colorStateListB2);
        }
        int i23 = C7.m.f2892d8;
        if (a0VarJ.s(i23)) {
            setBoxStrokeErrorColor(U7.c.b(context2, a0VarJ, i23));
        }
        if (a0VarJ.n(i16, -1) != -1) {
            setHintTextAppearance(a0VarJ.n(i16, 0));
        }
        this.f37299e0 = a0VarJ.c(C7.m.f2991m8);
        this.f37300f0 = a0VarJ.c(C7.m.f3002n8);
        int iN = a0VarJ.n(i14, 0);
        CharSequence charSequenceP = a0VarJ.p(C7.m.f3110x8);
        int iK = a0VarJ.k(C7.m.f3100w8, 1);
        boolean zA = a0VarJ.a(C7.m.f3120y8, false);
        int iN2 = a0VarJ.n(i15, 0);
        boolean zA2 = a0VarJ.a(C7.m.f2659G8, false);
        CharSequence charSequenceP2 = a0VarJ.p(C7.m.f2649F8);
        int iN3 = a0VarJ.n(C7.m.f2789T8, 0);
        CharSequence charSequenceP3 = a0VarJ.p(C7.m.f2779S8);
        boolean zA3 = a0VarJ.a(C7.m.f2925g8, false);
        setCounterMaxLength(a0VarJ.k(C7.m.f2936h8, -1));
        this.f37277R = a0VarJ.n(i12, 0);
        this.f37275Q = a0VarJ.n(i13, 0);
        setBoxBackgroundMode(a0VarJ.k(C7.m.f2818W7, 0));
        setErrorContentDescription(charSequenceP);
        setErrorAccessibilityLiveRegion(iK);
        setCounterOverflowTextAppearance(this.f37275Q);
        setHelperTextTextAppearance(iN2);
        setErrorTextAppearance(iN);
        setCounterTextAppearance(this.f37277R);
        setPlaceholderText(charSequenceP3);
        setPlaceholderTextAppearance(iN3);
        int i24 = C7.m.f2629D8;
        if (a0VarJ.s(i24)) {
            setErrorTextColor(a0VarJ.c(i24));
        }
        int i25 = C7.m.f2679I8;
        if (a0VarJ.s(i25)) {
            setHelperTextColor(a0VarJ.c(i25));
        }
        int i26 = C7.m.f2719M8;
        if (a0VarJ.s(i26)) {
            setHintTextColor(a0VarJ.c(i26));
        }
        int i27 = C7.m.f2980l8;
        if (a0VarJ.s(i27)) {
            setCounterTextColor(a0VarJ.c(i27));
        }
        int i28 = C7.m.f2958j8;
        if (a0VarJ.s(i28)) {
            setCounterOverflowTextColor(a0VarJ.c(i28));
        }
        int i29 = C7.m.f2799U8;
        if (a0VarJ.s(i29)) {
            setPlaceholderTextColor(a0VarJ.c(i29));
        }
        r rVar = new r(this, a0VarJ);
        this.f37249D = rVar;
        boolean zA4 = a0VarJ.a(C7.m.f2738O7, true);
        a0VarJ.x();
        X.x0(this, 2);
        X.z0(this, 1);
        frameLayout.addView(zVar);
        frameLayout.addView(rVar);
        addView(frameLayout);
        setEnabled(zA4);
        setHelperTextEnabled(zA2);
        setErrorEnabled(zA);
        setCounterEnabled(zA3);
        setHelperText(charSequenceP2);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        this.f37249D.Q(charSequence);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f37249D.S(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f37249D.c0(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f37249D.j0(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f37249D.l0(drawable);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.f37247C.r(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f37247C.s(drawable);
    }

    public void setHint(int i10) {
        setHint(i10 != 0 ? getResources().getText(i10) : null);
    }

    class a implements TextWatcher {

        /* renamed from: B, reason: collision with root package name */
        int f37321B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ EditText f37322C;

        a(EditText editText) {
            this.f37322C = editText;
            this.f37321B = editText.getLineCount();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout.this.u0(!r0.f37295b1);
            TextInputLayout textInputLayout = TextInputLayout.this;
            if (textInputLayout.f37265L) {
                textInputLayout.k0(editable);
            }
            if (TextInputLayout.this.f37281T) {
                TextInputLayout.this.y0(editable);
            }
            int lineCount = this.f37322C.getLineCount();
            int i10 = this.f37321B;
            if (lineCount != i10) {
                if (lineCount < i10) {
                    int iA = X.A(this.f37322C);
                    int i11 = TextInputLayout.this.f37284U0;
                    if (iA != i11) {
                        this.f37322C.setMinimumHeight(i11);
                    }
                }
                this.f37321B = lineCount;
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }
}
