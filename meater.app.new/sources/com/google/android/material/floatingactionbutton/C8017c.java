package com.google.android.material.floatingactionbutton;

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
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.core.content.C0255a;
import java.util.ArrayList;
import p024c.p052i.p059j.C0959i;
import p241e.p254e.p256b.p271c.C8909c;
import p241e.p254e.p256b.p271c.p272a0.C8900g;
import p241e.p254e.p256b.p271c.p272a0.C8904k;
import p241e.p254e.p256b.p271c.p286y.C8952b;
import p241e.p254e.p256b.p271c.p287z.InterfaceC8954b;

/* compiled from: FloatingActionButtonImplLollipop.java */
/* renamed from: com.google.android.material.floatingactionbutton.c */
/* loaded from: classes2.dex */
class C8017c extends C8016b {

    /* compiled from: FloatingActionButtonImplLollipop.java */
    /* renamed from: com.google.android.material.floatingactionbutton.c$a */
    static class a extends C8900g {
        a(C8904k c8904k) {
            super(c8904k);
        }

        @Override // p241e.p254e.p256b.p271c.p272a0.C8900g, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    C8017c(FloatingActionButton floatingActionButton, InterfaceC8954b interfaceC8954b) {
        super(floatingActionButton, interfaceC8954b);
    }

    /* renamed from: j0 */
    private Animator m24569j0(float f2, float f3) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f30261F, "elevation", f2).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f30261F, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f3).setDuration(100L));
        animatorSet.setInterpolator(C8016b.f30249a);
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.C8016b
    /* renamed from: A */
    void mo24517A() {
    }

    @Override // com.google.android.material.floatingactionbutton.C8016b
    /* renamed from: C */
    void mo24519C() {
        m24550f0();
    }

    @Override // com.google.android.material.floatingactionbutton.C8016b
    /* renamed from: E */
    void mo24521E(int[] iArr) {
        if (Build.VERSION.SDK_INT == 21) {
            if (!this.f30261F.isEnabled()) {
                this.f30261F.setElevation(0.0f);
                this.f30261F.setTranslationZ(0.0f);
                return;
            }
            this.f30261F.setElevation(this.f30275o);
            if (this.f30261F.isPressed()) {
                this.f30261F.setTranslationZ(this.f30277q);
            } else if (this.f30261F.isFocused() || this.f30261F.isHovered()) {
                this.f30261F.setTranslationZ(this.f30276p);
            } else {
                this.f30261F.setTranslationZ(0.0f);
            }
        }
    }

    @Override // com.google.android.material.floatingactionbutton.C8016b
    /* renamed from: F */
    void mo24522F(float f2, float f3, float f4) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 == 21) {
            this.f30261F.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(C8016b.f30250b, m24569j0(f2, f4));
            stateListAnimator.addState(C8016b.f30251c, m24569j0(f2, f3));
            stateListAnimator.addState(C8016b.f30252d, m24569j0(f2, f3));
            stateListAnimator.addState(C8016b.f30253e, m24569j0(f2, f3));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f30261F, "elevation", f2).setDuration(0L));
            if (i2 >= 22 && i2 <= 24) {
                FloatingActionButton floatingActionButton = this.f30261F;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f30261F, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(C8016b.f30249a);
            stateListAnimator.addState(C8016b.f30254f, animatorSet);
            stateListAnimator.addState(C8016b.f30255g, m24569j0(0.0f, 0.0f));
            this.f30261F.setStateListAnimator(stateListAnimator);
        }
        if (mo24542Z()) {
            m24550f0();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.C8016b
    /* renamed from: K */
    boolean mo24527K() {
        return false;
    }

    @Override // com.google.android.material.floatingactionbutton.C8016b
    /* renamed from: V */
    void mo24538V(ColorStateList colorStateList) {
        Drawable drawable = this.f30270j;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(C8952b.m28522d(colorStateList));
        } else {
            super.mo24538V(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.C8016b
    /* renamed from: Z */
    boolean mo24542Z() {
        return this.f30262G.mo24497c() || !m24543b0();
    }

    @Override // com.google.android.material.floatingactionbutton.C8016b
    /* renamed from: d0 */
    void mo24546d0() {
    }

    /* renamed from: i0 */
    C8015a m24570i0(int i2, ColorStateList colorStateList) {
        Context context = this.f30261F.getContext();
        C8015a c8015a = new C8015a((C8904k) C0959i.m6065c(this.f30268h));
        c8015a.m24504e(C0255a.m1675d(context, C8909c.f33842f), C0255a.m1675d(context, C8909c.f33841e), C0255a.m1675d(context, C8909c.f33839c), C0255a.m1675d(context, C8909c.f33840d));
        c8015a.m24503d(i2);
        c8015a.m24502c(colorStateList);
        return c8015a;
    }

    @Override // com.google.android.material.floatingactionbutton.C8016b
    /* renamed from: j */
    C8900g mo24552j() {
        return new a((C8904k) C0959i.m6065c(this.f30268h));
    }

    @Override // com.google.android.material.floatingactionbutton.C8016b
    /* renamed from: n */
    public float mo24554n() {
        return this.f30261F.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.C8016b
    /* renamed from: s */
    void mo24558s(Rect rect) {
        if (this.f30262G.mo24497c()) {
            super.mo24558s(rect);
        } else if (m24543b0()) {
            rect.set(0, 0, 0, 0);
        } else {
            int sizeDimension = (this.f30278r - this.f30261F.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.C8016b
    /* renamed from: x */
    void mo24563x(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i2) {
        Drawable layerDrawable;
        C8900g c8900gMo24552j = mo24552j();
        this.f30269i = c8900gMo24552j;
        c8900gMo24552j.setTintList(colorStateList);
        if (mode != null) {
            this.f30269i.setTintMode(mode);
        }
        this.f30269i.m28278N(this.f30261F.getContext());
        if (i2 > 0) {
            this.f30271k = m24570i0(i2, colorStateList);
            layerDrawable = new LayerDrawable(new Drawable[]{(Drawable) C0959i.m6065c(this.f30271k), (Drawable) C0959i.m6065c(this.f30269i)});
        } else {
            this.f30271k = null;
            layerDrawable = this.f30269i;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(C8952b.m28522d(colorStateList2), layerDrawable, null);
        this.f30270j = rippleDrawable;
        this.f30272l = rippleDrawable;
    }
}
