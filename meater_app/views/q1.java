package com.apptionlabs.meater_app.views;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SpacesItemDecoration.java */
/* loaded from: /tmp/meat/meat/classes.dex */
public class q1 extends RecyclerView.o {

    /* renamed from: a, reason: collision with root package name */
    private final int f10586a;

    public q1(int i10) {
        this.f10586a = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        int i10 = this.f10586a;
        rect.left = i10;
        rect.right = i10;
        rect.bottom = i10;
        if (recyclerView.k0(view) == 0) {
            rect.top = this.f10586a;
        } else {
            rect.top = 0;
        }
    }
}
