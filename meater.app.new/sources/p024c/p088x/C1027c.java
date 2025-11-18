package p024c.p088x;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C0311u;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* compiled from: ChangeBounds.java */
/* renamed from: c.x.c */
/* loaded from: classes.dex */
public class C1027c extends AbstractC1047m {

    /* renamed from: P */
    private static final String[] f6771P = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: Q */
    private static final Property<Drawable, PointF> f6772Q = new b(PointF.class, "boundsOrigin");

    /* renamed from: R */
    private static final Property<k, PointF> f6773R = new c(PointF.class, "topLeft");

    /* renamed from: S */
    private static final Property<k, PointF> f6774S = new d(PointF.class, "bottomRight");

    /* renamed from: T */
    private static final Property<View, PointF> f6775T = new e(PointF.class, "bottomRight");

    /* renamed from: U */
    private static final Property<View, PointF> f6776U = new f(PointF.class, "topLeft");

    /* renamed from: V */
    private static final Property<View, PointF> f6777V = new g(PointF.class, "position");

    /* renamed from: W */
    private static C1043k f6778W = new C1043k();

    /* renamed from: X */
    private int[] f6779X = new int[2];

    /* renamed from: Y */
    private boolean f6780Y = false;

    /* renamed from: Z */
    private boolean f6781Z = false;

    /* compiled from: ChangeBounds.java */
    /* renamed from: c.x.c$a */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f6782a;

        /* renamed from: b */
        final /* synthetic */ BitmapDrawable f6783b;

        /* renamed from: c */
        final /* synthetic */ View f6784c;

        /* renamed from: d */
        final /* synthetic */ float f6785d;

