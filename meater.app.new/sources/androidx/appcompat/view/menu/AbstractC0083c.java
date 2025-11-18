package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import p024c.p041e.C0873g;
import p024c.p052i.p054f.p055a.InterfaceMenuItemC0935b;
import p024c.p052i.p054f.p055a.InterfaceSubMenuC0936c;

/* compiled from: BaseMenuWrapper.java */
/* renamed from: androidx.appcompat.view.menu.c */
/* loaded from: classes.dex */
abstract class AbstractC0083c {

    /* renamed from: a */
    final Context f518a;

    /* renamed from: b */
    private C0873g<InterfaceMenuItemC0935b, MenuItem> f519b;

    /* renamed from: c */
    private C0873g<InterfaceSubMenuC0936c, SubMenu> f520c;

    AbstractC0083c(Context context) {
        this.f518a = context;
    }

    /* renamed from: c */
    final MenuItem m507c(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC0935b)) {
            return menuItem;
        }
        InterfaceMenuItemC0935b interfaceMenuItemC0935b = (InterfaceMenuItemC0935b) menuItem;
        if (this.f519b == null) {
            this.f519b = new C0873g<>();
        }
        MenuItem menuItem2 = this.f519b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC0090j menuItemC0090j = new MenuItemC0090j(this.f518a, interfaceMenuItemC0935b);
        this.f519b.put(interfaceMenuItemC0935b, menuItemC0090j);
        return menuItemC0090j;
    }

    /* renamed from: d */
    final SubMenu m508d(SubMenu subMenu) {
        if (!(subMenu instanceof InterfaceSubMenuC0936c)) {
            return subMenu;
        }
        InterfaceSubMenuC0936c interfaceSubMenuC0936c = (InterfaceSubMenuC0936c) subMenu;
        if (this.f520c == null) {
            this.f520c = new C0873g<>();
        }
        SubMenu subMenu2 = this.f520c.get(interfaceSubMenuC0936c);
        if (subMenu2 != null) {
            return subMenu2;
        }
        SubMenuC0099s subMenuC0099s = new SubMenuC0099s(this.f518a, interfaceSubMenuC0936c);
        this.f520c.put(interfaceSubMenuC0936c, subMenuC0099s);
        return subMenuC0099s;
    }

    /* renamed from: e */
    final void m509e() {
        C0873g<InterfaceMenuItemC0935b, MenuItem> c0873g = this.f519b;
        if (c0873g != null) {
            c0873g.clear();
        }
        C0873g<InterfaceSubMenuC0936c, SubMenu> c0873g2 = this.f520c;
        if (c0873g2 != null) {
            c0873g2.clear();
        }
    }

    /* renamed from: f */
    final void m510f(int i2) {
        if (this.f519b == null) {
            return;
        }
        int i3 = 0;
        while (i3 < this.f519b.size()) {
            if (this.f519b.m5473j(i3).getGroupId() == i2) {
                this.f519b.mo5475l(i3);
                i3--;
            }
            i3++;
        }
    }

    /* renamed from: g */
    final void m511g(int i2) {
        if (this.f519b == null) {
            return;
        }
        for (int i3 = 0; i3 < this.f519b.size(); i3++) {
            if (this.f519b.m5473j(i3).getItemId() == i2) {
                this.f519b.mo5475l(i3);
                return;
            }
        }
    }
}
