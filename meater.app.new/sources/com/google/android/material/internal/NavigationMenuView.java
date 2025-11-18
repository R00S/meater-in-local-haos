package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.view.menu.C0087g;
import androidx.appcompat.view.menu.InterfaceC0094n;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public class NavigationMenuView extends RecyclerView implements InterfaceC0094n {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0094n
    /* renamed from: b */
    public void mo478b(C0087g c0087g) {
    }

    public int getWindowAnimations() {
        return 0;
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        setLayoutManager(new LinearLayoutManager(context, 1, false));
    }
}
