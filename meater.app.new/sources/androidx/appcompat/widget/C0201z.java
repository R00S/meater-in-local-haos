package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.graphics.drawable.C0265a;
import androidx.core.view.C0315y;
import androidx.core.widget.C0327h;
import java.lang.reflect.Field;
import p024c.p025a.C0823a;
import p024c.p025a.p028l.p029a.C0836c;

/* compiled from: DropDownListView.java */
/* renamed from: androidx.appcompat.widget.z */
/* loaded from: classes.dex */
class C0201z extends ListView {

    /* renamed from: f */
    private final Rect f1329f;

    /* renamed from: g */
    private int f1330g;

    /* renamed from: h */
    private int f1331h;

    /* renamed from: i */
    private int f1332i;

    /* renamed from: j */
    private int f1333j;

    /* renamed from: k */
    private int f1334k;

    /* renamed from: l */
    private Field f1335l;

    /* renamed from: m */
    private a f1336m;

    /* renamed from: n */
    private boolean f1337n;

    /* renamed from: o */
    private boolean f1338o;

    /* renamed from: p */
    private boolean f1339p;

    /* renamed from: q */
    private C0315y f1340q;

    /* renamed from: r */
    private C0327h f1341r;

    /* renamed from: s */
    b f1342s;

    /* compiled from: DropDownListView.java */
    /* renamed from: androidx.appcompat.widget.z$a */
    private static class a extends C0836c {

        /* renamed from: g */
        private boolean f1343g;

        a(Drawable drawable) {
            super(drawable);
            this.f1343g = true;
        }

        /* renamed from: c */
        void m1248c(boolean z) {
            this.f1343g = z;
        }

