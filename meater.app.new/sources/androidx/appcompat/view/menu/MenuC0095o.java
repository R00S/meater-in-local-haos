package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p024c.p052i.p054f.p055a.InterfaceMenuC0934a;

/* compiled from: MenuWrapperICS.java */
/* renamed from: androidx.appcompat.view.menu.o */
/* loaded from: classes.dex */
public class MenuC0095o extends AbstractC0083c implements Menu {

    /* renamed from: d */
    private final InterfaceMenuC0934a f664d;

    public MenuC0095o(Context context, InterfaceMenuC0934a interfaceMenuC0934a) {
        super(context);
        if (interfaceMenuC0934a == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f664d = interfaceMenuC0934a;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m507c(this.f664d.add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f664d.addIntentOptions(i2, i3, i4, componentName, intentArr, intent, i5, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i6 = 0; i6 < length; i6++) {
                menuItemArr[i6] = m507c(menuItemArr2[i6]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return m508d(this.f664d.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        m509e();
        this.f664d.clear();
    }

    @Override // android.view.Menu
    public void close() {
        this.f664d.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i2) {
        return m507c(this.f664d.findItem(i2));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i2) {
        return m507c(this.f664d.getItem(i2));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.f664d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return this.f664d.isShortcutKey(i2, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i2, int i3) {
        return this.f664d.performIdentifierAction(i2, i3);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        return this.f664d.performShortcut(i2, keyEvent, i3);
    }

    @Override // android.view.Menu
    public void removeGroup(int i2) {
        m510f(i2);
        this.f664d.removeGroup(i2);
    }

    @Override // android.view.Menu
    public void removeItem(int i2) {
        m511g(i2);
        this.f664d.removeItem(i2);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i2, boolean z, boolean z2) {
        this.f664d.setGroupCheckable(i2, z, z2);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i2, boolean z) {
        this.f664d.setGroupEnabled(i2, z);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i2, boolean z) {
        this.f664d.setGroupVisible(i2, z);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f664d.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f664d.size();
    }

    @Override // android.view.Menu
    public MenuItem add(int i2) {
        return m507c(this.f664d.add(i2));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2) {
        return m508d(this.f664d.addSubMenu(i2));
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return m507c(this.f664d.add(i2, i3, i4, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        return m508d(this.f664d.addSubMenu(i2, i3, i4, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i4, int i5) {
        return m507c(this.f664d.add(i2, i3, i4, i5));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return m508d(this.f664d.addSubMenu(i2, i3, i4, i5));
    }
}
