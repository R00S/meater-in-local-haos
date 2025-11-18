package p024c.p062k.p063a;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.C0311u;
import java.util.Arrays;

/* compiled from: ViewDragHelper.java */
/* renamed from: c.k.a.c */
/* loaded from: classes.dex */
public class C0966c {

    /* renamed from: a */
    private static final Interpolator f6436a = new a();

    /* renamed from: b */
    private int f6437b;

    /* renamed from: c */
    private int f6438c;

    /* renamed from: e */
    private float[] f6440e;

    /* renamed from: f */
    private float[] f6441f;

    /* renamed from: g */
    private float[] f6442g;

    /* renamed from: h */
    private float[] f6443h;

    /* renamed from: i */
    private int[] f6444i;

    /* renamed from: j */
    private int[] f6445j;

    /* renamed from: k */
    private int[] f6446k;

    /* renamed from: l */
    private int f6447l;

    /* renamed from: m */
    private VelocityTracker f6448m;

    /* renamed from: n */
    private float f6449n;

    /* renamed from: o */
    private float f6450o;

    /* renamed from: p */
    private int f6451p;

    /* renamed from: q */
    private int f6452q;

    /* renamed from: r */
    private OverScroller f6453r;

    /* renamed from: s */
    private final c f6454s;

    /* renamed from: t */
    private View f6455t;

    /* renamed from: u */
    private boolean f6456u;

    /* renamed from: v */
    private final ViewGroup f6457v;

    /* renamed from: d */
    private int f6439d = -1;

    /* renamed from: w */
    private final Runnable f6458w = new b();

    /* compiled from: ViewDragHelper.java */
    /* renamed from: c.k.a.c$a */
    static class a implements Interpolator {
        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }

    /* compiled from: ViewDragHelper.java */
    /* renamed from: c.k.a.c$b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0966c.this.m6150E(0);
        }
    }

    /* compiled from: ViewDragHelper.java */
    /* renamed from: c.k.a.c$c */
    public static abstract class c {
        /* renamed from: a */
        public abstract int mo6164a(View view, int i2, int i3);

        /* renamed from: b */
        public abstract int mo6165b(View view, int i2, int i3);

        /* renamed from: c */
        public int m6166c(int i2) {
            return i2;
        }

        /* renamed from: d */
        public int mo6167d(View view) {
            return 0;
        }

        /* renamed from: e */
        public int mo6168e(View view) {
            return 0;
        }

        /* renamed from: f */
        public void m6169f(int i2, int i3) {
        }

        /* renamed from: g */
        public boolean m6170g(int i2) {
            return false;
        }

        /* renamed from: h */
        public void m6171h(int i2, int i3) {
        }

        /* renamed from: i */
        public void mo6172i(View view, int i2) {
        }

        /* renamed from: j */
        public abstract void mo6173j(int i2);

        /* renamed from: k */
        public abstract void mo6174k(View view, int i2, int i3, int i4, int i5);

        /* renamed from: l */
        public abstract void mo6175l(View view, float f2, float f3);

        /* renamed from: m */
        public abstract boolean mo6176m(View view, int i2);
    }

