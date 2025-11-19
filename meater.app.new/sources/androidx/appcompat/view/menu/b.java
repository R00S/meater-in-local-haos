package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.N;
import androidx.appcompat.widget.O;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import s1.C4456s;

/* compiled from: CascadingMenuPopup.java */
/* loaded from: classes.dex */
final class b extends h implements j, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: c0, reason: collision with root package name */
    private static final int f20958c0 = i.g.f42530e;

    /* renamed from: C, reason: collision with root package name */
    private final Context f20959C;

    /* renamed from: D, reason: collision with root package name */
    private final int f20960D;

    /* renamed from: E, reason: collision with root package name */
    private final int f20961E;

    /* renamed from: F, reason: collision with root package name */
    private final int f20962F;

    /* renamed from: G, reason: collision with root package name */
    private final boolean f20963G;

    /* renamed from: H, reason: collision with root package name */
    final Handler f20964H;

    /* renamed from: P, reason: collision with root package name */
    private View f20972P;

    /* renamed from: Q, reason: collision with root package name */
    View f20973Q;

    /* renamed from: S, reason: collision with root package name */
    private boolean f20975S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f20976T;

    /* renamed from: U, reason: collision with root package name */
    private int f20977U;

    /* renamed from: V, reason: collision with root package name */
    private int f20978V;

    /* renamed from: X, reason: collision with root package name */
    private boolean f20980X;

    /* renamed from: Y, reason: collision with root package name */
    private j.a f20981Y;

    /* renamed from: Z, reason: collision with root package name */
    ViewTreeObserver f20982Z;

    /* renamed from: a0, reason: collision with root package name */
    private PopupWindow.OnDismissListener f20983a0;

    /* renamed from: b0, reason: collision with root package name */
    boolean f20984b0;

    /* renamed from: I, reason: collision with root package name */
    private final List<e> f20965I = new ArrayList();

    /* renamed from: J, reason: collision with root package name */
    final List<d> f20966J = new ArrayList();

    /* renamed from: K, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f20967K = new a();

    /* renamed from: L, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f20968L = new ViewOnAttachStateChangeListenerC0301b();

    /* renamed from: M, reason: collision with root package name */
    private final N f20969M = new c();

    /* renamed from: N, reason: collision with root package name */
    private int f20970N = 0;

    /* renamed from: O, reason: collision with root package name */
    private int f20971O = 0;

    /* renamed from: W, reason: collision with root package name */
    private boolean f20979W = false;

    /* renamed from: R, reason: collision with root package name */
    private int f20974R = G();

    /* compiled from: CascadingMenuPopup.java */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (!b.this.a() || b.this.f20966J.size() <= 0 || b.this.f20966J.get(0).f20992a.B()) {
                return;
            }
            View view = b.this.f20973Q;
            if (view == null || !view.isShown()) {
                b.this.dismiss();
                return;
            }
            Iterator<d> it = b.this.f20966J.iterator();
            while (it.hasNext()) {
                it.next().f20992a.b();
            }
        }
    }

    /* compiled from: CascadingMenuPopup.java */
    class c implements N {

        /* compiled from: CascadingMenuPopup.java */
        class a implements Runnable {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ d f20988B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ MenuItem f20989C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ e f20990D;

            a(d dVar, MenuItem menuItem, e eVar) {
                this.f20988B = dVar;
                this.f20989C = menuItem;
                this.f20990D = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f20988B;
                if (dVar != null) {
                    b.this.f20984b0 = true;
                    dVar.f20993b.e(false);
                    b.this.f20984b0 = false;
                }
                if (this.f20989C.isEnabled() && this.f20989C.hasSubMenu()) {
                    this.f20990D.O(this.f20989C, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.N
        public void e(e eVar, MenuItem menuItem) {
            b.this.f20964H.removeCallbacksAndMessages(null);
            int size = b.this.f20966J.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                } else if (eVar == b.this.f20966J.get(i10).f20993b) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 == -1) {
                return;
            }
            int i11 = i10 + 1;
            b.this.f20964H.postAtTime(new a(i11 < b.this.f20966J.size() ? b.this.f20966J.get(i11) : null, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.N
        public void h(e eVar, MenuItem menuItem) {
            b.this.f20964H.removeCallbacksAndMessages(eVar);
        }
    }

    /* compiled from: CascadingMenuPopup.java */
    private static class d {

        /* renamed from: a, reason: collision with root package name */
        public final O f20992a;

        /* renamed from: b, reason: collision with root package name */
        public final e f20993b;

        /* renamed from: c, reason: collision with root package name */
        public final int f20994c;

        public d(O o10, e eVar, int i10) {
            this.f20992a = o10;
            this.f20993b = eVar;
            this.f20994c = i10;
        }

        public ListView a() {
            return this.f20992a.l();
        }
    }

    public b(Context context, View view, int i10, int i11, boolean z10) {
        this.f20959C = context;
        this.f20972P = view;
        this.f20961E = i10;
        this.f20962F = i11;
        this.f20963G = z10;
        Resources resources = context.getResources();
        this.f20960D = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(i.d.f42432d));
        this.f20964H = new Handler();
    }

    private O C() {
        O o10 = new O(this.f20959C, null, this.f20961E, this.f20962F);
        o10.U(this.f20969M);
        o10.L(this);
        o10.K(this);
        o10.D(this.f20972P);
        o10.G(this.f20971O);
        o10.J(true);
        o10.I(2);
        return o10;
    }

    private int D(e eVar) {
        int size = this.f20966J.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (eVar == this.f20966J.get(i10).f20993b) {
                return i10;
            }
        }
        return -1;
    }

    private MenuItem E(e eVar, e eVar2) {
        int size = eVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = eVar.getItem(i10);
            if (item.hasSubMenu() && eVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View F(d dVar, e eVar) {
        androidx.appcompat.view.menu.d dVar2;
        int headersCount;
        int firstVisiblePosition;
        MenuItem menuItemE = E(dVar.f20993b, eVar);
        if (menuItemE == null) {
            return null;
        }
        ListView listViewA = dVar.a();
        ListAdapter adapter = listViewA.getAdapter();
        int i10 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            dVar2 = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
        } else {
            dVar2 = (androidx.appcompat.view.menu.d) adapter;
            headersCount = 0;
        }
        int count = dVar2.getCount();
        while (true) {
            if (i10 >= count) {
                i10 = -1;
                break;
            }
            if (menuItemE == dVar2.getItem(i10)) {
                break;
            }
            i10++;
        }
        if (i10 != -1 && (firstVisiblePosition = (i10 + headersCount) - listViewA.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewA.getChildCount()) {
            return listViewA.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int G() {
        return this.f20972P.getLayoutDirection() == 1 ? 0 : 1;
    }

    private int H(int i10) {
        List<d> list = this.f20966J;
        ListView listViewA = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        listViewA.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f20973Q.getWindowVisibleDisplayFrame(rect);
        return this.f20974R == 1 ? (iArr[0] + listViewA.getWidth()) + i10 > rect.right ? 0 : 1 : iArr[0] - i10 < 0 ? 1 : 0;
    }

    private void I(e eVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        d dVar;
        View viewF;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f20959C);
        androidx.appcompat.view.menu.d dVar2 = new androidx.appcompat.view.menu.d(eVar, layoutInflaterFrom, this.f20963G, f20958c0);
        if (!a() && this.f20979W) {
            dVar2.d(true);
        } else if (a()) {
            dVar2.d(h.A(eVar));
        }
        int iR = h.r(dVar2, null, this.f20959C, this.f20960D);
        O oC = C();
        oC.p(dVar2);
        oC.F(iR);
        oC.G(this.f20971O);
        if (this.f20966J.size() > 0) {
            List<d> list = this.f20966J;
            dVar = list.get(list.size() - 1);
            viewF = F(dVar, eVar);
        } else {
            dVar = null;
            viewF = null;
        }
        if (viewF != null) {
            oC.V(false);
            oC.S(null);
            int iH = H(iR);
            boolean z10 = iH == 1;
            this.f20974R = iH;
            oC.D(viewF);
            if ((this.f20971O & 5) != 5) {
                iR = z10 ? viewF.getWidth() : 0 - iR;
            } else if (!z10) {
                iR = 0 - viewF.getWidth();
            }
            oC.f(iR);
            oC.N(true);
            oC.k(0);
        } else {
            if (this.f20975S) {
                oC.f(this.f20977U);
            }
            if (this.f20976T) {
                oC.k(this.f20978V);
            }
            oC.H(q());
        }
        this.f20966J.add(new d(oC, eVar, this.f20974R));
        oC.b();
        ListView listViewL = oC.l();
        listViewL.setOnKeyListener(this);
        if (dVar == null && this.f20980X && eVar.z() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(i.g.f42537l, (ViewGroup) listViewL, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(eVar.z());
            listViewL.addHeaderView(frameLayout, null, false);
            oC.b();
        }
    }

    @Override // n.e
    public boolean a() {
        return this.f20966J.size() > 0 && this.f20966J.get(0).f20992a.a();
    }

    @Override // n.e
    public void b() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (a()) {
            return;
        }
        Iterator<e> it = this.f20965I.iterator();
        while (it.hasNext()) {
            I(it.next());
        }
        this.f20965I.clear();
        View view = this.f20972P;
        this.f20973Q = view;
        if (view != null) {
            boolean z10 = this.f20982Z == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f20982Z = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f20967K);
            }
            this.f20973Q.addOnAttachStateChangeListener(this.f20968L);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void d(e eVar, boolean z10) {
        int iD = D(eVar);
        if (iD < 0) {
            return;
        }
        int i10 = iD + 1;
        if (i10 < this.f20966J.size()) {
            this.f20966J.get(i10).f20993b.e(false);
        }
        d dVarRemove = this.f20966J.remove(iD);
        dVarRemove.f20993b.R(this);
        if (this.f20984b0) {
            dVarRemove.f20992a.T(null);
            dVarRemove.f20992a.E(0);
        }
        dVarRemove.f20992a.dismiss();
        int size = this.f20966J.size();
        if (size > 0) {
            this.f20974R = this.f20966J.get(size - 1).f20994c;
        } else {
            this.f20974R = G();
        }
        if (size != 0) {
            if (z10) {
                this.f20966J.get(0).f20993b.e(false);
                return;
            }
            return;
        }
        dismiss();
        j.a aVar = this.f20981Y;
        if (aVar != null) {
            aVar.d(eVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f20982Z;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f20982Z.removeGlobalOnLayoutListener(this.f20967K);
            }
            this.f20982Z = null;
        }
        this.f20973Q.removeOnAttachStateChangeListener(this.f20968L);
        this.f20983a0.onDismiss();
    }

    @Override // n.e
    public void dismiss() {
        int size = this.f20966J.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f20966J.toArray(new d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d dVar = dVarArr[i10];
                if (dVar.f20992a.a()) {
                    dVar.f20992a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void e(boolean z10) {
        Iterator<d> it = this.f20966J.iterator();
        while (it.hasNext()) {
            h.B(it.next().a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean f() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void i(j.a aVar) {
        this.f20981Y = aVar;
    }

    @Override // n.e
    public ListView l() {
        if (this.f20966J.isEmpty()) {
            return null;
        }
        return this.f20966J.get(r0.size() - 1).a();
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean m(m mVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        for (d dVar : this.f20966J) {
            if (mVar == dVar.f20993b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        o(mVar);
        j.a aVar = this.f20981Y;
        if (aVar != null) {
            aVar.e(mVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public Parcelable n() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.h
    public void o(e eVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        eVar.c(this, this.f20959C);
        if (a()) {
            I(eVar);
        } else {
            this.f20965I.add(eVar);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f20966J.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = this.f20966J.get(i10);
            if (!dVar.f20992a.a()) {
                break;
            } else {
                i10++;
            }
        }
        if (dVar != null) {
            dVar.f20993b.e(false);
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
    protected boolean p() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.h
    public void s(View view) {
        if (this.f20972P != view) {
            this.f20972P = view;
            this.f20971O = C4456s.b(this.f20970N, view.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void u(boolean z10) {
        this.f20979W = z10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void v(int i10) {
        if (this.f20970N != i10) {
            this.f20970N = i10;
            this.f20971O = C4456s.b(i10, this.f20972P.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void w(int i10) {
        this.f20975S = true;
        this.f20977U = i10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void x(PopupWindow.OnDismissListener onDismissListener) {
        this.f20983a0 = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.h
    public void y(boolean z10) {
        this.f20980X = z10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void z(int i10) {
        this.f20976T = true;
        this.f20978V = i10;
    }

    /* compiled from: CascadingMenuPopup.java */
    /* renamed from: androidx.appcompat.view.menu.b$b, reason: collision with other inner class name */
    class ViewOnAttachStateChangeListenerC0301b implements View.OnAttachStateChangeListener {
        ViewOnAttachStateChangeListenerC0301b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.f20982Z;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.f20982Z = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.f20982Z.removeGlobalOnLayoutListener(bVar.f20967K);
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
}
