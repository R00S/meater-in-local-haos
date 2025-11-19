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
import d1.C3020a;
import d1.C3021b;
import d1.C3022c;
import g1.C3377a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k1.C3784a;
import r1.C4337d;
import r1.C4341h;
import r1.InterfaceC4339f;
import s1.C4456s;
import s1.C4469y0;
import s1.E;
import s1.F;
import s1.H;
import s1.I;
import s1.X;
import y1.AbstractC5121a;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements E, F {

    /* renamed from: V, reason: collision with root package name */
    static final String f24660V;

    /* renamed from: W, reason: collision with root package name */
    static final Class<?>[] f24661W;

    /* renamed from: a0, reason: collision with root package name */
    static final ThreadLocal<Map<String, Constructor<c>>> f24662a0;

    /* renamed from: b0, reason: collision with root package name */
    static final Comparator<View> f24663b0;

    /* renamed from: c0, reason: collision with root package name */
    private static final InterfaceC4339f<Rect> f24664c0;

    /* renamed from: B, reason: collision with root package name */
    private final List<View> f24665B;

    /* renamed from: C, reason: collision with root package name */
    private final androidx.coordinatorlayout.widget.b<View> f24666C;

    /* renamed from: D, reason: collision with root package name */
    private final List<View> f24667D;

    /* renamed from: E, reason: collision with root package name */
    private final List<View> f24668E;

    /* renamed from: F, reason: collision with root package name */
    private Paint f24669F;

    /* renamed from: G, reason: collision with root package name */
    private final int[] f24670G;

    /* renamed from: H, reason: collision with root package name */
    private final int[] f24671H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f24672I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f24673J;

    /* renamed from: K, reason: collision with root package name */
    private int[] f24674K;

    /* renamed from: L, reason: collision with root package name */
    private View f24675L;

    /* renamed from: M, reason: collision with root package name */
    private View f24676M;

    /* renamed from: N, reason: collision with root package name */
    private g f24677N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f24678O;

    /* renamed from: P, reason: collision with root package name */
    private C4469y0 f24679P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f24680Q;

    /* renamed from: R, reason: collision with root package name */
    private Drawable f24681R;

    /* renamed from: S, reason: collision with root package name */
    ViewGroup.OnHierarchyChangeListener f24682S;

    /* renamed from: T, reason: collision with root package name */
    private I f24683T;

    /* renamed from: U, reason: collision with root package name */
    private final H f24684U;

    class a implements I {
        a() {
        }

        @Override // s1.I
        public C4469y0 a(View view, C4469y0 c4469y0) {
            return CoordinatorLayout.this.W(c4469y0);
        }
    }

    public interface b {
        c getBehavior();
    }

    public static abstract class c<V extends View> {
        public c() {
        }

        public boolean A(CoordinatorLayout coordinatorLayout, V v10, Rect rect, boolean z10) {
            return false;
        }

        public Parcelable C(CoordinatorLayout coordinatorLayout, V v10) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean D(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10) {
            return false;
        }

        public boolean E(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
            if (i11 == 0) {
                return D(coordinatorLayout, v10, view, view2, i10);
            }
            return false;
        }

        public void G(CoordinatorLayout coordinatorLayout, V v10, View view, int i10) {
            if (i10 == 0) {
                F(coordinatorLayout, v10, view);
            }
        }

        public boolean H(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
            return false;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, V v10) {
            return h(coordinatorLayout, v10) > 0.0f;
        }

        public boolean f(CoordinatorLayout coordinatorLayout, V v10, Rect rect) {
            return false;
        }

        public int g(CoordinatorLayout coordinatorLayout, V v10) {
            return -16777216;
        }

        public float h(CoordinatorLayout coordinatorLayout, V v10) {
            return 0.0f;
        }

        public boolean i(CoordinatorLayout coordinatorLayout, V v10, View view) {
            return false;
        }

        public boolean l(CoordinatorLayout coordinatorLayout, V v10, View view) {
            return false;
        }

        public boolean o(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
            return false;
        }

        public boolean p(CoordinatorLayout coordinatorLayout, V v10, int i10) {
            return false;
        }

        public boolean q(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12, int i13) {
            return false;
        }

        public boolean r(CoordinatorLayout coordinatorLayout, V v10, View view, float f10, float f11, boolean z10) {
            return false;
        }

        public boolean s(CoordinatorLayout coordinatorLayout, V v10, View view, float f10, float f11) {
            return false;
        }

        public void u(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int[] iArr, int i12) {
            if (i12 == 0) {
                t(coordinatorLayout, v10, view, i10, i11, iArr);
            }
        }

        @Deprecated
        public void w(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13, int i14) {
            if (i14 == 0) {
                v(coordinatorLayout, v10, view, i10, i11, i12, i13);
            }
        }

        public void x(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
            w(coordinatorLayout, v10, view, i10, i11, i12, i13, i14);
        }

        public void z(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
            if (i11 == 0) {
                y(coordinatorLayout, v10, view, view2, i10);
            }
        }

        public c(Context context, AttributeSet attributeSet) {
        }

        public void n() {
        }

        public void k(f fVar) {
        }

        public void B(CoordinatorLayout coordinatorLayout, V v10, Parcelable parcelable) {
        }

        @Deprecated
        public void F(CoordinatorLayout coordinatorLayout, V v10, View view) {
        }

        public C4469y0 j(CoordinatorLayout coordinatorLayout, V v10, C4469y0 c4469y0) {
            return c4469y0;
        }

        public void m(CoordinatorLayout coordinatorLayout, V v10, View view) {
        }

        @Deprecated
        public void y(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10) {
        }

        @Deprecated
        public void t(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int[] iArr) {
        }

        @Deprecated
        public void v(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    public @interface d {
        Class<? extends c> value();
    }

    private class e implements ViewGroup.OnHierarchyChangeListener {
        e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f24682S;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.H(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f24682S;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    class g implements ViewTreeObserver.OnPreDrawListener {
        g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.H(0);
            return true;
        }
    }

    static class i implements Comparator<View> {
        i() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float fL = X.L(view);
            float fL2 = X.L(view2);
            if (fL > fL2) {
                return -1;
            }
            return fL < fL2 ? 1 : 0;
        }
    }

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f24660V = r02 != null ? r02.getName() : null;
        f24663b0 = new i();
        f24661W = new Class[]{Context.class, AttributeSet.class};
        f24662a0 = new ThreadLocal<>();
        f24664c0 = new C4341h(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3020a.f39649a);
    }

    private boolean A(View view) {
        return this.f24666C.j(view);
    }

    private void C(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        Rect rectA = a();
        rectA.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        if (this.f24679P != null && X.w(this) && !X.w(view)) {
            rectA.left += this.f24679P.j();
            rectA.top += this.f24679P.l();
            rectA.right -= this.f24679P.k();
            rectA.bottom -= this.f24679P.i();
        }
        Rect rectA2 = a();
        C4456s.a(S(fVar.f24689c), view.getMeasuredWidth(), view.getMeasuredHeight(), rectA, rectA2, i10);
        view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
        O(rectA);
        O(rectA2);
    }

    private void D(View view, View view2, int i10) {
        Rect rectA = a();
        Rect rectA2 = a();
        try {
            t(view2, rectA);
            u(view, i10, rectA, rectA2);
            view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
        } finally {
            O(rectA);
            O(rectA2);
        }
    }

    private void E(View view, int i10, int i11) {
        f fVar = (f) view.getLayoutParams();
        int iB = C4456s.b(T(fVar.f24689c), i11);
        int i12 = iB & 7;
        int i13 = iB & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i11 == 1) {
            i10 = width - i10;
        }
        int iW = w(i10) - measuredWidth;
        if (i12 == 1) {
            iW += measuredWidth / 2;
        } else if (i12 == 5) {
            iW += measuredWidth;
        }
        int i14 = i13 != 16 ? i13 != 80 ? 0 : measuredHeight : measuredHeight / 2;
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(iW, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(i14, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth + iMax, measuredHeight + iMax2);
    }

    private void F(View view, Rect rect, int i10) {
        boolean z10;
        boolean z11;
        int width;
        int i11;
        int i12;
        int i13;
        int height;
        int i14;
        int i15;
        int i16;
        if (X.R(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            f fVar = (f) view.getLayoutParams();
            c cVarF = fVar.f();
            Rect rectA = a();
            Rect rectA2 = a();
            rectA2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (cVarF == null || !cVarF.f(this, view, rectA)) {
                rectA.set(rectA2);
            } else if (!rectA2.contains(rectA)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectA.toShortString() + " | Bounds:" + rectA2.toShortString());
            }
            O(rectA2);
            if (rectA.isEmpty()) {
                O(rectA);
                return;
            }
            int iB = C4456s.b(fVar.f24694h, i10);
            boolean z12 = true;
            if ((iB & 48) != 48 || (i15 = (rectA.top - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - fVar.f24696j) >= (i16 = rect.top)) {
                z10 = false;
            } else {
                V(view, i16 - i15);
                z10 = true;
            }
            if ((iB & 80) == 80 && (height = ((getHeight() - rectA.bottom) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) + fVar.f24696j) < (i14 = rect.bottom)) {
                V(view, height - i14);
                z10 = true;
            }
            if (!z10) {
                V(view, 0);
            }
            if ((iB & 3) != 3 || (i12 = (rectA.left - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - fVar.f24695i) >= (i13 = rect.left)) {
                z11 = false;
            } else {
                U(view, i13 - i12);
                z11 = true;
            }
            if ((iB & 5) != 5 || (width = ((getWidth() - rectA.right) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) + fVar.f24695i) >= (i11 = rect.right)) {
                z12 = z11;
            } else {
                U(view, width - i11);
            }
            if (!z12) {
                U(view, 0);
            }
            O(rectA);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static c K(Context context, AttributeSet attributeSet, String str) throws NoSuchMethodException, SecurityException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f24660V;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<c>>> threadLocal = f24662a0;
            Map<String, Constructor<c>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<c> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f24661W);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e10) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e10);
        }
    }

    private boolean L(MotionEvent motionEvent, int i10) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f24667D;
        z(list);
        int size = list.size();
        MotionEvent motionEventObtain = null;
        boolean zO = false;
        boolean z10 = false;
        for (int i11 = 0; i11 < size; i11++) {
            View view = list.get(i11);
            f fVar = (f) view.getLayoutParams();
            c cVarF = fVar.f();
            if (!(zO || z10) || actionMasked == 0) {
                if (!zO && cVarF != null) {
                    if (i10 == 0) {
                        zO = cVarF.o(this, view, motionEvent);
                    } else if (i10 == 1) {
                        zO = cVarF.H(this, view, motionEvent);
                    }
                    if (zO) {
                        this.f24675L = view;
                    }
                }
                boolean zC = fVar.c();
                boolean zI = fVar.i(this, view);
                z10 = zI && !zC;
                if (zI && !z10) {
                    break;
                }
            } else if (cVarF != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i10 == 0) {
                    cVarF.o(this, view, motionEventObtain);
                } else if (i10 == 1) {
                    cVarF.H(this, view, motionEventObtain);
                }
            }
        }
        list.clear();
        return zO;
    }

    private void M() {
        this.f24665B.clear();
        this.f24666C.c();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            f fVarY = y(childAt);
            fVarY.d(this, childAt);
            this.f24666C.b(childAt);
            for (int i11 = 0; i11 < childCount; i11++) {
                if (i11 != i10) {
                    View childAt2 = getChildAt(i11);
                    if (fVarY.b(this, childAt, childAt2)) {
                        if (!this.f24666C.d(childAt2)) {
                            this.f24666C.b(childAt2);
                        }
                        this.f24666C.a(childAt2, childAt);
                    }
                }
            }
        }
        this.f24665B.addAll(this.f24666C.i());
        Collections.reverse(this.f24665B);
    }

    private static void O(Rect rect) {
        rect.setEmpty();
        f24664c0.a(rect);
    }

    private void Q(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            c cVarF = ((f) childAt.getLayoutParams()).f();
            if (cVarF != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z10) {
                    cVarF.o(this, childAt, motionEventObtain);
                } else {
                    cVarF.H(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            ((f) getChildAt(i11).getLayoutParams()).m();
        }
        this.f24675L = null;
        this.f24672I = false;
    }

    private static int R(int i10) {
        if (i10 == 0) {
            return 17;
        }
        return i10;
    }

    private static int S(int i10) {
        if ((i10 & 7) == 0) {
            i10 |= 8388611;
        }
        return (i10 & 112) == 0 ? i10 | 48 : i10;
    }

    private static int T(int i10) {
        if (i10 == 0) {
            return 8388661;
        }
        return i10;
    }

    private void U(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f24695i;
        if (i11 != i10) {
            X.X(view, i10 - i11);
            fVar.f24695i = i10;
        }
    }

    private void V(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f24696j;
        if (i11 != i10) {
            X.Y(view, i10 - i11);
            fVar.f24696j = i10;
        }
    }

    private void X() {
        if (!X.w(this)) {
            X.B0(this, null);
            return;
        }
        if (this.f24683T == null) {
            this.f24683T = new a();
        }
        X.B0(this, this.f24683T);
        setSystemUiVisibility(1280);
    }

    private static Rect a() {
        Rect rectB = f24664c0.b();
        return rectB == null ? new Rect() : rectB;
    }

    private static int c(int i10, int i11, int i12) {
        return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
    }

    private void d(f fVar, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(iMax, iMax2, i10 + iMax, i11 + iMax2);
    }

    private C4469y0 e(C4469y0 c4469y0) {
        c cVarF;
        if (c4469y0.o()) {
            return c4469y0;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (X.w(childAt) && (cVarF = ((f) childAt.getLayoutParams()).f()) != null) {
                c4469y0 = cVarF.j(this, childAt, c4469y0);
                if (c4469y0.o()) {
                    break;
                }
            }
        }
        return c4469y0;
    }

    private void v(View view, int i10, Rect rect, Rect rect2, f fVar, int i11, int i12) {
        int iB = C4456s.b(R(fVar.f24689c), i10);
        int iB2 = C4456s.b(S(fVar.f24690d), i10);
        int i13 = iB & 7;
        int i14 = iB & 112;
        int i15 = iB2 & 7;
        int i16 = iB2 & 112;
        int iWidth = i15 != 1 ? i15 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i16 != 16 ? i16 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i13 == 1) {
            iWidth -= i11 / 2;
        } else if (i13 != 5) {
            iWidth -= i11;
        }
        if (i14 == 16) {
            iHeight -= i12 / 2;
        } else if (i14 != 80) {
            iHeight -= i12;
        }
        rect2.set(iWidth, iHeight, i11 + iWidth, i12 + iHeight);
    }

    private int w(int i10) {
        int[] iArr = this.f24674K;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i10);
            return 0;
        }
        if (i10 >= 0 && i10 < iArr.length) {
            return iArr[i10];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i10 + " out of range for " + this);
        return 0;
    }

    private void z(List<View> list) {
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i10) : i10));
        }
        Comparator<View> comparator = f24663b0;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    public boolean B(View view, int i10, int i11) {
        Rect rectA = a();
        t(view, rectA);
        try {
            return rectA.contains(i10, i11);
        } finally {
            O(rectA);
        }
    }

    void G(View view, int i10) {
        c cVarF;
        f fVar = (f) view.getLayoutParams();
        if (fVar.f24697k != null) {
            Rect rectA = a();
            Rect rectA2 = a();
            Rect rectA3 = a();
            t(fVar.f24697k, rectA);
            q(view, false, rectA2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            v(view, i10, rectA, rectA3, fVar, measuredWidth, measuredHeight);
            boolean z10 = (rectA3.left == rectA2.left && rectA3.top == rectA2.top) ? false : true;
            d(fVar, rectA3, measuredWidth, measuredHeight);
            int i11 = rectA3.left - rectA2.left;
            int i12 = rectA3.top - rectA2.top;
            if (i11 != 0) {
                X.X(view, i11);
            }
            if (i12 != 0) {
                X.Y(view, i12);
            }
            if (z10 && (cVarF = fVar.f()) != null) {
                cVarF.l(this, view, fVar.f24697k);
            }
            O(rectA);
            O(rectA2);
            O(rectA3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void H(int r18) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.H(int):void");
    }

    public void I(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        if (fVar.a()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view2 = fVar.f24697k;
        if (view2 != null) {
            D(view, view2, i10);
            return;
        }
        int i11 = fVar.f24691e;
        if (i11 >= 0) {
            E(view, i11, i10);
        } else {
            C(view, i10);
        }
    }

    public void J(View view, int i10, int i11, int i12, int i13) {
        measureChildWithMargins(view, i10, i11, i12, i13);
    }

    void N(View view, Rect rect) {
        ((f) view.getLayoutParams()).q(rect);
    }

    void P() {
        if (this.f24673J && this.f24677N != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f24677N);
        }
        this.f24678O = false;
    }

    final C4469y0 W(C4469y0 c4469y0) {
        if (C4337d.a(this.f24679P, c4469y0)) {
            return c4469y0;
        }
        this.f24679P = c4469y0;
        boolean z10 = false;
        boolean z11 = c4469y0 != null && c4469y0.l() > 0;
        this.f24680Q = z11;
        if (!z11 && getBackground() == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        C4469y0 c4469y0E = e(c4469y0);
        requestLayout();
        return c4469y0E;
    }

    void b() {
        if (this.f24673J) {
            if (this.f24677N == null) {
                this.f24677N = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f24677N);
        }
        this.f24678O = true;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j10) {
        f fVar = (f) view.getLayoutParams();
        c cVar = fVar.f24687a;
        if (cVar != null) {
            float fH = cVar.h(this, view);
            if (fH > 0.0f) {
                if (this.f24669F == null) {
                    this.f24669F = new Paint();
                }
                this.f24669F.setColor(fVar.f24687a.g(this, view));
                this.f24669F.setAlpha(c(Math.round(fH * 255.0f), 0, 255));
                int iSave = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f24669F);
                canvas.restoreToCount(iSave);
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f24681R;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public void f(View view) {
        List listG = this.f24666C.g(view);
        if (listG == null || listG.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < listG.size(); i10++) {
            View view2 = (View) listG.get(i10);
            c cVarF = ((f) view2.getLayoutParams()).f();
            if (cVarF != null) {
                cVarF.l(this, view2, view);
            }
        }
    }

    void g() {
        int childCount = getChildCount();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            if (A(getChildAt(i10))) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (z10 != this.f24678O) {
            if (z10) {
                b();
            } else {
                P();
            }
        }
    }

    final List<View> getDependencySortedChildren() {
        M();
        return Collections.unmodifiableList(this.f24665B);
    }

    public final C4469y0 getLastWindowInsets() {
        return this.f24679P;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f24684U.a();
    }

    public Drawable getStatusBarBackground() {
        return this.f24681R;
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
    public f generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    @Override // s1.F
    public void j(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        c cVarF;
        boolean z10;
        int iMin;
        int childCount = getChildCount();
        boolean z11 = false;
        int iMax = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i14) && (cVarF = fVar.f()) != null) {
                    int[] iArr2 = this.f24670G;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVarF.x(this, childAt, view, i10, i11, i12, i13, i14, iArr2);
                    int[] iArr3 = this.f24670G;
                    iMax = i12 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    if (i13 > 0) {
                        z10 = true;
                        iMin = Math.max(i15, this.f24670G[1]);
                    } else {
                        z10 = true;
                        iMin = Math.min(i15, this.f24670G[1]);
                    }
                    i15 = iMin;
                    z11 = z10;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + i15;
        if (z11) {
            H(1);
        }
    }

    @Override // s1.E
    public void k(View view, int i10, int i11, int i12, int i13, int i14) {
        j(view, i10, i11, i12, i13, 0, this.f24671H);
    }

    @Override // s1.E
    public boolean l(View view, View view2, int i10, int i11) {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c cVarF = fVar.f();
                if (cVarF != null) {
                    boolean zE = cVarF.E(this, childAt, view, view2, i10, i11);
                    z10 |= zE;
                    fVar.r(i11, zE);
                } else {
                    fVar.r(i11, false);
                }
            }
        }
        return z10;
    }

    @Override // s1.E
    public void m(View view, View view2, int i10, int i11) {
        c cVarF;
        this.f24684U.c(view, view2, i10, i11);
        this.f24676M = view2;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i11) && (cVarF = fVar.f()) != null) {
                cVarF.z(this, childAt, view, view2, i10, i11);
            }
        }
    }

    @Override // s1.E
    public void n(View view, int i10) {
        this.f24684U.e(view, i10);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i10)) {
                c cVarF = fVar.f();
                if (cVarF != null) {
                    cVarF.G(this, childAt, view, i10);
                }
                fVar.l(i10);
                fVar.k();
            }
        }
        this.f24676M = null;
    }

    @Override // s1.E
    public void o(View view, int i10, int i11, int[] iArr, int i12) {
        c cVarF;
        int childCount = getChildCount();
        boolean z10 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i12) && (cVarF = fVar.f()) != null) {
                    int[] iArr2 = this.f24670G;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVarF.u(this, childAt, view, i10, i11, iArr2, i12);
                    int[] iArr3 = this.f24670G;
                    iMax = i10 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.f24670G;
                    iMax2 = i11 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z10 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z10) {
            H(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Q(false);
        if (this.f24678O) {
            if (this.f24677N == null) {
                this.f24677N = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f24677N);
        }
        if (this.f24679P == null && X.w(this)) {
            X.k0(this);
        }
        this.f24673J = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Q(false);
        if (this.f24678O && this.f24677N != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f24677N);
        }
        View view = this.f24676M;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f24673J = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f24680Q || this.f24681R == null) {
            return;
        }
        C4469y0 c4469y0 = this.f24679P;
        int iL = c4469y0 != null ? c4469y0.l() : 0;
        if (iL > 0) {
            this.f24681R.setBounds(0, 0, getWidth(), iL);
            this.f24681R.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            Q(true);
        }
        boolean zL = L(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            Q(true);
        }
        return zL;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        c cVarF;
        int iZ = X.z(this);
        int size = this.f24665B.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = this.f24665B.get(i14);
            if (view.getVisibility() != 8 && ((cVarF = ((f) view.getLayoutParams()).f()) == null || !cVarF.p(this, view, iZ))) {
                I(view, iZ);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        c cVarF;
        int childCount = getChildCount();
        boolean zR = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (cVarF = fVar.f()) != null) {
                    zR |= cVarF.r(this, childAt, view, f10, f11, z10);
                }
            }
        }
        if (zR) {
            H(1);
        }
        return zR;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        c cVarF;
        int childCount = getChildCount();
        boolean zS = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (cVarF = fVar.f()) != null) {
                    zS |= cVarF.s(this, childAt, view, f10, f11);
                }
            }
        }
        return zS;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        o(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        k(view, i10, i11, i12, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        m(view, view2, i10, 0);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        SparseArray<Parcelable> sparseArray = hVar.f24706D;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            c cVarF = y(childAt).f();
            if (id2 != -1 && cVarF != null && (parcelable2 = sparseArray.get(id2)) != null) {
                cVarF.B(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableC;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            c cVarF = ((f) childAt.getLayoutParams()).f();
            if (id2 != -1 && cVarF != null && (parcelableC = cVarF.C(this, childAt)) != null) {
                sparseArray.append(id2, parcelableC);
            }
        }
        hVar.f24706D = sparseArray;
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return l(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        n(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015 A[PHI: r3
      0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0024, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
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
            android.view.View r3 = r0.f24675L
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.L(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = r5
            goto L2c
        L17:
            r3 = r5
        L18:
            android.view.View r6 = r0.f24675L
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.f()
            if (r6 == 0) goto L15
            android.view.View r7 = r0.f24675L
            boolean r6 = r6.H(r0, r7, r1)
        L2c:
            android.view.View r7 = r0.f24675L
            r8 = 0
            if (r7 != 0) goto L37
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L4a
        L37:
            if (r3 == 0) goto L4a
            long r11 = android.os.SystemClock.uptimeMillis()
            r15 = 0
            r16 = 0
            r13 = 3
            r14 = 0
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
            r0.Q(r5)
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f ? new f((f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }

    void q(View view, boolean z10, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z10) {
            t(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public List<View> r(View view) {
        List<View> listH = this.f24666C.h(view);
        this.f24668E.clear();
        if (listH != null) {
            this.f24668E.addAll(listH);
        }
        return this.f24668E;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        c cVarF = ((f) view.getLayoutParams()).f();
        if (cVarF == null || !cVarF.A(this, view, rect, z10)) {
            return super.requestChildRectangleOnScreen(view, rect, z10);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (!z10 || this.f24672I) {
            return;
        }
        Q(false);
        this.f24672I = true;
    }

    public List<View> s(View view) {
        List listG = this.f24666C.g(view);
        this.f24668E.clear();
        if (listG != null) {
            this.f24668E.addAll(listG);
        }
        return this.f24668E;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z10) {
        super.setFitsSystemWindows(z10);
        X();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f24682S = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f24681R;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f24681R = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f24681R.setState(getDrawableState());
                }
                C3784a.m(this.f24681R, X.z(this));
                this.f24681R.setVisible(getVisibility() == 0, false);
                this.f24681R.setCallback(this);
            }
            X.e0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(int i10) {
        setStatusBarBackground(i10 != 0 ? C3377a.e(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f24681R;
        if (drawable == null || drawable.isVisible() == z10) {
            return;
        }
        this.f24681R.setVisible(z10, false);
    }

    void t(View view, Rect rect) {
        androidx.coordinatorlayout.widget.c.a(this, view, rect);
    }

    void u(View view, int i10, Rect rect, Rect rect2) {
        f fVar = (f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        v(view, i10, rect, rect2, fVar, measuredWidth, measuredHeight);
        d(fVar, rect2, measuredWidth, measuredHeight);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f24681R;
    }

    void x(View view, Rect rect) {
        rect.set(((f) view.getLayoutParams()).h());
    }

    /* JADX WARN: Multi-variable type inference failed */
    f y(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f24688b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.o(behavior);
                fVar.f24688b = true;
            } else {
                d dVar = null;
                for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                    dVar = (d) superclass.getAnnotation(d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        fVar.o(dVar.value().getDeclaredConstructor(null).newInstance(null));
                    } catch (Exception e10) {
                        Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e10);
                    }
                }
                fVar.f24688b = true;
            }
        }
        return fVar;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f24665B = new ArrayList();
        this.f24666C = new androidx.coordinatorlayout.widget.b<>();
        this.f24667D = new ArrayList();
        this.f24668E = new ArrayList();
        this.f24670G = new int[2];
        this.f24671H = new int[2];
        this.f24684U = new H(this);
        TypedArray typedArrayObtainStyledAttributes = i10 == 0 ? context.obtainStyledAttributes(attributeSet, C3022c.f39652b, 0, C3021b.f39650a) : context.obtainStyledAttributes(attributeSet, C3022c.f39652b, i10, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            if (i10 == 0) {
                saveAttributeDataForStyleable(context, C3022c.f39652b, attributeSet, typedArrayObtainStyledAttributes, 0, C3021b.f39650a);
            } else {
                saveAttributeDataForStyleable(context, C3022c.f39652b, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
            }
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C3022c.f39653c, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f24674K = resources.getIntArray(resourceId);
            float f10 = resources.getDisplayMetrics().density;
            int length = this.f24674K.length;
            for (int i11 = 0; i11 < length; i11++) {
                this.f24674K[i11] = (int) (r12[i11] * f10);
            }
        }
        this.f24681R = typedArrayObtainStyledAttributes.getDrawable(C3022c.f39654d);
        typedArrayObtainStyledAttributes.recycle();
        X();
        super.setOnHierarchyChangeListener(new e());
        if (X.x(this) == 0) {
            X.x0(this, 1);
        }
    }

    protected static class h extends AbstractC5121a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: D, reason: collision with root package name */
        SparseArray<Parcelable> f24706D;

        static class a implements Parcelable.ClassLoaderCreator<h> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public h[] newArray(int i10) {
                return new h[i10];
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i10 = parcel.readInt();
            int[] iArr = new int[i10];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f24706D = new SparseArray<>(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                this.f24706D.append(iArr[i11], parcelableArray[i11]);
            }
        }

        @Override // y1.AbstractC5121a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            SparseArray<Parcelable> sparseArray = this.f24706D;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i11 = 0; i11 < size; i11++) {
                iArr[i11] = this.f24706D.keyAt(i11);
                parcelableArr[i11] = this.f24706D.valueAt(i11);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i10);
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        c f24687a;

        /* renamed from: b, reason: collision with root package name */
        boolean f24688b;

        /* renamed from: c, reason: collision with root package name */
        public int f24689c;

        /* renamed from: d, reason: collision with root package name */
        public int f24690d;

        /* renamed from: e, reason: collision with root package name */
        public int f24691e;

        /* renamed from: f, reason: collision with root package name */
        int f24692f;

        /* renamed from: g, reason: collision with root package name */
        public int f24693g;

        /* renamed from: h, reason: collision with root package name */
        public int f24694h;

        /* renamed from: i, reason: collision with root package name */
        int f24695i;

        /* renamed from: j, reason: collision with root package name */
        int f24696j;

        /* renamed from: k, reason: collision with root package name */
        View f24697k;

        /* renamed from: l, reason: collision with root package name */
        View f24698l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f24699m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f24700n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f24701o;

        /* renamed from: p, reason: collision with root package name */
        private boolean f24702p;

        /* renamed from: q, reason: collision with root package name */
        final Rect f24703q;

        /* renamed from: r, reason: collision with root package name */
        Object f24704r;

        public f(int i10, int i11) {
            super(i10, i11);
            this.f24688b = false;
            this.f24689c = 0;
            this.f24690d = 0;
            this.f24691e = -1;
            this.f24692f = -1;
            this.f24693g = 0;
            this.f24694h = 0;
            this.f24703q = new Rect();
        }

        private void n(View view, CoordinatorLayout coordinatorLayout) {
            View viewFindViewById = coordinatorLayout.findViewById(this.f24692f);
            this.f24697k = viewFindViewById;
            if (viewFindViewById == null) {
                if (coordinatorLayout.isInEditMode()) {
                    this.f24698l = null;
                    this.f24697k = null;
                    return;
                }
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f24692f) + " to anchor view " + view);
            }
            if (viewFindViewById == coordinatorLayout) {
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                this.f24698l = null;
                this.f24697k = null;
                return;
            }
            for (ViewParent parent = viewFindViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                if (parent == view) {
                    if (!coordinatorLayout.isInEditMode()) {
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    this.f24698l = null;
                    this.f24697k = null;
                    return;
                }
                if (parent instanceof View) {
                    viewFindViewById = parent;
                }
            }
            this.f24698l = viewFindViewById;
        }

        private boolean s(View view, int i10) {
            int iB = C4456s.b(((f) view.getLayoutParams()).f24693g, i10);
            return iB != 0 && (C4456s.b(this.f24694h, i10) & iB) == iB;
        }

        private boolean t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f24697k.getId() != this.f24692f) {
                return false;
            }
            View view2 = this.f24697k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f24698l = null;
                    this.f24697k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            this.f24698l = view2;
            return true;
        }

        boolean a() {
            return this.f24697k == null && this.f24692f != -1;
        }

        boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            c cVar;
            return view2 == this.f24698l || s(view2, X.z(coordinatorLayout)) || ((cVar = this.f24687a) != null && cVar.i(coordinatorLayout, view, view2));
        }

        boolean c() {
            if (this.f24687a == null) {
                this.f24699m = false;
            }
            return this.f24699m;
        }

        View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f24692f == -1) {
                this.f24698l = null;
                this.f24697k = null;
                return null;
            }
            if (this.f24697k == null || !t(view, coordinatorLayout)) {
                n(view, coordinatorLayout);
            }
            return this.f24697k;
        }

        public int e() {
            return this.f24692f;
        }

        public c f() {
            return this.f24687a;
        }

        boolean g() {
            return this.f24702p;
        }

        Rect h() {
            return this.f24703q;
        }

        boolean i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z10 = this.f24699m;
            if (z10) {
                return true;
            }
            c cVar = this.f24687a;
            boolean zE = (cVar != null ? cVar.e(coordinatorLayout, view) : false) | z10;
            this.f24699m = zE;
            return zE;
        }

        boolean j(int i10) {
            if (i10 == 0) {
                return this.f24700n;
            }
            if (i10 != 1) {
                return false;
            }
            return this.f24701o;
        }

        void k() {
            this.f24702p = false;
        }

        void l(int i10) {
            r(i10, false);
        }

        void m() {
            this.f24699m = false;
        }

        public void o(c cVar) {
            c cVar2 = this.f24687a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.n();
                }
                this.f24687a = cVar;
                this.f24704r = null;
                this.f24688b = true;
                if (cVar != null) {
                    cVar.k(this);
                }
            }
        }

        void p(boolean z10) {
            this.f24702p = z10;
        }

        void q(Rect rect) {
            this.f24703q.set(rect);
        }

        void r(int i10, boolean z10) {
            if (i10 == 0) {
                this.f24700n = z10;
            } else {
                if (i10 != 1) {
                    return;
                }
                this.f24701o = z10;
            }
        }

        f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f24688b = false;
            this.f24689c = 0;
            this.f24690d = 0;
            this.f24691e = -1;
            this.f24692f = -1;
            this.f24693g = 0;
            this.f24694h = 0;
            this.f24703q = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3022c.f39655e);
            this.f24689c = typedArrayObtainStyledAttributes.getInteger(C3022c.f39656f, 0);
            this.f24692f = typedArrayObtainStyledAttributes.getResourceId(C3022c.f39657g, -1);
            this.f24690d = typedArrayObtainStyledAttributes.getInteger(C3022c.f39658h, 0);
            this.f24691e = typedArrayObtainStyledAttributes.getInteger(C3022c.f39662l, -1);
            this.f24693g = typedArrayObtainStyledAttributes.getInt(C3022c.f39661k, 0);
            this.f24694h = typedArrayObtainStyledAttributes.getInt(C3022c.f39660j, 0);
            int i10 = C3022c.f39659i;
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i10);
            this.f24688b = zHasValue;
            if (zHasValue) {
                this.f24687a = CoordinatorLayout.K(context, attributeSet, typedArrayObtainStyledAttributes.getString(i10));
            }
            typedArrayObtainStyledAttributes.recycle();
            c cVar = this.f24687a;
            if (cVar != null) {
                cVar.k(this);
            }
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f24688b = false;
            this.f24689c = 0;
            this.f24690d = 0;
            this.f24691e = -1;
            this.f24692f = -1;
            this.f24693g = 0;
            this.f24694h = 0;
            this.f24703q = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f24688b = false;
            this.f24689c = 0;
            this.f24690d = 0;
            this.f24691e = -1;
            this.f24692f = -1;
            this.f24693g = 0;
            this.f24694h = 0;
            this.f24703q = new Rect();
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f24688b = false;
            this.f24689c = 0;
            this.f24690d = 0;
            this.f24691e = -1;
            this.f24692f = -1;
            this.f24693g = 0;
            this.f24694h = 0;
            this.f24703q = new Rect();
        }
    }
}
