package com.google.android.material.transformation;

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
import android.os.Build;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0311u;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p241e.p254e.p256b.p271c.C8912f;
import p241e.p254e.p256b.p271c.p273m.C8919a;
import p241e.p254e.p256b.p271c.p273m.C8920b;
import p241e.p254e.p256b.p271c.p273m.C8921c;
import p241e.p254e.p256b.p271c.p273m.C8922d;
import p241e.p254e.p256b.p271c.p273m.C8923e;
import p241e.p254e.p256b.p271c.p273m.C8926h;
import p241e.p254e.p256b.p271c.p273m.C8927i;
import p241e.p254e.p256b.p271c.p273m.C8928j;
import p241e.p254e.p256b.p271c.p276p.C8932a;
import p241e.p254e.p256b.p271c.p276p.C8934c;
import p241e.p254e.p256b.p271c.p276p.InterfaceC8935d;
import p241e.p254e.p256b.p271c.p283v.C8943a;

@Deprecated
/* loaded from: classes2.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    private final Rect f30609c;

    /* renamed from: d */
    private final RectF f30610d;

    /* renamed from: e */
    private final RectF f30611e;

    /* renamed from: f */
    private final int[] f30612f;

    /* renamed from: g */
    private float f30613g;

    /* renamed from: h */
    private float f30614h;

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$a */
    class C8082a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f30615a;

        /* renamed from: b */
        final /* synthetic */ View f30616b;

        /* renamed from: c */
        final /* synthetic */ View f30617c;

        C8082a(boolean z, View view, View view2) {
            this.f30615a = z;
            this.f30616b = view;
            this.f30617c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f30615a) {
                return;
            }
            this.f30616b.setVisibility(4);
            this.f30617c.setAlpha(1.0f);
            this.f30617c.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f30615a) {
                this.f30616b.setVisibility(0);
                this.f30617c.setAlpha(0.0f);
                this.f30617c.setVisibility(4);
            }
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$b */
    class C8083b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f30619a;

        C8083b(View view) {
            this.f30619a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f30619a.invalidate();
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$c */
    class C8084c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ InterfaceC8935d f30621a;

        /* renamed from: b */
        final /* synthetic */ Drawable f30622b;

        C8084c(InterfaceC8935d interfaceC8935d, Drawable drawable) {
            this.f30621a = interfaceC8935d;
            this.f30622b = drawable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f30621a.setCircularRevealOverlayDrawable(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f30621a.setCircularRevealOverlayDrawable(this.f30622b);
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$d */
    class C8085d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ InterfaceC8935d f30624a;

        C8085d(InterfaceC8935d interfaceC8935d) {
            this.f30624a = interfaceC8935d;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            InterfaceC8935d.e revealInfo = this.f30624a.getRevealInfo();
            revealInfo.f34406c = Float.MAX_VALUE;
            this.f30624a.setRevealInfo(revealInfo);
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$e */
    protected static class C8086e {

        /* renamed from: a */
        public C8926h f30626a;

        /* renamed from: b */
        public C8928j f30627b;

        protected C8086e() {
        }
    }

    public FabTransformationBehavior() {
        this.f30609c = new Rect();
        this.f30610d = new RectF();
        this.f30611e = new RectF();
        this.f30612f = new int[2];
    }

    /* renamed from: K */
    private ViewGroup m24913K(View view) {
        View viewFindViewById = view.findViewById(C8912f.f33931u);
        return viewFindViewById != null ? m24933f0(viewFindViewById) : ((view instanceof C8089b) || (view instanceof C8088a)) ? m24933f0(((ViewGroup) view).getChildAt(0)) : m24933f0(view);
    }

    /* renamed from: L */
    private void m24914L(View view, C8086e c8086e, C8927i c8927i, C8927i c8927i2, float f2, float f3, float f4, float f5, RectF rectF) {
        float fM24921S = m24921S(c8086e, c8927i, f2, f4);
        float fM24921S2 = m24921S(c8086e, c8927i2, f3, f5);
        Rect rect = this.f30609c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f30610d;
        rectF2.set(rect);
        RectF rectF3 = this.f30611e;
        m24922T(view, rectF3);
        rectF3.offset(fM24921S, fM24921S2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    /* renamed from: M */
    private void m24915M(View view, RectF rectF) {
        m24922T(view, rectF);
        rectF.offset(this.f30613g, this.f30614h);
    }

    /* renamed from: N */
    private Pair<C8927i, C8927i> m24916N(float f2, float f3, boolean z, C8086e c8086e) {
        C8927i c8927iM28444e;
        C8927i c8927iM28444e2;
        if (f2 == 0.0f || f3 == 0.0f) {
            c8927iM28444e = c8086e.f30626a.m28444e("translationXLinear");
            c8927iM28444e2 = c8086e.f30626a.m28444e("translationYLinear");
        } else if ((!z || f3 >= 0.0f) && (z || f3 <= 0.0f)) {
            c8927iM28444e = c8086e.f30626a.m28444e("translationXCurveDownwards");
            c8927iM28444e2 = c8086e.f30626a.m28444e("translationYCurveDownwards");
        } else {
            c8927iM28444e = c8086e.f30626a.m28444e("translationXCurveUpwards");
            c8927iM28444e2 = c8086e.f30626a.m28444e("translationYCurveUpwards");
        }
        return new Pair<>(c8927iM28444e, c8927iM28444e2);
    }

    /* renamed from: O */
    private float m24917O(View view, View view2, C8928j c8928j) {
        RectF rectF = this.f30610d;
        RectF rectF2 = this.f30611e;
        m24915M(view, rectF);
        m24922T(view2, rectF2);
        rectF2.offset(-m24919Q(view, view2, c8928j), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    /* renamed from: P */
    private float m24918P(View view, View view2, C8928j c8928j) {
        RectF rectF = this.f30610d;
        RectF rectF2 = this.f30611e;
        m24915M(view, rectF);
        m24922T(view2, rectF2);
        rectF2.offset(0.0f, -m24920R(view, view2, c8928j));
        return rectF.centerY() - rectF2.top;
    }

    /* renamed from: Q */
    private float m24919Q(View view, View view2, C8928j c8928j) {
        float fCenterX;
        float fCenterX2;
        float f2;
        RectF rectF = this.f30610d;
        RectF rectF2 = this.f30611e;
        m24915M(view, rectF);
        m24922T(view2, rectF2);
        int i2 = c8928j.f34390a & 7;
        if (i2 == 1) {
            fCenterX = rectF2.centerX();
            fCenterX2 = rectF.centerX();
        } else if (i2 == 3) {
            fCenterX = rectF2.left;
            fCenterX2 = rectF.left;
        } else {
            if (i2 != 5) {
                f2 = 0.0f;
                return f2 + c8928j.f34391b;
            }
            fCenterX = rectF2.right;
            fCenterX2 = rectF.right;
        }
        f2 = fCenterX - fCenterX2;
        return f2 + c8928j.f34391b;
    }

    /* renamed from: R */
    private float m24920R(View view, View view2, C8928j c8928j) {
        float fCenterY;
        float fCenterY2;
        float f2;
        RectF rectF = this.f30610d;
        RectF rectF2 = this.f30611e;
        m24915M(view, rectF);
        m24922T(view2, rectF2);
        int i2 = c8928j.f34390a & 112;
        if (i2 == 16) {
            fCenterY = rectF2.centerY();
            fCenterY2 = rectF.centerY();
        } else if (i2 == 48) {
            fCenterY = rectF2.top;
            fCenterY2 = rectF.top;
        } else {
            if (i2 != 80) {
                f2 = 0.0f;
                return f2 + c8928j.f34392c;
            }
            fCenterY = rectF2.bottom;
            fCenterY2 = rectF.bottom;
        }
        f2 = fCenterY - fCenterY2;
        return f2 + c8928j.f34392c;
    }

    /* renamed from: S */
    private float m24921S(C8086e c8086e, C8927i c8927i, float f2, float f3) {
        long jM28452c = c8927i.m28452c();
        long jM28453d = c8927i.m28453d();
        C8927i c8927iM28444e = c8086e.f30626a.m28444e("expansion");
        return C8919a.m28430a(f2, f3, c8927i.m28454e().getInterpolation((((c8927iM28444e.m28452c() + c8927iM28444e.m28453d()) + 17) - jM28452c) / jM28453d));
    }

    /* renamed from: T */
    private void m24922T(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f30612f);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    /* renamed from: U */
    private void m24923U(View view, View view2, boolean z, boolean z2, C8086e c8086e, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup viewGroupM24913K;
        ObjectAnimator objectAnimatorOfFloat;
        if (view2 instanceof ViewGroup) {
            if (((view2 instanceof InterfaceC8935d) && C8934c.f34399a == 0) || (viewGroupM24913K = m24913K(view2)) == null) {
                return;
            }
            if (z) {
                if (!z2) {
                    C8922d.f34376a.set(viewGroupM24913K, Float.valueOf(0.0f));
                }
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupM24913K, C8922d.f34376a, 1.0f);
            } else {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupM24913K, C8922d.f34376a, 0.0f);
            }
            c8086e.f30626a.m28444e("contentFade").m28451a(objectAnimatorOfFloat);
            list.add(objectAnimatorOfFloat);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: V */
    private void m24924V(View view, View view2, boolean z, boolean z2, C8086e c8086e, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfInt;
        if (view2 instanceof InterfaceC8935d) {
            InterfaceC8935d interfaceC8935d = (InterfaceC8935d) view2;
            int iM24932d0 = m24932d0(view);
            int i2 = 16777215 & iM24932d0;
            if (z) {
                if (!z2) {
                    interfaceC8935d.setCircularRevealScrimColor(iM24932d0);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(interfaceC8935d, InterfaceC8935d.d.f34403a, i2);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(interfaceC8935d, InterfaceC8935d.d.f34403a, iM24932d0);
            }
            objectAnimatorOfInt.setEvaluator(C8921c.m28432b());
            c8086e.f30626a.m28444e("color").m28451a(objectAnimatorOfInt);
            list.add(objectAnimatorOfInt);
        }
    }

    /* renamed from: W */
    private void m24925W(View view, View view2, boolean z, C8086e c8086e, List<Animator> list) {
        float fM24919Q = m24919Q(view, view2, c8086e.f30627b);
        float fM24920R = m24920R(view, view2, c8086e.f30627b);
        Pair<C8927i, C8927i> pairM24916N = m24916N(fM24919Q, fM24920R, z, c8086e);
        C8927i c8927i = (C8927i) pairM24916N.first;
        C8927i c8927i2 = (C8927i) pairM24916N.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z) {
            fM24919Q = this.f30613g;
        }
        fArr[0] = fM24919Q;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            fM24920R = this.f30614h;
        }
        fArr2[0] = fM24920R;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fArr2);
        c8927i.m28451a(objectAnimatorOfFloat);
        c8927i2.m28451a(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    @TargetApi(21)
    /* renamed from: X */
    private void m24926X(View view, View view2, boolean z, boolean z2, C8086e c8086e, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfFloat;
        float fM2152t = C0311u.m2152t(view2) - C0311u.m2152t(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-fM2152t);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -fM2152t);
        }
        c8086e.f30626a.m28444e("elevation").m28451a(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: Y */
    private void m24927Y(View view, View view2, boolean z, boolean z2, C8086e c8086e, float f2, float f3, List<Animator> list, List<Animator.AnimatorListener> list2) {
        Animator animatorM28460a;
        if (view2 instanceof InterfaceC8935d) {
            InterfaceC8935d interfaceC8935d = (InterfaceC8935d) view2;
            float fM24917O = m24917O(view, view2, c8086e.f30627b);
            float fM24918P = m24918P(view, view2, c8086e.f30627b);
            ((FloatingActionButton) view).m24477i(this.f30609c);
            float fWidth = this.f30609c.width() / 2.0f;
            C8927i c8927iM28444e = c8086e.f30626a.m28444e("expansion");
            if (z) {
                if (!z2) {
                    interfaceC8935d.setRevealInfo(new InterfaceC8935d.e(fM24917O, fM24918P, fWidth));
                }
                if (z2) {
                    fWidth = interfaceC8935d.getRevealInfo().f34406c;
                }
                animatorM28460a = C8932a.m28460a(interfaceC8935d, fM24917O, fM24918P, C8943a.m28490b(fM24917O, fM24918P, 0.0f, 0.0f, f2, f3));
                animatorM28460a.addListener(new C8085d(interfaceC8935d));
                m24930b0(view2, c8927iM28444e.m28452c(), (int) fM24917O, (int) fM24918P, fWidth, list);
            } else {
                float f4 = interfaceC8935d.getRevealInfo().f34406c;
                Animator animatorM28460a2 = C8932a.m28460a(interfaceC8935d, fM24917O, fM24918P, fWidth);
                int i2 = (int) fM24917O;
                int i3 = (int) fM24918P;
                m24930b0(view2, c8927iM28444e.m28452c(), i2, i3, f4, list);
                m24929a0(view2, c8927iM28444e.m28452c(), c8927iM28444e.m28453d(), c8086e.f30626a.m28445f(), i2, i3, fWidth, list);
                animatorM28460a = animatorM28460a2;
            }
            c8927iM28444e.m28451a(animatorM28460a);
            list.add(animatorM28460a);
            list2.add(C8932a.m28461b(interfaceC8935d));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: Z */
    private void m24928Z(View view, View view2, boolean z, boolean z2, C8086e c8086e, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfInt;
        if ((view2 instanceof InterfaceC8935d) && (view instanceof ImageView)) {
            InterfaceC8935d interfaceC8935d = (InterfaceC8935d) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                return;
            }
            drawable.mutate();
            if (z) {
                if (!z2) {
                    drawable.setAlpha(255);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, C8923e.f34377a, 0);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, C8923e.f34377a, 255);
            }
            objectAnimatorOfInt.addUpdateListener(new C8083b(view2));
            c8086e.f30626a.m28444e("iconFade").m28451a(objectAnimatorOfInt);
            list.add(objectAnimatorOfInt);
            list2.add(new C8084c(interfaceC8935d, drawable));
        }
    }

    /* renamed from: a0 */
    private void m24929a0(View view, long j2, long j3, long j4, int i2, int i3, float f2, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21) {
            long j5 = j2 + j3;
            if (j5 < j4) {
                Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, i2, i3, f2, f2);
                animatorCreateCircularReveal.setStartDelay(j5);
                animatorCreateCircularReveal.setDuration(j4 - j5);
                list.add(animatorCreateCircularReveal);
            }
        }
    }

    /* renamed from: b0 */
    private void m24930b0(View view, long j2, int i2, int i3, float f2, List<Animator> list) {
        if (Build.VERSION.SDK_INT < 21 || j2 <= 0) {
            return;
        }
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, i2, i3, f2, f2);
        animatorCreateCircularReveal.setStartDelay(0L);
        animatorCreateCircularReveal.setDuration(j2);
        list.add(animatorCreateCircularReveal);
    }

    /* renamed from: c0 */
    private void m24931c0(View view, View view2, boolean z, boolean z2, C8086e c8086e, List<Animator> list, List<Animator.AnimatorListener> list2, RectF rectF) {
        ObjectAnimator objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2;
        float fM24919Q = m24919Q(view, view2, c8086e.f30627b);
        float fM24920R = m24920R(view, view2, c8086e.f30627b);
        Pair<C8927i, C8927i> pairM24916N = m24916N(fM24919Q, fM24920R, z, c8086e);
        C8927i c8927i = (C8927i) pairM24916N.first;
        C8927i c8927i2 = (C8927i) pairM24916N.second;
        if (z) {
            if (!z2) {
                view2.setTranslationX(-fM24919Q);
                view2.setTranslationY(-fM24920R);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            m24914L(view2, c8086e, c8927i, c8927i2, -fM24919Q, -fM24920R, 0.0f, 0.0f, rectF);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -fM24919Q);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -fM24920R);
        }
        c8927i.m28451a(objectAnimatorOfFloat);
        c8927i2.m28451a(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    /* renamed from: d0 */
    private int m24932d0(View view) {
        ColorStateList colorStateListM2144p = C0311u.m2144p(view);
        if (colorStateListM2144p != null) {
            return colorStateListM2144p.getColorForState(view.getDrawableState(), colorStateListM2144p.getDefaultColor());
        }
        return 0;
    }

    /* renamed from: f0 */
    private ViewGroup m24933f0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* renamed from: J */
    protected AnimatorSet mo24912J(View view, View view2, boolean z, boolean z2) {
        C8086e c8086eMo24934e0 = mo24934e0(view2.getContext(), z);
        if (z) {
            this.f30613g = view.getTranslationX();
            this.f30614h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (Build.VERSION.SDK_INT >= 21) {
            m24926X(view, view2, z, z2, c8086eMo24934e0, arrayList, arrayList2);
        }
        RectF rectF = this.f30610d;
        m24931c0(view, view2, z, z2, c8086eMo24934e0, arrayList, arrayList2, rectF);
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        m24925W(view, view2, z, c8086eMo24934e0, arrayList);
        m24928Z(view, view2, z, z2, c8086eMo24934e0, arrayList, arrayList2);
        m24927Y(view, view2, z, z2, c8086eMo24934e0, fWidth, fHeight, arrayList, arrayList2);
        m24924V(view, view2, z, z2, c8086eMo24934e0, arrayList, arrayList2);
        m24923U(view, view2, z, z2, c8086eMo24934e0, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        C8920b.m28431a(animatorSet, arrayList);
        animatorSet.addListener(new C8082a(z, view2, view));
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            animatorSet.addListener(arrayList2.get(i2));
        }
        return animatorSet;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    /* renamed from: e */
    public boolean mo1451e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    /* renamed from: e0 */
    protected abstract C8086e mo24934e0(Context context, boolean z);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    /* renamed from: g */
    public void mo1453g(CoordinatorLayout.C0229f c0229f) {
        if (c0229f.f2010h == 0) {
            c0229f.f2010h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30609c = new Rect();
        this.f30610d = new RectF();
        this.f30611e = new RectF();
        this.f30612f = new int[2];
    }
}
