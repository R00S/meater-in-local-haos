package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.content.C0255a;
import androidx.core.graphics.drawable.C0265a;
import androidx.core.view.AbstractC0282b;
import androidx.recyclerview.widget.RecyclerView;
import p024c.p052i.p054f.p055a.InterfaceMenuItemC0935b;

/* compiled from: ActionMenuItem.java */
/* renamed from: androidx.appcompat.view.menu.a */
/* loaded from: classes.dex */
public class C0081a implements InterfaceMenuItemC0935b {

    /* renamed from: a */
    private final int f488a;

    /* renamed from: b */
    private final int f489b;

    /* renamed from: c */
    private final int f490c;

    /* renamed from: d */
    private CharSequence f491d;

    /* renamed from: e */
    private CharSequence f492e;

    /* renamed from: f */
    private Intent f493f;

    /* renamed from: g */
    private char f494g;

    /* renamed from: i */
    private char f496i;

    /* renamed from: k */
    private Drawable f498k;

    /* renamed from: l */
    private Context f499l;

    /* renamed from: m */
    private MenuItem.OnMenuItemClickListener f500m;

    /* renamed from: n */
    private CharSequence f501n;

    /* renamed from: o */
    private CharSequence f502o;

    /* renamed from: h */
    private int f495h = RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT;

    /* renamed from: j */
    private int f497j = RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT;

    /* renamed from: p */
    private ColorStateList f503p = null;

    /* renamed from: q */
    private PorterDuff.Mode f504q = null;

    /* renamed from: r */
    private boolean f505r = false;

    /* renamed from: s */
    private boolean f506s = false;

    /* renamed from: t */
    private int f507t = 16;

    public C0081a(Context context, int i2, int i3, int i4, int i5, CharSequence charSequence) {
        this.f499l = context;
        this.f488a = i3;
        this.f489b = i2;
        this.f490c = i5;
        this.f491d = charSequence;
    }

    /* renamed from: c */
    private void m485c() {
        Drawable drawable = this.f498k;
        if (drawable != null) {
            if (this.f505r || this.f506s) {
                Drawable drawableM1821r = C0265a.m1821r(drawable);
                this.f498k = drawableM1821r;
                Drawable drawableMutate = drawableM1821r.mutate();
                this.f498k = drawableMutate;
                if (this.f505r) {
                    C0265a.m1818o(drawableMutate, this.f503p);
                }
                if (this.f506s) {
                    C0265a.m1819p(this.f498k, this.f504q);
                }
            }
        }
    }

    @Override // p024c.p052i.p054f.p055a.InterfaceMenuItemC0935b
    /* renamed from: a */
    public InterfaceMenuItemC0935b mo486a(AbstractC0282b abstractC0282b) {
        throw new UnsupportedOperationException();
    }

    @Override // p024c.p052i.p054f.p055a.InterfaceMenuItemC0935b
    /* renamed from: b */
    public AbstractC0282b mo487b() {
        return null;
    }

    @Override // p024c.p052i.p054f.p055a.InterfaceMenuItemC0935b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // p024c.p052i.p054f.p055a.InterfaceMenuItemC0935b, android.view.MenuItem
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC0935b setActionView(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // p024c.p052i.p054f.p055a.InterfaceMenuItemC0935b, android.view.MenuItem
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC0935b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // p024c.p052i.p054f.p055a.InterfaceMenuItemC0935b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // p024c.p052i.p054f.p055a.InterfaceMenuItemC0935b, android.view.MenuItem
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC0935b setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // p024c.p052i.p054f.p055a.InterfaceMenuItemC0935b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // p024c.p052i.p054f.p055a.InterfaceMenuItemC0935b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f497j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f496i;
    }

    @Override // p024c.p052i.p054f.p055a.InterfaceMenuItemC0935b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f501n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f489b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f498k;
    }

    @Override // p024c.p052i.p054f.p055a.InterfaceMenuItemC0935b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f503p;
    }

    @Override // p024c.p052i.p054f.p055a.InterfaceMenuItemC0935b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f504q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f493f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f488a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p024c.p052i.p054f.p055a.InterfaceMenuItemC0935b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f495h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f494g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f490c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f491d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f492e;
        return charSequence != null ? charSequence : this.f491d;
    }

    @Override // p024c.p052i.p054f.p055a.InterfaceMenuItemC0935b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f502o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // p024c.p052i.p054f.p055a.InterfaceMenuItemC0935b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f507t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f507t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f507t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f507t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        this.f496i = Character.toLowerCase(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.f507t = (z ? 1 : 0) | (this.f507t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.f507t = (z ? 2 : 0) | (this.f507t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f507t = (z ? 16 : 0) | (this.f507t & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f498k = drawable;
        m485c();
        return this;
    }

    @Override // p024c.p052i.p054f.p055a.InterfaceMenuItemC0935b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f503p = colorStateList;
        this.f505r = true;
        m485c();
        return this;
    }

    @Override // p024c.p052i.p054f.p055a.InterfaceMenuItemC0935b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f504q = mode;
        this.f506s = true;
        m485c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f493f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        this.f494g = c2;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f500m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        this.f494g = c2;
        this.f496i = Character.toLowerCase(c3);
        return this;
    }

    @Override // p024c.p052i.p054f.p055a.InterfaceMenuItemC0935b, android.view.MenuItem
    public void setShowAsAction(int i2) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f491d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f492e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        this.f507t = (this.f507t & 8) | (z ? 0 : 8);
        return this;
    }

    @Override // p024c.p052i.p054f.p055a.InterfaceMenuItemC0935b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.f496i = Character.toLowerCase(c2);
        this.f497j = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC0935b setContentDescription(CharSequence charSequence) {
        this.f501n = charSequence;
        return this;
    }

    @Override // p024c.p052i.p054f.p055a.InterfaceMenuItemC0935b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i2) {
        this.f494g = c2;
        this.f495h = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
        this.f491d = this.f499l.getResources().getString(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC0935b setTooltipText(CharSequence charSequence) {
        this.f502o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
        this.f498k = C0255a.m1677f(this.f499l, i2);
        m485c();
        return this;
    }

    @Override // p024c.p052i.p054f.p055a.InterfaceMenuItemC0935b, android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f494g = c2;
        this.f495h = KeyEvent.normalizeMetaState(i2);
        this.f496i = Character.toLowerCase(c3);
        this.f497j = KeyEvent.normalizeMetaState(i3);
        return this;
    }
}
