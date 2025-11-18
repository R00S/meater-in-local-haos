package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C0190t;
import androidx.core.view.C0311u;
import androidx.core.widget.C0330k;
import java.util.ArrayList;
import java.util.List;
import p241e.p254e.p256b.p271c.C8910d;
import p241e.p254e.p256b.p271c.C8912f;
import p241e.p254e.p256b.p271c.p273m.C8919a;
import p241e.p254e.p256b.p271c.p273m.C8920b;

/* compiled from: IndicatorViewController.java */
/* renamed from: com.google.android.material.textfield.f */
/* loaded from: classes2.dex */
final class C8075f {

    /* renamed from: a */
    private final Context f30562a;

    /* renamed from: b */
    private final TextInputLayout f30563b;

    /* renamed from: c */
    private LinearLayout f30564c;

    /* renamed from: d */
    private int f30565d;

    /* renamed from: e */
    private FrameLayout f30566e;

    /* renamed from: f */
    private int f30567f;

    /* renamed from: g */
    private Animator f30568g;

    /* renamed from: h */
    private final float f30569h;

    /* renamed from: i */
    private int f30570i;

    /* renamed from: j */
    private int f30571j;

    /* renamed from: k */
    private CharSequence f30572k;

    /* renamed from: l */
    private boolean f30573l;

    /* renamed from: m */
    private TextView f30574m;

    /* renamed from: n */
    private CharSequence f30575n;

    /* renamed from: o */
    private int f30576o;

    /* renamed from: p */
    private ColorStateList f30577p;

    /* renamed from: q */
    private CharSequence f30578q;

    /* renamed from: r */
    private boolean f30579r;

    /* renamed from: s */
    private TextView f30580s;

    /* renamed from: t */
    private int f30581t;

    /* renamed from: u */
    private ColorStateList f30582u;

    /* renamed from: v */
    private Typeface f30583v;

    /* compiled from: IndicatorViewController.java */
    /* renamed from: com.google.android.material.textfield.f$a */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f30584a;

        /* renamed from: b */
        final /* synthetic */ TextView f30585b;

        /* renamed from: c */
        final /* synthetic */ int f30586c;

        /* renamed from: d */
        final /* synthetic */ TextView f30587d;

        a(int i2, TextView textView, int i3, TextView textView2) {
            this.f30584a = i2;
            this.f30585b = textView;
            this.f30586c = i3;
            this.f30587d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C8075f.this.f30570i = this.f30584a;
            C8075f.this.f30568g = null;
            TextView textView = this.f30585b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f30586c == 1 && C8075f.this.f30574m != null) {
                    C8075f.this.f30574m.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f30587d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f30587d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f30587d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public C8075f(TextInputLayout textInputLayout) {
        this.f30562a = textInputLayout.getContext();
        this.f30563b = textInputLayout;
        this.f30569h = r0.getResources().getDimensionPixelSize(C8910d.f33881p);
    }

    /* renamed from: B */
    private void m24848B(int i2, int i3) {
        TextView textViewM24860l;
        TextView textViewM24860l2;
        if (i2 == i3) {
            return;
        }
        if (i3 != 0 && (textViewM24860l2 = m24860l(i3)) != null) {
            textViewM24860l2.setVisibility(0);
            textViewM24860l2.setAlpha(1.0f);
        }
        if (i2 != 0 && (textViewM24860l = m24860l(i2)) != null) {
            textViewM24860l.setVisibility(4);
            if (i2 == 1) {
                textViewM24860l.setText((CharSequence) null);
            }
        }
        this.f30570i = i3;
    }

    /* renamed from: J */
    private void m24849J(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    /* renamed from: L */
    private void m24850L(ViewGroup viewGroup, int i2) {
        if (i2 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: M */
    private boolean m24851M(TextView textView, CharSequence charSequence) {
        return C0311u.m2102O(this.f30563b) && this.f30563b.isEnabled() && !(this.f30571j == this.f30570i && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    /* renamed from: P */
    private void m24852P(int i2, int i3, boolean z) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        if (i2 == i3) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f30568g = animatorSet;
            ArrayList arrayList = new ArrayList();
            m24857h(arrayList, this.f30579r, this.f30580s, 2, i2, i3);
            m24857h(arrayList, this.f30573l, this.f30574m, 1, i2, i3);
            C8920b.m28431a(animatorSet, arrayList);
            animatorSet.addListener(new a(i3, m24860l(i2), i2, m24860l(i3)));
            animatorSet.start();
        } else {
            m24848B(i2, i3);
        }
        this.f30563b.updateEditTextBackground();
        this.f30563b.updateLabelState(z);
        this.f30563b.updateTextInputBoxState();
    }

    /* renamed from: f */
    private boolean m24856f() {
        return (this.f30564c == null || this.f30563b.getEditText() == null) ? false : true;
    }

    /* renamed from: h */
    private void m24857h(List<Animator> list, boolean z, TextView textView, int i2, int i3, int i4) {
        if (textView == null || !z) {
            return;
        }
        if (i2 == i4 || i2 == i3) {
            list.add(m24858i(textView, i4 == i2));
            if (i4 == i2) {
                list.add(m24859j(textView));
            }
        }
    }

    /* renamed from: i */
    private ObjectAnimator m24858i(TextView textView, boolean z) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z ? 1.0f : 0.0f);
        objectAnimatorOfFloat.setDuration(167L);
        objectAnimatorOfFloat.setInterpolator(C8919a.f34370a);
        return objectAnimatorOfFloat;
    }

    /* renamed from: j */
    private ObjectAnimator m24859j(TextView textView) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f30569h, 0.0f);
        objectAnimatorOfFloat.setDuration(217L);
        objectAnimatorOfFloat.setInterpolator(C8919a.f34373d);
        return objectAnimatorOfFloat;
    }

