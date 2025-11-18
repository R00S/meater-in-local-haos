package com.google.android.material.tabs;

import C7.k;
import C7.l;
import C7.m;
import android.R;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.j;
import androidx.viewpager.widget.b;
import b8.C2272a;
import com.google.android.material.internal.r;
import com.google.android.material.internal.u;
import j.C3699a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import k1.C3784a;
import r1.C4340g;
import r1.C4341h;
import r1.InterfaceC4339f;
import s1.M;
import s1.X;
import t1.t;

@b.c
/* loaded from: classes2.dex */
public class TabLayout extends HorizontalScrollView {

    /* renamed from: B, reason: collision with root package name */
    int f37156B;

    /* renamed from: C, reason: collision with root package name */
    private final ArrayList<f> f37157C;

    /* renamed from: D, reason: collision with root package name */
    private f f37158D;

    /* renamed from: E, reason: collision with root package name */
    final e f37159E;

    /* renamed from: F, reason: collision with root package name */
    int f37160F;

    /* renamed from: G, reason: collision with root package name */
    int f37161G;

    /* renamed from: H, reason: collision with root package name */
    int f37162H;

    /* renamed from: I, reason: collision with root package name */
    int f37163I;

    /* renamed from: J, reason: collision with root package name */
    private final int f37164J;

    /* renamed from: K, reason: collision with root package name */
    private final int f37165K;

    /* renamed from: L, reason: collision with root package name */
    private int f37166L;

    /* renamed from: M, reason: collision with root package name */
    ColorStateList f37167M;

    /* renamed from: N, reason: collision with root package name */
    ColorStateList f37168N;

    /* renamed from: O, reason: collision with root package name */
    ColorStateList f37169O;

    /* renamed from: P, reason: collision with root package name */
    Drawable f37170P;

    /* renamed from: Q, reason: collision with root package name */
    private int f37171Q;

    /* renamed from: R, reason: collision with root package name */
    PorterDuff.Mode f37172R;

    /* renamed from: S, reason: collision with root package name */
    float f37173S;

    /* renamed from: T, reason: collision with root package name */
    float f37174T;

    /* renamed from: U, reason: collision with root package name */
    float f37175U;

    /* renamed from: V, reason: collision with root package name */
    final int f37176V;

    /* renamed from: W, reason: collision with root package name */
    int f37177W;

    /* renamed from: a0, reason: collision with root package name */
    private final int f37178a0;

    /* renamed from: b0, reason: collision with root package name */
    private final int f37179b0;

    /* renamed from: c0, reason: collision with root package name */
    private final int f37180c0;

    /* renamed from: d0, reason: collision with root package name */
    private int f37181d0;

    /* renamed from: e0, reason: collision with root package name */
    int f37182e0;

    /* renamed from: f0, reason: collision with root package name */
    int f37183f0;

    /* renamed from: g0, reason: collision with root package name */
    int f37184g0;

    /* renamed from: h0, reason: collision with root package name */
    int f37185h0;

    /* renamed from: i0, reason: collision with root package name */
    boolean f37186i0;

    /* renamed from: j0, reason: collision with root package name */
    boolean f37187j0;

    /* renamed from: k0, reason: collision with root package name */
    int f37188k0;

    /* renamed from: l0, reason: collision with root package name */
    int f37189l0;

    /* renamed from: m0, reason: collision with root package name */
    boolean f37190m0;

    /* renamed from: n0, reason: collision with root package name */
    private com.google.android.material.tabs.c f37191n0;

    /* renamed from: o0, reason: collision with root package name */
    private final TimeInterpolator f37192o0;

    /* renamed from: p0, reason: collision with root package name */
    private c f37193p0;

    /* renamed from: q0, reason: collision with root package name */
    private final ArrayList<c> f37194q0;

    /* renamed from: r0, reason: collision with root package name */
    private c f37195r0;

    /* renamed from: s0, reason: collision with root package name */
    private ValueAnimator f37196s0;

    /* renamed from: t0, reason: collision with root package name */
    androidx.viewpager.widget.b f37197t0;

    /* renamed from: u0, reason: collision with root package name */
    private g f37198u0;

    /* renamed from: v0, reason: collision with root package name */
    private b f37199v0;

    /* renamed from: w0, reason: collision with root package name */
    private boolean f37200w0;

    /* renamed from: x0, reason: collision with root package name */
    private int f37201x0;

    /* renamed from: y0, reason: collision with root package name */
    private final InterfaceC4339f<h> f37202y0;

    /* renamed from: z0, reason: collision with root package name */
    private static final int f37155z0 = l.f2575l;

    /* renamed from: A0, reason: collision with root package name */
    private static final InterfaceC4339f<f> f37154A0 = new C4341h(16);

    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    private class b implements b.f {

        /* renamed from: B, reason: collision with root package name */
        private boolean f37204B;

        b() {
        }

        @Override // androidx.viewpager.widget.b.f
        public void a(androidx.viewpager.widget.b bVar, androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f37197t0 == bVar) {
                tabLayout.O(aVar2, this.f37204B);
            }
        }

