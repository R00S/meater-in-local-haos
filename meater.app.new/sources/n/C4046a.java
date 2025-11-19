package n;

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
import g1.C3377a;
import k1.C3784a;
import s1.AbstractC4423b;

/* compiled from: ActionMenuItem.java */
/* renamed from: n.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4046a implements l1.b {

    /* renamed from: a, reason: collision with root package name */
    private final int f45537a;

    /* renamed from: b, reason: collision with root package name */
    private final int f45538b;

    /* renamed from: c, reason: collision with root package name */
    private final int f45539c;

    /* renamed from: d, reason: collision with root package name */
    private CharSequence f45540d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f45541e;

    /* renamed from: f, reason: collision with root package name */
    private Intent f45542f;

    /* renamed from: g, reason: collision with root package name */
    private char f45543g;

    /* renamed from: i, reason: collision with root package name */
    private char f45545i;

    /* renamed from: k, reason: collision with root package name */
    private Drawable f45547k;

    /* renamed from: l, reason: collision with root package name */
    private Context f45548l;

    /* renamed from: m, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f45549m;

    /* renamed from: n, reason: collision with root package name */
    private CharSequence f45550n;

    /* renamed from: o, reason: collision with root package name */
    private CharSequence f45551o;

    /* renamed from: h, reason: collision with root package name */
    private int f45544h = 4096;

    /* renamed from: j, reason: collision with root package name */
    private int f45546j = 4096;

    /* renamed from: p, reason: collision with root package name */
    private ColorStateList f45552p = null;

    /* renamed from: q, reason: collision with root package name */
    private PorterDuff.Mode f45553q = null;

    /* renamed from: r, reason: collision with root package name */
    private boolean f45554r = false;

    /* renamed from: s, reason: collision with root package name */
    private boolean f45555s = false;

    /* renamed from: t, reason: collision with root package name */
    private int f45556t = 16;

    public C4046a(Context context, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        this.f45548l = context;
        this.f45537a = i11;
        this.f45538b = i10;
        this.f45539c = i13;
        this.f45540d = charSequence;
    }

    private void c() {
        Drawable drawable = this.f45547k;
        if (drawable != null) {
            if (this.f45554r || this.f45555s) {
                Drawable drawableR = C3784a.r(drawable);
                this.f45547k = drawableR;
                Drawable drawableMutate = drawableR.mutate();
                this.f45547k = drawableMutate;
                if (this.f45554r) {
                    C3784a.o(drawableMutate, this.f45552p);
                }
                if (this.f45555s) {
                    C3784a.p(this.f45547k, this.f45553q);
                }
            }
        }
    }

    @Override // l1.b
    public l1.b a(AbstractC4423b abstractC4423b) {
        throw new UnsupportedOperationException();
    }

    @Override // l1.b
    public AbstractC4423b b() {
        return null;
    }

    @Override // l1.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // l1.b, android.view.MenuItem
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public l1.b setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // l1.b, android.view.MenuItem
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public l1.b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // l1.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // l1.b, android.view.MenuItem
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public l1.b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // l1.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // l1.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f45546j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f45545i;
    }

    @Override // l1.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f45550n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f45538b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f45547k;
    }

    @Override // l1.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f45552p;
    }

    @Override // l1.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f45553q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f45542f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f45537a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // l1.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f45544h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f45543g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f45539c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f45540d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f45541e;
        return charSequence != null ? charSequence : this.f45540d;
    }

    @Override // l1.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f45551o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // l1.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f45556t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f45556t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f45556t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f45556t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f45545i = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f45556t = (z10 ? 1 : 0) | (this.f45556t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f45556t = (z10 ? 2 : 0) | (this.f45556t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f45556t = (z10 ? 16 : 0) | (this.f45556t & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f45547k = drawable;
        c();
        return this;
    }

    @Override // l1.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f45552p = colorStateList;
        this.f45554r = true;
        c();
        return this;
    }

    @Override // l1.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f45553q = mode;
        this.f45555s = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f45542f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f45543g = c10;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f45549m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f45543g = c10;
        this.f45545i = Character.toLowerCase(c11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f45540d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f45541e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        this.f45556t = (this.f45556t & 8) | (z10 ? 0 : 8);
        return this;
    }

    @Override // l1.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f45545i = Character.toLowerCase(c10);
        this.f45546j = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public l1.b setContentDescription(CharSequence charSequence) {
        this.f45550n = charSequence;
        return this;
    }

    @Override // l1.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f45543g = c10;
        this.f45544h = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f45540d = this.f45548l.getResources().getString(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public l1.b setTooltipText(CharSequence charSequence) {
        this.f45551o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f45547k = C3377a.e(this.f45548l, i10);
        c();
        return this;
    }

    @Override // l1.b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f45543g = c10;
        this.f45544h = KeyEvent.normalizeMetaState(i10);
        this.f45545i = Character.toLowerCase(c11);
        this.f45546j = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // l1.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
    }
}
