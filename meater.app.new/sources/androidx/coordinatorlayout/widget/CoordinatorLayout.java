package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.content.C0255a;
import androidx.core.graphics.drawable.C0265a;
import androidx.core.view.C0285c0;
import androidx.core.view.C0286d;
import androidx.core.view.C0305o;
import androidx.core.view.C0311u;
import androidx.core.view.InterfaceC0302l;
import androidx.core.view.InterfaceC0303m;
import androidx.core.view.InterfaceC0306p;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p024c.p051h.C0916a;
import p024c.p051h.C0917b;
import p024c.p051h.C0918c;
import p024c.p052i.p059j.C0954d;
import p024c.p052i.p059j.C0958h;
import p024c.p052i.p059j.InterfaceC0956f;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0302l, InterfaceC0303m {

    /* renamed from: f */
    static final String f1975f;

    /* renamed from: g */
    static final Class<?>[] f1976g;

    /* renamed from: h */
    static final ThreadLocal<Map<String, Constructor<AbstractC0226c>>> f1977h;

    /* renamed from: i */
    static final Comparator<View> f1978i;

    /* renamed from: j */
    private static final InterfaceC0956f<Rect> f1979j;

    /* renamed from: A */
    private Drawable f1980A;

    /* renamed from: B */
    ViewGroup.OnHierarchyChangeListener f1981B;

    /* renamed from: C */
    private InterfaceC0306p f1982C;

    /* renamed from: D */
    private final C0305o f1983D;

    /* renamed from: k */
    private final List<View> f1984k;

    /* renamed from: l */
    private final C0232a<View> f1985l;

    /* renamed from: m */
    private final List<View> f1986m;

    /* renamed from: n */
    private final List<View> f1987n;

    /* renamed from: o */
    private Paint f1988o;

    /* renamed from: p */
    private final int[] f1989p;

    /* renamed from: q */
    private final int[] f1990q;

    /* renamed from: r */
    private boolean f1991r;

    /* renamed from: s */
    private boolean f1992s;

    /* renamed from: t */
    private int[] f1993t;

    /* renamed from: u */
    private View f1994u;

    /* renamed from: v */
    private View f1995v;

    /* renamed from: w */
    private ViewTreeObserverOnPreDrawListenerC0230g f1996w;

    /* renamed from: x */
    private boolean f1997x;

    /* renamed from: y */
    private C0285c0 f1998y;

    /* renamed from: z */
    private boolean f1999z;

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    class C0224a implements InterfaceC0306p {
        C0224a() {
        }

        @Override // androidx.core.view.InterfaceC0306p
        /* renamed from: a */
        public C0285c0 mo363a(View view, C0285c0 c0285c0) {
            return CoordinatorLayout.this.m1426W(c0285c0);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    public interface InterfaceC0225b {
        AbstractC0226c getBehavior();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    public static abstract class AbstractC0226c<V extends View> {
        public AbstractC0226c() {
        }

        /* renamed from: A */
        public boolean mo1443A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i2, int i3) {
            if (i3 == 0) {
                return m1472z(coordinatorLayout, v, view, view2, i2);
            }
            return false;
        }

        @Deprecated
        /* renamed from: B */
        public void m1444B(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        /* renamed from: C */
        public void mo1445C(CoordinatorLayout coordinatorLayout, V v, View view, int i2) {
            if (i2 == 0) {
                m1444B(coordinatorLayout, v, view);
            }
        }

        /* renamed from: D */
        public boolean mo1446D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: a */
        public boolean m1447a(CoordinatorLayout coordinatorLayout, V v) {
            return m1450d(coordinatorLayout, v) > 0.0f;
        }

        /* renamed from: b */
        public boolean mo1448b(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        /* renamed from: c */
        public int m1449c(CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        /* renamed from: d */
        public float m1450d(CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        /* renamed from: e */
        public boolean mo1451e(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: f */
        public C0285c0 m1452f(CoordinatorLayout coordinatorLayout, V v, C0285c0 c0285c0) {
            return c0285c0;
        }

        /* renamed from: g */
        public void mo1453g(C0229f c0229f) {
        }

        /* renamed from: h */
        public boolean mo1454h(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: i */
        public void mo1455i(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        /* renamed from: j */
        public void mo1456j() {
        }

        /* renamed from: k */
        public boolean mo1457k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: l */
        public boolean mo1458l(CoordinatorLayout coordinatorLayout, V v, int i2) {
            return false;
        }

        /* renamed from: m */
        public boolean mo1459m(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4, int i5) {
            return false;
        }

        /* renamed from: n */
        public boolean m1460n(CoordinatorLayout coordinatorLayout, V v, View view, float f2, float f3, boolean z) {
            return false;
        }

        /* renamed from: o */
        public boolean mo1461o(CoordinatorLayout coordinatorLayout, V v, View view, float f2, float f3) {
            return false;
        }

        @Deprecated
        /* renamed from: p */
        public void m1462p(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int[] iArr) {
        }

        /* renamed from: q */
        public void mo1463q(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int[] iArr, int i4) {
            if (i4 == 0) {
                m1462p(coordinatorLayout, v, view, i2, i3, iArr);
            }
        }

        @Deprecated
        /* renamed from: r */
        public void m1464r(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int i4, int i5) {
        }

        @Deprecated
        /* renamed from: s */
        public void m1465s(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int i4, int i5, int i6) {
            if (i6 == 0) {
                m1464r(coordinatorLayout, v, view, i2, i3, i4, i5);
            }
        }

        /* renamed from: t */
        public void mo1466t(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
            iArr[0] = iArr[0] + i4;
            iArr[1] = iArr[1] + i5;
            m1465s(coordinatorLayout, v, view, i2, i3, i4, i5, i6);
        }

        @Deprecated
        /* renamed from: u */
        public void m1467u(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i2) {
        }

        /* renamed from: v */
        public void m1468v(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i2, int i3) {
            if (i3 == 0) {
                m1467u(coordinatorLayout, v, view, view2, i2);
            }
        }

        /* renamed from: w */
        public boolean mo1469w(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        /* renamed from: x */
        public void mo1470x(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        /* renamed from: y */
        public Parcelable mo1471y(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        /* renamed from: z */
        public boolean m1472z(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i2) {
            return false;
        }

        public AbstractC0226c(Context context, AttributeSet attributeSet) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    public @interface InterfaceC0227d {
        Class<? extends AbstractC0226c> value();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$e */
    private class ViewGroupOnHierarchyChangeListenerC0228e implements ViewGroup.OnHierarchyChangeListener {
        ViewGroupOnHierarchyChangeListenerC0228e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f1981B;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.m1421H(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f1981B;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g */
    class ViewTreeObserverOnPreDrawListenerC0230g implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserverOnPreDrawListenerC0230g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.m1421H(0);
            return true;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h */
    static class C0231h implements Comparator<View> {
        C0231h() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float fM2096I = C0311u.m2096I(view);
            float fM2096I2 = C0311u.m2096I(view2);
            if (fM2096I > fM2096I2) {
                return -1;
            }
            return fM2096I < fM2096I2 ? 1 : 0;
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        f1975f = r0 != null ? r0.getName() : null;
        if (Build.VERSION.SDK_INT >= 21) {
            f1978i = new C0231h();
        } else {
            f1978i = null;
        }
        f1976g = new Class[]{Context.class, AttributeSet.class};
        f1977h = new ThreadLocal<>();
        f1979j = new C0958h(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0916a.f6175a);
    }

    /* renamed from: A */
    private boolean m1396A(View view) {
        return this.f1985l.m1504j(view);
    }

    /* renamed from: C */
    private void m1397C(View view, int i2) {
        C0229f c0229f = (C0229f) view.getLayoutParams();
        Rect rectM1412a = m1412a();
        rectM1412a.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0229f).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0229f).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0229f).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0229f).bottomMargin);
        if (this.f1998y != null && C0311u.m2156v(this) && !C0311u.m2156v(view)) {
            rectM1412a.left += this.f1998y.m1882i();
            rectM1412a.top += this.f1998y.m1884k();
            rectM1412a.right -= this.f1998y.m1883j();
            rectM1412a.bottom -= this.f1998y.m1881h();
        }
        Rect rectM1412a2 = m1412a();
        C0286d.m1931a(m1407S(c0229f.f2005c), view.getMeasuredWidth(), view.getMeasuredHeight(), rectM1412a, rectM1412a2, i2);
        view.layout(rectM1412a2.left, rectM1412a2.top, rectM1412a2.right, rectM1412a2.bottom);
        m1404O(rectM1412a);
        m1404O(rectM1412a2);
    }

    /* renamed from: D */
    private void m1398D(View view, View view2, int i2) {
        Rect rectM1412a = m1412a();
        Rect rectM1412a2 = m1412a();
        try {
            m1436t(view2, rectM1412a);
            m1437u(view, i2, rectM1412a, rectM1412a2);
            view.layout(rectM1412a2.left, rectM1412a2.top, rectM1412a2.right, rectM1412a2.bottom);
        } finally {
            m1404O(rectM1412a);
            m1404O(rectM1412a2);
        }
    }

    /* renamed from: E */
    private void m1399E(View view, int i2, int i3) {
        C0229f c0229f = (C0229f) view.getLayoutParams();
        int iM1932b = C0286d.m1932b(m1408T(c0229f.f2005c), i3);
        int i4 = iM1932b & 7;
        int i5 = iM1932b & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i3 == 1) {
            i2 = width - i2;
        }
        int iM1417w = m1417w(i2) - measuredWidth;
        int i6 = 0;
        if (i4 == 1) {
            iM1417w += measuredWidth / 2;
        } else if (i4 == 5) {
            iM1417w += measuredWidth;
        }
        if (i5 == 16) {
            i6 = 0 + (measuredHeight / 2);
        } else if (i5 == 80) {
            i6 = measuredHeight + 0;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0229f).leftMargin, Math.min(iM1417w, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) c0229f).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0229f).topMargin, Math.min(i6, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c0229f).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth + iMax, measuredHeight + iMax2);
    }

    /* renamed from: F */
    private void m1400F(View view, Rect rect, int i2) {
        boolean z;
        boolean z2;
        int width;
        int i3;
        int i4;
        int i5;
        int height;
        int i6;
        int i7;
        int i8;
        if (C0311u.m2102O(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            C0229f c0229f = (C0229f) view.getLayoutParams();
            AbstractC0226c abstractC0226cM1481f = c0229f.m1481f();
            Rect rectM1412a = m1412a();
            Rect rectM1412a2 = m1412a();
            rectM1412a2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (abstractC0226cM1481f == null || !abstractC0226cM1481f.mo1448b(this, view, rectM1412a)) {
                rectM1412a.set(rectM1412a2);
            } else if (!rectM1412a2.contains(rectM1412a)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectM1412a.toShortString() + " | Bounds:" + rectM1412a2.toShortString());
            }
            m1404O(rectM1412a2);
            if (rectM1412a.isEmpty()) {
                m1404O(rectM1412a);
                return;
            }
            int iM1932b = C0286d.m1932b(c0229f.f2010h, i2);
            boolean z3 = true;
            if ((iM1932b & 48) != 48 || (i7 = (rectM1412a.top - ((ViewGroup.MarginLayoutParams) c0229f).topMargin) - c0229f.f2012j) >= (i8 = rect.top)) {
                z = false;
            } else {
                m1410V(view, i8 - i7);
                z = true;
            }
            if ((iM1932b & 80) == 80 && (height = ((getHeight() - rectM1412a.bottom) - ((ViewGroup.MarginLayoutParams) c0229f).bottomMargin) + c0229f.f2012j) < (i6 = rect.bottom)) {
                m1410V(view, height - i6);
                z = true;
            }
            if (!z) {
                m1410V(view, 0);
            }
            if ((iM1932b & 3) != 3 || (i4 = (rectM1412a.left - ((ViewGroup.MarginLayoutParams) c0229f).leftMargin) - c0229f.f2011i) >= (i5 = rect.left)) {
                z2 = false;
            } else {
                m1409U(view, i5 - i4);
                z2 = true;
            }
            if ((iM1932b & 5) != 5 || (width = ((getWidth() - rectM1412a.right) - ((ViewGroup.MarginLayoutParams) c0229f).rightMargin) + c0229f.f2011i) >= (i3 = rect.right)) {
                z3 = z2;
            } else {
                m1409U(view, width - i3);
            }
            if (!z3) {
                m1409U(view, 0);
            }
            m1404O(rectM1412a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: K */
    static AbstractC0226c m1401K(Context context, AttributeSet attributeSet, String str) throws NoSuchMethodException, SecurityException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f1975f;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<AbstractC0226c>>> threadLocal = f1977h;
            Map<String, Constructor<AbstractC0226c>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<AbstractC0226c> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f1976g);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e2) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e2);
        }
    }

    /* renamed from: L */
    private boolean m1402L(MotionEvent motionEvent, int i2) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f1986m;
        m1418z(list);
        int size = list.size();
        MotionEvent motionEventObtain = null;
        boolean zMo1457k = false;
        boolean z = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = list.get(i3);
            C0229f c0229f = (C0229f) view.getLayoutParams();
            AbstractC0226c abstractC0226cM1481f = c0229f.m1481f();
            if (!(zMo1457k || z) || actionMasked == 0) {
                if (!zMo1457k && abstractC0226cM1481f != null) {
                    if (i2 == 0) {
                        zMo1457k = abstractC0226cM1481f.mo1457k(this, view, motionEvent);
                    } else if (i2 == 1) {
                        zMo1457k = abstractC0226cM1481f.mo1446D(this, view, motionEvent);
                    }
                    if (zMo1457k) {
                        this.f1994u = view;
                    }
                }
                boolean zM1478c = c0229f.m1478c();
                boolean zM1484i = c0229f.m1484i(this, view);
                z = zM1484i && !zM1478c;
                if (zM1484i && !z) {
                    break;
                }
            } else if (abstractC0226cM1481f != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i2 == 0) {
                    abstractC0226cM1481f.mo1457k(this, view, motionEventObtain);
                } else if (i2 == 1) {
                    abstractC0226cM1481f.mo1446D(this, view, motionEventObtain);
                }
            }
        }
        list.clear();
        return zMo1457k;
    }

    /* renamed from: M */
    private void m1403M() {
        this.f1984k.clear();
        this.f1985l.m1499c();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0229f c0229fM1439y = m1439y(childAt);
            c0229fM1439y.m1479d(this, childAt);
            this.f1985l.m1498b(childAt);
            for (int i3 = 0; i3 < childCount; i3++) {
                if (i3 != i2) {
                    View childAt2 = getChildAt(i3);
                    if (c0229fM1439y.m1477b(this, childAt, childAt2)) {
                        if (!this.f1985l.m1500d(childAt2)) {
                            this.f1985l.m1498b(childAt2);
                        }
                        this.f1985l.m1497a(childAt2, childAt);
                    }
                }
            }
        }
        this.f1984k.addAll(this.f1985l.m1503i());
        Collections.reverse(this.f1984k);
    }

    /* renamed from: O */
    private static void m1404O(Rect rect) {
        rect.setEmpty();
        f1979j.mo6060a(rect);
    }

    /* renamed from: Q */
    private void m1405Q(boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            AbstractC0226c abstractC0226cM1481f = ((C0229f) childAt.getLayoutParams()).m1481f();
            if (abstractC0226cM1481f != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    abstractC0226cM1481f.mo1457k(this, childAt, motionEventObtain);
                } else {
                    abstractC0226cM1481f.mo1446D(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            ((C0229f) getChildAt(i3).getLayoutParams()).m1488m();
        }
        this.f1994u = null;
        this.f1991r = false;
    }

    /* renamed from: R */
    private static int m1406R(int i2) {
        if (i2 == 0) {
            return 17;
        }
        return i2;
    }

    /* renamed from: S */
    private static int m1407S(int i2) {
        if ((i2 & 7) == 0) {
            i2 |= 8388611;
        }
        return (i2 & 112) == 0 ? i2 | 48 : i2;
    }

    /* renamed from: T */
    private static int m1408T(int i2) {
        if (i2 == 0) {
            return 8388661;
        }
        return i2;
    }

    /* renamed from: U */
    private void m1409U(View view, int i2) {
        C0229f c0229f = (C0229f) view.getLayoutParams();
        int i3 = c0229f.f2011i;
        if (i3 != i2) {
            C0311u.m2107T(view, i2 - i3);
            c0229f.f2011i = i2;
        }
    }

    /* renamed from: V */
    private void m1410V(View view, int i2) {
        C0229f c0229f = (C0229f) view.getLayoutParams();
        int i3 = c0229f.f2012j;
        if (i3 != i2) {
            C0311u.m2108U(view, i2 - i3);
            c0229f.f2012j = i2;
        }
    }

    /* renamed from: X */
    private void m1411X() {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (!C0311u.m2156v(this)) {
            C0311u.m2157v0(this, null);
            return;
        }
        if (this.f1982C == null) {
            this.f1982C = new C0224a();
        }
        C0311u.m2157v0(this, this.f1982C);
        setSystemUiVisibility(1280);
    }

    /* renamed from: a */
    private static Rect m1412a() {
        Rect rectMo6061b = f1979j.mo6061b();
        return rectMo6061b == null ? new Rect() : rectMo6061b;
    }

    /* renamed from: c */
    private static int m1413c(int i2, int i3, int i4) {
        return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
    }

    /* renamed from: d */
    private void m1414d(C0229f c0229f, Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0229f).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - ((ViewGroup.MarginLayoutParams) c0229f).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0229f).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - ((ViewGroup.MarginLayoutParams) c0229f).bottomMargin));
        rect.set(iMax, iMax2, i2 + iMax, i3 + iMax2);
    }

    /* renamed from: e */
    private C0285c0 m1415e(C0285c0 c0285c0) {
        AbstractC0226c abstractC0226cM1481f;
        if (c0285c0.m1886n()) {
            return c0285c0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (C0311u.m2156v(childAt) && (abstractC0226cM1481f = ((C0229f) childAt.getLayoutParams()).m1481f()) != null) {
                c0285c0 = abstractC0226cM1481f.m1452f(this, childAt, c0285c0);
                if (c0285c0.m1886n()) {
                    break;
                }
            }
        }
        return c0285c0;
    }

    /* renamed from: v */
    private void m1416v(View view, int i2, Rect rect, Rect rect2, C0229f c0229f, int i3, int i4) {
        int iM1932b = C0286d.m1932b(m1406R(c0229f.f2005c), i2);
        int iM1932b2 = C0286d.m1932b(m1407S(c0229f.f2006d), i2);
        int i5 = iM1932b & 7;
        int i6 = iM1932b & 112;
        int i7 = iM1932b2 & 7;
        int i8 = iM1932b2 & 112;
        int iWidth = i7 != 1 ? i7 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i8 != 16 ? i8 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i5 == 1) {
            iWidth -= i3 / 2;
        } else if (i5 != 5) {
            iWidth -= i3;
        }
        if (i6 == 16) {
            iHeight -= i4 / 2;
        } else if (i6 != 80) {
            iHeight -= i4;
        }
        rect2.set(iWidth, iHeight, i3 + iWidth, i4 + iHeight);
    }

    /* renamed from: w */
    private int m1417w(int i2) {
        int[] iArr = this.f1993t;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i2);
            return 0;
        }
        if (i2 >= 0 && i2 < iArr.length) {
            return iArr[i2];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i2 + " out of range for " + this);
        return 0;
    }

    /* renamed from: z */
    private void m1418z(List<View> list) {
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        Comparator<View> comparator = f1978i;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    /* renamed from: B */
    public boolean m1419B(View view, int i2, int i3) {
        Rect rectM1412a = m1412a();
        m1436t(view, rectM1412a);
        try {
            return rectM1412a.contains(i2, i3);
        } finally {
            m1404O(rectM1412a);
        }
    }

    /* renamed from: G */
    void m1420G(View view, int i2) {
        AbstractC0226c abstractC0226cM1481f;
        C0229f c0229f = (C0229f) view.getLayoutParams();
        if (c0229f.f2013k != null) {
            Rect rectM1412a = m1412a();
            Rect rectM1412a2 = m1412a();
            Rect rectM1412a3 = m1412a();
            m1436t(c0229f.f2013k, rectM1412a);
            m1433q(view, false, rectM1412a2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            m1416v(view, i2, rectM1412a, rectM1412a3, c0229f, measuredWidth, measuredHeight);
            boolean z = (rectM1412a3.left == rectM1412a2.left && rectM1412a3.top == rectM1412a2.top) ? false : true;
            m1414d(c0229f, rectM1412a3, measuredWidth, measuredHeight);
            int i3 = rectM1412a3.left - rectM1412a2.left;
            int i4 = rectM1412a3.top - rectM1412a2.top;
            if (i3 != 0) {
                C0311u.m2107T(view, i3);
            }
            if (i4 != 0) {
                C0311u.m2108U(view, i4);
            }
            if (z && (abstractC0226cM1481f = c0229f.m1481f()) != null) {
                abstractC0226cM1481f.mo1454h(this, view, c0229f.f2013k);
            }
            m1404O(rectM1412a);
            m1404O(rectM1412a2);
            m1404O(rectM1412a3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void m1421H(int r18) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.m1421H(int):void");
    }

    /* renamed from: I */
    public void m1422I(View view, int i2) {
        C0229f c0229f = (C0229f) view.getLayoutParams();
        if (c0229f.m1476a()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view2 = c0229f.f2013k;
        if (view2 != null) {
            m1398D(view, view2, i2);
            return;
        }
        int i3 = c0229f.f2007e;
        if (i3 >= 0) {
            m1399E(view, i3, i2);
        } else {
            m1397C(view, i2);
        }
    }

    /* renamed from: J */
    public void m1423J(View view, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* renamed from: N */
    void m1424N(View view, Rect rect) {
        ((C0229f) view.getLayoutParams()).m1491q(rect);
    }

    /* renamed from: P */
    void m1425P() {
        if (this.f1992s && this.f1996w != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1996w);
        }
        this.f1997x = false;
    }

    /* renamed from: W */
    final C0285c0 m1426W(C0285c0 c0285c0) {
        if (C0954d.m6056a(this.f1998y, c0285c0)) {
            return c0285c0;
        }
        this.f1998y = c0285c0;
        boolean z = c0285c0 != null && c0285c0.m1884k() > 0;
        this.f1999z = z;
        setWillNotDraw(!z && getBackground() == null);
        C0285c0 c0285c0M1415e = m1415e(c0285c0);
        requestLayout();
        return c0285c0M1415e;
    }

    /* renamed from: b */
    void m1427b() {
        if (this.f1992s) {
            if (this.f1996w == null) {
                this.f1996w = new ViewTreeObserverOnPreDrawListenerC0230g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1996w);
        }
        this.f1997x = true;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0229f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j2) {
        C0229f c0229f = (C0229f) view.getLayoutParams();
        AbstractC0226c abstractC0226c = c0229f.f2003a;
        if (abstractC0226c != null) {
            float fM1450d = abstractC0226c.m1450d(this, view);
            if (fM1450d > 0.0f) {
                if (this.f1988o == null) {
                    this.f1988o = new Paint();
                }
                this.f1988o.setColor(c0229f.f2003a.m1449c(this, view));
                this.f1988o.setAlpha(m1413c(Math.round(fM1450d * 255.0f), 0, 255));
                int iSave = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f1988o);
                canvas.restoreToCount(iSave);
            }
        }
        return super.drawChild(canvas, view, j2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1980A;
        boolean state = false;
        if (drawable != null && drawable.isStateful()) {
            state = false | drawable.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    /* renamed from: f */
    public void m1428f(View view) {
        List listM1501g = this.f1985l.m1501g(view);
        if (listM1501g == null || listM1501g.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < listM1501g.size(); i2++) {
            View view2 = (View) listM1501g.get(i2);
            AbstractC0226c abstractC0226cM1481f = ((C0229f) view2.getLayoutParams()).m1481f();
            if (abstractC0226cM1481f != null) {
                abstractC0226cM1481f.mo1454h(this, view2, view);
            }
        }
    }

    /* renamed from: g */
    void m1429g() {
        int childCount = getChildCount();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            if (m1396A(getChildAt(i2))) {
                z = true;
                break;
            }
            i2++;
        }
        if (z != this.f1997x) {
            if (z) {
                m1427b();
            } else {
                m1425P();
            }
        }
    }

    final List<View> getDependencySortedChildren() {
        m1403M();
        return Collections.unmodifiableList(this.f1984k);
    }

    public final C0285c0 getLastWindowInsets() {
        return this.f1998y;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f1983D.m2075a();
    }

    public Drawable getStatusBarBackground() {
        return this.f1980A;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C0229f generateDefaultLayoutParams() {
        return new C0229f(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public C0229f generateLayoutParams(AttributeSet attributeSet) {
        return new C0229f(getContext(), attributeSet);
    }

    @Override // androidx.core.view.InterfaceC0303m
    /* renamed from: j */
    public void mo693j(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        AbstractC0226c abstractC0226cM1481f;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                C0229f c0229f = (C0229f) childAt.getLayoutParams();
                if (c0229f.m1485j(i6) && (abstractC0226cM1481f = c0229f.m1481f()) != null) {
                    int[] iArr2 = this.f1989p;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC0226cM1481f.mo1466t(this, childAt, view, i2, i3, i4, i5, i6, iArr2);
                    int[] iArr3 = this.f1989p;
                    iMax = i4 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    iMax2 = i5 > 0 ? Math.max(iMax2, this.f1989p[1]) : Math.min(iMax2, this.f1989p[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z) {
            m1421H(1);
        }
    }

    @Override // androidx.core.view.InterfaceC0302l
    /* renamed from: k */
    public void mo694k(View view, int i2, int i3, int i4, int i5, int i6) {
        mo693j(view, i2, i3, i4, i5, 0, this.f1990q);
    }

    @Override // androidx.core.view.InterfaceC0302l
    /* renamed from: l */
    public boolean mo695l(View view, View view2, int i2, int i3) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0229f c0229f = (C0229f) childAt.getLayoutParams();
                AbstractC0226c abstractC0226cM1481f = c0229f.m1481f();
                if (abstractC0226cM1481f != null) {
                    boolean zMo1443A = abstractC0226cM1481f.mo1443A(this, childAt, view, view2, i2, i3);
                    z |= zMo1443A;
                    c0229f.m1492r(i3, zMo1443A);
                } else {
                    c0229f.m1492r(i3, false);
                }
            }
        }
        return z;
    }

    @Override // androidx.core.view.InterfaceC0302l
    /* renamed from: m */
    public void mo696m(View view, View view2, int i2, int i3) {
        AbstractC0226c abstractC0226cM1481f;
        this.f1983D.m2077c(view, view2, i2, i3);
        this.f1995v = view2;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            C0229f c0229f = (C0229f) childAt.getLayoutParams();
            if (c0229f.m1485j(i3) && (abstractC0226cM1481f = c0229f.m1481f()) != null) {
                abstractC0226cM1481f.m1468v(this, childAt, view, view2, i2, i3);
            }
        }
    }

    @Override // androidx.core.view.InterfaceC0302l
    /* renamed from: n */
    public void mo697n(View view, int i2) {
        this.f1983D.m2079e(view, i2);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C0229f c0229f = (C0229f) childAt.getLayoutParams();
            if (c0229f.m1485j(i2)) {
                AbstractC0226c abstractC0226cM1481f = c0229f.m1481f();
                if (abstractC0226cM1481f != null) {
                    abstractC0226cM1481f.mo1445C(this, childAt, view, i2);
                }
                c0229f.m1487l(i2);
                c0229f.m1486k();
            }
        }
        this.f1995v = null;
    }

    @Override // androidx.core.view.InterfaceC0302l
    /* renamed from: o */
    public void mo698o(View view, int i2, int i3, int[] iArr, int i4) {
        AbstractC0226c abstractC0226cM1481f;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0229f c0229f = (C0229f) childAt.getLayoutParams();
                if (c0229f.m1485j(i4) && (abstractC0226cM1481f = c0229f.m1481f()) != null) {
                    int[] iArr2 = this.f1989p;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC0226cM1481f.mo1463q(this, childAt, view, i2, i3, iArr2, i4);
                    int[] iArr3 = this.f1989p;
                    iMax = i2 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.f1989p;
                    iMax2 = i3 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            m1421H(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m1405Q(false);
        if (this.f1997x) {
            if (this.f1996w == null) {
                this.f1996w = new ViewTreeObserverOnPreDrawListenerC0230g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1996w);
        }
        if (this.f1998y == null && C0311u.m2156v(this)) {
            C0311u.m2125f0(this);
        }
        this.f1992s = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1405Q(false);
        if (this.f1997x && this.f1996w != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1996w);
        }
        View view = this.f1995v;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f1992s = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f1999z || this.f1980A == null) {
            return;
        }
        C0285c0 c0285c0 = this.f1998y;
        int iM1884k = c0285c0 != null ? c0285c0.m1884k() : 0;
        if (iM1884k > 0) {
            this.f1980A.setBounds(0, 0, getWidth(), iM1884k);
            this.f1980A.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m1405Q(true);
        }
        boolean zM1402L = m1402L(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m1405Q(true);
        }
        return zM1402L;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        AbstractC0226c abstractC0226cM1481f;
        int iM2162y = C0311u.m2162y(this);
        int size = this.f1984k.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = this.f1984k.get(i6);
            if (view.getVisibility() != 8 && ((abstractC0226cM1481f = ((C0229f) view.getLayoutParams()).m1481f()) == null || !abstractC0226cM1481f.mo1458l(this, view, iM2162y))) {
                m1422I(view, iM2162y);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC0304n
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        AbstractC0226c abstractC0226cM1481f;
        int childCount = getChildCount();
        boolean zM1460n = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                C0229f c0229f = (C0229f) childAt.getLayoutParams();
                if (c0229f.m1485j(0) && (abstractC0226cM1481f = c0229f.m1481f()) != null) {
                    zM1460n |= abstractC0226cM1481f.m1460n(this, childAt, view, f2, f3, z);
                }
            }
        }
        if (zM1460n) {
            m1421H(1);
        }
        return zM1460n;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC0304n
    public boolean onNestedPreFling(View view, float f2, float f3) {
        AbstractC0226c abstractC0226cM1481f;
        int childCount = getChildCount();
        boolean zMo1461o = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                C0229f c0229f = (C0229f) childAt.getLayoutParams();
                if (c0229f.m1485j(0) && (abstractC0226cM1481f = c0229f.m1481f()) != null) {
                    zMo1461o |= abstractC0226cM1481f.mo1461o(this, childAt, view, f2, f3);
                }
            }
        }
        return zMo1461o;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC0304n
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        mo698o(view, i2, i3, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC0304n
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        mo694k(view, i2, i3, i4, i5, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC0304n
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        mo696m(view, view2, i2, 0);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m2342a());
        SparseArray<Parcelable> sparseArray = savedState.f2000h;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            AbstractC0226c abstractC0226cM1481f = m1439y(childAt).m1481f();
            if (id != -1 && abstractC0226cM1481f != null && (parcelable2 = sparseArray.get(id)) != null) {
                abstractC0226cM1481f.mo1470x(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableMo1471y;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            AbstractC0226c abstractC0226cM1481f = ((C0229f) childAt.getLayoutParams()).m1481f();
            if (id != -1 && abstractC0226cM1481f != null && (parcelableMo1471y = abstractC0226cM1481f.mo1471y(this, childAt)) != null) {
                sparseArray.append(id, parcelableMo1471y);
            }
        }
        savedState.f2000h = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC0304n
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return mo695l(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC0304n
    public void onStopNestedScroll(View view) {
        mo697n(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[PHI: r3
      0x002b: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:9:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f1994u
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L15
            boolean r3 = r0.m1402L(r1, r4)
            if (r3 == 0) goto L2b
            goto L16
        L15:
            r3 = 0
        L16:
            android.view.View r6 = r0.f1994u
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0229f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.m1481f()
            if (r6 == 0) goto L2b
            android.view.View r7 = r0.f1994u
            boolean r6 = r6.mo1446D(r0, r7, r1)
            goto L2c
        L2b:
            r6 = 0
        L2c:
            android.view.View r7 = r0.f1994u
            r8 = 0
            if (r7 != 0) goto L37
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L4a
        L37:
            if (r3 == 0) goto L4a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L4a:
            if (r8 == 0) goto L4f
            r8.recycle()
        L4f:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L57
        L54:
            r0.m1405Q(r5)
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public C0229f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0229f ? new C0229f((C0229f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0229f((ViewGroup.MarginLayoutParams) layoutParams) : new C0229f(layoutParams);
    }

    /* renamed from: q */
    void m1433q(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            m1436t(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: r */
    public List<View> m1434r(View view) {
        List<View> listM1502h = this.f1985l.m1502h(view);
        this.f1987n.clear();
        if (listM1502h != null) {
            this.f1987n.addAll(listM1502h);
        }
        return this.f1987n;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        AbstractC0226c abstractC0226cM1481f = ((C0229f) view.getLayoutParams()).m1481f();
        if (abstractC0226cM1481f == null || !abstractC0226cM1481f.mo1469w(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.f1991r) {
            return;
        }
        m1405Q(false);
        this.f1991r = true;
    }

    /* renamed from: s */
    public List<View> m1435s(View view) {
        List listM1501g = this.f1985l.m1501g(view);
        this.f1987n.clear();
        if (listM1501g != null) {
            this.f1987n.addAll(listM1501g);
        }
        return this.f1987n;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m1411X();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f1981B = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Drawable drawable2 = this.f1980A;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f1980A = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f1980A.setState(getDrawableState());
                }
                C0265a.m1816m(this.f1980A, C0311u.m2162y(this));
                this.f1980A.setVisible(getVisibility() == 0, false);
                this.f1980A.setCallback(this);
            }
            C0311u.m2113Z(this);
        }
    }

    public void setStatusBarBackgroundColor(int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        setStatusBarBackground(new ColorDrawable(i2));
    }

    public void setStatusBarBackgroundResource(int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        setStatusBarBackground(i2 != 0 ? C0255a.m1677f(getContext(), i2) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.f1980A;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.f1980A.setVisible(z, false);
    }

    /* renamed from: t */
    void m1436t(View view, Rect rect) {
        C0233b.m1505a(this, view, rect);
    }

    /* renamed from: u */
    void m1437u(View view, int i2, Rect rect, Rect rect2) {
        C0229f c0229f = (C0229f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        m1416v(view, i2, rect, rect2, c0229f, measuredWidth, measuredHeight);
        m1414d(c0229f, rect2, measuredWidth, measuredHeight);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1980A;
    }

    /* renamed from: x */
    void m1438x(View view, Rect rect) {
        rect.set(((C0229f) view.getLayoutParams()).m1483h());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: y */
    C0229f m1439y(View view) {
        C0229f c0229f = (C0229f) view.getLayoutParams();
        if (!c0229f.f2004b) {
            if (view instanceof InterfaceC0225b) {
                AbstractC0226c behavior = ((InterfaceC0225b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                c0229f.m1489o(behavior);
                c0229f.f2004b = true;
            } else {
                InterfaceC0227d interfaceC0227d = null;
                for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                    interfaceC0227d = (InterfaceC0227d) superclass.getAnnotation(InterfaceC0227d.class);
                    if (interfaceC0227d != null) {
                        break;
                    }
                }
                if (interfaceC0227d != null) {
                    try {
                        c0229f.m1489o(interfaceC0227d.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e2) {
                        Log.e("CoordinatorLayout", "Default behavior class " + interfaceC0227d.value().getName() + " could not be instantiated. Did you forget a default constructor?", e2);
                    }
                }
                c0229f.f2004b = true;
            }
        }
        return c0229f;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f1984k = new ArrayList();
        this.f1985l = new C0232a<>();
        this.f1986m = new ArrayList();
        this.f1987n = new ArrayList();
        this.f1989p = new int[2];
        this.f1990q = new int[2];
        this.f1983D = new C0305o(this);
        TypedArray typedArrayObtainStyledAttributes = i2 == 0 ? context.obtainStyledAttributes(attributeSet, C0918c.f6178b, 0, C0917b.f6176a) : context.obtainStyledAttributes(attributeSet, C0918c.f6178b, i2, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            if (i2 == 0) {
                saveAttributeDataForStyleable(context, C0918c.f6178b, attributeSet, typedArrayObtainStyledAttributes, 0, C0917b.f6176a);
            } else {
                saveAttributeDataForStyleable(context, C0918c.f6178b, attributeSet, typedArrayObtainStyledAttributes, i2, 0);
            }
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C0918c.f6179c, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f1993t = resources.getIntArray(resourceId);
            float f2 = resources.getDisplayMetrics().density;
            int length = this.f1993t.length;
            for (int i3 = 0; i3 < length; i3++) {
                this.f1993t[i3] = (int) (r12[i3] * f2);
            }
        }
        this.f1980A = typedArrayObtainStyledAttributes.getDrawable(C0918c.f6180d);
        typedArrayObtainStyledAttributes.recycle();
        m1411X();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC0228e());
        if (C0311u.m2158w(this) == 0) {
            C0311u.m2153t0(this, 1);
        }
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0223a();

        /* renamed from: h */
        SparseArray<Parcelable> f2000h;

        /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState$a */
        static class C0223a implements Parcelable.ClassLoaderCreator<SavedState> {
            C0223a() {
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
            int i2 = parcel.readInt();
            int[] iArr = new int[i2];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f2000h = new SparseArray<>(i2);
            for (int i3 = 0; i3 < i2; i3++) {
                this.f2000h.append(iArr[i3], parcelableArray[i3]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            SparseArray<Parcelable> sparseArray = this.f2000h;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i3 = 0; i3 < size; i3++) {
                iArr[i3] = this.f2000h.keyAt(i3);
                parcelableArr[i3] = this.f2000h.valueAt(i3);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i2);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$f */
    public static class C0229f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        AbstractC0226c f2003a;

        /* renamed from: b */
        boolean f2004b;

        /* renamed from: c */
        public int f2005c;

        /* renamed from: d */
        public int f2006d;

        /* renamed from: e */
        public int f2007e;

        /* renamed from: f */
        int f2008f;

        /* renamed from: g */
        public int f2009g;

        /* renamed from: h */
        public int f2010h;

        /* renamed from: i */
        int f2011i;

        /* renamed from: j */
        int f2012j;

        /* renamed from: k */
        View f2013k;

        /* renamed from: l */
        View f2014l;

        /* renamed from: m */
        private boolean f2015m;

        /* renamed from: n */
        private boolean f2016n;

        /* renamed from: o */
        private boolean f2017o;

        /* renamed from: p */
        private boolean f2018p;

        /* renamed from: q */
        final Rect f2019q;

        /* renamed from: r */
        Object f2020r;

        public C0229f(int i2, int i3) {
            super(i2, i3);
            this.f2004b = false;
            this.f2005c = 0;
            this.f2006d = 0;
            this.f2007e = -1;
            this.f2008f = -1;
            this.f2009g = 0;
            this.f2010h = 0;
            this.f2019q = new Rect();
        }

        /* renamed from: n */
        private void m1473n(View view, CoordinatorLayout coordinatorLayout) {
            View viewFindViewById = coordinatorLayout.findViewById(this.f2008f);
            this.f2013k = viewFindViewById;
            if (viewFindViewById == null) {
                if (coordinatorLayout.isInEditMode()) {
                    this.f2014l = null;
                    this.f2013k = null;
                    return;
                }
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f2008f) + " to anchor view " + view);
            }
            if (viewFindViewById == coordinatorLayout) {
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                this.f2014l = null;
                this.f2013k = null;
                return;
            }
            for (ViewParent parent = viewFindViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                if (parent == view) {
                    if (!coordinatorLayout.isInEditMode()) {
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    this.f2014l = null;
                    this.f2013k = null;
                    return;
                }
                if (parent instanceof View) {
                    viewFindViewById = parent;
                }
            }
            this.f2014l = viewFindViewById;
        }

        /* renamed from: s */
        private boolean m1474s(View view, int i2) {
            int iM1932b = C0286d.m1932b(((C0229f) view.getLayoutParams()).f2009g, i2);
            return iM1932b != 0 && (C0286d.m1932b(this.f2010h, i2) & iM1932b) == iM1932b;
        }

        /* renamed from: t */
        private boolean m1475t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f2013k.getId() != this.f2008f) {
                return false;
            }
            View view2 = this.f2013k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f2014l = null;
                    this.f2013k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            this.f2014l = view2;
            return true;
        }

        /* renamed from: a */
        boolean m1476a() {
            return this.f2013k == null && this.f2008f != -1;
        }

        /* renamed from: b */
        boolean m1477b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            AbstractC0226c abstractC0226c;
            return view2 == this.f2014l || m1474s(view2, C0311u.m2162y(coordinatorLayout)) || ((abstractC0226c = this.f2003a) != null && abstractC0226c.mo1451e(coordinatorLayout, view, view2));
        }

        /* renamed from: c */
        boolean m1478c() {
            if (this.f2003a == null) {
                this.f2015m = false;
            }
            return this.f2015m;
        }

        /* renamed from: d */
        View m1479d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f2008f == -1) {
                this.f2014l = null;
                this.f2013k = null;
                return null;
            }
            if (this.f2013k == null || !m1475t(view, coordinatorLayout)) {
                m1473n(view, coordinatorLayout);
            }
            return this.f2013k;
        }

        /* renamed from: e */
        public int m1480e() {
            return this.f2008f;
        }

        /* renamed from: f */
        public AbstractC0226c m1481f() {
            return this.f2003a;
        }

        /* renamed from: g */
        boolean m1482g() {
            return this.f2018p;
        }

        /* renamed from: h */
        Rect m1483h() {
            return this.f2019q;
        }

        /* renamed from: i */
        boolean m1484i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z = this.f2015m;
            if (z) {
                return true;
            }
            AbstractC0226c abstractC0226c = this.f2003a;
            boolean zM1447a = (abstractC0226c != null ? abstractC0226c.m1447a(coordinatorLayout, view) : false) | z;
            this.f2015m = zM1447a;
            return zM1447a;
        }

        /* renamed from: j */
        boolean m1485j(int i2) {
            if (i2 == 0) {
                return this.f2016n;
            }
            if (i2 != 1) {
                return false;
            }
            return this.f2017o;
        }

        /* renamed from: k */
        void m1486k() {
            this.f2018p = false;
        }

        /* renamed from: l */
        void m1487l(int i2) {
            m1492r(i2, false);
        }

        /* renamed from: m */
        void m1488m() {
            this.f2015m = false;
        }

        /* renamed from: o */
        public void m1489o(AbstractC0226c abstractC0226c) {
            AbstractC0226c abstractC0226c2 = this.f2003a;
            if (abstractC0226c2 != abstractC0226c) {
                if (abstractC0226c2 != null) {
                    abstractC0226c2.mo1456j();
                }
                this.f2003a = abstractC0226c;
                this.f2020r = null;
                this.f2004b = true;
                if (abstractC0226c != null) {
                    abstractC0226c.mo1453g(this);
                }
            }
        }

        /* renamed from: p */
        void m1490p(boolean z) {
            this.f2018p = z;
        }

        /* renamed from: q */
        void m1491q(Rect rect) {
            this.f2019q.set(rect);
        }

        /* renamed from: r */
        void m1492r(int i2, boolean z) {
            if (i2 == 0) {
                this.f2016n = z;
            } else {
                if (i2 != 1) {
                    return;
                }
                this.f2017o = z;
            }
        }

        C0229f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2004b = false;
            this.f2005c = 0;
            this.f2006d = 0;
            this.f2007e = -1;
            this.f2008f = -1;
            this.f2009g = 0;
            this.f2010h = 0;
            this.f2019q = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0918c.f6181e);
            this.f2005c = typedArrayObtainStyledAttributes.getInteger(C0918c.f6182f, 0);
            this.f2008f = typedArrayObtainStyledAttributes.getResourceId(C0918c.f6183g, -1);
            this.f2006d = typedArrayObtainStyledAttributes.getInteger(C0918c.f6184h, 0);
            this.f2007e = typedArrayObtainStyledAttributes.getInteger(C0918c.f6188l, -1);
            this.f2009g = typedArrayObtainStyledAttributes.getInt(C0918c.f6187k, 0);
            this.f2010h = typedArrayObtainStyledAttributes.getInt(C0918c.f6186j, 0);
            int i2 = C0918c.f6185i;
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i2);
            this.f2004b = zHasValue;
            if (zHasValue) {
                this.f2003a = CoordinatorLayout.m1401K(context, attributeSet, typedArrayObtainStyledAttributes.getString(i2));
            }
            typedArrayObtainStyledAttributes.recycle();
            AbstractC0226c abstractC0226c = this.f2003a;
            if (abstractC0226c != null) {
                abstractC0226c.mo1453g(this);
            }
        }

        public C0229f(C0229f c0229f) {
            super((ViewGroup.MarginLayoutParams) c0229f);
            this.f2004b = false;
            this.f2005c = 0;
            this.f2006d = 0;
            this.f2007e = -1;
            this.f2008f = -1;
            this.f2009g = 0;
            this.f2010h = 0;
            this.f2019q = new Rect();
        }

        public C0229f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2004b = false;
            this.f2005c = 0;
            this.f2006d = 0;
            this.f2007e = -1;
            this.f2008f = -1;
            this.f2009g = 0;
            this.f2010h = 0;
            this.f2019q = new Rect();
        }

        public C0229f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2004b = false;
            this.f2005c = 0;
            this.f2006d = 0;
            this.f2007e = -1;
            this.f2008f = -1;
            this.f2009g = 0;
            this.f2010h = 0;
            this.f2019q = new Rect();
        }
    }
}
