package androidx.media3.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PlayerControlViewLayoutManager.java */
/* loaded from: classes.dex */
final class w {

    /* renamed from: A, reason: collision with root package name */
    private boolean f28350A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f28351B;

    /* renamed from: a, reason: collision with root package name */
    private final C2159d f28353a;

    /* renamed from: b, reason: collision with root package name */
    private final View f28354b;

    /* renamed from: c, reason: collision with root package name */
    private final ViewGroup f28355c;

    /* renamed from: d, reason: collision with root package name */
    private final ViewGroup f28356d;

    /* renamed from: e, reason: collision with root package name */
    private final ViewGroup f28357e;

    /* renamed from: f, reason: collision with root package name */
    private final ViewGroup f28358f;

    /* renamed from: g, reason: collision with root package name */
    private final ViewGroup f28359g;

    /* renamed from: h, reason: collision with root package name */
    private final ViewGroup f28360h;

    /* renamed from: i, reason: collision with root package name */
    private final ViewGroup f28361i;

    /* renamed from: j, reason: collision with root package name */
    private final View f28362j;

    /* renamed from: k, reason: collision with root package name */
    private final View f28363k;

    /* renamed from: l, reason: collision with root package name */
    private final AnimatorSet f28364l;

    /* renamed from: m, reason: collision with root package name */
    private final AnimatorSet f28365m;

    /* renamed from: n, reason: collision with root package name */
    private final AnimatorSet f28366n;

    /* renamed from: o, reason: collision with root package name */
    private final AnimatorSet f28367o;

    /* renamed from: p, reason: collision with root package name */
    private final AnimatorSet f28368p;

    /* renamed from: q, reason: collision with root package name */
    private final ValueAnimator f28369q;

    /* renamed from: r, reason: collision with root package name */
    private final ValueAnimator f28370r;

    /* renamed from: s, reason: collision with root package name */
    private final Runnable f28371s = new Runnable() { // from class: androidx.media3.ui.j
        @Override // java.lang.Runnable
        public final void run() {
            this.f28337B.c0();
        }
    };

    /* renamed from: t, reason: collision with root package name */
    private final Runnable f28372t = new Runnable() { // from class: androidx.media3.ui.p
        @Override // java.lang.Runnable
        public final void run() {
            this.f28343B.D();
        }
    };

    /* renamed from: u, reason: collision with root package name */
    private final Runnable f28373u = new Runnable() { // from class: androidx.media3.ui.q
        @Override // java.lang.Runnable
        public final void run() {
            this.f28344B.H();
        }
    };

    /* renamed from: v, reason: collision with root package name */
    private final Runnable f28374v = new Runnable() { // from class: androidx.media3.ui.r
        @Override // java.lang.Runnable
        public final void run() {
            this.f28345B.G();
        }
    };

    /* renamed from: w, reason: collision with root package name */
    private final Runnable f28375w = new Runnable() { // from class: androidx.media3.ui.s
        @Override // java.lang.Runnable
        public final void run() {
            this.f28346B.E();
        }
    };

