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
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.InterfaceC0093m;
import androidx.core.view.C0285c0;
import androidx.core.view.C0305o;
import androidx.core.view.C0311u;
import androidx.core.view.InterfaceC0302l;
import androidx.core.view.InterfaceC0303m;
import androidx.core.view.InterfaceC0304n;
import java.lang.reflect.InvocationTargetException;
import p024c.p025a.C0823a;
import p024c.p025a.C0828f;
import p024c.p052i.p053e.C0924b;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0196w, InterfaceC0304n, InterfaceC0302l, InterfaceC0303m {

    /* renamed from: f */
    static final int[] f714f = {C0823a.f5028b, R.attr.windowContentOverlay};

    /* renamed from: A */
    private C0285c0 f715A;

    /* renamed from: B */
    private C0285c0 f716B;

    /* renamed from: C */
    private C0285c0 f717C;

    /* renamed from: D */
    private C0285c0 f718D;

    /* renamed from: E */
    private InterfaceC0104d f719E;

    /* renamed from: F */
    private OverScroller f720F;

    /* renamed from: G */
    ViewPropertyAnimator f721G;

    /* renamed from: H */
    final AnimatorListenerAdapter f722H;

    /* renamed from: I */
    private final Runnable f723I;

    /* renamed from: J */
    private final Runnable f724J;

    /* renamed from: K */
    private final C0305o f725K;

    /* renamed from: g */
    private int f726g;

    /* renamed from: h */
    private int f727h;

    /* renamed from: i */
    private ContentFrameLayout f728i;

    /* renamed from: j */
    ActionBarContainer f729j;

    /* renamed from: k */
    private InterfaceC0198x f730k;

    /* renamed from: l */
    private Drawable f731l;

    /* renamed from: m */
    private boolean f732m;

    /* renamed from: n */
    private boolean f733n;

    /* renamed from: o */
    private boolean f734o;

    /* renamed from: p */
    private boolean f735p;

    /* renamed from: q */
    boolean f736q;

    /* renamed from: r */
    private int f737r;

    /* renamed from: s */
    private int f738s;

    /* renamed from: t */
    private final Rect f739t;

    /* renamed from: u */
    private final Rect f740u;

    /* renamed from: v */
    private final Rect f741v;

    /* renamed from: w */
    private final Rect f742w;

    /* renamed from: x */
    private final Rect f743x;

    /* renamed from: y */
    private final Rect f744y;

    /* renamed from: z */
    private final Rect f745z;

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    class C0101a extends AnimatorListenerAdapter {
        C0101a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f721G = null;
            actionBarOverlayLayout.f736q = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f721G = null;
            actionBarOverlayLayout.f736q = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    class RunnableC0102b implements Runnable {
        RunnableC0102b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m701u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f721G = actionBarOverlayLayout.f729j.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f722H);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    class RunnableC0103c implements Runnable {
        RunnableC0103c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m701u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f721G = actionBarOverlayLayout.f729j.animate().translationY(-ActionBarOverlayLayout.this.f729j.getHeight()).setListener(ActionBarOverlayLayout.this.f722H);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$d */
    public interface InterfaceC0104d {
        /* renamed from: a */
        void mo445a();

        /* renamed from: b */
        void mo446b();

        /* renamed from: c */
        void mo447c(boolean z);

        /* renamed from: d */
        void mo448d();

        /* renamed from: e */
        void mo449e();

        void onWindowVisibilityChanged(int i2);
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$e */
    public static class C0105e extends ViewGroup.MarginLayoutParams {
        public C0105e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0105e(int i2, int i3) {
            super(i2, i3);
        }

        public C0105e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f727h = 0;
        this.f739t = new Rect();
        this.f740u = new Rect();
        this.f741v = new Rect();
        this.f742w = new Rect();
        this.f743x = new Rect();
        this.f744y = new Rect();
        this.f745z = new Rect();
        C0285c0 c0285c0 = C0285c0.f2294a;
        this.f715A = c0285c0;
        this.f716B = c0285c0;
        this.f717C = c0285c0;
        this.f718D = c0285c0;
        this.f722H = new C0101a();
        this.f723I = new RunnableC0102b();
        this.f724J = new RunnableC0103c();
        m681v(context);
        this.f725K = new C0305o(this);
    }

    /* renamed from: A */
    private void m676A() {
        m701u();
        this.f723I.run();
    }

    /* renamed from: B */
    private boolean m677B(float f2) {
        this.f720F.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f720F.getFinalY() > this.f729j.getHeight();
    }

    /* renamed from: p */
    private void m678p() {
        m701u();
        this.f724J.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m679q(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.C0105e) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = 1
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = 1
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = 1
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.m679q(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: t */
    private InterfaceC0198x m680t(View view) {
        if (view instanceof InterfaceC0198x) {
            return (InterfaceC0198x) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    /* renamed from: v */
    private void m681v(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f714f);
        this.f726g = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f731l = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f732m = context.getApplicationInfo().targetSdkVersion < 19;
        this.f720F = new OverScroller(context);
    }

    /* renamed from: x */
    private void m682x() {
        m701u();
        postDelayed(this.f724J, 600L);
    }

    /* renamed from: y */
    private void m683y() {
        m701u();
        postDelayed(this.f723I, 600L);
    }

    @Override // androidx.appcompat.widget.InterfaceC0196w
    /* renamed from: a */
    public void mo684a(Menu menu, InterfaceC0093m.a aVar) {
        m703z();
        this.f730k.mo1124a(menu, aVar);
    }

    @Override // androidx.appcompat.widget.InterfaceC0196w
    /* renamed from: b */
    public boolean mo685b() {
        m703z();
        return this.f730k.mo1125b();
    }

    @Override // androidx.appcompat.widget.InterfaceC0196w
    /* renamed from: c */
    public void mo686c() {
        m703z();
        this.f730k.mo1126c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0105e;
    }

    @Override // androidx.appcompat.widget.InterfaceC0196w
    /* renamed from: d */
    public boolean mo687d() {
        m703z();
        return this.f730k.mo1127d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f731l == null || this.f732m) {
            return;
        }
        int bottom = this.f729j.getVisibility() == 0 ? (int) (this.f729j.getBottom() + this.f729j.getTranslationY() + 0.5f) : 0;
        this.f731l.setBounds(0, bottom, getWidth(), this.f731l.getIntrinsicHeight() + bottom);
        this.f731l.draw(canvas);
    }

    @Override // androidx.appcompat.widget.InterfaceC0196w
    /* renamed from: e */
    public boolean mo688e() {
        m703z();
        return this.f730k.mo1128e();
    }

    @Override // androidx.appcompat.widget.InterfaceC0196w
    /* renamed from: f */
    public boolean mo689f() {
        m703z();
        return this.f730k.mo1129f();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 21) {
            return super.fitSystemWindows(rect);
        }
        m703z();
        boolean zM679q = m679q(this.f729j, rect, true, true, false, true);
        this.f742w.set(rect);
        C0197w0.m1230a(this, this.f742w, this.f739t);
        if (!this.f743x.equals(this.f742w)) {
            this.f743x.set(this.f742w);
            zM679q = true;
        }
        if (!this.f740u.equals(this.f739t)) {
            this.f740u.set(this.f739t);
            zM679q = true;
        }
        if (zM679q) {
            requestLayout();
        }
        return true;
    }

    @Override // androidx.appcompat.widget.InterfaceC0196w
    /* renamed from: g */
    public boolean mo690g() {
        m703z();
        return this.f730k.mo1130g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f729j;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f725K.m2075a();
    }

    public CharSequence getTitle() {
        m703z();
        return this.f730k.getTitle();
    }

    @Override // androidx.appcompat.widget.InterfaceC0196w
    /* renamed from: h */
    public void mo691h(int i2) {
        m703z();
        if (i2 == 2) {
            this.f730k.mo1144u();
        } else if (i2 == 5) {
            this.f730k.mo1145v();
        } else {
            if (i2 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0196w
    /* renamed from: i */
    public void mo692i() {
        m703z();
        this.f730k.mo1131h();
    }

    @Override // androidx.core.view.InterfaceC0303m
    /* renamed from: j */
    public void mo693j(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        mo694k(view, i2, i3, i4, i5, i6);
    }

    @Override // androidx.core.view.InterfaceC0302l
    /* renamed from: k */
    public void mo694k(View view, int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            onNestedScroll(view, i2, i3, i4, i5);
        }
    }

    @Override // androidx.core.view.InterfaceC0302l
    /* renamed from: l */
    public boolean mo695l(View view, View view2, int i2, int i3) {
        return i3 == 0 && onStartNestedScroll(view, view2, i2);
    }

    @Override // androidx.core.view.InterfaceC0302l
    /* renamed from: m */
    public void mo696m(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    @Override // androidx.core.view.InterfaceC0302l
    /* renamed from: n */
    public void mo697n(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // androidx.core.view.InterfaceC0302l
    /* renamed from: o */
    public void mo698o(View view, int i2, int i3, int[] iArr, int i4) {
        if (i4 == 0) {
            onNestedPreScroll(view, i2, i3, iArr);
        }
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m703z();
        C0285c0 c0285c0M1872u = C0285c0.m1872u(windowInsets);
        boolean zM679q = m679q(this.f729j, new Rect(c0285c0M1872u.m1882i(), c0285c0M1872u.m1884k(), c0285c0M1872u.m1883j(), c0285c0M1872u.m1881h()), true, true, false, true);
        C0311u.m2124f(this, c0285c0M1872u, this.f739t);
        Rect rect = this.f739t;
        C0285c0 c0285c0M1885l = c0285c0M1872u.m1885l(rect.left, rect.top, rect.right, rect.bottom);
        this.f715A = c0285c0M1885l;
        boolean z = true;
        if (!this.f716B.equals(c0285c0M1885l)) {
            this.f716B = this.f715A;
            zM679q = true;
        }
        if (this.f740u.equals(this.f739t)) {
            z = zM679q;
        } else {
            this.f740u.set(this.f739t);
        }
        if (z) {
            requestLayout();
        }
        return c0285c0M1872u.m1874a().m1876c().m1875b().m1892t();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m681v(getContext());
        C0311u.m2125f0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m701u();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0105e c0105e = (C0105e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = ((ViewGroup.MarginLayoutParams) c0105e).leftMargin + paddingLeft;
                int i8 = ((ViewGroup.MarginLayoutParams) c0105e).topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        int measuredHeight;
        m703z();
        measureChildWithMargins(this.f729j, i2, 0, i3, 0);
        C0105e c0105e = (C0105e) this.f729j.getLayoutParams();
        int iMax = Math.max(0, this.f729j.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0105e).leftMargin + ((ViewGroup.MarginLayoutParams) c0105e).rightMargin);
        int iMax2 = Math.max(0, this.f729j.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0105e).topMargin + ((ViewGroup.MarginLayoutParams) c0105e).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f729j.getMeasuredState());
        boolean z = (C0311u.m2095H(this) & 256) != 0;
        if (z) {
            measuredHeight = this.f726g;
            if (this.f734o && this.f729j.getTabContainer() != null) {
                measuredHeight += this.f726g;
            }
        } else {
            measuredHeight = this.f729j.getVisibility() != 8 ? this.f729j.getMeasuredHeight() : 0;
        }
        this.f741v.set(this.f739t);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 21) {
            this.f717C = this.f715A;
        } else {
            this.f744y.set(this.f742w);
        }
        if (!this.f733n && !z) {
            Rect rect = this.f741v;
            rect.top += measuredHeight;
            rect.bottom += 0;
            if (i4 >= 21) {
                this.f717C = this.f717C.m1885l(0, measuredHeight, 0, 0);
            }
        } else if (i4 >= 21) {
            this.f717C = new C0285c0.b(this.f717C).m1896c(C0924b.m5889b(this.f717C.m1882i(), this.f717C.m1884k() + measuredHeight, this.f717C.m1883j(), this.f717C.m1881h() + 0)).m1894a();
        } else {
            Rect rect2 = this.f744y;
            rect2.top += measuredHeight;
            rect2.bottom += 0;
        }
        m679q(this.f728i, this.f741v, true, true, true, true);
        if (i4 >= 21 && !this.f718D.equals(this.f717C)) {
            C0285c0 c0285c0 = this.f717C;
            this.f718D = c0285c0;
            C0311u.m2126g(this.f728i, c0285c0);
        } else if (i4 < 21 && !this.f745z.equals(this.f744y)) {
            this.f745z.set(this.f744y);
            this.f728i.m771a(this.f744y);
        }
        measureChildWithMargins(this.f728i, i2, 0, i3, 0);
        C0105e c0105e2 = (C0105e) this.f728i.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f728i.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0105e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0105e2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f728i.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0105e2).topMargin + ((ViewGroup.MarginLayoutParams) c0105e2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f728i.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i2, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i3, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC0304n
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        if (!this.f735p || !z) {
            return false;
        }
        if (m677B(f3)) {
            m678p();
        } else {
            m676A();
        }
        this.f736q = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC0304n
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC0304n
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC0304n
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        int i6 = this.f737r + i3;
        this.f737r = i6;
        setActionBarHideOffset(i6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC0304n
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        this.f725K.m2076b(view, view2, i2);
        this.f737r = getActionBarHideOffset();
        m701u();
        InterfaceC0104d interfaceC0104d = this.f719E;
        if (interfaceC0104d != null) {
            interfaceC0104d.mo449e();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC0304n
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.f729j.getVisibility() != 0) {
            return false;
        }
        return this.f735p;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC0304n
    public void onStopNestedScroll(View view) {
        if (this.f735p && !this.f736q) {
            if (this.f737r <= this.f729j.getHeight()) {
                m683y();
            } else {
                m682x();
            }
        }
        InterfaceC0104d interfaceC0104d = this.f719E;
        if (interfaceC0104d != null) {
            interfaceC0104d.mo446b();
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i2) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i2);
        }
        m703z();
        int i3 = this.f738s ^ i2;
        this.f738s = i2;
        boolean z = (i2 & 4) == 0;
        boolean z2 = (i2 & 256) != 0;
        InterfaceC0104d interfaceC0104d = this.f719E;
        if (interfaceC0104d != null) {
            interfaceC0104d.mo447c(!z2);
            if (z || !z2) {
                this.f719E.mo445a();
            } else {
                this.f719E.mo448d();
            }
        }
        if ((i3 & 256) == 0 || this.f719E == null) {
            return;
        }
        C0311u.m2125f0(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        this.f727h = i2;
        InterfaceC0104d interfaceC0104d = this.f719E;
        if (interfaceC0104d != null) {
            interfaceC0104d.onWindowVisibilityChanged(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public C0105e generateDefaultLayoutParams() {
        return new C0105e(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public C0105e generateLayoutParams(AttributeSet attributeSet) {
        return new C0105e(getContext(), attributeSet);
    }

    public void setActionBarHideOffset(int i2) {
        m701u();
        this.f729j.setTranslationY(-Math.max(0, Math.min(i2, this.f729j.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0104d interfaceC0104d) {
        this.f719E = interfaceC0104d;
        if (getWindowToken() != null) {
            this.f719E.onWindowVisibilityChanged(this.f727h);
            int i2 = this.f738s;
            if (i2 != 0) {
                onWindowSystemUiVisibilityChanged(i2);
                C0311u.m2125f0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f734o = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f735p) {
            this.f735p = z;
            if (z) {
                return;
            }
            m701u();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i2) {
        m703z();
        this.f730k.setIcon(i2);
    }

    public void setLogo(int i2) {
        m703z();
        this.f730k.mo1136m(i2);
    }

    public void setOverlayMode(boolean z) {
        this.f733n = z;
        this.f732m = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i2) {
    }

    @Override // androidx.appcompat.widget.InterfaceC0196w
    public void setWindowCallback(Window.Callback callback) {
        m703z();
        this.f730k.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.InterfaceC0196w
    public void setWindowTitle(CharSequence charSequence) {
        m703z();
        this.f730k.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: u */
    void m701u() {
        removeCallbacks(this.f723I);
        removeCallbacks(this.f724J);
        ViewPropertyAnimator viewPropertyAnimator = this.f721G;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: w */
    public boolean m702w() {
        return this.f733n;
    }

    /* renamed from: z */
    void m703z() {
        if (this.f728i == null) {
            this.f728i = (ContentFrameLayout) findViewById(C0828f.f5137b);
            this.f729j = (ActionBarContainer) findViewById(C0828f.f5138c);
            this.f730k = m680t(findViewById(C0828f.f5136a));
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0105e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        m703z();
        this.f730k.setIcon(drawable);
    }
}
