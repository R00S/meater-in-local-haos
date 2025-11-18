package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0311u;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.C8024b;
import java.util.Iterator;
import java.util.List;
import p241e.p254e.p256b.p271c.C8917k;
import p241e.p254e.p256b.p271c.C8918l;
import p241e.p254e.p256b.p271c.p273m.C8926h;

/* loaded from: classes2.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.InterfaceC0225b {

    /* renamed from: w */
    private static final int f30189w = C8917k.f33997v;

    /* renamed from: x */
    static final Property<View, Float> f30190x = new C8008b(Float.class, "width");

    /* renamed from: y */
    static final Property<View, Float> f30191y = new C8009c(Float.class, "height");

    /* renamed from: A */
    private final InterfaceC8018d f30192A;

    /* renamed from: B */
    private final InterfaceC8018d f30193B;

    /* renamed from: C */
    private final InterfaceC8018d f30194C;

    /* renamed from: D */
    private final CoordinatorLayout.AbstractC0226c<ExtendedFloatingActionButton> f30195D;

    /* renamed from: E */
    private boolean f30196E;

    /* renamed from: z */
    private final InterfaceC8018d f30197z;

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a */
    class C8007a extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f30203a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC8018d f30204b;

        /* renamed from: c */
        final /* synthetic */ AbstractC8010d f30205c;

        C8007a(InterfaceC8018d interfaceC8018d, AbstractC8010d abstractC8010d) {
            this.f30204b = interfaceC8018d;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f30203a = true;
            this.f30204b.m24571a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f30204b.m24575e();
            if (this.f30203a) {
                return;
            }
            this.f30204b.m24579i(this.f30205c);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f30204b.onAnimationStart(animator);
            this.f30203a = false;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b */
    static class C8008b extends Property<View, Float> {
        C8008b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f2) {
            view.getLayoutParams().width = f2.intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$c */
    static class C8009c extends Property<View, Float> {
        C8009c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f2) {
            view.getLayoutParams().height = f2.intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$d */
    public static abstract class AbstractC8010d {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public void m24450l(InterfaceC8018d interfaceC8018d, AbstractC8010d abstractC8010d) {
        if (interfaceC8018d.m24574d()) {
            return;
        }
        if (!m24451m()) {
            interfaceC8018d.m24572b();
            interfaceC8018d.m24579i(abstractC8010d);
            return;
        }
        measure(0, 0);
        AnimatorSet animatorSetM24577g = interfaceC8018d.m24577g();
        animatorSetM24577g.addListener(new C8007a(interfaceC8018d, abstractC8010d));
        Iterator<Animator.AnimatorListener> it = interfaceC8018d.m24578h().iterator();
        while (it.hasNext()) {
            animatorSetM24577g.addListener(it.next());
        }
        animatorSetM24577g.start();
    }

    /* renamed from: m */
    private boolean m24451m() {
        return C0311u.m2102O(this) && !isInEditMode();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0225b
    public CoordinatorLayout.AbstractC0226c<ExtendedFloatingActionButton> getBehavior() {
        return this.f30195D;
    }

    int getCollapsedSize() {
        return (Math.min(C0311u.m2090D(this), C0311u.m2088C(this)) * 2) + getIconSize();
    }

    public C8926h getExtendMotionSpec() {
        return this.f30192A.m24573c();
    }

    public C8926h getHideMotionSpec() {
        return this.f30194C.m24573c();
    }

    public C8926h getShowMotionSpec() {
        return this.f30193B.m24573c();
    }

    public C8926h getShrinkMotionSpec() {
        return this.f30197z.m24573c();
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f30196E && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.f30196E = false;
            this.f30197z.m24572b();
        }
    }

    public void setExtendMotionSpec(C8926h c8926h) {
        this.f30192A.m24576f(c8926h);
    }

    public void setExtendMotionSpecResource(int i2) {
        setExtendMotionSpec(C8926h.m28442c(getContext(), i2));
    }

    public void setExtended(boolean z) {
        if (this.f30196E == z) {
            return;
        }
        InterfaceC8018d interfaceC8018d = z ? this.f30192A : this.f30197z;
        if (interfaceC8018d.m24574d()) {
            return;
        }
        interfaceC8018d.m24572b();
    }

    public void setHideMotionSpec(C8926h c8926h) {
        this.f30194C.m24576f(c8926h);
    }

    public void setHideMotionSpecResource(int i2) {
        setHideMotionSpec(C8926h.m28442c(getContext(), i2));
    }

    public void setShowMotionSpec(C8926h c8926h) {
        this.f30193B.m24576f(c8926h);
    }

    public void setShowMotionSpecResource(int i2) {
        setShowMotionSpec(C8926h.m28442c(getContext(), i2));
    }

    public void setShrinkMotionSpec(C8926h c8926h) {
        this.f30197z.m24576f(c8926h);
    }

    public void setShrinkMotionSpecResource(int i2) {
        setShrinkMotionSpec(C8926h.m28442c(getContext(), i2));
    }

    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.AbstractC0226c<T> {

        /* renamed from: a */
        private Rect f30198a;

        /* renamed from: b */
        private AbstractC8010d f30199b;

        /* renamed from: c */
        private AbstractC8010d f30200c;

        /* renamed from: d */
        private boolean f30201d;

        /* renamed from: e */
        private boolean f30202e;

        public ExtendedFloatingActionButtonBehavior() {
            this.f30201d = false;
            this.f30202e = true;
        }

        /* renamed from: G */
        private static boolean m24452G(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0229f) {
                return ((CoordinatorLayout.C0229f) layoutParams).m1481f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: J */
        private boolean m24453J(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.f30201d || this.f30202e) && ((CoordinatorLayout.C0229f) extendedFloatingActionButton.getLayoutParams()).m1480e() == view.getId();
        }

        /* renamed from: L */
        private boolean m24454L(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m24453J(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f30198a == null) {
                this.f30198a = new Rect();
            }
            Rect rect = this.f30198a;
            C8024b.m24656a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                m24460K(extendedFloatingActionButton);
                return true;
            }
            m24456E(extendedFloatingActionButton);
            return true;
        }

        /* renamed from: M */
        private boolean m24455M(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m24453J(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0229f) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                m24460K(extendedFloatingActionButton);
                return true;
            }
            m24456E(extendedFloatingActionButton);
            return true;
        }

        /* renamed from: E */
        protected void m24456E(ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z = this.f30202e;
            extendedFloatingActionButton.m24450l(z ? extendedFloatingActionButton.f30192A : extendedFloatingActionButton.f30193B, z ? this.f30200c : this.f30199b);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public boolean mo1448b(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.mo1448b(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public boolean mo1454h(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m24454L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            }
            if (!m24452G(view)) {
                return false;
            }
            m24455M(view, extendedFloatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public boolean mo1458l(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i2) {
            List<View> listM1434r = coordinatorLayout.m1434r(extendedFloatingActionButton);
            int size = listM1434r.size();
            for (int i3 = 0; i3 < size; i3++) {
                View view = listM1434r.get(i3);
                if (!(view instanceof AppBarLayout)) {
                    if (m24452G(view) && m24455M(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (m24454L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.m1422I(extendedFloatingActionButton, i2);
            return true;
        }

        /* renamed from: K */
        protected void m24460K(ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z = this.f30202e;
            extendedFloatingActionButton.m24450l(z ? extendedFloatingActionButton.f30197z : extendedFloatingActionButton.f30194C, z ? this.f30200c : this.f30199b);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
        /* renamed from: g */
        public void mo1453g(CoordinatorLayout.C0229f c0229f) {
            if (c0229f.f2010h == 0) {
                c0229f.f2010h = 80;
            }
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8918l.f34037F1);
            this.f30201d = typedArrayObtainStyledAttributes.getBoolean(C8918l.f34044G1, false);
            this.f30202e = typedArrayObtainStyledAttributes.getBoolean(C8918l.f34051H1, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
