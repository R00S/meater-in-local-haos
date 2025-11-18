package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0311u;

/* compiled from: HeaderBehavior.java */
/* renamed from: com.google.android.material.appbar.a */
/* loaded from: classes2.dex */
abstract class AbstractC7933a<V extends View> extends C7935c<V> {

    /* renamed from: d */
    private Runnable f29652d;

    /* renamed from: e */
    OverScroller f29653e;

    /* renamed from: f */
    private boolean f29654f;

    /* renamed from: g */
    private int f29655g;

    /* renamed from: h */
    private int f29656h;

    /* renamed from: i */
    private int f29657i;

    /* renamed from: j */
    private VelocityTracker f29658j;

    /* compiled from: HeaderBehavior.java */
    /* renamed from: com.google.android.material.appbar.a$a */
    private class a implements Runnable {

        /* renamed from: f */
        private final CoordinatorLayout f29659f;

        /* renamed from: g */
        private final V f29660g;

        a(CoordinatorLayout coordinatorLayout, V v) {
            this.f29659f = coordinatorLayout;
            this.f29660g = v;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f29660g == null || (overScroller = AbstractC7933a.this.f29653e) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                AbstractC7933a.this.mo23742N(this.f29659f, this.f29660g);
                return;
            }
            AbstractC7933a abstractC7933a = AbstractC7933a.this;
            abstractC7933a.m23791P(this.f29659f, this.f29660g, abstractC7933a.f29653e.getCurrY());
            C0311u.m2115a0(this.f29660g, this);
        }
    }

    public AbstractC7933a() {
        this.f29655g = -1;
        this.f29657i = -1;
    }

    /* renamed from: I */
    private void m23788I() {
        if (this.f29658j == null) {
            this.f29658j = VelocityTracker.obtain();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo1446D(androidx.coordinatorlayout.widget.CoordinatorLayout r12, V r13, android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r14.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L4e
            r4 = 2
            if (r0 == r4) goto L2d
            r12 = 3
            if (r0 == r12) goto L72
            r12 = 6
            if (r0 == r12) goto L13
            goto L4c
        L13:
            int r12 = r14.getActionIndex()
            if (r12 != 0) goto L1b
            r12 = 1
            goto L1c
        L1b:
            r12 = 0
        L1c:
            int r13 = r14.getPointerId(r12)
            r11.f29655g = r13
            float r12 = r14.getY(r12)
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r13
            int r12 = (int) r12
            r11.f29656h = r12
            goto L4c
        L2d:
            int r0 = r11.f29655g
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r1) goto L36
            return r3
        L36:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r1 = r11.f29656h
            int r7 = r1 - r0
            r11.f29656h = r0
            int r8 = r11.mo23739K(r13)
            r9 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            r4.m23790O(r5, r6, r7, r8, r9)
        L4c:
            r12 = 0
            goto L81
        L4e:
            android.view.VelocityTracker r0 = r11.f29658j
            if (r0 == 0) goto L72
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f29658j
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f29658j
            int r4 = r11.f29655g
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.mo23740L(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.m23789J(r6, r7, r8, r9, r10)
            r12 = 1
            goto L73
        L72:
            r12 = 0
        L73:
            r11.f29654f = r3
            r11.f29655g = r1
            android.view.VelocityTracker r13 = r11.f29658j
            if (r13 == 0) goto L81
            r13.recycle()
            r13 = 0
            r11.f29658j = r13
        L81:
            android.view.VelocityTracker r13 = r11.f29658j
            if (r13 == 0) goto L88
            r13.addMovement(r14)
        L88:
            boolean r13 = r11.f29654f
            if (r13 != 0) goto L90
            if (r12 == 0) goto L8f
            goto L90
        L8f:
            r2 = 0
        L90:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AbstractC7933a.mo1446D(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: H */
    abstract boolean mo23738H(V v);

    /* renamed from: J */
    final boolean m23789J(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, float f2) {
        Runnable runnable = this.f29652d;
        if (runnable != null) {
            v.removeCallbacks(runnable);
            this.f29652d = null;
        }
        if (this.f29653e == null) {
            this.f29653e = new OverScroller(v.getContext());
        }
        this.f29653e.fling(0, mo23760E(), 0, Math.round(f2), 0, 0, i2, i3);
        if (!this.f29653e.computeScrollOffset()) {
            mo23742N(coordinatorLayout, v);
            return false;
        }
        a aVar = new a(coordinatorLayout, v);
        this.f29652d = aVar;
        C0311u.m2115a0(v, aVar);
        return true;
    }

    /* renamed from: K */
    abstract int mo23739K(V v);

    /* renamed from: L */
    abstract int mo23740L(V v);

    /* renamed from: M */
    abstract int mo23741M();

    /* renamed from: N */
    abstract void mo23742N(CoordinatorLayout coordinatorLayout, V v);

    /* renamed from: O */
    final int m23790O(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4) {
        return mo23743Q(coordinatorLayout, v, mo23741M() - i2, i3, i4);
    }

    /* renamed from: P */
    int m23791P(CoordinatorLayout coordinatorLayout, V v, int i2) {
        return mo23743Q(coordinatorLayout, v, i2, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* renamed from: Q */
    abstract int mo23743Q(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    /* renamed from: k */
    public boolean mo1457k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f29657i < 0) {
            this.f29657i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f29654f) {
            int i2 = this.f29655g;
            if (i2 == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i2)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y - this.f29656h) > this.f29657i) {
                this.f29656h = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f29655g = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            boolean z = mo23738H(v) && coordinatorLayout.m1419B(v, x, y2);
            this.f29654f = z;
            if (z) {
                this.f29656h = y2;
                this.f29655g = motionEvent.getPointerId(0);
                m23788I();
                OverScroller overScroller = this.f29653e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f29653e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f29658j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public AbstractC7933a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29655g = -1;
        this.f29657i = -1;
    }
}
