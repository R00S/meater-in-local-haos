package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import k1.C3784a;
import s1.C4434g0;

/* compiled from: DropDownListView.java */
/* loaded from: classes.dex */
class J extends ListView {

    /* renamed from: B, reason: collision with root package name */
    private final Rect f21250B;

    /* renamed from: C, reason: collision with root package name */
    private int f21251C;

    /* renamed from: D, reason: collision with root package name */
    private int f21252D;

    /* renamed from: E, reason: collision with root package name */
    private int f21253E;

    /* renamed from: F, reason: collision with root package name */
    private int f21254F;

    /* renamed from: G, reason: collision with root package name */
    private int f21255G;

    /* renamed from: H, reason: collision with root package name */
    private d f21256H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f21257I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f21258J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f21259K;

    /* renamed from: L, reason: collision with root package name */
    private C4434g0 f21260L;

    /* renamed from: M, reason: collision with root package name */
    private androidx.core.widget.g f21261M;

    /* renamed from: N, reason: collision with root package name */
    f f21262N;

    /* compiled from: DropDownListView.java */
    static class a {
        static void a(View view, float f10, float f11) {
            view.drawableHotspotChanged(f10, f11);
        }
    }

    /* compiled from: DropDownListView.java */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        private static Method f21263a;

        /* renamed from: b, reason: collision with root package name */
        private static Method f21264b;

        /* renamed from: c, reason: collision with root package name */
        private static Method f21265c;

