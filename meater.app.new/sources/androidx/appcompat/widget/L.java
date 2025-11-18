package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* compiled from: ForwardingListener.java */
/* loaded from: classes.dex */
public abstract class L implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: B, reason: collision with root package name */
    private final float f21270B;

    /* renamed from: C, reason: collision with root package name */
    private final int f21271C;

    /* renamed from: D, reason: collision with root package name */
    private final int f21272D;

    /* renamed from: E, reason: collision with root package name */
    final View f21273E;

    /* renamed from: F, reason: collision with root package name */
    private Runnable f21274F;

    /* renamed from: G, reason: collision with root package name */
    private Runnable f21275G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f21276H;

    /* renamed from: I, reason: collision with root package name */
    private int f21277I;

    /* renamed from: J, reason: collision with root package name */
    private final int[] f21278J = new int[2];

    /* compiled from: ForwardingListener.java */
    private class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = L.this.f21273E.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* compiled from: ForwardingListener.java */
    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            L.this.e();
        }
    }

    public L(View view) {
        this.f21273E = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f21270B = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f21271C = tapTimeout;
        this.f21272D = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private void a() {
        Runnable runnable = this.f21275G;
        if (runnable != null) {
            this.f21273E.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f21274F;
        if (runnable2 != null) {
            this.f21273E.removeCallbacks(runnable2);
        }
    }

    private boolean f(MotionEvent motionEvent) throws IllegalAccessException, IllegalArgumentException {
        J j10;
        View view = this.f21273E;
        n.e eVarB = b();
        if (eVarB == null || !eVarB.a() || (j10 = (J) eVarB.l()) == null || !j10.isShown()) {
            return false;
        }
        MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        i(view, motionEventObtainNoHistory);
        j(j10, motionEventObtainNoHistory);
        boolean zE = j10.e(motionEventObtainNoHistory, this.f21277I);
        motionEventObtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return zE && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f21273E
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.f21277I
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f21270B
            boolean r6 = h(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.a()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.f21277I = r6
            java.lang.Runnable r6 = r5.f21274F
            if (r6 != 0) goto L52
            androidx.appcompat.widget.L$a r6 = new androidx.appcompat.widget.L$a
            r6.<init>()
            r5.f21274F = r6
        L52:
            java.lang.Runnable r6 = r5.f21274F
            int r1 = r5.f21271C
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f21275G
            if (r6 != 0) goto L65
            androidx.appcompat.widget.L$b r6 = new androidx.appcompat.widget.L$b
            r6.<init>()
            r5.f21275G = r6
        L65:
            java.lang.Runnable r6 = r5.f21275G
            int r1 = r5.f21272D
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.L.g(android.view.MotionEvent):boolean");
    }

    private static boolean h(View view, float f10, float f11, float f12) {
        float f13 = -f12;
        return f10 >= f13 && f11 >= f13 && f10 < ((float) (view.getRight() - view.getLeft())) + f12 && f11 < ((float) (view.getBottom() - view.getTop())) + f12;
    }

    private boolean i(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f21278J);
        motionEvent.offsetLocation(r0[0], r0[1]);
        return true;
    }

    private boolean j(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f21278J);
        motionEvent.offsetLocation(-r0[0], -r0[1]);
        return true;
    }

    public abstract n.e b();

    protected abstract boolean c();

    protected boolean d() {
        n.e eVarB = b();
        if (eVarB == null || !eVarB.a()) {
            return true;
        }
        eVarB.dismiss();
        return true;
    }

    void e() {
        a();
        View view = this.f21273E;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.f21276H = true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        boolean z11 = this.f21276H;
        if (z11) {
            z10 = f(motionEvent) || !d();
        } else {
            z10 = g(motionEvent) && c();
            if (z10) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f21273E.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f21276H = z10;
        return z10 || z11;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f21276H = false;
        this.f21277I = -1;
        Runnable runnable = this.f21274F;
        if (runnable != null) {
            this.f21273E.removeCallbacks(runnable);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }
}
