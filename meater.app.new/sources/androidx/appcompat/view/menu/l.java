package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.O;
import java.lang.reflect.InvocationTargetException;

/* compiled from: StandardMenuPopup.java */
/* loaded from: classes.dex */
final class l extends h implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, j, View.OnKeyListener {

    /* renamed from: W, reason: collision with root package name */
    private static final int f21090W = i.g.f42538m;

    /* renamed from: C, reason: collision with root package name */
    private final Context f21091C;

    /* renamed from: D, reason: collision with root package name */
    private final e f21092D;

    /* renamed from: E, reason: collision with root package name */
    private final d f21093E;

    /* renamed from: F, reason: collision with root package name */
    private final boolean f21094F;

    /* renamed from: G, reason: collision with root package name */
    private final int f21095G;

    /* renamed from: H, reason: collision with root package name */
    private final int f21096H;

    /* renamed from: I, reason: collision with root package name */
    private final int f21097I;

    /* renamed from: J, reason: collision with root package name */
    final O f21098J;

    /* renamed from: M, reason: collision with root package name */
    private PopupWindow.OnDismissListener f21101M;

    /* renamed from: N, reason: collision with root package name */
    private View f21102N;

    /* renamed from: O, reason: collision with root package name */
    View f21103O;

    /* renamed from: P, reason: collision with root package name */
    private j.a f21104P;

    /* renamed from: Q, reason: collision with root package name */
    ViewTreeObserver f21105Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f21106R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f21107S;

    /* renamed from: T, reason: collision with root package name */
    private int f21108T;

    /* renamed from: V, reason: collision with root package name */
    private boolean f21110V;

    /* renamed from: K, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f21099K = new a();

    /* renamed from: L, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f21100L = new b();

    /* renamed from: U, reason: collision with root package name */
    private int f21109U = 0;

    /* compiled from: StandardMenuPopup.java */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (!l.this.a() || l.this.f21098J.B()) {
                return;
            }
            View view = l.this.f21103O;
            if (view == null || !view.isShown()) {
                l.this.dismiss();
            } else {
                l.this.f21098J.b();
            }
        }
    }

    public l(Context context, e eVar, View view, int i10, int i11, boolean z10) {
        this.f21091C = context;
        this.f21092D = eVar;
        this.f21094F = z10;
        this.f21093E = new d(eVar, LayoutInflater.from(context), z10, f21090W);
        this.f21096H = i10;
        this.f21097I = i11;
        Resources resources = context.getResources();
        this.f21095G = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(i.d.f42432d));
        this.f21102N = view;
        this.f21098J = new O(context, null, i10, i11);
        eVar.c(this, context);
    }

    private boolean C() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        View view;
        if (a()) {
            return true;
        }
        if (this.f21106R || (view = this.f21102N) == null) {
            return false;
        }
        this.f21103O = view;
        this.f21098J.K(this);
        this.f21098J.L(this);
        this.f21098J.J(true);
        View view2 = this.f21103O;
        boolean z10 = this.f21105Q == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f21105Q = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f21099K);
        }
        view2.addOnAttachStateChangeListener(this.f21100L);
        this.f21098J.D(view2);
        this.f21098J.G(this.f21109U);
        if (!this.f21107S) {
            this.f21108T = h.r(this.f21093E, null, this.f21091C, this.f21095G);
            this.f21107S = true;
        }
        this.f21098J.F(this.f21108T);
        this.f21098J.I(2);
        this.f21098J.H(q());
        this.f21098J.b();
        ListView listViewL = this.f21098J.l();
        listViewL.setOnKeyListener(this);
        if (this.f21110V && this.f21092D.z() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f21091C).inflate(i.g.f42537l, (ViewGroup) listViewL, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f21092D.z());
            }
            frameLayout.setEnabled(false);
            listViewL.addHeaderView(frameLayout, null, false);
        }
        this.f21098J.p(this.f21093E);
        this.f21098J.b();
        return true;
    }

    @Override // n.e
    public boolean a() {
        return !this.f21106R && this.f21098J.a();
    }

    @Override // n.e
    public void b() {
        if (!C()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void d(e eVar, boolean z10) {
        if (eVar != this.f21092D) {
            return;
        }
        dismiss();
        j.a aVar = this.f21104P;
        if (aVar != null) {
            aVar.d(eVar, z10);
        }
    }

    @Override // n.e
    public void dismiss() {
        if (a()) {
            this.f21098J.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void e(boolean z10) {
        this.f21107S = false;
        d dVar = this.f21093E;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean f() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void i(j.a aVar) {
        this.f21104P = aVar;
    }

    @Override // n.e
    public ListView l() {
        return this.f21098J.l();
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean m(m mVar) {
        if (mVar.hasVisibleItems()) {
            i iVar = new i(this.f21091C, mVar, this.f21103O, this.f21094F, this.f21096H, this.f21097I);
            iVar.j(this.f21104P);
            iVar.g(h.A(mVar));
            iVar.i(this.f21101M);
            this.f21101M = null;
            this.f21092D.e(false);
            int iD = this.f21098J.d();
            int iO = this.f21098J.o();
            if ((Gravity.getAbsoluteGravity(this.f21109U, this.f21102N.getLayoutDirection()) & 7) == 5) {
                iD += this.f21102N.getWidth();
            }
            if (iVar.n(iD, iO)) {
                j.a aVar = this.f21104P;
                if (aVar == null) {
                    return true;
                }
                aVar.e(mVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public Parcelable n() {
        return null;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f21106R = true;
        this.f21092D.close();
        ViewTreeObserver viewTreeObserver = this.f21105Q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f21105Q = this.f21103O.getViewTreeObserver();
            }
            this.f21105Q.removeGlobalOnLayoutListener(this.f21099K);
            this.f21105Q = null;
        }
        this.f21103O.removeOnAttachStateChangeListener(this.f21100L);
        PopupWindow.OnDismissListener onDismissListener = this.f21101M;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.h
    public void s(View view) {
        this.f21102N = view;
    }

    @Override // androidx.appcompat.view.menu.h
    public void u(boolean z10) {
        this.f21093E.d(z10);
    }

    @Override // androidx.appcompat.view.menu.h
    public void v(int i10) {
        this.f21109U = i10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void w(int i10) {
        this.f21098J.f(i10);
    }

    @Override // androidx.appcompat.view.menu.h
    public void x(PopupWindow.OnDismissListener onDismissListener) {
        this.f21101M = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.h
    public void y(boolean z10) {
        this.f21110V = z10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void z(int i10) {
        this.f21098J.k(i10);
    }

    /* compiled from: StandardMenuPopup.java */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = l.this.f21105Q;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    l.this.f21105Q = view.getViewTreeObserver();
                }
                l lVar = l.this;
                lVar.f21105Q.removeGlobalOnLayoutListener(lVar.f21099K);
            }
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void k(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.h
    public void o(e eVar) {
    }
}