    /* renamed from: l */
    private TextView m24860l(int i2) {
        if (i2 == 1) {
            return this.f30574m;
        }
        if (i2 != 2) {
            return null;
        }
        return this.f30580s;
    }

    /* renamed from: v */
    private boolean m24861v(int i2) {
        return (i2 != 1 || this.f30574m == null || TextUtils.isEmpty(this.f30572k)) ? false : true;
    }

    /* renamed from: w */
    private boolean m24862w(int i2) {
        return (i2 != 2 || this.f30580s == null || TextUtils.isEmpty(this.f30578q)) ? false : true;
    }

    /* renamed from: A */
    void m24863A(TextView textView, int i2) {
        FrameLayout frameLayout;
        if (this.f30564c == null) {
            return;
        }
        if (!m24887x(i2) || (frameLayout = this.f30566e) == null) {
            this.f30564c.removeView(textView);
        } else {
            int i3 = this.f30567f - 1;
            this.f30567f = i3;
            m24850L(frameLayout, i3);
            this.f30566e.removeView(textView);
        }
        int i4 = this.f30565d - 1;
        this.f30565d = i4;
        m24850L(this.f30564c, i4);
    }

    /* renamed from: C */
    void m24864C(CharSequence charSequence) {
        this.f30575n = charSequence;
        TextView textView = this.f30574m;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    /* renamed from: D */
    void m24865D(boolean z) {
        if (this.f30573l == z) {
            return;
        }
        m24876g();
        if (z) {
            C0190t c0190t = new C0190t(this.f30562a);
            this.f30574m = c0190t;
            c0190t.setId(C8912f.f33904E);
            if (Build.VERSION.SDK_INT >= 17) {
                this.f30574m.setTextAlignment(5);
            }
            Typeface typeface = this.f30583v;
            if (typeface != null) {
                this.f30574m.setTypeface(typeface);
            }
            m24866E(this.f30576o);
            m24867F(this.f30577p);
            m24864C(this.f30575n);
            this.f30574m.setVisibility(4);
            C0311u.m2135k0(this.f30574m, 1);
            m24874d(this.f30574m, 0);
        } else {
            m24885t();
            m24863A(this.f30574m, 0);
            this.f30574m = null;
            this.f30563b.updateEditTextBackground();
            this.f30563b.updateTextInputBoxState();
        }
        this.f30573l = z;
    }

    /* renamed from: E */
    void m24866E(int i2) {
        this.f30576o = i2;
        TextView textView = this.f30574m;
        if (textView != null) {
            this.f30563b.setTextAppearanceCompatWithErrorFallback(textView, i2);
        }
    }

    /* renamed from: F */
    void m24867F(ColorStateList colorStateList) {
        this.f30577p = colorStateList;
        TextView textView = this.f30574m;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    /* renamed from: G */
    void m24868G(int i2) {
        this.f30581t = i2;
        TextView textView = this.f30580s;
        if (textView != null) {
            C0330k.m2333n(textView, i2);
        }
    }

    /* renamed from: H */
    void m24869H(boolean z) {
        if (this.f30579r == z) {
            return;
        }
        m24876g();
        if (z) {
            C0190t c0190t = new C0190t(this.f30562a);
            this.f30580s = c0190t;
            c0190t.setId(C8912f.f33905F);
            if (Build.VERSION.SDK_INT >= 17) {
                this.f30580s.setTextAlignment(5);
            }
            Typeface typeface = this.f30583v;
            if (typeface != null) {
                this.f30580s.setTypeface(typeface);
            }
            this.f30580s.setVisibility(4);
            C0311u.m2135k0(this.f30580s, 1);
            m24868G(this.f30581t);
            m24870I(this.f30582u);
            m24874d(this.f30580s, 1);
        } else {
            m24886u();
            m24863A(this.f30580s, 1);
            this.f30580s = null;
            this.f30563b.updateEditTextBackground();
            this.f30563b.updateTextInputBoxState();
        }
        this.f30579r = z;
    }

    /* renamed from: I */
    void m24870I(ColorStateList colorStateList) {
        this.f30582u = colorStateList;
        TextView textView = this.f30580s;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    /* renamed from: K */
    void m24871K(Typeface typeface) {
        if (typeface != this.f30583v) {
            this.f30583v = typeface;
            m24849J(this.f30574m, typeface);
            m24849J(this.f30580s, typeface);
        }
    }

    /* renamed from: N */
    void m24872N(CharSequence charSequence) {
        m24876g();
        this.f30572k = charSequence;
        this.f30574m.setText(charSequence);
        int i2 = this.f30570i;
        if (i2 != 1) {
            this.f30571j = 1;
        }
        m24852P(i2, this.f30571j, m24851M(this.f30574m, charSequence));
    }

    /* renamed from: O */
    void m24873O(CharSequence charSequence) {
        m24876g();
        this.f30578q = charSequence;
        this.f30580s.setText(charSequence);
        int i2 = this.f30570i;
        if (i2 != 2) {
            this.f30571j = 2;
        }
        m24852P(i2, this.f30571j, m24851M(this.f30580s, charSequence));
    }

    /* renamed from: d */
    void m24874d(TextView textView, int i2) {
        if (this.f30564c == null && this.f30566e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f30562a);
            this.f30564c = linearLayout;
            linearLayout.setOrientation(0);
            this.f30563b.addView(this.f30564c, -1, -2);
            this.f30566e = new FrameLayout(this.f30562a);
            this.f30564c.addView(this.f30566e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f30563b.getEditText() != null) {
                m24875e();
            }
        }
        if (m24887x(i2)) {
            this.f30566e.setVisibility(0);
            this.f30566e.addView(textView);
            this.f30567f++;
        } else {
            this.f30564c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f30564c.setVisibility(0);
        this.f30565d++;
    }

    /* renamed from: e */
    void m24875e() {
        if (m24856f()) {
            C0311u.m2159w0(this.f30564c, C0311u.m2090D(this.f30563b.getEditText()), 0, C0311u.m2088C(this.f30563b.getEditText()), 0);
        }
    }

    /* renamed from: g */
    void m24876g() {
        Animator animator = this.f30568g;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* renamed from: k */
    boolean m24877k() {
        return m24861v(this.f30571j);
    }

    /* renamed from: m */
    CharSequence m24878m() {
        return this.f30575n;
    }

    /* renamed from: n */
    CharSequence m24879n() {
        return this.f30572k;
    }

    /* renamed from: o */
    int m24880o() {
        TextView textView = this.f30574m;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* renamed from: p */
    ColorStateList m24881p() {
        TextView textView = this.f30574m;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* renamed from: q */
    CharSequence m24882q() {
        return this.f30578q;
    }

    /* renamed from: r */
    int m24883r() {
        TextView textView = this.f30580s;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* renamed from: s */
    boolean m24884s() {
        return m24862w(this.f30570i);
    }

    /* renamed from: t */
    void m24885t() {
        this.f30572k = null;
        m24876g();
        if (this.f30570i == 1) {
            if (!this.f30579r || TextUtils.isEmpty(this.f30578q)) {
                this.f30571j = 0;
            } else {
                this.f30571j = 2;
            }
        }
        m24852P(this.f30570i, this.f30571j, m24851M(this.f30574m, null));
    }

    /* renamed from: u */
    void m24886u() throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        m24876g();
        int i2 = this.f30570i;
        if (i2 == 2) {
            this.f30571j = 0;
        }
        m24852P(i2, this.f30571j, m24851M(this.f30580s, null));
    }

    /* renamed from: x */
    boolean m24887x(int i2) {
        return i2 == 0 || i2 == 1;
    }

    /* renamed from: y */
    boolean m24888y() {
        return this.f30573l;
    }

    /* renamed from: z */
    boolean m24889z() {
        return this.f30579r;
    }
}
