package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import p024c.p052i.p054f.p055a.InterfaceMenuItemC0935b;

/* compiled from: MenuItemCompat.java */
/* renamed from: androidx.core.view.h */
/* loaded from: classes.dex */
public final class C0298h {

    /* compiled from: MenuItemCompat.java */
    /* renamed from: androidx.core.view.h$a */
    class a implements MenuItem.OnActionExpandListener {

        /* renamed from: a */
        final /* synthetic */ b f2391a;

        a(b bVar) {
            this.f2391a = bVar;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f2391a.onMenuItemActionCollapse(menuItem);
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f2391a.onMenuItemActionExpand(menuItem);
        }
    }

    /* compiled from: MenuItemCompat.java */
    @Deprecated
    /* renamed from: androidx.core.view.h$b */
    public interface b {
        boolean onMenuItemActionCollapse(MenuItem menuItem);

        boolean onMenuItemActionExpand(MenuItem menuItem);
    }

    /* renamed from: a */
    public static MenuItem m2047a(MenuItem menuItem, AbstractC0282b abstractC0282b) {
        if (menuItem instanceof InterfaceMenuItemC0935b) {
            return ((InterfaceMenuItemC0935b) menuItem).mo486a(abstractC0282b);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    /* renamed from: b */
    public static void m2048b(MenuItem menuItem, char c2, int i2) {
        if (menuItem instanceof InterfaceMenuItemC0935b) {
            ((InterfaceMenuItemC0935b) menuItem).setAlphabeticShortcut(c2, i2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setAlphabeticShortcut(c2, i2);
        }
    }

    /* renamed from: c */
    public static void m2049c(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC0935b) {
            ((InterfaceMenuItemC0935b) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription(charSequence);
        }
    }

    /* renamed from: d */
    public static void m2050d(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof InterfaceMenuItemC0935b) {
            ((InterfaceMenuItemC0935b) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintList(colorStateList);
        }
    }

    /* renamed from: e */
    public static void m2051e(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof InterfaceMenuItemC0935b) {
            ((InterfaceMenuItemC0935b) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintMode(mode);
        }
    }

    /* renamed from: f */
    public static void m2052f(MenuItem menuItem, char c2, int i2) {
        if (menuItem instanceof InterfaceMenuItemC0935b) {
            ((InterfaceMenuItemC0935b) menuItem).setNumericShortcut(c2, i2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setNumericShortcut(c2, i2);
        }
    }

    @Deprecated
    /* renamed from: g */
    public static MenuItem m2053g(MenuItem menuItem, b bVar) {
        return menuItem.setOnActionExpandListener(new a(bVar));
    }

    /* renamed from: h */
    public static void m2054h(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC0935b) {
            ((InterfaceMenuItemC0935b) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setTooltipText(charSequence);
        }
    }
}
