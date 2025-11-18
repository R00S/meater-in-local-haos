package com.google.android.material.transformation;

import C7.g;
import D7.h;
import D7.i;
import D7.j;
import K7.d;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c8.C2345a;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import s1.X;

@Deprecated
/* loaded from: classes2.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: D, reason: collision with root package name */
    private final Rect f37539D;

    /* renamed from: E, reason: collision with root package name */
    private final RectF f37540E;

    /* renamed from: F, reason: collision with root package name */
    private final RectF f37541F;

    /* renamed from: G, reason: collision with root package name */
    private final int[] f37542G;

    /* renamed from: H, reason: collision with root package name */
    private float f37543H;

    /* renamed from: I, reason: collision with root package name */
    private float f37544I;

    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f37545a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f37546b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f37547c;

        a(boolean z10, View view, View view2) {
            this.f37545a = z10;
            this.f37546b = view;
            this.f37547c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f37545a) {
                return;
            }
            this.f37546b.setVisibility(4);
            this.f37547c.setAlpha(1.0f);
            this.f37547c.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f37545a) {
                this.f37546b.setVisibility(0);
                this.f37547c.setAlpha(0.0f);
                this.f37547c.setVisibility(4);
            }
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f37549a;

        b(View view) {
            this.f37549a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f37549a.invalidate();
        }
    }

    class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ K7.d f37551a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Drawable f37552b;

        c(K7.d dVar, Drawable drawable) {
            this.f37551a = dVar;
            this.f37552b = drawable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f37551a.setCircularRevealOverlayDrawable(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f37551a.setCircularRevealOverlayDrawable(this.f37552b);
        }
    }

    class d extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ K7.d f37554a;

        d(K7.d dVar) {
            this.f37554a = dVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d.e revealInfo = this.f37554a.getRevealInfo();
            revealInfo.f8729c = Float.MAX_VALUE;
            this.f37554a.setRevealInfo(revealInfo);
        }
    }

    protected static class e {

        /* renamed from: a, reason: collision with root package name */
        public h f37556a;

        /* renamed from: b, reason: collision with root package name */
        public j f37557b;

        protected e() {
        }
    }

    public FabTransformationBehavior() {
        this.f37539D = new Rect();
        this.f37540E = new RectF();
        this.f37541F = new RectF();
        this.f37542G = new int[2];
    }

    private ViewGroup O(View view) {
        View viewFindViewById = view.findViewById(g.f2449F);
        return viewFindViewById != null ? j0(viewFindViewById) : ((view instanceof c8.b) || (view instanceof C2345a)) ? j0(((ViewGroup) view).getChildAt(0)) : j0(view);
    }

    private void P(View view, e eVar, i iVar, i iVar2, float f10, float f11, float f12, float f13, RectF rectF) {
        float fW = W(eVar, iVar, f10, f12);
        float fW2 = W(eVar, iVar2, f11, f13);
        Rect rect = this.f37539D;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f37540E;
        rectF2.set(rect);
        RectF rectF3 = this.f37541F;
        X(view, rectF3);
        rectF3.offset(fW, fW2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    private void Q(View view, RectF rectF) {
        X(view, rectF);
        rectF.offset(this.f37543H, this.f37544I);
    }

    private Pair<i, i> R(float f10, float f11, boolean z10, e eVar) {
        i iVarE;
        i iVarE2;
        if (f10 == 0.0f || f11 == 0.0f) {
            iVarE = eVar.f37556a.e("translationXLinear");
            iVarE2 = eVar.f37556a.e("translationYLinear");
        } else if ((!z10 || f11 >= 0.0f) && (z10 || f11 <= 0.0f)) {
            iVarE = eVar.f37556a.e("translationXCurveDownwards");
            iVarE2 = eVar.f37556a.e("translationYCurveDownwards");
        } else {
            iVarE = eVar.f37556a.e("translationXCurveUpwards");
            iVarE2 = eVar.f37556a.e("translationYCurveUpwards");
        }
        return new Pair<>(iVarE, iVarE2);
    }

    private float S(View view, View view2, j jVar) {
        RectF rectF = this.f37540E;
        RectF rectF2 = this.f37541F;
        Q(view, rectF);
        X(view2, rectF2);
        rectF2.offset(-U(view, view2, jVar), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    private float T(View view, View view2, j jVar) {
        RectF rectF = this.f37540E;
        RectF rectF2 = this.f37541F;
        Q(view, rectF);
        X(view2, rectF2);
        rectF2.offset(0.0f, -V(view, view2, jVar));
        return rectF.centerY() - rectF2.top;
    }

    private float U(View view, View view2, j jVar) {
        float fCenterX;
        float fCenterX2;
        float f10;
        RectF rectF = this.f37540E;
        RectF rectF2 = this.f37541F;
        Q(view, rectF);
        X(view2, rectF2);
        int i10 = jVar.f3506a & 7;
        if (i10 == 1) {
            fCenterX = rectF2.centerX();
            fCenterX2 = rectF.centerX();
        } else if (i10 == 3) {
            fCenterX = rectF2.left;
            fCenterX2 = rectF.left;
        } else {
            if (i10 != 5) {
                f10 = 0.0f;
                return f10 + jVar.f3507b;
            }
            fCenterX = rectF2.right;
            fCenterX2 = rectF.right;
        }
        f10 = fCenterX - fCenterX2;
        return f10 + jVar.f3507b;
    }

    private float V(View view, View view2, j jVar) {
        float fCenterY;
        float fCenterY2;
        float f10;
        RectF rectF = this.f37540E;
        RectF rectF2 = this.f37541F;
        Q(view, rectF);
        X(view2, rectF2);
        int i10 = jVar.f3506a & 112;
        if (i10 == 16) {
            fCenterY = rectF2.centerY();
            fCenterY2 = rectF.centerY();
        } else if (i10 == 48) {
            fCenterY = rectF2.top;
            fCenterY2 = rectF.top;
        } else {
            if (i10 != 80) {
                f10 = 0.0f;
                return f10 + jVar.f3508c;
            }
            fCenterY = rectF2.bottom;
            fCenterY2 = rectF.bottom;
        }
        f10 = fCenterY - fCenterY2;
        return f10 + jVar.f3508c;
    }

    private float W(e eVar, i iVar, float f10, float f11) {
        long jC = iVar.c();
        long jD = iVar.d();
        i iVarE = eVar.f37556a.e("expansion");
        return D7.a.a(f10, f11, iVar.e().getInterpolation((((iVarE.c() + iVarE.d()) + 17) - jC) / jD));
    }

    private void X(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f37542G);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    private void Y(View view, View view2, boolean z10, boolean z11, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup viewGroupO;
        ObjectAnimator objectAnimatorOfFloat;
        if (view2 instanceof ViewGroup) {
            if (((view2 instanceof K7.d) && K7.c.f8722a == 0) || (viewGroupO = O(view2)) == null) {
                return;
            }
            if (z10) {
                if (!z11) {
                    D7.d.f3492a.set(viewGroupO, Float.valueOf(0.0f));
                }
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupO, D7.d.f3492a, 1.0f);
            } else {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupO, D7.d.f3492a, 0.0f);
            }
            eVar.f37556a.e("contentFade").a(objectAnimatorOfFloat);
            list.add(objectAnimatorOfFloat);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void Z(View view, View view2, boolean z10, boolean z11, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfInt;
        if (view2 instanceof K7.d) {
            K7.d dVar = (K7.d) view2;
            int iH0 = h0(view);
            int i10 = 16777215 & iH0;
            if (z10) {
                if (!z11) {
                    dVar.setCircularRevealScrimColor(iH0);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(dVar, d.C0173d.f8726a, i10);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(dVar, d.C0173d.f8726a, iH0);
            }
            objectAnimatorOfInt.setEvaluator(D7.c.b());
            eVar.f37556a.e("color").a(objectAnimatorOfInt);
            list.add(objectAnimatorOfInt);
        }
    }

    private void a0(View view, View view2, boolean z10, e eVar, List<Animator> list) {
        float fU = U(view, view2, eVar.f37557b);
        float fV = V(view, view2, eVar.f37557b);
        Pair<i, i> pairR = R(fU, fV, z10, eVar);
        i iVar = (i) pairR.first;
        i iVar2 = (i) pairR.second;
        Property property = View.TRANSLATION_X;
        if (!z10) {
            fU = this.f37543H;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fU);
        Property property2 = View.TRANSLATION_Y;
        if (!z10) {
            fV = this.f37544I;
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fV);
        iVar.a(objectAnimatorOfFloat);
        iVar2.a(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    @TargetApi(21)
    private void b0(View view, View view2, boolean z10, boolean z11, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfFloat;
        float fU = X.u(view2) - X.u(view);
        if (z10) {
            if (!z11) {
                view2.setTranslationZ(-fU);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -fU);
        }
        eVar.f37556a.e("elevation").a(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void c0(View view, View view2, boolean z10, boolean z11, e eVar, float f10, float f11, List<Animator> list, List<Animator.AnimatorListener> list2) {
        Animator animatorA;
        if (view2 instanceof K7.d) {
            K7.d dVar = (K7.d) view2;
            float fS = S(view, view2, eVar.f37557b);
            float fT = T(view, view2, eVar.f37557b);
            ((FloatingActionButton) view).i(this.f37539D);
            float fWidth = this.f37539D.width() / 2.0f;
            i iVarE = eVar.f37556a.e("expansion");
            if (z10) {
                if (!z11) {
                    dVar.setRevealInfo(new d.e(fS, fT, fWidth));
                }
                if (z11) {
                    fWidth = dVar.getRevealInfo().f8729c;
                }
                animatorA = K7.a.a(dVar, fS, fT, Q7.a.b(fS, fT, 0.0f, 0.0f, f10, f11));
                animatorA.addListener(new d(dVar));
                f0(view2, iVarE.c(), (int) fS, (int) fT, fWidth, list);
            } else {
                float f12 = dVar.getRevealInfo().f8729c;
                Animator animatorA2 = K7.a.a(dVar, fS, fT, fWidth);
                int i10 = (int) fS;
                int i11 = (int) fT;
                f0(view2, iVarE.c(), i10, i11, f12, list);
                e0(view2, iVarE.c(), iVarE.d(), eVar.f37556a.f(), i10, i11, fWidth, list);
                animatorA = animatorA2;
            }
            iVarE.a(animatorA);
            list.add(animatorA);
            list2.add(K7.a.b(dVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void d0(View view, View view2, boolean z10, boolean z11, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfInt;
        if ((view2 instanceof K7.d) && (view instanceof ImageView)) {
            K7.d dVar = (K7.d) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                return;
            }
            drawable.mutate();
            if (z10) {
                if (!z11) {
                    drawable.setAlpha(255);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, D7.e.f3493b, 0);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, D7.e.f3493b, 255);
            }
            objectAnimatorOfInt.addUpdateListener(new b(view2));
            eVar.f37556a.e("iconFade").a(objectAnimatorOfInt);
            list.add(objectAnimatorOfInt);
            list2.add(new c(dVar, drawable));
        }
    }

    private void e0(View view, long j10, long j11, long j12, int i10, int i11, float f10, List<Animator> list) {
        long j13 = j10 + j11;
        if (j13 < j12) {
            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, i10, i11, f10, f10);
            animatorCreateCircularReveal.setStartDelay(j13);
            animatorCreateCircularReveal.setDuration(j12 - j13);
            list.add(animatorCreateCircularReveal);
        }
    }

    private void f0(View view, long j10, int i10, int i11, float f10, List<Animator> list) {
        if (j10 > 0) {
            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, i10, i11, f10, f10);
            animatorCreateCircularReveal.setStartDelay(0L);
            animatorCreateCircularReveal.setDuration(j10);
            list.add(animatorCreateCircularReveal);
        }
    }

    private void g0(View view, View view2, boolean z10, boolean z11, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2, RectF rectF) {
        ObjectAnimator objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2;
        float fU = U(view, view2, eVar.f37557b);
        float fV = V(view, view2, eVar.f37557b);
        Pair<i, i> pairR = R(fU, fV, z10, eVar);
        i iVar = (i) pairR.first;
        i iVar2 = (i) pairR.second;
        if (z10) {
            if (!z11) {
                view2.setTranslationX(-fU);
                view2.setTranslationY(-fV);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            P(view2, eVar, iVar, iVar2, -fU, -fV, 0.0f, 0.0f, rectF);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -fU);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -fV);
        }
        iVar.a(objectAnimatorOfFloat);
        iVar2.a(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    private int h0(View view) {
        ColorStateList colorStateListR = X.r(view);
        if (colorStateListR != null) {
            return colorStateListR.getColorForState(view.getDrawableState(), colorStateListR.getDefaultColor());
        }
        return 0;
    }

    private ViewGroup j0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    protected AnimatorSet N(View view, View view2, boolean z10, boolean z11) {
        e eVarI0 = i0(view2.getContext(), z10);
        if (z10) {
            this.f37543H = view.getTranslationX();
            this.f37544I = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        b0(view, view2, z10, z11, eVarI0, arrayList, arrayList2);
        RectF rectF = this.f37540E;
        g0(view, view2, z10, z11, eVarI0, arrayList, arrayList2, rectF);
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        a0(view, view2, z10, eVarI0, arrayList);
        d0(view, view2, z10, z11, eVarI0, arrayList, arrayList2);
        c0(view, view2, z10, z11, eVarI0, fWidth, fHeight, arrayList, arrayList2);
        Z(view, view2, z10, z11, eVarI0, arrayList, arrayList2);
        Y(view, view2, z10, z11, eVarI0, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        D7.b.a(animatorSet, arrayList);
        animatorSet.addListener(new a(z10, view2, view));
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            animatorSet.addListener(arrayList2.get(i10));
        }
        return animatorSet;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    protected abstract e i0(Context context, boolean z10);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void k(CoordinatorLayout.f fVar) {
        if (fVar.f24694h == 0) {
            fVar.f24694h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37539D = new Rect();
        this.f37540E = new RectF();
        this.f37541F = new RectF();
        this.f37542G = new int[2];
    }
}
