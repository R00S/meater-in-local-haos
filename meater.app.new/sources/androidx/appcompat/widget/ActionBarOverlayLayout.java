package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.j;
import j1.C3719d;
import s1.C4469y0;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements C, s1.G, s1.E, s1.F {

    /* renamed from: k0, reason: collision with root package name */
    static final int[] f21139k0 = {i.a.f42395b, R.attr.windowContentOverlay};

    /* renamed from: l0, reason: collision with root package name */
    private static final C4469y0 f21140l0 = new C4469y0.a().d(C3719d.b(0, 1, 0, 1)).a();

    /* renamed from: m0, reason: collision with root package name */
    private static final Rect f21141m0 = new Rect();

    /* renamed from: B, reason: collision with root package name */
    private int f21142B;

    /* renamed from: C, reason: collision with root package name */
    private int f21143C;

    /* renamed from: D, reason: collision with root package name */
    private ContentFrameLayout f21144D;

    /* renamed from: E, reason: collision with root package name */
    ActionBarContainer f21145E;

    /* renamed from: F, reason: collision with root package name */
    private D f21146F;

    /* renamed from: G, reason: collision with root package name */
    private Drawable f21147G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f21148H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f21149I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f21150J;

    /* renamed from: K, reason: collision with root package name */
    boolean f21151K;

    /* renamed from: L, reason: collision with root package name */
    private int f21152L;

    /* renamed from: M, reason: collision with root package name */
    private int f21153M;

    /* renamed from: N, reason: collision with root package name */
    private final Rect f21154N;

    /* renamed from: O, reason: collision with root package name */
    private final Rect f21155O;

    /* renamed from: P, reason: collision with root package name */
    private final Rect f21156P;

    /* renamed from: Q, reason: collision with root package name */
    private final Rect f21157Q;

    /* renamed from: R, reason: collision with root package name */
    private final Rect f21158R;

    /* renamed from: S, reason: collision with root package name */
    private final Rect f21159S;

    /* renamed from: T, reason: collision with root package name */
    private final Rect f21160T;

    /* renamed from: U, reason: collision with root package name */
    private final Rect f21161U;

    /* renamed from: V, reason: collision with root package name */
    private C4469y0 f21162V;

    /* renamed from: W, reason: collision with root package name */
    private C4469y0 f21163W;

    /* renamed from: a0, reason: collision with root package name */
    private C4469y0 f21164a0;

    /* renamed from: b0, reason: collision with root package name */
    private C4469y0 f21165b0;

    /* renamed from: c0, reason: collision with root package name */
    private d f21166c0;

    /* renamed from: d0, reason: collision with root package name */
    private OverScroller f21167d0;

    /* renamed from: e0, reason: collision with root package name */
    ViewPropertyAnimator f21168e0;

    /* renamed from: f0, reason: collision with root package name */
    final AnimatorListenerAdapter f21169f0;

    /* renamed from: g0, reason: collision with root package name */
    private final Runnable f21170g0;

    /* renamed from: h0, reason: collision with root package name */
    private final Runnable f21171h0;

    /* renamed from: i0, reason: collision with root package name */
    private final s1.H f21172i0;

    /* renamed from: j0, reason: collision with root package name */
    private final f f21173j0;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f21168e0 = null;
            actionBarOverlayLayout.f21151K = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f21168e0 = null;
            actionBarOverlayLayout.f21151K = false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.v();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f21168e0 = actionBarOverlayLayout.f21145E.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f21169f0);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.v();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f21168e0 = actionBarOverlayLayout.f21145E.animate().translationY(-ActionBarOverlayLayout.this.f21145E.getHeight()).setListener(ActionBarOverlayLayout.this.f21169f0);
        }
    }

    public interface d {
        void a();

        void b();

        void c(boolean z10);

        void d();

        void e();

        void f(int i10);
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(int i10, int i11) {
            super(i10, i11);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    private static final class f extends View {
        f(Context context) {
            super(context);
            setWillNotDraw(true);
        }

        @Override // android.view.View
        public int getWindowSystemUiVisibility() {
            return 0;
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21143C = 0;
        this.f21154N = new Rect();
        this.f21155O = new Rect();
        this.f21156P = new Rect();
        this.f21157Q = new Rect();
        this.f21158R = new Rect();
        this.f21159S = new Rect();
        this.f21160T = new Rect();
        this.f21161U = new Rect();
        C4469y0 c4469y0 = C4469y0.f49201b;
        this.f21162V = c4469y0;
        this.f21163W = c4469y0;
        this.f21164a0 = c4469y0;
        this.f21165b0 = c4469y0;
        this.f21169f0 = new a();
        this.f21170g0 = new b();
        this.f21171h0 = new c();
        w(context);
        this.f21172i0 = new s1.H(this);
        f fVar = new f(context);
        this.f21173j0 = fVar;
        addView(fVar);
    }

    private void B() {
        v();
        this.f21170g0.run();
    }

    private boolean C(float f10) {
        this.f21167d0.fling(0, 0, 0, (int) f10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f21167d0.getFinalY() > this.f21145E.getHeight();
    }

    private void p() {
        v();
        this.f21171h0.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean q(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.e) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = r0
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = r0
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = r0
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            goto L36
        L35:
            r0 = r5
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.q(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    private boolean r() {
        s1.X.f(this.f21173j0, f21140l0, this.f21157Q);
        return !this.f21157Q.equals(f21141m0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private D u(View view) {
        if (view instanceof D) {
            return (D) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void w(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f21139k0);
        this.f21142B = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f21147G = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f21167d0 = new OverScroller(context);
    }

    private void y() {
        v();
        postDelayed(this.f21171h0, 600L);
    }

    private void z() {
        v();
        postDelayed(this.f21170g0, 600L);
    }

    void A() {
        if (this.f21144D == null) {
            this.f21144D = (ContentFrameLayout) findViewById(i.f.f42501b);
            this.f21145E = (ActionBarContainer) findViewById(i.f.f42502c);
            this.f21146F = u(findViewById(i.f.f42500a));
        }
    }

    @Override // androidx.appcompat.widget.C
    public void a(Menu menu, j.a aVar) {
        A();
        this.f21146F.a(menu, aVar);
    }

    @Override // androidx.appcompat.widget.C
    public boolean b() {
        A();
        return this.f21146F.b();
    }

    @Override // androidx.appcompat.widget.C
    public void c() {
        A();
        this.f21146F.c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // androidx.appcompat.widget.C
    public boolean d() {
        A();
        return this.f21146F.d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f21147G != null) {
            int bottom = this.f21145E.getVisibility() == 0 ? (int) (this.f21145E.getBottom() + this.f21145E.getTranslationY() + 0.5f) : 0;
            this.f21147G.setBounds(0, bottom, getWidth(), this.f21147G.getIntrinsicHeight() + bottom);
            this.f21147G.draw(canvas);
        }
    }

    @Override // androidx.appcompat.widget.C
    public boolean e() {
        A();
        return this.f21146F.e();
    }

    @Override // androidx.appcompat.widget.C
    public boolean f() {
        A();
        return this.f21146F.f();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.C
    public boolean g() {
        A();
        return this.f21146F.g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f21145E;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f21172i0.a();
    }

    public CharSequence getTitle() {
        A();
        return this.f21146F.getTitle();
    }

    @Override // androidx.appcompat.widget.C
    public void h(int i10) {
        A();
        if (i10 == 2) {
            this.f21146F.w();
        } else if (i10 == 5) {
            this.f21146F.x();
        } else {
            if (i10 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.C
    public void i() {
        A();
        this.f21146F.h();
    }

    @Override // s1.F
    public void j(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        k(view, i10, i11, i12, i13, i14);
    }

    @Override // s1.E
    public void k(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override // s1.E
    public boolean l(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    @Override // s1.E
    public void m(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // s1.E
    public void n(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // s1.E
    public void o(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        A();
        C4469y0 c4469y0X = C4469y0.x(windowInsets, this);
        boolean zQ = q(this.f21145E, new Rect(c4469y0X.j(), c4469y0X.l(), c4469y0X.k(), c4469y0X.i()), true, true, false, true);
        s1.X.f(this, c4469y0X, this.f21154N);
        Rect rect = this.f21154N;
        C4469y0 c4469y0M = c4469y0X.m(rect.left, rect.top, rect.right, rect.bottom);
        this.f21162V = c4469y0M;
        boolean z10 = true;
        if (!this.f21163W.equals(c4469y0M)) {
            this.f21163W = this.f21162V;
            zQ = true;
        }
        if (this.f21155O.equals(this.f21154N)) {
            z10 = zQ;
        } else {
            this.f21155O.set(this.f21154N);
        }
        if (z10) {
            requestLayout();
        }
        return c4469y0X.a().c().b().v();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        w(getContext());
        s1.X.k0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i16 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int measuredHeight;
        A();
        measureChildWithMargins(this.f21145E, i10, 0, i11, 0);
        e eVar = (e) this.f21145E.getLayoutParams();
        int iMax = Math.max(0, this.f21145E.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int iMax2 = Math.max(0, this.f21145E.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f21145E.getMeasuredState());
        boolean z10 = (s1.X.K(this) & 256) != 0;
        if (z10) {
            measuredHeight = this.f21142B;
            if (this.f21149I && this.f21145E.getTabContainer() != null) {
                measuredHeight += this.f21142B;
            }
        } else {
            measuredHeight = this.f21145E.getVisibility() != 8 ? this.f21145E.getMeasuredHeight() : 0;
        }
        this.f21156P.set(this.f21154N);
        this.f21164a0 = this.f21162V;
        if (this.f21148H || z10 || !r()) {
            this.f21164a0 = new C4469y0.a(this.f21164a0).d(C3719d.b(this.f21164a0.j(), this.f21164a0.l() + measuredHeight, this.f21164a0.k(), this.f21164a0.i())).a();
        } else {
            Rect rect = this.f21156P;
            rect.top += measuredHeight;
            rect.bottom = rect.bottom;
            this.f21164a0 = this.f21164a0.m(0, measuredHeight, 0, 0);
        }
        q(this.f21144D, this.f21156P, true, true, true, true);
        if (!this.f21165b0.equals(this.f21164a0)) {
            C4469y0 c4469y0 = this.f21164a0;
            this.f21165b0 = c4469y0;
            s1.X.g(this.f21144D, c4469y0);
        }
        measureChildWithMargins(this.f21144D, i10, 0, i11, 0);
        e eVar2 = (e) this.f21144D.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f21144D.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f21144D.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f21144D.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!this.f21150J || !z10) {
            return false;
        }
        if (C(f11)) {
            p();
        } else {
            B();
        }
        this.f21151K = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.f21152L + i11;
        this.f21152L = i14;
        setActionBarHideOffset(i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f21172i0.b(view, view2, i10);
        this.f21152L = getActionBarHideOffset();
        v();
        d dVar = this.f21166c0;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.f21145E.getVisibility() != 0) {
            return false;
        }
        return this.f21150J;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.f21150J && !this.f21151K) {
            if (this.f21152L <= this.f21145E.getHeight()) {
                z();
            } else {
                y();
            }
        }
        d dVar = this.f21166c0;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i10) {
        super.onWindowSystemUiVisibilityChanged(i10);
        A();
        int i11 = this.f21153M ^ i10;
        this.f21153M = i10;
        boolean z10 = (i10 & 4) == 0;
        boolean z11 = (i10 & 256) != 0;
        d dVar = this.f21166c0;
        if (dVar != null) {
            dVar.c(!z11);
            if (z10 || !z11) {
                this.f21166c0.a();
            } else {
                this.f21166c0.d();
            }
        }
        if ((i11 & 256) == 0 || this.f21166c0 == null) {
            return;
        }
        s1.X.k0(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f21143C = i10;
        d dVar = this.f21166c0;
        if (dVar != null) {
            dVar.f(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    public void setActionBarHideOffset(int i10) {
        v();
        this.f21145E.setTranslationY(-Math.max(0, Math.min(i10, this.f21145E.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.f21166c0 = dVar;
        if (getWindowToken() != null) {
            this.f21166c0.f(this.f21143C);
            int i10 = this.f21153M;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                s1.X.k0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.f21149I = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f21150J) {
            this.f21150J = z10;
            if (z10) {
                return;
            }
            v();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i10) {
        A();
        this.f21146F.setIcon(i10);
    }

    public void setLogo(int i10) {
        A();
        this.f21146F.n(i10);
    }

    public void setOverlayMode(boolean z10) {
        this.f21148H = z10;
    }

    @Override // androidx.appcompat.widget.C
    public void setWindowCallback(Window.Callback callback) {
        A();
        this.f21146F.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.C
    public void setWindowTitle(CharSequence charSequence) {
        A();
        this.f21146F.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    void v() {
        removeCallbacks(this.f21170g0);
        removeCallbacks(this.f21171h0);
        ViewPropertyAnimator viewPropertyAnimator = this.f21168e0;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean x() {
        return this.f21148H;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        A();
        this.f21146F.setIcon(drawable);
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i10) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }
}
