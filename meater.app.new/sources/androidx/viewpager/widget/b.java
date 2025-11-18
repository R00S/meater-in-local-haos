package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import g1.C3377a;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import s1.X;
import y1.AbstractC5121a;

/* compiled from: ViewPager.java */
/* loaded from: classes.dex */
public class b extends ViewGroup {

    /* renamed from: A0, reason: collision with root package name */
    static final int[] f29713A0 = {R.attr.layout_gravity};

    /* renamed from: B0, reason: collision with root package name */
    private static final Comparator<d> f29714B0 = new a();

    /* renamed from: C0, reason: collision with root package name */
    private static final Interpolator f29715C0 = new InterpolatorC0414b();

    /* renamed from: D0, reason: collision with root package name */
    private static final i f29716D0 = new i();

    /* renamed from: B, reason: collision with root package name */
    private int f29717B;

    /* renamed from: C, reason: collision with root package name */
    private final ArrayList<d> f29718C;

    /* renamed from: D, reason: collision with root package name */
    private final d f29719D;

    /* renamed from: E, reason: collision with root package name */
    private final Rect f29720E;

    /* renamed from: F, reason: collision with root package name */
    int f29721F;

    /* renamed from: G, reason: collision with root package name */
    private int f29722G;

    /* renamed from: H, reason: collision with root package name */
    private Parcelable f29723H;

    /* renamed from: I, reason: collision with root package name */
    private ClassLoader f29724I;

    /* renamed from: J, reason: collision with root package name */
    private Scroller f29725J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f29726K;

    /* renamed from: L, reason: collision with root package name */
    private int f29727L;

    /* renamed from: M, reason: collision with root package name */
    private Drawable f29728M;

    /* renamed from: N, reason: collision with root package name */
    private int f29729N;

    /* renamed from: O, reason: collision with root package name */
    private int f29730O;

    /* renamed from: P, reason: collision with root package name */
    private float f29731P;

    /* renamed from: Q, reason: collision with root package name */
    private float f29732Q;

    /* renamed from: R, reason: collision with root package name */
    private int f29733R;

    /* renamed from: S, reason: collision with root package name */
    private int f29734S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f29735T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f29736U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f29737V;

    /* renamed from: W, reason: collision with root package name */
    private int f29738W;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f29739a0;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f29740b0;

    /* renamed from: c0, reason: collision with root package name */
    private int f29741c0;

    /* renamed from: d0, reason: collision with root package name */
    private int f29742d0;

    /* renamed from: e0, reason: collision with root package name */
    private int f29743e0;

    /* renamed from: f0, reason: collision with root package name */
    private float f29744f0;

    /* renamed from: g0, reason: collision with root package name */
    private float f29745g0;

    /* renamed from: h0, reason: collision with root package name */
    private float f29746h0;

    /* renamed from: i0, reason: collision with root package name */
    private float f29747i0;

    /* renamed from: j0, reason: collision with root package name */
    private int f29748j0;

    /* renamed from: k0, reason: collision with root package name */
    private VelocityTracker f29749k0;

    /* renamed from: l0, reason: collision with root package name */
    private int f29750l0;

    /* renamed from: m0, reason: collision with root package name */
    private boolean f29751m0;

    /* renamed from: n0, reason: collision with root package name */
    private EdgeEffect f29752n0;

    /* renamed from: o0, reason: collision with root package name */
    private EdgeEffect f29753o0;

    /* renamed from: p0, reason: collision with root package name */
    private boolean f29754p0;

    /* renamed from: q0, reason: collision with root package name */
    private boolean f29755q0;

    /* renamed from: r0, reason: collision with root package name */
    private int f29756r0;

    /* renamed from: s0, reason: collision with root package name */
    private List<g> f29757s0;

    /* renamed from: t0, reason: collision with root package name */
    private g f29758t0;

    /* renamed from: u0, reason: collision with root package name */
    private g f29759u0;

    /* renamed from: v0, reason: collision with root package name */
    private List<f> f29760v0;

    /* renamed from: w0, reason: collision with root package name */
    private int f29761w0;

    /* renamed from: x0, reason: collision with root package name */
    private ArrayList<View> f29762x0;

    /* renamed from: y0, reason: collision with root package name */
    private final Runnable f29763y0;

