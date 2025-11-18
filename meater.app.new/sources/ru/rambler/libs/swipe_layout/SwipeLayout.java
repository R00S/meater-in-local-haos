package ru.rambler.libs.swipe_layout;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateInterpolator;
import da.C3085a;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;
import s1.G;
import s1.X;
import z1.d;

/* loaded from: classes3.dex */
public class SwipeLayout extends ViewGroup {

    /* renamed from: Q, reason: collision with root package name */
    private static final String f48584Q = "SwipeLayout";

    /* renamed from: B, reason: collision with root package name */
    private z1.d f48585B;

    /* renamed from: C, reason: collision with root package name */
    private View f48586C;

    /* renamed from: D, reason: collision with root package name */
    private View f48587D;

    /* renamed from: E, reason: collision with root package name */
    private View f48588E;

    /* renamed from: F, reason: collision with root package name */
    private float f48589F;

    /* renamed from: G, reason: collision with root package name */
    private float f48590G;

    /* renamed from: H, reason: collision with root package name */
    private c f48591H;

    /* renamed from: I, reason: collision with root package name */
    private WeakReference<ObjectAnimator> f48592I;

    /* renamed from: J, reason: collision with root package name */
    private final Map<View, Boolean> f48593J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f48594K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f48595L;

    /* renamed from: M, reason: collision with root package name */
    private int f48596M;

    /* renamed from: N, reason: collision with root package name */
    private float f48597N;

    /* renamed from: O, reason: collision with root package name */
    private float f48598O;

    /* renamed from: P, reason: collision with root package name */
    private final d.c f48599P;

    class a extends d.c {

        /* renamed from: a, reason: collision with root package name */
        private int f48600a;

        a() {
        }

        private int n(View view, int i10) {
            if (SwipeLayout.this.f48587D == null) {
                return Math.max(i10, view == SwipeLayout.this.f48588E ? 0 : -view.getWidth());
            }
            SwipeLayout swipeLayout = SwipeLayout.this;
            b bVarP = swipeLayout.p(swipeLayout.f48587D);
            int i11 = bVarP.f48605d;
            return i11 != -2 ? i11 != -1 ? Math.max(i10, ((SwipeLayout.this.getWidth() - SwipeLayout.this.f48587D.getLeft()) + view.getLeft()) - bVarP.f48605d) : Math.max(view.getLeft() - SwipeLayout.this.f48587D.getLeft(), i10) : Math.max(i10, ((SwipeLayout.this.getWidth() - SwipeLayout.this.f48587D.getLeft()) + view.getLeft()) - SwipeLayout.this.f48587D.getWidth());
        }

        private int o(View view, int i10) {
            if (SwipeLayout.this.f48586C == null) {
                return Math.min(i10, view == SwipeLayout.this.f48588E ? 0 : SwipeLayout.this.getWidth());
            }
            SwipeLayout swipeLayout = SwipeLayout.this;
            b bVarP = swipeLayout.p(swipeLayout.f48586C);
            int i11 = bVarP.f48605d;
            return i11 != -2 ? i11 != -1 ? Math.min(i10, (view.getLeft() - SwipeLayout.this.f48586C.getRight()) + bVarP.f48605d) : Math.min(i10, (SwipeLayout.this.getWidth() + view.getLeft()) - SwipeLayout.this.f48586C.getRight()) : Math.min(i10, view.getLeft() - SwipeLayout.this.f48586C.getLeft());
        }

        private int p(View view) {
            b bVarP = SwipeLayout.this.p(view);
            if (bVarP.f48603b == -2) {
                return -2;
            }
            return bVarP.f48603b == -1 ? view.getWidth() : bVarP.f48603b;
        }

        private boolean q(float f10, float f11, float f12) {
            return f12 >= f10 && f12 <= f11;
        }

