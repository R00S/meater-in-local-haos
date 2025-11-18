package p024c.p062k.p063a;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.C0280a;
import androidx.core.view.C0311u;
import androidx.core.view.C0314x;
import androidx.core.view.p004d0.C0289c;
import androidx.core.view.p004d0.C0290d;
import androidx.core.view.p004d0.C0291e;
import java.util.ArrayList;
import java.util.List;
import p024c.p041e.C0874h;
import p024c.p062k.p063a.C0965b;

/* compiled from: ExploreByTouchHelper.java */
/* renamed from: c.k.a.a */
/* loaded from: classes.dex */
public abstract class AbstractC0964a extends C0280a {

    /* renamed from: d */
    private static final Rect f6418d = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: e */
    private static final C0965b.a<C0289c> f6419e = new a();

    /* renamed from: f */
    private static final C0965b.b<C0874h<C0289c>, C0289c> f6420f = new b();

    /* renamed from: k */
    private final AccessibilityManager f6425k;

    /* renamed from: l */
    private final View f6426l;

    /* renamed from: m */
    private c f6427m;

    /* renamed from: g */
    private final Rect f6421g = new Rect();

    /* renamed from: h */
    private final Rect f6422h = new Rect();

    /* renamed from: i */
    private final Rect f6423i = new Rect();

    /* renamed from: j */
    private final int[] f6424j = new int[2];

    /* renamed from: n */
    int f6428n = Integer.MIN_VALUE;

    /* renamed from: o */
    int f6429o = Integer.MIN_VALUE;

    /* renamed from: p */
    private int f6430p = Integer.MIN_VALUE;

    /* compiled from: ExploreByTouchHelper.java */
    /* renamed from: c.k.a.a$a */
    static class a implements C0965b.a<C0289c> {
        a() {
        }