        void b(boolean z10) {
            this.f37204B = z10;
        }
    }

    @Deprecated
    public interface c<T extends f> {
        void a(T t10);

        void b(T t10);

        void c(T t10);
    }

    public interface d extends c<f> {
    }

    class e extends LinearLayout {

        /* renamed from: B, reason: collision with root package name */
        ValueAnimator f37206B;

        /* renamed from: C, reason: collision with root package name */
        private int f37207C;

        class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ View f37209a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f37210b;

            a(View view, View view2) {
                this.f37209a = view;
                this.f37210b = view2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                e.this.j(this.f37209a, this.f37210b, valueAnimator.getAnimatedFraction());
            }
        }

        e(Context context) {
            super(context);
            this.f37207C = -1;
            setWillNotDraw(false);
        }

        private void e() {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f37156B == -1) {
                tabLayout.f37156B = tabLayout.getSelectedTabPosition();
            }
            f(TabLayout.this.f37156B);
        }

        private void f(int i10) {
            if (TabLayout.this.f37201x0 == 0 || (TabLayout.this.getTabSelectedIndicator().getBounds().left == -1 && TabLayout.this.getTabSelectedIndicator().getBounds().right == -1)) {
                View childAt = getChildAt(i10);
                com.google.android.material.tabs.c cVar = TabLayout.this.f37191n0;
                TabLayout tabLayout = TabLayout.this;
                cVar.c(tabLayout, childAt, tabLayout.f37170P);
                TabLayout.this.f37156B = i10;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g() {
            f(TabLayout.this.getSelectedTabPosition());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j(View view, View view2, float f10) {
            if (view == null || view.getWidth() <= 0) {
                Drawable drawable = TabLayout.this.f37170P;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.f37170P.getBounds().bottom);
            } else {
                com.google.android.material.tabs.c cVar = TabLayout.this.f37191n0;
                TabLayout tabLayout = TabLayout.this;
                cVar.d(tabLayout, view, view2, f10, tabLayout.f37170P);
            }
            X.e0(this);
        }

        private void k(boolean z10, int i10, int i11) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f37156B == i10) {
                return;
            }
            View childAt = getChildAt(tabLayout.getSelectedTabPosition());
            View childAt2 = getChildAt(i10);
            if (childAt2 == null) {
                g();
                return;
            }
            TabLayout.this.f37156B = i10;
            a aVar = new a(childAt, childAt2);
            if (!z10) {
                this.f37206B.removeAllUpdateListeners();
                this.f37206B.addUpdateListener(aVar);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f37206B = valueAnimator;
            valueAnimator.setInterpolator(TabLayout.this.f37192o0);
            valueAnimator.setDuration(i11);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(aVar);
            valueAnimator.start();
        }

        void c(int i10, int i11) {
            ValueAnimator valueAnimator = this.f37206B;
            if (valueAnimator != null && valueAnimator.isRunning() && TabLayout.this.f37156B != i10) {
                this.f37206B.cancel();
            }
            k(true, i10, i11);
        }

        boolean d() {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (getChildAt(i10).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
            int height;
            int iHeight = TabLayout.this.f37170P.getBounds().height();
            if (iHeight < 0) {
                iHeight = TabLayout.this.f37170P.getIntrinsicHeight();
            }
            int i10 = TabLayout.this.f37184g0;
            if (i10 == 0) {
                height = getHeight() - iHeight;
                iHeight = getHeight();
            } else if (i10 != 1) {
                height = 0;
                if (i10 != 2) {
                    iHeight = i10 != 3 ? 0 : getHeight();
                }
            } else {
                height = (getHeight() - iHeight) / 2;
                iHeight = (getHeight() + iHeight) / 2;
            }
            if (TabLayout.this.f37170P.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.f37170P.getBounds();
                TabLayout.this.f37170P.setBounds(bounds.left, height, bounds.right, iHeight);
                TabLayout.this.f37170P.draw(canvas);
            }
            super.draw(canvas);
        }

        void h(int i10, float f10) {
            TabLayout.this.f37156B = Math.round(i10 + f10);
            ValueAnimator valueAnimator = this.f37206B;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f37206B.cancel();
            }
            j(getChildAt(i10), getChildAt(i10 + 1), f10);
        }

        void i(int i10) {
            Rect bounds = TabLayout.this.f37170P.getBounds();
            TabLayout.this.f37170P.setBounds(bounds.left, 0, bounds.right, i10);
            requestLayout();
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            ValueAnimator valueAnimator = this.f37206B;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                e();
            } else {
                k(false, TabLayout.this.getSelectedTabPosition(), -1);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (View.MeasureSpec.getMode(i10) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z10 = true;
            if (tabLayout.f37182e0 == 1 || tabLayout.f37185h0 == 2) {
                int childCount = getChildCount();
                int iMax = 0;
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = getChildAt(i12);
                    if (childAt.getVisibility() == 0) {
                        iMax = Math.max(iMax, childAt.getMeasuredWidth());
                    }
                }
                if (iMax <= 0) {
                    return;
                }
                if (iMax * childCount <= getMeasuredWidth() - (((int) u.c(getContext(), 16)) * 2)) {
                    boolean z11 = false;
                    for (int i13 = 0; i13 < childCount; i13++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i13).getLayoutParams();
                        if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                            layoutParams.width = iMax;
                            layoutParams.weight = 0.0f;
                            z11 = true;
                        }
                    }
                    z10 = z11;
                } else {
                    TabLayout tabLayout2 = TabLayout.this;
                    tabLayout2.f37182e0 = 0;
                    tabLayout2.W(false);
                }
                if (z10) {
                    super.onMeasure(i10, i11);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i10) {
            super.onRtlPropertiesChanged(i10);
        }
    }

    public static class f {

        /* renamed from: a, reason: collision with root package name */
        private Object f37212a;

        /* renamed from: b, reason: collision with root package name */
        private Drawable f37213b;

        /* renamed from: c, reason: collision with root package name */
        private CharSequence f37214c;

        /* renamed from: d, reason: collision with root package name */
        private CharSequence f37215d;

        /* renamed from: f, reason: collision with root package name */
        private View f37217f;

        /* renamed from: h, reason: collision with root package name */
        public TabLayout f37219h;

        /* renamed from: i, reason: collision with root package name */
        public h f37220i;

        /* renamed from: e, reason: collision with root package name */
        private int f37216e = -1;

        /* renamed from: g, reason: collision with root package name */
        private int f37218g = 1;

        /* renamed from: j, reason: collision with root package name */
        private int f37221j = -1;

        public View e() {
            return this.f37217f;
        }

        public Drawable f() {
            return this.f37213b;
        }

        public int g() {
            return this.f37216e;
        }

        public int h() {
            return this.f37218g;
        }

        public Object i() {
            return this.f37212a;
        }

        public CharSequence j() {
            return this.f37214c;
        }

        public boolean k() {
            TabLayout tabLayout = this.f37219h;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            int selectedTabPosition = tabLayout.getSelectedTabPosition();
            return selectedTabPosition != -1 && selectedTabPosition == this.f37216e;
        }

        void l() {
            this.f37219h = null;
            this.f37220i = null;
            this.f37212a = null;
            this.f37213b = null;
            this.f37221j = -1;
            this.f37214c = null;
            this.f37215d = null;
            this.f37216e = -1;
            this.f37217f = null;
        }

        public void m() {
            TabLayout tabLayout = this.f37219h;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.M(this);
        }

        public f n(CharSequence charSequence) {
            this.f37215d = charSequence;
            u();
            return this;
        }

        public f o(int i10) {
            return p(LayoutInflater.from(this.f37220i.getContext()).inflate(i10, (ViewGroup) this.f37220i, false));
        }

        public f p(View view) {
            this.f37217f = view;
            u();
            return this;
        }

        public f q(Drawable drawable) {
            this.f37213b = drawable;
            TabLayout tabLayout = this.f37219h;
            if (tabLayout.f37182e0 == 1 || tabLayout.f37185h0 == 2) {
                tabLayout.W(true);
            }
            u();
            if (E7.c.f4070a && this.f37220i.l() && this.f37220i.f37229F.isVisible()) {
                this.f37220i.invalidate();
            }
            return this;
        }

        void r(int i10) {
            this.f37216e = i10;
        }

        public f s(Object obj) {
            this.f37212a = obj;
            return this;
        }

        public f t(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f37215d) && !TextUtils.isEmpty(charSequence)) {
                this.f37220i.setContentDescription(charSequence);
            }
            this.f37214c = charSequence;
            u();
            return this;
        }

        void u() {
            h hVar = this.f37220i;
            if (hVar != null) {
                hVar.t();
            }
        }
    }

    public static class g implements b.g {

        /* renamed from: B, reason: collision with root package name */
        private final WeakReference<TabLayout> f37222B;

        /* renamed from: C, reason: collision with root package name */
        private int f37223C;

        /* renamed from: D, reason: collision with root package name */
        private int f37224D;

        public g(TabLayout tabLayout) {
            this.f37222B = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager.widget.b.g
        public void E(int i10) {
            this.f37223C = this.f37224D;
            this.f37224D = i10;
            TabLayout tabLayout = this.f37222B.get();
            if (tabLayout != null) {
                tabLayout.X(this.f37224D);
            }
        }

        @Override // androidx.viewpager.widget.b.g
        public void H(int i10) {
            TabLayout tabLayout = this.f37222B.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i10 || i10 >= tabLayout.getTabCount()) {
                return;
            }
            int i11 = this.f37224D;
            tabLayout.N(tabLayout.B(i10), i11 == 0 || (i11 == 2 && this.f37223C == 0));
        }

        void a() {
            this.f37224D = 0;
            this.f37223C = 0;
        }

        @Override // androidx.viewpager.widget.b.g
        public void f(int i10, float f10, int i11) {
            TabLayout tabLayout = this.f37222B.get();
            if (tabLayout != null) {
                int i12 = this.f37224D;
                tabLayout.R(i10, f10, i12 != 2 || this.f37223C == 1, (i12 == 2 && this.f37223C == 0) ? false : true, false);
            }
        }
    }

    public final class h extends LinearLayout {

        /* renamed from: B, reason: collision with root package name */
        private f f37225B;

        /* renamed from: C, reason: collision with root package name */
        private TextView f37226C;

        /* renamed from: D, reason: collision with root package name */
        private ImageView f37227D;

        /* renamed from: E, reason: collision with root package name */
        private View f37228E;

        /* renamed from: F, reason: collision with root package name */
        private E7.a f37229F;

        /* renamed from: G, reason: collision with root package name */
        private View f37230G;

        /* renamed from: H, reason: collision with root package name */
        private TextView f37231H;

        /* renamed from: I, reason: collision with root package name */
        private ImageView f37232I;

        /* renamed from: J, reason: collision with root package name */
        private Drawable f37233J;

        /* renamed from: K, reason: collision with root package name */
        private int f37234K;

        class a implements View.OnLayoutChangeListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ View f37236a;

            a(View view) {
                this.f37236a = view;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                if (this.f37236a.getVisibility() == 0) {
                    h.this.s(this.f37236a);
                }
            }
        }

        public h(Context context) {
            super(context);
            this.f37234K = 2;
            u(context);
            X.C0(this, TabLayout.this.f37160F, TabLayout.this.f37161G, TabLayout.this.f37162H, TabLayout.this.f37163I);
            setGravity(17);
            setOrientation(!TabLayout.this.f37186i0 ? 1 : 0);
            setClickable(true);
            X.D0(this, M.b(getContext(), 1002));
        }

        private void f(View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new a(view));
        }

        private float g(Layout layout, int i10, float f10) {
            return layout.getLineWidth(i10) * (f10 / layout.getPaint().getTextSize());
        }

        private E7.a getBadge() {
            return this.f37229F;
        }

        private E7.a getOrCreateBadge() {
            if (this.f37229F == null) {
                this.f37229F = E7.a.d(getContext());
            }
            r();
            E7.a aVar = this.f37229F;
            if (aVar != null) {
                return aVar;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        private void h(boolean z10) {
            setClipChildren(z10);
            setClipToPadding(z10);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z10);
                viewGroup.setClipToPadding(z10);
            }
        }

        private FrameLayout i() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j(Canvas canvas) {
            Drawable drawable = this.f37233J;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f37233J.draw(canvas);
            }
        }

        private FrameLayout k(View view) {
            if ((view == this.f37227D || view == this.f37226C) && E7.c.f4070a) {
                return (FrameLayout) view.getParent();
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean l() {
            return this.f37229F != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void m() {
            FrameLayout frameLayoutI;
            if (E7.c.f4070a) {
                frameLayoutI = i();
                addView(frameLayoutI, 0);
            } else {
                frameLayoutI = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(C7.i.f2507e, (ViewGroup) frameLayoutI, false);
            this.f37227D = imageView;
            frameLayoutI.addView(imageView, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void n() {
            FrameLayout frameLayoutI;
            if (E7.c.f4070a) {
                frameLayoutI = i();
                addView(frameLayoutI);
            } else {
                frameLayoutI = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(C7.i.f2508f, (ViewGroup) frameLayoutI, false);
            this.f37226C = textView;
            frameLayoutI.addView(textView);
        }

        private void p(View view) {
            if (l() && view != null) {
                h(false);
                E7.c.a(this.f37229F, view, k(view));
                this.f37228E = view;
            }
        }

        private void q() {
            if (l()) {
                h(true);
                View view = this.f37228E;
                if (view != null) {
                    E7.c.d(this.f37229F, view);
                    this.f37228E = null;
                }
            }
        }

        private void r() {
            f fVar;
            f fVar2;
            if (l()) {
                if (this.f37230G != null) {
                    q();
                    return;
                }
                if (this.f37227D != null && (fVar2 = this.f37225B) != null && fVar2.f() != null) {
                    View view = this.f37228E;
                    ImageView imageView = this.f37227D;
                    if (view == imageView) {
                        s(imageView);
                        return;
                    } else {
                        q();
                        p(this.f37227D);
                        return;
                    }
                }
                if (this.f37226C == null || (fVar = this.f37225B) == null || fVar.h() != 1) {
                    q();
                    return;
                }
                View view2 = this.f37228E;
                TextView textView = this.f37226C;
                if (view2 == textView) {
                    s(textView);
                } else {
                    q();
                    p(this.f37226C);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(View view) {
            if (l() && view == this.f37228E) {
                E7.c.e(this.f37229F, view, k(view));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [android.graphics.drawable.RippleDrawable] */
        public void u(Context context) {
            int i10 = TabLayout.this.f37176V;
            if (i10 != 0) {
                Drawable drawableB = C3699a.b(context, i10);
                this.f37233J = drawableB;
                if (drawableB != null && drawableB.isStateful()) {
                    this.f37233J.setState(getDrawableState());
                }
            } else {
                this.f37233J = null;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            if (TabLayout.this.f37169O != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(1.0E-5f);
                gradientDrawable2.setColor(-1);
                ColorStateList colorStateListA = V7.b.a(TabLayout.this.f37169O);
                boolean z10 = TabLayout.this.f37190m0;
                if (z10) {
                    gradientDrawable = null;
                }
                gradientDrawable = new RippleDrawable(colorStateListA, gradientDrawable, z10 ? null : gradientDrawable2);
            }
            X.r0(this, gradientDrawable);
            TabLayout.this.invalidate();
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void x(android.widget.TextView r8, android.widget.ImageView r9, boolean r10) {
            /*
                r7 = this;
                com.google.android.material.tabs.TabLayout$f r0 = r7.f37225B
                r1 = 0
                if (r0 == 0) goto L1a
                android.graphics.drawable.Drawable r0 = r0.f()
                if (r0 == 0) goto L1a
                com.google.android.material.tabs.TabLayout$f r0 = r7.f37225B
                android.graphics.drawable.Drawable r0 = r0.f()
                android.graphics.drawable.Drawable r0 = k1.C3784a.r(r0)
                android.graphics.drawable.Drawable r0 = r0.mutate()
                goto L1b
            L1a:
                r0 = r1
            L1b:
                if (r0 == 0) goto L2d
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r2 = r2.f37168N
                k1.C3784a.o(r0, r2)
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                android.graphics.PorterDuff$Mode r2 = r2.f37172R
                if (r2 == 0) goto L2d
                k1.C3784a.p(r0, r2)
            L2d:
                com.google.android.material.tabs.TabLayout$f r2 = r7.f37225B
                if (r2 == 0) goto L36
                java.lang.CharSequence r2 = r2.j()
                goto L37
            L36:
                r2 = r1
            L37:
                r3 = 8
                r4 = 0
                if (r9 == 0) goto L4e
                if (r0 == 0) goto L48
                r9.setImageDrawable(r0)
                r9.setVisibility(r4)
                r7.setVisibility(r4)
                goto L4e
            L48:
                r9.setVisibility(r3)
                r9.setImageDrawable(r1)
            L4e:
                boolean r0 = android.text.TextUtils.isEmpty(r2)
                if (r8 == 0) goto L77
                if (r0 != 0) goto L60
                com.google.android.material.tabs.TabLayout$f r5 = r7.f37225B
                int r5 = com.google.android.material.tabs.TabLayout.f.b(r5)
                r6 = 1
                if (r5 != r6) goto L60
                goto L61
            L60:
                r6 = r4
            L61:
                if (r0 != 0) goto L65
                r5 = r2
                goto L66
            L65:
                r5 = r1
            L66:
                r8.setText(r5)
                if (r6 == 0) goto L6d
                r5 = r4
                goto L6e
            L6d:
                r5 = r3
            L6e:
                r8.setVisibility(r5)
                if (r0 != 0) goto L78
                r7.setVisibility(r4)
                goto L78
            L77:
                r6 = r4
            L78:
                if (r10 == 0) goto Lbc
                if (r9 == 0) goto Lbc
                android.view.ViewGroup$LayoutParams r8 = r9.getLayoutParams()
                android.view.ViewGroup$MarginLayoutParams r8 = (android.view.ViewGroup.MarginLayoutParams) r8
                if (r6 == 0) goto L94
                int r10 = r9.getVisibility()
                if (r10 != 0) goto L94
                android.content.Context r10 = r7.getContext()
                float r10 = com.google.android.material.internal.u.c(r10, r3)
                int r10 = (int) r10
                goto L95
            L94:
                r10 = r4
            L95:
                com.google.android.material.tabs.TabLayout r3 = com.google.android.material.tabs.TabLayout.this
                boolean r3 = r3.f37186i0
                if (r3 == 0) goto Lad
                int r3 = s1.C4462v.a(r8)
                if (r10 == r3) goto Lbc
                s1.C4462v.c(r8, r10)
                r8.bottomMargin = r4
                r9.setLayoutParams(r8)
                r9.requestLayout()
                goto Lbc
            Lad:
                int r3 = r8.bottomMargin
                if (r10 == r3) goto Lbc
                r8.bottomMargin = r10
                s1.C4462v.c(r8, r4)
                r9.setLayoutParams(r8)
                r9.requestLayout()
            Lbc:
                com.google.android.material.tabs.TabLayout$f r8 = r7.f37225B
                if (r8 == 0) goto Lc4
                java.lang.CharSequence r1 = com.google.android.material.tabs.TabLayout.f.c(r8)
            Lc4:
                if (r0 != 0) goto Lc7
                goto Lc8
            Lc7:
                r2 = r1
            Lc8:
                androidx.appcompat.widget.f0.a(r7, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.h.x(android.widget.TextView, android.widget.ImageView, boolean):void");
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f37233J;
            if ((drawable == null || !drawable.isStateful()) ? false : this.f37233J.setState(drawableState)) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        int getContentHeight() {
            View[] viewArr = {this.f37226C, this.f37227D, this.f37230G};
            int iMax = 0;
            int iMin = 0;
            boolean z10 = false;
            for (int i10 = 0; i10 < 3; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z10 ? Math.min(iMin, view.getTop()) : view.getTop();
                    iMax = z10 ? Math.max(iMax, view.getBottom()) : view.getBottom();
                    z10 = true;
                }
            }
            return iMax - iMin;
        }

        int getContentWidth() {
            View[] viewArr = {this.f37226C, this.f37227D, this.f37230G};
            int iMax = 0;
            int iMin = 0;
            boolean z10 = false;
            for (int i10 = 0; i10 < 3; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z10 ? Math.min(iMin, view.getLeft()) : view.getLeft();
                    iMax = z10 ? Math.max(iMax, view.getRight()) : view.getRight();
                    z10 = true;
                }
            }
            return iMax - iMin;
        }

        public f getTab() {
            return this.f37225B;
        }

        void o() {
            setTab(null);
            setSelected(false);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            t tVarY0 = t.Y0(accessibilityNodeInfo);
            E7.a aVar = this.f37229F;
            if (aVar != null && aVar.isVisible()) {
                tVarY0.l0(this.f37229F.i());
            }
            tVarY0.k0(t.f.a(0, 1, this.f37225B.g(), 1, false, isSelected()));
            if (isSelected()) {
                tVarY0.i0(false);
                tVarY0.Z(t.a.f49782i);
            }
            tVarY0.I0(getResources().getString(k.f2539h));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i10 = View.MeasureSpec.makeMeasureSpec(TabLayout.this.f37177W, Integer.MIN_VALUE);
            }
            super.onMeasure(i10, i11);
            if (this.f37226C != null) {
                float f10 = TabLayout.this.f37173S;
                int i12 = this.f37234K;
                ImageView imageView = this.f37227D;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f37226C;
                    if (textView != null && textView.getLineCount() > 1) {
                        f10 = TabLayout.this.f37175U;
                    }
                } else {
                    i12 = 1;
                }
                float textSize = this.f37226C.getTextSize();
                int lineCount = this.f37226C.getLineCount();
                int iD = j.d(this.f37226C);
                if (f10 != textSize || (iD >= 0 && i12 != iD)) {
                    if (TabLayout.this.f37185h0 != 1 || f10 <= textSize || lineCount != 1 || ((layout = this.f37226C.getLayout()) != null && g(layout, 0, f10) <= (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        this.f37226C.setTextSize(0, f10);
                        this.f37226C.setMaxLines(i12);
                        super.onMeasure(i10, i11);
                    }
                }
            }
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean zPerformClick = super.performClick();
            if (this.f37225B == null) {
                return zPerformClick;
            }
            if (!zPerformClick) {
                playSoundEffect(0);
            }
            this.f37225B.m();
            return true;
        }

        @Override // android.view.View
        public void setSelected(boolean z10) {
            isSelected();
            super.setSelected(z10);
            TextView textView = this.f37226C;
            if (textView != null) {
                textView.setSelected(z10);
            }
            ImageView imageView = this.f37227D;
            if (imageView != null) {
                imageView.setSelected(z10);
            }
            View view = this.f37230G;
            if (view != null) {
                view.setSelected(z10);
            }
        }

        void setTab(f fVar) {
            if (fVar != this.f37225B) {
                this.f37225B = fVar;
                t();
            }
        }

        final void t() {
            w();
            f fVar = this.f37225B;
            setSelected(fVar != null && fVar.k());
        }

        final void v() {
            setOrientation(!TabLayout.this.f37186i0 ? 1 : 0);
            TextView textView = this.f37231H;
            if (textView == null && this.f37232I == null) {
                x(this.f37226C, this.f37227D, true);
            } else {
                x(textView, this.f37232I, false);
            }
        }

        final void w() {
            ViewParent parent;
            f fVar = this.f37225B;
            View viewE = fVar != null ? fVar.e() : null;
            if (viewE != null) {
                ViewParent parent2 = viewE.getParent();
                if (parent2 != this) {
                    if (parent2 != null) {
                        ((ViewGroup) parent2).removeView(viewE);
                    }
                    View view = this.f37230G;
                    if (view != null && (parent = view.getParent()) != null) {
                        ((ViewGroup) parent).removeView(this.f37230G);
                    }
                    addView(viewE);
                }
                this.f37230G = viewE;
                TextView textView = this.f37226C;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f37227D;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f37227D.setImageDrawable(null);
                }
                TextView textView2 = (TextView) viewE.findViewById(R.id.text1);
                this.f37231H = textView2;
                if (textView2 != null) {
                    this.f37234K = j.d(textView2);
                }
                this.f37232I = (ImageView) viewE.findViewById(R.id.icon);
            } else {
                View view2 = this.f37230G;
                if (view2 != null) {
                    removeView(view2);
                    this.f37230G = null;
                }
                this.f37231H = null;
                this.f37232I = null;
            }
            if (this.f37230G == null) {
                if (this.f37227D == null) {
                    m();
                }
                if (this.f37226C == null) {
                    n();
                    this.f37234K = j.d(this.f37226C);
                }
                j.q(this.f37226C, TabLayout.this.f37164J);
                if (!isSelected() || TabLayout.this.f37166L == -1) {
                    j.q(this.f37226C, TabLayout.this.f37165K);
                } else {
                    j.q(this.f37226C, TabLayout.this.f37166L);
                }
                ColorStateList colorStateList = TabLayout.this.f37167M;
                if (colorStateList != null) {
                    this.f37226C.setTextColor(colorStateList);
                }
                x(this.f37226C, this.f37227D, true);
                r();
                f(this.f37227D);
                f(this.f37226C);
            } else {
                TextView textView3 = this.f37231H;
                if (textView3 != null || this.f37232I != null) {
                    x(textView3, this.f37232I, false);
                }
            }
            if (fVar == null || TextUtils.isEmpty(fVar.f37215d)) {
                return;
            }
            setContentDescription(fVar.f37215d);
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7.c.f2316g0);
    }

    private void A() {
        if (this.f37196s0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f37196s0 = valueAnimator;
            valueAnimator.setInterpolator(this.f37192o0);
            this.f37196s0.setDuration(this.f37183f0);
            this.f37196s0.addUpdateListener(new a());
        }
    }

    private boolean C() {
        return getTabMode() == 0 || getTabMode() == 2;
    }

    private void L(int i10) {
        h hVar = (h) this.f37159E.getChildAt(i10);
        this.f37159E.removeViewAt(i10);
        if (hVar != null) {
            hVar.o();
            this.f37202y0.a(hVar);
        }
        requestLayout();
    }

    private void T(androidx.viewpager.widget.b bVar, boolean z10, boolean z11) {
        androidx.viewpager.widget.b bVar2 = this.f37197t0;
        if (bVar2 != null) {
            g gVar = this.f37198u0;
            if (gVar != null) {
                bVar2.B(gVar);
            }
            b bVar3 = this.f37199v0;
            if (bVar3 != null) {
                this.f37197t0.A(bVar3);
            }
        }
        c cVar = this.f37195r0;
        if (cVar != null) {
            I(cVar);
            this.f37195r0 = null;
        }
        if (bVar != null) {
            this.f37197t0 = bVar;
            if (this.f37198u0 == null) {
                this.f37198u0 = new g(this);
            }
            this.f37198u0.a();
            bVar.b(this.f37198u0);
            i iVar = new i(bVar);
            this.f37195r0 = iVar;
            g(iVar);
            bVar.getAdapter();
            if (this.f37199v0 == null) {
                this.f37199v0 = new b();
            }
            this.f37199v0.b(z10);
            bVar.a(this.f37199v0);
            P(bVar.getCurrentItem(), 0.0f, true);
        } else {
            this.f37197t0 = null;
            O(null, false);
        }
        this.f37200w0 = z11;
    }

    private void U() {
        int size = this.f37157C.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f37157C.get(i10).u();
        }
    }

    private void V(LinearLayout.LayoutParams layoutParams) {
        if (this.f37185h0 == 1 && this.f37182e0 == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
    }

    private int getDefaultHeight() {
        int size = this.f37157C.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            f fVar = this.f37157C.get(i10);
            if (fVar == null || fVar.f() == null || TextUtils.isEmpty(fVar.j())) {
                i10++;
            } else if (!this.f37186i0) {
                return 72;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i10 = this.f37178a0;
        if (i10 != -1) {
            return i10;
        }
        int i11 = this.f37185h0;
        if (i11 == 0 || i11 == 2) {
            return this.f37180c0;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f37159E.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void l(TabItem tabItem) {
        f fVarE = E();
        CharSequence charSequence = tabItem.f37151B;
        if (charSequence != null) {
            fVarE.t(charSequence);
        }
        Drawable drawable = tabItem.f37152C;
        if (drawable != null) {
            fVarE.q(drawable);
        }
        int i10 = tabItem.f37153D;
        if (i10 != 0) {
            fVarE.o(i10);
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            fVarE.n(tabItem.getContentDescription());
        }
        i(fVarE);
    }

    private void m(f fVar) {
        h hVar = fVar.f37220i;
        hVar.setSelected(false);
        hVar.setActivated(false);
        this.f37159E.addView(hVar, fVar.g(), u());
    }

    private void n(View view) {
        if (!(view instanceof TabItem)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        l((TabItem) view);
    }

    private void o(int i10) {
        if (i10 == -1) {
            return;
        }
        if (getWindowToken() == null || !X.R(this) || this.f37159E.d()) {
            P(i10, 0.0f, true);
            return;
        }
        int scrollX = getScrollX();
        int iR = r(i10, 0.0f);
        if (scrollX != iR) {
            A();
            this.f37196s0.setIntValues(scrollX, iR);
            this.f37196s0.start();
        }
        this.f37159E.c(i10, this.f37183f0);
    }

    private void p(int i10) {
        if (i10 == 0) {
            Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
        } else if (i10 == 1) {
            this.f37159E.setGravity(1);
            return;
        } else if (i10 != 2) {
            return;
        }
        this.f37159E.setGravity(8388611);
    }

    private void q() {
        int i10 = this.f37185h0;
        X.C0(this.f37159E, (i10 == 0 || i10 == 2) ? Math.max(0, this.f37181d0 - this.f37160F) : 0, 0, 0, 0);
        int i11 = this.f37185h0;
        if (i11 == 0) {
            p(this.f37182e0);
        } else if (i11 == 1 || i11 == 2) {
            if (this.f37182e0 == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            this.f37159E.setGravity(1);
        }
        W(true);
    }

    private int r(int i10, float f10) {
        View childAt;
        int i11 = this.f37185h0;
        if ((i11 != 0 && i11 != 2) || (childAt = this.f37159E.getChildAt(i10)) == null) {
            return 0;
        }
        int i12 = i10 + 1;
        View childAt2 = i12 < this.f37159E.getChildCount() ? this.f37159E.getChildAt(i12) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i13 = (int) ((width + width2) * 0.5f * f10);
        return X.z(this) == 0 ? left + i13 : left - i13;
    }

    private void s(f fVar, int i10) {
        fVar.r(i10);
        this.f37157C.add(i10, fVar);
        int size = this.f37157C.size();
        int i11 = -1;
        for (int i12 = i10 + 1; i12 < size; i12++) {
            if (this.f37157C.get(i12).g() == this.f37156B) {
                i11 = i12;
            }
            this.f37157C.get(i12).r(i12);
        }
        this.f37156B = i11;
    }

    private void setSelectedTabView(int i10) {
        int childCount = this.f37159E.getChildCount();
        if (i10 < childCount) {
            int i11 = 0;
            while (i11 < childCount) {
                View childAt = this.f37159E.getChildAt(i11);
                if ((i11 != i10 || childAt.isSelected()) && (i11 == i10 || !childAt.isSelected())) {
                    childAt.setSelected(i11 == i10);
                    childAt.setActivated(i11 == i10);
                } else {
                    childAt.setSelected(i11 == i10);
                    childAt.setActivated(i11 == i10);
                    if (childAt instanceof h) {
                        ((h) childAt).w();
                    }
                }
                i11++;
            }
        }
    }

    private static ColorStateList t(int i10, int i11) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i11, i10});
    }

    private LinearLayout.LayoutParams u() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        V(layoutParams);
        return layoutParams;
    }

    private h w(f fVar) {
        InterfaceC4339f<h> interfaceC4339f = this.f37202y0;
        h hVarB = interfaceC4339f != null ? interfaceC4339f.b() : null;
        if (hVarB == null) {
            hVarB = new h(getContext());
        }
        hVarB.setTab(fVar);
        hVarB.setFocusable(true);
        hVarB.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(fVar.f37215d)) {
            hVarB.setContentDescription(fVar.f37214c);
        } else {
            hVarB.setContentDescription(fVar.f37215d);
        }
        return hVarB;
    }

    private void x(f fVar) {
        for (int size = this.f37194q0.size() - 1; size >= 0; size--) {
            this.f37194q0.get(size).a(fVar);
        }
    }

    private void y(f fVar) {
        for (int size = this.f37194q0.size() - 1; size >= 0; size--) {
            this.f37194q0.get(size).b(fVar);
        }
    }

    private void z(f fVar) {
        for (int size = this.f37194q0.size() - 1; size >= 0; size--) {
            this.f37194q0.get(size).c(fVar);
        }
    }

    public f B(int i10) {
        if (i10 < 0 || i10 >= getTabCount()) {
            return null;
        }
        return this.f37157C.get(i10);
    }

    public boolean D() {
        return this.f37187j0;
    }

    public f E() {
        f fVarV = v();
        fVarV.f37219h = this;
        fVarV.f37220i = w(fVarV);
        if (fVarV.f37221j != -1) {
            fVarV.f37220i.setId(fVarV.f37221j);
        }
        return fVarV;
    }

    void F() {
        H();
    }

    protected boolean G(f fVar) {
        return f37154A0.a(fVar);
    }

    public void H() {
        for (int childCount = this.f37159E.getChildCount() - 1; childCount >= 0; childCount--) {
            L(childCount);
        }
        Iterator<f> it = this.f37157C.iterator();
        while (it.hasNext()) {
            f next = it.next();
            it.remove();
            next.l();
            G(next);
        }
        this.f37158D = null;
    }

    @Deprecated
    public void I(c cVar) {
        this.f37194q0.remove(cVar);
    }

    public void J(d dVar) {
        I(dVar);
    }

    public void K(int i10) {
        f fVar = this.f37158D;
        int iG = fVar != null ? fVar.g() : 0;
        L(i10);
        f fVarRemove = this.f37157C.remove(i10);
        if (fVarRemove != null) {
            fVarRemove.l();
            G(fVarRemove);
        }
        int size = this.f37157C.size();
        int i11 = -1;
        for (int i12 = i10; i12 < size; i12++) {
            if (this.f37157C.get(i12).g() == this.f37156B) {
                i11 = i12;
            }
            this.f37157C.get(i12).r(i12);
        }
        this.f37156B = i11;
        if (iG == i10) {
            M(this.f37157C.isEmpty() ? null : this.f37157C.get(Math.max(0, i10 - 1)));
        }
    }

    public void M(f fVar) {
        N(fVar, true);
    }

    public void N(f fVar, boolean z10) {
        f fVar2 = this.f37158D;
        if (fVar2 == fVar) {
            if (fVar2 != null) {
                x(fVar);
                o(fVar.g());
                return;
            }
            return;
        }
        int iG = fVar != null ? fVar.g() : -1;
        if (z10) {
            if ((fVar2 == null || fVar2.g() == -1) && iG != -1) {
                P(iG, 0.0f, true);
            } else {
                o(iG);
            }
            if (iG != -1) {
                setSelectedTabView(iG);
            }
        }
        this.f37158D = fVar;
        if (fVar2 != null && fVar2.f37219h != null) {
            z(fVar2);
        }
        if (fVar != null) {
            y(fVar);
        }
    }

    void O(androidx.viewpager.widget.a aVar, boolean z10) {
        F();
    }

    public void P(int i10, float f10, boolean z10) {
        Q(i10, f10, z10, true);
    }

    public void Q(int i10, float f10, boolean z10, boolean z11) {
        R(i10, f10, z10, z11, true);
    }

    void R(int i10, float f10, boolean z10, boolean z11, boolean z12) {
        int iRound = Math.round(i10 + f10);
        if (iRound < 0 || iRound >= this.f37159E.getChildCount()) {
            return;
        }
        if (z11) {
            this.f37159E.h(i10, f10);
        }
        ValueAnimator valueAnimator = this.f37196s0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f37196s0.cancel();
        }
        int iR = r(i10, f10);
        int scrollX = getScrollX();
        boolean z13 = (i10 < getSelectedTabPosition() && iR >= scrollX) || (i10 > getSelectedTabPosition() && iR <= scrollX) || i10 == getSelectedTabPosition();
        if (X.z(this) == 1) {
            z13 = (i10 < getSelectedTabPosition() && iR <= scrollX) || (i10 > getSelectedTabPosition() && iR >= scrollX) || i10 == getSelectedTabPosition();
        }
        if (z13 || this.f37201x0 == 1 || z12) {
            if (i10 < 0) {
                iR = 0;
            }
            scrollTo(iR, 0);
        }
        if (z10) {
            setSelectedTabView(iRound);
        }
    }

    public void S(androidx.viewpager.widget.b bVar, boolean z10) {
        T(bVar, z10, false);
    }

    void W(boolean z10) {
        for (int i10 = 0; i10 < this.f37159E.getChildCount(); i10++) {
            View childAt = this.f37159E.getChildAt(i10);
            childAt.setMinimumWidth(getTabMinWidth());
            V((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z10) {
                childAt.requestLayout();
            }
        }
    }

    void X(int i10) {
        this.f37201x0 = i10;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        n(view);
    }

    @Deprecated
    public void g(c cVar) {
        if (this.f37194q0.contains(cVar)) {
            return;
        }
        this.f37194q0.add(cVar);
    }

    public int getSelectedTabPosition() {
        f fVar = this.f37158D;
        if (fVar != null) {
            return fVar.g();
        }
        return -1;
    }

    public int getTabCount() {
        return this.f37157C.size();
    }

    public int getTabGravity() {
        return this.f37182e0;
    }

    public ColorStateList getTabIconTint() {
        return this.f37168N;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f37189l0;
    }

    public int getTabIndicatorGravity() {
        return this.f37184g0;
    }

    int getTabMaxWidth() {
        return this.f37177W;
    }

    public int getTabMode() {
        return this.f37185h0;
    }

    public ColorStateList getTabRippleColor() {
        return this.f37169O;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f37170P;
    }

    public ColorStateList getTabTextColors() {
        return this.f37167M;
    }

    public void h(d dVar) {
        g(dVar);
    }

    public void i(f fVar) {
        k(fVar, this.f37157C.isEmpty());
    }

    public void j(f fVar, int i10, boolean z10) {
        if (fVar.f37219h != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        s(fVar, i10);
        m(fVar);
        if (z10) {
            fVar.m();
        }
    }

    public void k(f fVar, boolean z10) {
        j(fVar, this.f37157C.size(), z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        X7.h.e(this);
        if (this.f37197t0 == null) {
            ViewParent parent = getParent();
            if (parent instanceof androidx.viewpager.widget.b) {
                T((androidx.viewpager.widget.b) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f37200w0) {
            setupWithViewPager(null);
            this.f37200w0 = false;
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        for (int i10 = 0; i10 < this.f37159E.getChildCount(); i10++) {
            View childAt = this.f37159E.getChildAt(i10);
            if (childAt instanceof h) {
                ((h) childAt).j(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        t.Y0(accessibilityNodeInfo).j0(t.e.a(1, getTabCount(), false, 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return C() && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = com.google.android.material.internal.u.c(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 0
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 1
            if (r1 == r2) goto L2e
            if (r1 == 0) goto L1f
            goto L41
        L1f:
            int r8 = r6.getPaddingTop()
            int r0 = r0 + r8
            int r8 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            goto L41
        L2e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L41
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L41
            android.view.View r1 = r6.getChildAt(r3)
            r1.setMinimumHeight(r0)
        L41:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L5f
            int r1 = r6.f37179b0
            if (r1 <= 0) goto L50
            goto L5d
        L50:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = com.google.android.material.internal.u.c(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L5d:
            r6.f37177W = r1
        L5f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto La9
            android.view.View r7 = r6.getChildAt(r3)
            int r0 = r6.f37185h0
            if (r0 == 0) goto L81
            if (r0 == r5) goto L76
            r1 = 2
            if (r0 == r1) goto L81
            goto La9
        L76:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto La9
            goto L8b
        L81:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto La9
        L8b:
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r0 = r0 + r1
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            int r1 = r1.height
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r8, r0, r1)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            r7.measure(r0, r8)
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || C()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        X7.h.d(this, f10);
    }

    public void setInlineLabel(boolean z10) {
        if (this.f37186i0 != z10) {
            this.f37186i0 = z10;
            for (int i10 = 0; i10 < this.f37159E.getChildCount(); i10++) {
                View childAt = this.f37159E.getChildAt(i10);
                if (childAt instanceof h) {
                    ((h) childAt).v();
                }
            }
            q();
        }
    }

    public void setInlineLabelResource(int i10) {
        setInlineLabel(getResources().getBoolean(i10));
    }

    @Deprecated
    public void setOnTabSelectedListener(d dVar) {
        setOnTabSelectedListener((c) dVar);
    }

    void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        A();
        this.f37196s0.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable drawableMutate = C3784a.r(drawable).mutate();
        this.f37170P = drawableMutate;
        com.google.android.material.drawable.d.k(drawableMutate, this.f37171Q);
        int intrinsicHeight = this.f37188k0;
        if (intrinsicHeight == -1) {
            intrinsicHeight = this.f37170P.getIntrinsicHeight();
        }
        this.f37159E.i(intrinsicHeight);
    }

    public void setSelectedTabIndicatorColor(int i10) {
        this.f37171Q = i10;
        com.google.android.material.drawable.d.k(this.f37170P, i10);
        W(false);
    }

    public void setSelectedTabIndicatorGravity(int i10) {
        if (this.f37184g0 != i10) {
            this.f37184g0 = i10;
            X.e0(this.f37159E);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i10) {
        this.f37188k0 = i10;
        this.f37159E.i(i10);
    }

    public void setTabGravity(int i10) {
        if (this.f37182e0 != i10) {
            this.f37182e0 = i10;
            q();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f37168N != colorStateList) {
            this.f37168N = colorStateList;
            U();
        }
    }

    public void setTabIconTintResource(int i10) {
        setTabIconTint(C3699a.a(getContext(), i10));
    }

    public void setTabIndicatorAnimationMode(int i10) {
        this.f37189l0 = i10;
        if (i10 == 0) {
            this.f37191n0 = new com.google.android.material.tabs.c();
            return;
        }
        if (i10 == 1) {
            this.f37191n0 = new com.google.android.material.tabs.a();
        } else {
            if (i10 == 2) {
                this.f37191n0 = new com.google.android.material.tabs.b();
                return;
            }
            throw new IllegalArgumentException(i10 + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z10) {
        this.f37187j0 = z10;
        this.f37159E.g();
        X.e0(this.f37159E);
    }

    public void setTabMode(int i10) {
        if (i10 != this.f37185h0) {
            this.f37185h0 = i10;
            q();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f37169O != colorStateList) {
            this.f37169O = colorStateList;
            for (int i10 = 0; i10 < this.f37159E.getChildCount(); i10++) {
                View childAt = this.f37159E.getChildAt(i10);
                if (childAt instanceof h) {
                    ((h) childAt).u(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i10) {
        setTabRippleColor(C3699a.a(getContext(), i10));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f37167M != colorStateList) {
            this.f37167M = colorStateList;
            U();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(androidx.viewpager.widget.a aVar) {
        O(aVar, false);
    }

    public void setUnboundedRipple(boolean z10) {
        if (this.f37190m0 != z10) {
            this.f37190m0 = z10;
            for (int i10 = 0; i10 < this.f37159E.getChildCount(); i10++) {
                View childAt = this.f37159E.getChildAt(i10);
                if (childAt instanceof h) {
                    ((h) childAt).u(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i10) {
        setUnboundedRipple(getResources().getBoolean(i10));
    }

    public void setupWithViewPager(androidx.viewpager.widget.b bVar) {
        S(bVar, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    protected f v() {
        f fVarB = f37154A0.b();
        return fVarB == null ? new f() : fVarB;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TabLayout(Context context, AttributeSet attributeSet, int i10) throws Resources.NotFoundException {
        int i11 = f37155z0;
        super(C2272a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f37156B = -1;
        this.f37157C = new ArrayList<>();
        this.f37166L = -1;
        this.f37171Q = 0;
        this.f37177W = Integer.MAX_VALUE;
        this.f37188k0 = -1;
        this.f37194q0 = new ArrayList<>();
        this.f37202y0 = new C4340g(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        e eVar = new e(context2);
        this.f37159E = eVar;
        super.addView(eVar, 0, new FrameLayout.LayoutParams(-2, -1));
        int[] iArr = m.f2807V6;
        int i12 = m.f3078u7;
        TypedArray typedArrayI = r.i(context2, attributeSet, iArr, i10, i11, i12);
        ColorStateList colorStateListF = com.google.android.material.drawable.d.f(getBackground());
        if (colorStateListF != null) {
            X7.g gVar = new X7.g();
            gVar.b0(colorStateListF);
            gVar.Q(context2);
            gVar.a0(X.u(this));
            X.r0(this, gVar);
        }
        setSelectedTabIndicator(U7.c.e(context2, typedArrayI, m.f2869b7));
        setSelectedTabIndicatorColor(typedArrayI.getColor(m.f2902e7, 0));
        eVar.i(typedArrayI.getDimensionPixelSize(m.f2935h7, -1));
        setSelectedTabIndicatorGravity(typedArrayI.getInt(m.f2924g7, 0));
        setTabIndicatorAnimationMode(typedArrayI.getInt(m.f2891d7, 0));
        setTabIndicatorFullWidth(typedArrayI.getBoolean(m.f2913f7, true));
        int dimensionPixelSize = typedArrayI.getDimensionPixelSize(m.f2990m7, 0);
        this.f37163I = dimensionPixelSize;
        this.f37162H = dimensionPixelSize;
        this.f37161G = dimensionPixelSize;
        this.f37160F = dimensionPixelSize;
        this.f37160F = typedArrayI.getDimensionPixelSize(m.f3023p7, dimensionPixelSize);
        this.f37161G = typedArrayI.getDimensionPixelSize(m.f3034q7, this.f37161G);
        this.f37162H = typedArrayI.getDimensionPixelSize(m.f3012o7, this.f37162H);
        this.f37163I = typedArrayI.getDimensionPixelSize(m.f3001n7, this.f37163I);
        if (r.g(context2)) {
            this.f37164J = C7.c.f2322j0;
        } else {
            this.f37164J = C7.c.f2318h0;
        }
        int resourceId = typedArrayI.getResourceId(i12, l.f2567d);
        this.f37165K = resourceId;
        int[] iArr2 = i.j.f42655S2;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, iArr2);
        try {
            int i13 = i.j.f42659T2;
            this.f37173S = typedArrayObtainStyledAttributes.getDimensionPixelSize(i13, 0);
            int i14 = i.j.f42671W2;
            this.f37167M = U7.c.a(context2, typedArrayObtainStyledAttributes, i14);
            typedArrayObtainStyledAttributes.recycle();
            int i15 = m.f3056s7;
            if (typedArrayI.hasValue(i15)) {
                this.f37166L = typedArrayI.getResourceId(i15, resourceId);
            }
            int i16 = this.f37166L;
            if (i16 != -1) {
                typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(i16, iArr2);
                try {
                    this.f37174T = typedArrayObtainStyledAttributes.getDimensionPixelSize(i13, (int) this.f37173S);
                    ColorStateList colorStateListA = U7.c.a(context2, typedArrayObtainStyledAttributes, i14);
                    if (colorStateListA != null) {
                        this.f37167M = t(this.f37167M.getDefaultColor(), colorStateListA.getColorForState(new int[]{R.attr.state_selected}, colorStateListA.getDefaultColor()));
                    }
                } finally {
                }
            }
            int i17 = m.f3089v7;
            if (typedArrayI.hasValue(i17)) {
                this.f37167M = U7.c.a(context2, typedArrayI, i17);
            }
            int i18 = m.f3067t7;
            if (typedArrayI.hasValue(i18)) {
                this.f37167M = t(this.f37167M.getDefaultColor(), typedArrayI.getColor(i18, 0));
            }
            this.f37168N = U7.c.a(context2, typedArrayI, m.f2847Z6);
            this.f37172R = u.i(typedArrayI.getInt(m.f2858a7, -1), null);
            this.f37169O = U7.c.a(context2, typedArrayI, m.f3045r7);
            this.f37183f0 = typedArrayI.getInt(m.f2880c7, 300);
            this.f37192o0 = R7.i.g(context2, C7.c.f2292P, D7.a.f3487b);
            this.f37178a0 = typedArrayI.getDimensionPixelSize(m.f2968k7, -1);
            this.f37179b0 = typedArrayI.getDimensionPixelSize(m.f2957j7, -1);
            this.f37176V = typedArrayI.getResourceId(m.f2817W6, 0);
            this.f37181d0 = typedArrayI.getDimensionPixelSize(m.f2827X6, 0);
            this.f37185h0 = typedArrayI.getInt(m.f2979l7, 1);
            this.f37182e0 = typedArrayI.getInt(m.f2837Y6, 0);
            this.f37186i0 = typedArrayI.getBoolean(m.f2946i7, false);
            this.f37190m0 = typedArrayI.getBoolean(m.f3099w7, false);
            typedArrayI.recycle();
            Resources resources = getResources();
            this.f37175U = resources.getDimensionPixelSize(C7.e.f2407o);
            this.f37180c0 = resources.getDimensionPixelSize(C7.e.f2405n);
            q();
        } finally {
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i10) {
        n(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        c cVar2 = this.f37193p0;
        if (cVar2 != null) {
            I(cVar2);
        }
        this.f37193p0 = cVar;
        if (cVar != null) {
            g(cVar);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        n(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        n(view);
    }

    public void setSelectedTabIndicator(int i10) {
        if (i10 != 0) {
            setSelectedTabIndicator(C3699a.b(getContext(), i10));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    public static class i implements d {

        /* renamed from: a, reason: collision with root package name */
        private final androidx.viewpager.widget.b f37238a;

        public i(androidx.viewpager.widget.b bVar) {
            this.f37238a = bVar;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(f fVar) {
            this.f37238a.setCurrentItem(fVar.g());
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(f fVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(f fVar) {
        }
    }
}
