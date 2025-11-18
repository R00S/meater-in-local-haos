package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C0265a;
import androidx.core.view.C0285c0;
import androidx.core.view.C0311u;
import androidx.core.view.InterfaceC0300j;
import androidx.core.view.InterfaceC0306p;
import androidx.core.view.p004d0.C0289c;
import androidx.core.view.p004d0.InterfaceC0292f;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.C8032j;
import com.google.android.material.theme.p178a.C8079a;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import p024c.p025a.p026k.p027a.C0833a;
import p024c.p052i.p056g.C0937a;
import p024c.p052i.p059j.C0954d;
import p241e.p254e.p256b.p271c.C8908b;
import p241e.p254e.p256b.p271c.C8910d;
import p241e.p254e.p256b.p271c.C8913g;
import p241e.p254e.p256b.p271c.C8917k;
import p241e.p254e.p256b.p271c.C8918l;
import p241e.p254e.p256b.p271c.p272a0.C8900g;
import p241e.p254e.p256b.p271c.p272a0.C8901h;
import p241e.p254e.p256b.p271c.p273m.C8919a;

/* loaded from: classes2.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.InterfaceC0225b {

    /* renamed from: f */
    private static final int f29577f = C8917k.f33982g;

    /* renamed from: g */
    private int f29578g;

    /* renamed from: h */
    private int f29579h;

    /* renamed from: i */
    private int f29580i;

    /* renamed from: j */
    private int f29581j;

    /* renamed from: k */
    private boolean f29582k;

    /* renamed from: l */
    private int f29583l;

    /* renamed from: m */
    private C0285c0 f29584m;

    /* renamed from: n */
    private List<InterfaceC7926c> f29585n;

    /* renamed from: o */
    private boolean f29586o;

    /* renamed from: p */
    private boolean f29587p;

    /* renamed from: q */
    private boolean f29588q;

    /* renamed from: r */
    private boolean f29589r;

    /* renamed from: s */
    private int f29590s;

    /* renamed from: t */
    private WeakReference<View> f29591t;

    /* renamed from: u */
    private ValueAnimator f29592u;

    /* renamed from: v */
    private int[] f29593v;

    /* renamed from: w */
    private Drawable f29594w;

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        @Override // com.google.android.material.appbar.C7935c
        /* renamed from: E */
        public /* bridge */ /* synthetic */ int mo23760E() {
            return super.mo23760E();
        }

        @Override // com.google.android.material.appbar.C7935c
        /* renamed from: G */
        public /* bridge */ /* synthetic */ boolean mo23761G(int i2) {
            return super.mo23761G(i2);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: g0 */
        public /* bridge */ /* synthetic */ boolean mo1458l(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i2) {
            return super.mo1458l(coordinatorLayout, appBarLayout, i2);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: h0 */
        public /* bridge */ /* synthetic */ boolean mo1459m(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i2, int i3, int i4, int i5) {
            return super.mo1459m(coordinatorLayout, appBarLayout, i2, i3, i4, i5);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: i0 */
        public /* bridge */ /* synthetic */ void mo1463q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i2, int i3, int[] iArr, int i4) throws Resources.NotFoundException {
            super.mo1463q(coordinatorLayout, appBarLayout, view, i2, i3, iArr, i4);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: j0 */
        public /* bridge */ /* synthetic */ void mo1466t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
            super.mo1466t(coordinatorLayout, appBarLayout, view, i2, i3, i4, i5, i6, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: k0 */
        public /* bridge */ /* synthetic */ void mo1470x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.mo1470x(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: l0 */
        public /* bridge */ /* synthetic */ Parcelable mo1471y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.mo1471y(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: m0 */
        public /* bridge */ /* synthetic */ boolean mo1443A(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i2, int i3) {
            return super.mo1443A(coordinatorLayout, appBarLayout, view, view2, i2, i3);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: n0 */
        public /* bridge */ /* synthetic */ void mo1445C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i2) throws Resources.NotFoundException {
            super.mo1445C(coordinatorLayout, appBarLayout, view, i2);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends AbstractC7934b {
        public ScrollingViewBehavior() {
        }

        /* renamed from: R */
        private static int m23762R(AppBarLayout appBarLayout) {
            CoordinatorLayout.AbstractC0226c abstractC0226cM1481f = ((CoordinatorLayout.C0229f) appBarLayout.getLayoutParams()).m1481f();
            if (abstractC0226cM1481f instanceof BaseBehavior) {
                return ((BaseBehavior) abstractC0226cM1481f).mo23741M();
            }
            return 0;
        }

        /* renamed from: S */
        private void m23763S(View view, View view2) {
            CoordinatorLayout.AbstractC0226c abstractC0226cM1481f = ((CoordinatorLayout.C0229f) view2.getLayoutParams()).m1481f();
            if (abstractC0226cM1481f instanceof BaseBehavior) {
                C0311u.m2108U(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) abstractC0226cM1481f).f29595k) + m23796M()) - m23794I(view2));
            }
        }

        /* renamed from: T */
        private void m23764T(View view, View view2) throws Resources.NotFoundException {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.m23714l()) {
                    appBarLayout.m23721u(appBarLayout.m23722w(view));
                }
            }
        }

        @Override // com.google.android.material.appbar.AbstractC7934b
        /* renamed from: J */
        float mo23766J(View view) throws NoSuchFieldException {
            int i2;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int iM23762R = m23762R(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + iM23762R > downNestedPreScrollRange) && (i2 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (iM23762R / i2) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.AbstractC7934b
        /* renamed from: L */
        int mo23767L(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.mo23767L(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC7934b
        /* renamed from: Q, reason: merged with bridge method [inline-methods] */
        public AppBarLayout mo23765H(List<View> list) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = list.get(i2);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
        /* renamed from: e */
        public boolean mo1451e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
        /* renamed from: h */
        public boolean mo1454h(CoordinatorLayout coordinatorLayout, View view, View view2) throws Resources.NotFoundException {
            m23763S(view, view2);
            m23764T(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
        /* renamed from: i */
        public void mo1455i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                C0311u.m2119c0(coordinatorLayout, C0289c.a.f2360m.m2013b());
                C0311u.m2119c0(coordinatorLayout, C0289c.a.f2361n.m2013b());
            }
        }

        @Override // com.google.android.material.appbar.C7935c, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
        /* renamed from: l */
        public /* bridge */ /* synthetic */ boolean mo1458l(CoordinatorLayout coordinatorLayout, View view, int i2) {
            return super.mo1458l(coordinatorLayout, view, i2);
        }

        @Override // com.google.android.material.appbar.AbstractC7934b, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
        /* renamed from: m */
        public /* bridge */ /* synthetic */ boolean mo1459m(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int i5) {
            return super.mo1459m(coordinatorLayout, view, i2, i3, i4, i5);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
        /* renamed from: w */
        public boolean mo1469w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout appBarLayoutMo23765H = mo23765H(coordinatorLayout.m1434r(view));
            if (appBarLayoutMo23765H != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f29662d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    appBarLayoutMo23765H.m23720r(false, !z);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8918l.f34116Q3);
            m23797O(typedArrayObtainStyledAttributes.getDimensionPixelSize(C8918l.f34123R3, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$a */
    class C7924a implements InterfaceC0306p {
        C7924a() {
        }

        @Override // androidx.core.view.InterfaceC0306p
        /* renamed from: a */
        public C0285c0 mo363a(View view, C0285c0 c0285c0) {
            return AppBarLayout.this.m23716n(c0285c0);
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$b */
    class C7925b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C8900g f29618a;

        C7925b(C8900g c8900g) {
            this.f29618a = c8900g;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f29618a.m28283W(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$c */
    public interface InterfaceC7926c<T extends AppBarLayout> {
        void onOffsetChanged(T t, int i2);
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$e */
    public interface InterfaceC7928e extends InterfaceC7926c<AppBarLayout> {
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C8908b.f33811a);
    }

    /* renamed from: c */
    private void m23697c() {
        WeakReference<View> weakReference = this.f29591t;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f29591t = null;
    }

    /* renamed from: d */
    private View m23698d(View view) {
        int i2;
        if (this.f29591t == null && (i2 = this.f29590s) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i2) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.f29590s);
            }
            if (viewFindViewById != null) {
                this.f29591t = new WeakReference<>(viewFindViewById);
            }
        }
        WeakReference<View> weakReference = this.f29591t;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: i */
    private boolean m23699i() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (((C7927d) getChildAt(i2).getLayoutParams()).m23771c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    private void m23700k() {
        this.f29579h = -1;
        this.f29580i = -1;
        this.f29581j = -1;
    }

    /* renamed from: s */
    private void m23701s(boolean z, boolean z2, boolean z3) {
        this.f29583l = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    /* renamed from: t */
    private boolean m23702t(boolean z) {
        if (this.f29587p == z) {
            return false;
        }
        this.f29587p = z;
        refreshDrawableState();
        return true;
    }

    /* renamed from: v */
    private boolean m23703v() {
        return this.f29594w != null && getTopInset() > 0;
    }

    /* renamed from: x */
    private boolean m23704x() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        return (childAt.getVisibility() == 8 || C0311u.m2156v(childAt)) ? false : true;
    }

    /* renamed from: y */
    private void m23705y(C8900g c8900g, boolean z) throws Resources.NotFoundException {
        float dimension = getResources().getDimension(C8910d.f33866a);
        float f2 = z ? 0.0f : dimension;
        if (!z) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.f29592u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f2, dimension);
        this.f29592u = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(getResources().getInteger(C8913g.f33937a));
        this.f29592u.setInterpolator(C8919a.f34370a);
        this.f29592u.addUpdateListener(new C7925b(c8900g));
        this.f29592u.start();
    }

    /* renamed from: z */
    private void m23706z() {
        setWillNotDraw(!m23703v());
    }

    /* renamed from: a */
    public void m23707a(InterfaceC7926c interfaceC7926c) {
        if (this.f29585n == null) {
            this.f29585n = new ArrayList();
        }
        if (interfaceC7926c == null || this.f29585n.contains(interfaceC7926c)) {
            return;
        }
        this.f29585n.add(interfaceC7926c);
    }

    /* renamed from: b */
    public void m23708b(InterfaceC7928e interfaceC7928e) {
        m23707a(interfaceC7928e);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C7927d;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (m23703v()) {
            int iSave = canvas.save();
            canvas.translate(0.0f, -this.f29578g);
            this.f29594w.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f29594w;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C7927d generateDefaultLayoutParams() {
        return new C7927d(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C7927d generateLayoutParams(AttributeSet attributeSet) {
        return new C7927d(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C7927d generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (Build.VERSION.SDK_INT < 19 || !(layoutParams instanceof LinearLayout.LayoutParams)) ? layoutParams instanceof ViewGroup.MarginLayoutParams ? new C7927d((ViewGroup.MarginLayoutParams) layoutParams) : new C7927d(layoutParams) : new C7927d((LinearLayout.LayoutParams) layoutParams);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0225b
    public CoordinatorLayout.AbstractC0226c<AppBarLayout> getBehavior() {
        return new Behavior();
    }

    int getDownNestedPreScrollRange() throws NoSuchFieldException {
        int iMin;
        int iM2164z;
        int i2 = this.f29580i;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            C7927d c7927d = (C7927d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = c7927d.f29620a;
            if ((i4 & 5) != 5) {
                if (i3 > 0) {
                    break;
                }
            } else {
                int i5 = ((LinearLayout.LayoutParams) c7927d).topMargin + ((LinearLayout.LayoutParams) c7927d).bottomMargin;
                if ((i4 & 8) != 0) {
                    iM2164z = C0311u.m2164z(childAt);
                } else if ((i4 & 2) != 0) {
                    iM2164z = measuredHeight - C0311u.m2164z(childAt);
                } else {
                    iMin = i5 + measuredHeight;
                    if (childCount == 0 && C0311u.m2156v(childAt)) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                    i3 += iMin;
                }
                iMin = i5 + iM2164z;
                if (childCount == 0) {
                    iMin = Math.min(iMin, measuredHeight - getTopInset());
                }
                i3 += iMin;
            }
        }
        int iMax = Math.max(0, i3);
        this.f29580i = iMax;
        return iMax;
    }

    int getDownNestedScrollRange() {
        int i2 = this.f29581j;
        if (i2 != -1) {
            return i2;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int iM2164z = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            C7927d c7927d = (C7927d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) c7927d).topMargin + ((LinearLayout.LayoutParams) c7927d).bottomMargin;
            int i4 = c7927d.f29620a;
            if ((i4 & 1) == 0) {
                break;
            }
            iM2164z += measuredHeight;
            if ((i4 & 2) != 0) {
                iM2164z -= C0311u.m2164z(childAt);
                break;
            }
            i3++;
        }
        int iMax = Math.max(0, iM2164z);
        this.f29581j = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f29590s;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() throws NoSuchFieldException {
        int topInset = getTopInset();
        int iM2164z = C0311u.m2164z(this);
        if (iM2164z == 0) {
            int childCount = getChildCount();
            iM2164z = childCount >= 1 ? C0311u.m2164z(getChildAt(childCount - 1)) : 0;
            if (iM2164z == 0) {
                return getHeight() / 3;
            }
        }
        return (iM2164z * 2) + topInset;
    }

    int getPendingAction() {
        return this.f29583l;
    }

    public Drawable getStatusBarForeground() {
        return this.f29594w;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    final int getTopInset() {
        C0285c0 c0285c0 = this.f29584m;
        if (c0285c0 != null) {
            return c0285c0.m1884k();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i2 = this.f29579h;
        if (i2 != -1) {
            return i2;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int iM2164z = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            C7927d c7927d = (C7927d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = c7927d.f29620a;
            if ((i4 & 1) == 0) {
                break;
            }
            iM2164z += measuredHeight + ((LinearLayout.LayoutParams) c7927d).topMargin + ((LinearLayout.LayoutParams) c7927d).bottomMargin;
            if (i3 == 0 && C0311u.m2156v(childAt)) {
                iM2164z -= getTopInset();
            }
            if ((i4 & 2) != 0) {
                iM2164z -= C0311u.m2164z(childAt);
                break;
            }
            i3++;
        }
        int iMax = Math.max(0, iM2164z);
        this.f29579h = iMax;
        return iMax;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* renamed from: h */
    boolean m23712h() {
        return this.f29582k;
    }

    /* renamed from: j */
    boolean m23713j() {
        return getTotalScrollRange() != 0;
    }

    /* renamed from: l */
    public boolean m23714l() {
        return this.f29589r;
    }

    /* renamed from: m */
    void m23715m(int i2) {
        this.f29578g = i2;
        if (!willNotDraw()) {
            C0311u.m2113Z(this);
        }
        List<InterfaceC7926c> list = this.f29585n;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                InterfaceC7926c interfaceC7926c = this.f29585n.get(i3);
                if (interfaceC7926c != null) {
                    interfaceC7926c.onOffsetChanged(this, i2);
                }
            }
        }
    }

    /* renamed from: n */
    C0285c0 m23716n(C0285c0 c0285c0) {
        C0285c0 c0285c02 = C0311u.m2156v(this) ? c0285c0 : null;
        if (!C0954d.m6056a(this.f29584m, c0285c02)) {
            this.f29584m = c0285c02;
            m23706z();
            requestLayout();
        }
        return c0285c0;
    }

    /* renamed from: o */
    public void m23717o(InterfaceC7926c interfaceC7926c) {
        List<InterfaceC7926c> list = this.f29585n;
        if (list == null || interfaceC7926c == null) {
            return;
        }
        list.remove(interfaceC7926c);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C8901h.m28311e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i2) {
        if (this.f29593v == null) {
            this.f29593v = new int[4];
        }
        int[] iArr = this.f29593v;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + iArr.length);
        boolean z = this.f29587p;
        int i3 = C8908b.f33805F;
        if (!z) {
            i3 = -i3;
        }
        iArr[0] = i3;
        iArr[1] = (z && this.f29588q) ? C8908b.f33806G : -C8908b.f33806G;
        int i4 = C8908b.f33803D;
        if (!z) {
            i4 = -i4;
        }
        iArr[2] = i4;
        iArr[3] = (z && this.f29588q) ? C8908b.f33802C : -C8908b.f33802C;
        return LinearLayout.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m23697c();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        boolean z2 = true;
        if (C0311u.m2156v(this) && m23704x()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                C0311u.m2108U(getChildAt(childCount), topInset);
            }
        }
        m23700k();
        this.f29582k = false;
        int childCount2 = getChildCount();
        int i6 = 0;
        while (true) {
            if (i6 >= childCount2) {
                break;
            }
            if (((C7927d) getChildAt(i6).getLayoutParams()).m23770b() != null) {
                this.f29582k = true;
                break;
            }
            i6++;
        }
        Drawable drawable = this.f29594w;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f29586o) {
            return;
        }
        if (!this.f29589r && !m23699i()) {
            z2 = false;
        }
        m23702t(z2);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i3);
        if (mode != 1073741824 && C0311u.m2156v(this) && m23704x()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = C0937a.m5966b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i3));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        m23700k();
    }

    /* renamed from: p */
    public void m23718p(InterfaceC7928e interfaceC7928e) {
        m23717o(interfaceC7928e);
    }

    /* renamed from: q */
    void m23719q() {
        this.f29583l = 0;
    }

    /* renamed from: r */
    public void m23720r(boolean z, boolean z2) {
        m23701s(z, z2, true);
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        C8901h.m28310d(this, f2);
    }

    public void setExpanded(boolean z) {
        m23720r(z, C0311u.m2102O(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.f29589r = z;
    }

    public void setLiftOnScrollTargetViewId(int i2) {
        this.f29590s = i2;
        m23697c();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i2) {
        if (i2 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i2);
    }

    public void setStatusBarForeground(Drawable drawable) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Drawable drawable2 = this.f29594w;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f29594w = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f29594w.setState(getDrawableState());
                }
                C0265a.m1816m(this.f29594w, C0311u.m2162y(this));
                this.f29594w.setVisible(getVisibility() == 0, false);
                this.f29594w.setCallback(this);
            }
            m23706z();
            C0311u.m2113Z(this);
        }
    }

    public void setStatusBarForegroundColor(int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        setStatusBarForeground(new ColorDrawable(i2));
    }

    public void setStatusBarForegroundResource(int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        setStatusBarForeground(C0833a.m5262d(getContext(), i2));
    }

    @Deprecated
    public void setTargetElevation(float f2) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 21) {
            C7937e.m23806b(this, f2);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.f29594w;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    /* renamed from: u */
    boolean m23721u(boolean z) throws Resources.NotFoundException {
        if (this.f29588q == z) {
            return false;
        }
        this.f29588q = z;
        refreshDrawableState();
        if (!this.f29589r || !(getBackground() instanceof C8900g)) {
            return true;
        }
        m23705y((C8900g) getBackground(), z);
        return true;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f29594w;
    }

    /* renamed from: w */
    boolean m23722w(View view) {
        View viewM23698d = m23698d(view);
        if (viewM23698d != null) {
            view = viewM23698d;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    protected static class BaseBehavior<T extends AppBarLayout> extends AbstractC7933a<T> {

        /* renamed from: k */
        private int f29595k;

        /* renamed from: l */
        private int f29596l;

        /* renamed from: m */
        private ValueAnimator f29597m;

        /* renamed from: n */
        private int f29598n;

        /* renamed from: o */
        private boolean f29599o;

        /* renamed from: p */
        private float f29600p;

        /* renamed from: q */
        private WeakReference<View> f29601q;

        /* renamed from: r */
        private AbstractC7923d f29602r;

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a */
        class C7920a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ CoordinatorLayout f29606a;

            /* renamed from: b */
            final /* synthetic */ AppBarLayout f29607b;

            C7920a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f29606a = coordinatorLayout;
                this.f29607b = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.m23791P(this.f29606a, this.f29607b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$b */
        class C7921b implements InterfaceC0292f {

            /* renamed from: a */
            final /* synthetic */ CoordinatorLayout f29609a;

            /* renamed from: b */
            final /* synthetic */ AppBarLayout f29610b;

            /* renamed from: c */
            final /* synthetic */ View f29611c;

            /* renamed from: d */
            final /* synthetic */ int f29612d;

            C7921b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i2) {
                this.f29609a = coordinatorLayout;
                this.f29610b = appBarLayout;
                this.f29611c = view;
                this.f29612d = i2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.core.view.p004d0.InterfaceC0292f
            /* renamed from: a */
            public boolean mo2032a(View view, InterfaceC0292f.a aVar) throws Resources.NotFoundException {
                BaseBehavior.this.mo1463q(this.f29609a, this.f29610b, this.f29611c, 0, this.f29612d, new int[]{0, 0}, 1);
                return true;
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$c */
        class C7922c implements InterfaceC0292f {

            /* renamed from: a */
            final /* synthetic */ AppBarLayout f29614a;

            /* renamed from: b */
            final /* synthetic */ boolean f29615b;

            C7922c(AppBarLayout appBarLayout, boolean z) {
                this.f29614a = appBarLayout;
                this.f29615b = z;
            }

            @Override // androidx.core.view.p004d0.InterfaceC0292f
            /* renamed from: a */
            public boolean mo2032a(View view, InterfaceC0292f.a aVar) {
                this.f29614a.setExpanded(this.f29615b);
                return true;
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$d */
        public static abstract class AbstractC7923d<T extends AppBarLayout> {
        }

        public BaseBehavior() {
            this.f29598n = -1;
        }

        /* renamed from: S */
        private void m23724S(CoordinatorLayout coordinatorLayout, T t, View view) {
            if (mo23741M() != (-t.getTotalScrollRange()) && view.canScrollVertically(1)) {
                m23725T(coordinatorLayout, t, C0289c.a.f2360m, false);
            }
            if (mo23741M() != 0) {
                if (!view.canScrollVertically(-1)) {
                    m23725T(coordinatorLayout, t, C0289c.a.f2361n, true);
                    return;
                }
                int i2 = -t.getDownNestedPreScrollRange();
                if (i2 != 0) {
                    C0311u.m2123e0(coordinatorLayout, C0289c.a.f2361n, null, new C7921b(coordinatorLayout, t, view, i2));
                }
            }
        }

        /* renamed from: T */
        private void m23725T(CoordinatorLayout coordinatorLayout, T t, C0289c.a aVar, boolean z) {
            C0311u.m2123e0(coordinatorLayout, aVar, null, new C7922c(t, z));
        }

        /* renamed from: U */
        private void m23726U(CoordinatorLayout coordinatorLayout, T t, int i2, float f2) {
            int iAbs = Math.abs(mo23741M() - i2);
            float fAbs = Math.abs(f2);
            m23727V(coordinatorLayout, t, i2, fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / t.getHeight()) + 1.0f) * 150.0f));
        }

        /* renamed from: V */
        private void m23727V(CoordinatorLayout coordinatorLayout, T t, int i2, int i3) {
            int iMo23741M = mo23741M();
            if (iMo23741M == i2) {
                ValueAnimator valueAnimator = this.f29597m;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f29597m.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f29597m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f29597m = valueAnimator3;
                valueAnimator3.setInterpolator(C8919a.f34374e);
                this.f29597m.addUpdateListener(new C7920a(coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.f29597m.setDuration(Math.min(i3, 600));
            this.f29597m.setIntValues(iMo23741M, i2);
            this.f29597m.start();
        }

        /* renamed from: X */
        private boolean m23728X(CoordinatorLayout coordinatorLayout, T t, View view) {
            return t.m23713j() && coordinatorLayout.getHeight() - view.getHeight() <= t.getHeight();
        }

        /* renamed from: Y */
        private static boolean m23729Y(int i2, int i3) {
            return (i2 & i3) == i3;
        }

        /* renamed from: Z */
        private View m23730Z(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                if ((childAt instanceof InterfaceC0300j) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: a0 */
        private static View m23731a0(AppBarLayout appBarLayout, int i2) {
            int iAbs = Math.abs(i2);
            int childCount = appBarLayout.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = appBarLayout.getChildAt(i3);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: b0 */
        private int m23732b0(T t, int i2) {
            int childCount = t.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = t.getChildAt(i3);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                C7927d c7927d = (C7927d) childAt.getLayoutParams();
                if (m23729Y(c7927d.m23769a(), 32)) {
                    top -= ((LinearLayout.LayoutParams) c7927d).topMargin;
                    bottom += ((LinearLayout.LayoutParams) c7927d).bottomMargin;
                }
                int i4 = -i2;
                if (top <= i4 && bottom >= i4) {
                    return i3;
                }
            }
            return -1;
        }

        /* renamed from: e0 */
        private int m23733e0(T t, int i2) {
            int iAbs = Math.abs(i2);
            int childCount = t.getChildCount();
            int topInset = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = t.getChildAt(i3);
                C7927d c7927d = (C7927d) childAt.getLayoutParams();
                Interpolator interpolatorM23770b = c7927d.m23770b();
                if (iAbs < childAt.getTop() || iAbs > childAt.getBottom()) {
                    i3++;
                } else if (interpolatorM23770b != null) {
                    int iM23769a = c7927d.m23769a();
                    if ((iM23769a & 1) != 0) {
                        topInset = 0 + childAt.getHeight() + ((LinearLayout.LayoutParams) c7927d).topMargin + ((LinearLayout.LayoutParams) c7927d).bottomMargin;
                        if ((iM23769a & 2) != 0) {
                            topInset -= C0311u.m2164z(childAt);
                        }
                    }
                    if (C0311u.m2156v(childAt)) {
                        topInset -= t.getTopInset();
                    }
                    if (topInset > 0) {
                        float f2 = topInset;
                        return Integer.signum(i2) * (childAt.getTop() + Math.round(f2 * interpolatorM23770b.getInterpolation((iAbs - childAt.getTop()) / f2)));
                    }
                }
            }
            return i2;
        }

        /* renamed from: p0 */
        private boolean m23734p0(CoordinatorLayout coordinatorLayout, T t) {
            List<View> listM1435s = coordinatorLayout.m1435s(t);
            int size = listM1435s.size();
            for (int i2 = 0; i2 < size; i2++) {
                CoordinatorLayout.AbstractC0226c abstractC0226cM1481f = ((CoordinatorLayout.C0229f) listM1435s.get(i2).getLayoutParams()).m1481f();
                if (abstractC0226cM1481f instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) abstractC0226cM1481f).m23795K() != 0;
                }
            }
            return false;
        }

        /* renamed from: q0 */
        private void m23735q0(CoordinatorLayout coordinatorLayout, T t) {
            int iMo23741M = mo23741M();
            int iM23732b0 = m23732b0(t, iMo23741M);
            if (iM23732b0 >= 0) {
                View childAt = t.getChildAt(iM23732b0);
                C7927d c7927d = (C7927d) childAt.getLayoutParams();
                int iM23769a = c7927d.m23769a();
                if ((iM23769a & 17) == 17) {
                    int i2 = -childAt.getTop();
                    int iM2164z = -childAt.getBottom();
                    if (iM23732b0 == t.getChildCount() - 1) {
                        iM2164z += t.getTopInset();
                    }
                    if (m23729Y(iM23769a, 2)) {
                        iM2164z += C0311u.m2164z(childAt);
                    } else if (m23729Y(iM23769a, 5)) {
                        int iM2164z2 = C0311u.m2164z(childAt) + iM2164z;
                        if (iMo23741M < iM2164z2) {
                            i2 = iM2164z2;
                        } else {
                            iM2164z = iM2164z2;
                        }
                    }
                    if (m23729Y(iM23769a, 32)) {
                        i2 += ((LinearLayout.LayoutParams) c7927d).topMargin;
                        iM2164z -= ((LinearLayout.LayoutParams) c7927d).bottomMargin;
                    }
                    if (iMo23741M < (iM2164z + i2) / 2) {
                        i2 = iM2164z;
                    }
                    m23726U(coordinatorLayout, t, C0937a.m5966b(i2, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* renamed from: r0 */
        private void m23736r0(CoordinatorLayout coordinatorLayout, T t) {
            C0311u.m2119c0(coordinatorLayout, C0289c.a.f2360m.m2013b());
            C0311u.m2119c0(coordinatorLayout, C0289c.a.f2361n.m2013b());
            View viewM23730Z = m23730Z(coordinatorLayout);
            if (viewM23730Z == null || t.getTotalScrollRange() == 0 || !(((CoordinatorLayout.C0229f) viewM23730Z.getLayoutParams()).m1481f() instanceof ScrollingViewBehavior)) {
                return;
            }
            m23724S(coordinatorLayout, t, viewM23730Z);
        }

        /* renamed from: s0 */
        private void m23737s0(CoordinatorLayout coordinatorLayout, T t, int i2, int i3, boolean z) throws NoSuchFieldException, Resources.NotFoundException {
            View viewM23731a0 = m23731a0(t, i2);
            if (viewM23731a0 != null) {
                int iM23769a = ((C7927d) viewM23731a0.getLayoutParams()).m23769a();
                boolean zM23722w = false;
                if ((iM23769a & 1) != 0) {
                    int iM2164z = C0311u.m2164z(viewM23731a0);
                    if (i3 <= 0 || (iM23769a & 12) == 0 ? !((iM23769a & 2) == 0 || (-i2) < (viewM23731a0.getBottom() - iM2164z) - t.getTopInset()) : (-i2) >= (viewM23731a0.getBottom() - iM2164z) - t.getTopInset()) {
                        zM23722w = true;
                    }
                }
                if (t.m23714l()) {
                    zM23722w = t.m23722w(m23730Z(coordinatorLayout));
                }
                boolean zM23721u = t.m23721u(zM23722w);
                if (z || (zM23721u && m23734p0(coordinatorLayout, t))) {
                    t.jumpDrawablesToCurrentState();
                }
            }
        }

        @Override // com.google.android.material.appbar.AbstractC7933a
        /* renamed from: M */
        int mo23741M() {
            return mo23760E() + this.f29595k;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC7933a
        /* renamed from: W, reason: merged with bridge method [inline-methods] */
        public boolean mo23738H(T t) {
            if (this.f29602r != null) {
                throw null;
            }
            WeakReference<View> weakReference = this.f29601q;
            if (weakReference == null) {
                return true;
            }
            View view = weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC7933a
        /* renamed from: c0, reason: merged with bridge method [inline-methods] */
        public int mo23739K(T t) {
            return -t.getDownNestedScrollRange();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC7933a
        /* renamed from: d0, reason: merged with bridge method [inline-methods] */
        public int mo23740L(T t) {
            return t.getTotalScrollRange();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC7933a
        /* renamed from: f0, reason: merged with bridge method [inline-methods] */
        public void mo23742N(CoordinatorLayout coordinatorLayout, T t) throws Resources.NotFoundException {
            m23735q0(coordinatorLayout, t);
            if (t.m23714l()) {
                t.m23721u(t.m23722w(m23730Z(coordinatorLayout)));
            }
        }

        @Override // com.google.android.material.appbar.C7935c, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
        /* renamed from: g0, reason: merged with bridge method [inline-methods] */
        public boolean mo1458l(CoordinatorLayout coordinatorLayout, T t, int i2) throws NoSuchFieldException, Resources.NotFoundException {
            boolean zMo1458l = super.mo1458l(coordinatorLayout, t, i2);
            int pendingAction = t.getPendingAction();
            int i3 = this.f29598n;
            if (i3 >= 0 && (pendingAction & 8) == 0) {
                View childAt = t.getChildAt(i3);
                m23791P(coordinatorLayout, t, (-childAt.getBottom()) + (this.f29599o ? C0311u.m2164z(childAt) + t.getTopInset() : Math.round(childAt.getHeight() * this.f29600p)));
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i4 = -t.getUpNestedPreScrollRange();
                    if (z) {
                        m23726U(coordinatorLayout, t, i4, 0.0f);
                    } else {
                        m23791P(coordinatorLayout, t, i4);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        m23726U(coordinatorLayout, t, 0, 0.0f);
                    } else {
                        m23791P(coordinatorLayout, t, 0);
                    }
                }
            }
            t.m23719q();
            this.f29598n = -1;
            mo23761G(C0937a.m5966b(mo23760E(), -t.getTotalScrollRange(), 0));
            m23737s0(coordinatorLayout, t, mo23760E(), 0, true);
            t.m23715m(mo23760E());
            m23736r0(coordinatorLayout, t);
            return zMo1458l;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
        /* renamed from: h0, reason: merged with bridge method [inline-methods] */
        public boolean mo1459m(CoordinatorLayout coordinatorLayout, T t, int i2, int i3, int i4, int i5) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0229f) t.getLayoutParams())).height != -2) {
                return super.mo1459m(coordinatorLayout, t, i2, i3, i4, i5);
            }
            coordinatorLayout.m1423J(t, i2, i3, View.MeasureSpec.makeMeasureSpec(0, 0), i5);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
        /* renamed from: i0, reason: merged with bridge method [inline-methods] */
        public void mo1463q(CoordinatorLayout coordinatorLayout, T t, View view, int i2, int i3, int[] iArr, int i4) throws Resources.NotFoundException {
            int i5;
            int downNestedPreScrollRange;
            if (i3 != 0) {
                if (i3 < 0) {
                    int i6 = -t.getTotalScrollRange();
                    i5 = i6;
                    downNestedPreScrollRange = t.getDownNestedPreScrollRange() + i6;
                } else {
                    i5 = -t.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                if (i5 != downNestedPreScrollRange) {
                    iArr[1] = m23790O(coordinatorLayout, t, i3, i5, downNestedPreScrollRange);
                }
            }
            if (t.m23714l()) {
                t.m23721u(t.m23722w(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
        /* renamed from: j0, reason: merged with bridge method [inline-methods] */
        public void mo1466t(CoordinatorLayout coordinatorLayout, T t, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
            if (i5 < 0) {
                iArr[1] = m23790O(coordinatorLayout, t, i5, -t.getDownNestedScrollRange(), 0);
            }
            if (i5 == 0) {
                m23736r0(coordinatorLayout, t);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
        /* renamed from: k0, reason: merged with bridge method [inline-methods] */
        public void mo1470x(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
            if (!(parcelable instanceof SavedState)) {
                super.mo1470x(coordinatorLayout, t, parcelable);
                this.f29598n = -1;
                return;
            }
            SavedState savedState = (SavedState) parcelable;
            super.mo1470x(coordinatorLayout, t, savedState.m2342a());
            this.f29598n = savedState.f29603h;
            this.f29600p = savedState.f29604i;
            this.f29599o = savedState.f29605j;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
        /* renamed from: l0, reason: merged with bridge method [inline-methods] */
        public Parcelable mo1471y(CoordinatorLayout coordinatorLayout, T t) {
            Parcelable parcelableMo1471y = super.mo1471y(coordinatorLayout, t);
            int iMo23760E = mo23760E();
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int bottom = childAt.getBottom() + iMo23760E;
                if (childAt.getTop() + iMo23760E <= 0 && bottom >= 0) {
                    SavedState savedState = new SavedState(parcelableMo1471y);
                    savedState.f29603h = i2;
                    savedState.f29605j = bottom == C0311u.m2164z(childAt) + t.getTopInset();
                    savedState.f29604i = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return parcelableMo1471y;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
        /* renamed from: m0, reason: merged with bridge method [inline-methods] */
        public boolean mo1443A(CoordinatorLayout coordinatorLayout, T t, View view, View view2, int i2, int i3) {
            ValueAnimator valueAnimator;
            boolean z = (i2 & 2) != 0 && (t.m23714l() || m23728X(coordinatorLayout, t, view));
            if (z && (valueAnimator = this.f29597m) != null) {
                valueAnimator.cancel();
            }
            this.f29601q = null;
            this.f29596l = i3;
            return z;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
        /* renamed from: n0, reason: merged with bridge method [inline-methods] */
        public void mo1445C(CoordinatorLayout coordinatorLayout, T t, View view, int i2) throws Resources.NotFoundException {
            if (this.f29596l == 0 || i2 == 1) {
                m23735q0(coordinatorLayout, t);
                if (t.m23714l()) {
                    t.m23721u(t.m23722w(view));
                }
            }
            this.f29601q = new WeakReference<>(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC7933a
        /* renamed from: o0, reason: merged with bridge method [inline-methods] */
        public int mo23743Q(CoordinatorLayout coordinatorLayout, T t, int i2, int i3, int i4) throws NoSuchFieldException, Resources.NotFoundException {
            int iMo23741M = mo23741M();
            int i5 = 0;
            if (i3 == 0 || iMo23741M < i3 || iMo23741M > i4) {
                this.f29595k = 0;
            } else {
                int iM5966b = C0937a.m5966b(i2, i3, i4);
                if (iMo23741M != iM5966b) {
                    int iM23733e0 = t.m23712h() ? m23733e0(t, iM5966b) : iM5966b;
                    boolean zMo23761G = mo23761G(iM23733e0);
                    i5 = iMo23741M - iM5966b;
                    this.f29595k = iM5966b - iM23733e0;
                    if (!zMo23761G && t.m23712h()) {
                        coordinatorLayout.m1428f(t);
                    }
                    t.m23715m(mo23760E());
                    m23737s0(coordinatorLayout, t, iM5966b, iM5966b < iMo23741M ? -1 : 1, false);
                }
            }
            m23736r0(coordinatorLayout, t);
            return i5;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f29598n = -1;
        }

        protected static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new C7919a();

            /* renamed from: h */
            int f29603h;

            /* renamed from: i */
            float f29604i;

            /* renamed from: j */
            boolean f29605j;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState$a */
            static class C7919a implements Parcelable.ClassLoaderCreator<SavedState> {
                C7919a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public SavedState createFromParcel(Parcel parcel) {
                    return new SavedState(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public SavedState[] newArray(int i2) {
                    return new SavedState[i2];
                }
            }

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f29603h = parcel.readInt();
                this.f29604i = parcel.readFloat();
                this.f29605j = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i2) {
                super.writeToParcel(parcel, i2);
                parcel.writeInt(this.f29603h);
                parcel.writeFloat(this.f29604i);
                parcel.writeByte(this.f29605j ? (byte) 1 : (byte) 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AppBarLayout(Context context, AttributeSet attributeSet, int i2) throws IllegalAccessException, Resources.NotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i3 = f29577f;
        super(C8079a.m24906c(context, attributeSet, i2, i3), attributeSet, i2);
        this.f29579h = -1;
        this.f29580i = -1;
        this.f29581j = -1;
        this.f29583l = 0;
        Context context2 = getContext();
        setOrientation(1);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 21) {
            C7937e.m23805a(this);
            C7937e.m23807c(this, attributeSet, i2, i3);
        }
        TypedArray typedArrayM24694h = C8032j.m24694h(context2, attributeSet, C8918l.f34258k, i2, i3, new int[0]);
        C0311u.m2139m0(this, typedArrayM24694h.getDrawable(C8918l.f34265l));
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            C8900g c8900g = new C8900g();
            c8900g.m28284X(ColorStateList.valueOf(colorDrawable.getColor()));
            c8900g.m28278N(context2);
            C0311u.m2139m0(this, c8900g);
        }
        int i5 = C8918l.f34293p;
        if (typedArrayM24694h.hasValue(i5)) {
            m23701s(typedArrayM24694h.getBoolean(i5, false), false, false);
        }
        if (i4 >= 21) {
            if (typedArrayM24694h.hasValue(C8918l.f34286o)) {
                C7937e.m23806b(this, typedArrayM24694h.getDimensionPixelSize(r13, 0));
            }
        }
        if (i4 >= 26) {
            int i6 = C8918l.f34279n;
            if (typedArrayM24694h.hasValue(i6)) {
                setKeyboardNavigationCluster(typedArrayM24694h.getBoolean(i6, false));
            }
            int i7 = C8918l.f34272m;
            if (typedArrayM24694h.hasValue(i7)) {
                setTouchscreenBlocksFocus(typedArrayM24694h.getBoolean(i7, false));
            }
        }
        this.f29589r = typedArrayM24694h.getBoolean(C8918l.f34300q, false);
        this.f29590s = typedArrayM24694h.getResourceId(C8918l.f34307r, -1);
        setStatusBarForeground(typedArrayM24694h.getDrawable(C8918l.f34314s));
        typedArrayM24694h.recycle();
        C0311u.m2157v0(this, new C7924a());
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$d */
    public static class C7927d extends LinearLayout.LayoutParams {

        /* renamed from: a */
        int f29620a;

        /* renamed from: b */
        Interpolator f29621b;

        public C7927d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f29620a = 1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8918l.f34328u);
            this.f29620a = typedArrayObtainStyledAttributes.getInt(C8918l.f34335v, 0);
            int i2 = C8918l.f34342w;
            if (typedArrayObtainStyledAttributes.hasValue(i2)) {
                this.f29621b = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(i2, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public int m23769a() {
            return this.f29620a;
        }

        /* renamed from: b */
        public Interpolator m23770b() {
            return this.f29621b;
        }

        /* renamed from: c */
        boolean m23771c() {
            int i2 = this.f29620a;
            return (i2 & 1) == 1 && (i2 & 10) != 0;
        }

        public C7927d(int i2, int i3) {
            super(i2, i3);
            this.f29620a = 1;
        }

        public C7927d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f29620a = 1;
        }

        public C7927d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f29620a = 1;
        }

        public C7927d(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f29620a = 1;
        }
    }
}
