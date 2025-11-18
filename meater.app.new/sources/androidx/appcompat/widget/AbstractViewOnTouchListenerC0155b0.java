package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.appcompat.view.menu.InterfaceC0096p;

/* compiled from: ForwardingListener.java */
/* renamed from: androidx.appcompat.widget.b0 */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0155b0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: f */
    private final float f1033f;

    /* renamed from: g */
    private final int f1034g;

    /* renamed from: h */
    private final int f1035h;

    /* renamed from: i */
    final View f1036i;

    /* renamed from: j */
    private Runnable f1037j;

    /* renamed from: k */
    private Runnable f1038k;

    /* renamed from: l */
    private boolean f1039l;

    /* renamed from: m */
    private int f1040m;

    /* renamed from: n */
    private final int[] f1041n = new int[2];

    /* compiled from: ForwardingListener.java */
    /* renamed from: androidx.appcompat.widget.b0$a */
    private class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = AbstractViewOnTouchListenerC0155b0.this.f1036i.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* compiled from: ForwardingListener.java */
    /* renamed from: androidx.appcompat.widget.b0$b */
    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractViewOnTouchListenerC0155b0.this.m897e();
        }
    }

    public AbstractViewOnTouchListenerC0155b0(View view) {
        this.f1036i = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1033f = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1034g = tapTimeout;
        this.f1035h = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* renamed from: a */
    private void m891a() {
        Runnable runnable = this.f1038k;
        if (runnable != null) {
            this.f1036i.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1037j;
        if (runnable2 != null) {
            this.f1036i.removeCallbacks(runnable2);
        }
    }

    /* renamed from: f */
    private boolean m892f(MotionEvent motionEvent) throws IllegalAccessException, IllegalArgumentException {
        C0201z c0201z;
        View view = this.f1036i;
        InterfaceC0096p interfaceC0096pMo474b = mo474b();
        if (interfaceC0096pMo474b == null || !interfaceC0096pMo474b.mo519a() || (c0201z = (C0201z) interfaceC0096pMo474b.mo522j()) == null || !c0201z.isShown()) {
            return false;
        }
        MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        m895i(view, motionEventObtainNoHistory);
        m896j(c0201z, motionEventObtainNoHistory);
        boolean zMo965e = c0201z.mo965e(motionEventObtainNoHistory, this.f1040m);
        motionEventObtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return zMo965e && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m893g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f1036i
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
            int r1 = r5.f1040m
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f1033f
            boolean r6 = m894h(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.m891a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.m891a()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.f1040m = r6
            java.lang.Runnable r6 = r5.f1037j
            if (r6 != 0) goto L52
            androidx.appcompat.widget.b0$a r6 = new androidx.appcompat.widget.b0$a
            r6.<init>()
            r5.f1037j = r6
        L52:
            java.lang.Runnable r6 = r5.f1037j
            int r1 = r5.f1034g
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f1038k
            if (r6 != 0) goto L65
            androidx.appcompat.widget.b0$b r6 = new androidx.appcompat.widget.b0$b
            r6.<init>()
            r5.f1038k = r6
        L65:
            java.lang.Runnable r6 = r5.f1038k
            int r1 = r5.f1035h
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AbstractViewOnTouchListenerC0155b0.m893g(android.view.MotionEvent):boolean");
    }

    /* renamed from: h */
    private static boolean m894h(View view, float f2, float f3, float f4) {
        float f5 = -f4;
        return f2 >= f5 && f3 >= f5 && f2 < ((float) (view.getRight() - view.getLeft())) + f4 && f3 < ((float) (view.getBottom() - view.getTop())) + f4;
    }

    /* renamed from: i */
    private boolean m895i(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f1041n);
        motionEvent.offsetLocation(r0[0], r0[1]);
        return true;
    }

    /* renamed from: j */
    private boolean m896j(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f1041n);
        motionEvent.offsetLocation(-r0[0], -r0[1]);
        return true;
    }

    /* renamed from: b */
    public abstract InterfaceC0096p mo474b();

    /* renamed from: c */
    protected abstract boolean mo475c();

    /* renamed from: d */
    protected boolean mo726d() {
        InterfaceC0096p interfaceC0096pMo474b = mo474b();
        if (interfaceC0096pMo474b == null || !interfaceC0096pMo474b.mo519a()) {
            return true;
        }
        interfaceC0096pMo474b.dismiss();
        return true;
    }

    /* renamed from: e */
    void m897e() {
        m891a();
        View view = this.f1036i;
        if (view.isEnabled() && !view.isLongClickable() && mo475c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.f1039l = true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f1039l;
        if (z2) {
            z = m892f(motionEvent) || !mo726d();
        } else {
            z = m893g(motionEvent) && mo475c();
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f1036i.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f1039l = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f1039l = false;
        this.f1040m = -1;
        Runnable runnable = this.f1037j;
        if (runnable != null) {
            this.f1036i.removeCallbacks(runnable);
        }
    }
}
