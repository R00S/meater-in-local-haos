package n;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import s.X;

/* compiled from: BaseMenuWrapper.java */
/* renamed from: n.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC4047b {

    /* renamed from: a, reason: collision with root package name */
    final Context f45557a;

    /* renamed from: b, reason: collision with root package name */
    private X<l1.b, MenuItem> f45558b;

    /* renamed from: c, reason: collision with root package name */
    private X<l1.c, SubMenu> f45559c;

    AbstractC4047b(Context context) {
        this.f45557a = context;
    }

    final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof l1.b)) {
            return menuItem;
        }
        l1.b bVar = (l1.b) menuItem;
        if (this.f45558b == null) {
            this.f45558b = new X<>();
        }
        MenuItem menuItem2 = this.f45558b.get(bVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC4048c menuItemC4048c = new MenuItemC4048c(this.f45557a, bVar);
        this.f45558b.put(bVar, menuItemC4048c);
        return menuItemC4048c;
    }

    final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof l1.c)) {
            return subMenu;
        }
        l1.c cVar = (l1.c) subMenu;
        if (this.f45559c == null) {
            this.f45559c = new X<>();
        }
        SubMenu subMenu2 = this.f45559c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        f fVar = new f(this.f45557a, cVar);
        this.f45559c.put(cVar, fVar);
        return fVar;
    }

    final void e() {
        X<l1.b, MenuItem> x10 = this.f45558b;
        if (x10 != null) {
            x10.clear();
        }
        X<l1.c, SubMenu> x11 = this.f45559c;
        if (x11 != null) {
            x11.clear();
        }
    }

    final void f(int i10) {
        if (this.f45558b == null) {
            return;
        }
        int i11 = 0;
        while (i11 < this.f45558b.getSize()) {
            if (this.f45558b.h(i11).getGroupId() == i10) {
                this.f45558b.j(i11);
                i11--;
            }
            i11++;
        }
    }

    final void g(int i10) {
        if (this.f45558b == null) {
            return;
        }
        for (int i11 = 0; i11 < this.f45558b.getSize(); i11++) {
            if (this.f45558b.h(i11).getItemId() == i10) {
                this.f45558b.j(i11);
                return;
            }
        }
    }
}
