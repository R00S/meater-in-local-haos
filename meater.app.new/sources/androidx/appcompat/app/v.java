package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.a;
import androidx.appcompat.app.h;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.D;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.e0;
import java.util.ArrayList;
import s1.X;

/* compiled from: ToolbarActionBar.java */
/* loaded from: classes.dex */
class v extends androidx.appcompat.app.a {

    /* renamed from: a, reason: collision with root package name */
    final D f20778a;

    /* renamed from: b, reason: collision with root package name */
    final Window.Callback f20779b;

    /* renamed from: c, reason: collision with root package name */
    final h.f f20780c;

    /* renamed from: d, reason: collision with root package name */
    boolean f20781d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f20782e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f20783f;

    /* renamed from: g, reason: collision with root package name */
    private ArrayList<a.b> f20784g = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    private final Runnable f20785h = new a();

    /* renamed from: i, reason: collision with root package name */
    private final Toolbar.h f20786i;

    /* compiled from: ToolbarActionBar.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.K();
        }
    }

    /* compiled from: ToolbarActionBar.java */
    class b implements Toolbar.h {
        b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.h
        public boolean onMenuItemClick(MenuItem menuItem) {
            return v.this.f20779b.onMenuItemSelected(0, menuItem);
        }
    }

    /* compiled from: ToolbarActionBar.java */
    private final class c implements j.a {

        /* renamed from: B, reason: collision with root package name */
        private boolean f20789B;

        c() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void d(androidx.appcompat.view.menu.e eVar, boolean z10) {
            if (this.f20789B) {
                return;
            }
            this.f20789B = true;
            v.this.f20778a.h();
            v.this.f20779b.onPanelClosed(108, eVar);
            this.f20789B = false;
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean e(androidx.appcompat.view.menu.e eVar) {
            v.this.f20779b.onMenuOpened(108, eVar);
            return true;
        }
    }

    /* compiled from: ToolbarActionBar.java */
    private final class d implements e.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (v.this.f20778a.b()) {
                v.this.f20779b.onPanelClosed(108, eVar);
            } else if (v.this.f20779b.onPreparePanel(0, null, eVar)) {
                v.this.f20779b.onMenuOpened(108, eVar);
            }
        }
    }

    /* compiled from: ToolbarActionBar.java */
    private class e implements h.f {
        e() {
        }

        @Override // androidx.appcompat.app.h.f
        public boolean a(int i10) {
            if (i10 != 0) {
                return false;
            }
            v vVar = v.this;
            if (vVar.f20781d) {
                return false;
            }
            vVar.f20778a.c();
            v.this.f20781d = true;
            return false;
        }

        @Override // androidx.appcompat.app.h.f
        public View onCreatePanelView(int i10) {
            if (i10 == 0) {
                return new View(v.this.f20778a.getContext());
            }
            return null;
        }
    }

    v(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.f20786i = bVar;
        r1.i.g(toolbar);
        e0 e0Var = new e0(toolbar, false);
        this.f20778a = e0Var;
        this.f20779b = (Window.Callback) r1.i.g(callback);
        e0Var.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(bVar);
        e0Var.setWindowTitle(charSequence);
        this.f20780c = new e();
    }

    private Menu J() {
        if (!this.f20782e) {
            this.f20778a.q(new c(), new d());
            this.f20782e = true;
        }
        return this.f20778a.m();
    }

    @Override // androidx.appcompat.app.a
    public void A(boolean z10) {
        L(z10 ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.a
    public void B(float f10) {
        X.v0(this.f20778a.s(), f10);
    }

    @Override // androidx.appcompat.app.a
    public void D(int i10) {
        this.f20778a.setIcon(i10);
    }

    @Override // androidx.appcompat.app.a
    public void F(CharSequence charSequence) {
        this.f20778a.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void G(CharSequence charSequence) {
        this.f20778a.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void H() {
        this.f20778a.r(0);
    }

    void K() {
        Menu menuJ = J();
        androidx.appcompat.view.menu.e eVar = menuJ instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menuJ : null;
        if (eVar != null) {
            eVar.i0();
        }
        try {
            menuJ.clear();
            if (!this.f20779b.onCreatePanelMenu(0, menuJ) || !this.f20779b.onPreparePanel(0, null, menuJ)) {
                menuJ.clear();
            }
            if (eVar != null) {
                eVar.h0();
            }
        } catch (Throwable th) {
            if (eVar != null) {
                eVar.h0();
            }
            throw th;
        }
    }

    public void L(int i10, int i11) {
        this.f20778a.l((i10 & i11) | ((~i11) & this.f20778a.u()));
    }

    @Override // androidx.appcompat.app.a
    public boolean g() {
        return this.f20778a.f();
    }

    @Override // androidx.appcompat.app.a
    public boolean h() {
        if (!this.f20778a.k()) {
            return false;
        }
        this.f20778a.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void i(boolean z10) {
        if (z10 == this.f20783f) {
            return;
        }
        this.f20783f = z10;
        int size = this.f20784g.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f20784g.get(i10).a(z10);
        }
    }

    @Override // androidx.appcompat.app.a
    public View j() {
        return this.f20778a.i();
    }

    @Override // androidx.appcompat.app.a
    public int k() {
        return this.f20778a.u();
    }

    @Override // androidx.appcompat.app.a
    public Context l() {
        return this.f20778a.getContext();
    }

    @Override // androidx.appcompat.app.a
    public void m() {
        this.f20778a.r(8);
    }

    @Override // androidx.appcompat.app.a
    public boolean n() {
        this.f20778a.s().removeCallbacks(this.f20785h);
        X.f0(this.f20778a.s(), this.f20785h);
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void o(Configuration configuration) {
        super.o(configuration);
    }

    @Override // androidx.appcompat.app.a
    void p() {
        this.f20778a.s().removeCallbacks(this.f20785h);
    }

    @Override // androidx.appcompat.app.a
    public boolean q(int i10, KeyEvent keyEvent) {
        Menu menuJ = J();
        if (menuJ == null) {
            return false;
        }
        menuJ.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuJ.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.a
    public boolean r(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            s();
        }
        return true;
    }

    @Override // androidx.appcompat.app.a
    public boolean s() {
        return this.f20778a.g();
    }

    @Override // androidx.appcompat.app.a
    public void t(View view) {
        u(view, new a.C0299a(-2, -2));
    }

    @Override // androidx.appcompat.app.a
    public void u(View view, a.C0299a c0299a) {
        if (view != null) {
            view.setLayoutParams(c0299a);
        }
        this.f20778a.v(view);
    }

    @Override // androidx.appcompat.app.a
    public void w(boolean z10) {
        L(z10 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.a
    @SuppressLint({"WrongConstant"})
    public void x(int i10) {
        L(i10, -1);
    }

    @Override // androidx.appcompat.app.a
    public void y(boolean z10) {
        L(z10 ? 16 : 0, 16);
    }

    @Override // androidx.appcompat.app.a
    public void z(boolean z10) {
        L(z10 ? 2 : 0, 2);
    }

    @Override // androidx.appcompat.app.a
    public void C(boolean z10) {
    }

    @Override // androidx.appcompat.app.a
    public void E(boolean z10) {
    }

    @Override // androidx.appcompat.app.a
    public void v(boolean z10) {
    }
}
