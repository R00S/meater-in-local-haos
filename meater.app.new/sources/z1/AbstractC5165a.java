package z1;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.List;
import s.Y;
import s1.C4421a;
import s1.X;
import t1.t;
import t1.u;
import t1.v;
import z1.C5166b;

/* compiled from: ExploreByTouchHelper.java */
/* renamed from: z1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5165a extends C4421a {

    /* renamed from: n, reason: collision with root package name */
    private static final Rect f53333n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o, reason: collision with root package name */
    private static final C5166b.a<t> f53334o = new C0785a();

    /* renamed from: p, reason: collision with root package name */
    private static final C5166b.InterfaceC0786b<Y<t>, t> f53335p = new b();

    /* renamed from: h, reason: collision with root package name */
    private final AccessibilityManager f53340h;

    /* renamed from: i, reason: collision with root package name */
    private final View f53341i;

    /* renamed from: j, reason: collision with root package name */
    private c f53342j;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f53336d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    private final Rect f53337e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    private final Rect f53338f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    private final int[] f53339g = new int[2];

    /* renamed from: k, reason: collision with root package name */
    int f53343k = Integer.MIN_VALUE;

    /* renamed from: l, reason: collision with root package name */
    int f53344l = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    private int f53345m = Integer.MIN_VALUE;

    /* compiled from: ExploreByTouchHelper.java */
    /* renamed from: z1.a$a, reason: collision with other inner class name */
    class C0785a implements C5166b.a<t> {
        C0785a() {
        }

        @Override // z1.C5166b.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(t tVar, Rect rect) {
            tVar.k(rect);
        }
    }

    /* compiled from: ExploreByTouchHelper.java */
    /* renamed from: z1.a$b */
    class b implements C5166b.InterfaceC0786b<Y<t>, t> {
        b() {
        }

        @Override // z1.C5166b.InterfaceC0786b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public t a(Y<t> y10, int i10) {
            return y10.r(i10);
        }

        @Override // z1.C5166b.InterfaceC0786b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int b(Y<t> y10) {
            return y10.q();
        }
    }

    /* compiled from: ExploreByTouchHelper.java */
    /* renamed from: z1.a$c */
    private class c extends u {
        c() {
        }

        @Override // t1.u
        public t b(int i10) {
            return t.W(AbstractC5165a.this.H(i10));
        }

        @Override // t1.u
        public t d(int i10) {
            int i11 = i10 == 2 ? AbstractC5165a.this.f53343k : AbstractC5165a.this.f53344l;
            if (i11 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i11);
        }

        @Override // t1.u
        public boolean f(int i10, int i11, Bundle bundle) {
            return AbstractC5165a.this.P(i10, i11, bundle);
        }
    }

    public AbstractC5165a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f53341i = view;
        this.f53340h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (X.x(view) == 0) {
            X.x0(view, 1);
        }
    }

    private static Rect D(View view, int i10, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i10 == 17) {
            rect.set(width, 0, width, height);
        } else if (i10 == 33) {
            rect.set(0, height, width, height);
        } else if (i10 == 66) {
            rect.set(-1, 0, -1, height);
        } else {
            if (i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            rect.set(0, -1, width, -1);
        }
        return rect;
    }

    private boolean E(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f53341i.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.f53341i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    private static int F(int i10) {
        if (i10 == 19) {
            return 33;
        }
        if (i10 != 21) {
            return i10 != 22 ? 130 : 66;
        }
        return 17;
    }

    private boolean G(int i10, Rect rect) {
        t tVar;
        Y<t> y10 = y();
        int i11 = this.f53344l;
        t tVarG = i11 == Integer.MIN_VALUE ? null : y10.g(i11);
        if (i10 == 1 || i10 == 2) {
            tVar = (t) C5166b.d(y10, f53335p, f53334o, tVarG, i10, X.z(this.f53341i) == 1, false);
        } else {
            if (i10 != 17 && i10 != 33 && i10 != 66 && i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i12 = this.f53344l;
            if (i12 != Integer.MIN_VALUE) {
                z(i12, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                D(this.f53341i, i10, rect2);
            }
            tVar = (t) C5166b.c(y10, f53335p, f53334o, tVarG, rect2, i10);
        }
        return T(tVar != null ? y10.m(y10.k(tVar)) : Integer.MIN_VALUE);
    }

    private boolean Q(int i10, int i11, Bundle bundle) {
        return i11 != 1 ? i11 != 2 ? i11 != 64 ? i11 != 128 ? J(i10, i11, bundle) : n(i10) : S(i10) : o(i10) : T(i10);
    }

    private boolean R(int i10, Bundle bundle) {
        return X.c0(this.f53341i, i10, bundle);
    }

    private boolean S(int i10) {
        int i11;
        if (!this.f53340h.isEnabled() || !this.f53340h.isTouchExplorationEnabled() || (i11 = this.f53343k) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            n(i11);
        }
        this.f53343k = i10;
        this.f53341i.invalidate();
        U(i10, 32768);
        return true;
    }

    private void V(int i10) {
        int i11 = this.f53345m;
        if (i11 == i10) {
            return;
        }
        this.f53345m = i10;
        U(i10, 128);
        U(i11, 256);
    }

    private boolean n(int i10) {
        if (this.f53343k != i10) {
            return false;
        }
        this.f53343k = Integer.MIN_VALUE;
        this.f53341i.invalidate();
        U(i10, 65536);
        return true;
    }

    private boolean p() {
        int i10 = this.f53344l;
        return i10 != Integer.MIN_VALUE && J(i10, 16, null);
    }

    private AccessibilityEvent q(int i10, int i11) {
        return i10 != -1 ? r(i10, i11) : s(i11);
    }

    private AccessibilityEvent r(int i10, int i11) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i11);
        t tVarH = H(i10);
        accessibilityEventObtain.getText().add(tVarH.y());
        accessibilityEventObtain.setContentDescription(tVarH.r());
        accessibilityEventObtain.setScrollable(tVarH.P());
        accessibilityEventObtain.setPassword(tVarH.O());
        accessibilityEventObtain.setEnabled(tVarH.I());
        accessibilityEventObtain.setChecked(tVarH.F());
        L(i10, accessibilityEventObtain);
        if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain.setClassName(tVarH.o());
        v.c(accessibilityEventObtain, this.f53341i, i10);
        accessibilityEventObtain.setPackageName(this.f53341i.getContext().getPackageName());
        return accessibilityEventObtain;
    }

    private AccessibilityEvent s(int i10) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i10);
        this.f53341i.onInitializeAccessibilityEvent(accessibilityEventObtain);
        return accessibilityEventObtain;
    }

    private t t(int i10) {
        t tVarU = t.U();
        tVarU.p0(true);
        tVarU.r0(true);
        tVarU.h0("android.view.View");
        Rect rect = f53333n;
        tVarU.d0(rect);
        tVarU.e0(rect);
        tVarU.E0(this.f53341i);
        N(i10, tVarU);
        if (tVarU.y() == null && tVarU.r() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        tVarU.k(this.f53337e);
        if (this.f53337e.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int i11 = tVarU.i();
        if ((i11 & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((i11 & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        tVarU.C0(this.f53341i.getContext().getPackageName());
        tVarU.N0(this.f53341i, i10);
        if (this.f53343k == i10) {
            tVarU.a0(true);
            tVarU.a(128);
        } else {
            tVarU.a0(false);
            tVarU.a(64);
        }
        boolean z10 = this.f53344l == i10;
        if (z10) {
            tVarU.a(2);
        } else if (tVarU.J()) {
            tVarU.a(1);
        }
        tVarU.s0(z10);
        this.f53341i.getLocationOnScreen(this.f53339g);
        tVarU.l(this.f53336d);
        if (this.f53336d.equals(rect)) {
            tVarU.k(this.f53336d);
            if (tVarU.f49754b != -1) {
                t tVarU2 = t.U();
                for (int i12 = tVarU.f49754b; i12 != -1; i12 = tVarU2.f49754b) {
                    tVarU2.F0(this.f53341i, -1);
                    tVarU2.d0(f53333n);
                    N(i12, tVarU2);
                    tVarU2.k(this.f53337e);
                    Rect rect2 = this.f53336d;
                    Rect rect3 = this.f53337e;
                    rect2.offset(rect3.left, rect3.top);
                }
                tVarU2.Y();
            }
            this.f53336d.offset(this.f53339g[0] - this.f53341i.getScrollX(), this.f53339g[1] - this.f53341i.getScrollY());
        }
        if (this.f53341i.getLocalVisibleRect(this.f53338f)) {
            this.f53338f.offset(this.f53339g[0] - this.f53341i.getScrollX(), this.f53339g[1] - this.f53341i.getScrollY());
            if (this.f53336d.intersect(this.f53338f)) {
                tVarU.e0(this.f53336d);
                if (E(this.f53336d)) {
                    tVarU.W0(true);
                }
            }
        }
        return tVarU;
    }

    private t u() {
        t tVarV = t.V(this.f53341i);
        X.a0(this.f53341i, tVarV);
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        if (tVarV.n() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            tVarV.d(this.f53341i, ((Integer) arrayList.get(i10)).intValue());
        }
        return tVarV;
    }

    private Y<t> y() {
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        Y<t> y10 = new Y<>();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            y10.n(arrayList.get(i10).intValue(), t(arrayList.get(i10).intValue()));
        }
        return y10;
    }

    private void z(int i10, Rect rect) {
        H(i10).k(rect);
    }

    public final int A() {
        return this.f53344l;
    }

    protected abstract int B(float f10, float f11);

    protected abstract void C(List<Integer> list);

    t H(int i10) {
        return i10 == -1 ? u() : t(i10);
    }

    public final void I(boolean z10, int i10, Rect rect) {
        int i11 = this.f53344l;
        if (i11 != Integer.MIN_VALUE) {
            o(i11);
        }
        if (z10) {
            G(i10, rect);
        }
    }

    protected abstract boolean J(int i10, int i11, Bundle bundle);

    protected abstract void M(t tVar);

    protected abstract void N(int i10, t tVar);

    protected abstract void O(int i10, boolean z10);

    boolean P(int i10, int i11, Bundle bundle) {
        return i10 != -1 ? Q(i10, i11, bundle) : R(i11, bundle);
    }

    public final boolean T(int i10) {
        int i11;
        if ((!this.f53341i.isFocused() && !this.f53341i.requestFocus()) || (i11 = this.f53344l) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            o(i11);
        }
        if (i10 == Integer.MIN_VALUE) {
            return false;
        }
        this.f53344l = i10;
        O(i10, true);
        U(i10, 8);
        return true;
    }

    public final boolean U(int i10, int i11) {
        ViewParent parent;
        if (i10 == Integer.MIN_VALUE || !this.f53340h.isEnabled() || (parent = this.f53341i.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f53341i, q(i10, i11));
    }

    @Override // s1.C4421a
    public u b(View view) {
        if (this.f53342j == null) {
            this.f53342j = new c();
        }
        return this.f53342j;
    }

    @Override // s1.C4421a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        K(accessibilityEvent);
    }

    @Override // s1.C4421a
    public void g(View view, t tVar) {
        super.g(view, tVar);
        M(tVar);
    }

    public final boolean o(int i10) {
        if (this.f53344l != i10) {
            return false;
        }
        this.f53344l = Integer.MIN_VALUE;
        O(i10, false);
        U(i10, 8);
        return true;
    }

    public final boolean v(MotionEvent motionEvent) {
        if (!this.f53340h.isEnabled() || !this.f53340h.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int iB = B(motionEvent.getX(), motionEvent.getY());
            V(iB);
            return iB != Integer.MIN_VALUE;
        }
        if (action != 10 || this.f53345m == Integer.MIN_VALUE) {
            return false;
        }
        V(Integer.MIN_VALUE);
        return true;
    }

    public final boolean w(KeyEvent keyEvent) {
        int i10 = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 61) {
            if (keyEvent.hasNoModifiers()) {
                return G(2, null);
            }
            if (keyEvent.hasModifiers(1)) {
                return G(1, null);
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
                    int iF = F(keyCode);
                    int repeatCount = keyEvent.getRepeatCount() + 1;
                    boolean z10 = false;
                    while (i10 < repeatCount && G(iF, null)) {
                        i10++;
                        z10 = true;
                    }
                    return z10;
                case 23:
                    break;
                default:
                    return false;
            }
        }
        if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
            return false;
        }
        p();
        return true;
    }

    public final int x() {
        return this.f53343k;
    }

    protected void K(AccessibilityEvent accessibilityEvent) {
    }

    protected void L(int i10, AccessibilityEvent accessibilityEvent) {
    }
}