        @Override // p024c.p025a.p028l.p029a.C0836c, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f1343g) {
                super.draw(canvas);
            }
        }

        @Override // p024c.p025a.p028l.p029a.C0836c, android.graphics.drawable.Drawable
        public void setHotspot(float f2, float f3) {
            if (this.f1343g) {
                super.setHotspot(f2, f3);
            }
        }

        @Override // p024c.p025a.p028l.p029a.C0836c, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i2, int i3, int i4, int i5) {
            if (this.f1343g) {
                super.setHotspotBounds(i2, i3, i4, i5);
            }
        }

        @Override // p024c.p025a.p028l.p029a.C0836c, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f1343g) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // p024c.p025a.p028l.p029a.C0836c, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z, boolean z2) {
            if (this.f1343g) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* compiled from: DropDownListView.java */
    /* renamed from: androidx.appcompat.widget.z$b */
    private class b implements Runnable {
        b() {
        }

        /* renamed from: a */
        public void m1249a() {
            C0201z c0201z = C0201z.this;
            c0201z.f1342s = null;
            c0201z.removeCallbacks(this);
        }

        /* renamed from: b */
        public void m1250b() {
            C0201z.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            C0201z c0201z = C0201z.this;
            c0201z.f1342s = null;
            c0201z.drawableStateChanged();
        }
    }

    C0201z(Context context, boolean z) throws NoSuchFieldException {
        super(context, null, C0823a.f5012A);
        this.f1329f = new Rect();
        this.f1330g = 0;
        this.f1331h = 0;
        this.f1332i = 0;
        this.f1333j = 0;
        this.f1338o = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f1335l = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m1239a() {
        this.f1339p = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f1334k - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        C0315y c0315y = this.f1340q;
        if (c0315y != null) {
            c0315y.m2218b();
            this.f1340q = null;
        }
    }

    /* renamed from: b */
    private void m1240b(View view, int i2) {
        performItemClick(view, i2, getItemIdAtPosition(i2));
    }

    /* renamed from: c */
    private void m1241c(Canvas canvas) {
        Drawable selector;
        if (this.f1329f.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f1329f);
        selector.draw(canvas);
    }

    /* renamed from: f */
    private void m1242f(int i2, View view) throws IllegalAccessException, IllegalArgumentException {
        Rect rect = this.f1329f;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f1330g;
        rect.top -= this.f1331h;
        rect.right += this.f1332i;
        rect.bottom += this.f1333j;
        try {
            boolean z = this.f1335l.getBoolean(this);
            if (view.isEnabled() != z) {
                this.f1335l.set(this, Boolean.valueOf(!z));
                if (i2 != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: g */
    private void m1243g(int i2, View view) throws IllegalAccessException, IllegalArgumentException {
        Drawable selector = getSelector();
        boolean z = (selector == null || i2 == -1) ? false : true;
        if (z) {
            selector.setVisible(false, false);
        }
        m1242f(i2, view);
        if (z) {
            Rect rect = this.f1329f;
            float fExactCenterX = rect.exactCenterX();
            float fExactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            C0265a.m1814k(selector, fExactCenterX, fExactCenterY);
        }
    }

    /* renamed from: h */
    private void m1244h(int i2, View view, float f2, float f3) throws IllegalAccessException, IllegalArgumentException {
        m1243g(i2, view);
        Drawable selector = getSelector();
        if (selector == null || i2 == -1) {
            return;
        }
        C0265a.m1814k(selector, f2, f3);
    }

    /* renamed from: i */
    private void m1245i(View view, int i2, float f2, float f3) throws IllegalAccessException, IllegalArgumentException {
        View childAt;
        this.f1339p = true;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 21) {
            drawableHotspotChanged(f2, f3);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i4 = this.f1334k;
        if (i4 != -1 && (childAt = getChildAt(i4 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f1334k = i2;
        float left = f2 - view.getLeft();
        float top = f3 - view.getTop();
        if (i3 >= 21) {
            view.drawableHotspotChanged(left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m1244h(i2, view, f2, f3);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    /* renamed from: j */
    private boolean m1246j() {
        return this.f1339p;
    }

    /* renamed from: k */
    private void m1247k() {
        Drawable selector = getSelector();
        if (selector != null && m1246j() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void setSelectorEnabled(boolean z) {
        a aVar = this.f1336m;
        if (aVar != null) {
            aVar.m1248c(z);
        }
    }

    /* renamed from: d */
    public int mo964d(int i2, int i3, int i4, int i5, int i6) {
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
        View view = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < count) {
            int itemViewType = adapter.getItemViewType(i7);
            if (itemViewType != i8) {
                view = null;
                i8 = itemViewType;
            }
            view = adapter.getView(i7, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i10 = layoutParams.height;
            view.measure(i2, i10 > 0 ? View.MeasureSpec.makeMeasureSpec(i10, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i7 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i5) {
                return (i6 < 0 || i7 <= i6 || i9 <= 0 || measuredHeight == i5) ? i5 : i9;
            }
            if (i6 >= 0 && i7 >= i6) {
                i9 = measuredHeight;
            }
            i7++;
        }
        return measuredHeight;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        m1241c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f1342s != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        m1247k();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo965e(android.view.MotionEvent r8, int r9) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L14
            r9 = 3
            if (r0 == r9) goto L11
        Le:
            r9 = 0
            r3 = 1
            goto L46
        L11:
            r9 = 0
            r3 = 0
            goto L46
        L14:
            r3 = 1
            goto L17
        L16:
            r3 = 0
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
            r9 = 1
            goto L46
        L31:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.m1245i(r3, r5, r4, r9)
            if (r0 != r2) goto Le
            r7.m1240b(r3, r5)
            goto Le
        L46:
            if (r3 == 0) goto L4a
            if (r9 == 0) goto L4d
        L4a:
            r7.m1239a()
        L4d:
            if (r3 == 0) goto L65
            androidx.core.widget.h r9 = r7.f1341r
            if (r9 != 0) goto L5a
            androidx.core.widget.h r9 = new androidx.core.widget.h
            r9.<init>(r7)
            r7.f1341r = r9
        L5a:
            androidx.core.widget.h r9 = r7.f1341r
            r9.m2284m(r2)
            androidx.core.widget.h r9 = r7.f1341r
            r9.onTouch(r7, r8)
            goto L6c
        L65:
            androidx.core.widget.h r8 = r7.f1341r
            if (r8 == 0) goto L6c
            r8.m2284m(r1)
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0201z.mo965e(android.view.MotionEvent, int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f1338o || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f1338o || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f1338o || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f1338o && this.f1337n) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f1342s = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1342s == null) {
            b bVar = new b();
            this.f1342s = bVar;
            bVar.m1250b();
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                }
                m1247k();
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1334k = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b bVar = this.f1342s;
        if (bVar != null) {
            bVar.m1249a();
        }
        return super.onTouchEvent(motionEvent);
    }

    void setListSelectionHidden(boolean z) {
        this.f1337n = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        a aVar = drawable != null ? new a(drawable) : null;
        this.f1336m = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1330g = rect.left;
        this.f1331h = rect.top;
        this.f1332i = rect.right;
        this.f1333j = rect.bottom;
    }
}