        private boolean r(b bVar) {
            if (SwipeLayout.this.f48586C == null) {
                return false;
            }
            int i10 = bVar.f48605d;
            return i10 != -2 ? i10 != -1 ? SwipeLayout.this.f48586C.getRight() >= bVar.f48605d : SwipeLayout.this.f48586C.getRight() >= SwipeLayout.this.getWidth() : SwipeLayout.this.f48586C.getRight() >= SwipeLayout.this.f48586C.getWidth();
        }

        private boolean s(View view, int i10, float f10) {
            if ((-f10) > SwipeLayout.this.f48589F) {
                SwipeLayout.this.x(view, n(view, SwipeLayout.this.f48588E.getLeft() > 0 ? view.getLeft() - SwipeLayout.this.f48588E.getLeft() : -SwipeLayout.this.getWidth()), !(SwipeLayout.this.f48588E.getLeft() > 0), false);
                return true;
            }
            if (SwipeLayout.this.f48587D == null) {
                SwipeLayout.this.x(view, view.getLeft() - SwipeLayout.this.f48588E.getLeft(), false, false);
                return true;
            }
            SwipeLayout swipeLayout = SwipeLayout.this;
            b bVarP = swipeLayout.p(swipeLayout.f48587D);
            if (i10 < 0 && f10 <= 0.0f && u(bVarP)) {
                if (SwipeLayout.this.f48591H != null) {
                    SwipeLayout.this.f48591H.c(SwipeLayout.this, false);
                }
                return true;
            }
            if (i10 < 0 && f10 <= 0.0f && bVarP.f48606e != -1 && SwipeLayout.this.f48587D.getLeft() + bVarP.f48606e < SwipeLayout.this.getWidth()) {
                SwipeLayout.this.x(view, n(view, SwipeLayout.this.f48588E.getLeft() > 0 ? view.getLeft() - SwipeLayout.this.f48588E.getLeft() : -SwipeLayout.this.getWidth()), true, false);
                return true;
            }
            if (bVarP.f48603b != -2) {
                int width = bVarP.f48603b == -1 ? SwipeLayout.this.f48587D.getWidth() : bVarP.f48603b;
                float f11 = width * bVarP.f48604c;
                if (q(-f11, f11, (SwipeLayout.this.f48588E.getRight() + width) - SwipeLayout.this.getWidth())) {
                    SwipeLayout.this.x(view, ((view.getLeft() - SwipeLayout.this.f48587D.getLeft()) + SwipeLayout.this.getWidth()) - width, (bVarP.f48605d == -2 && width == SwipeLayout.this.f48587D.getWidth()) || bVarP.f48605d == width || (bVarP.f48605d == -1 && width == SwipeLayout.this.getWidth()), false);
                    return true;
                }
            }
            return false;
        }

        private boolean t(View view, int i10, float f10) {
            if (f10 > SwipeLayout.this.f48589F) {
                SwipeLayout.this.x(view, o(view, SwipeLayout.this.f48588E.getLeft() < 0 ? view.getLeft() - SwipeLayout.this.f48588E.getLeft() : SwipeLayout.this.getWidth()), !(SwipeLayout.this.f48588E.getLeft() < 0), true);
                return true;
            }
            if (SwipeLayout.this.f48586C == null) {
                SwipeLayout.this.x(view, view.getLeft() - SwipeLayout.this.f48588E.getLeft(), false, true);
                return true;
            }
            SwipeLayout swipeLayout = SwipeLayout.this;
            b bVarP = swipeLayout.p(swipeLayout.f48586C);
            if (i10 > 0 && f10 >= 0.0f && r(bVarP)) {
                if (SwipeLayout.this.f48591H != null) {
                    SwipeLayout.this.f48591H.c(SwipeLayout.this, true);
                }
                return true;
            }
            if (i10 > 0 && f10 >= 0.0f && bVarP.f48606e != -1 && SwipeLayout.this.f48586C.getRight() > bVarP.f48606e) {
                SwipeLayout.this.x(view, o(view, SwipeLayout.this.f48588E.getLeft() < 0 ? view.getLeft() - SwipeLayout.this.f48588E.getLeft() : SwipeLayout.this.getWidth()), true, true);
                return true;
            }
            if (bVarP.f48603b != -2) {
                int width = bVarP.f48603b == -1 ? SwipeLayout.this.f48586C.getWidth() : bVarP.f48603b;
                float f11 = width * bVarP.f48604c;
                if (q(-f11, f11, SwipeLayout.this.f48588E.getLeft() - width)) {
                    if ((bVarP.f48605d == -2 && width == SwipeLayout.this.f48586C.getWidth()) || bVarP.f48605d == width || (bVarP.f48605d == -1 && width == SwipeLayout.this.getWidth())) {
                        z = true;
                    }
                    SwipeLayout.this.x(view, (view.getLeft() - SwipeLayout.this.f48588E.getLeft()) + width, z, true);
                    return true;
                }
            }
            return false;
        }

