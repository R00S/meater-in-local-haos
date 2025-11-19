package n;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import s1.AbstractC4423b;

/* compiled from: MenuItemWrapperICS.java */
/* renamed from: n.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class MenuItemC4048c extends AbstractC4047b implements MenuItem {

    /* renamed from: d, reason: collision with root package name */
    private final l1.b f45560d;

    /* renamed from: e, reason: collision with root package name */
    private Method f45561e;

    /* compiled from: MenuItemWrapperICS.java */
    /* renamed from: n.c$a */
    private class a extends AbstractC4423b implements ActionProvider.VisibilityListener {

        /* renamed from: d, reason: collision with root package name */
        private AbstractC4423b.InterfaceC0688b f45562d;

        /* renamed from: e, reason: collision with root package name */
        private final ActionProvider f45563e;

        a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f45563e = actionProvider;
        }

        @Override // s1.AbstractC4423b
        public boolean a() {
            return this.f45563e.hasSubMenu();
        }

        @Override // s1.AbstractC4423b
        public boolean b() {
            return this.f45563e.isVisible();
        }

        @Override // s1.AbstractC4423b
        public View c() {
            return this.f45563e.onCreateActionView();
        }

        @Override // s1.AbstractC4423b
        public View d(MenuItem menuItem) {
            return this.f45563e.onCreateActionView(menuItem);
        }

        @Override // s1.AbstractC4423b
        public boolean e() {
            return this.f45563e.onPerformDefaultAction();
        }

        @Override // s1.AbstractC4423b
        public void f(SubMenu subMenu) {
            this.f45563e.onPrepareSubMenu(MenuItemC4048c.this.d(subMenu));
        }

        @Override // s1.AbstractC4423b
        public boolean g() {
            return this.f45563e.overridesItemVisibility();
        }

        @Override // s1.AbstractC4423b
        public void j(AbstractC4423b.InterfaceC0688b interfaceC0688b) {
            this.f45562d = interfaceC0688b;
            this.f45563e.setVisibilityListener(interfaceC0688b != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z10) {
            AbstractC4423b.InterfaceC0688b interfaceC0688b = this.f45562d;
            if (interfaceC0688b != null) {
                interfaceC0688b.onActionProviderVisibilityChanged(z10);
            }
        }
    }

    /* compiled from: MenuItemWrapperICS.java */
    /* renamed from: n.c$b */
    static class b extends FrameLayout implements androidx.appcompat.view.c {

        /* renamed from: B, reason: collision with root package name */
        final CollapsibleActionView f45565B;

        /* JADX WARN: Multi-variable type inference failed */
        b(View view) {
            super(view.getContext());
            this.f45565B = (CollapsibleActionView) view;
            addView(view);
        }

        View a() {
            return (View) this.f45565B;
        }

        @Override // androidx.appcompat.view.c
        public void c() {
            this.f45565B.onActionViewExpanded();
        }

        @Override // androidx.appcompat.view.c
        public void f() {
            this.f45565B.onActionViewCollapsed();
        }
    }

    /* compiled from: MenuItemWrapperICS.java */
    /* renamed from: n.c$c, reason: collision with other inner class name */
    private class MenuItemOnActionExpandListenerC0617c implements MenuItem.OnActionExpandListener {

        /* renamed from: a, reason: collision with root package name */
        private final MenuItem.OnActionExpandListener f45566a;

        MenuItemOnActionExpandListenerC0617c(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f45566a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f45566a.onMenuItemActionCollapse(MenuItemC4048c.this.c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f45566a.onMenuItemActionExpand(MenuItemC4048c.this.c(menuItem));
        }
    }

    /* compiled from: MenuItemWrapperICS.java */
    /* renamed from: n.c$d */
    private class d implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a, reason: collision with root package name */
        private final MenuItem.OnMenuItemClickListener f45568a;

        d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f45568a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f45568a.onMenuItemClick(MenuItemC4048c.this.c(menuItem));
        }
    }

    public MenuItemC4048c(Context context, l1.b bVar) {
        super(context);
        if (bVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f45560d = bVar;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f45560d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f45560d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        AbstractC4423b abstractC4423bB = this.f45560d.b();
        if (abstractC4423bB instanceof a) {
            return ((a) abstractC4423bB).f45563e;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f45560d.getActionView();
        return actionView instanceof b ? ((b) actionView).a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f45560d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f45560d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f45560d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f45560d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f45560d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f45560d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f45560d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f45560d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f45560d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f45560d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f45560d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f45560d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f45560d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return d(this.f45560d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f45560d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f45560d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f45560d.getTooltipText();
    }

    public void h(boolean z10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            if (this.f45561e == null) {
                this.f45561e = this.f45560d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f45561e.invoke(this.f45560d, Boolean.valueOf(z10));
        } catch (Exception e10) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
        }
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f45560d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f45560d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f45560d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f45560d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f45560d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f45560d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        a aVar = new a(this.f45557a, actionProvider);
        l1.b bVar = this.f45560d;
        if (actionProvider == null) {
            aVar = null;
        }
        bVar.a(aVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new b(view);
        }
        this.f45560d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f45560d.setAlphabeticShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f45560d.setCheckable(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f45560d.setChecked(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f45560d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f45560d.setEnabled(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f45560d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f45560d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f45560d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f45560d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f45560d.setNumericShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f45560d.setOnActionExpandListener(onActionExpandListener != null ? new MenuItemOnActionExpandListenerC0617c(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f45560d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new d(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f45560d.setShortcut(c10, c11);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i10) {
        this.f45560d.setShowAsAction(i10);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i10) {
        this.f45560d.setShowAsActionFlags(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f45560d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f45560d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f45560d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        return this.f45560d.setVisible(z10);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f45560d.setAlphabeticShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f45560d.setIcon(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f45560d.setNumericShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f45560d.setShortcut(c10, c11, i10, i11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f45560d.setTitle(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i10) {
        this.f45560d.setActionView(i10);
        View actionView = this.f45560d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f45560d.setActionView(new b(actionView));
        }
        return this;
    }
}
