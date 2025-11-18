package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.AbstractC2190k;

/* compiled from: Visibility.java */
/* loaded from: classes.dex */
public abstract class N extends AbstractC2190k {

    /* renamed from: r0, reason: collision with root package name */
    private static final String[] f29428r0 = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: q0, reason: collision with root package name */
    private int f29429q0 = 3;

    /* compiled from: Visibility.java */
    private static class a extends AnimatorListenerAdapter implements AbstractC2190k.h {

        /* renamed from: a, reason: collision with root package name */
        private final View f29430a;

        /* renamed from: b, reason: collision with root package name */
        private final int f29431b;

        /* renamed from: c, reason: collision with root package name */
        private final ViewGroup f29432c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f29433d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f29434e;

        /* renamed from: f, reason: collision with root package name */
        boolean f29435f = false;

        a(View view, int i10, boolean z10) {
            this.f29430a = view;
            this.f29431b = i10;
            this.f29432c = (ViewGroup) view.getParent();
            this.f29433d = z10;
            c(true);
        }

        private void b() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            if (!this.f29435f) {
                B.f(this.f29430a, this.f29431b);
                ViewGroup viewGroup = this.f29432c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            c(false);
        }

        private void c(boolean z10) {
            ViewGroup viewGroup;
            if (!this.f29433d || this.f29434e == z10 || (viewGroup = this.f29432c) == null) {
                return;
            }
            this.f29434e = z10;
            A.b(viewGroup, z10);
        }

        @Override // androidx.transition.AbstractC2190k.h
        public void d(AbstractC2190k abstractC2190k) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            c(false);
            if (this.f29435f) {
                return;
            }
            B.f(this.f29430a, this.f29431b);
        }

        @Override // androidx.transition.AbstractC2190k.h
        public void h(AbstractC2190k abstractC2190k) {
            abstractC2190k.i0(this);
        }

