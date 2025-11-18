package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p024c.p052i.p054f.p055a.InterfaceSubMenuC0936c;

/* compiled from: SubMenuWrapperICS.java */
/* renamed from: androidx.appcompat.view.menu.s */
/* loaded from: classes.dex */
class SubMenuC0099s extends MenuC0095o implements SubMenu {

    /* renamed from: e */
    private final InterfaceSubMenuC0936c f690e;

    SubMenuC0099s(Context context, InterfaceSubMenuC0936c interfaceSubMenuC0936c) {
        super(context, interfaceSubMenuC0936c);
        this.f690e = interfaceSubMenuC0936c;
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        this.f690e.clearHeader();
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return m507c(this.f690e.getItem());
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i2) {
        this.f690e.setHeaderIcon(i2);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i2) {
        this.f690e.setHeaderTitle(i2);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        this.f690e.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i2) {
        this.f690e.setIcon(i2);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f690e.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f690e.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f690e.setIcon(drawable);
        return this;
    }
}