        /* renamed from: d, reason: collision with root package name */
        private static boolean f21266d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Boolean.TYPE;
                Class cls3 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
                f21263a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f21264b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f21265c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f21266d = true;
            } catch (NoSuchMethodException e10) {
                e10.printStackTrace();
            }
        }

        static boolean a() {
            return f21266d;
        }

        @SuppressLint({"BanUncheckedReflection"})
        static void b(J j10, int i10, View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            try {
                f21263a.invoke(j10, Integer.valueOf(i10), view, Boolean.FALSE, -1, -1);
                f21264b.invoke(j10, Integer.valueOf(i10));
                f21265c.invoke(j10, Integer.valueOf(i10));
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
            } catch (InvocationTargetException e11) {
                e11.printStackTrace();
            }
        }
    }

    /* compiled from: DropDownListView.java */
    static class c {
        static boolean a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        static void b(AbsListView absListView, boolean z10) {
            absListView.setSelectedChildViewEnabled(z10);
        }
    }

    /* compiled from: DropDownListView.java */
    private static class d extends k.a {

        /* renamed from: C, reason: collision with root package name */
        private boolean f21267C;

        d(Drawable drawable) {
            super(drawable);
            this.f21267C = true;
        }

        void b(boolean z10) {
            this.f21267C = z10;
        }

        @Override // k.a, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f21267C) {
                super.draw(canvas);
            }
        }

        @Override // k.a, android.graphics.drawable.Drawable
        public void setHotspot(float f10, float f11) {
            if (this.f21267C) {
                super.setHotspot(f10, f11);
            }
        }

        @Override // k.a, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i10, int i11, int i12, int i13) {
            if (this.f21267C) {
                super.setHotspotBounds(i10, i11, i12, i13);
            }
        }

        @Override // k.a, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f21267C) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // k.a, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z10, boolean z11) {
            if (this.f21267C) {
                return super.setVisible(z10, z11);
            }
            return false;
        }
    }

    /* compiled from: DropDownListView.java */
    static class e {

        /* renamed from: a, reason: collision with root package name */
        private static final Field f21268a;

        static {
            Field declaredField = null;
            try {
                declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                e10.printStackTrace();
            }
            f21268a = declaredField;
        }

        static boolean a(AbsListView absListView) {
            Field field = f21268a;
            if (field == null) {
                return false;
            }
            try {
                return field.getBoolean(absListView);
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
                return false;
            }
        }

        static void b(AbsListView absListView, boolean z10) throws IllegalAccessException, IllegalArgumentException {
            Field field = f21268a;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z10));
                } catch (IllegalAccessException e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    /* compiled from: DropDownListView.java */
    private class f implements Runnable {
        f() {
        }

        public void a() {
            J j10 = J.this;
            j10.f21262N = null;
            j10.removeCallbacks(this);
        }

        public void b() {
            J.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            J j10 = J.this;
            j10.f21262N = null;
            j10.drawableStateChanged();
        }
    }

    J(Context context, boolean z10) {
        super(context, null, i.a.f42379B);
        this.f21250B = new Rect();
        this.f21251C = 0;
        this.f21252D = 0;
        this.f21253E = 0;
        this.f21254F = 0;
        this.f21258J = z10;
        setCacheColorHint(0);
    }

    private void a() {
        this.f21259K = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f21255G - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        C4434g0 c4434g0 = this.f21260L;
        if (c4434g0 != null) {
            c4434g0.c();
            this.f21260L = null;
        }
    }

    private void b(View view, int i10) {
        performItemClick(view, i10, getItemIdAtPosition(i10));
    }

    private void c(Canvas canvas) {
        Drawable selector;
        if (this.f21250B.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f21250B);
        selector.draw(canvas);
    }

    private void f(int i10, View view) throws IllegalAccessException, IllegalArgumentException {
        Rect rect = this.f21250B;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f21251C;
        rect.top -= this.f21252D;
        rect.right += this.f21253E;
        rect.bottom += this.f21254F;
        boolean zJ = j();
        if (view.isEnabled() != zJ) {
            k(!zJ);
            if (i10 != -1) {
                refreshDrawableState();
            }
        }
    }

    private void g(int i10, View view) throws IllegalAccessException, IllegalArgumentException {
        Drawable selector = getSelector();
        boolean z10 = (selector == null || i10 == -1) ? false : true;
        if (z10) {
            selector.setVisible(false, false);
        }
        f(i10, view);
        if (z10) {
            Rect rect = this.f21250B;
            float fExactCenterX = rect.exactCenterX();
            float fExactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            C3784a.k(selector, fExactCenterX, fExactCenterY);
        }
    }

    private void h(int i10, View view, float f10, float f11) throws IllegalAccessException, IllegalArgumentException {
        g(i10, view);
        Drawable selector = getSelector();
        if (selector == null || i10 == -1) {
            return;
        }
        C3784a.k(selector, f10, f11);
    }

    private void i(View view, int i10, float f10, float f11) throws IllegalAccessException, IllegalArgumentException {
        View childAt;
        this.f21259K = true;
        a.a(this, f10, f11);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i11 = this.f21255G;
        if (i11 != -1 && (childAt = getChildAt(i11 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f21255G = i10;
        a.a(view, f10 - view.getLeft(), f11 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        h(i10, view, f10, f11);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    private boolean j() {
        return Build.VERSION.SDK_INT >= 33 ? c.a(this) : e.a(this);
    }

    private void k(boolean z10) throws IllegalAccessException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 33) {
            c.b(this, z10);
        } else {
            e.b(this, z10);
        }
    }

    private boolean l() {
        return this.f21259K;
    }

    private void m() {
        Drawable selector = getSelector();
        if (selector != null && l() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void setSelectorEnabled(boolean z10) {
        d dVar = this.f21256H;
        if (dVar != null) {
            dVar.b(z10);
        }
    }

    public int d(int i10, int i11, int i12, int i13, int i14) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        View view = null;
        while (i15 < count) {
            int itemViewType = adapter.getItemViewType(i15);
            if (itemViewType != i16) {
                view = null;
                i16 = itemViewType;
            }
            view = adapter.getView(i15, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i18 = layoutParams.height;
            view.measure(i10, i18 > 0 ? View.MeasureSpec.makeMeasureSpec(i18, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i15 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i13) {
                return (i14 < 0 || i15 <= i14 || i17 <= 0 || measuredHeight == i13) ? i13 : i17;
            }
            if (i14 >= 0 && i15 >= i14) {
                i17 = measuredHeight;
            }
            i15++;
        }
        return measuredHeight;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f21262N != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        m();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean e(android.view.MotionEvent r8, int r9) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L16
            r3 = 2
            if (r0 == r3) goto L14
            r9 = 3
            if (r0 == r9) goto L11
        Le:
            r3 = r1
            r9 = r2
            goto L46
        L11:
            r9 = r2
            r3 = r9
            goto L46
        L14:
            r3 = r1
            goto L17
        L16:
            r3 = r2
        L17:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L1e
            goto L11
        L1e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L31
            r9 = r1
            goto L46
        L31:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.i(r3, r5, r4, r9)
            if (r0 != r1) goto Le
            r7.b(r3, r5)
            goto Le
        L46:
            if (r3 == 0) goto L4a
            if (r9 == 0) goto L4d
        L4a:
            r7.a()
        L4d:
            if (r3 == 0) goto L65
            androidx.core.widget.g r9 = r7.f21261M
            if (r9 != 0) goto L5a
            androidx.core.widget.g r9 = new androidx.core.widget.g
            r9.<init>(r7)
            r7.f21261M = r9
        L5a:
            androidx.core.widget.g r9 = r7.f21261M
            r9.m(r1)
            androidx.core.widget.g r9 = r7.f21261M
            r9.onTouch(r7, r8)
            goto L6c
        L65:
            androidx.core.widget.g r8 = r7.f21261M
            if (r8 == 0) goto L6c
            r8.m(r2)
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.J.e(android.view.MotionEvent, int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f21258J || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f21258J || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f21258J || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f21258J && this.f21257I) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f21262N = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i10 = Build.VERSION.SDK_INT;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f21262N == null) {
            f fVar = new f();
            this.f21262N = fVar;
            fVar.b();
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i10 < 30 || !b.a()) {
                        setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                    } else {
                        b.b(this, iPointToPosition, childAt);
                    }
                }
                m();
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f21255G = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.f21262N;
        if (fVar != null) {
            fVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    void setListSelectionHidden(boolean z10) {
        this.f21257I = z10;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        d dVar = drawable != null ? new d(drawable) : null;
        this.f21256H = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f21251C = rect.left;
        this.f21252D = rect.top;
        this.f21253E = rect.right;
        this.f21254F = rect.bottom;
    }
}