    private C0966c(Context context, ViewGroup viewGroup, c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (cVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f6457v = viewGroup;
        this.f6454s = cVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f6451p = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f6438c = viewConfiguration.getScaledTouchSlop();
        this.f6449n = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f6450o = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f6453r = new OverScroller(context, f6436a);
    }

    /* renamed from: A */
    private void m6129A() {
        this.f6448m.computeCurrentVelocity(1000, this.f6449n);
        m6143n(m6135e(this.f6448m.getXVelocity(this.f6439d), this.f6450o, this.f6449n), m6135e(this.f6448m.getYVelocity(this.f6439d), this.f6450o, this.f6449n));
    }

    /* renamed from: B */
    private void m6130B(float f2, float f3, int i2) {
        int i3 = m6133c(f2, f3, i2, 1) ? 1 : 0;
        if (m6133c(f3, f2, i2, 4)) {
            i3 |= 4;
        }
        if (m6133c(f2, f3, i2, 2)) {
            i3 |= 2;
        }
        if (m6133c(f3, f2, i2, 8)) {
            i3 |= 8;
        }
        if (i3 != 0) {
            int[] iArr = this.f6445j;
            iArr[i2] = iArr[i2] | i3;
            this.f6454s.m6169f(i3, i2);
        }
    }

    /* renamed from: C */
    private void m6131C(float f2, float f3, int i2) {
        m6146q(i2);
        float[] fArr = this.f6440e;
        this.f6442g[i2] = f2;
        fArr[i2] = f2;
        float[] fArr2 = this.f6441f;
        this.f6443h[i2] = f3;
        fArr2[i2] = f3;
        this.f6444i[i2] = m6148t((int) f2, (int) f3);
        this.f6447l |= 1 << i2;
    }

    /* renamed from: D */
    private void m6132D(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if (m6149x(pointerId)) {
                float x = motionEvent.getX(i2);
                float y = motionEvent.getY(i2);
                this.f6442g[pointerId] = x;
                this.f6443h[pointerId] = y;
            }
        }
    }

    /* renamed from: c */
    private boolean m6133c(float f2, float f3, int i2, int i3) {
        float fAbs = Math.abs(f2);
        float fAbs2 = Math.abs(f3);
        if ((this.f6444i[i2] & i3) != i3 || (this.f6452q & i3) == 0 || (this.f6446k[i2] & i3) == i3 || (this.f6445j[i2] & i3) == i3) {
            return false;
        }
        int i4 = this.f6438c;
        if (fAbs <= i4 && fAbs2 <= i4) {
            return false;
        }
        if (fAbs >= fAbs2 * 0.5f || !this.f6454s.m6170g(i3)) {
            return (this.f6445j[i2] & i3) == 0 && fAbs > ((float) this.f6438c);
        }
        int[] iArr = this.f6446k;
        iArr[i2] = iArr[i2] | i3;
        return false;
    }

    /* renamed from: d */
    private boolean m6134d(View view, float f2, float f3) {
        if (view == null) {
            return false;
        }
        boolean z = this.f6454s.mo6167d(view) > 0;
        boolean z2 = this.f6454s.mo6168e(view) > 0;
        if (!z || !z2) {
            return z ? Math.abs(f2) > ((float) this.f6438c) : z2 && Math.abs(f3) > ((float) this.f6438c);
        }
        float f4 = (f2 * f2) + (f3 * f3);
        int i2 = this.f6438c;
        return f4 > ((float) (i2 * i2));
    }

    /* renamed from: e */
    private float m6135e(float f2, float f3, float f4) {
        float fAbs = Math.abs(f2);
        if (fAbs < f3) {
            return 0.0f;
        }
        return fAbs > f4 ? f2 > 0.0f ? f4 : -f4 : f2;
    }

    /* renamed from: f */
    private int m6136f(int i2, int i3, int i4) {
        int iAbs = Math.abs(i2);
        if (iAbs < i3) {
            return 0;
        }
        return iAbs > i4 ? i2 > 0 ? i4 : -i4 : i2;
    }

