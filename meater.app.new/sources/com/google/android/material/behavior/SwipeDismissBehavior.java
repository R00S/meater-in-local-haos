package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import s1.X;
import t1.t;
import t1.w;
import z1.d;

/* loaded from: classes2.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: B, reason: collision with root package name */
    z1.d f35923B;

    /* renamed from: C, reason: collision with root package name */
    c f35924C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f35925D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f35926E;

    /* renamed from: G, reason: collision with root package name */
    private boolean f35928G;

    /* renamed from: F, reason: collision with root package name */
    private float f35927F = 0.0f;

    /* renamed from: H, reason: collision with root package name */
    int f35929H = 2;

    /* renamed from: I, reason: collision with root package name */
    float f35930I = 0.5f;

    /* renamed from: J, reason: collision with root package name */
    float f35931J = 0.0f;

    /* renamed from: K, reason: collision with root package name */
    float f35932K = 0.5f;

    /* renamed from: L, reason: collision with root package name */
    private final d.c f35933L = new a();

    class a extends d.c {

        /* renamed from: a, reason: collision with root package name */
        private int f35934a;

        /* renamed from: b, reason: collision with root package name */
        private int f35935b = -1;

        a() {
        }

        private boolean n(View view, float f10) {
            if (f10 == 0.0f) {
                return Math.abs(view.getLeft() - this.f35934a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f35930I);
            }
            boolean z10 = X.z(view) == 1;
            int i10 = SwipeDismissBehavior.this.f35929H;
            if (i10 == 2) {
                return true;
            }
            if (i10 == 0) {
                if (z10) {
                    if (f10 >= 0.0f) {
                        return false;
                    }
                } else if (f10 <= 0.0f) {
                    return false;
                }
                return true;
            }
            if (i10 != 1) {
                return false;
            }
            if (z10) {
                if (f10 <= 0.0f) {
                    return false;
                }
            } else if (f10 >= 0.0f) {
                return false;
            }
            return true;
        }

        @Override // z1.d.c
        public int a(View view, int i10, int i11) {
            int width;
            int width2;
            int width3;
            boolean z10 = X.z(view) == 1;
            int i12 = SwipeDismissBehavior.this.f35929H;
            if (i12 == 0) {
                if (z10) {
                    width = this.f35934a - view.getWidth();
                    width2 = this.f35934a;
                } else {
                    width = this.f35934a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i12 != 1) {
                width = this.f35934a - view.getWidth();
                width2 = view.getWidth() + this.f35934a;
            } else if (z10) {
                width = this.f35934a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f35934a - view.getWidth();
                width2 = this.f35934a;
            }
            return SwipeDismissBehavior.L(width, i10, width2);
        }

        @Override // z1.d.c
        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // z1.d.c
        public int d(View view) {
            return view.getWidth();
        }

        @Override // z1.d.c
        public void i(View view, int i10) {
            this.f35935b = i10;
            this.f35934a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior.this.f35926E = true;
                parent.requestDisallowInterceptTouchEvent(true);
                SwipeDismissBehavior.this.f35926E = false;
            }
        }

        @Override // z1.d.c
        public void j(int i10) {
            c cVar = SwipeDismissBehavior.this.f35924C;
            if (cVar != null) {
                cVar.b(i10);
            }
        }

        @Override // z1.d.c
        public void k(View view, int i10, int i11, int i12, int i13) {
            float width = view.getWidth() * SwipeDismissBehavior.this.f35931J;
            float width2 = view.getWidth() * SwipeDismissBehavior.this.f35932K;
            float fAbs = Math.abs(i10 - this.f35934a);
            if (fAbs <= width) {
                view.setAlpha(1.0f);
            } else if (fAbs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.K(0.0f, 1.0f - SwipeDismissBehavior.N(width, width2, fAbs), 1.0f));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
        @Override // z1.d.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void l(android.view.View r3, float r4, float r5) {
            /*
                r2 = this;
                r5 = -1
                r2.f35935b = r5
                int r5 = r3.getWidth()
                boolean r0 = r2.n(r3, r4)
                if (r0 == 0) goto L23
                r0 = 0
                int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r4 < 0) goto L1d
                int r4 = r3.getLeft()
                int r0 = r2.f35934a
                if (r4 >= r0) goto L1b
                goto L1d
            L1b:
                int r0 = r0 + r5
                goto L21
            L1d:
                int r4 = r2.f35934a
                int r0 = r4 - r5
            L21:
                r4 = 1
                goto L26
            L23:
                int r0 = r2.f35934a
                r4 = 0
            L26:
                com.google.android.material.behavior.SwipeDismissBehavior r5 = com.google.android.material.behavior.SwipeDismissBehavior.this
                z1.d r5 = r5.f35923B
                int r1 = r3.getTop()
                boolean r5 = r5.G(r0, r1)
                if (r5 == 0) goto L3f
                com.google.android.material.behavior.SwipeDismissBehavior$d r5 = new com.google.android.material.behavior.SwipeDismissBehavior$d
                com.google.android.material.behavior.SwipeDismissBehavior r0 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r5.<init>(r3, r4)
                s1.X.f0(r3, r5)
                goto L4a
            L3f:
                if (r4 == 0) goto L4a
                com.google.android.material.behavior.SwipeDismissBehavior r4 = com.google.android.material.behavior.SwipeDismissBehavior.this
                com.google.android.material.behavior.SwipeDismissBehavior$c r4 = r4.f35924C
                if (r4 == 0) goto L4a
                r4.a(r3)
            L4a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.l(android.view.View, float, float):void");
        }

        @Override // z1.d.c
        public boolean m(View view, int i10) {
            int i11 = this.f35935b;
            return (i11 == -1 || i11 == i10) && SwipeDismissBehavior.this.J(view);
        }
    }

    class b implements w {
        b() {
        }

        @Override // t1.w
        public boolean a(View view, w.a aVar) {
            if (!SwipeDismissBehavior.this.J(view)) {
                return false;
            }
            boolean z10 = X.z(view) == 1;
            int i10 = SwipeDismissBehavior.this.f35929H;
            X.X(view, (!(i10 == 0 && z10) && (i10 != 1 || z10)) ? view.getWidth() : -view.getWidth());
            view.setAlpha(0.0f);
            c cVar = SwipeDismissBehavior.this.f35924C;
            if (cVar != null) {
                cVar.a(view);
            }
            return true;
        }
    }

    public interface c {
        void a(View view);

        void b(int i10);
    }

    private class d implements Runnable {

        /* renamed from: B, reason: collision with root package name */
        private final View f35938B;

        /* renamed from: C, reason: collision with root package name */
        private final boolean f35939C;

        d(View view, boolean z10) {
            this.f35938B = view;
            this.f35939C = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar;
            z1.d dVar = SwipeDismissBehavior.this.f35923B;
            if (dVar != null && dVar.l(true)) {
                X.f0(this.f35938B, this);
            } else {
                if (!this.f35939C || (cVar = SwipeDismissBehavior.this.f35924C) == null) {
                    return;
                }
                cVar.a(this.f35938B);
            }
        }
    }

    static float K(float f10, float f11, float f12) {
        return Math.min(Math.max(f10, f11), f12);
    }

    static int L(int i10, int i11, int i12) {
        return Math.min(Math.max(i10, i11), i12);
    }

    private void M(ViewGroup viewGroup) {
        if (this.f35923B == null) {
            this.f35923B = this.f35928G ? z1.d.m(viewGroup, this.f35927F, this.f35933L) : z1.d.n(viewGroup, this.f35933L);
        }
    }

    static float N(float f10, float f11, float f12) {
        return (f12 - f10) / (f11 - f10);
    }

    private void S(View view) {
        X.h0(view, 1048576);
        if (J(view)) {
            X.j0(view, t.a.f49798y, null, new b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean H(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        if (this.f35923B == null) {
            return false;
        }
        if (this.f35926E && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f35923B.A(motionEvent);
        return true;
    }

    public boolean J(View view) {
        return true;
    }

    public void O(float f10) {
        this.f35932K = K(0.0f, f10, 1.0f);
    }

    public void P(c cVar) {
        this.f35924C = cVar;
    }

    public void Q(float f10) {
        this.f35931J = K(0.0f, f10, 1.0f);
    }

    public void R(int i10) {
        this.f35929H = i10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        boolean zB = this.f35925D;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zB = coordinatorLayout.B(v10, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f35925D = zB;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f35925D = false;
        }
        if (!zB) {
            return false;
        }
        M(coordinatorLayout);
        return !this.f35926E && this.f35923B.H(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        boolean zP = super.p(coordinatorLayout, v10, i10);
        if (X.x(v10) == 0) {
            X.x0(v10, 1);
            S(v10);
        }
        return zP;
    }
}