        @Override // androidx.transition.AbstractC2190k.h
        public void m(AbstractC2190k abstractC2190k) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            c(true);
            if (this.f29435f) {
                return;
            }
            B.f(this.f29430a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f29435f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            b();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z10) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            if (z10) {
                return;
            }
            b();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z10) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            if (z10) {
                B.f(this.f29430a, 0);
                ViewGroup viewGroup = this.f29432c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        }

        @Override // androidx.transition.AbstractC2190k.h
        public void a(AbstractC2190k abstractC2190k) {
        }

        @Override // androidx.transition.AbstractC2190k.h
        public void k(AbstractC2190k abstractC2190k) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }
    }

    /* compiled from: Visibility.java */
    private class b extends AnimatorListenerAdapter implements AbstractC2190k.h {

        /* renamed from: a, reason: collision with root package name */
        private final ViewGroup f29436a;

        /* renamed from: b, reason: collision with root package name */
        private final View f29437b;

        /* renamed from: c, reason: collision with root package name */
        private final View f29438c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f29439d = true;

        b(ViewGroup viewGroup, View view, View view2) {
            this.f29436a = viewGroup;
            this.f29437b = view;
            this.f29438c = view2;
        }

        private void b() {
            this.f29438c.setTag(C2187h.f29501a, null);
            this.f29436a.getOverlay().remove(this.f29437b);
            this.f29439d = false;
        }

        @Override // androidx.transition.AbstractC2190k.h
        public void h(AbstractC2190k abstractC2190k) {
            abstractC2190k.i0(this);
        }

        @Override // androidx.transition.AbstractC2190k.h
        public void k(AbstractC2190k abstractC2190k) {
            if (this.f29439d) {
                b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f29436a.getOverlay().remove(this.f29437b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f29437b.getParent() == null) {
                this.f29436a.getOverlay().add(this.f29437b);
            } else {
                N.this.cancel();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z10) {
            if (z10) {
                this.f29438c.setTag(C2187h.f29501a, this.f29437b);
                this.f29436a.getOverlay().add(this.f29437b);
                this.f29439d = true;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z10) {
            if (z10) {
                return;
            }
            b();
        }

        @Override // androidx.transition.AbstractC2190k.h
        public void a(AbstractC2190k abstractC2190k) {
        }

        @Override // androidx.transition.AbstractC2190k.h
        public void d(AbstractC2190k abstractC2190k) {
        }

        @Override // androidx.transition.AbstractC2190k.h
        public void m(AbstractC2190k abstractC2190k) {
        }
    }

    /* compiled from: Visibility.java */
    private static class c {

        /* renamed from: a, reason: collision with root package name */
        boolean f29441a;

        /* renamed from: b, reason: collision with root package name */
        boolean f29442b;

        /* renamed from: c, reason: collision with root package name */
        int f29443c;

        /* renamed from: d, reason: collision with root package name */
        int f29444d;

        /* renamed from: e, reason: collision with root package name */
        ViewGroup f29445e;

        /* renamed from: f, reason: collision with root package name */
        ViewGroup f29446f;

        c() {
        }
    }

    private void y0(x xVar) {
        xVar.f29591a.put("android:visibility:visibility", Integer.valueOf(xVar.f29592b.getVisibility()));
        xVar.f29591a.put("android:visibility:parent", xVar.f29592b.getParent());
        int[] iArr = new int[2];
        xVar.f29592b.getLocationOnScreen(iArr);
        xVar.f29591a.put("android:visibility:screenLocation", iArr);
    }

    private c z0(x xVar, x xVar2) {
        c cVar = new c();
        cVar.f29441a = false;
        cVar.f29442b = false;
        if (xVar == null || !xVar.f29591a.containsKey("android:visibility:visibility")) {
            cVar.f29443c = -1;
            cVar.f29445e = null;
        } else {
            cVar.f29443c = ((Integer) xVar.f29591a.get("android:visibility:visibility")).intValue();
            cVar.f29445e = (ViewGroup) xVar.f29591a.get("android:visibility:parent");
        }
        if (xVar2 == null || !xVar2.f29591a.containsKey("android:visibility:visibility")) {
            cVar.f29444d = -1;
            cVar.f29446f = null;
        } else {
            cVar.f29444d = ((Integer) xVar2.f29591a.get("android:visibility:visibility")).intValue();
            cVar.f29446f = (ViewGroup) xVar2.f29591a.get("android:visibility:parent");
        }
        if (xVar != null && xVar2 != null) {
            int i10 = cVar.f29443c;
            int i11 = cVar.f29444d;
            if (i10 == i11 && cVar.f29445e == cVar.f29446f) {
                return cVar;
            }
            if (i10 != i11) {
                if (i10 == 0) {
                    cVar.f29442b = false;
                    cVar.f29441a = true;
                } else if (i11 == 0) {
                    cVar.f29442b = true;
                    cVar.f29441a = true;
                }
            } else if (cVar.f29446f == null) {
                cVar.f29442b = false;
                cVar.f29441a = true;
            } else if (cVar.f29445e == null) {
                cVar.f29442b = true;
                cVar.f29441a = true;
            }
        } else if (xVar == null && cVar.f29444d == 0) {
            cVar.f29442b = true;
            cVar.f29441a = true;
        } else if (xVar2 == null && cVar.f29443c == 0) {
            cVar.f29442b = false;
            cVar.f29441a = true;
        }
        return cVar;
    }

    public abstract Animator A0(ViewGroup viewGroup, View view, x xVar, x xVar2);

    public Animator B0(ViewGroup viewGroup, x xVar, int i10, x xVar2, int i11) {
        if ((this.f29429q0 & 1) != 1 || xVar2 == null) {
            return null;
        }
        if (xVar == null) {
            View view = (View) xVar2.f29592b.getParent();
            if (z0(B(view, false), P(view, false)).f29441a) {
                return null;
            }
        }
        return A0(viewGroup, xVar2.f29592b, xVar, xVar2);
    }

    public abstract Animator C0(ViewGroup viewGroup, View view, x xVar, x xVar2);

    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0073 A[PHI: r8
      0x0073: PHI (r8v3 android.view.View) = 
      (r8v2 android.view.View)
      (r8v2 android.view.View)
      (r8v2 android.view.View)
      (r8v2 android.view.View)
      (r8v2 android.view.View)
      (r8v2 android.view.View)
      (r8v6 android.view.View)
     binds: [B:26:0x0048, B:31:0x0057, B:37:0x0082, B:39:0x0085, B:41:0x008b, B:43:0x008f, B:34:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.animation.Animator D0(android.view.ViewGroup r18, androidx.transition.x r19, int r20, androidx.transition.x r21, int r22) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.SecurityException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.N.D0(android.view.ViewGroup, androidx.transition.x, int, androidx.transition.x, int):android.animation.Animator");
    }

    public void E0(int i10) {
        if ((i10 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f29429q0 = i10;
    }

    @Override // androidx.transition.AbstractC2190k
    public String[] O() {
        return f29428r0;
    }

    @Override // androidx.transition.AbstractC2190k
    public boolean S(x xVar, x xVar2) {
        if (xVar == null && xVar2 == null) {
            return false;
        }
        if (xVar != null && xVar2 != null && xVar2.f29591a.containsKey("android:visibility:visibility") != xVar.f29591a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c cVarZ0 = z0(xVar, xVar2);
        if (cVarZ0.f29441a) {
            return cVarZ0.f29443c == 0 || cVarZ0.f29444d == 0;
        }
        return false;
    }

    @Override // androidx.transition.AbstractC2190k
    public void k(x xVar) {
        y0(xVar);
    }

    @Override // androidx.transition.AbstractC2190k
    public void n(x xVar) {
        y0(xVar);
    }

    @Override // androidx.transition.AbstractC2190k
    public Animator r(ViewGroup viewGroup, x xVar, x xVar2) {
        c cVarZ0 = z0(xVar, xVar2);
        if (!cVarZ0.f29441a) {
            return null;
        }
        if (cVarZ0.f29445e == null && cVarZ0.f29446f == null) {
            return null;
        }
        return cVarZ0.f29442b ? B0(viewGroup, xVar, cVarZ0.f29443c, xVar2, cVarZ0.f29444d) : D0(viewGroup, xVar, cVarZ0.f29443c, xVar2, cVarZ0.f29444d);
    }
}
