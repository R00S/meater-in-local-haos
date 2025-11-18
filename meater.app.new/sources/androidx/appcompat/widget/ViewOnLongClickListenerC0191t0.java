package androidx.appcompat.widget;

import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.C0311u;
import androidx.core.view.C0312v;

/* compiled from: TooltipCompatHandler.java */
/* renamed from: androidx.appcompat.widget.t0 */
/* loaded from: classes.dex */
class ViewOnLongClickListenerC0191t0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: f */
    private static ViewOnLongClickListenerC0191t0 f1287f;

    /* renamed from: g */
    private static ViewOnLongClickListenerC0191t0 f1288g;

    /* renamed from: h */
    private final View f1289h;

    /* renamed from: i */
    private final CharSequence f1290i;

    /* renamed from: j */
    private final int f1291j;

    /* renamed from: k */
    private final Runnable f1292k = new a();

    /* renamed from: l */
    private final Runnable f1293l = new b();

    /* renamed from: m */
    private int f1294m;

    /* renamed from: n */
    private int f1295n;

    /* renamed from: o */
    private C0193u0 f1296o;

    /* renamed from: p */
    private boolean f1297p;

    /* compiled from: TooltipCompatHandler.java */
    /* renamed from: androidx.appcompat.widget.t0$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() throws Resources.NotFoundException {
            ViewOnLongClickListenerC0191t0.this.m1188g(false);
        }
    }

    /* compiled from: TooltipCompatHandler.java */
    /* renamed from: androidx.appcompat.widget.t0$b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewOnLongClickListenerC0191t0.this.m1187c();
        }
    }

    private ViewOnLongClickListenerC0191t0(View view, CharSequence charSequence) {
        this.f1289h = view;
        this.f1290i = charSequence;
        this.f1291j = C0312v.m2204c(ViewConfiguration.get(view.getContext()));
        m1182b();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* renamed from: a */
    private void m1181a() {
        this.f1289h.removeCallbacks(this.f1292k);
    }

    /* renamed from: b */
    private void m1182b() {
        this.f1294m = Integer.MAX_VALUE;
        this.f1295n = Integer.MAX_VALUE;
    }

    /* renamed from: d */
    private void m1183d() {
        this.f1289h.postDelayed(this.f1292k, ViewConfiguration.getLongPressTimeout());
    }

    /* renamed from: e */
    private static void m1184e(ViewOnLongClickListenerC0191t0 viewOnLongClickListenerC0191t0) {
        ViewOnLongClickListenerC0191t0 viewOnLongClickListenerC0191t02 = f1287f;
        if (viewOnLongClickListenerC0191t02 != null) {
            viewOnLongClickListenerC0191t02.m1181a();
        }
        f1287f = viewOnLongClickListenerC0191t0;
        if (viewOnLongClickListenerC0191t0 != null) {
            viewOnLongClickListenerC0191t0.m1183d();
        }
    }

    /* renamed from: f */
    public static void m1185f(View view, CharSequence charSequence) {
        ViewOnLongClickListenerC0191t0 viewOnLongClickListenerC0191t0 = f1287f;
        if (viewOnLongClickListenerC0191t0 != null && viewOnLongClickListenerC0191t0.f1289h == view) {
            m1184e(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new ViewOnLongClickListenerC0191t0(view, charSequence);
            return;
        }
        ViewOnLongClickListenerC0191t0 viewOnLongClickListenerC0191t02 = f1288g;
        if (viewOnLongClickListenerC0191t02 != null && viewOnLongClickListenerC0191t02.f1289h == view) {
            viewOnLongClickListenerC0191t02.m1187c();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    /* renamed from: h */
    private boolean m1186h(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.f1294m) <= this.f1291j && Math.abs(y - this.f1295n) <= this.f1291j) {
            return false;
        }
        this.f1294m = x;
        this.f1295n = y;
        return true;
    }

    /* renamed from: c */
    void m1187c() {
        if (f1288g == this) {
            f1288g = null;
            C0193u0 c0193u0 = this.f1296o;
            if (c0193u0 != null) {
                c0193u0.m1224c();
                this.f1296o = null;
                m1182b();
                this.f1289h.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1287f == this) {
            m1184e(null);
        }
        this.f1289h.removeCallbacks(this.f1293l);
    }

    /* renamed from: g */
    void m1188g(boolean z) throws Resources.NotFoundException {
        long j2;
        int longPressTimeout;
        long j3;
        if (C0311u.m2101N(this.f1289h)) {
            m1184e(null);
            ViewOnLongClickListenerC0191t0 viewOnLongClickListenerC0191t0 = f1288g;
            if (viewOnLongClickListenerC0191t0 != null) {
                viewOnLongClickListenerC0191t0.m1187c();
            }
            f1288g = this;
            this.f1297p = z;
            C0193u0 c0193u0 = new C0193u0(this.f1289h.getContext());
            this.f1296o = c0193u0;
            c0193u0.m1226e(this.f1289h, this.f1294m, this.f1295n, this.f1297p, this.f1290i);
            this.f1289h.addOnAttachStateChangeListener(this);
            if (this.f1297p) {
                j3 = 2500;
            } else {
                if ((C0311u.m2095H(this.f1289h) & 1) == 1) {
                    j2 = 3000;
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                } else {
                    j2 = 15000;
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                }
                j3 = j2 - longPressTimeout;
            }
            this.f1289h.removeCallbacks(this.f1293l);
            this.f1289h.postDelayed(this.f1293l, j3);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1296o != null && this.f1297p) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1289h.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m1182b();
                m1187c();
            }
        } else if (this.f1289h.isEnabled() && this.f1296o == null && m1186h(motionEvent)) {
            m1184e(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) throws Resources.NotFoundException {
        this.f1294m = view.getWidth() / 2;
        this.f1295n = view.getHeight() / 2;
        m1188g(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m1187c();
    }
}
