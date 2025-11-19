package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.u;
import com.google.android.material.tabs.TabLayout;

/* compiled from: TabIndicatorInterpolator.java */
/* loaded from: classes2.dex */
class c {
    c() {
    }

    static RectF a(TabLayout tabLayout, View view) {
        return view == null ? new RectF() : (tabLayout.D() || !(view instanceof TabLayout.h)) ? new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) : b((TabLayout.h) view, 24);
    }

    static RectF b(TabLayout.h hVar, int i10) {
        int contentWidth = hVar.getContentWidth();
        int contentHeight = hVar.getContentHeight();
        int iC = (int) u.c(hVar.getContext(), i10);
        if (contentWidth < iC) {
            contentWidth = iC;
        }
        int left = (hVar.getLeft() + hVar.getRight()) / 2;
        int top = (hVar.getTop() + hVar.getBottom()) / 2;
        int i11 = contentWidth / 2;
        return new RectF(left - i11, top - (contentHeight / 2), i11 + left, top + (left / 2));
    }

    void c(TabLayout tabLayout, View view, Drawable drawable) {
        RectF rectFA = a(tabLayout, view);
        drawable.setBounds((int) rectFA.left, drawable.getBounds().top, (int) rectFA.right, drawable.getBounds().bottom);
    }

    void d(TabLayout tabLayout, View view, View view2, float f10, Drawable drawable) {
        RectF rectFA = a(tabLayout, view);
        RectF rectFA2 = a(tabLayout, view2);
        drawable.setBounds(D7.a.c((int) rectFA.left, (int) rectFA2.left, f10), drawable.getBounds().top, D7.a.c((int) rectFA.right, (int) rectFA2.right, f10), drawable.getBounds().bottom);
    }
}
