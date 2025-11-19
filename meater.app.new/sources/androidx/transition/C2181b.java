package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.AbstractC2190k;
import java.util.Map;

/* compiled from: ChangeBounds.java */
/* renamed from: androidx.transition.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2181b extends AbstractC2190k {

    /* renamed from: r0, reason: collision with root package name */
    private static final String[] f29447r0 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: s0, reason: collision with root package name */
    private static final Property<i, PointF> f29448s0 = new a(PointF.class, "topLeft");

    /* renamed from: t0, reason: collision with root package name */
    private static final Property<i, PointF> f29449t0 = new C0409b(PointF.class, "bottomRight");

    /* renamed from: u0, reason: collision with root package name */
    private static final Property<View, PointF> f29450u0 = new c(PointF.class, "bottomRight");

    /* renamed from: v0, reason: collision with root package name */
    private static final Property<View, PointF> f29451v0 = new d(PointF.class, "topLeft");

    /* renamed from: w0, reason: collision with root package name */
    private static final Property<View, PointF> f29452w0 = new e(PointF.class, "position");

    /* renamed from: x0, reason: collision with root package name */
    private static final C2188i f29453x0 = new C2188i();

    /* renamed from: q0, reason: collision with root package name */
    private boolean f29454q0 = false;

    /* compiled from: ChangeBounds.java */
    /* renamed from: androidx.transition.b$a */
    class a extends Property<i, PointF> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(i iVar, PointF pointF) {
            iVar.c(pointF);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: androidx.transition.b$b, reason: collision with other inner class name */
    class C0409b extends Property<i, PointF> {
        C0409b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(i iVar, PointF pointF) {
            iVar.a(pointF);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: androidx.transition.b$c */
    class c extends Property<View, PointF> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            B.d(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: androidx.transition.b$d */
    class d extends Property<View, PointF> {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            B.d(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: androidx.transition.b$e */
    class e extends Property<View, PointF> {
        e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int iRound = Math.round(pointF.x);
            int iRound2 = Math.round(pointF.y);
            B.d(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: androidx.transition.b$f */
    class f extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f29455a;
        private final i mViewBounds;

        f(i iVar) {
            this.f29455a = iVar;
            this.mViewBounds = iVar;
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: androidx.transition.b$g */
    private static class g extends AnimatorListenerAdapter implements AbstractC2190k.h {

        /* renamed from: a, reason: collision with root package name */
        private final View f29457a;

        /* renamed from: b, reason: collision with root package name */
        private final Rect f29458b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f29459c;

        /* renamed from: d, reason: collision with root package name */
        private final Rect f29460d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f29461e;

        /* renamed from: f, reason: collision with root package name */
        private final int f29462f;

        /* renamed from: g, reason: collision with root package name */
        private final int f29463g;

        /* renamed from: h, reason: collision with root package name */
        private final int f29464h;

        /* renamed from: i, reason: collision with root package name */
        private final int f29465i;

        /* renamed from: j, reason: collision with root package name */
        private final int f29466j;

        /* renamed from: k, reason: collision with root package name */
        private final int f29467k;

        /* renamed from: l, reason: collision with root package name */
        private final int f29468l;

        /* renamed from: m, reason: collision with root package name */
        private final int f29469m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f29470n;

        g(View view, Rect rect, boolean z10, Rect rect2, boolean z11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f29457a = view;
            this.f29458b = rect;
            this.f29459c = z10;
            this.f29460d = rect2;
            this.f29461e = z11;
            this.f29462f = i10;
            this.f29463g = i11;
            this.f29464h = i12;
            this.f29465i = i13;
            this.f29466j = i14;
            this.f29467k = i15;
            this.f29468l = i16;
            this.f29469m = i17;
        }

        @Override // androidx.transition.AbstractC2190k.h
        public void d(AbstractC2190k abstractC2190k) {
            this.f29457a.setTag(C2187h.f29502b, this.f29457a.getClipBounds());
            this.f29457a.setClipBounds(this.f29461e ? null : this.f29460d);
        }

        @Override // androidx.transition.AbstractC2190k.h
        public void k(AbstractC2190k abstractC2190k) {
            this.f29470n = true;
        }

        @Override // androidx.transition.AbstractC2190k.h
        public void m(AbstractC2190k abstractC2190k) {
            View view = this.f29457a;
            int i10 = C2187h.f29502b;
            Rect rect = (Rect) view.getTag(i10);
            this.f29457a.setTag(i10, null);
            this.f29457a.setClipBounds(rect);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            onAnimationStart(animator, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z10) {
            if (this.f29470n) {
                return;
            }
            Rect rect = null;
            if (z10) {
                if (!this.f29459c) {
                    rect = this.f29458b;
                }
            } else if (!this.f29461e) {
                rect = this.f29460d;
            }
            this.f29457a.setClipBounds(rect);
            if (z10) {
                B.d(this.f29457a, this.f29462f, this.f29463g, this.f29464h, this.f29465i);
            } else {
                B.d(this.f29457a, this.f29466j, this.f29467k, this.f29468l, this.f29469m);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z10) {
            int iMax = Math.max(this.f29464h - this.f29462f, this.f29468l - this.f29466j);
            int iMax2 = Math.max(this.f29465i - this.f29463g, this.f29469m - this.f29467k);
            int i10 = z10 ? this.f29466j : this.f29462f;
            int i11 = z10 ? this.f29467k : this.f29463g;
            B.d(this.f29457a, i10, i11, iMax + i10, iMax2 + i11);
            this.f29457a.setClipBounds(z10 ? this.f29460d : this.f29458b);
        }

        @Override // androidx.transition.AbstractC2190k.h
        public void a(AbstractC2190k abstractC2190k) {
        }

        @Override // androidx.transition.AbstractC2190k.h
        public void h(AbstractC2190k abstractC2190k) {
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: androidx.transition.b$h */
    private static class h extends r {

        /* renamed from: a, reason: collision with root package name */
        boolean f29471a = false;

        /* renamed from: b, reason: collision with root package name */
        final ViewGroup f29472b;

        h(ViewGroup viewGroup) {
            this.f29472b = viewGroup;
        }

        @Override // androidx.transition.r, androidx.transition.AbstractC2190k.h
        public void d(AbstractC2190k abstractC2190k) {
            A.b(this.f29472b, false);
        }

        @Override // androidx.transition.r, androidx.transition.AbstractC2190k.h
        public void h(AbstractC2190k abstractC2190k) {
            if (!this.f29471a) {
                A.b(this.f29472b, false);
            }
            abstractC2190k.i0(this);
        }

        @Override // androidx.transition.r, androidx.transition.AbstractC2190k.h
        public void k(AbstractC2190k abstractC2190k) {
            A.b(this.f29472b, false);
            this.f29471a = true;
        }

        @Override // androidx.transition.r, androidx.transition.AbstractC2190k.h
        public void m(AbstractC2190k abstractC2190k) {
            A.b(this.f29472b, true);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: androidx.transition.b$i */
    private static class i {

        /* renamed from: a, reason: collision with root package name */
        private int f29473a;

        /* renamed from: b, reason: collision with root package name */
        private int f29474b;

        /* renamed from: c, reason: collision with root package name */
        private int f29475c;

        /* renamed from: d, reason: collision with root package name */
        private int f29476d;

        /* renamed from: e, reason: collision with root package name */
        private final View f29477e;

        /* renamed from: f, reason: collision with root package name */
        private int f29478f;

        /* renamed from: g, reason: collision with root package name */
        private int f29479g;

        i(View view) {
            this.f29477e = view;
        }

        private void b() {
            B.d(this.f29477e, this.f29473a, this.f29474b, this.f29475c, this.f29476d);
            this.f29478f = 0;
            this.f29479g = 0;
        }

        void a(PointF pointF) {
            this.f29475c = Math.round(pointF.x);
            this.f29476d = Math.round(pointF.y);
            int i10 = this.f29479g + 1;
            this.f29479g = i10;
            if (this.f29478f == i10) {
                b();
            }
        }

        void c(PointF pointF) {
            this.f29473a = Math.round(pointF.x);
            this.f29474b = Math.round(pointF.y);
            int i10 = this.f29478f + 1;
            this.f29478f = i10;
            if (i10 == this.f29479g) {
                b();
            }
        }
    }

    private void y0(x xVar) {
        View view = xVar.f29592b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        xVar.f29591a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        xVar.f29591a.put("android:changeBounds:parent", xVar.f29592b.getParent());
        if (this.f29454q0) {
            xVar.f29591a.put("android:changeBounds:clip", view.getClipBounds());
        }
    }

    @Override // androidx.transition.AbstractC2190k
    public String[] O() {
        return f29447r0;
    }

    @Override // androidx.transition.AbstractC2190k
    public boolean R() {
        return true;
    }

    @Override // androidx.transition.AbstractC2190k
    public void k(x xVar) {
        y0(xVar);
    }

    @Override // androidx.transition.AbstractC2190k
    public void n(x xVar) {
        Rect rect;
        y0(xVar);
        if (!this.f29454q0 || (rect = (Rect) xVar.f29592b.getTag(C2187h.f29502b)) == null) {
            return;
        }
        xVar.f29591a.put("android:changeBounds:clip", rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.transition.AbstractC2190k
    public Animator r(ViewGroup viewGroup, x xVar, x xVar2) {
        int i10;
        View view;
        int i11;
        int i12;
        int i13;
        ObjectAnimator objectAnimatorA;
        int i14;
        ObjectAnimator objectAnimatorOfObject;
        Animator animatorC;
        if (xVar == null || xVar2 == null) {
            return null;
        }
        Map<String, Object> map = xVar.f29591a;
        Map<String, Object> map2 = xVar2.f29591a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = xVar2.f29592b;
        Rect rect = (Rect) xVar.f29591a.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) xVar2.f29591a.get("android:changeBounds:bounds");
        int i15 = rect.left;
        int i16 = rect2.left;
        int i17 = rect.top;
        int i18 = rect2.top;
        int i19 = rect.right;
        int i20 = rect2.right;
        int i21 = rect.bottom;
        int i22 = rect2.bottom;
        int i23 = i19 - i15;
        int i24 = i21 - i17;
        int i25 = i20 - i16;
        int i26 = i22 - i18;
        Rect rect3 = (Rect) xVar.f29591a.get("android:changeBounds:clip");
        Rect rect4 = (Rect) xVar2.f29591a.get("android:changeBounds:clip");
        if ((i23 == 0 || i24 == 0) && (i25 == 0 || i26 == 0)) {
            i10 = 0;
        } else {
            i10 = (i15 == i16 && i17 == i18) ? 0 : 1;
            if (i19 != i20 || i21 != i22) {
                i10++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i10++;
        }
        if (i10 <= 0) {
            return null;
        }
        if (this.f29454q0) {
            view = view2;
            B.d(view, i15, i17, Math.max(i23, i25) + i15, i17 + Math.max(i24, i26));
            if (i15 == i16 && i17 == i18) {
                i11 = i20;
                i12 = i19;
                i13 = i17;
                objectAnimatorA = null;
            } else {
                i11 = i20;
                i12 = i19;
                i13 = i17;
                objectAnimatorA = C2185f.a(view, f29452w0, D().a(i15, i17, i16, i18));
            }
            boolean z10 = rect3 == null;
            if (z10) {
                i14 = 0;
                rect3 = new Rect(0, 0, i23, i24);
            } else {
                i14 = 0;
            }
            Rect rect5 = rect3;
            int i27 = rect4 == null ? 1 : i14;
            Rect rect6 = i27 != 0 ? new Rect(i14, i14, i25, i26) : rect4;
            if (rect5.equals(rect6)) {
                objectAnimatorOfObject = null;
            } else {
                view.setClipBounds(rect5);
                objectAnimatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", f29453x0, rect5, rect6);
                g gVar = new g(view, rect5, z10, rect6, i27, i15, i13, i12, i21, i16, i18, i11, i22);
                objectAnimatorOfObject.addListener(gVar);
                d(gVar);
            }
            animatorC = w.c(objectAnimatorA, objectAnimatorOfObject);
        } else {
            view = view2;
            B.d(view, i15, i17, i19, i21);
            if (i10 != 2) {
                animatorC = (i15 == i16 && i17 == i18) ? C2185f.a(view, f29450u0, D().a(i19, i21, i20, i22)) : C2185f.a(view, f29451v0, D().a(i15, i17, i16, i18));
            } else if (i23 == i25 && i24 == i26) {
                animatorC = C2185f.a(view, f29452w0, D().a(i15, i17, i16, i18));
            } else {
                i iVar = new i(view);
                ObjectAnimator objectAnimatorA2 = C2185f.a(iVar, f29448s0, D().a(i15, i17, i16, i18));
                ObjectAnimator objectAnimatorA3 = C2185f.a(iVar, f29449t0, D().a(i19, i21, i20, i22));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorA2, objectAnimatorA3);
                animatorSet.addListener(new f(iVar));
                animatorC = animatorSet;
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            A.b(viewGroup4, true);
            F().d(new h(viewGroup4));
        }
        return animatorC;
    }
}
