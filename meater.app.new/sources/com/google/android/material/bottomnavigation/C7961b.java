package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.appcompat.view.menu.C0087g;
import androidx.appcompat.view.menu.C0089i;

/* compiled from: BottomNavigationMenu.java */
/* renamed from: com.google.android.material.bottomnavigation.b */
/* loaded from: classes2.dex */
public final class C7961b extends C0087g {
    public C7961b(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.C0087g
    /* renamed from: a */
    protected MenuItem mo580a(int i2, int i3, int i4, CharSequence charSequence) {
        if (size() + 1 > 5) {
            throw new IllegalArgumentException("Maximum number of items supported by BottomNavigationView is 5. Limit can be checked with BottomNavigationView#getMaxItemCount()");
        }
        m592h0();
        MenuItem menuItemMo580a = super.mo580a(i2, i3, i4, charSequence);
        if (menuItemMo580a instanceof C0089i) {
            ((C0089i) menuItemMo580a).m627t(true);
        }
        m590g0();
        return menuItemMo580a;
    }

    @Override // androidx.appcompat.view.menu.C0087g, android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        throw new UnsupportedOperationException("BottomNavigationView does not support submenus");
    }
}
