package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
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
import androidx.appcompat.view.menu.InterfaceC0094n;
import androidx.core.graphics.drawable.C0265a;
import androidx.core.view.AbstractC0282b;
import androidx.recyclerview.widget.RecyclerView;
import okhttp3.HttpUrl;
import p024c.p025a.C0830h;
import p024c.p025a.p026k.p027a.C0833a;
import p024c.p052i.p054f.p055a.InterfaceMenuItemC0935b;

/* compiled from: MenuItemImpl.java */
/* renamed from: androidx.appcompat.view.menu.i */
/* loaded from: classes.dex */
public final class C0089i implements InterfaceMenuItemC0935b {

    /* renamed from: A */
    private View f607A;

    /* renamed from: B */
    private AbstractC0282b f608B;

    /* renamed from: C */
    private MenuItem.OnActionExpandListener f609C;

    /* renamed from: E */
    private ContextMenu.ContextMenuInfo f611E;

    /* renamed from: a */
    private final int f612a;

    /* renamed from: b */
    private final int f613b;

    /* renamed from: c */
    private final int f614c;

    /* renamed from: d */
    private final int f615d;

    /* renamed from: e */
    private CharSequence f616e;

    /* renamed from: f */
    private CharSequence f617f;

    /* renamed from: g */
    private Intent f618g;

    /* renamed from: h */
    private char f619h;

    /* renamed from: j */
    private char f621j;

    /* renamed from: l */
    private Drawable f623l;

    /* renamed from: n */
    C0087g f625n;

    /* renamed from: o */
    private SubMenuC0098r f626o;

    /* renamed from: p */
    private Runnable f627p;

    /* renamed from: q */
    private MenuItem.OnMenuItemClickListener f628q;

    /* renamed from: r */
    private CharSequence f629r;

    /* renamed from: s */
    private CharSequence f630s;

    /* renamed from: z */
    private int f637z;

    /* renamed from: i */
    private int f620i = RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT;

    /* renamed from: k */
    private int f622k = RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT;

    /* renamed from: m */
    private int f624m = 0;

    /* renamed from: t */
    private ColorStateList f631t = null;

    /* renamed from: u */
    private PorterDuff.Mode f632u = null;

    /* renamed from: v */
    private boolean f633v = false;

    /* renamed from: w */
    private boolean f634w = false;

    /* renamed from: x */
    private boolean f635x = false;

    /* renamed from: y */
    private int f636y = 16;

    /* renamed from: D */
    private boolean f610D = false;

    /* compiled from: MenuItemImpl.java */
    /* renamed from: androidx.appcompat.view.menu.i$a */
    class a implements AbstractC0282b.b {
        a() {
        }

        @Override // androidx.core.view.AbstractC0282b.b
        public void onActionProviderVisibilityChanged(boolean z) {
            C0089i c0089i = C0089i.this;
            c0089i.f625n.m566L(c0089i);
        }
    }

    C0089i(C0087g c0087g, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        this.f637z = 0;
        this.f625n = c0087g;
        this.f612a = i3;
        this.f613b = i2;
        this.f614c = i4;
        this.f615d = i5;
        this.f616e = charSequence;
        this.f637z = i6;
    }

    /* renamed from: d */
    private static void m608d(StringBuilder sb, int i2, int i3, String str) {
        if ((i2 & i3) == i3) {
            sb.append(str);
        }
    }

    /* renamed from: e */
    private Drawable m609e(Drawable drawable) {
        if (drawable != null && this.f635x && (this.f633v || this.f634w)) {
            drawable = C0265a.m1821r(drawable).mutate();
            if (this.f633v) {
                C0265a.m1818o(drawable, this.f631t);
            }
            if (this.f634w) {
                C0265a.m1819p(drawable, this.f632u);
            }
            this.f635x = false;
        }
        return drawable;
    }

    /* renamed from: A */
    boolean m610A() {
        return this.f625n.mo564J() && m614g() != 0;
    }

    /* renamed from: B */
    public boolean m611B() {
        return (this.f637z & 4) == 4;
    }

