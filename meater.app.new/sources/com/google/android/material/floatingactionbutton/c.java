package com.google.android.material.floatingactionbutton;

import C7.d;
import X7.g;
import X7.k;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.Property;
import android.view.View;
import g1.C3377a;
import java.util.ArrayList;
import r1.i;

/* compiled from: FloatingActionButtonImplLollipop.java */
/* loaded from: classes2.dex */
class c extends b {

    /* renamed from: O, reason: collision with root package name */
    private StateListAnimator f36649O;

    /* compiled from: FloatingActionButtonImplLollipop.java */
    static class a extends g {
        a(k kVar) {
            super(kVar);
        }

        @Override // X7.g, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    c(FloatingActionButton floatingActionButton, W7.b bVar) {
        super(floatingActionButton, bVar);
    }

    private StateListAnimator j0(float f10, float f11, float f12) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(b.f36586I, k0(f10, f12));
        stateListAnimator.addState(b.f36587J, k0(f10, f11));
        stateListAnimator.addState(b.f36588K, k0(f10, f11));
        stateListAnimator.addState(b.f36589L, k0(f10, f11));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f36617w, "elevation", f10).setDuration(0L));
        arrayList.add(ObjectAnimator.ofFloat(this.f36617w, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(b.f36581D);
        stateListAnimator.addState(b.f36590M, animatorSet);
        stateListAnimator.addState(b.f36591N, k0(0.0f, 0.0f));
        return stateListAnimator;
    }

    private Animator k0(float f10, float f11) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f36617w, "elevation", f10).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f36617w, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f11).setDuration(100L));
        animatorSet.setInterpolator(b.f36581D);
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.b
    void C() {
        f0();
    }

    @Override // com.google.android.material.floatingactionbutton.b
    void F(float f10, float f11, float f12) {
        if (this.f36617w.getStateListAnimator() == this.f36649O) {
            StateListAnimator stateListAnimatorJ0 = j0(f10, f11, f12);
            this.f36649O = stateListAnimatorJ0;
            this.f36617w.setStateListAnimator(stateListAnimatorJ0);
        }
        if (Z()) {
            f0();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.b
    boolean K() {
        return false;
    }

    @Override // com.google.android.material.floatingactionbutton.b
    void V(ColorStateList colorStateList) {
        Drawable drawable = this.f36597c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(V7.b.d(colorStateList));
        } else {
            super.V(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.b
    boolean Z() {
        return this.f36618x.d() || !b0();
    }

    com.google.android.material.floatingactionbutton.a i0(int i10, ColorStateList colorStateList) {
        Context context = this.f36617w.getContext();
        com.google.android.material.floatingactionbutton.a aVar = new com.google.android.material.floatingactionbutton.a((k) i.g(this.f36595a));
        aVar.e(C3377a.c(context, d.f2347f), C3377a.c(context, d.f2346e), C3377a.c(context, d.f2344c), C3377a.c(context, d.f2345d));
        aVar.d(i10);
        aVar.c(colorStateList);
        return aVar;
    }

    g l0() {
        return new a((k) i.g(this.f36595a));
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public float m() {
        return this.f36617w.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.b
    void r(Rect rect) {
        if (this.f36618x.d()) {
            super.r(rect);
        } else if (b0()) {
            rect.set(0, 0, 0, 0);
        } else {
            int sizeDimension = (this.f36605k - this.f36617w.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.b
    void x(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i10) {
        Drawable layerDrawable;
        g gVarL0 = l0();
        this.f36596b = gVarL0;
        gVarL0.setTintList(colorStateList);
        if (mode != null) {
            this.f36596b.setTintMode(mode);
        }
        this.f36596b.Q(this.f36617w.getContext());
        if (i10 > 0) {
            this.f36598d = i0(i10, colorStateList);
            layerDrawable = new LayerDrawable(new Drawable[]{(Drawable) i.g(this.f36598d), (Drawable) i.g(this.f36596b)});
        } else {
            this.f36598d = null;
            layerDrawable = this.f36596b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(V7.b.d(colorStateList2), layerDrawable, null);
        this.f36597c = rippleDrawable;
        this.f36599e = rippleDrawable;
    }

    @Override // com.google.android.material.floatingactionbutton.b
    void A() {
    }

    @Override // com.google.android.material.floatingactionbutton.b
    void d0() {
    }

    @Override // com.google.android.material.floatingactionbutton.b
    void E(int[] iArr) {
    }
}
