package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.k;
import j.C3699a;
import k1.C3784a;
import s1.AbstractC4423b;

/* compiled from: MenuItemImpl.java */
/* loaded from: classes.dex */
public final class g implements l1.b {

    /* renamed from: A, reason: collision with root package name */
    private View f21044A;

    /* renamed from: B, reason: collision with root package name */
    private AbstractC4423b f21045B;

    /* renamed from: C, reason: collision with root package name */
    private MenuItem.OnActionExpandListener f21046C;

    /* renamed from: E, reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f21048E;

    /* renamed from: a, reason: collision with root package name */
    private final int f21049a;

    /* renamed from: b, reason: collision with root package name */
    private final int f21050b;

    /* renamed from: c, reason: collision with root package name */
    private final int f21051c;

    /* renamed from: d, reason: collision with root package name */
    private final int f21052d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f21053e;

    /* renamed from: f, reason: collision with root package name */
    private CharSequence f21054f;

    /* renamed from: g, reason: collision with root package name */
    private Intent f21055g;

    /* renamed from: h, reason: collision with root package name */
    private char f21056h;

    /* renamed from: j, reason: collision with root package name */
    private char f21058j;

    /* renamed from: l, reason: collision with root package name */
    private Drawable f21060l;

    /* renamed from: n, reason: collision with root package name */
    e f21062n;

    /* renamed from: o, reason: collision with root package name */
    private m f21063o;

    /* renamed from: p, reason: collision with root package name */
    private Runnable f21064p;

    /* renamed from: q, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f21065q;

    /* renamed from: r, reason: collision with root package name */
    private CharSequence f21066r;

    /* renamed from: s, reason: collision with root package name */
    private CharSequence f21067s;

    /* renamed from: z, reason: collision with root package name */
    private int f21074z;

    /* renamed from: i, reason: collision with root package name */
    private int f21057i = 4096;

    /* renamed from: k, reason: collision with root package name */
    private int f21059k = 4096;

    /* renamed from: m, reason: collision with root package name */
    private int f21061m = 0;

    /* renamed from: t, reason: collision with root package name */
    private ColorStateList f21068t = null;

    /* renamed from: u, reason: collision with root package name */
    private PorterDuff.Mode f21069u = null;

    /* renamed from: v, reason: collision with root package name */
    private boolean f21070v = false;

    /* renamed from: w, reason: collision with root package name */
    private boolean f21071w = false;

    /* renamed from: x, reason: collision with root package name */
    private boolean f21072x = false;

    /* renamed from: y, reason: collision with root package name */
    private int f21073y = 16;

    /* renamed from: D, reason: collision with root package name */
    private boolean f21047D = false;

    /* compiled from: MenuItemImpl.java */
    class a implements AbstractC4423b.InterfaceC0688b {
        a() {
        }

        @Override // s1.AbstractC4423b.InterfaceC0688b
        public void onActionProviderVisibilityChanged(boolean z10) {
            g gVar = g.this;
            gVar.f21062n.M(gVar);
        }
    }

    g(e eVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f21062n = eVar;
        this.f21049a = i11;
        this.f21050b = i10;
        this.f21051c = i12;
        this.f21052d = i13;
        this.f21053e = charSequence;
        this.f21074z = i14;
    }

