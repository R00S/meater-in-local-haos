package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0311u;
import androidx.core.view.p004d0.C0289c;
import androidx.core.view.p004d0.InterfaceC0292f;
import cm.aptoide.p092pt.file.CacheHelper;
import p024c.p062k.p063a.C0966c;

/* loaded from: classes2.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.AbstractC0226c<V> {

    /* renamed from: a */
    C0966c f29712a;

    /* renamed from: b */
    InterfaceC7943c f29713b;

    /* renamed from: c */
    private boolean f29714c;

    /* renamed from: e */
    private boolean f29716e;

    /* renamed from: d */
    private float f29715d = 0.0f;

    /* renamed from: f */
    int f29717f = 2;

    /* renamed from: g */
    float f29718g = 0.5f;

    /* renamed from: h */
    float f29719h = 0.0f;

    /* renamed from: i */
    float f29720i = 0.5f;

    /* renamed from: j */
    private final C0966c.c f29721j = new C7941a();

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$a */
    class C7941a extends C0966c.c {

        /* renamed from: a */
        private int f29722a;

        /* renamed from: b */
        private int f29723b = -1;

        C7941a() {
        }

        /* renamed from: n */
        private boolean m23873n(View view, float f2) {
            if (f2 == 0.0f) {
                return Math.abs(view.getLeft() - this.f29722a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f29718g);
            }
            boolean z = C0311u.m2162y(view) == 1;
            int i2 = SwipeDismissBehavior.this.f29717f;
            if (i2 == 2) {
                return true;
            }
            if (i2 == 0) {
                if (z) {
                    if (f2 >= 0.0f) {
                        return false;
                    }
                } else if (f2 <= 0.0f) {
                    return false;
                }
                return true;
            }
            if (i2 != 1) {
                return false;
            }
            if (z) {
                if (f2 <= 0.0f) {
                    return false;
                }
            } else if (f2 >= 0.0f) {
                return false;
            }
            return true;
        }

        @Override // p024c.p062k.p063a.C0966c.c
        /* renamed from: a */
        public int mo6164a(View view, int i2, int i3) {
            int width;
            int width2;
            int width3;
            boolean z = C0311u.m2162y(view) == 1;
            int i4 = SwipeDismissBehavior.this.f29717f;
            if (i4 == 0) {
                if (z) {
                    width = this.f29722a - view.getWidth();
                    width2 = this.f29722a;
                } else {
                    width = this.f29722a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i4 != 1) {
                width = this.f29722a - view.getWidth();
                width2 = view.getWidth() + this.f29722a;
            } else if (z) {
                width = this.f29722a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f29722a - view.getWidth();
                width2 = this.f29722a;
            }
            return SwipeDismissBehavior.m23864G(width, i2, width2);
        }

        @Override // p024c.p062k.p063a.C0966c.c
        /* renamed from: b */
        public int mo6165b(View view, int i2, int i3) {
            return view.getTop();
        }

        @Override // p024c.p062k.p063a.C0966c.c
        /* renamed from: d */
        public int mo6167d(View view) {
            return view.getWidth();
        }

        @Override // p024c.p062k.p063a.C0966c.c
        /* renamed from: i */
        public void mo6172i(View view, int i2) {
            this.f29723b = i2;
            this.f29722a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // p024c.p062k.p063a.C0966c.c
        /* renamed from: j */
        public void mo6173j(int i2) {
            InterfaceC7943c interfaceC7943c = SwipeDismissBehavior.this.f29713b;
            if (interfaceC7943c != null) {
                interfaceC7943c.mo23875b(i2);
            }
        }

        @Override // p024c.p062k.p063a.C0966c.c
        /* renamed from: k */
        public void mo6174k(View view, int i2, int i3, int i4, int i5) {
            float width = this.f29722a + (view.getWidth() * SwipeDismissBehavior.this.f29719h);
            float width2 = this.f29722a + (view.getWidth() * SwipeDismissBehavior.this.f29720i);
            float f2 = i2;
            if (f2 <= width) {
                view.setAlpha(1.0f);
            } else if (f2 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.m23863F(0.0f, 1.0f - SwipeDismissBehavior.m23866I(width, width2, f2), 1.0f));
            }
        }

        @Override // p024c.p062k.p063a.C0966c.c
        /* renamed from: l */
        public void mo6175l(View view, float f2, float f3) {
            int i2;
            boolean z;
            InterfaceC7943c interfaceC7943c;
            this.f29723b = -1;
            int width = view.getWidth();
            if (m23873n(view, f2)) {
                int left = view.getLeft();
                int i3 = this.f29722a;
                i2 = left < i3 ? i3 - width : i3 + width;
                z = true;
            } else {
                i2 = this.f29722a;
                z = false;
            }
            if (SwipeDismissBehavior.this.f29712a.m6151F(i2, view.getTop())) {
                C0311u.m2115a0(view, new RunnableC7944d(view, z));
            } else {
                if (!z || (interfaceC7943c = SwipeDismissBehavior.this.f29713b) == null) {
                    return;
                }
                interfaceC7943c.mo23874a(view);
            }
        }

        @Override // p024c.p062k.p063a.C0966c.c
        /* renamed from: m */
        public boolean mo6176m(View view, int i2) {
            int i3 = this.f29723b;
            return (i3 == -1 || i3 == i2) && SwipeDismissBehavior.this.mo23868E(view);
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$b */
    class C7942b implements InterfaceC0292f {
        C7942b() {
        }

        @Override // androidx.core.view.p004d0.InterfaceC0292f
        /* renamed from: a */
        public boolean mo2032a(View view, InterfaceC0292f.a aVar) {
            boolean z = false;
            if (!SwipeDismissBehavior.this.mo23868E(view)) {
                return false;
            }
            boolean z2 = C0311u.m2162y(view) == 1;
            int i2 = SwipeDismissBehavior.this.f29717f;
            if ((i2 == 0 && z2) || (i2 == 1 && !z2)) {
                z = true;
            }
            int width = view.getWidth();
            if (z) {
                width = -width;
            }
            C0311u.m2107T(view, width);
            view.setAlpha(0.0f);
            InterfaceC7943c interfaceC7943c = SwipeDismissBehavior.this.f29713b;
            if (interfaceC7943c != null) {
                interfaceC7943c.mo23874a(view);
            }
            return true;
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$c */
    public interface InterfaceC7943c {
        /* renamed from: a */
        void mo23874a(View view);

        /* renamed from: b */
        void mo23875b(int i2);
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$d */
    private class RunnableC7944d implements Runnable {

        /* renamed from: f */
        private final View f29726f;

        /* renamed from: g */
        private final boolean f29727g;

        RunnableC7944d(View view, boolean z) {
            this.f29726f = view;
            this.f29727g = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC7943c interfaceC7943c;
            C0966c c0966c = SwipeDismissBehavior.this.f29712a;
            if (c0966c != null && c0966c.m6157k(true)) {
                C0311u.m2115a0(this.f29726f, this);
            } else {
                if (!this.f29727g || (interfaceC7943c = SwipeDismissBehavior.this.f29713b) == null) {
                    return;
                }
                interfaceC7943c.mo23874a(this.f29726f);
            }
        }
    }

    /* renamed from: F */
    static float m23863F(float f2, float f3, float f4) {
        return Math.min(Math.max(f2, f3), f4);
    }

    /* renamed from: G */
    static int m23864G(int i2, int i3, int i4) {
        return Math.min(Math.max(i2, i3), i4);
    }

    /* renamed from: H */
    private void m23865H(ViewGroup viewGroup) {
        if (this.f29712a == null) {
            this.f29712a = this.f29716e ? C0966c.m6141l(viewGroup, this.f29715d, this.f29721j) : C0966c.m6142m(viewGroup, this.f29721j);
        }
    }

    /* renamed from: I */
    static float m23866I(float f2, float f3, float f4) {
        return (f4 - f2) / (f3 - f2);
    }

    /* renamed from: N */
    private void m23867N(View view) {
        C0311u.m2119c0(view, CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES);
        if (mo23868E(view)) {
            C0311u.m2123e0(view, C0289c.a.f2368u, null, new C7942b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    /* renamed from: D */
    public boolean mo1446D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C0966c c0966c = this.f29712a;
        if (c0966c == null) {
            return false;
        }
        c0966c.m6163z(motionEvent);
        return true;
    }

    /* renamed from: E */
    public boolean mo23868E(View view) {
        return true;
    }

    /* renamed from: J */
    public void m23869J(float f2) {
        this.f29720i = m23863F(0.0f, f2, 1.0f);
    }

    /* renamed from: K */
    public void m23870K(InterfaceC7943c interfaceC7943c) {
        this.f29713b = interfaceC7943c;
    }

    /* renamed from: L */
    public void m23871L(float f2) {
        this.f29719h = m23863F(0.0f, f2, 1.0f);
    }

    /* renamed from: M */
    public void m23872M(int i2) {
        this.f29717f = i2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    /* renamed from: k */
    public boolean mo1457k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean zM1419B = this.f29714c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zM1419B = coordinatorLayout.m1419B(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f29714c = zM1419B;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f29714c = false;
        }
        if (!zM1419B) {
            return false;
        }
        m23865H(coordinatorLayout);
        return this.f29712a.m6152G(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    /* renamed from: l */
    public boolean mo1458l(CoordinatorLayout coordinatorLayout, V v, int i2) {
        boolean zMo1458l = super.mo1458l(coordinatorLayout, v, i2);
        if (C0311u.m2158w(v) == 0) {
            C0311u.m2153t0(v, 1);
            m23867N(v);
        }
        return zMo1458l;
    }
}
