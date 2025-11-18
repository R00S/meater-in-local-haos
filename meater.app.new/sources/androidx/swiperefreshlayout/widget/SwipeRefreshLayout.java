package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import g1.C3377a;
import s1.C;
import s1.D;
import s1.G;
import s1.H;
import s1.X;

/* loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements G, C {

    /* renamed from: r0, reason: collision with root package name */
    private static final String f29327r0 = "SwipeRefreshLayout";

    /* renamed from: s0, reason: collision with root package name */
    private static final int[] f29328s0 = {R.attr.enabled};

    /* renamed from: B, reason: collision with root package name */
    private View f29329B;

    /* renamed from: C, reason: collision with root package name */
    j f29330C;

    /* renamed from: D, reason: collision with root package name */
    boolean f29331D;

    /* renamed from: E, reason: collision with root package name */
    private int f29332E;

    /* renamed from: F, reason: collision with root package name */
    private float f29333F;

    /* renamed from: G, reason: collision with root package name */
    private float f29334G;

    /* renamed from: H, reason: collision with root package name */
    private final H f29335H;

    /* renamed from: I, reason: collision with root package name */
    private final D f29336I;

    /* renamed from: J, reason: collision with root package name */
    private final int[] f29337J;

    /* renamed from: K, reason: collision with root package name */
    private final int[] f29338K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f29339L;

    /* renamed from: M, reason: collision with root package name */
    private int f29340M;

    /* renamed from: N, reason: collision with root package name */
    int f29341N;

    /* renamed from: O, reason: collision with root package name */
    private float f29342O;

    /* renamed from: P, reason: collision with root package name */
    private float f29343P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f29344Q;

    /* renamed from: R, reason: collision with root package name */
    private int f29345R;

    /* renamed from: S, reason: collision with root package name */
    boolean f29346S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f29347T;

    /* renamed from: U, reason: collision with root package name */
    private final DecelerateInterpolator f29348U;

    /* renamed from: V, reason: collision with root package name */
    androidx.swiperefreshlayout.widget.a f29349V;

    /* renamed from: W, reason: collision with root package name */
    private int f29350W;

    /* renamed from: a0, reason: collision with root package name */
    protected int f29351a0;

    /* renamed from: b0, reason: collision with root package name */
    float f29352b0;

    /* renamed from: c0, reason: collision with root package name */
    protected int f29353c0;

    /* renamed from: d0, reason: collision with root package name */
    int f29354d0;

    /* renamed from: e0, reason: collision with root package name */
    int f29355e0;

    /* renamed from: f0, reason: collision with root package name */
    androidx.swiperefreshlayout.widget.b f29356f0;

    /* renamed from: g0, reason: collision with root package name */
    private Animation f29357g0;

    /* renamed from: h0, reason: collision with root package name */
    private Animation f29358h0;

    /* renamed from: i0, reason: collision with root package name */
    private Animation f29359i0;

    /* renamed from: j0, reason: collision with root package name */
    private Animation f29360j0;

    /* renamed from: k0, reason: collision with root package name */
    private Animation f29361k0;

    /* renamed from: l0, reason: collision with root package name */
    boolean f29362l0;

    /* renamed from: m0, reason: collision with root package name */
    private int f29363m0;

    /* renamed from: n0, reason: collision with root package name */
    boolean f29364n0;

    /* renamed from: o0, reason: collision with root package name */
    private Animation.AnimationListener f29365o0;

    /* renamed from: p0, reason: collision with root package name */
    private final Animation f29366p0;

    /* renamed from: q0, reason: collision with root package name */
    private final Animation f29367q0;

    class b extends Animation {
        b() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(f10);
        }
    }

    class c extends Animation {
        c() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f10);
        }
    }

    class d extends Animation {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ int f29371B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ int f29372C;

        d(int i10, int i11) {
            this.f29371B = i10;
            this.f29372C = i11;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.f29356f0.setAlpha((int) (this.f29371B + ((this.f29372C - r0) * f10)));
        }
    }

    class f extends Animation {
        f() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            int iAbs = !swipeRefreshLayout.f29364n0 ? swipeRefreshLayout.f29354d0 - Math.abs(swipeRefreshLayout.f29353c0) : swipeRefreshLayout.f29354d0;
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((swipeRefreshLayout2.f29351a0 + ((int) ((iAbs - r1) * f10))) - swipeRefreshLayout2.f29349V.getTop());
            SwipeRefreshLayout.this.f29356f0.e(1.0f - f10);
        }
    }

    class g extends Animation {
        g() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.i(f10);
        }
    }

    class h extends Animation {
        h() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            float f11 = swipeRefreshLayout.f29352b0;
            swipeRefreshLayout.setAnimationProgress(f11 + ((-f11) * f10));
            SwipeRefreshLayout.this.i(f10);
        }
    }

    public interface i {
    }

    public interface j {
        void a();
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29331D = false;
        this.f29333F = -1.0f;
        this.f29337J = new int[2];
        this.f29338K = new int[2];
        this.f29345R = -1;
        this.f29350W = -1;
        this.f29365o0 = new a();
        this.f29366p0 = new f();
        this.f29367q0 = new g();
        this.f29332E = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f29340M = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f29348U = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f29363m0 = (int) (displayMetrics.density * 40.0f);
        d();
        setChildrenDrawingOrderEnabled(true);
        int i10 = (int) (displayMetrics.density * 64.0f);
        this.f29354d0 = i10;
        this.f29333F = i10;
        this.f29335H = new H(this);
        this.f29336I = new D(this);
        setNestedScrollingEnabled(true);
        int i11 = -this.f29363m0;
        this.f29341N = i11;
        this.f29353c0 = i11;
        i(1.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f29328s0);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }

    private void a(int i10, Animation.AnimationListener animationListener) {
        this.f29351a0 = i10;
        this.f29366p0.reset();
        this.f29366p0.setDuration(200L);
        this.f29366p0.setInterpolator(this.f29348U);
        if (animationListener != null) {
            this.f29349V.b(animationListener);
        }
        this.f29349V.clearAnimation();
        this.f29349V.startAnimation(this.f29366p0);
    }

    private void b(int i10, Animation.AnimationListener animationListener) {
        if (this.f29346S) {
            x(i10, animationListener);
            return;
        }
        this.f29351a0 = i10;
        this.f29367q0.reset();
        this.f29367q0.setDuration(200L);
        this.f29367q0.setInterpolator(this.f29348U);
        if (animationListener != null) {
            this.f29349V.b(animationListener);
        }
        this.f29349V.clearAnimation();
        this.f29349V.startAnimation(this.f29367q0);
    }

    private void d() {
        this.f29349V = new androidx.swiperefreshlayout.widget.a(getContext(), -328966);
        androidx.swiperefreshlayout.widget.b bVar = new androidx.swiperefreshlayout.widget.b(getContext());
        this.f29356f0 = bVar;
        bVar.l(1);
        this.f29349V.setImageDrawable(this.f29356f0);
        this.f29349V.setVisibility(8);
        addView(this.f29349V);
    }

    private void e() {
        if (this.f29329B == null) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (!childAt.equals(this.f29349V)) {
                    this.f29329B = childAt;
                    return;
                }
            }
        }
    }

    private void f(float f10) {
        if (f10 > this.f29333F) {
            r(true, true);
            return;
        }
        this.f29331D = false;
        this.f29356f0.j(0.0f, 0.0f);
        b(this.f29341N, !this.f29346S ? new e() : null);
        this.f29356f0.d(false);
    }

    private boolean g(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    private void h(float f10) {
        this.f29356f0.d(true);
        float fMin = Math.min(1.0f, Math.abs(f10 / this.f29333F));
        float fMax = (((float) Math.max(fMin - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f10) - this.f29333F;
        int i10 = this.f29355e0;
        if (i10 <= 0) {
            i10 = this.f29364n0 ? this.f29354d0 - this.f29353c0 : this.f29354d0;
        }
        float f11 = i10;
        double dMax = Math.max(0.0f, Math.min(fAbs, f11 * 2.0f) / f11) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i11 = this.f29353c0 + ((int) ((f11 * fMin) + (f11 * fPow * 2.0f)));
        if (this.f29349V.getVisibility() != 0) {
            this.f29349V.setVisibility(0);
        }
        if (!this.f29346S) {
            this.f29349V.setScaleX(1.0f);
            this.f29349V.setScaleY(1.0f);
        }
        if (this.f29346S) {
            setAnimationProgress(Math.min(1.0f, f10 / this.f29333F));
        }
        if (f10 < this.f29333F) {
            if (this.f29356f0.getAlpha() > 76 && !g(this.f29359i0)) {
                v();
            }
        } else if (this.f29356f0.getAlpha() < 255 && !g(this.f29360j0)) {
            u();
        }
        this.f29356f0.j(0.0f, Math.min(0.8f, fMax * 0.8f));
        this.f29356f0.e(Math.min(1.0f, fMax));
        this.f29356f0.g((((fMax * 0.4f) - 0.25f) + (fPow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i11 - this.f29341N);
    }

    private void p(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f29345R) {
            this.f29345R = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    private void r(boolean z10, boolean z11) {
        if (this.f29331D != z10) {
            this.f29362l0 = z11;
            e();
            this.f29331D = z10;
            if (z10) {
                a(this.f29341N, this.f29365o0);
            } else {
                w(this.f29365o0);
            }
        }
    }

    private Animation s(int i10, int i11) {
        d dVar = new d(i10, i11);
        dVar.setDuration(300L);
        this.f29349V.b(null);
        this.f29349V.clearAnimation();
        this.f29349V.startAnimation(dVar);
        return dVar;
    }

    private void setColorViewAlpha(int i10) {
        this.f29349V.getBackground().setAlpha(i10);
        this.f29356f0.setAlpha(i10);
    }

    private void t(float f10) {
        float f11 = this.f29343P;
        float f12 = f10 - f11;
        int i10 = this.f29332E;
        if (f12 <= i10 || this.f29344Q) {
            return;
        }
        this.f29342O = f11 + i10;
        this.f29344Q = true;
        this.f29356f0.setAlpha(76);
    }

    private void u() {
        this.f29360j0 = s(this.f29356f0.getAlpha(), 255);
    }

    private void v() {
        this.f29359i0 = s(this.f29356f0.getAlpha(), 76);
    }

    private void x(int i10, Animation.AnimationListener animationListener) {
        this.f29351a0 = i10;
        this.f29352b0 = this.f29349V.getScaleX();
        h hVar = new h();
        this.f29361k0 = hVar;
        hVar.setDuration(150L);
        if (animationListener != null) {
            this.f29349V.b(animationListener);
        }
        this.f29349V.clearAnimation();
        this.f29349V.startAnimation(this.f29361k0);
    }

    private void y(Animation.AnimationListener animationListener) {
        this.f29349V.setVisibility(0);
        this.f29356f0.setAlpha(255);
        b bVar = new b();
        this.f29357g0 = bVar;
        bVar.setDuration(this.f29340M);
        if (animationListener != null) {
            this.f29349V.b(animationListener);
        }
        this.f29349V.clearAnimation();
        this.f29349V.startAnimation(this.f29357g0);
    }

    public boolean c() {
        View view = this.f29329B;
        return view instanceof ListView ? androidx.core.widget.h.a((ListView) view, -1) : view.canScrollVertically(-1);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f29336I.a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f29336I.b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.f29336I.c(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f29336I.f(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        int i12 = this.f29350W;
        return i12 < 0 ? i11 : i11 == i10 + (-1) ? i12 : i11 >= i12 ? i11 + 1 : i11;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f29335H.a();
    }

    public int getProgressCircleDiameter() {
        return this.f29363m0;
    }

    public int getProgressViewEndOffset() {
        return this.f29354d0;
    }

    public int getProgressViewStartOffset() {
        return this.f29353c0;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.f29336I.j();
    }

    void i(float f10) {
        setTargetOffsetTopAndBottom((this.f29351a0 + ((int) ((this.f29353c0 - r0) * f10))) - this.f29349V.getTop());
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f29336I.l();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0058  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            r4.e()
            int r0 = r5.getActionMasked()
            boolean r1 = r4.f29347T
            r2 = 0
            if (r1 == 0) goto L10
            if (r0 != 0) goto L10
            r4.f29347T = r2
        L10:
            boolean r1 = r4.isEnabled()
            if (r1 == 0) goto L81
            boolean r1 = r4.f29347T
            if (r1 != 0) goto L81
            boolean r1 = r4.c()
            if (r1 != 0) goto L81
            boolean r1 = r4.f29331D
            if (r1 != 0) goto L81
            boolean r1 = r4.f29339L
            if (r1 == 0) goto L29
            goto L81
        L29:
            if (r0 == 0) goto L5d
            r1 = 1
            r3 = -1
            if (r0 == r1) goto L58
            r1 = 2
            if (r0 == r1) goto L3d
            r1 = 3
            if (r0 == r1) goto L58
            r1 = 6
            if (r0 == r1) goto L39
            goto L7e
        L39:
            r4.p(r5)
            goto L7e
        L3d:
            int r0 = r4.f29345R
            if (r0 != r3) goto L49
            java.lang.String r5 = androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f29327r0
            java.lang.String r0 = "Got ACTION_MOVE event but don't have an active pointer id."
            android.util.Log.e(r5, r0)
            return r2
        L49:
            int r0 = r5.findPointerIndex(r0)
            if (r0 >= 0) goto L50
            return r2
        L50:
            float r5 = r5.getY(r0)
            r4.t(r5)
            goto L7e
        L58:
            r4.f29344Q = r2
            r4.f29345R = r3
            goto L7e
        L5d:
            int r0 = r4.f29353c0
            androidx.swiperefreshlayout.widget.a r1 = r4.f29349V
            int r1 = r1.getTop()
            int r0 = r0 - r1
            r4.setTargetOffsetTopAndBottom(r0)
            int r0 = r5.getPointerId(r2)
            r4.f29345R = r0
            r4.f29344Q = r2
            int r0 = r5.findPointerIndex(r0)
            if (r0 >= 0) goto L78
            return r2
        L78:
            float r5 = r5.getY(r0)
            r4.f29343P = r5
        L7e:
            boolean r5 = r4.f29344Q
            return r5
        L81:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f29329B == null) {
            e();
        }
        View view = this.f29329B;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f29349V.getMeasuredWidth();
        int measuredHeight2 = this.f29349V.getMeasuredHeight();
        int i14 = measuredWidth / 2;
        int i15 = measuredWidth2 / 2;
        int i16 = this.f29341N;
        this.f29349V.layout(i14 - i15, i16, i14 + i15, measuredHeight2 + i16);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f29329B == null) {
            e();
        }
        View view = this.f29329B;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f29349V.measure(View.MeasureSpec.makeMeasureSpec(this.f29363m0, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f29363m0, 1073741824));
        this.f29350W = -1;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            if (getChildAt(i12) == this.f29349V) {
                this.f29350W = i12;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return dispatchNestedFling(f10, f11, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        if (i11 > 0) {
            float f10 = this.f29334G;
            if (f10 > 0.0f) {
                float f11 = i11;
                if (f11 > f10) {
                    iArr[1] = i11 - ((int) f10);
                    this.f29334G = 0.0f;
                } else {
                    this.f29334G = f10 - f11;
                    iArr[1] = i11;
                }
                h(this.f29334G);
            }
        }
        if (this.f29364n0 && i11 > 0 && this.f29334G == 0.0f && Math.abs(i11 - iArr[1]) > 0) {
            this.f29349V.setVisibility(8);
        }
        int[] iArr2 = this.f29337J;
        if (dispatchNestedPreScroll(i10 - iArr[0], i11 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        dispatchNestedScroll(i10, i11, i12, i13, this.f29338K);
        if (i13 + this.f29338K[1] >= 0 || c()) {
            return;
        }
        float fAbs = this.f29334G + Math.abs(r11);
        this.f29334G = fAbs;
        h(fAbs);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f29335H.b(view, view2, i10);
        startNestedScroll(i10 & 2);
        this.f29334G = 0.0f;
        this.f29339L = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return (!isEnabled() || this.f29347T || this.f29331D || (i10 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.f29335H.d(view);
        this.f29339L = false;
        float f10 = this.f29334G;
        if (f10 > 0.0f) {
            f(f10);
            this.f29334G = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f29347T && actionMasked == 0) {
            this.f29347T = false;
        }
        if (!isEnabled() || this.f29347T || c() || this.f29331D || this.f29339L) {
            return false;
        }
        if (actionMasked == 0) {
            this.f29345R = motionEvent.getPointerId(0);
            this.f29344Q = false;
        } else {
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f29345R);
                if (iFindPointerIndex < 0) {
                    Log.e(f29327r0, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f29344Q) {
                    float y10 = (motionEvent.getY(iFindPointerIndex) - this.f29342O) * 0.5f;
                    this.f29344Q = false;
                    f(y10);
                }
                this.f29345R = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f29345R);
                if (iFindPointerIndex2 < 0) {
                    Log.e(f29327r0, "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y11 = motionEvent.getY(iFindPointerIndex2);
                t(y11);
                if (this.f29344Q) {
                    float f10 = (y11 - this.f29342O) * 0.5f;
                    if (f10 <= 0.0f) {
                        return false;
                    }
                    h(f10);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        Log.e(f29327r0, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                        return false;
                    }
                    this.f29345R = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    p(motionEvent);
                }
            }
        }
        return true;
    }

    void q() {
        this.f29349V.clearAnimation();
        this.f29356f0.stop();
        this.f29349V.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f29346S) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f29353c0 - this.f29341N);
        }
        this.f29341N = this.f29349V.getTop();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        View view = this.f29329B;
        if (view == null || X.S(view)) {
            super.requestDisallowInterceptTouchEvent(z10);
        }
    }

    void setAnimationProgress(float f10) {
        this.f29349V.setScaleX(f10);
        this.f29349V.setScaleY(f10);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        e();
        this.f29356f0.f(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            iArr2[i10] = C3377a.c(context, iArr[i10]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i10) {
        this.f29333F = i10;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (z10) {
            return;
        }
        q();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        this.f29336I.m(z10);
    }

    public void setOnRefreshListener(j jVar) {
        this.f29330C = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i10) {
        setProgressBackgroundColorSchemeResource(i10);
    }

    public void setProgressBackgroundColorSchemeColor(int i10) {
        this.f29349V.setBackgroundColor(i10);
    }

    public void setProgressBackgroundColorSchemeResource(int i10) {
        setProgressBackgroundColorSchemeColor(C3377a.c(getContext(), i10));
    }

    public void setRefreshing(boolean z10) {
        if (!z10 || this.f29331D == z10) {
            r(z10, false);
            return;
        }
        this.f29331D = z10;
        setTargetOffsetTopAndBottom((!this.f29364n0 ? this.f29354d0 + this.f29353c0 : this.f29354d0) - this.f29341N);
        this.f29362l0 = false;
        y(this.f29365o0);
    }

    public void setSize(int i10) {
        if (i10 == 0 || i10 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i10 == 0) {
                this.f29363m0 = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f29363m0 = (int) (displayMetrics.density * 40.0f);
            }
            this.f29349V.setImageDrawable(null);
            this.f29356f0.l(i10);
            this.f29349V.setImageDrawable(this.f29356f0);
        }
    }

    public void setSlingshotDistance(int i10) {
        this.f29355e0 = i10;
    }

    void setTargetOffsetTopAndBottom(int i10) {
        this.f29349V.bringToFront();
        X.Y(this.f29349V, i10);
        this.f29341N = this.f29349V.getTop();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return this.f29336I.o(i10);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.f29336I.q();
    }

    void w(Animation.AnimationListener animationListener) {
        c cVar = new c();
        this.f29358h0 = cVar;
        cVar.setDuration(150L);
        this.f29349V.b(animationListener);
        this.f29349V.clearAnimation();
        this.f29349V.startAnimation(this.f29358h0);
    }

    class a implements Animation.AnimationListener {
        a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            j jVar;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f29331D) {
                swipeRefreshLayout.q();
                return;
            }
            swipeRefreshLayout.f29356f0.setAlpha(255);
            SwipeRefreshLayout.this.f29356f0.start();
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            if (swipeRefreshLayout2.f29362l0 && (jVar = swipeRefreshLayout2.f29330C) != null) {
                jVar.a();
            }
            SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
            swipeRefreshLayout3.f29341N = swipeRefreshLayout3.f29349V.getTop();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    class e implements Animation.AnimationListener {
        e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.f29346S) {
                return;
            }
            swipeRefreshLayout.w(null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public void setOnChildScrollUpCallback(i iVar) {
    }
}
