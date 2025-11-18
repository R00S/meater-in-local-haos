package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.e;

/* compiled from: SubMenuBuilder.java */
/* loaded from: classes.dex */
public class m extends e implements SubMenu {

    /* renamed from: B, reason: collision with root package name */
    private e f21113B;

    /* renamed from: C, reason: collision with root package name */
    private g f21114C;

    public m(Context context, e eVar, g gVar) {
        super(context);
        this.f21113B = eVar;
        this.f21114C = gVar;
    }

    @Override // androidx.appcompat.view.menu.e
    public e F() {
        return this.f21113B.F();
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean I() {
        return this.f21113B.I();
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean J() {
        return this.f21113B.J();
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean K() {
        return this.f21113B.K();
    }

    @Override // androidx.appcompat.view.menu.e
    public void W(e.a aVar) {
        this.f21113B.W(aVar);
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean f(g gVar) {
        return this.f21113B.f(gVar);
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.f21114C;
    }

    @Override // androidx.appcompat.view.menu.e
    boolean h(e eVar, MenuItem menuItem) {
        return super.h(eVar, menuItem) || this.f21113B.h(eVar, menuItem);
    }

    public Menu j0() {
        return this.f21113B;
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean m(g gVar) {
        return this.f21113B.m(gVar);
    }

    @Override // androidx.appcompat.view.menu.e, android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f21113B.setGroupDividerEnabled(z10);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.a0(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.d0(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.e0(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f21114C.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.e, android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f21113B.setQwertyMode(z10);
    }

    @Override // androidx.appcompat.view.menu.e
    public String v() {
        g gVar = this.f21114C;
        int itemId = gVar != null ? gVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.v() + ":" + itemId;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i10) {
        return (SubMenu) super.Z(i10);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i10) {
        return (SubMenu) super.c0(i10);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i10) {
        this.f21114C.setIcon(i10);
        return this;
    }
}