    /* renamed from: g */
    private void m6137g() {
        float[] fArr = this.f6440e;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f6441f, 0.0f);
        Arrays.fill(this.f6442g, 0.0f);
        Arrays.fill(this.f6443h, 0.0f);
        Arrays.fill(this.f6444i, 0);
        Arrays.fill(this.f6445j, 0);
        Arrays.fill(this.f6446k, 0);
        this.f6447l = 0;
    }

    /* renamed from: h */
    private void m6138h(int i2) {
        if (this.f6440e == null || !m6161w(i2)) {
            return;
        }
        this.f6440e[i2] = 0.0f;
        this.f6441f[i2] = 0.0f;
        this.f6442g[i2] = 0.0f;
        this.f6443h[i2] = 0.0f;
        this.f6444i[i2] = 0;
        this.f6445j[i2] = 0;
        this.f6446k[i2] = 0;
        this.f6447l = ((1 << i2) ^ (-1)) & this.f6447l;
    }

    /* renamed from: i */
    private int m6139i(int i2, int i3, int i4) {
        if (i2 == 0) {
            return 0;
        }
        int width = this.f6457v.getWidth();
        float f2 = width / 2;
        float fM6144o = f2 + (m6144o(Math.min(1.0f, Math.abs(i2) / width)) * f2);
        int iAbs = Math.abs(i3);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fM6144o / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i2) / i4) + 1.0f) * 256.0f), 600);
    }

    /* renamed from: j */
    private int m6140j(View view, int i2, int i3, int i4, int i5) {
        float f2;
        float f3;
        float f4;
        float f5;
        int iM6136f = m6136f(i4, (int) this.f6450o, (int) this.f6449n);
        int iM6136f2 = m6136f(i5, (int) this.f6450o, (int) this.f6449n);
        int iAbs = Math.abs(i2);
        int iAbs2 = Math.abs(i3);
        int iAbs3 = Math.abs(iM6136f);
        int iAbs4 = Math.abs(iM6136f2);
        int i6 = iAbs3 + iAbs4;
        int i7 = iAbs + iAbs2;
        if (iM6136f != 0) {
            f2 = iAbs3;
            f3 = i6;
        } else {
            f2 = iAbs;
            f3 = i7;
        }
        float f6 = f2 / f3;
        if (iM6136f2 != 0) {
            f4 = iAbs4;
            f5 = i6;
        } else {
            f4 = iAbs2;
            f5 = i7;
        }
        return (int) ((m6139i(i2, iM6136f, this.f6454s.mo6167d(view)) * f6) + (m6139i(i3, iM6136f2, this.f6454s.mo6168e(view)) * (f4 / f5)));
    }

    /* renamed from: l */
    public static C0966c m6141l(ViewGroup viewGroup, float f2, c cVar) {
        C0966c c0966cM6142m = m6142m(viewGroup, cVar);
        c0966cM6142m.f6438c = (int) (c0966cM6142m.f6438c * (1.0f / f2));
        return c0966cM6142m;
    }

    /* renamed from: m */
    public static C0966c m6142m(ViewGroup viewGroup, c cVar) {
        return new C0966c(viewGroup.getContext(), viewGroup, cVar);
    }

    /* renamed from: n */
    private void m6143n(float f2, float f3) {
        this.f6456u = true;
        this.f6454s.mo6175l(this.f6455t, f2, f3);
        this.f6456u = false;
        if (this.f6437b == 1) {
            m6150E(0);
        }
    }

    /* renamed from: o */
    private float m6144o(float f2) {
        return (float) Math.sin((f2 - 0.5f) * 0.47123894f);
    }

    /* renamed from: p */
    private void m6145p(int i2, int i3, int i4, int i5) {
        int left = this.f6455t.getLeft();
        int top = this.f6455t.getTop();
        if (i4 != 0) {
            i2 = this.f6454s.mo6164a(this.f6455t, i2, i4);
            C0311u.m2107T(this.f6455t, i2 - left);
        }
        int i6 = i2;
        if (i5 != 0) {
            i3 = this.f6454s.mo6165b(this.f6455t, i3, i5);
            C0311u.m2108U(this.f6455t, i3 - top);
        }
        int i7 = i3;
        if (i4 == 0 && i5 == 0) {
            return;
        }
        this.f6454s.mo6174k(this.f6455t, i6, i7, i6 - left, i7 - top);
    }

    /* renamed from: q */
    private void m6146q(int i2) {
        float[] fArr = this.f6440e;
        if (fArr == null || fArr.length <= i2) {
            int i3 = i2 + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f6441f;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f6442g;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f6443h;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f6444i;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f6445j;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f6446k;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f6440e = fArr2;
            this.f6441f = fArr3;
            this.f6442g = fArr4;
            this.f6443h = fArr5;
            this.f6444i = iArr;
            this.f6445j = iArr2;
            this.f6446k = iArr3;
        }
    }

    /* renamed from: s */
    private boolean m6147s(int i2, int i3, int i4, int i5) {
        int left = this.f6455t.getLeft();
        int top = this.f6455t.getTop();
        int i6 = i2 - left;
        int i7 = i3 - top;
        if (i6 == 0 && i7 == 0) {
            this.f6453r.abortAnimation();
            m6150E(0);
            return false;
        }
        this.f6453r.startScroll(left, top, i6, i7, m6140j(this.f6455t, i6, i7, i4, i5));
        m6150E(2);
        return true;
    }

    /* renamed from: t */
    private int m6148t(int i2, int i3) {
        int i4 = i2 < this.f6457v.getLeft() + this.f6451p ? 1 : 0;
        if (i3 < this.f6457v.getTop() + this.f6451p) {
            i4 |= 4;
        }
        if (i2 > this.f6457v.getRight() - this.f6451p) {
            i4 |= 2;
        }
        return i3 > this.f6457v.getBottom() - this.f6451p ? i4 | 8 : i4;
    }

    /* renamed from: x */
    private boolean m6149x(int i2) {
        if (m6161w(i2)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i2 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* renamed from: E */
    void m6150E(int i2) {
        this.f6457v.removeCallbacks(this.f6458w);
        if (this.f6437b != i2) {
            this.f6437b = i2;
            this.f6454s.mo6173j(i2);
            if (this.f6437b == 0) {
                this.f6455t = null;
            }
        }
    }

    /* renamed from: F */
    public boolean m6151F(int i2, int i3) {
        if (this.f6456u) {
            return m6147s(i2, i3, (int) this.f6448m.getXVelocity(this.f6439d), (int) this.f6448m.getYVelocity(this.f6439d));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ff  */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m6152G(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p024c.p062k.p063a.C0966c.m6152G(android.view.MotionEvent):boolean");
    }

    /* renamed from: H */
    public boolean m6153H(View view, int i2, int i3) {
        this.f6455t = view;
        this.f6439d = -1;
        boolean zM6147s = m6147s(i2, i3, 0, 0);
        if (!zM6147s && this.f6437b == 0 && this.f6455t != null) {
            this.f6455t = null;
        }
        return zM6147s;
    }

    /* renamed from: I */
    boolean m6154I(View view, int i2) {
        if (view == this.f6455t && this.f6439d == i2) {
            return true;
        }
        if (view == null || !this.f6454s.mo6176m(view, i2)) {
            return false;
        }
        this.f6439d = i2;
        m6156b(view, i2);
        return true;
    }

    /* renamed from: a */
    public void m6155a() {
        this.f6439d = -1;
        m6137g();
        VelocityTracker velocityTracker = this.f6448m;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f6448m = null;
        }
    }

    /* renamed from: b */
    public void m6156b(View view, int i2) {
        if (view.getParent() == this.f6457v) {
            this.f6455t = view;
            this.f6439d = i2;
            this.f6454s.mo6172i(view, i2);
            m6150E(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f6457v + ")");
    }

    /* renamed from: k */
    public boolean m6157k(boolean z) {
        if (this.f6437b == 2) {
            boolean zComputeScrollOffset = this.f6453r.computeScrollOffset();
            int currX = this.f6453r.getCurrX();
            int currY = this.f6453r.getCurrY();
            int left = currX - this.f6455t.getLeft();
            int top = currY - this.f6455t.getTop();
            if (left != 0) {
                C0311u.m2107T(this.f6455t, left);
            }
            if (top != 0) {
                C0311u.m2108U(this.f6455t, top);
            }
            if (left != 0 || top != 0) {
                this.f6454s.mo6174k(this.f6455t, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == this.f6453r.getFinalX() && currY == this.f6453r.getFinalY()) {
                this.f6453r.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                if (z) {
                    this.f6457v.post(this.f6458w);
                } else {
                    m6150E(0);
                }
            }
        }
        return this.f6437b == 2;
    }

    /* renamed from: r */
    public View m6158r(int i2, int i3) {
        for (int childCount = this.f6457v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f6457v.getChildAt(this.f6454s.m6166c(childCount));
            if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: u */
    public int m6159u() {
        return this.f6438c;
    }

    /* renamed from: v */
    public boolean m6160v(int i2, int i3) {
        return m6162y(this.f6455t, i2, i3);
    }

    /* renamed from: w */
    public boolean m6161w(int i2) {
        return ((1 << i2) & this.f6447l) != 0;
    }

    /* renamed from: y */
    public boolean m6162y(View view, int i2, int i3) {
        return view != null && i2 >= view.getLeft() && i2 < view.getRight() && i3 >= view.getTop() && i3 < view.getBottom();
    }

    /* renamed from: z */
    public void m6163z(MotionEvent motionEvent) {
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m6155a();
        }
        if (this.f6448m == null) {
            this.f6448m = VelocityTracker.obtain();
        }
        this.f6448m.addMovement(motionEvent);
        int i3 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewM6158r = m6158r((int) x, (int) y);
            m6131C(x, y, pointerId);
            m6154I(viewM6158r, pointerId);
            int i4 = this.f6444i[pointerId];
            int i5 = this.f6452q;
            if ((i4 & i5) != 0) {
                this.f6454s.m6171h(i4 & i5, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f6437b == 1) {
                m6129A();
            }
            m6155a();
            return;
        }
        if (actionMasked == 2) {
            if (this.f6437b == 1) {
                if (m6149x(this.f6439d)) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f6439d);
                    float x2 = motionEvent.getX(iFindPointerIndex);
                    float y2 = motionEvent.getY(iFindPointerIndex);
                    float[] fArr = this.f6442g;
                    int i6 = this.f6439d;
                    int i7 = (int) (x2 - fArr[i6]);
                    int i8 = (int) (y2 - this.f6443h[i6]);
                    m6145p(this.f6455t.getLeft() + i7, this.f6455t.getTop() + i8, i7, i8);
                    m6132D(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i3 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i3);
                if (m6149x(pointerId2)) {
                    float x3 = motionEvent.getX(i3);
                    float y3 = motionEvent.getY(i3);
                    float f2 = x3 - this.f6440e[pointerId2];
                    float f3 = y3 - this.f6441f[pointerId2];
                    m6130B(f2, f3, pointerId2);
                    if (this.f6437b != 1) {
                        View viewM6158r2 = m6158r((int) x3, (int) y3);
                        if (m6134d(viewM6158r2, f2, f3) && m6154I(viewM6158r2, pointerId2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i3++;
            }
            m6132D(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.f6437b == 1) {
                m6143n(0.0f, 0.0f);
            }
            m6155a();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x4 = motionEvent.getX(actionIndex);
            float y4 = motionEvent.getY(actionIndex);
            m6131C(x4, y4, pointerId3);
            if (this.f6437b != 0) {
                if (m6160v((int) x4, (int) y4)) {
                    m6154I(this.f6455t, pointerId3);
                    return;
                }
                return;
            } else {
                m6154I(m6158r((int) x4, (int) y4), pointerId3);
                int i9 = this.f6444i[pointerId3];
                int i10 = this.f6452q;
                if ((i9 & i10) != 0) {
                    this.f6454s.m6171h(i9 & i10, pointerId3);
                    return;
                }
                return;
            }
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f6437b == 1 && pointerId4 == this.f6439d) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i3 >= pointerCount2) {
                    i2 = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i3);
                if (pointerId5 != this.f6439d) {
                    View viewM6158r3 = m6158r((int) motionEvent.getX(i3), (int) motionEvent.getY(i3));
                    View view = this.f6455t;
                    if (viewM6158r3 == view && m6154I(view, pointerId5)) {
                        i2 = this.f6439d;
                        break;
                    }
                }
                i3++;
            }
            if (i2 == -1) {
                m6129A();
            }
        }
        m6138h(pointerId4);
    }
}