        a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f2) {
            this.f6782a = viewGroup;
            this.f6783b = bitmapDrawable;
            this.f6784c = view;
            this.f6785d = f2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C1028c0.m6562b(this.f6782a).mo6534b(this.f6783b);
            C1028c0.m6567g(this.f6784c, this.f6785d);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: c.x.c$b */
    static class b extends Property<Drawable, PointF> {

        /* renamed from: a */
        private Rect f6787a;

        b(Class cls, String str) {
            super(cls, str);
            this.f6787a = new Rect();
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f6787a);
            Rect rect = this.f6787a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f6787a);
            this.f6787a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f6787a);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: c.x.c$c */
    static class c extends Property<k, PointF> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            kVar.m6560c(pointF);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: c.x.c$d */
    static class d extends Property<k, PointF> {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            kVar.m6559a(pointF);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: c.x.c$e */
    static class e extends Property<View, PointF> {
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
        public void set(View view, PointF pointF) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            C1028c0.m6566f(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: c.x.c$f */
    static class f extends Property<View, PointF> {
        f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            C1028c0.m6566f(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: c.x.c$g */
    static class g extends Property<View, PointF> {
        g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            int iRound = Math.round(pointF.x);
            int iRound2 = Math.round(pointF.y);
            C1028c0.m6566f(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: c.x.c$h */
    class h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ k f6788a;
        private k mViewBounds;

        h(k kVar) {
            this.f6788a = kVar;
            this.mViewBounds = kVar;
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: c.x.c$i */
    class i extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f6790a;

        /* renamed from: b */
        final /* synthetic */ View f6791b;

        /* renamed from: c */
        final /* synthetic */ Rect f6792c;

        /* renamed from: d */
        final /* synthetic */ int f6793d;

        /* renamed from: e */
        final /* synthetic */ int f6794e;

        /* renamed from: f */
        final /* synthetic */ int f6795f;

        /* renamed from: g */
        final /* synthetic */ int f6796g;

        i(View view, Rect rect, int i2, int i3, int i4, int i5) {
            this.f6791b = view;
            this.f6792c = rect;
            this.f6793d = i2;
            this.f6794e = i3;
            this.f6795f = i4;
            this.f6796g = i5;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f6790a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            if (this.f6790a) {
                return;
            }
            C0311u.m2145p0(this.f6791b, this.f6792c);
            C1028c0.m6566f(this.f6791b, this.f6793d, this.f6794e, this.f6795f, this.f6796g);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: c.x.c$j */
    class j extends C1049n {

        /* renamed from: a */
        boolean f6798a = false;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f6799b;

        j(ViewGroup viewGroup) {
            this.f6799b = viewGroup;
        }

        @Override // p024c.p088x.C1049n, p024c.p088x.AbstractC1047m.f
        /* renamed from: b */
        public void mo6554b(AbstractC1047m abstractC1047m) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            C1059x.m6681c(this.f6799b, false);
        }

        @Override // p024c.p088x.AbstractC1047m.f
        /* renamed from: c */
        public void mo6555c(AbstractC1047m abstractC1047m) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            if (!this.f6798a) {
                C1059x.m6681c(this.f6799b, false);
            }
            abstractC1047m.mo6628T(this);
        }

        @Override // p024c.p088x.C1049n, p024c.p088x.AbstractC1047m.f
        /* renamed from: d */
        public void mo6556d(AbstractC1047m abstractC1047m) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            C1059x.m6681c(this.f6799b, false);
            this.f6798a = true;
        }

        @Override // p024c.p088x.C1049n, p024c.p088x.AbstractC1047m.f
        /* renamed from: e */
        public void mo6557e(AbstractC1047m abstractC1047m) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            C1059x.m6681c(this.f6799b, true);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: c.x.c$k */
    private static class k {

        /* renamed from: a */
        private int f6801a;

        /* renamed from: b */
        private int f6802b;

        /* renamed from: c */
        private int f6803c;

        /* renamed from: d */
        private int f6804d;

        /* renamed from: e */
        private View f6805e;

        /* renamed from: f */
        private int f6806f;

        /* renamed from: g */
        private int f6807g;

        k(View view) {
            this.f6805e = view;
        }

        /* renamed from: b */
        private void m6558b() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            C1028c0.m6566f(this.f6805e, this.f6801a, this.f6802b, this.f6803c, this.f6804d);
            this.f6806f = 0;
            this.f6807g = 0;
        }

        /* renamed from: a */
        void m6559a(PointF pointF) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            this.f6803c = Math.round(pointF.x);
            this.f6804d = Math.round(pointF.y);
            int i2 = this.f6807g + 1;
            this.f6807g = i2;
            if (this.f6806f == i2) {
                m6558b();
            }
        }

        /* renamed from: c */
        void m6560c(PointF pointF) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            this.f6801a = Math.round(pointF.x);
            this.f6802b = Math.round(pointF.y);
            int i2 = this.f6806f + 1;
            this.f6806f = i2;
            if (i2 == this.f6807g) {
                m6558b();
            }
        }
    }

    /* renamed from: k0 */
    private void m6536k0(C1054s c1054s) {
        View view = c1054s.f6934b;
        if (!C0311u.m2102O(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        c1054s.f6933a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        c1054s.f6933a.put("android:changeBounds:parent", c1054s.f6934b.getParent());
        if (this.f6781Z) {
            c1054s.f6934b.getLocationInWindow(this.f6779X);
            c1054s.f6933a.put("android:changeBounds:windowX", Integer.valueOf(this.f6779X[0]));
            c1054s.f6933a.put("android:changeBounds:windowY", Integer.valueOf(this.f6779X[1]));
        }
        if (this.f6780Y) {
            c1054s.f6933a.put("android:changeBounds:clip", C0311u.m2148r(view));
        }
    }

    /* renamed from: l0 */
    private boolean m6537l0(View view, View view2) {
        if (!this.f6781Z) {
            return true;
        }
        C1054s c1054sM6652u = m6652u(view, true);
        if (c1054sM6652u == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == c1054sM6652u.f6934b) {
            return true;
        }
        return false;
    }

    @Override // p024c.p088x.AbstractC1047m
    /* renamed from: H */
    public String[] mo6538H() {
        return f6771P;
    }

    @Override // p024c.p088x.AbstractC1047m
    /* renamed from: h */
    public void mo6539h(C1054s c1054s) {
        m6536k0(c1054s);
    }

    @Override // p024c.p088x.AbstractC1047m
    /* renamed from: k */
    public void mo6540k(C1054s c1054s) {
        m6536k0(c1054s);
    }

    @Override // p024c.p088x.AbstractC1047m
    /* renamed from: o */
    public Animator mo6541o(ViewGroup viewGroup, C1054s c1054s, C1054s c1054s2) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i2;
        View view;
        int i3;
        Rect rect;
        ObjectAnimator objectAnimator;
        Animator animatorM6675c;
        if (c1054s == null || c1054s2 == null) {
            return null;
        }
        Map<String, Object> map = c1054s.f6933a;
        Map<String, Object> map2 = c1054s2.f6933a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = c1054s2.f6934b;
        if (!m6537l0(viewGroup2, viewGroup3)) {
            int iIntValue = ((Integer) c1054s.f6933a.get("android:changeBounds:windowX")).intValue();
            int iIntValue2 = ((Integer) c1054s.f6933a.get("android:changeBounds:windowY")).intValue();
            int iIntValue3 = ((Integer) c1054s2.f6933a.get("android:changeBounds:windowX")).intValue();
            int iIntValue4 = ((Integer) c1054s2.f6933a.get("android:changeBounds:windowY")).intValue();
            if (iIntValue == iIntValue3 && iIntValue2 == iIntValue4) {
                return null;
            }
            viewGroup.getLocationInWindow(this.f6779X);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
            view2.draw(new Canvas(bitmapCreateBitmap));
            BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            float fM6563c = C1028c0.m6563c(view2);
            C1028c0.m6567g(view2, 0.0f);
            C1028c0.m6562b(viewGroup).mo6533a(bitmapDrawable);
            AbstractC1035g abstractC1035gM6654w = m6654w();
            int[] iArr = this.f6779X;
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, C1039i.m6593a(f6772Q, abstractC1035gM6654w.mo6589a(iIntValue - iArr[0], iIntValue2 - iArr[1], iIntValue3 - iArr[0], iIntValue4 - iArr[1])));
            objectAnimatorOfPropertyValuesHolder.addListener(new a(viewGroup, bitmapDrawable, view2, fM6563c));
            return objectAnimatorOfPropertyValuesHolder;
        }
        Rect rect2 = (Rect) c1054s.f6933a.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) c1054s2.f6933a.get("android:changeBounds:bounds");
        int i4 = rect2.left;
        int i5 = rect3.left;
        int i6 = rect2.top;
        int i7 = rect3.top;
        int i8 = rect2.right;
        int i9 = rect3.right;
        int i10 = rect2.bottom;
        int i11 = rect3.bottom;
        int i12 = i8 - i4;
        int i13 = i10 - i6;
        int i14 = i9 - i5;
        int i15 = i11 - i7;
        Rect rect4 = (Rect) c1054s.f6933a.get("android:changeBounds:clip");
        Rect rect5 = (Rect) c1054s2.f6933a.get("android:changeBounds:clip");
        if ((i12 == 0 || i13 == 0) && (i14 == 0 || i15 == 0)) {
            i2 = 0;
        } else {
            i2 = (i4 == i5 && i6 == i7) ? 0 : 1;
            if (i8 != i9 || i10 != i11) {
                i2++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i2++;
        }
        if (i2 <= 0) {
            return null;
        }
        if (this.f6780Y) {
            view = view2;
            C1028c0.m6566f(view, i4, i6, Math.max(i12, i14) + i4, Math.max(i13, i15) + i6);
            ObjectAnimator objectAnimatorM6587a = (i4 == i5 && i6 == i7) ? null : C1033f.m6587a(view, f6777V, m6654w().mo6589a(i4, i6, i5, i7));
            if (rect4 == null) {
                i3 = 0;
                rect = new Rect(0, 0, i12, i13);
            } else {
                i3 = 0;
                rect = rect4;
            }
            Rect rect6 = rect5 == null ? new Rect(i3, i3, i14, i15) : rect5;
            if (rect.equals(rect6)) {
                objectAnimator = null;
            } else {
                C0311u.m2145p0(view, rect);
                C1043k c1043k = f6778W;
                Object[] objArr = new Object[2];
                objArr[i3] = rect;
                objArr[1] = rect6;
                ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", c1043k, objArr);
                objectAnimatorOfObject.addListener(new i(view, rect5, i5, i7, i9, i11));
                objectAnimator = objectAnimatorOfObject;
            }
            animatorM6675c = C1053r.m6675c(objectAnimatorM6587a, objectAnimator);
        } else {
            view = view2;
            C1028c0.m6566f(view, i4, i6, i8, i10);
            if (i2 != 2) {
                animatorM6675c = (i4 == i5 && i6 == i7) ? C1033f.m6587a(view, f6775T, m6654w().mo6589a(i8, i10, i9, i11)) : C1033f.m6587a(view, f6776U, m6654w().mo6589a(i4, i6, i5, i7));
            } else if (i12 == i14 && i13 == i15) {
                animatorM6675c = C1033f.m6587a(view, f6777V, m6654w().mo6589a(i4, i6, i5, i7));
            } else {
                k kVar = new k(view);
                ObjectAnimator objectAnimatorM6587a2 = C1033f.m6587a(kVar, f6773R, m6654w().mo6589a(i4, i6, i5, i7));
                ObjectAnimator objectAnimatorM6587a3 = C1033f.m6587a(kVar, f6774S, m6654w().mo6589a(i8, i10, i9, i11));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorM6587a2, objectAnimatorM6587a3);
                animatorSet.addListener(new h(kVar));
                animatorM6675c = animatorSet;
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            C1059x.m6681c(viewGroup4, true);
            mo6633b(new j(viewGroup4));
        }
        return animatorM6675c;
    }
}