        private boolean u(b bVar) {
            if (SwipeLayout.this.f48587D == null) {
                return false;
            }
            int i10 = bVar.f48605d;
            return i10 != -2 ? i10 != -1 ? SwipeLayout.this.f48587D.getLeft() + bVar.f48605d <= SwipeLayout.this.getWidth() : SwipeLayout.this.f48587D.getRight() <= SwipeLayout.this.getWidth() : SwipeLayout.this.f48587D.getRight() <= SwipeLayout.this.getWidth();
        }

        @Override // z1.d.c
        public int a(View view, int i10, int i11) {
            return i11 > 0 ? o(view, i10) : n(view, i10);
        }

        @Override // z1.d.c
        public int d(View view) {
            return SwipeLayout.this.getWidth();
        }

        @Override // z1.d.c
        public void k(View view, int i10, int i11, int i12, int i13) {
            int iP;
            int iP2;
            int iP3;
            int iP4;
            SwipeLayout.this.v(view, i12);
            if (SwipeLayout.this.f48591H == null) {
                return;
            }
            if (i12 > 0) {
                if (SwipeLayout.this.f48586C != null && (iP4 = p(SwipeLayout.this.f48586C)) != -2 && SwipeLayout.this.f48586C.getRight() - iP4 > 0 && (SwipeLayout.this.f48586C.getRight() - iP4) - i12 <= 0) {
                    SwipeLayout.this.f48591H.b(SwipeLayout.this, true);
                }
                if (SwipeLayout.this.f48587D == null || (iP3 = p(SwipeLayout.this.f48587D)) == -2 || SwipeLayout.this.f48587D.getLeft() + iP3 <= SwipeLayout.this.getWidth() || (SwipeLayout.this.f48587D.getLeft() + iP3) - i12 > SwipeLayout.this.getWidth()) {
                    return;
                }
                SwipeLayout.this.f48591H.a(SwipeLayout.this, true);
                return;
            }
            if (i12 < 0) {
                if (SwipeLayout.this.f48586C != null && (iP2 = p(SwipeLayout.this.f48586C)) != -2 && SwipeLayout.this.f48586C.getRight() - iP2 <= 0 && (SwipeLayout.this.f48586C.getRight() - iP2) - i12 > 0) {
                    SwipeLayout.this.f48591H.b(SwipeLayout.this, false);
                }
                if (SwipeLayout.this.f48587D == null || (iP = p(SwipeLayout.this.f48587D)) == -2 || SwipeLayout.this.f48587D.getLeft() + iP > SwipeLayout.this.getWidth() || (SwipeLayout.this.f48587D.getLeft() + iP) - i12 <= SwipeLayout.this.getWidth()) {
                    return;
                }
                SwipeLayout.this.f48591H.a(SwipeLayout.this, false);
            }
        }

        @Override // z1.d.c
        public void l(View view, float f10, float f11) {
            Log.d(SwipeLayout.f48584Q, "VELOCITY " + f10 + "; THRESHOLD " + SwipeLayout.this.f48589F);
            int left = view.getLeft() - this.f48600a;
            if (left == 0) {
                return;
            }
            if (left > 0 ? f10 >= 0.0f ? t(view, left, f10) : s(view, left, f10) : f10 <= 0.0f ? s(view, left, f10) : t(view, left, f10)) {
                return;
            }
            SwipeLayout.this.x(view, view.getLeft() - SwipeLayout.this.f48588E.getLeft(), false, left > 0);
        }