    /* renamed from: z0, reason: collision with root package name */
    private int f29764z0;

    /* compiled from: ViewPager.java */
    static class a implements Comparator<d> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(d dVar, d dVar2) {
            return dVar.f29766b - dVar2.f29766b;
        }
    }

    /* compiled from: ViewPager.java */
    /* renamed from: androidx.viewpager.widget.b$b, reason: collision with other inner class name */
    static class InterpolatorC0414b implements Interpolator {
        InterpolatorC0414b() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* compiled from: ViewPager.java */
    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface c {
    }

    /* compiled from: ViewPager.java */
    static class d {

        /* renamed from: a, reason: collision with root package name */
        Object f29765a;

        /* renamed from: b, reason: collision with root package name */
        int f29766b;

        /* renamed from: c, reason: collision with root package name */
        boolean f29767c;

        /* renamed from: d, reason: collision with root package name */
        float f29768d;

        /* renamed from: e, reason: collision with root package name */
        float f29769e;

        d() {
        }
    }

    /* compiled from: ViewPager.java */
    public interface f {
        void a(b bVar, androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2);
    }

    /* compiled from: ViewPager.java */
    public interface g {
        void E(int i10);

        void H(int i10);

        void f(int i10, float f10, int i11);
    }

    /* compiled from: ViewPager.java */
    public static class h extends AbstractC5121a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: D, reason: collision with root package name */
        int f29776D;

        /* renamed from: E, reason: collision with root package name */
        Parcelable f29777E;

        /* renamed from: F, reason: collision with root package name */
        ClassLoader f29778F;

        /* compiled from: ViewPager.java */
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

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f29776D + "}";
        }

        @Override // y1.AbstractC5121a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f29776D);
            parcel.writeParcelable(this.f29777E, i10);
        }

        h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f29776D = parcel.readInt();
            this.f29777E = parcel.readParcelable(classLoader);
            this.f29778F = classLoader;
        }
    }

    /* compiled from: ViewPager.java */
    static class i implements Comparator<View> {
        i() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            e eVar = (e) view.getLayoutParams();
            e eVar2 = (e) view2.getLayoutParams();
            boolean z10 = eVar.f29770a;
            return z10 != eVar2.f29770a ? z10 ? 1 : -1 : eVar.f29774e - eVar2.f29774e;
        }
    }

    private void C(boolean z10) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    private boolean D() {
        this.f29748j0 = -1;
        j();
        this.f29752n0.onRelease();
        this.f29753o0.onRelease();
        return this.f29752n0.isFinished() || this.f29753o0.isFinished();
    }

    private void E(int i10, boolean z10, int i11, boolean z11) {
        d dVarO = o(i10);
        int clientWidth = dVarO != null ? (int) (getClientWidth() * Math.max(this.f29731P, Math.min(dVarO.f29769e, this.f29732Q))) : 0;
        if (z10) {
            I(clientWidth, 0, i11);
            if (z11) {
                g(i10);
                return;
            }
            return;
        }
        if (z11) {
            g(i10);
        }
        e(false);
        scrollTo(clientWidth, 0);
        v(clientWidth);
    }

    private void J() {
        if (this.f29761w0 != 0) {
            ArrayList<View> arrayList = this.f29762x0;
            if (arrayList == null) {
                this.f29762x0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.f29762x0.add(getChildAt(i10));
            }
            Collections.sort(this.f29762x0, f29716D0);
        }
    }

    private void e(boolean z10) {
        boolean z11 = this.f29764z0 == 2;
        if (z11) {
            setScrollingCacheEnabled(false);
            if (!this.f29725J.isFinished()) {
                this.f29725J.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f29725J.getCurrX();
                int currY = this.f29725J.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        v(currX);
                    }
                }
            }
        }
        this.f29737V = false;
        for (int i10 = 0; i10 < this.f29718C.size(); i10++) {
            d dVar = this.f29718C.get(i10);
            if (dVar.f29767c) {
                dVar.f29767c = false;
                z11 = true;
            }
        }
        if (z11) {
            if (z10) {
                X.f0(this, this.f29763y0);
            } else {
                this.f29763y0.run();
            }
        }
    }

    private void f(int i10, float f10, int i11) {
        g gVar = this.f29758t0;
        if (gVar != null) {
            gVar.f(i10, f10, i11);
        }
        List<g> list = this.f29757s0;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                g gVar2 = this.f29757s0.get(i12);
                if (gVar2 != null) {
                    gVar2.f(i10, f10, i11);
                }
            }
        }
        g gVar3 = this.f29759u0;
        if (gVar3 != null) {
            gVar3.f(i10, f10, i11);
        }
    }

    private void g(int i10) {
        g gVar = this.f29758t0;
        if (gVar != null) {
            gVar.H(i10);
        }
        List<g> list = this.f29757s0;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                g gVar2 = this.f29757s0.get(i11);
                if (gVar2 != null) {
                    gVar2.H(i10);
                }
            }
        }
        g gVar3 = this.f29759u0;
        if (gVar3 != null) {
            gVar3.H(i10);
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void h(int i10) {
        g gVar = this.f29758t0;
        if (gVar != null) {
            gVar.E(i10);
        }
        List<g> list = this.f29757s0;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                g gVar2 = this.f29757s0.get(i11);
                if (gVar2 != null) {
                    gVar2.E(i10);
                }
            }
        }
        g gVar3 = this.f29759u0;
        if (gVar3 != null) {
            gVar3.E(i10);
        }
    }

    private void j() {
        this.f29739a0 = false;
        this.f29740b0 = false;
        VelocityTracker velocityTracker = this.f29749k0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f29749k0 = null;
        }
    }

    private Rect l(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private d n() {
        int i10;
        int clientWidth = getClientWidth();
        float f10 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f11 = clientWidth > 0 ? this.f29727L / clientWidth : 0.0f;
        int i11 = 0;
        d dVar = null;
        boolean z10 = true;
        int i12 = -1;
        float f12 = 0.0f;
        while (i11 < this.f29718C.size()) {
            d dVar2 = this.f29718C.get(i11);
            if (!z10 && dVar2.f29766b != (i10 = i12 + 1)) {
                d dVar3 = this.f29719D;
                dVar3.f29769e = f10 + f12 + f11;
                dVar3.f29766b = i10;
                throw null;
            }
            f10 = dVar2.f29769e;
            float f13 = dVar2.f29768d + f10 + f11;
            if (!z10 && scrollX < f10) {
                return dVar;
            }
            if (scrollX < f13 || i11 == this.f29718C.size() - 1) {
                return dVar2;
            }
            i12 = dVar2.f29766b;
            f12 = dVar2.f29768d;
            i11++;
            z10 = false;
            dVar = dVar2;
        }
        return dVar;
    }

    private static boolean p(View view) {
        return view.getClass().getAnnotation(c.class) != null;
    }

    private boolean q(float f10, float f11) {
        return (f10 < ((float) this.f29742d0) && f11 > 0.0f) || (f10 > ((float) (getWidth() - this.f29742d0)) && f11 < 0.0f);
    }

    private void s(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f29748j0) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f29744f0 = motionEvent.getX(i10);
            this.f29748j0 = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f29749k0;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.f29736U != z10) {
            this.f29736U = z10;
        }
    }

    private boolean v(int i10) {
        if (this.f29718C.size() == 0) {
            if (this.f29754p0) {
                return false;
            }
            this.f29755q0 = false;
            r(0, 0.0f, 0);
            if (this.f29755q0) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        d dVarN = n();
        int clientWidth = getClientWidth();
        int i11 = this.f29727L;
        int i12 = clientWidth + i11;
        float f10 = clientWidth;
        int i13 = dVarN.f29766b;
        float f11 = ((i10 / f10) - dVarN.f29769e) / (dVarN.f29768d + (i11 / f10));
        this.f29755q0 = false;
        r(i13, f11, (int) (i12 * f11));
        if (this.f29755q0) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private boolean w(float f10) {
        this.f29744f0 = f10;
        getScrollX();
        getClientWidth();
        d dVar = this.f29718C.get(0);
        d dVar2 = this.f29718C.get(r0.size() - 1);
        int i10 = dVar.f29766b;
        int i11 = dVar2.f29766b;
        throw null;
    }

    private void z(int i10, int i11, int i12, int i13) {
        if (i11 > 0 && !this.f29718C.isEmpty()) {
            if (!this.f29725J.isFinished()) {
                this.f29725J.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i11 - getPaddingLeft()) - getPaddingRight()) + i13)) * (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)), getScrollY());
                return;
            }
        }
        d dVarO = o(this.f29721F);
        int iMin = (int) ((dVarO != null ? Math.min(dVarO.f29769e, this.f29732Q) : 0.0f) * ((i10 - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            e(false);
            scrollTo(iMin, getScrollY());
        }
    }

    public void A(f fVar) {
        List<f> list = this.f29760v0;
        if (list != null) {
            list.remove(fVar);
        }
    }

    public void B(g gVar) {
        List<g> list = this.f29757s0;
        if (list != null) {
            list.remove(gVar);
        }
    }

    public void F(int i10, boolean z10) {
        this.f29737V = false;
        G(i10, z10, false);
    }

    void G(int i10, boolean z10, boolean z11) {
        H(i10, z10, z11, 0);
    }

    void H(int i10, boolean z10, boolean z11, int i11) {
        setScrollingCacheEnabled(false);
    }

    void I(int i10, int i11, int i12) {
        int scrollX;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f29725J;
        if (scroller == null || scroller.isFinished()) {
            scrollX = getScrollX();
        } else {
            scrollX = this.f29726K ? this.f29725J.getCurrX() : this.f29725J.getStartX();
            this.f29725J.abortAnimation();
            setScrollingCacheEnabled(false);
        }
        int i13 = scrollX;
        int scrollY = getScrollY();
        int i14 = i10 - i13;
        int i15 = i11 - scrollY;
        if (i14 == 0 && i15 == 0) {
            e(false);
            x();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        float f10 = clientWidth / 2;
        float fI = f10 + (i(Math.min(1.0f, (Math.abs(i14) * 1.0f) / clientWidth)) * f10);
        int iAbs = Math.abs(i12);
        if (iAbs <= 0) {
            throw null;
        }
        int iMin = Math.min(Math.round(Math.abs(fI / iAbs) * 1000.0f) * 4, 600);
        this.f29726K = false;
        this.f29725J.startScroll(i13, scrollY, i14, i15, iMin);
        X.e0(this);
    }

    public void a(f fVar) {
        if (this.f29760v0 == null) {
            this.f29760v0 = new ArrayList();
        }
        this.f29760v0.add(fVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        d dVarM;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (dVarM = m(childAt)) != null && dVarM.f29766b == this.f29721F) {
                    childAt.addFocusables(arrayList, i10, i11);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i11 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        d dVarM;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (dVarM = m(childAt)) != null && dVarM.f29766b == this.f29721F) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        e eVar = (e) layoutParams;
        boolean zP = eVar.f29770a | p(view);
        eVar.f29770a = zP;
        if (!this.f29735T) {
            super.addView(view, i10, layoutParams);
        } else {
            if (zP) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            eVar.f29773d = true;
            addViewInLayout(view, i10, layoutParams);
        }
    }

    public void b(g gVar) {
        if (this.f29757s0 == null) {
            this.f29757s0 = new ArrayList();
        }
        this.f29757s0.add(gVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean c(int r5) {
        /*
            r4 = this;
            android.view.View r0 = r4.findFocus()
            r1 = 0
            if (r0 != r4) goto L9
        L7:
            r0 = r1
            goto L63
        L9:
            if (r0 == 0) goto L63
            android.view.ViewParent r2 = r0.getParent()
        Lf:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L1b
            if (r2 != r4) goto L16
            goto L63
        L16:
            android.view.ViewParent r2 = r2.getParent()
            goto Lf
        L1b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
        L2f:
            boolean r3 = r0 instanceof android.view.ViewGroup
            if (r3 == 0) goto L48
            java.lang.String r3 = " => "
            r2.append(r3)
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
            goto L2f
        L48:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.append(r3)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "ViewPager"
            android.util.Log.e(r2, r0)
            goto L7
        L63:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r4, r0, r5)
            r2 = 66
            r3 = 17
            if (r1 == 0) goto Lb3
            if (r1 == r0) goto Lb3
            if (r5 != r3) goto L93
            android.graphics.Rect r2 = r4.f29720E
            android.graphics.Rect r2 = r4.l(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r4.f29720E
            android.graphics.Rect r3 = r4.l(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto L8e
            if (r2 < r3) goto L8e
            boolean r0 = r4.t()
            goto Lca
        L8e:
            boolean r0 = r1.requestFocus()
            goto Lca
        L93:
            if (r5 != r2) goto Lbf
            android.graphics.Rect r2 = r4.f29720E
            android.graphics.Rect r2 = r4.l(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r4.f29720E
            android.graphics.Rect r3 = r4.l(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto Lae
            if (r2 > r3) goto Lae
            boolean r0 = r4.u()
            goto Lca
        Lae:
            boolean r0 = r1.requestFocus()
            goto Lca
        Lb3:
            if (r5 == r3) goto Lc6
            r0 = 1
            if (r5 != r0) goto Lb9
            goto Lc6
        Lb9:
            if (r5 == r2) goto Lc1
            r0 = 2
            if (r5 != r0) goto Lbf
            goto Lc1
        Lbf:
            r0 = 0
            goto Lca
        Lc1:
            boolean r0 = r4.u()
            goto Lca
        Lc6:
            boolean r0 = r4.t()
        Lca:
            if (r0 == 0) goto Ld3
            int r5 = android.view.SoundEffectConstants.getContantForFocusDirection(r5)
            r4.playSoundEffect(r5)
        Ld3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.b.c(int):boolean");
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        return false;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f29726K = true;
        if (this.f29725J.isFinished() || !this.f29725J.computeScrollOffset()) {
            e(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f29725J.getCurrX();
        int currY = this.f29725J.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!v(currX)) {
                this.f29725J.abortAnimation();
                scrollTo(0, currY);
            }
        }
        X.e0(this);
    }

    protected boolean d(View view, boolean z10, int i10, int i11, int i12) {
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i11 + scrollX;
                if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && (i13 = i12 + scrollY) >= childAt.getTop() && i13 < childAt.getBottom() && d(childAt, true, i10, i14 - childAt.getLeft(), i13 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z10 && view.canScrollHorizontally(-i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || k(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        d dVarM;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (dVarM = m(childAt)) != null && dVarM.f29766b == this.f29721F && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        boolean zDraw = false;
        if (getOverScrollMode() != 0) {
            this.f29752n0.finish();
            this.f29753o0.finish();
        } else {
            if (!this.f29752n0.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.f29731P * width);
                this.f29752n0.setSize(height, width);
                zDraw = this.f29752n0.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.f29753o0.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f29732Q + 1.0f)) * width2);
                this.f29753o0.setSize(height2, width2);
                zDraw |= this.f29753o0.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        }
        if (zDraw) {
            X.e0(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f29728M;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public androidx.viewpager.widget.a getAdapter() {
        return null;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        if (this.f29761w0 == 2) {
            i11 = (i10 - 1) - i11;
        }
        return ((e) this.f29762x0.get(i11).getLayoutParams()).f29775f;
    }

    public int getCurrentItem() {
        return this.f29721F;
    }

    public int getOffscreenPageLimit() {
        return this.f29738W;
    }

    public int getPageMargin() {
        return this.f29727L;
    }

    float i(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    public boolean k(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 21) {
                return keyEvent.hasModifiers(2) ? t() : c(17);
            }
            if (keyCode == 22) {
                return keyEvent.hasModifiers(2) ? u() : c(66);
            }
            if (keyCode == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return c(2);
                }
                if (keyEvent.hasModifiers(1)) {
                    return c(1);
                }
            }
        }
        return false;
    }

    d m(View view) {
        if (this.f29718C.size() <= 0) {
            return null;
        }
        Object obj = this.f29718C.get(0).f29765a;
        throw null;
    }

    d o(int i10) {
        for (int i11 = 0; i11 < this.f29718C.size(); i11++) {
            d dVar = this.f29718C.get(i11);
            if (dVar.f29766b == i10) {
                return dVar;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f29754p0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f29763y0);
        Scroller scroller = this.f29725J;
        if (scroller != null && !scroller.isFinished()) {
            this.f29725J.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f29727L <= 0 || this.f29728M == null) {
            return;
        }
        this.f29718C.size();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            D();
            return false;
        }
        if (action != 0) {
            if (this.f29739a0) {
                return true;
            }
            if (this.f29740b0) {
                return false;
            }
        }
        if (action == 0) {
            float x10 = motionEvent.getX();
            this.f29746h0 = x10;
            this.f29744f0 = x10;
            float y10 = motionEvent.getY();
            this.f29747i0 = y10;
            this.f29745g0 = y10;
            this.f29748j0 = motionEvent.getPointerId(0);
            this.f29740b0 = false;
            this.f29726K = true;
            this.f29725J.computeScrollOffset();
            if (this.f29764z0 != 2 || Math.abs(this.f29725J.getFinalX() - this.f29725J.getCurrX()) <= this.f29750l0) {
                e(false);
                this.f29739a0 = false;
            } else {
                this.f29725J.abortAnimation();
                this.f29737V = false;
                x();
                this.f29739a0 = true;
                C(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i10 = this.f29748j0;
            if (i10 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i10);
                float x11 = motionEvent.getX(iFindPointerIndex);
                float f10 = x11 - this.f29744f0;
                float fAbs = Math.abs(f10);
                float y11 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y11 - this.f29747i0);
                if (f10 != 0.0f && !q(this.f29744f0, f10) && d(this, false, (int) f10, (int) x11, (int) y11)) {
                    this.f29744f0 = x11;
                    this.f29745g0 = y11;
                    this.f29740b0 = true;
                    return false;
                }
                int i11 = this.f29743e0;
                if (fAbs > i11 && fAbs * 0.5f > fAbs2) {
                    this.f29739a0 = true;
                    C(true);
                    setScrollState(1);
                    float f11 = this.f29746h0;
                    float f12 = this.f29743e0;
                    this.f29744f0 = f10 > 0.0f ? f11 + f12 : f11 - f12;
                    this.f29745g0 = y11;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > i11) {
                    this.f29740b0 = true;
                }
                if (this.f29739a0 && w(x11)) {
                    X.e0(this);
                }
            }
        } else if (action == 6) {
            s(motionEvent);
        }
        if (this.f29749k0 == null) {
            this.f29749k0 = VelocityTracker.obtain();
        }
        this.f29749k0.addMovement(motionEvent);
        return this.f29739a0;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.b.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        e eVar;
        e eVar2;
        int i12;
        setMeasuredDimension(View.getDefaultSize(0, i10), View.getDefaultSize(0, i11));
        int measuredWidth = getMeasuredWidth();
        this.f29742d0 = Math.min(measuredWidth / 10, this.f29741c0);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            boolean z10 = true;
            int i14 = 1073741824;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8 && (eVar2 = (e) childAt.getLayoutParams()) != null && eVar2.f29770a) {
                int i15 = eVar2.f29771b;
                int i16 = i15 & 7;
                int i17 = i15 & 112;
                boolean z11 = i17 == 48 || i17 == 80;
                if (i16 != 3 && i16 != 5) {
                    z10 = false;
                }
                int i18 = Integer.MIN_VALUE;
                if (z11) {
                    i12 = Integer.MIN_VALUE;
                    i18 = 1073741824;
                } else {
                    i12 = z10 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i19 = ((ViewGroup.LayoutParams) eVar2).width;
                if (i19 != -2) {
                    if (i19 == -1) {
                        i19 = paddingLeft;
                    }
                    i18 = 1073741824;
                } else {
                    i19 = paddingLeft;
                }
                int i20 = ((ViewGroup.LayoutParams) eVar2).height;
                if (i20 == -2) {
                    i20 = measuredHeight;
                    i14 = i12;
                } else if (i20 == -1) {
                    i20 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i19, i18), View.MeasureSpec.makeMeasureSpec(i20, i14));
                if (z11) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z10) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i13++;
        }
        this.f29733R = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f29734S = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f29735T = true;
        x();
        this.f29735T = false;
        int childCount2 = getChildCount();
        for (int i21 = 0; i21 < childCount2; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8 && ((eVar = (e) childAt2.getLayoutParams()) == null || !eVar.f29770a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * eVar.f29772c), 1073741824), this.f29734S);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        int i13;
        d dVarM;
        int childCount = getChildCount();
        if ((i10 & 2) != 0) {
            i12 = childCount;
            i11 = 0;
            i13 = 1;
        } else {
            i11 = childCount - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (dVarM = m(childAt)) != null && dVarM.f29766b == this.f29721F && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i11 += i13;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        this.f29722G = hVar.f29776D;
        this.f29723H = hVar.f29777E;
        this.f29724I = hVar.f29778F;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        hVar.f29776D = this.f29721F;
        return hVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            int i14 = this.f29727L;
            z(i10, i12, i14, i14);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f29751m0) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            motionEvent.getEdgeFlags();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void r(int r12, float r13, int r14) {
        /*
            r11 = this;
            int r0 = r11.f29756r0
            r1 = 1
            if (r0 <= 0) goto L6b
            int r0 = r11.getScrollX()
            int r2 = r11.getPaddingLeft()
            int r3 = r11.getPaddingRight()
            int r4 = r11.getWidth()
            int r5 = r11.getChildCount()
            r6 = 0
        L1a:
            if (r6 >= r5) goto L6b
            android.view.View r7 = r11.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.viewpager.widget.b$e r8 = (androidx.viewpager.widget.b.e) r8
            boolean r9 = r8.f29770a
            if (r9 != 0) goto L2b
            goto L68
        L2b:
            int r8 = r8.f29771b
            r8 = r8 & 7
            if (r8 == r1) goto L4f
            r9 = 3
            if (r8 == r9) goto L49
            r9 = 5
            if (r8 == r9) goto L39
            r8 = r2
            goto L5c
        L39:
            int r8 = r4 - r3
            int r9 = r7.getMeasuredWidth()
            int r8 = r8 - r9
            int r9 = r7.getMeasuredWidth()
            int r3 = r3 + r9
        L45:
            r10 = r8
            r8 = r2
            r2 = r10
            goto L5c
        L49:
            int r8 = r7.getWidth()
            int r8 = r8 + r2
            goto L5c
        L4f:
            int r8 = r7.getMeasuredWidth()
            int r8 = r4 - r8
            int r8 = r8 / 2
            int r8 = java.lang.Math.max(r8, r2)
            goto L45
        L5c:
            int r2 = r2 + r0
            int r9 = r7.getLeft()
            int r2 = r2 - r9
            if (r2 == 0) goto L67
            r7.offsetLeftAndRight(r2)
        L67:
            r2 = r8
        L68:
            int r6 = r6 + 1
            goto L1a
        L6b:
            r11.f(r12, r13, r14)
            r11.f29755q0 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.b.r(int, float, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f29735T) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(androidx.viewpager.widget.a aVar) {
        this.f29717B = 0;
        List<f> list = this.f29760v0;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.f29760v0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f29760v0.get(i10).a(this, null, aVar);
        }
    }

    public void setCurrentItem(int i10) {
        this.f29737V = false;
        G(i10, !this.f29754p0, false);
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i10 + " too small; defaulting to 1");
            i10 = 1;
        }
        if (i10 != this.f29738W) {
            this.f29738W = i10;
            x();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(g gVar) {
        this.f29758t0 = gVar;
    }

    public void setPageMargin(int i10) {
        int i11 = this.f29727L;
        this.f29727L = i10;
        int width = getWidth();
        z(width, width, i10, i11);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f29728M = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    void setScrollState(int i10) {
        if (this.f29764z0 == i10) {
            return;
        }
        this.f29764z0 = i10;
        h(i10);
    }

    boolean t() {
        int i10 = this.f29721F;
        if (i10 <= 0) {
            return false;
        }
        F(i10 - 1, true);
        return true;
    }

    boolean u() {
        return false;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f29728M;
    }

    void x() {
        y(this.f29721F);
    }

    void y(int i10) {
        int i11 = this.f29721F;
        if (i11 != i10) {
            o(i11);
            this.f29721F = i10;
        }
        J();
    }

    /* compiled from: ViewPager.java */
    public static class e extends ViewGroup.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public boolean f29770a;

        /* renamed from: b, reason: collision with root package name */
        public int f29771b;

        /* renamed from: c, reason: collision with root package name */
        float f29772c;

        /* renamed from: d, reason: collision with root package name */
        boolean f29773d;

        /* renamed from: e, reason: collision with root package name */
        int f29774e;

        /* renamed from: f, reason: collision with root package name */
        int f29775f;

        public e() {
            super(-1, -1);
            this.f29772c = 0.0f;
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f29772c = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f29713A0);
            this.f29771b = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public void setPageMarginDrawable(int i10) {
        setPageMarginDrawable(C3377a.e(getContext(), i10));
    }
}
