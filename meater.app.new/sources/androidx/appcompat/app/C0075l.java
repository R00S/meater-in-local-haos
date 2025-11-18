package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AbstractC0064a;
import androidx.appcompat.view.menu.C0087g;
import androidx.appcompat.view.menu.InterfaceC0093m;
import androidx.appcompat.widget.C0187r0;
import androidx.appcompat.widget.InterfaceC0198x;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C0311u;
import java.util.ArrayList;
import p024c.p025a.p032o.WindowCallbackC0849i;

/* compiled from: ToolbarActionBar.java */
/* renamed from: androidx.appcompat.app.l */
/* loaded from: classes.dex */
class C0075l extends AbstractC0064a {

    /* renamed from: a */
    InterfaceC0198x f388a;

    /* renamed from: b */
    boolean f389b;

    /* renamed from: c */
    Window.Callback f390c;

    /* renamed from: d */
    private boolean f391d;

    /* renamed from: e */
    private boolean f392e;

    /* renamed from: f */
    private ArrayList<AbstractC0064a.b> f393f = new ArrayList<>();

    /* renamed from: g */
    private final Runnable f394g = new a();

    /* renamed from: h */
    private final Toolbar.InterfaceC0150f f395h;

    /* compiled from: ToolbarActionBar.java */
    /* renamed from: androidx.appcompat.app.l$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0075l.this.m419A();
        }
    }

    /* compiled from: ToolbarActionBar.java */
    /* renamed from: androidx.appcompat.app.l$b */
    class b implements Toolbar.InterfaceC0150f {
        b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.InterfaceC0150f
        public boolean onMenuItemClick(MenuItem menuItem) {
            return C0075l.this.f390c.onMenuItemSelected(0, menuItem);
        }
    }

    /* compiled from: ToolbarActionBar.java */
    /* renamed from: androidx.appcompat.app.l$c */
    private final class c implements InterfaceC0093m.a {

        /* renamed from: f */
        private boolean f398f;

        c() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0093m.a
        /* renamed from: b */
        public void mo366b(C0087g c0087g, boolean z) {
            if (this.f398f) {
                return;
            }
            this.f398f = true;
            C0075l.this.f388a.mo1131h();
            Window.Callback callback = C0075l.this.f390c;
            if (callback != null) {
                callback.onPanelClosed(108, c0087g);
            }
            this.f398f = false;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0093m.a
        /* renamed from: c */
        public boolean mo367c(C0087g c0087g) {
            Window.Callback callback = C0075l.this.f390c;
            if (callback == null) {
                return false;
            }
            callback.onMenuOpened(108, c0087g);
            return true;
        }
    }

    /* compiled from: ToolbarActionBar.java */
    /* renamed from: androidx.appcompat.app.l$d */
    private final class d implements C0087g.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.C0087g.a
        /* renamed from: a */
        public boolean mo347a(C0087g c0087g, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.C0087g.a
        /* renamed from: b */
        public void mo349b(C0087g c0087g) {
            C0075l c0075l = C0075l.this;
            if (c0075l.f390c != null) {
                if (c0075l.f388a.mo1125b()) {
                    C0075l.this.f390c.onPanelClosed(108, c0087g);
                } else if (C0075l.this.f390c.onPreparePanel(0, null, c0087g)) {
                    C0075l.this.f390c.onMenuOpened(108, c0087g);
                }
            }
        }
    }

    /* compiled from: ToolbarActionBar.java */
    /* renamed from: androidx.appcompat.app.l$e */
    private class e extends WindowCallbackC0849i {
        public e(Window.Callback callback) {
            super(callback);
        }

        @Override // p024c.p025a.p032o.WindowCallbackC0849i, android.view.Window.Callback
        public View onCreatePanelView(int i2) {
            return i2 == 0 ? new View(C0075l.this.f388a.getContext()) : super.onCreatePanelView(i2);
        }

        @Override // p024c.p025a.p032o.WindowCallbackC0849i, android.view.Window.Callback
        public boolean onPreparePanel(int i2, View view, Menu menu) {
            boolean zOnPreparePanel = super.onPreparePanel(i2, view, menu);
            if (zOnPreparePanel) {
                C0075l c0075l = C0075l.this;
                if (!c0075l.f389b) {
                    c0075l.f388a.mo1126c();
                    C0075l.this.f389b = true;
                }
            }
            return zOnPreparePanel;
        }
    }

    C0075l(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.f395h = bVar;
        this.f388a = new C0187r0(toolbar, false);
        e eVar = new e(callback);
        this.f390c = eVar;
        this.f388a.setWindowCallback(eVar);
        toolbar.setOnMenuItemClickListener(bVar);
        this.f388a.setWindowTitle(charSequence);
    }

    /* renamed from: y */
    private Menu m418y() {
        if (!this.f391d) {
            this.f388a.mo1139p(new c(), new d());
            this.f391d = true;
        }
        return this.f388a.mo1135l();
    }

    /* renamed from: A */
    void m419A() {
        Menu menuM418y = m418y();
        C0087g c0087g = menuM418y instanceof C0087g ? (C0087g) menuM418y : null;
        if (c0087g != null) {
            c0087g.m592h0();
        }
        try {
            menuM418y.clear();
            if (!this.f390c.onCreatePanelMenu(0, menuM418y) || !this.f390c.onPreparePanel(0, null, menuM418y)) {
                menuM418y.clear();
            }
        } finally {
            if (c0087g != null) {
                c0087g.m590g0();
            }
        }
    }

    /* renamed from: B */
    public void m420B(int i2, int i3) {
        this.f388a.mo1134k((i2 & i3) | ((i3 ^ (-1)) & this.f388a.mo1143t()));
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: f */
    public boolean mo215f() {
        return this.f388a.mo1129f();
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: g */
    public boolean mo216g() {
        if (!this.f388a.mo1133j()) {
            return false;
        }
        this.f388a.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: h */
    public void mo217h(boolean z) {
        if (z == this.f392e) {
            return;
        }
        this.f392e = z;
        int size = this.f393f.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f393f.get(i2).m234a(z);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: i */
    public int mo218i() {
        return this.f388a.mo1143t();
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: j */
    public Context mo219j() {
        return this.f388a.getContext();
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: k */
    public boolean mo220k() {
        this.f388a.mo1141r().removeCallbacks(this.f394g);
        C0311u.m2115a0(this.f388a.mo1141r(), this.f394g);
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: l */
    public void mo221l(Configuration configuration) {
        super.mo221l(configuration);
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: m */
    void mo222m() {
        this.f388a.mo1141r().removeCallbacks(this.f394g);
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: n */
    public boolean mo223n(int i2, KeyEvent keyEvent) {
        Menu menuM418y = m418y();
        if (menuM418y == null) {
            return false;
        }
        menuM418y.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuM418y.performShortcut(i2, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: o */
    public boolean mo224o(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo225p();
        }
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: p */
    public boolean mo225p() {
        return this.f388a.mo1130g();
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: q */
    public void mo226q(boolean z) {
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: r */
    public void mo227r(boolean z) {
        m420B(z ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: s */
    public void mo228s(boolean z) {
        m420B(z ? 2 : 0, 2);
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: t */
    public void mo229t(boolean z) {
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: u */
    public void mo230u(boolean z) {
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: v */
    public void mo231v(CharSequence charSequence) {
        this.f388a.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: w */
    public void mo232w(CharSequence charSequence) {
        this.f388a.setWindowTitle(charSequence);
    }

    /* renamed from: z */
    public Window.Callback m421z() {
        return this.f390c;
    }
}