    @Override // p024c.p052i.p054f.p055a.InterfaceMenuItemC0935b
    /* renamed from: a */
    public InterfaceMenuItemC0935b mo486a(AbstractC0282b abstractC0282b) {
        AbstractC0282b abstractC0282b2 = this.f608B;
        if (abstractC0282b2 != null) {
            abstractC0282b2.m1864h();
        }
        this.f607A = null;
        this.f608B = abstractC0282b;
        this.f625n.m567M(true);
        AbstractC0282b abstractC0282b3 = this.f608B;
        if (abstractC0282b3 != null) {
            abstractC0282b3.mo642j(new a());
        }
        return this;
    }

    @Override // p024c.p052i.p054f.p055a.InterfaceMenuItemC0935b
    /* renamed from: b */
    public AbstractC0282b mo487b() {
        return this.f608B;
    }

    /* renamed from: c */
    public void m612c() {
        this.f625n.m565K(this);
    }

    @Override // p024c.p052i.p054f.p055a.InterfaceMenuItemC0935b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f637z & 8) == 0) {
            return false;
        }
        if (this.f607A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f609C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f625n.mo589f(this);
        }
        return false;
    }

    @Override // p024c.p052i.p054f.p055a.InterfaceMenuItemC0935b, android.view.MenuItem
    public boolean expandActionView() {
        if (!m617j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f609C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f625n.mo593m(this);
        }
        return false;
    }

    /* renamed from: f */
    public int m613f() {
        return this.f615d;
    }

    /* renamed from: g */
    char m614g() {
        return this.f625n.mo563I() ? this.f621j : this.f619h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // p024c.p052i.p054f.p055a.InterfaceMenuItemC0935b, android.view.MenuItem
    public View getActionView() {
        View view = this.f607A;
        if (view != null) {
            return view;
        }
        AbstractC0282b abstractC0282b = this.f608B;
        if (abstractC0282b == null) {
            return null;
        }
        View viewMo640d = abstractC0282b.mo640d(this);
        this.f607A = viewMo640d;
        return viewMo640d;
    }

    @Override // p024c.p052i.p054f.p055a.InterfaceMenuItemC0935b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f622k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f621j;
    }

    @Override // p024c.p052i.p054f.p055a.InterfaceMenuItemC0935b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f629r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f613b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f623l;
        if (drawable != null) {
            return m609e(drawable);
        }
        if (this.f624m == 0) {
            return null;
        }
        Drawable drawableM5262d = C0833a.m5262d(this.f625n.m602w(), this.f624m);
        this.f624m = 0;
        this.f623l = drawableM5262d;
        return m609e(drawableM5262d);
    }

    @Override // p024c.p052i.p054f.p055a.InterfaceMenuItemC0935b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f631t;
    }

    @Override // p024c.p052i.p054f.p055a.InterfaceMenuItemC0935b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f632u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f618g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f612a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f611E;
    }

    @Override // p024c.p052i.p054f.p055a.InterfaceMenuItemC0935b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f620i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f619h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f614c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f626o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f616e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f617f;
        if (charSequence == null) {
            charSequence = this.f616e;
        }
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    @Override // p024c.p052i.p054f.p055a.InterfaceMenuItemC0935b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f630s;
    }

    /* renamed from: h */
    String m615h() {
        char cM614g = m614g();
        if (cM614g == 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        Resources resources = this.f625n.m602w().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f625n.m602w()).hasPermanentMenuKey()) {
            sb.append(resources.getString(C0830h.f5192k));
        }
        int i2 = this.f625n.mo563I() ? this.f622k : this.f620i;
        m608d(sb, i2, 65536, resources.getString(C0830h.f5188g));
        m608d(sb, i2, RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT, resources.getString(C0830h.f5184c));
        m608d(sb, i2, 2, resources.getString(C0830h.f5183b));
        m608d(sb, i2, 1, resources.getString(C0830h.f5189h));
        m608d(sb, i2, 4, resources.getString(C0830h.f5191j));
        m608d(sb, i2, 8, resources.getString(C0830h.f5187f));
        if (cM614g == '\b') {
            sb.append(resources.getString(C0830h.f5185d));
        } else if (cM614g == '\n') {
            sb.append(resources.getString(C0830h.f5186e));
        } else if (cM614g != ' ') {
            sb.append(cM614g);
        } else {
            sb.append(resources.getString(C0830h.f5190i));
        }
        return sb.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f626o != null;
    }

    /* renamed from: i */
    CharSequence m616i(InterfaceC0094n.a aVar) {
        return (aVar == null || !aVar.mo471d()) ? getTitle() : getTitleCondensed();
    }

    @Override // p024c.p052i.p054f.p055a.InterfaceMenuItemC0935b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f610D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f636y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f636y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f636y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        AbstractC0282b abstractC0282b = this.f608B;
        return (abstractC0282b == null || !abstractC0282b.mo641g()) ? (this.f636y & 8) == 0 : (this.f636y & 8) == 0 && this.f608B.mo639b();
    }

    /* renamed from: j */
    public boolean m617j() {
        AbstractC0282b abstractC0282b;
        if ((this.f637z & 8) == 0) {
            return false;
        }
        if (this.f607A == null && (abstractC0282b = this.f608B) != null) {
            this.f607A = abstractC0282b.mo640d(this);
        }
        return this.f607A != null;
    }

    /* renamed from: k */
    public boolean m618k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f628q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        C0087g c0087g = this.f625n;
        if (c0087g.mo591h(c0087g, this)) {
            return true;
        }
        Runnable runnable = this.f627p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f618g != null) {
            try {
                this.f625n.m602w().startActivity(this.f618g);
                return true;
            } catch (ActivityNotFoundException e2) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e2);
            }
        }
        AbstractC0282b abstractC0282b = this.f608B;
        return abstractC0282b != null && abstractC0282b.mo637e();
    }

    /* renamed from: l */
    public boolean m619l() {
        return (this.f636y & 32) == 32;
    }

    /* renamed from: m */
    public boolean m620m() {
        return (this.f636y & 4) != 0;
    }

    /* renamed from: n */
    public boolean m621n() {
        return (this.f637z & 1) == 1;
    }

    /* renamed from: o */
    public boolean m622o() {
        return (this.f637z & 2) == 2;
    }

    @Override // p024c.p052i.p054f.p055a.InterfaceMenuItemC0935b, android.view.MenuItem
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC0935b setActionView(int i2) {
        Context contextM602w = this.f625n.m602w();
        setActionView(LayoutInflater.from(contextM602w).inflate(i2, (ViewGroup) new LinearLayout(contextM602w), false));
        return this;
    }

    @Override // p024c.p052i.p054f.p055a.InterfaceMenuItemC0935b, android.view.MenuItem
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC0935b setActionView(View view) {
        int i2;
        this.f607A = view;
        this.f608B = null;
        if (view != null && view.getId() == -1 && (i2 = this.f612a) > 0) {
            view.setId(i2);
        }
        this.f625n.m565K(this);
        return this;
    }

    /* renamed from: r */
    public void m625r(boolean z) {
        this.f610D = z;
        this.f625n.m567M(false);
    }

    /* renamed from: s */
    void m626s(boolean z) {
        int i2 = this.f636y;
        int i3 = (z ? 2 : 0) | (i2 & (-3));
        this.f636y = i3;
        if (i2 != i3) {
            this.f625n.m567M(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        if (this.f621j == c2) {
            return this;
        }
        this.f621j = Character.toLowerCase(c2);
        this.f625n.m567M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        int i2 = this.f636y;
        int i3 = (z ? 1 : 0) | (i2 & (-2));
        this.f636y = i3;
        if (i2 != i3) {
            this.f625n.m567M(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        if ((this.f636y & 4) != 0) {
            this.f625n.m577X(this);
        } else {
            m626s(z);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        if (z) {
            this.f636y |= 16;
        } else {
            this.f636y &= -17;
        }
        this.f625n.m567M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f624m = 0;
        this.f623l = drawable;
        this.f635x = true;
        this.f625n.m567M(false);
        return this;
    }

    @Override // p024c.p052i.p054f.p055a.InterfaceMenuItemC0935b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f631t = colorStateList;
        this.f633v = true;
        this.f635x = true;
        this.f625n.m567M(false);
        return this;
    }

    @Override // p024c.p052i.p054f.p055a.InterfaceMenuItemC0935b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f632u = mode;
        this.f634w = true;
        this.f635x = true;
        this.f625n.m567M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f618g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        if (this.f619h == c2) {
            return this;
        }
        this.f619h = c2;
        this.f625n.m567M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f609C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f628q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        this.f619h = c2;
        this.f621j = Character.toLowerCase(c3);
        this.f625n.m567M(false);
        return this;
    }

    @Override // p024c.p052i.p054f.p055a.InterfaceMenuItemC0935b, android.view.MenuItem
    public void setShowAsAction(int i2) {
        int i3 = i2 & 3;
        if (i3 != 0 && i3 != 1 && i3 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f637z = i2;
        this.f625n.m565K(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f616e = charSequence;
        this.f625n.m567M(false);
        SubMenuC0098r subMenuC0098r = this.f626o;
        if (subMenuC0098r != null) {
            subMenuC0098r.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f617f = charSequence;
        this.f625n.m567M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        if (m632y(z)) {
            this.f625n.m566L(this);
        }
        return this;
    }

    /* renamed from: t */
    public void m627t(boolean z) {
        this.f636y = (z ? 4 : 0) | (this.f636y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f616e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* renamed from: u */
    public void m628u(boolean z) {
        if (z) {
            this.f636y |= 32;
        } else {
            this.f636y &= -33;
        }
    }

    /* renamed from: v */
    void m629v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f611E = contextMenuInfo;
    }

    @Override // p024c.p052i.p054f.p055a.InterfaceMenuItemC0935b, android.view.MenuItem
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC0935b setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    /* renamed from: x */
    public void m631x(SubMenuC0098r subMenuC0098r) {
        this.f626o = subMenuC0098r;
        subMenuC0098r.setHeaderTitle(getTitle());
    }

    /* renamed from: y */
    boolean m632y(boolean z) {
        int i2 = this.f636y;
        int i3 = (z ? 0 : 8) | (i2 & (-9));
        this.f636y = i3;
        return i2 != i3;
    }

    /* renamed from: z */
    public boolean m633z() {
        return this.f625n.m558C();
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC0935b setContentDescription(CharSequence charSequence) {
        this.f629r = charSequence;
        this.f625n.m567M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC0935b setTooltipText(CharSequence charSequence) {
        this.f630s = charSequence;
        this.f625n.m567M(false);
        return this;
    }

    @Override // p024c.p052i.p054f.p055a.InterfaceMenuItemC0935b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        if (this.f621j == c2 && this.f622k == i2) {
            return this;
        }
        this.f621j = Character.toLowerCase(c2);
        this.f622k = KeyEvent.normalizeMetaState(i2);
        this.f625n.m567M(false);
        return this;
    }

    @Override // p024c.p052i.p054f.p055a.InterfaceMenuItemC0935b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i2) {
        if (this.f619h == c2 && this.f620i == i2) {
            return this;
        }
        this.f619h = c2;
        this.f620i = KeyEvent.normalizeMetaState(i2);
        this.f625n.m567M(false);
        return this;
    }

    @Override // p024c.p052i.p054f.p055a.InterfaceMenuItemC0935b, android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f619h = c2;
        this.f620i = KeyEvent.normalizeMetaState(i2);
        this.f621j = Character.toLowerCase(c3);
        this.f622k = KeyEvent.normalizeMetaState(i3);
        this.f625n.m567M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
        this.f623l = null;
        this.f624m = i2;
        this.f635x = true;
        this.f625n.m567M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
        return setTitle(this.f625n.m602w().getString(i2));
    }
}
