package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC0282b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p024c.p025a.p032o.InterfaceC0843c;
import p024c.p052i.p054f.p055a.InterfaceMenuItemC0935b;

/* compiled from: MenuItemWrapperICS.java */
/* renamed from: androidx.appcompat.view.menu.j */
/* loaded from: classes.dex */
public class MenuItemC0090j extends AbstractC0083c implements MenuItem {

    /* renamed from: d */
    private final InterfaceMenuItemC0935b f639d;

    /* renamed from: e */
    private Method f640e;

    /* compiled from: MenuItemWrapperICS.java */
    /* renamed from: androidx.appcompat.view.menu.j$a */
    private class a extends AbstractC0282b {

        /* renamed from: d */
        final ActionProvider f641d;

        a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f641d = actionProvider;
        }

        @Override // androidx.core.view.AbstractC0282b
        /* renamed from: a */
        public boolean mo635a() {
            return this.f641d.hasSubMenu();
        }

        @Override // androidx.core.view.AbstractC0282b
        /* renamed from: c */
        public View mo636c() {
            return this.f641d.onCreateActionView();
        }

        @Override // androidx.core.view.AbstractC0282b
        /* renamed from: e */
        public boolean mo637e() {
            return this.f641d.onPerformDefaultAction();
        }

        @Override // androidx.core.view.AbstractC0282b
        /* renamed from: f */
        public void mo638f(SubMenu subMenu) {
            this.f641d.onPrepareSubMenu(MenuItemC0090j.this.m508d(subMenu));
        }
    }

    /* compiled from: MenuItemWrapperICS.java */
    /* renamed from: androidx.appcompat.view.menu.j$b */
    private class b extends a implements ActionProvider.VisibilityListener {

        /* renamed from: f */
        private AbstractC0282b.b f643f;

        b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // androidx.core.view.AbstractC0282b
        /* renamed from: b */
        public boolean mo639b() {
            return this.f641d.isVisible();
        }

        @Override // androidx.core.view.AbstractC0282b
        /* renamed from: d */
        public View mo640d(MenuItem menuItem) {
            return this.f641d.onCreateActionView(menuItem);
        }

        @Override // androidx.core.view.AbstractC0282b
        /* renamed from: g */
        public boolean mo641g() {
            return this.f641d.overridesItemVisibility();
        }

        @Override // androidx.core.view.AbstractC0282b
        /* renamed from: j */
        public void mo642j(AbstractC0282b.b bVar) {
            this.f643f = bVar;
            this.f641d.setVisibilityListener(bVar != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z) {
            AbstractC0282b.b bVar = this.f643f;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z);
            }
        }
    }

    /* compiled from: MenuItemWrapperICS.java */
    /* renamed from: androidx.appcompat.view.menu.j$c */
    static class c extends FrameLayout implements InterfaceC0843c {

        /* renamed from: f */
        final CollapsibleActionView f645f;

        /* JADX WARN: Multi-variable type inference failed */
        c(View view) {
            super(view.getContext());
            this.f645f = (CollapsibleActionView) view;
            addView(view);
        }

        /* renamed from: a */
        View m643a() {
            return (View) this.f645f;
        }

        @Override // p024c.p025a.p032o.InterfaceC0843c
        /* renamed from: c */
        public void mo644c() {
            this.f645f.onActionViewExpanded();
        }

        @Override // p024c.p025a.p032o.InterfaceC0843c
        /* renamed from: f */
        public void mo645f() {
            this.f645f.onActionViewCollapsed();
        }
    }

    /* compiled from: MenuItemWrapperICS.java */
    /* renamed from: androidx.appcompat.view.menu.j$d */
    private class d implements MenuItem.OnActionExpandListener {

        /* renamed from: a */
        private final MenuItem.OnActionExpandListener f646a;

        d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f646a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f646a.onMenuItemActionCollapse(MenuItemC0090j.this.m507c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f646a.onMenuItemActionExpand(MenuItemC0090j.this.m507c(menuItem));
        }
    }

    /* compiled from: MenuItemWrapperICS.java */
    /* renamed from: androidx.appcompat.view.menu.j$e */
    private class e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: f */
        private final MenuItem.OnMenuItemClickListener f648f;

        e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f648f = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f648f.onMenuItemClick(MenuItemC0090j.this.m507c(menuItem));
        }
    }

    public MenuItemC0090j(Context context, InterfaceMenuItemC0935b interfaceMenuItemC0935b) {
        super(context);
        if (interfaceMenuItemC0935b == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f639d = interfaceMenuItemC0935b;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f639d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f639d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        AbstractC0282b abstractC0282bMo487b = this.f639d.mo487b();
        if (abstractC0282bMo487b instanceof a) {
            return ((a) abstractC0282bMo487b).f641d;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f639d.getActionView();
        return actionView instanceof c ? ((c) actionView).m643a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f639d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f639d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f639d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f639d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f639d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f639d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f639d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f639d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f639d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f639d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f639d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f639d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f639d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return m508d(this.f639d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f639d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f639d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f639d.getTooltipText();
    }

    /* renamed from: h */
    public void m634h(boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            if (this.f640e == null) {
                this.f640e = this.f639d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f640e.invoke(this.f639d, Boolean.valueOf(z));
        } catch (Exception e2) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
        }
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f639d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f639d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f639d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f639d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f639d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f639d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        AbstractC0282b bVar = Build.VERSION.SDK_INT >= 16 ? new b(this.f518a, actionProvider) : new a(this.f518a, actionProvider);
        InterfaceMenuItemC0935b interfaceMenuItemC0935b = this.f639d;
        if (actionProvider == null) {
            bVar = null;
        }
        interfaceMenuItemC0935b.mo486a(bVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new c(view);
        }
        this.f639d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        this.f639d.setAlphabeticShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.f639d.setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.f639d.setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f639d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f639d.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f639d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f639d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f639d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f639d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        this.f639d.setNumericShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f639d.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f639d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        this.f639d.setShortcut(c2, c3);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i2) {
        this.f639d.setShowAsAction(i2);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i2) {
        this.f639d.setShowAsActionFlags(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f639d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f639d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f639d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        return this.f639d.setVisible(z);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.f639d.setAlphabeticShortcut(c2, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
        this.f639d.setIcon(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i2) {
        this.f639d.setNumericShortcut(c2, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f639d.setShortcut(c2, c3, i2, i3);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
        this.f639d.setTitle(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i2) {
        this.f639d.setActionView(i2);
        View actionView = this.f639d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f639d.setActionView(new c(actionView));
        }
        return this;
    }
}
