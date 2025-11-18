package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0087g;

/* compiled from: SubMenuBuilder.java */
/* renamed from: androidx.appcompat.view.menu.r */
/* loaded from: classes.dex */
public class SubMenuC0098r extends C0087g implements SubMenu {

    /* renamed from: B */
    private C0087g f688B;

    /* renamed from: C */
    private C0089i f689C;

    public SubMenuC0098r(Context context, C0087g c0087g, C0089i c0089i) {
        super(context);
        this.f688B = c0087g;
        this.f689C = c0089i;
    }

    @Override // androidx.appcompat.view.menu.C0087g
    /* renamed from: F */
    public C0087g mo560F() {
        return this.f688B.mo560F();
    }

    @Override // androidx.appcompat.view.menu.C0087g
    /* renamed from: H */
    public boolean mo562H() {
        return this.f688B.mo562H();
    }

    @Override // androidx.appcompat.view.menu.C0087g
    /* renamed from: I */
    public boolean mo563I() {
        return this.f688B.mo563I();
    }

    @Override // androidx.appcompat.view.menu.C0087g
    /* renamed from: J */
    public boolean mo564J() {
        return this.f688B.mo564J();
    }

    @Override // androidx.appcompat.view.menu.C0087g
    /* renamed from: V */
    public void mo575V(C0087g.a aVar) {
        this.f688B.mo575V(aVar);
    }

    @Override // androidx.appcompat.view.menu.C0087g
    /* renamed from: f */
    public boolean mo589f(C0089i c0089i) {
        return this.f688B.mo589f(c0089i);
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.f689C;
    }

    @Override // androidx.appcompat.view.menu.C0087g
    /* renamed from: h */
    boolean mo591h(C0087g c0087g, MenuItem menuItem) {
        return super.mo591h(c0087g, menuItem) || this.f688B.mo591h(c0087g, menuItem);
    }

    /* renamed from: i0 */
    public Menu m666i0() {
        return this.f688B;
    }

    @Override // androidx.appcompat.view.menu.C0087g
    /* renamed from: m */
    public boolean mo593m(C0089i c0089i) {
        return this.f688B.mo593m(c0089i);
    }

    @Override // androidx.appcompat.view.menu.C0087g, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f688B.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.m579Z(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.m584c0(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.m586d0(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f689C.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.C0087g, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f688B.setQwertyMode(z);
    }

    @Override // androidx.appcompat.view.menu.C0087g
    /* renamed from: v */
    public String mo601v() {
        C0089i c0089i = this.f689C;
        int itemId = c0089i != null ? c0089i.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.mo601v() + ":" + itemId;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i2) {
        return (SubMenu) super.m578Y(i2);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i2) {
        return (SubMenu) super.m582b0(i2);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i2) {
        this.f689C.setIcon(i2);
        return this;
    }
}
