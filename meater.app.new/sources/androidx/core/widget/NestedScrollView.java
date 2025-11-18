package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.C0280a;
import androidx.core.view.C0301k;
import androidx.core.view.C0305o;
import androidx.core.view.C0311u;
import androidx.core.view.InterfaceC0300j;
import androidx.core.view.InterfaceC0303m;
import androidx.core.view.ScrollingView;
import androidx.core.view.p004d0.C0289c;
import androidx.core.view.p004d0.C0291e;
import p024c.p052i.C0919a;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0303m, InterfaceC0300j, ScrollingView {

    /* renamed from: f */
    private static final C0318a f2447f = new C0318a();

    /* renamed from: g */
    private static final int[] f2448g = {R.attr.fillViewport};

    /* renamed from: A */
    private int f2449A;

    /* renamed from: B */
    private int f2450B;

    /* renamed from: C */
    private SavedState f2451C;

    /* renamed from: D */
    private final C0305o f2452D;

    /* renamed from: E */
    private final C0301k f2453E;

    /* renamed from: F */
    private float f2454F;

    /* renamed from: G */
    private InterfaceC0319b f2455G;

    /* renamed from: h */
    private long f2456h;

    /* renamed from: i */
    private final Rect f2457i;

    /* renamed from: j */
    private OverScroller f2458j;

    /* renamed from: k */
    private EdgeEffect f2459k;

    /* renamed from: l */
    private EdgeEffect f2460l;

    /* renamed from: m */
    private int f2461m;

    /* renamed from: n */
    private boolean f2462n;

    /* renamed from: o */
    private boolean f2463o;

    /* renamed from: p */
    private View f2464p;

    /* renamed from: q */
    private boolean f2465q;

    /* renamed from: r */
    private VelocityTracker f2466r;

    /* renamed from: s */
    private boolean f2467s;

    /* renamed from: t */
    private boolean f2468t;

    /* renamed from: u */
    private int f2469u;

    /* renamed from: v */
    private int f2470v;

    /* renamed from: w */
    private int f2471w;

    /* renamed from: x */
    private int f2472x;

    /* renamed from: y */
    private final int[] f2473y;

    /* renamed from: z */
    private final int[] f2474z;

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0317a();

        /* renamed from: f */
        public int f2475f;

        /* renamed from: androidx.core.widget.NestedScrollView$SavedState$a */
        class C0317a implements Parcelable.Creator<SavedState> {
            C0317a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f2475f + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f2475f);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f2475f = parcel.readInt();
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$a */
    static class C0318a extends C0280a {
        C0318a() {
        }

        @Override // androidx.core.view.C0280a
        /* renamed from: f */
        public void mo1857f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo1857f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C0291e.m2029a(accessibilityEvent, nestedScrollView.getScrollX());
            C0291e.m2030b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // androidx.core.view.C0280a
        /* renamed from: g */
        public void mo1858g(View view, C0289c c0289c) {
            int scrollRange;
            super.mo1858g(view, c0289c);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            c0289c.m1970Y(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            c0289c.m2001r0(true);
            if (nestedScrollView.getScrollY() > 0) {
                c0289c.m1974b(C0289c.a.f2361n);
                c0289c.m1974b(C0289c.a.f2372y);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                c0289c.m1974b(C0289c.a.f2360m);
                c0289c.m1974b(C0289c.a.f2335A);
            }
        }

        @Override // androidx.core.view.C0280a
        /* renamed from: j */
        public boolean mo1861j(View view, int i2, Bundle bundle) {
            if (super.mo1861j(view, i2, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i2 != 4096) {
                if (i2 == 8192 || i2 == 16908344) {
                    int iMax = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (iMax == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.m2258O(0, iMax, true);
                    return true;
                }
                if (i2 != 16908346) {
                    return false;
                }
            }
            int iMin = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (iMin == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.m2258O(0, iMin, true);
            return true;
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$b */
    public interface InterfaceC0319b {
        /* renamed from: a */
        void mo211a(NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0919a.f6194b);
    }

    /* renamed from: A */
    private static boolean m2232A(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m2232A((View) parent, view2);
    }

    /* renamed from: B */
    private boolean m2233B(View view, int i2, int i3) {
        view.getDrawingRect(this.f2457i);
        offsetDescendantRectToMyCoords(view, this.f2457i);
        return this.f2457i.bottom + i2 >= getScrollY() && this.f2457i.top - i2 <= getScrollY() + i3;
    }

    /* renamed from: C */
    private void m2234C(int i2, int i3, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i2);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f2453E.m2064e(0, scrollY2, 0, i2 - scrollY2, null, i3, iArr);
    }

    /* renamed from: D */
    private void m2235D(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2472x) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.f2461m = (int) motionEvent.getY(i2);
            this.f2472x = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.f2466r;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: G */
    private void m2236G() {
        VelocityTracker velocityTracker = this.f2466r;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2466r = null;
        }
    }

    /* renamed from: H */
    private void m2237H(boolean z) {
        if (z) {
            m2259P(2, 1);
        } else {
            m2260Q(1);
        }
        this.f2450B = getScrollY();
        C0311u.m2113Z(this);
    }

    /* renamed from: I */
    private boolean m2238I(int i2, int i3, int i4) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = height + scrollY;
        boolean z = false;
        boolean z2 = i2 == 33;
        View viewM2248r = m2248r(z2, i3, i4);
        if (viewM2248r == null) {
            viewM2248r = this;
        }
        if (i3 < scrollY || i4 > i5) {
            m2245h(z2 ? i3 - scrollY : i4 - i5);
            z = true;
        }
        if (viewM2248r != findFocus()) {
            viewM2248r.requestFocus(i2);
        }
        return z;
    }

    /* renamed from: J */
    private void m2239J(View view) {
        view.getDrawingRect(this.f2457i);
        offsetDescendantRectToMyCoords(view, this.f2457i);
        int iM2262e = m2262e(this.f2457i);
        if (iM2262e != 0) {
            scrollBy(0, iM2262e);
        }
    }

    /* renamed from: K */
    private boolean m2240K(Rect rect, boolean z) {
        int iM2262e = m2262e(rect);
        boolean z2 = iM2262e != 0;
        if (z2) {
            if (z) {
                scrollBy(0, iM2262e);
            } else {
                m2256L(0, iM2262e);
            }
        }
        return z2;
    }

    /* renamed from: M */
    private void m2241M(int i2, int i3, int i4, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f2456h > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f2458j.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i3 + scrollY, Math.max(0, height - height2))) - scrollY, i4);
            m2237H(z);
        } else {
            if (!this.f2458j.isFinished()) {
                m2242a();
            }
            scrollBy(i2, i3);
        }
        this.f2456h = AnimationUtils.currentAnimationTimeMillis();
    }

    /* renamed from: a */
    private void m2242a() {
        this.f2458j.abortAnimation();
        m2260Q(1);
    }

    /* renamed from: c */
    private boolean m2243c() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    /* renamed from: d */
    private static int m2244d(int i2, int i3, int i4) {
        if (i3 >= i4 || i2 < 0) {
            return 0;
        }
        return i3 + i2 > i4 ? i4 - i3 : i2;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f2454F == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f2454F = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f2454F;
    }

    /* renamed from: h */
    private void m2245h(int i2) {
        if (i2 != 0) {
            if (this.f2468t) {
                m2256L(0, i2);
            } else {
                scrollBy(0, i2);
            }
        }
    }

    /* renamed from: i */
    private void m2246i() {
        this.f2465q = false;
        m2236G();
        m2260Q(0);
        EdgeEffect edgeEffect = this.f2459k;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f2460l.onRelease();
        }
    }

    /* renamed from: p */
    private void m2247p() {
        if (getOverScrollMode() == 2) {
            this.f2459k = null;
            this.f2460l = null;
        } else if (this.f2459k == null) {
            Context context = getContext();
            this.f2459k = new EdgeEffect(context);
            this.f2460l = new EdgeEffect(context);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.view.View m2248r(boolean r13, int r14, int r15) {
        /*
            r12 = this;
            r0 = 2
            java.util.ArrayList r0 = r12.getFocusables(r0)
            int r1 = r0.size()
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
        Ld:
            if (r4 >= r1) goto L53
            java.lang.Object r6 = r0.get(r4)
            android.view.View r6 = (android.view.View) r6
            int r7 = r6.getTop()
            int r8 = r6.getBottom()
            r9 = 1
            if (r14 >= r8) goto L50
            if (r7 >= r15) goto L50
            if (r14 >= r7) goto L28
            if (r8 >= r15) goto L28
            r10 = 1
            goto L29
        L28:
            r10 = 0
        L29:
            if (r3 != 0) goto L2e
            r3 = r6
            r5 = r10
            goto L50
        L2e:
            if (r13 == 0) goto L36
            int r11 = r3.getTop()
            if (r7 < r11) goto L3e
        L36:
            if (r13 != 0) goto L40
            int r7 = r3.getBottom()
            if (r8 <= r7) goto L40
        L3e:
            r7 = 1
            goto L41
        L40:
            r7 = 0
        L41:
            if (r5 == 0) goto L48
            if (r10 == 0) goto L50
            if (r7 == 0) goto L50
            goto L4f
        L48:
            if (r10 == 0) goto L4d
            r3 = r6
            r5 = 1
            goto L50
        L4d:
            if (r7 == 0) goto L50
        L4f:
            r3 = r6
        L50:
            int r4 = r4 + 1
            goto Ld
        L53:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.m2248r(boolean, int, int):android.view.View");
    }

    /* renamed from: v */
    private boolean m2249v(int i2, int i3) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i3 >= childAt.getTop() - scrollY && i3 < childAt.getBottom() - scrollY && i2 >= childAt.getLeft() && i2 < childAt.getRight();
    }

    /* renamed from: w */
    private void m2250w() {
        VelocityTracker velocityTracker = this.f2466r;
        if (velocityTracker == null) {
            this.f2466r = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* renamed from: x */
    private void m2251x() {
        this.f2458j = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f2469u = viewConfiguration.getScaledTouchSlop();
        this.f2470v = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2471w = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* renamed from: y */
    private void m2252y() {
        if (this.f2466r == null) {
            this.f2466r = VelocityTracker.obtain();
        }
    }

    /* renamed from: z */
    private boolean m2253z(View view) {
        return !m2233B(view, 0, getHeight());
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083 A[ADDED_TO_REGION] */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    boolean m2254E(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = 0
        L21:
            if (r1 == 0) goto L2a
            if (r1 != r5) goto L28
            if (r2 == 0) goto L28
            goto L2a
        L28:
            r2 = 0
            goto L2b
        L2a:
            r2 = 1
        L2b:
            if (r1 == 0) goto L34
            if (r1 != r5) goto L32
            if (r3 == 0) goto L32
            goto L34
        L32:
            r1 = 0
            goto L35
        L34:
            r1 = 1
        L35:
            int r3 = r15 + r13
            if (r2 != 0) goto L3b
            r2 = 0
            goto L3d
        L3b:
            r2 = r19
        L3d:
            int r6 = r16 + r14
            if (r1 != 0) goto L43
            r1 = 0
            goto L45
        L43:
            r1 = r20
        L45:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L50
            r3 = r2
        L4e:
            r2 = 1
            goto L55
        L50:
            if (r3 >= r7) goto L54
            r3 = r7
            goto L4e
        L54:
            r2 = 0
        L55:
            if (r6 <= r1) goto L5a
            r6 = r1
        L58:
            r1 = 1
            goto L5f
        L5a:
            if (r6 >= r8) goto L5e
            r6 = r8
            goto L58
        L5e:
            r1 = 0
        L5f:
            if (r1 == 0) goto L7e
            boolean r7 = r12.m2268u(r5)
            if (r7 != 0) goto L7e
            android.widget.OverScroller r7 = r0.f2458j
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r7
            r14 = r3
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L7e:
            r12.onOverScrolled(r3, r6, r2, r1)
            if (r2 != 0) goto L85
            if (r1 == 0) goto L86
        L85:
            r4 = 1
        L86:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.m2254E(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    /* renamed from: F */
    public boolean m2255F(int i2) {
        boolean z = i2 == 130;
        int height = getHeight();
        if (z) {
            this.f2457i.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f2457i;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f2457i.top = getScrollY() - height;
            Rect rect2 = this.f2457i;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f2457i;
        int i3 = rect3.top;
        int i4 = height + i3;
        rect3.bottom = i4;
        return m2238I(i2, i3, i4);
    }

    /* renamed from: L */
    public final void m2256L(int i2, int i3) {
        m2241M(i2, i3, 250, false);
    }

    /* renamed from: N */
    void m2257N(int i2, int i3, int i4, boolean z) {
        m2241M(i2 - getScrollX(), i3 - getScrollY(), i4, z);
    }

    /* renamed from: O */
    void m2258O(int i2, int i3, boolean z) {
        m2257N(i2, i3, 250, z);
    }

    /* renamed from: P */
    public boolean m2259P(int i2, int i3) {
        return this.f2453E.m2072q(i2, i3);
    }

    /* renamed from: Q */
    public void m2260Q(int i2) {
        this.f2453E.m2074s(i2);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    /* renamed from: b */
    public boolean m2261b(int i2) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i2);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !m2233B(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i2 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i2 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i2 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m2245h(maxScrollAmount);
        } else {
            viewFindNextFocus.getDrawingRect(this.f2457i);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.f2457i);
            m2245h(m2262e(this.f2457i));
            viewFindNextFocus.requestFocus(i2);
        }
        if (viewFindFocus == null || !viewFindFocus.isFocused() || !m2253z(viewFindFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f2458j.isFinished()) {
            return;
        }
        this.f2458j.computeScrollOffset();
        int currY = this.f2458j.getCurrY();
        int i2 = currY - this.f2450B;
        this.f2450B = currY;
        int[] iArr = this.f2474z;
        boolean z = false;
        iArr[1] = 0;
        m2263f(0, i2, iArr, null, 1);
        int i3 = i2 - this.f2474z[1];
        int scrollRange = getScrollRange();
        if (i3 != 0) {
            int scrollY = getScrollY();
            m2254E(0, i3, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i4 = i3 - scrollY2;
            int[] iArr2 = this.f2474z;
            iArr2[1] = 0;
            m2264g(0, scrollY2, 0, i4, this.f2473y, 1, iArr2);
            i3 = i4 - this.f2474z[1];
        }
        if (i3 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                z = true;
            }
            if (z) {
                m2247p();
                if (i3 < 0) {
                    if (this.f2459k.isFinished()) {
                        this.f2459k.onAbsorb((int) this.f2458j.getCurrVelocity());
                    }
                } else if (this.f2460l.isFinished()) {
                    this.f2460l.onAbsorb((int) this.f2458j.getCurrVelocity());
                }
            }
            m2242a();
        }
        if (this.f2458j.isFinished()) {
            m2260Q(1);
        } else {
            C0311u.m2113Z(this);
        }
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m2265q(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f2, float f3, boolean z) {
        return this.f2453E.m2060a(f2, f3, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f2, float f3) {
        return this.f2453E.m2061b(f2, f3);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return m2263f(i2, i3, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.f2453E.m2065f(i2, i3, i4, i5, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        if (this.f2459k != null) {
            int scrollY = getScrollY();
            int paddingLeft2 = 0;
            if (!this.f2459k.isFinished()) {
                int iSave = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int iMin = Math.min(0, scrollY);
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 21 || getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    paddingLeft = getPaddingLeft() + 0;
                } else {
                    paddingLeft = 0;
                }
                if (i2 >= 21 && getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    iMin += getPaddingTop();
                }
                canvas.translate(paddingLeft, iMin);
                this.f2459k.setSize(width, height);
                if (this.f2459k.draw(canvas)) {
                    C0311u.m2113Z(this);
                }
                canvas.restoreToCount(iSave);
            }
            if (this.f2460l.isFinished()) {
                return;
            }
            int iSave2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int iMax = Math.max(getScrollRange(), scrollY) + height2;
            int i3 = Build.VERSION.SDK_INT;
            if (i3 < 21 || getClipToPadding()) {
                width2 -= getPaddingLeft() + getPaddingRight();
                paddingLeft2 = 0 + getPaddingLeft();
            }
            if (i3 >= 21 && getClipToPadding()) {
                height2 -= getPaddingTop() + getPaddingBottom();
                iMax -= getPaddingBottom();
            }
            canvas.translate(paddingLeft2 - width2, iMax);
            canvas.rotate(180.0f, width2, 0.0f);
            this.f2460l.setSize(width2, height2);
            if (this.f2460l.draw(canvas)) {
                C0311u.m2113Z(this);
            }
            canvas.restoreToCount(iSave2);
        }
    }

    /* renamed from: e */
    protected int m2262e(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i2 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i3 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i2 - verticalFadingEdgeLength : i2;
        int i4 = rect.bottom;
        if (i4 > i3 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i3) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i2);
        }
        if (rect.top >= scrollY || i4 >= i3) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i3 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    /* renamed from: f */
    public boolean m2263f(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return this.f2453E.m2063d(i2, i3, iArr, iArr2, i4);
    }

    /* renamed from: g */
    public void m2264g(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        this.f2453E.m2064e(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f2452D.m2075a();
    }

    int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return m2268u(0);
    }

    @Override // android.view.View, androidx.core.view.InterfaceC0300j
    public boolean isNestedScrollingEnabled() {
        return this.f2453E.m2069m();
    }

    @Override // androidx.core.view.InterfaceC0303m
    /* renamed from: j */
    public void mo693j(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        m2234C(i5, i6, iArr);
    }

    @Override // androidx.core.view.InterfaceC0302l
    /* renamed from: k */
    public void mo694k(View view, int i2, int i3, int i4, int i5, int i6) {
        m2234C(i5, i6, null);
    }

    @Override // androidx.core.view.InterfaceC0302l
    /* renamed from: l */
    public boolean mo695l(View view, View view2, int i2, int i3) {
        return (i2 & 2) != 0;
    }

    @Override // androidx.core.view.InterfaceC0302l
    /* renamed from: m */
    public void mo696m(View view, View view2, int i2, int i3) {
        this.f2452D.m2077c(view, view2, i2, i3);
        m2259P(2, i3);
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i2, int i3) {
        view.measure(FrameLayout.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // androidx.core.view.InterfaceC0302l
    /* renamed from: n */
    public void mo697n(View view, int i2) {
        this.f2452D.m2079e(view, i2);
        m2260Q(i2);
    }

    @Override // androidx.core.view.InterfaceC0302l
    /* renamed from: o */
    public void mo698o(View view, int i2, int i3, int[] iArr, int i4) {
        m2263f(i2, i3, iArr, null, i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2463o = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f2465q) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i2 = scrollY - verticalScrollFactorCompat;
                if (i2 < 0) {
                    scrollRange = 0;
                } else if (i2 <= scrollRange) {
                    scrollRange = i2;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getAction()
            r1 = 2
            r2 = 1
            if (r0 != r1) goto Ld
            boolean r3 = r11.f2465q
            if (r3 == 0) goto Ld
            return r2
        Ld:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3 = 0
            if (r0 == 0) goto La2
            r4 = -1
            if (r0 == r2) goto L7d
            if (r0 == r1) goto L24
            r1 = 3
            if (r0 == r1) goto L7d
            r1 = 6
            if (r0 == r1) goto L1f
            goto Ld9
        L1f:
            r11.m2235D(r12)
            goto Ld9
        L24:
            int r0 = r11.f2472x
            if (r0 != r4) goto L2a
            goto Ld9
        L2a:
            int r5 = r12.findPointerIndex(r0)
            if (r5 != r4) goto L4d
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r1 = "Invalid pointerId="
            r12.append(r1)
            r12.append(r0)
            java.lang.String r0 = " in onInterceptTouchEvent"
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            java.lang.String r0 = "NestedScrollView"
            android.util.Log.e(r0, r12)
            goto Ld9
        L4d:
            float r0 = r12.getY(r5)
            int r0 = (int) r0
            int r4 = r11.f2461m
            int r4 = r0 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r11.f2469u
            if (r4 <= r5) goto Ld9
            int r4 = r11.getNestedScrollAxes()
            r1 = r1 & r4
            if (r1 != 0) goto Ld9
            r11.f2465q = r2
            r11.f2461m = r0
            r11.m2252y()
            android.view.VelocityTracker r0 = r11.f2466r
            r0.addMovement(r12)
            r11.f2449A = r3
            android.view.ViewParent r12 = r11.getParent()
            if (r12 == 0) goto Ld9
            r12.requestDisallowInterceptTouchEvent(r2)
            goto Ld9
        L7d:
            r11.f2465q = r3
            r11.f2472x = r4
            r11.m2236G()
            android.widget.OverScroller r4 = r11.f2458j
            int r5 = r11.getScrollX()
            int r6 = r11.getScrollY()
            r7 = 0
            r8 = 0
            r9 = 0
            int r10 = r11.getScrollRange()
            boolean r12 = r4.springBack(r5, r6, r7, r8, r9, r10)
            if (r12 == 0) goto L9e
            androidx.core.view.C0311u.m2113Z(r11)
        L9e:
            r11.m2260Q(r3)
            goto Ld9
        La2:
            float r0 = r12.getY()
            int r0 = (int) r0
            float r4 = r12.getX()
            int r4 = (int) r4
            boolean r4 = r11.m2249v(r4, r0)
            if (r4 != 0) goto Lb8
            r11.f2465q = r3
            r11.m2236G()
            goto Ld9
        Lb8:
            r11.f2461m = r0
            int r0 = r12.getPointerId(r3)
            r11.f2472x = r0
            r11.m2250w()
            android.view.VelocityTracker r0 = r11.f2466r
            r0.addMovement(r12)
            android.widget.OverScroller r12 = r11.f2458j
            r12.computeScrollOffset()
            android.widget.OverScroller r12 = r11.f2458j
            boolean r12 = r12.isFinished()
            r12 = r12 ^ r2
            r11.f2465q = r12
            r11.m2259P(r1, r3)
        Ld9:
            boolean r12 = r11.f2465q
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        int measuredHeight = 0;
        this.f2462n = false;
        View view = this.f2464p;
        if (view != null && m2232A(view, this)) {
            m2239J(this.f2464p);
        }
        this.f2464p = null;
        if (!this.f2463o) {
            if (this.f2451C != null) {
                scrollTo(getScrollX(), this.f2451C.f2475f);
                this.f2451C = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iM2244d = m2244d(scrollY, paddingTop, measuredHeight);
            if (iM2244d != scrollY) {
                scrollTo(getScrollX(), iM2244d);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f2463o = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f2467s && View.MeasureSpec.getMode(i3) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC0304n
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f3, true);
        m2266s((int) f3);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC0304n
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return dispatchNestedPreFling(f2, f3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC0304n
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        mo698o(view, i2, i3, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC0304n
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        m2234C(i5, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC0304n
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        mo696m(view, view2, i2, 0);
    }

    @Override // android.view.View
    protected void onOverScrolled(int i2, int i3, boolean z, boolean z2) {
        super.scrollTo(i2, i3);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (i2 == 2) {
            i2 = 130;
        } else if (i2 == 1) {
            i2 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i2) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i2);
        if (viewFindNextFocus == null || m2253z(viewFindNextFocus)) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i2, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f2451C = savedState;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f2475f = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        InterfaceC0319b interfaceC0319b = this.f2455G;
        if (interfaceC0319b != null) {
            interfaceC0319b.mo211a(this, i2, i3, i4, i5);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !m2233B(viewFindFocus, 0, i5)) {
            return;
        }
        viewFindFocus.getDrawingRect(this.f2457i);
        offsetDescendantRectToMyCoords(viewFindFocus, this.f2457i);
        m2245h(m2262e(this.f2457i));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC0304n
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return mo695l(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC0304n
    public void onStopNestedScroll(View view) {
        mo697n(view, 0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        m2252y();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2449A = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(0.0f, this.f2449A);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f2466r;
                velocityTracker.computeCurrentVelocity(1000, this.f2471w);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f2472x);
                if (Math.abs(yVelocity) >= this.f2470v) {
                    int i2 = -yVelocity;
                    float f2 = i2;
                    if (!dispatchNestedPreFling(0.0f, f2)) {
                        dispatchNestedFling(0.0f, f2, true);
                        m2266s(i2);
                    }
                } else if (this.f2458j.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    C0311u.m2113Z(this);
                }
                this.f2472x = -1;
                m2246i();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f2472x);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f2472x + " in onTouchEvent");
                } else {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i3 = this.f2461m - y;
                    if (!this.f2465q && Math.abs(i3) > this.f2469u) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f2465q = true;
                        i3 = i3 > 0 ? i3 - this.f2469u : i3 + this.f2469u;
                    }
                    int i4 = i3;
                    if (this.f2465q) {
                        if (m2263f(0, i4, this.f2474z, this.f2473y, 0)) {
                            i4 -= this.f2474z[1];
                            this.f2449A += this.f2473y[1];
                        }
                        int i5 = i4;
                        this.f2461m = y - this.f2473y[1];
                        int scrollY = getScrollY();
                        int scrollRange = getScrollRange();
                        int overScrollMode = getOverScrollMode();
                        boolean z = overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0);
                        if (m2254E(0, i5, 0, getScrollY(), 0, scrollRange, 0, 0, true) && !m2268u(0)) {
                            this.f2466r.clear();
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        int[] iArr = this.f2474z;
                        iArr[1] = 0;
                        m2264g(0, scrollY2, 0, i5 - scrollY2, this.f2473y, 0, iArr);
                        int i6 = this.f2461m;
                        int[] iArr2 = this.f2473y;
                        this.f2461m = i6 - iArr2[1];
                        this.f2449A += iArr2[1];
                        if (z) {
                            int i7 = i5 - this.f2474z[1];
                            m2247p();
                            int i8 = scrollY + i7;
                            if (i8 < 0) {
                                C0325f.m2310a(this.f2459k, i7 / getHeight(), motionEvent.getX(iFindPointerIndex) / getWidth());
                                if (!this.f2460l.isFinished()) {
                                    this.f2460l.onRelease();
                                }
                            } else if (i8 > scrollRange) {
                                C0325f.m2310a(this.f2460l, i7 / getHeight(), 1.0f - (motionEvent.getX(iFindPointerIndex) / getWidth()));
                                if (!this.f2459k.isFinished()) {
                                    this.f2459k.onRelease();
                                }
                            }
                            EdgeEffect edgeEffect = this.f2459k;
                            if (edgeEffect != null && (!edgeEffect.isFinished() || !this.f2460l.isFinished())) {
                                C0311u.m2113Z(this);
                            }
                        }
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f2465q && getChildCount() > 0 && this.f2458j.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    C0311u.m2113Z(this);
                }
                this.f2472x = -1;
                m2246i();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f2461m = (int) motionEvent.getY(actionIndex);
                this.f2472x = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m2235D(motionEvent);
                this.f2461m = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f2472x));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            boolean z2 = !this.f2458j.isFinished();
            this.f2465q = z2;
            if (z2 && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f2458j.isFinished()) {
                m2242a();
            }
            this.f2461m = (int) motionEvent.getY();
            this.f2472x = motionEvent.getPointerId(0);
            m2259P(2, 0);
        }
        VelocityTracker velocityTracker2 = this.f2466r;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    /* renamed from: q */
    public boolean m2265q(KeyEvent keyEvent) {
        this.f2457i.setEmpty();
        if (!m2243c()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            return (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(130)) ? false : true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19) {
            return !keyEvent.isAltPressed() ? m2261b(33) : m2267t(33);
        }
        if (keyCode == 20) {
            return !keyEvent.isAltPressed() ? m2261b(130) : m2267t(130);
        }
        if (keyCode != 62) {
            return false;
        }
        m2255F(keyEvent.isShiftPressed() ? 33 : 130);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f2462n) {
            this.f2464p = view2;
        } else {
            m2239J(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return m2240K(rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m2236G();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f2462n = true;
        super.requestLayout();
    }

    /* renamed from: s */
    public void m2266s(int i2) {
        if (getChildCount() > 0) {
            this.f2458j.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            m2237H(true);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i2, int i3) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int iM2244d = m2244d(i2, width, width2);
            int iM2244d2 = m2244d(i3, height, height2);
            if (iM2244d == getScrollX() && iM2244d2 == getScrollY()) {
                return;
            }
            super.scrollTo(iM2244d, iM2244d2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f2467s) {
            this.f2467s = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.f2453E.m2070n(z);
    }

    public void setOnScrollChangeListener(InterfaceC0319b interfaceC0319b) {
        this.f2455G = interfaceC0319b;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f2468t = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i2) {
        return m2259P(i2, 0);
    }

    @Override // android.view.View, androidx.core.view.InterfaceC0300j
    public void stopNestedScroll() {
        m2260Q(0);
    }

    /* renamed from: t */
    public boolean m2267t(int i2) {
        int childCount;
        boolean z = i2 == 130;
        int height = getHeight();
        Rect rect = this.f2457i;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f2457i.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f2457i;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f2457i;
        return m2238I(i2, rect3.top, rect3.bottom);
    }

    /* renamed from: u */
    public boolean m2268u(int i2) {
        return this.f2453E.m2068l(i2);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f2457i = new Rect();
        this.f2462n = true;
        this.f2463o = false;
        this.f2464p = null;
        this.f2465q = false;
        this.f2468t = true;
        this.f2472x = -1;
        this.f2473y = new int[2];
        this.f2474z = new int[2];
        m2251x();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2448g, i2, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f2452D = new C0305o(this);
        this.f2453E = new C0301k(this);
        setNestedScrollingEnabled(true);
        C0311u.m2131i0(this, f2447f);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2) {
        if (getChildCount() <= 0) {
            super.addView(view, i2);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
