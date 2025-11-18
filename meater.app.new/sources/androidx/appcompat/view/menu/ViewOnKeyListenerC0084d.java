package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
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
import androidx.appcompat.view.menu.InterfaceC0093m;
import androidx.appcompat.widget.C0163f0;
import androidx.appcompat.widget.InterfaceC0161e0;
import androidx.core.view.C0286d;
import androidx.core.view.C0311u;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p024c.p025a.C0826d;
import p024c.p025a.C0829g;

/* compiled from: CascadingMenuPopup.java */
/* renamed from: androidx.appcompat.view.menu.d */
/* loaded from: classes.dex */
final class ViewOnKeyListenerC0084d extends AbstractC0091k implements InterfaceC0093m, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: g */
    private static final int f521g = C0829g.f5166e;

    /* renamed from: A */
    private int f522A;

    /* renamed from: C */
    private boolean f524C;

    /* renamed from: D */
    private InterfaceC0093m.a f525D;

    /* renamed from: E */
    ViewTreeObserver f526E;

    /* renamed from: F */
    private PopupWindow.OnDismissListener f527F;

    /* renamed from: G */
    boolean f528G;

    /* renamed from: h */
    private final Context f529h;

    /* renamed from: i */
    private final int f530i;

    /* renamed from: j */
    private final int f531j;

    /* renamed from: k */
    private final int f532k;

    /* renamed from: l */
    private final boolean f533l;

    /* renamed from: m */
    final Handler f534m;

    /* renamed from: u */
    private View f542u;

    /* renamed from: v */
    View f543v;

    /* renamed from: x */
    private boolean f545x;

    /* renamed from: y */
    private boolean f546y;

    /* renamed from: z */
    private int f547z;

    /* renamed from: n */
    private final List<C0087g> f535n = new ArrayList();

    /* renamed from: o */
    final List<d> f536o = new ArrayList();

    /* renamed from: p */
    final ViewTreeObserver.OnGlobalLayoutListener f537p = new a();

    /* renamed from: q */
    private final View.OnAttachStateChangeListener f538q = new b();

    /* renamed from: r */
    private final InterfaceC0161e0 f539r = new c();

    /* renamed from: s */
    private int f540s = 0;

    /* renamed from: t */
    private int f541t = 0;

    /* renamed from: B */
    private boolean f523B = false;

    /* renamed from: w */
    private int f544w = m516E();

    /* compiled from: CascadingMenuPopup.java */
    /* renamed from: androidx.appcompat.view.menu.d$a */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!ViewOnKeyListenerC0084d.this.mo519a() || ViewOnKeyListenerC0084d.this.f536o.size() <= 0 || ViewOnKeyListenerC0084d.this.f536o.get(0).f555a.m931A()) {
                return;
            }
            View view = ViewOnKeyListenerC0084d.this.f543v;
            if (view == null || !view.isShown()) {
                ViewOnKeyListenerC0084d.this.dismiss();
                return;
            }
            Iterator<d> it = ViewOnKeyListenerC0084d.this.f536o.iterator();
            while (it.hasNext()) {
                it.next().f555a.show();
            }
        }
    }

    /* compiled from: CascadingMenuPopup.java */
    /* renamed from: androidx.appcompat.view.menu.d$b */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = ViewOnKeyListenerC0084d.this.f526E;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    ViewOnKeyListenerC0084d.this.f526E = view.getViewTreeObserver();
                }
                ViewOnKeyListenerC0084d viewOnKeyListenerC0084d = ViewOnKeyListenerC0084d.this;
                viewOnKeyListenerC0084d.f526E.removeGlobalOnLayoutListener(viewOnKeyListenerC0084d.f537p);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* compiled from: CascadingMenuPopup.java */
    /* renamed from: androidx.appcompat.view.menu.d$c */
    class c implements InterfaceC0161e0 {

        /* compiled from: CascadingMenuPopup.java */
        /* renamed from: androidx.appcompat.view.menu.d$c$a */
        class a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ d f551f;

            /* renamed from: g */
            final /* synthetic */ MenuItem f552g;

            /* renamed from: h */
            final /* synthetic */ C0087g f553h;

            a(d dVar, MenuItem menuItem, C0087g c0087g) {
                this.f551f = dVar;
                this.f552g = menuItem;
                this.f553h = c0087g;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f551f;
                if (dVar != null) {
                    ViewOnKeyListenerC0084d.this.f528G = true;
                    dVar.f556b.m587e(false);
                    ViewOnKeyListenerC0084d.this.f528G = false;
                }
                if (this.f552g.isEnabled() && this.f552g.hasSubMenu()) {
                    this.f553h.m568N(this.f552g, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.InterfaceC0161e0
        /* renamed from: d */
        public void mo533d(C0087g c0087g, MenuItem menuItem) {
            ViewOnKeyListenerC0084d.this.f534m.removeCallbacksAndMessages(null);
            int size = ViewOnKeyListenerC0084d.this.f536o.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (c0087g == ViewOnKeyListenerC0084d.this.f536o.get(i2).f556b) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return;
            }
            int i3 = i2 + 1;
            ViewOnKeyListenerC0084d.this.f534m.postAtTime(new a(i3 < ViewOnKeyListenerC0084d.this.f536o.size() ? ViewOnKeyListenerC0084d.this.f536o.get(i3) : null, menuItem, c0087g), c0087g, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.InterfaceC0161e0
        /* renamed from: g */
        public void mo534g(C0087g c0087g, MenuItem menuItem) {
            ViewOnKeyListenerC0084d.this.f534m.removeCallbacksAndMessages(c0087g);
        }
    }

    /* compiled from: CascadingMenuPopup.java */
    /* renamed from: androidx.appcompat.view.menu.d$d */
    private static class d {

        /* renamed from: a */
        public final C0163f0 f555a;

        /* renamed from: b */
        public final C0087g f556b;

        /* renamed from: c */
        public final int f557c;

        public d(C0163f0 c0163f0, C0087g c0087g, int i2) {
            this.f555a = c0163f0;
            this.f556b = c0087g;
            this.f557c = i2;
        }

        /* renamed from: a */
        public ListView m535a() {
            return this.f555a.mo522j();
        }
    }

    public ViewOnKeyListenerC0084d(Context context, View view, int i2, int i3, boolean z) {
        this.f529h = context;
        this.f542u = view;
        this.f531j = i2;
        this.f532k = i3;
        this.f533l = z;
        Resources resources = context.getResources();
        this.f530i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0826d.f5065d));
        this.f534m = new Handler();
    }

    /* renamed from: A */
    private C0163f0 m512A() {
        C0163f0 c0163f0 = new C0163f0(this.f529h, null, this.f531j, this.f532k);
        c0163f0.m962S(this.f539r);
        c0163f0.m940K(this);
        c0163f0.m939J(this);
        c0163f0.m932C(this.f542u);
        c0163f0.m935F(this.f541t);
        c0163f0.m938I(true);
        c0163f0.m937H(2);
        return c0163f0;
    }

    /* renamed from: B */
    private int m513B(C0087g c0087g) {
        int size = this.f536o.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (c0087g == this.f536o.get(i2).f556b) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: C */
    private MenuItem m514C(C0087g c0087g, C0087g c0087g2) {
        int size = c0087g.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = c0087g.getItem(i2);
            if (item.hasSubMenu() && c0087g2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: D */
    private View m515D(d dVar, C0087g c0087g) {
        C0086f c0086f;
        int headersCount;
        int firstVisiblePosition;
        MenuItem menuItemM514C = m514C(dVar.f556b, c0087g);
        if (menuItemM514C == null) {
            return null;
        }
        ListView listViewM535a = dVar.m535a();
        ListAdapter adapter = listViewM535a.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            c0086f = (C0086f) headerViewListAdapter.getWrappedAdapter();
        } else {
            c0086f = (C0086f) adapter;
            headersCount = 0;
        }
        int count = c0086f.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            }
            if (menuItemM514C == c0086f.getItem(i2)) {
                break;
            }
            i2++;
        }
        if (i2 != -1 && (firstVisiblePosition = (i2 + headersCount) - listViewM535a.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewM535a.getChildCount()) {
            return listViewM535a.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    /* renamed from: E */
    private int m516E() {
        return C0311u.m2162y(this.f542u) == 1 ? 0 : 1;
    }

    /* renamed from: F */
    private int m517F(int i2) {
        List<d> list = this.f536o;
        ListView listViewM535a = list.get(list.size() - 1).m535a();
        int[] iArr = new int[2];
        listViewM535a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f543v.getWindowVisibleDisplayFrame(rect);
        return this.f544w == 1 ? (iArr[0] + listViewM535a.getWidth()) + i2 > rect.right ? 0 : 1 : iArr[0] - i2 < 0 ? 1 : 0;
    }

    /* renamed from: G */
    private void m518G(C0087g c0087g) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        d dVar;
        View viewM515D;
        int i2;
        int i3;
        int i4;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f529h);
        C0086f c0086f = new C0086f(c0087g, layoutInflaterFrom, this.f533l, f521g);
        if (!mo519a() && this.f523B) {
            c0086f.m545d(true);
        } else if (mo519a()) {
            c0086f.m545d(AbstractC0091k.m647y(c0087g));
        }
        int iM646p = AbstractC0091k.m646p(c0086f, null, this.f529h, this.f530i);
        C0163f0 c0163f0M512A = m512A();
        c0163f0M512A.mo764o(c0086f);
        c0163f0M512A.m934E(iM646p);
        c0163f0M512A.m935F(this.f541t);
        if (this.f536o.size() > 0) {
            List<d> list = this.f536o;
            dVar = list.get(list.size() - 1);
            viewM515D = m515D(dVar, c0087g);
        } else {
            dVar = null;
            viewM515D = null;
        }
        if (viewM515D != null) {
            c0163f0M512A.m963T(false);
            c0163f0M512A.m960Q(null);
            int iM517F = m517F(iM646p);
            boolean z = iM517F == 1;
            this.f544w = iM517F;
            if (Build.VERSION.SDK_INT >= 26) {
                c0163f0M512A.m932C(viewM515D);
                i3 = 0;
                i2 = 0;
            } else {
                int[] iArr = new int[2];
                this.f542u.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                viewM515D.getLocationOnScreen(iArr2);
                if ((this.f541t & 7) == 5) {
                    iArr[0] = iArr[0] + this.f542u.getWidth();
                    iArr2[0] = iArr2[0] + viewM515D.getWidth();
                }
                i2 = iArr2[0] - iArr[0];
                i3 = iArr2[1] - iArr[1];
            }
            if ((this.f541t & 5) == 5) {
                if (!z) {
                    iM646p = viewM515D.getWidth();
                    i4 = i2 - iM646p;
                }
                i4 = i2 + iM646p;
            } else {
                if (z) {
                    iM646p = viewM515D.getWidth();
                    i4 = i2 + iM646p;
                }
                i4 = i2 - iM646p;
            }
            c0163f0M512A.m947e(i4);
            c0163f0M512A.m941L(true);
            c0163f0M512A.m949k(i3);
        } else {
            if (this.f545x) {
                c0163f0M512A.m947e(this.f547z);
            }
            if (this.f546y) {
                c0163f0M512A.m949k(this.f522A);
            }
            c0163f0M512A.m936G(m649o());
        }
        this.f536o.add(new d(c0163f0M512A, c0087g, this.f544w));
        c0163f0M512A.show();
        ListView listViewMo522j = c0163f0M512A.mo522j();
        listViewMo522j.setOnKeyListener(this);
        if (dVar == null && this.f524C && c0087g.m605z() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(C0829g.f5173l, (ViewGroup) listViewMo522j, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(c0087g.m605z());
            listViewMo522j.addHeaderView(frameLayout, null, false);
            c0163f0M512A.show();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0096p
    /* renamed from: a */
    public boolean mo519a() {
        return this.f536o.size() > 0 && this.f536o.get(0).f555a.mo519a();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093m
    /* renamed from: b */
    public void mo492b(C0087g c0087g, boolean z) {
        int iM513B = m513B(c0087g);
        if (iM513B < 0) {
            return;
        }
        int i2 = iM513B + 1;
        if (i2 < this.f536o.size()) {
            this.f536o.get(i2).f556b.m587e(false);
        }
        d dVarRemove = this.f536o.remove(iM513B);
        dVarRemove.f556b.m570Q(this);
        if (this.f528G) {
            dVarRemove.f555a.m961R(null);
            dVarRemove.f555a.m933D(0);
        }
        dVarRemove.f555a.dismiss();
        int size = this.f536o.size();
        if (size > 0) {
            this.f544w = this.f536o.get(size - 1).f557c;
        } else {
            this.f544w = m516E();
        }
        if (size != 0) {
            if (z) {
                this.f536o.get(0).f556b.m587e(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC0093m.a aVar = this.f525D;
        if (aVar != null) {
            aVar.mo366b(c0087g, true);
        }
        ViewTreeObserver viewTreeObserver = this.f526E;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f526E.removeGlobalOnLayoutListener(this.f537p);
            }
            this.f526E = null;
        }
        this.f543v.removeOnAttachStateChangeListener(this.f538q);
        this.f527F.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093m
    /* renamed from: c */
    public void mo493c(boolean z) {
        Iterator<d> it = this.f536o.iterator();
        while (it.hasNext()) {
            AbstractC0091k.m648z(it.next().m535a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093m
    /* renamed from: d */
    public boolean mo520d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0096p
    public void dismiss() {
        int size = this.f536o.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f536o.toArray(new d[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                d dVar = dVarArr[i2];
                if (dVar.f555a.mo519a()) {
                    dVar.f555a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093m
    /* renamed from: g */
    public void mo496g(InterfaceC0093m.a aVar) {
        this.f525D = aVar;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093m
    /* renamed from: i */
    public void mo521i(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0096p
    /* renamed from: j */
    public ListView mo522j() {
        if (this.f536o.isEmpty()) {
            return null;
        }
        return this.f536o.get(r0.size() - 1).m535a();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093m
    /* renamed from: k */
    public boolean mo499k(SubMenuC0098r subMenuC0098r) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        for (d dVar : this.f536o) {
            if (subMenuC0098r == dVar.f556b) {
                dVar.m535a().requestFocus();
                return true;
            }
        }
        if (!subMenuC0098r.hasVisibleItems()) {
            return false;
        }
        mo524m(subMenuC0098r);
        InterfaceC0093m.a aVar = this.f525D;
        if (aVar != null) {
            aVar.mo367c(subMenuC0098r);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093m
    /* renamed from: l */
    public Parcelable mo523l() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0091k
    /* renamed from: m */
    public void mo524m(C0087g c0087g) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        c0087g.m583c(this, this.f529h);
        if (mo519a()) {
            m518G(c0087g);
        } else {
            this.f535n.add(c0087g);
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0091k
    /* renamed from: n */
    protected boolean mo525n() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f536o.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                dVar = null;
                break;
            }
            dVar = this.f536o.get(i2);
            if (!dVar.f555a.mo519a()) {
                break;
            } else {
                i2++;
            }
        }
        if (dVar != null) {
            dVar.f556b.m587e(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0091k
    /* renamed from: q */
    public void mo526q(View view) {
        if (this.f542u != view) {
            this.f542u = view;
            this.f541t = C0286d.m1932b(this.f540s, C0311u.m2162y(view));
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0091k
    /* renamed from: s */
    public void mo527s(boolean z) {
        this.f523B = z;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0096p
    public void show() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (mo519a()) {
            return;
        }
        Iterator<C0087g> it = this.f535n.iterator();
        while (it.hasNext()) {
            m518G(it.next());
        }
        this.f535n.clear();
        View view = this.f542u;
        this.f543v = view;
        if (view != null) {
            boolean z = this.f526E == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f526E = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f537p);
            }
            this.f543v.addOnAttachStateChangeListener(this.f538q);
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0091k
    /* renamed from: t */
    public void mo528t(int i2) {
        if (this.f540s != i2) {
            this.f540s = i2;
            this.f541t = C0286d.m1932b(i2, C0311u.m2162y(this.f542u));
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0091k
    /* renamed from: u */
    public void mo529u(int i2) {
        this.f545x = true;
        this.f547z = i2;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0091k
    /* renamed from: v */
    public void mo530v(PopupWindow.OnDismissListener onDismissListener) {
        this.f527F = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0091k
    /* renamed from: w */
    public void mo531w(boolean z) {
        this.f524C = z;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0091k
    /* renamed from: x */
    public void mo532x(int i2) {
        this.f546y = true;
        this.f522A = i2;
    }
}