    private static void d(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    private Drawable e(Drawable drawable) {
        if (drawable != null && this.f21072x && (this.f21070v || this.f21071w)) {
            drawable = C3784a.r(drawable).mutate();
            if (this.f21070v) {
                C3784a.o(drawable, this.f21068t);
            }
            if (this.f21071w) {
                C3784a.p(drawable, this.f21069u);
            }
            this.f21072x = false;
        }
        return drawable;
    }

    boolean A() {
        return this.f21062n.K() && g() != 0;
    }

    public boolean B() {
        return (this.f21074z & 4) == 4;
    }

    @Override // l1.b
    public l1.b a(AbstractC4423b abstractC4423b) {
        AbstractC4423b abstractC4423b2 = this.f21045B;
        if (abstractC4423b2 != null) {
            abstractC4423b2.h();
        }
        this.f21044A = null;
        this.f21045B = abstractC4423b;
        this.f21062n.N(true);
        AbstractC4423b abstractC4423b3 = this.f21045B;
        if (abstractC4423b3 != null) {
            abstractC4423b3.j(new a());
        }
        return this;
    }

    @Override // l1.b
    public AbstractC4423b b() {
        return this.f21045B;
    }

    public void c() {
        this.f21062n.L(this);
    }

    @Override // l1.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f21074z & 8) == 0) {
            return false;
        }
        if (this.f21044A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f21046C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f21062n.f(this);
        }
        return false;
    }

    @Override // l1.b, android.view.MenuItem
    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f21046C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f21062n.m(this);
        }
        return false;
    }

    public int f() {
        return this.f21052d;
    }

    char g() {
        return this.f21062n.J() ? this.f21058j : this.f21056h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // l1.b, android.view.MenuItem
    public View getActionView() {
        View view = this.f21044A;
        if (view != null) {
            return view;
        }
        AbstractC4423b abstractC4423b = this.f21045B;
        if (abstractC4423b == null) {
            return null;
        }
        View viewD = abstractC4423b.d(this);
        this.f21044A = viewD;
        return viewD;
    }

    @Override // l1.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f21059k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f21058j;
    }

    @Override // l1.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f21066r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f21050b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f21060l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f21061m == 0) {
            return null;
        }
        Drawable drawableB = C3699a.b(this.f21062n.w(), this.f21061m);
        this.f21061m = 0;
        this.f21060l = drawableB;
        return e(drawableB);
    }

    @Override // l1.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f21068t;
    }

    @Override // l1.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f21069u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f21055g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f21049a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f21048E;
    }

    @Override // l1.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f21057i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f21056h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f21051c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f21063o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f21053e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f21054f;
        return charSequence != null ? charSequence : this.f21053e;
    }

    @Override // l1.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f21067s;
    }

    String h() {
        char cG = g();
        if (cG == 0) {
            return "";
        }
        Resources resources = this.f21062n.w().getResources();
        StringBuilder sb2 = new StringBuilder();
        if (ViewConfiguration.get(this.f21062n.w()).hasPermanentMenuKey()) {
            sb2.append(resources.getString(i.h.f42557m));
        }
        int i10 = this.f21062n.J() ? this.f21059k : this.f21057i;
        d(sb2, i10, 65536, resources.getString(i.h.f42553i));
        d(sb2, i10, 4096, resources.getString(i.h.f42549e));
        d(sb2, i10, 2, resources.getString(i.h.f42548d));
        d(sb2, i10, 1, resources.getString(i.h.f42554j));
        d(sb2, i10, 4, resources.getString(i.h.f42556l));
        d(sb2, i10, 8, resources.getString(i.h.f42552h));
        if (cG == '\b') {
            sb2.append(resources.getString(i.h.f42550f));
        } else if (cG == '\n') {
            sb2.append(resources.getString(i.h.f42551g));
        } else if (cG != ' ') {
            sb2.append(cG);
        } else {
            sb2.append(resources.getString(i.h.f42555k));
        }
        return sb2.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f21063o != null;
    }

    CharSequence i(k.a aVar) {
        return (aVar == null || !aVar.d()) ? getTitle() : getTitleCondensed();
    }

    @Override // l1.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f21047D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f21073y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f21073y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f21073y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        AbstractC4423b abstractC4423b = this.f21045B;
        return (abstractC4423b == null || !abstractC4423b.g()) ? (this.f21073y & 8) == 0 : (this.f21073y & 8) == 0 && this.f21045B.b();
    }

    public boolean j() {
        AbstractC4423b abstractC4423b;
        if ((this.f21074z & 8) == 0) {
            return false;
        }
        if (this.f21044A == null && (abstractC4423b = this.f21045B) != null) {
            this.f21044A = abstractC4423b.d(this);
        }
        return this.f21044A != null;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f21065q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        e eVar = this.f21062n;
        if (eVar.h(eVar, this)) {
            return true;
        }
        Runnable runnable = this.f21064p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f21055g != null) {
            try {
                this.f21062n.w().startActivity(this.f21055g);
                return true;
            } catch (ActivityNotFoundException e10) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e10);
            }
        }
        AbstractC4423b abstractC4423b = this.f21045B;
        return abstractC4423b != null && abstractC4423b.e();
    }

    public boolean l() {
        return (this.f21073y & 32) == 32;
    }

    public boolean m() {
        return (this.f21073y & 4) != 0;
    }

    public boolean n() {
        return (this.f21074z & 1) == 1;
    }

    public boolean o() {
        return (this.f21074z & 2) == 2;
    }

    @Override // l1.b, android.view.MenuItem
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public l1.b setActionView(int i10) {
        Context contextW = this.f21062n.w();
        setActionView(LayoutInflater.from(contextW).inflate(i10, (ViewGroup) new LinearLayout(contextW), false));
        return this;
    }

    @Override // l1.b, android.view.MenuItem
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public l1.b setActionView(View view) {
        int i10;
        this.f21044A = view;
        this.f21045B = null;
        if (view != null && view.getId() == -1 && (i10 = this.f21049a) > 0) {
            view.setId(i10);
        }
        this.f21062n.L(this);
        return this;
    }

    public void r(boolean z10) {
        this.f21047D = z10;
        this.f21062n.N(false);
    }

    void s(boolean z10) {
        int i10 = this.f21073y;
        int i11 = (z10 ? 2 : 0) | (i10 & (-3));
        this.f21073y = i11;
        if (i10 != i11) {
            this.f21062n.N(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        if (this.f21058j == c10) {
            return this;
        }
        this.f21058j = Character.toLowerCase(c10);
        this.f21062n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        int i10 = this.f21073y;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f21073y = i11;
        if (i10 != i11) {
            this.f21062n.N(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        if ((this.f21073y & 4) != 0) {
            this.f21062n.Y(this);
        } else {
            s(z10);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f21073y |= 16;
        } else {
            this.f21073y &= -17;
        }
        this.f21062n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f21061m = 0;
        this.f21060l = drawable;
        this.f21072x = true;
        this.f21062n.N(false);
        return this;
    }

    @Override // l1.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f21068t = colorStateList;
        this.f21070v = true;
        this.f21072x = true;
        this.f21062n.N(false);
        return this;
    }

    @Override // l1.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f21069u = mode;
        this.f21071w = true;
        this.f21072x = true;
        this.f21062n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f21055g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        if (this.f21056h == c10) {
            return this;
        }
        this.f21056h = c10;
        this.f21062n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f21046C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f21065q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f21056h = c10;
        this.f21058j = Character.toLowerCase(c11);
        this.f21062n.N(false);
        return this;
    }

    @Override // l1.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f21074z = i10;
        this.f21062n.L(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f21053e = charSequence;
        this.f21062n.N(false);
        m mVar = this.f21063o;
        if (mVar != null) {
            mVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f21054f = charSequence;
        this.f21062n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        if (y(z10)) {
            this.f21062n.M(this);
        }
        return this;
    }

    public void t(boolean z10) {
        this.f21073y = (z10 ? 4 : 0) | (this.f21073y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f21053e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z10) {
        if (z10) {
            this.f21073y |= 32;
        } else {
            this.f21073y &= -33;
        }
    }

    void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f21048E = contextMenuInfo;
    }

    @Override // l1.b, android.view.MenuItem
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public l1.b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    public void x(m mVar) {
        this.f21063o = mVar;
        mVar.setHeaderTitle(getTitle());
    }

    boolean y(boolean z10) {
        int i10 = this.f21073y;
        int i11 = (z10 ? 0 : 8) | (i10 & (-9));
        this.f21073y = i11;
        return i10 != i11;
    }

    public boolean z() {
        return this.f21062n.C();
    }

    @Override // android.view.MenuItem
    public l1.b setContentDescription(CharSequence charSequence) {
        this.f21066r = charSequence;
        this.f21062n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public l1.b setTooltipText(CharSequence charSequence) {
        this.f21067s = charSequence;
        this.f21062n.N(false);
        return this;
    }

    @Override // l1.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f21058j == c10 && this.f21059k == i10) {
            return this;
        }
        this.f21058j = Character.toLowerCase(c10);
        this.f21059k = KeyEvent.normalizeMetaState(i10);
        this.f21062n.N(false);
        return this;
    }

    @Override // l1.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f21056h == c10 && this.f21057i == i10) {
            return this;
        }
        this.f21056h = c10;
        this.f21057i = KeyEvent.normalizeMetaState(i10);
        this.f21062n.N(false);
        return this;
    }

    @Override // l1.b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f21056h = c10;
        this.f21057i = KeyEvent.normalizeMetaState(i10);
        this.f21058j = Character.toLowerCase(c11);
        this.f21059k = KeyEvent.normalizeMetaState(i11);
        this.f21062n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f21060l = null;
        this.f21061m = i10;
        this.f21072x = true;
        this.f21062n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        return setTitle(this.f21062n.w().getString(i10));
    }
}
