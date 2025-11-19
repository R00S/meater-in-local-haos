package z1;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import s1.X;

/* compiled from: ViewDragHelper.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: x, reason: collision with root package name */
    private static final Interpolator f53351x = new a();

    /* renamed from: a, reason: collision with root package name */
    private int f53352a;

    /* renamed from: b, reason: collision with root package name */
    private int f53353b;

    /* renamed from: d, reason: collision with root package name */
    private float[] f53355d;

    /* renamed from: e, reason: collision with root package name */
    private float[] f53356e;

    /* renamed from: f, reason: collision with root package name */
    private float[] f53357f;

    /* renamed from: g, reason: collision with root package name */
    private float[] f53358g;

    /* renamed from: h, reason: collision with root package name */
    private int[] f53359h;

    /* renamed from: i, reason: collision with root package name */
    private int[] f53360i;

    /* renamed from: j, reason: collision with root package name */
    private int[] f53361j;

    /* renamed from: k, reason: collision with root package name */
    private int f53362k;

    /* renamed from: l, reason: collision with root package name */
    private VelocityTracker f53363l;

    /* renamed from: m, reason: collision with root package name */
    private float f53364m;

    /* renamed from: n, reason: collision with root package name */
    private float f53365n;

    /* renamed from: o, reason: collision with root package name */
    private int f53366o;

    /* renamed from: p, reason: collision with root package name */
    private final int f53367p;

    /* renamed from: q, reason: collision with root package name */
    private int f53368q;

    /* renamed from: r, reason: collision with root package name */
    private OverScroller f53369r;

    /* renamed from: s, reason: collision with root package name */
    private final c f53370s;

    /* renamed from: t, reason: collision with root package name */
    private View f53371t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f53372u;

    /* renamed from: v, reason: collision with root package name */
    private final ViewGroup f53373v;

    /* renamed from: c, reason: collision with root package name */
    private int f53354c = -1;

    /* renamed from: w, reason: collision with root package name */
    private final Runnable f53374w = new b();

    /* compiled from: ViewDragHelper.java */
    class a implements Interpolator {
        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* compiled from: ViewDragHelper.java */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.F(0);
        }
    }

    private d(Context context, ViewGroup viewGroup, c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (cVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f53373v = viewGroup;
        this.f53370s = cVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i10 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f53367p = i10;
        this.f53366o = i10;
        this.f53353b = viewConfiguration.getScaledTouchSlop();
        this.f53364m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f53365n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f53369r = new OverScroller(context, f53351x);
    }

    private void B() {
        this.f53363l.computeCurrentVelocity(1000, this.f53364m);
        o(f(this.f53363l.getXVelocity(this.f53354c), this.f53365n, this.f53364m), f(this.f53363l.getYVelocity(this.f53354c), this.f53365n, this.f53364m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v3, types: [z1.d$c] */
    private void C(float f10, float f11, int i10) {
        boolean zD = d(f10, f11, i10, 1);
        boolean z10 = zD;
        if (d(f11, f10, i10, 4)) {
            z10 = (zD ? 1 : 0) | 4;
        }
        boolean z11 = z10;
        if (d(f10, f11, i10, 2)) {
            z11 = (z10 ? 1 : 0) | 2;
        }
        ?? r02 = z11;
        if (d(f11, f10, i10, 8)) {
            r02 = (z11 ? 1 : 0) | 8;
        }
        if (r02 != 0) {
            int[] iArr = this.f53360i;
            iArr[i10] = iArr[i10] | r02;
            this.f53370s.f(r02, i10);
        }
    }

    private void D(float f10, float f11, int i10) {
        r(i10);
        float[] fArr = this.f53355d;
        this.f53357f[i10] = f10;
        fArr[i10] = f10;
        float[] fArr2 = this.f53356e;
        this.f53358g[i10] = f11;
        fArr2[i10] = f11;
        this.f53359h[i10] = u((int) f10, (int) f11);
        this.f53362k |= 1 << i10;
    }

    private void E(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (y(pointerId)) {
                float x10 = motionEvent.getX(i10);
                float y10 = motionEvent.getY(i10);
                this.f53357f[pointerId] = x10;
                this.f53358g[pointerId] = y10;
            }
        }
    }

    private boolean d(float f10, float f11, int i10, int i11) {
        float fAbs = Math.abs(f10);
        float fAbs2 = Math.abs(f11);
        if ((this.f53359h[i10] & i11) != i11 || (this.f53368q & i11) == 0 || (this.f53361j[i10] & i11) == i11 || (this.f53360i[i10] & i11) == i11) {
            return false;
        }
        int i12 = this.f53353b;
        if (fAbs <= i12 && fAbs2 <= i12) {
            return false;
        }
        if (fAbs >= fAbs2 * 0.5f || !this.f53370s.g(i11)) {
            return (this.f53360i[i10] & i11) == 0 && fAbs > ((float) this.f53353b);
        }
        int[] iArr = this.f53361j;
        iArr[i10] = iArr[i10] | i11;
        return false;
    }

    private boolean e(View view, float f10, float f11) {
        if (view == null) {
            return false;
        }
        boolean z10 = this.f53370s.d(view) > 0;
        boolean z11 = this.f53370s.e(view) > 0;
        if (!z10 || !z11) {
            return z10 ? Math.abs(f10) > ((float) this.f53353b) : z11 && Math.abs(f11) > ((float) this.f53353b);
        }
        float f12 = (f10 * f10) + (f11 * f11);
        int i10 = this.f53353b;
        return f12 > ((float) (i10 * i10));
    }

    private float f(float f10, float f11, float f12) {
        float fAbs = Math.abs(f10);
        if (fAbs < f11) {
            return 0.0f;
        }
        return fAbs > f12 ? f10 > 0.0f ? f12 : -f12 : f10;
    }

    private int g(int i10, int i11, int i12) {
        int iAbs = Math.abs(i10);
        if (iAbs < i11) {
            return 0;
        }
        return iAbs > i12 ? i10 > 0 ? i12 : -i12 : i10;
    }

    private void h() {
        float[] fArr = this.f53355d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f53356e, 0.0f);
        Arrays.fill(this.f53357f, 0.0f);
        Arrays.fill(this.f53358g, 0.0f);
        Arrays.fill(this.f53359h, 0);
        Arrays.fill(this.f53360i, 0);
        Arrays.fill(this.f53361j, 0);
        this.f53362k = 0;
    }

    private void i(int i10) {
        if (this.f53355d == null || !x(i10)) {
            return;
        }
        this.f53355d[i10] = 0.0f;
        this.f53356e[i10] = 0.0f;
        this.f53357f[i10] = 0.0f;
        this.f53358g[i10] = 0.0f;
        this.f53359h[i10] = 0;
        this.f53360i[i10] = 0;
        this.f53361j[i10] = 0;
        this.f53362k = (~(1 << i10)) & this.f53362k;
    }

    private int j(int i10, int i11, int i12) {
        if (i10 == 0) {
            return 0;
        }
        int width = this.f53373v.getWidth();
        float f10 = width / 2;
        float fP = f10 + (p(Math.min(1.0f, Math.abs(i10) / width)) * f10);
        int iAbs = Math.abs(i11);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fP / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i10) / i12) + 1.0f) * 256.0f), 600);
    }

    private int k(View view, int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float f12;
        float f13;
        int iG = g(i12, (int) this.f53365n, (int) this.f53364m);
        int iG2 = g(i13, (int) this.f53365n, (int) this.f53364m);
        int iAbs = Math.abs(i10);
        int iAbs2 = Math.abs(i11);
        int iAbs3 = Math.abs(iG);
        int iAbs4 = Math.abs(iG2);
        int i14 = iAbs3 + iAbs4;
        int i15 = iAbs + iAbs2;
        if (iG != 0) {
            f10 = iAbs3;
            f11 = i14;
        } else {
            f10 = iAbs;
            f11 = i15;
        }
        float f14 = f10 / f11;
        if (iG2 != 0) {
            f12 = iAbs4;
            f13 = i14;
        } else {
            f12 = iAbs2;
            f13 = i15;
        }
        return (int) ((j(i10, iG, this.f53370s.d(view)) * f14) + (j(i11, iG2, this.f53370s.e(view)) * (f12 / f13)));
    }

    public static d m(ViewGroup viewGroup, float f10, c cVar) {
        d dVarN = n(viewGroup, cVar);
        dVarN.f53353b = (int) (dVarN.f53353b * (1.0f / f10));
        return dVarN;
    }

    public static d n(ViewGroup viewGroup, c cVar) {
        return new d(viewGroup.getContext(), viewGroup, cVar);
    }

    private void o(float f10, float f11) {
        this.f53372u = true;
        this.f53370s.l(this.f53371t, f10, f11);
        this.f53372u = false;
        if (this.f53352a == 1) {
            F(0);
        }
    }

    private float p(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    private void q(int i10, int i11, int i12, int i13) {
        int left = this.f53371t.getLeft();
        int top = this.f53371t.getTop();
        if (i12 != 0) {
            i10 = this.f53370s.a(this.f53371t, i10, i12);
            X.X(this.f53371t, i10 - left);
        }
        int i14 = i10;
        if (i13 != 0) {
            i11 = this.f53370s.b(this.f53371t, i11, i13);
            X.Y(this.f53371t, i11 - top);
        }
        int i15 = i11;
        if (i12 == 0 && i13 == 0) {
            return;
        }
        this.f53370s.k(this.f53371t, i14, i15, i14 - left, i15 - top);
    }

    private void r(int i10) {
        float[] fArr = this.f53355d;
        if (fArr == null || fArr.length <= i10) {
            int i11 = i10 + 1;
            float[] fArr2 = new float[i11];
            float[] fArr3 = new float[i11];
            float[] fArr4 = new float[i11];
            float[] fArr5 = new float[i11];
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f53356e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f53357f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f53358g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f53359h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f53360i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f53361j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f53355d = fArr2;
            this.f53356e = fArr3;
            this.f53357f = fArr4;
            this.f53358g = fArr5;
            this.f53359h = iArr;
            this.f53360i = iArr2;
            this.f53361j = iArr3;
        }
    }

    private boolean t(int i10, int i11, int i12, int i13) {
        int left = this.f53371t.getLeft();
        int top = this.f53371t.getTop();
        int i14 = i10 - left;
        int i15 = i11 - top;
        if (i14 == 0 && i15 == 0) {
            this.f53369r.abortAnimation();
            F(0);
            return false;
        }
        this.f53369r.startScroll(left, top, i14, i15, k(this.f53371t, i14, i15, i12, i13));
        F(2);
        return true;
    }

    private int u(int i10, int i11) {
        int i12 = i10 < this.f53373v.getLeft() + this.f53366o ? 1 : 0;
        if (i11 < this.f53373v.getTop() + this.f53366o) {
            i12 |= 4;
        }
        if (i10 > this.f53373v.getRight() - this.f53366o) {
            i12 |= 2;
        }
        return i11 > this.f53373v.getBottom() - this.f53366o ? i12 | 8 : i12;
    }

    private boolean y(int i10) {
        if (x(i10)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i10 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public void A(MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            b();
        }
        if (this.f53363l == null) {
            this.f53363l = VelocityTracker.obtain();
        }
        this.f53363l.addMovement(motionEvent);
        int i11 = 0;
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewS = s((int) x10, (int) y10);
            D(x10, y10, pointerId);
            J(viewS, pointerId);
            int i12 = this.f53359h[pointerId];
            int i13 = this.f53368q;
            if ((i12 & i13) != 0) {
                this.f53370s.h(i12 & i13, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f53352a == 1) {
                B();
            }
            b();
            return;
        }
        if (actionMasked == 2) {
            if (this.f53352a == 1) {
                if (y(this.f53354c)) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f53354c);
                    float x11 = motionEvent.getX(iFindPointerIndex);
                    float y11 = motionEvent.getY(iFindPointerIndex);
                    float[] fArr = this.f53357f;
                    int i14 = this.f53354c;
                    int i15 = (int) (x11 - fArr[i14]);
                    int i16 = (int) (y11 - this.f53358g[i14]);
                    q(this.f53371t.getLeft() + i15, this.f53371t.getTop() + i16, i15, i16);
                    E(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i11 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i11);
                if (y(pointerId2)) {
                    float x12 = motionEvent.getX(i11);
                    float y12 = motionEvent.getY(i11);
                    float f10 = x12 - this.f53355d[pointerId2];
                    float f11 = y12 - this.f53356e[pointerId2];
                    C(f10, f11, pointerId2);
                    if (this.f53352a != 1) {
                        View viewS2 = s((int) x12, (int) y12);
                        if (e(viewS2, f10, f11) && J(viewS2, pointerId2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i11++;
            }
            E(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.f53352a == 1) {
                o(0.0f, 0.0f);
            }
            b();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x13 = motionEvent.getX(actionIndex);
            float y13 = motionEvent.getY(actionIndex);
            D(x13, y13, pointerId3);
            if (this.f53352a != 0) {
                if (w((int) x13, (int) y13)) {
                    J(this.f53371t, pointerId3);
                    return;
                }
                return;
            } else {
                J(s((int) x13, (int) y13), pointerId3);
                int i17 = this.f53359h[pointerId3];
                int i18 = this.f53368q;
                if ((i17 & i18) != 0) {
                    this.f53370s.h(i17 & i18, pointerId3);
                    return;
                }
                return;
            }
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f53352a == 1 && pointerId4 == this.f53354c) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i11 >= pointerCount2) {
                    i10 = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i11);
                if (pointerId5 != this.f53354c) {
                    View viewS3 = s((int) motionEvent.getX(i11), (int) motionEvent.getY(i11));
                    View view = this.f53371t;
                    if (viewS3 == view && J(view, pointerId5)) {
                        i10 = this.f53354c;
                        break;
                    }
                }
                i11++;
            }
            if (i10 == -1) {
                B();
            }
        }
        i(pointerId4);
    }

    void F(int i10) {
        this.f53373v.removeCallbacks(this.f53374w);
        if (this.f53352a != i10) {
            this.f53352a = i10;
            this.f53370s.j(i10);
            if (this.f53352a == 0) {
                this.f53371t = null;
            }
        }
    }

    public boolean G(int i10, int i11) {
        if (this.f53372u) {
            return t(i10, i11, (int) this.f53363l.getXVelocity(this.f53354c), (int) this.f53363l.getYVelocity(this.f53354c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean H(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.d.H(android.view.MotionEvent):boolean");
    }

    public boolean I(View view, int i10, int i11) {
        this.f53371t = view;
        this.f53354c = -1;
        boolean zT = t(i10, i11, 0, 0);
        if (!zT && this.f53352a == 0 && this.f53371t != null) {
            this.f53371t = null;
        }
        return zT;
    }

    boolean J(View view, int i10) {
        if (view == this.f53371t && this.f53354c == i10) {
            return true;
        }
        if (view == null || !this.f53370s.m(view, i10)) {
            return false;
        }
        this.f53354c = i10;
        c(view, i10);
        return true;
    }

    public void a() {
        b();
        if (this.f53352a == 2) {
            int currX = this.f53369r.getCurrX();
            int currY = this.f53369r.getCurrY();
            this.f53369r.abortAnimation();
            int currX2 = this.f53369r.getCurrX();
            int currY2 = this.f53369r.getCurrY();
            this.f53370s.k(this.f53371t, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        F(0);
    }

    public void b() {
        this.f53354c = -1;
        h();
        VelocityTracker velocityTracker = this.f53363l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f53363l = null;
        }
    }

    public void c(View view, int i10) {
        if (view.getParent() == this.f53373v) {
            this.f53371t = view;
            this.f53354c = i10;
            this.f53370s.i(view, i10);
            F(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f53373v + ")");
    }

    public boolean l(boolean z10) {
        if (this.f53352a == 2) {
            boolean zComputeScrollOffset = this.f53369r.computeScrollOffset();
            int currX = this.f53369r.getCurrX();
            int currY = this.f53369r.getCurrY();
            int left = currX - this.f53371t.getLeft();
            int top = currY - this.f53371t.getTop();
            if (left != 0) {
                X.X(this.f53371t, left);
            }
            if (top != 0) {
                X.Y(this.f53371t, top);
            }
            if (left != 0 || top != 0) {
                this.f53370s.k(this.f53371t, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == this.f53369r.getFinalX() && currY == this.f53369r.getFinalY()) {
                this.f53369r.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                if (z10) {
                    this.f53373v.post(this.f53374w);
                } else {
                    F(0);
                }
            }
        }
        return this.f53352a == 2;
    }

    public View s(int i10, int i11) {
        for (int childCount = this.f53373v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f53373v.getChildAt(this.f53370s.c(childCount));
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public int v() {
        return this.f53353b;
    }

    public boolean w(int i10, int i11) {
        return z(this.f53371t, i10, i11);
    }

    public boolean x(int i10) {
        return ((1 << i10) & this.f53362k) != 0;
    }

    public boolean z(View view, int i10, int i11) {
        return view != null && i10 >= view.getLeft() && i10 < view.getRight() && i11 >= view.getTop() && i11 < view.getBottom();
    }

    /* compiled from: ViewDragHelper.java */
    public static abstract class c {
        public abstract int a(View view, int i10, int i11);

        public int b(View view, int i10, int i11) {
            return 0;
        }

        public int d(View view) {
            return 0;
        }

        public int e(View view) {
            return 0;
        }

        public boolean g(int i10) {
            return false;
        }

        public abstract void k(View view, int i10, int i11, int i12, int i13);

        public abstract void l(View view, float f10, float f11);

        public abstract boolean m(View view, int i10);

        public int c(int i10) {
            return i10;
        }

        public void j(int i10) {
        }

        public void f(int i10, int i11) {
        }

        public void h(int i10, int i11) {
        }

        public void i(View view, int i10) {
        }
    }
}