    /* renamed from: x, reason: collision with root package name */
    private final View.OnLayoutChangeListener f28376x = new View.OnLayoutChangeListener() { // from class: androidx.media3.ui.t
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f28347a.R(view, i10, i11, i12, i13, i14, i15, i16, i17);
        }
    };

    /* renamed from: C, reason: collision with root package name */
    private boolean f28352C = true;

    /* renamed from: z, reason: collision with root package name */
    private int f28378z = 0;

    /* renamed from: y, reason: collision with root package name */
    private final List<View> f28377y = new ArrayList();

    /* compiled from: PlayerControlViewLayoutManager.java */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (w.this.f28354b != null) {
                w.this.f28354b.setVisibility(4);
            }
            if (w.this.f28355c != null) {
                w.this.f28355c.setVisibility(4);
            }
            if (w.this.f28357e != null) {
                w.this.f28357e.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (!(w.this.f28362j instanceof C2157b) || w.this.f28350A) {
                return;
            }
            ((C2157b) w.this.f28362j).h(250L);
        }
    }

    /* compiled from: PlayerControlViewLayoutManager.java */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (w.this.f28354b != null) {
                w.this.f28354b.setVisibility(0);
            }
            if (w.this.f28355c != null) {
                w.this.f28355c.setVisibility(0);
            }
            if (w.this.f28357e != null) {
                w.this.f28357e.setVisibility(w.this.f28350A ? 0 : 4);
            }
            if (!(w.this.f28362j instanceof C2157b) || w.this.f28350A) {
                return;
            }
            ((C2157b) w.this.f28362j).u(250L);
        }
    }

    /* compiled from: PlayerControlViewLayoutManager.java */
    class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C2159d f28381a;

        c(C2159d c2159d) {
            this.f28381a = c2159d;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            w.this.Z(1);
            if (w.this.f28351B) {
                this.f28381a.post(w.this.f28371s);
                w.this.f28351B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            w.this.Z(3);
        }
    }

    /* compiled from: PlayerControlViewLayoutManager.java */
    class d extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C2159d f28383a;

        d(C2159d c2159d) {
            this.f28383a = c2159d;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            w.this.Z(2);
            if (w.this.f28351B) {
                this.f28383a.post(w.this.f28371s);
                w.this.f28351B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            w.this.Z(3);
        }
    }

    /* compiled from: PlayerControlViewLayoutManager.java */
    class e extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C2159d f28385a;

        e(C2159d c2159d) {
            this.f28385a = c2159d;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            w.this.Z(2);
            if (w.this.f28351B) {
                this.f28385a.post(w.this.f28371s);
                w.this.f28351B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            w.this.Z(3);
        }
    }

    /* compiled from: PlayerControlViewLayoutManager.java */
    class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            w.this.Z(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            w.this.Z(4);
        }
    }

    /* compiled from: PlayerControlViewLayoutManager.java */
    class g extends AnimatorListenerAdapter {
        g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            w.this.Z(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            w.this.Z(4);
        }
    }

    /* compiled from: PlayerControlViewLayoutManager.java */
    class h extends AnimatorListenerAdapter {
        h() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (w.this.f28358f != null) {
                w.this.f28358f.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (w.this.f28360h != null) {
                w.this.f28360h.setVisibility(0);
                w.this.f28360h.setTranslationX(w.this.f28360h.getWidth());
                w.this.f28360h.scrollTo(w.this.f28360h.getWidth(), 0);
            }
        }
    }

    /* compiled from: PlayerControlViewLayoutManager.java */
    class i extends AnimatorListenerAdapter {
        i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (w.this.f28360h != null) {
                w.this.f28360h.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (w.this.f28358f != null) {
                w.this.f28358f.setVisibility(0);
            }
        }
    }

    public w(C2159d c2159d) throws Resources.NotFoundException {
        this.f28353a = c2159d;
        this.f28354b = c2159d.findViewById(e3.x.f40476l);
        this.f28355c = (ViewGroup) c2159d.findViewById(e3.x.f40471g);
        this.f28357e = (ViewGroup) c2159d.findViewById(e3.x.f40487w);
        ViewGroup viewGroup = (ViewGroup) c2159d.findViewById(e3.x.f40469e);
        this.f28356d = viewGroup;
        this.f28361i = (ViewGroup) c2159d.findViewById(e3.x.f40463S);
        View viewFindViewById = c2159d.findViewById(e3.x.f40451G);
        this.f28362j = viewFindViewById;
        this.f28358f = (ViewGroup) c2159d.findViewById(e3.x.f40468d);
        this.f28359g = (ViewGroup) c2159d.findViewById(e3.x.f40479o);
        this.f28360h = (ViewGroup) c2159d.findViewById(e3.x.f40480p);
        View viewFindViewById2 = c2159d.findViewById(e3.x.f40445A);
        this.f28363k = viewFindViewById2;
        View viewFindViewById3 = c2159d.findViewById(e3.x.f40490z);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.u
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f28348B.T(view);
                }
            });
            viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.u
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f28348B.T(view);
                }
            });
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.v
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f28349a.J(valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new a());
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.k
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f28338a.K(valueAnimator);
            }
        });
        valueAnimatorOfFloat2.addListener(new b());
        Resources resources = c2159d.getResources();
        int i10 = e3.u.f40422b;
        float dimension = resources.getDimension(i10) - resources.getDimension(e3.u.f40423c);
        float dimension2 = resources.getDimension(i10);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f28364l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new c(c2159d));
        animatorSet.play(valueAnimatorOfFloat).with(N(0.0f, dimension, viewFindViewById)).with(N(0.0f, dimension, viewGroup));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f28365m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new d(c2159d));
        animatorSet2.play(N(dimension, dimension2, viewFindViewById)).with(N(dimension, dimension2, viewGroup));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f28366n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new e(c2159d));
        animatorSet3.play(valueAnimatorOfFloat).with(N(0.0f, dimension2, viewFindViewById)).with(N(0.0f, dimension2, viewGroup));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f28367o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new f());
        animatorSet4.play(valueAnimatorOfFloat2).with(N(dimension, 0.0f, viewFindViewById)).with(N(dimension, 0.0f, viewGroup));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f28368p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new g());
        animatorSet5.play(valueAnimatorOfFloat2).with(N(dimension2, 0.0f, viewFindViewById)).with(N(dimension2, 0.0f, viewGroup));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f28369q = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.n
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f28341a.L(valueAnimator);
            }
        });
        valueAnimatorOfFloat3.addListener(new h());
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f28370r = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.o
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f28342a.M(valueAnimator);
            }
        });
        valueAnimatorOfFloat4.addListener(new i());
    }

    private static int B(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return width + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        this.f28366n.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        Z(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        this.f28364l.start();
        U(this.f28373u, 2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        this.f28365m.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.f28354b;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup = this.f28355c;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup2 = this.f28357e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.f28354b;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup = this.f28355c;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup2 = this.f28357e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(ValueAnimator valueAnimator) {
        y(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(ValueAnimator valueAnimator) {
        y(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private static ObjectAnimator N(float f10, float f11, View view) {
        return ObjectAnimator.ofFloat(view, "translationY", f10, f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        boolean zE0 = e0();
        if (this.f28350A != zE0) {
            this.f28350A = zE0;
            view.post(new Runnable() { // from class: androidx.media3.ui.l
                @Override // java.lang.Runnable
                public final void run() throws Resources.NotFoundException {
                    this.f28339B.d0();
                }
            });
        }
        boolean z10 = i12 - i10 != i16 - i14;
        if (this.f28350A || !z10) {
            return;
        }
        view.post(new Runnable() { // from class: androidx.media3.ui.m
            @Override // java.lang.Runnable
            public final void run() {
                this.f28340B.S();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S() {
        int i10;
        if (this.f28358f == null || this.f28359g == null) {
            return;
        }
        int width = (this.f28353a.getWidth() - this.f28353a.getPaddingLeft()) - this.f28353a.getPaddingRight();
        while (true) {
            if (this.f28359g.getChildCount() <= 1) {
                break;
            }
            int childCount = this.f28359g.getChildCount() - 2;
            View childAt = this.f28359g.getChildAt(childCount);
            this.f28359g.removeViewAt(childCount);
            this.f28358f.addView(childAt, 0);
        }
        View view = this.f28363k;
        if (view != null) {
            view.setVisibility(8);
        }
        int iB = B(this.f28361i);
        int childCount2 = this.f28358f.getChildCount() - 1;
        for (int i11 = 0; i11 < childCount2; i11++) {
            iB += B(this.f28358f.getChildAt(i11));
        }
        if (iB <= width) {
            ViewGroup viewGroup = this.f28360h;
            if (viewGroup == null || viewGroup.getVisibility() != 0 || this.f28370r.isStarted()) {
                return;
            }
            this.f28369q.cancel();
            this.f28370r.start();
            return;
        }
        View view2 = this.f28363k;
        if (view2 != null) {
            view2.setVisibility(0);
            iB += B(this.f28363k);
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = this.f28358f.getChildAt(i12);
            iB -= B(childAt2);
            arrayList.add(childAt2);
            if (iB <= width) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.f28358f.removeViews(0, arrayList.size());
        for (i10 = 0; i10 < arrayList.size(); i10++) {
            this.f28359g.addView((View) arrayList.get(i10), this.f28359g.getChildCount() - 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T(View view) {
        W();
        if (view.getId() == e3.x.f40445A) {
            this.f28369q.start();
        } else if (view.getId() == e3.x.f40490z) {
            this.f28370r.start();
        }
    }

    private void U(Runnable runnable, long j10) {
        if (j10 >= 0) {
            this.f28353a.postDelayed(runnable, j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z(int i10) {
        int i11 = this.f28378z;
        this.f28378z = i10;
        if (i10 == 2) {
            this.f28353a.setVisibility(8);
        } else if (i11 == 2) {
            this.f28353a.setVisibility(0);
        }
        if (i11 != i10) {
            this.f28353a.f0();
        }
    }

    private boolean a0(View view) {
        int id2 = view.getId();
        return id2 == e3.x.f40469e || id2 == e3.x.f40450F || id2 == e3.x.f40489y || id2 == e3.x.f40454J || id2 == e3.x.f40455K || id2 == e3.x.f40481q || id2 == e3.x.f40482r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0() {
        if (!this.f28352C) {
            Z(0);
            W();
            return;
        }
        int i10 = this.f28378z;
        if (i10 == 1) {
            this.f28367o.start();
        } else if (i10 == 2) {
            this.f28368p.start();
        } else if (i10 == 3) {
            this.f28351B = true;
        } else if (i10 == 4) {
            return;
        }
        W();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0() throws Resources.NotFoundException {
        ViewGroup viewGroup = this.f28357e;
        if (viewGroup != null) {
            viewGroup.setVisibility(this.f28350A ? 0 : 4);
        }
        if (this.f28362j != null) {
            int dimensionPixelSize = this.f28353a.getResources().getDimensionPixelSize(e3.u.f40424d);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f28362j.getLayoutParams();
            if (marginLayoutParams != null) {
                if (this.f28350A) {
                    dimensionPixelSize = 0;
                }
                marginLayoutParams.bottomMargin = dimensionPixelSize;
                this.f28362j.setLayoutParams(marginLayoutParams);
            }
            View view = this.f28362j;
            if (view instanceof C2157b) {
                C2157b c2157b = (C2157b) view;
                if (this.f28350A) {
                    c2157b.i(true);
                } else {
                    int i10 = this.f28378z;
                    if (i10 == 1) {
                        c2157b.i(false);
                    } else if (i10 != 3) {
                        c2157b.t();
                    }
                }
            }
        }
        for (View view2 : this.f28377y) {
            view2.setVisibility((this.f28350A && a0(view2)) ? 4 : 0);
        }
    }

    private boolean e0() {
        int width = (this.f28353a.getWidth() - this.f28353a.getPaddingLeft()) - this.f28353a.getPaddingRight();
        int height = (this.f28353a.getHeight() - this.f28353a.getPaddingBottom()) - this.f28353a.getPaddingTop();
        int iB = B(this.f28355c);
        ViewGroup viewGroup = this.f28355c;
        int paddingLeft = iB - (viewGroup != null ? viewGroup.getPaddingLeft() + this.f28355c.getPaddingRight() : 0);
        int iZ = z(this.f28355c);
        ViewGroup viewGroup2 = this.f28355c;
        return width <= Math.max(paddingLeft, B(this.f28361i) + B(this.f28363k)) || height <= (iZ - (viewGroup2 != null ? viewGroup2.getPaddingTop() + this.f28355c.getPaddingBottom() : 0)) + (z(this.f28356d) * 2);
    }

    private void y(float f10) {
        if (this.f28360h != null) {
            this.f28360h.setTranslationX((int) (r0.getWidth() * (1.0f - f10)));
        }
        ViewGroup viewGroup = this.f28361i;
        if (viewGroup != null) {
            viewGroup.setAlpha(1.0f - f10);
        }
        ViewGroup viewGroup2 = this.f28358f;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f10);
        }
    }

    private static int z(View view) {
        if (view == null) {
            return 0;
        }
        int height = view.getHeight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return height;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return height + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public boolean A(View view) {
        return view != null && this.f28377y.contains(view);
    }

    public void C() {
        int i10 = this.f28378z;
        if (i10 == 3 || i10 == 2) {
            return;
        }
        V();
        if (!this.f28352C) {
            E();
        } else if (this.f28378z == 1) {
            H();
        } else {
            D();
        }
    }

    public void F() {
        int i10 = this.f28378z;
        if (i10 == 3 || i10 == 2) {
            return;
        }
        V();
        E();
    }

    public boolean I() {
        return this.f28378z == 0 && this.f28353a.e0();
    }

    public void O() {
        this.f28353a.addOnLayoutChangeListener(this.f28376x);
    }

    public void P() {
        this.f28353a.removeOnLayoutChangeListener(this.f28376x);
    }

    public void Q(boolean z10, int i10, int i11, int i12, int i13) {
        View view = this.f28354b;
        if (view != null) {
            view.layout(0, 0, i12 - i10, i13 - i11);
        }
    }

    public void V() {
        this.f28353a.removeCallbacks(this.f28375w);
        this.f28353a.removeCallbacks(this.f28372t);
        this.f28353a.removeCallbacks(this.f28374v);
        this.f28353a.removeCallbacks(this.f28373u);
    }

    public void W() {
        if (this.f28378z == 3) {
            return;
        }
        V();
        int showTimeoutMs = this.f28353a.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.f28352C) {
                U(this.f28375w, showTimeoutMs);
            } else if (this.f28378z == 1) {
                U(this.f28373u, 2000L);
            } else {
                U(this.f28374v, showTimeoutMs);
            }
        }
    }

    public void X(boolean z10) {
        this.f28352C = z10;
    }

    public void Y(View view, boolean z10) {
        if (view == null) {
            return;
        }
        if (!z10) {
            view.setVisibility(8);
            this.f28377y.remove(view);
            return;
        }
        if (this.f28350A && a0(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        this.f28377y.add(view);
    }

    public void b0() {
        if (!this.f28353a.e0()) {
            this.f28353a.setVisibility(0);
            this.f28353a.o0();
            this.f28353a.k0();
        }
        c0();
    }
}
