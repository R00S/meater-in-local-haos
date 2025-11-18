package p024c.p052i.p054f.p055a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.view.View;
import androidx.core.view.AbstractC0282b;

/* compiled from: SupportMenuItem.java */
/* renamed from: c.i.f.a.b */
/* loaded from: classes.dex */
public interface InterfaceMenuItemC0935b extends MenuItem {
    /* renamed from: a */
    InterfaceMenuItemC0935b mo486a(AbstractC0282b abstractC0282b);

    /* renamed from: b */
    AbstractC0282b mo487b();

    @Override // android.view.MenuItem
    boolean collapseActionView();

    @Override // android.view.MenuItem
    boolean expandActionView();

    @Override // android.view.MenuItem
    View getActionView();

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    boolean isActionViewExpanded();

    @Override // android.view.MenuItem
    MenuItem setActionView(int i2);

    @Override // android.view.MenuItem
    MenuItem setActionView(View view);

    @Override // android.view.MenuItem
    MenuItem setAlphabeticShortcut(char c2, int i2);

    @Override // android.view.MenuItem
    InterfaceMenuItemC0935b setContentDescription(CharSequence charSequence);

    @Override // android.view.MenuItem
    MenuItem setIconTintList(ColorStateList colorStateList);

    @Override // android.view.MenuItem
    MenuItem setIconTintMode(PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    MenuItem setNumericShortcut(char c2, int i2);

    @Override // android.view.MenuItem
    MenuItem setShortcut(char c2, char c3, int i2, int i3);

    @Override // android.view.MenuItem
    void setShowAsAction(int i2);

    @Override // android.view.MenuItem
    MenuItem setShowAsActionFlags(int i2);

    @Override // android.view.MenuItem
    InterfaceMenuItemC0935b setTooltipText(CharSequence charSequence);
}