        @Override // p024c.p062k.p063a.C0965b.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6108a(C0289c c0289c, Rect rect) {
            c0289c.m1989l(rect);
        }
    }

    /* compiled from: ExploreByTouchHelper.java */
    /* renamed from: c.k.a.a$b */
    static class b implements C0965b.b<C0874h<C0289c>, C0289c> {
        b() {
        }

        @Override // p024c.p062k.p063a.C0965b.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C0289c mo6110a(C0874h<C0289c> c0874h, int i2) {
            return c0874h.m5488m(i2);
        }

        @Override // p024c.p062k.p063a.C0965b.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int mo6111b(C0874h<C0289c> c0874h) {
            return c0874h.m5487l();
        }
    }

    /* compiled from: ExploreByTouchHelper.java */
    /* renamed from: c.k.a.a$c */
    private class c extends C0290d {
        c() {
        }

        @Override // androidx.core.view.p004d0.C0290d
        /* renamed from: b */
        public C0289c mo2024b(int i2) {
            return C0289c.m1937N(AbstractC0964a.this.m6093H(i2));
        }

        @Override // androidx.core.view.p004d0.C0290d
        /* renamed from: d */
        public C0289c mo2026d(int i2) {
            int i3 = i2 == 2 ? AbstractC0964a.this.f6428n : AbstractC0964a.this.f6429o;
            if (i3 == Integer.MIN_VALUE) {
                return null;
            }
            return mo2024b(i3);
        }

        @Override // androidx.core.view.p004d0.C0290d
        /* renamed from: f */
        public boolean mo2028f(int i2, int i3, Bundle bundle) {
            return AbstractC0964a.this.m6101P(i2, i3, bundle);
        }
    }

    public AbstractC0964a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f6426l = view;
        this.f6425k = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (C0311u.m2158w(view) == 0) {
            C0311u.m2153t0(view, 1);
        }
    }

    /* renamed from: D */
    private static Rect m6073D(View view, int i2, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i2 == 17) {
            rect.set(width, 0, width, height);
        } else if (i2 == 33) {
            rect.set(0, height, width, height);
        } else if (i2 == 66) {
            rect.set(-1, 0, -1, height);
        } else {
            if (i2 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            rect.set(0, -1, width, -1);
        }
        return rect;
    }

    /* renamed from: E */
    private boolean m6074E(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f6426l.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.f6426l.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    /* renamed from: F */
    private static int m6075F(int i2) {
        if (i2 == 19) {
            return 33;
        }
        if (i2 != 21) {
            return i2 != 22 ? 130 : 66;
        }
        return 17;
    }

    /* renamed from: G */
    private boolean m6076G(int i2, Rect rect) {
        C0289c c0289c;
        C0874h<C0289c> c0874hM6088y = m6088y();
        int i3 = this.f6429o;
        C0289c c0289cM5482g = i3 == Integer.MIN_VALUE ? null : c0874hM6088y.m5482g(i3);
        if (i2 == 1 || i2 == 2) {
            c0289c = (C0289c) C0965b.m6117d(c0874hM6088y, f6420f, f6419e, c0289cM5482g, i2, C0311u.m2162y(this.f6426l) == 1, false);
        } else {
            if (i2 != 17 && i2 != 33 && i2 != 66 && i2 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i4 = this.f6429o;
            if (i4 != Integer.MIN_VALUE) {
                m6089z(i4, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                m6073D(this.f6426l, i2, rect2);
            }
            c0289c = (C0289c) C0965b.m6116c(c0874hM6088y, f6420f, f6419e, c0289cM5482g, rect2, i2);
        }
        return m6102T(c0289c != null ? c0874hM6088y.m5485j(c0874hM6088y.m5484i(c0289c)) : Integer.MIN_VALUE);
    }

    /* renamed from: Q */
    private boolean m6077Q(int i2, int i3, Bundle bundle) {
        return i3 != 1 ? i3 != 2 ? i3 != 64 ? i3 != 128 ? mo6095J(i2, i3, bundle) : m6081n(i2) : m6079S(i2) : m6104o(i2) : m6102T(i2);
    }

    /* renamed from: R */
    private boolean m6078R(int i2, Bundle bundle) {
        return C0311u.m2112Y(this.f6426l, i2, bundle);
    }

    /* renamed from: S */
    private boolean m6079S(int i2) {
        int i3;
        if (!this.f6425k.isEnabled() || !this.f6425k.isTouchExplorationEnabled() || (i3 = this.f6428n) == i2) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            m6081n(i3);
        }
        this.f6428n = i2;
        this.f6426l.invalidate();
        m6103U(i2, 32768);
        return true;
    }

    /* renamed from: V */
    private void m6080V(int i2) {
        int i3 = this.f6430p;
        if (i3 == i2) {
            return;
        }
        this.f6430p = i2;
        m6103U(i2, 128);
        m6103U(i3, 256);
    }

    /* renamed from: n */
    private boolean m6081n(int i2) {
        if (this.f6428n != i2) {
            return false;
        }
        this.f6428n = Integer.MIN_VALUE;
        this.f6426l.invalidate();
        m6103U(i2, 65536);
        return true;
    }

    /* renamed from: p */
    private boolean m6082p() {
        int i2 = this.f6429o;
        return i2 != Integer.MIN_VALUE && mo6095J(i2, 16, null);
    }

    /* renamed from: q */
    private AccessibilityEvent m6083q(int i2, int i3) {
        return i2 != -1 ? m6084r(i2, i3) : m6085s(i3);
    }

    /* renamed from: r */
    private AccessibilityEvent m6084r(int i2, int i3) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i3);
        C0289c c0289cM6093H = m6093H(i2);
        accessibilityEventObtain.getText().add(c0289cM6093H.m2008w());
        accessibilityEventObtain.setContentDescription(c0289cM6093H.m2000r());
        accessibilityEventObtain.setScrollable(c0289cM6093H.m1959I());
        accessibilityEventObtain.setPassword(c0289cM6093H.m1958H());
        accessibilityEventObtain.setEnabled(c0289cM6093H.m1954D());
        accessibilityEventObtain.setChecked(c0289cM6093H.m1952B());
        m6097L(i2, accessibilityEventObtain);
        if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain.setClassName(c0289cM6093H.m1995o());
        C0291e.m2031c(accessibilityEventObtain, this.f6426l, i2);
        accessibilityEventObtain.setPackageName(this.f6426l.getContext().getPackageName());
        return accessibilityEventObtain;
    }

    /* renamed from: s */
    private AccessibilityEvent m6085s(int i2) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        this.f6426l.onInitializeAccessibilityEvent(accessibilityEventObtain);
        return accessibilityEventObtain;
    }

    /* renamed from: t */
    private C0289c m6086t(int i2) {
        C0289c c0289cM1935L = C0289c.m1935L();
        c0289cM1935L.m1980e0(true);
        c0289cM1935L.m1982g0(true);
        c0289cM1935L.m1970Y("android.view.View");
        Rect rect = f6418d;
        c0289cM1935L.m1966U(rect);
        c0289cM1935L.m1967V(rect);
        c0289cM1935L.m1994n0(this.f6426l);
        mo6099N(i2, c0289cM1935L);
        if (c0289cM1935L.m2008w() == null && c0289cM1935L.m2000r() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        c0289cM1935L.m1989l(this.f6422h);
        if (this.f6422h.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int iM1986j = c0289cM1935L.m1986j();
        if ((iM1986j & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((iM1986j & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        c0289cM1935L.m1990l0(this.f6426l.getContext().getPackageName());
        c0289cM1935L.m2004t0(this.f6426l, i2);
        if (this.f6428n == i2) {
            c0289cM1935L.m1965S(true);
            c0289cM1935L.m1972a(128);
        } else {
            c0289cM1935L.m1965S(false);
            c0289cM1935L.m1972a(64);
        }
        boolean z = this.f6429o == i2;
        if (z) {
            c0289cM1935L.m1972a(2);
        } else if (c0289cM1935L.m1955E()) {
            c0289cM1935L.m1972a(1);
        }
        c0289cM1935L.m1984h0(z);
        this.f6426l.getLocationOnScreen(this.f6424j);
        c0289cM1935L.m1991m(this.f6421g);
        if (this.f6421g.equals(rect)) {
            c0289cM1935L.m1989l(this.f6421g);
            if (c0289cM1935L.f2333c != -1) {
                C0289c c0289cM1935L2 = C0289c.m1935L();
                for (int i3 = c0289cM1935L.f2333c; i3 != -1; i3 = c0289cM1935L2.f2333c) {
                    c0289cM1935L2.m1996o0(this.f6426l, -1);
                    c0289cM1935L2.m1966U(f6418d);
                    mo6099N(i3, c0289cM1935L2);
                    c0289cM1935L2.m1989l(this.f6422h);
                    Rect rect2 = this.f6421g;
                    Rect rect3 = this.f6422h;
                    rect2.offset(rect3.left, rect3.top);
                }
                c0289cM1935L2.m1963P();
            }
            this.f6421g.offset(this.f6424j[0] - this.f6426l.getScrollX(), this.f6424j[1] - this.f6426l.getScrollY());
        }
        if (this.f6426l.getLocalVisibleRect(this.f6423i)) {
            this.f6423i.offset(this.f6424j[0] - this.f6426l.getScrollX(), this.f6424j[1] - this.f6426l.getScrollY());
            if (this.f6421g.intersect(this.f6423i)) {
                c0289cM1935L.m1967V(this.f6421g);
                if (m6074E(this.f6421g)) {
                    c0289cM1935L.m2009w0(true);
                }
            }
        }
        return c0289cM1935L;
    }

    /* renamed from: u */
    private C0289c m6087u() {
        C0289c c0289cM1936M = C0289c.m1936M(this.f6426l);
        C0311u.m2110W(this.f6426l, c0289cM1936M);
        ArrayList arrayList = new ArrayList();
        mo6092C(arrayList);
        if (c0289cM1936M.m1993n() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            c0289cM1936M.m1976c(this.f6426l, ((Integer) arrayList.get(i2)).intValue());
        }
        return c0289cM1936M;
    }

    /* renamed from: y */
    private C0874h<C0289c> m6088y() {
        ArrayList arrayList = new ArrayList();
        mo6092C(arrayList);
        C0874h<C0289c> c0874h = new C0874h<>();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            c0874h.m5486k(i2, m6086t(i2));
        }
        return c0874h;
    }

    /* renamed from: z */
    private void m6089z(int i2, Rect rect) {
        m6093H(i2).m1989l(rect);
    }

    /* renamed from: A */
    public final int m6090A() {
        return this.f6429o;
    }

    /* renamed from: B */
    protected abstract int mo6091B(float f2, float f3);

    /* renamed from: C */
    protected abstract void mo6092C(List<Integer> list);

    /* renamed from: H */
    C0289c m6093H(int i2) {
        return i2 == -1 ? m6087u() : m6086t(i2);
    }

    /* renamed from: I */
    public final void m6094I(boolean z, int i2, Rect rect) {
        int i3 = this.f6429o;
        if (i3 != Integer.MIN_VALUE) {
            m6104o(i3);
        }
        if (z) {
            m6076G(i2, rect);
        }
    }

    /* renamed from: J */
    protected abstract boolean mo6095J(int i2, int i3, Bundle bundle);

    /* renamed from: K */
    protected void m6096K(AccessibilityEvent accessibilityEvent) {
    }

    /* renamed from: L */
    protected void m6097L(int i2, AccessibilityEvent accessibilityEvent) {
    }

    /* renamed from: M */
    protected void mo6098M(C0289c c0289c) {
    }

    /* renamed from: N */
    protected abstract void mo6099N(int i2, C0289c c0289c);

    /* renamed from: O */
    protected void mo6100O(int i2, boolean z) {
    }

    /* renamed from: P */
    boolean m6101P(int i2, int i3, Bundle bundle) {
        return i2 != -1 ? m6077Q(i2, i3, bundle) : m6078R(i3, bundle);
    }

    /* renamed from: T */
    public final boolean m6102T(int i2) {
        int i3;
        if ((!this.f6426l.isFocused() && !this.f6426l.requestFocus()) || (i3 = this.f6429o) == i2) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            m6104o(i3);
        }
        this.f6429o = i2;
        mo6100O(i2, true);
        m6103U(i2, 8);
        return true;
    }

    /* renamed from: U */
    public final boolean m6103U(int i2, int i3) {
        ViewParent parent;
        if (i2 == Integer.MIN_VALUE || !this.f6425k.isEnabled() || (parent = this.f6426l.getParent()) == null) {
            return false;
        }
        return C0314x.m2215h(parent, this.f6426l, m6083q(i2, i3));
    }

    @Override // androidx.core.view.C0280a
    /* renamed from: b */
    public C0290d mo1855b(View view) {
        if (this.f6427m == null) {
            this.f6427m = new c();
        }
        return this.f6427m;
    }

    @Override // androidx.core.view.C0280a
    /* renamed from: f */
    public void mo1857f(View view, AccessibilityEvent accessibilityEvent) {
        super.mo1857f(view, accessibilityEvent);
        m6096K(accessibilityEvent);
    }

    @Override // androidx.core.view.C0280a
    /* renamed from: g */
    public void mo1858g(View view, C0289c c0289c) {
        super.mo1858g(view, c0289c);
        mo6098M(c0289c);
    }

    /* renamed from: o */
    public final boolean m6104o(int i2) {
        if (this.f6429o != i2) {
            return false;
        }
        this.f6429o = Integer.MIN_VALUE;
        mo6100O(i2, false);
        m6103U(i2, 8);
        return true;
    }

    /* renamed from: v */
    public final boolean m6105v(MotionEvent motionEvent) {
        if (!this.f6425k.isEnabled() || !this.f6425k.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int iMo6091B = mo6091B(motionEvent.getX(), motionEvent.getY());
            m6080V(iMo6091B);
            return iMo6091B != Integer.MIN_VALUE;
        }
        if (action != 10 || this.f6430p == Integer.MIN_VALUE) {
            return false;
        }
        m6080V(Integer.MIN_VALUE);
        return true;
    }

    /* renamed from: w */
    public final boolean m6106w(KeyEvent keyEvent) {
        int i2 = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 61) {
            if (keyEvent.hasNoModifiers()) {
                return m6076G(2, null);
            }
            if (keyEvent.hasModifiers(1)) {
                return m6076G(1, null);
            }
            return false;
        }
        if (keyCode != 66) {
            switch (keyCode) {
                case 19:
                case 20:
                case 21:
                case 22:
                    if (!keyEvent.hasNoModifiers()) {
                        return false;
                    }
                    int iM6075F = m6075F(keyCode);
                    int repeatCount = keyEvent.getRepeatCount() + 1;
                    boolean z = false;
                    while (i2 < repeatCount && m6076G(iM6075F, null)) {
                        i2++;
                        z = true;
                    }
                    return z;
                case 23:
                    break;
                default:
                    return false;
            }
        }
        if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
            return false;
        }
        m6082p();
        return true;
    }

    /* renamed from: x */
    public final int m6107x() {
        return this.f6428n;
    }
}
