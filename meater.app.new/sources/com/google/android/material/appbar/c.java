package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import m1.C3946a;
import s1.X;

/* compiled from: HeaderBehavior.java */
/* loaded from: classes2.dex */
abstract class c<V extends View> extends e<V> {

    /* renamed from: E, reason: collision with root package name */
    private Runnable f35885E;

    /* renamed from: F, reason: collision with root package name */
    OverScroller f35886F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f35887G;

    /* renamed from: H, reason: collision with root package name */
    private int f35888H;

    /* renamed from: I, reason: collision with root package name */
    private int f35889I;

    /* renamed from: J, reason: collision with root package name */
    private int f35890J;

    /* renamed from: K, reason: collision with root package name */
    private VelocityTracker f35891K;

    /* compiled from: HeaderBehavior.java */
    private class a implements Runnable {

        /* renamed from: B, reason: collision with root package name */
        private final CoordinatorLayout f35892B;

        /* renamed from: C, reason: collision with root package name */
        private final V f35893C;

        a(CoordinatorLayout coordinatorLayout, V v10) {
            this.f35892B = coordinatorLayout;
            this.f35893C = v10;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f35893C == null || (overScroller = c.this.f35886F) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                c.this.R(this.f35892B, this.f35893C);
                return;
            }
            c cVar = c.this;
            cVar.T(this.f35892B, this.f35893C, cVar.f35886F.getCurrY());
            X.f0(this.f35893C, this);
        }
    }

    public c() {
        this.f35888H = -1;
        this.f35890J = -1;
    }

    private void M() {
        if (this.f35891K == null) {
            this.f35891K = VelocityTracker.obtain();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean H(androidx.coordinatorlayout.widget.CoordinatorLayout r12, V r13, android.view.MotionEvent r14) {
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
            r12 = r2
            goto L1c
        L1b:
            r12 = r3
        L1c:
            int r13 = r14.getPointerId(r12)
            r11.f35888H = r13
            float r12 = r14.getY(r12)
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r13
            int r12 = (int) r12
            r11.f35889I = r12
            goto L4c
        L2d:
            int r0 = r11.f35888H
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r1) goto L36
            return r3
        L36:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r1 = r11.f35889I
            int r7 = r1 - r0
            r11.f35889I = r0
            int r8 = r11.O(r13)
            r9 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            r4.S(r5, r6, r7, r8, r9)
        L4c:
            r12 = r3
            goto L81
        L4e:
            android.view.VelocityTracker r0 = r11.f35891K
            if (r0 == 0) goto L72
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f35891K
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f35891K
            int r4 = r11.f35888H
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.P(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.N(r6, r7, r8, r9, r10)
            r12 = r2
            goto L73
        L72:
            r12 = r3
        L73:
            r11.f35887G = r3
            r11.f35888H = r1
            android.view.VelocityTracker r13 = r11.f35891K
            if (r13 == 0) goto L81
            r13.recycle()
            r13 = 0
            r11.f35891K = r13
        L81:
            android.view.VelocityTracker r13 = r11.f35891K
            if (r13 == 0) goto L88
            r13.addMovement(r14)
        L88:
            boolean r13 = r11.f35887G
            if (r13 != 0) goto L90
            if (r12 == 0) goto L8f
            goto L90
        L8f:
            r2 = r3
        L90:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.c.H(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    boolean L(V v10) {
        return false;
    }

    final boolean N(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, float f10) {
        Runnable runnable = this.f35885E;
        if (runnable != null) {
            v10.removeCallbacks(runnable);
            this.f35885E = null;
        }
        if (this.f35886F == null) {
            this.f35886F = new OverScroller(v10.getContext());
        }
        this.f35886F.fling(0, I(), 0, Math.round(f10), 0, 0, i10, i11);
        if (!this.f35886F.computeScrollOffset()) {
            R(coordinatorLayout, v10);
            return false;
        }
        a aVar = new a(coordinatorLayout, v10);
        this.f35885E = aVar;
        X.f0(v10, aVar);
        return true;
    }

    int O(V v10) {
        return -v10.getHeight();
    }

    int P(V v10) {
        return v10.getHeight();
    }

    int Q() {
        return I();
    }

    final int S(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12) {
        return U(coordinatorLayout, v10, Q() - i10, i11, i12);
    }

    int T(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        return U(coordinatorLayout, v10, i10, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    int U(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12) {
        int iB;
        int I10 = I();
        if (i11 == 0 || I10 < i11 || I10 > i12 || I10 == (iB = C3946a.b(i10, i11, i12))) {
            return 0;
        }
        K(iB);
        return I10 - iB;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f35890J < 0) {
            this.f35890J = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f35887G) {
            int i10 = this.f35888H;
            if (i10 == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i10)) == -1) {
                return false;
            }
            int y10 = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y10 - this.f35889I) > this.f35890J) {
                this.f35889I = y10;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f35888H = -1;
            int x10 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            boolean z10 = L(v10) && coordinatorLayout.B(v10, x10, y11);
            this.f35887G = z10;
            if (z10) {
                this.f35889I = y11;
                this.f35888H = motionEvent.getPointerId(0);
                M();
                OverScroller overScroller = this.f35886F;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f35886F.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f35891K;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35888H = -1;
        this.f35890J = -1;
    }

    void R(CoordinatorLayout coordinatorLayout, V v10) {
    }
}