        @Override // z1.d.c
        public boolean m(View view, int i10) {
            this.f48600a = view.getLeft();
            return true;
        }
    }

    public interface c {
        void a(SwipeLayout swipeLayout, boolean z10);

        void b(SwipeLayout swipeLayout, boolean z10);

        void c(SwipeLayout swipeLayout, boolean z10);

        void d(SwipeLayout swipeLayout, boolean z10);
    }

    private class d implements Runnable {

        /* renamed from: B, reason: collision with root package name */
        private final View f48607B;

        /* renamed from: C, reason: collision with root package name */
        private final boolean f48608C;

        /* renamed from: D, reason: collision with root package name */
        private final boolean f48609D;

        d(View view, boolean z10, boolean z11) {
            this.f48607B = view;
            this.f48608C = z10;
            this.f48609D = z11;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SwipeLayout.this.f48585B != null && SwipeLayout.this.f48585B.l(true)) {
                X.f0(this.f48607B, this);
                return;
            }
            Log.d(SwipeLayout.f48584Q, "ONSWIPE clamp: " + this.f48608C + " ; moveToRight: " + this.f48609D);
            if (!this.f48608C || SwipeLayout.this.f48591H == null) {
                return;
            }
            SwipeLayout.this.f48591H.c(SwipeLayout.this, this.f48609D);
        }
    }

    public SwipeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f48593J = new WeakHashMap();
        this.f48594K = true;
        this.f48595L = true;
        this.f48596M = 0;
        this.f48599P = new a();
        r(context, attributeSet);
    }

    private void l() {
        ObjectAnimator objectAnimator;
        WeakReference<ObjectAnimator> weakReference = this.f48592I;
        if (weakReference == null || (objectAnimator = weakReference.get()) == null) {
            return;
        }
        this.f48592I.clear();
        if (objectAnimator.isRunning()) {
            objectAnimator.end();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b p(View view) {
        return (b) view.getLayoutParams();
    }

    private void q() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof G) {
                View view = (View) parent;
                this.f48593J.put(view, Boolean.valueOf(view.isEnabled()));
            }
        }
    }

    private void r(Context context, AttributeSet attributeSet) {
        this.f48585B = z1.d.m(this, 1.0f, this.f48599P);
        this.f48589F = TypedValue.applyDimension(1, 1500.0f, getResources().getDisplayMetrics());
        this.f48590G = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3085a.f39842j0);
            int i10 = C3085a.f39858r0;
            if (typedArrayObtainStyledAttributes.hasValue(i10)) {
                this.f48594K = typedArrayObtainStyledAttributes.getBoolean(i10, true);
                this.f48595L = typedArrayObtainStyledAttributes.getBoolean(i10, true);
            }
            int i11 = C3085a.f39850n0;
            if (typedArrayObtainStyledAttributes.hasValue(i11)) {
                this.f48594K = typedArrayObtainStyledAttributes.getBoolean(i11, true);
            }
            int i12 = C3085a.f39852o0;
            if (typedArrayObtainStyledAttributes.hasValue(i12)) {
                this.f48595L = typedArrayObtainStyledAttributes.getBoolean(i12, true);
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private boolean s(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            w(motionEvent);
        }
        return this.f48585B.H(motionEvent);
    }

    private void u(int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingTop = getPaddingTop();
        this.f48588E = null;
        this.f48586C = null;
        this.f48587D = null;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                int i15 = ((b) childAt.getLayoutParams()).f48602a;
                if (i15 == -1) {
                    this.f48586C = childAt;
                } else if (i15 == 0) {
                    this.f48588E = childAt;
                } else if (i15 == 1) {
                    this.f48587D = childAt;
                }
            }
        }
        if (this.f48588E == null) {
            throw new RuntimeException("Center view must be added");
        }
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt2 = getChildAt(i16);
            if (childAt2.getVisibility() != 8) {
                b bVar = (b) childAt2.getLayoutParams();
                int measuredWidth = childAt2.getMeasuredWidth();
                int measuredHeight = childAt2.getMeasuredHeight();
                int i17 = bVar.f48602a;
                int left = i17 != -1 ? i17 != 1 ? childAt2.getLeft() : this.f48588E.getRight() : this.f48588E.getLeft() - measuredWidth;
                childAt2.layout(left, paddingTop, measuredWidth + left, measuredHeight + paddingTop);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(View view, int i10) {
        if (i10 == 0) {
            return;
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt != view) {
                childAt.offsetLeftAndRight(i10);
                invalidate(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
            }
        }
    }

    private void w(MotionEvent motionEvent) {
        this.f48596M = 0;
        this.f48597N = motionEvent.getX();
        this.f48598O = motionEvent.getY();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(View view, int i10, boolean z10, boolean z11) {
        c cVar;
        if (this.f48585B.G(i10, view.getTop())) {
            X.f0(view, new d(view, z10, z11));
        } else {
            if (!z10 || (cVar = this.f48591H) == null) {
                return;
            }
            cVar.c(this, z11);
        }
    }

    private void y() {
        for (Map.Entry<View, Boolean> entry : this.f48593J.entrySet()) {
            View key = entry.getKey();
            if (key != null) {
                key.setEnabled(entry.getValue().booleanValue());
            }
        }
        this.f48593J.clear();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    public int getOffset() {
        View view = this.f48588E;
        if (view == null) {
            return 0;
        }
        return view.getLeft();
    }

    public void k() {
        if (this.f48588E == null) {
            return;
        }
        l();
        this.f48585B.a();
        ObjectAnimator objectAnimator = new ObjectAnimator();
        objectAnimator.setTarget(this);
        objectAnimator.setPropertyName("offset");
        objectAnimator.setInterpolator(new AccelerateInterpolator());
        objectAnimator.setIntValues(this.f48588E.getLeft(), 0);
        objectAnimator.setDuration(200L);
        objectAnimator.start();
        this.f48592I = new WeakReference<>(objectAnimator);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public b generateDefaultLayoutParams() {
        return new b(-1, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public b generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return t() ? s(motionEvent) : super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        u(i10, i11, i12, i13);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int iMax;
        int childCount = getChildCount();
        if (View.MeasureSpec.getMode(i11) == 1073741824) {
            measureChildren(i10, i11);
            iMax = 0;
        } else {
            iMax = 0;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                measureChild(childAt, i10, i11);
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
            }
            if (iMax > 0) {
                i11 = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                measureChildren(i10, i11);
            }
        }
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt2 = getChildAt(i13);
            if (childAt2.getVisibility() != 8) {
                iMax = Math.max(iMax, childAt2.getMeasuredHeight());
            }
        }
        setMeasuredDimension(View.resolveSize(getSuggestedMinimumWidth(), i10), View.resolveSize(Math.max(iMax + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11));
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x008f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = super.onTouchEvent(r10)
            boolean r1 = r9.t()
            if (r1 != 0) goto Lb
            return r0
        Lb:
            int r1 = r10.getActionMasked()
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L9c
            r4 = 0
            if (r1 == r3) goto L8f
            if (r1 == r2) goto L1d
            r0 = 3
            if (r1 == r0) goto L8f
            goto L9f
        L1d:
            int r1 = r9.f48596M
            if (r1 != 0) goto L9f
            float r1 = r10.getX()
            float r5 = r9.f48597N
            float r1 = r1 - r5
            float r1 = java.lang.Math.abs(r1)
            float r5 = r10.getY()
            float r6 = r9.f48598O
            float r5 = r5 - r6
            float r5 = java.lang.Math.abs(r5)
            float r6 = r10.getX()
            float r7 = r9.f48597N
            float r6 = r6 - r7
            r7 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L45
            r6 = r3
            goto L46
        L45:
            r6 = r4
        L46:
            if (r6 == 0) goto L4c
            boolean r8 = r9.f48594K
            if (r8 == 0) goto L52
        L4c:
            if (r6 != 0) goto L59
            boolean r6 = r9.f48595L
            if (r6 != 0) goto L59
        L52:
            int r6 = r9.getOffset()
            if (r6 != 0) goto L59
            return r0
        L59:
            float r0 = r9.f48590G
            int r6 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r6 >= 0) goto L63
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L9f
        L63:
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 == 0) goto L71
            float r1 = r1 / r5
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L6f
            goto L71
        L6f:
            r0 = r2
            goto L72
        L71:
            r0 = r3
        L72:
            r9.f48596M = r0
            if (r0 != r3) goto L9f
            r9.requestDisallowInterceptTouchEvent(r3)
            r9.q()
            ru.rambler.libs.swipe_layout.SwipeLayout$c r0 = r9.f48591H
            if (r0 == 0) goto L9f
            float r1 = r10.getX()
            float r5 = r9.f48597N
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto L8b
            r4 = r3
        L8b:
            r0.d(r9, r4)
            goto L9f
        L8f:
            int r0 = r9.f48596M
            if (r0 != r3) goto L99
            r9.y()
            r9.requestDisallowInterceptTouchEvent(r4)
        L99:
            r9.f48596M = r4
            goto L9f
        L9c:
            r9.w(r10)
        L9f:
            int r0 = r10.getActionMasked()
            if (r0 != r2) goto La9
            int r0 = r9.f48596M
            if (r0 != r3) goto Lae
        La9:
            z1.d r0 = r9.f48585B
            r0.A(r10)
        Lae:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.rambler.libs.swipe_layout.SwipeLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setLeftSwipeEnabled(boolean z10) {
        this.f48594K = z10;
    }

    public void setOffset(int i10) {
        View view = this.f48588E;
        if (view != null) {
            v(null, i10 - view.getLeft());
        }
    }

    public void setOnSwipeListener(c cVar) {
        this.f48591H = cVar;
    }

    public void setRightSwipeEnabled(boolean z10) {
        this.f48595L = z10;
    }

    public void setSwipeEnabled(boolean z10) {
        this.f48594K = z10;
        this.f48595L = z10;
    }

    public boolean t() {
        return this.f48594K || this.f48595L;
    }

    public static class b extends ViewGroup.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        private int f48602a;

        /* renamed from: b, reason: collision with root package name */
        private int f48603b;

        /* renamed from: c, reason: collision with root package name */
        private float f48604c;

        /* renamed from: d, reason: collision with root package name */
        private int f48605d;

        /* renamed from: e, reason: collision with root package name */
        private int f48606e;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f48602a = 0;
            this.f48604c = 0.9f;
            this.f48605d = -2;
            this.f48606e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3085a.f39842j0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == C3085a.f39848m0) {
                    this.f48602a = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == C3085a.f39854p0) {
                    this.f48603b = typedArrayObtainStyledAttributes.getLayoutDimension(index, -1);
                } else if (index == C3085a.f39846l0) {
                    this.f48605d = typedArrayObtainStyledAttributes.getLayoutDimension(index, -2);
                } else if (index == C3085a.f39844k0) {
                    this.f48606e = typedArrayObtainStyledAttributes.getLayoutDimension(index, -1);
                } else if (index == C3085a.f39856q0) {
                    this.f48604c = typedArrayObtainStyledAttributes.getFloat(index, 0.9f);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f48602a = 0;
            this.f48604c = 0.9f;
            this.f48605d = -2;
            this.f48606e = -1;
        }

        public b(int i10, int i11) {
            super(i10, i11);
            this.f48602a = 0;
            this.f48604c = 0.9f;
            this.f48605d = -2;
            this.f48606e = -1;
        }
    }
}
