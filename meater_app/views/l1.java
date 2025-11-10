package com.apptionlabs.meater_app.views;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SimpleDividerItemDecoration.java */
/* loaded from: /tmp/meat/meat/classes.dex */
public class l1 extends RecyclerView.o {

    /* renamed from: a, reason: collision with root package name */
    private Drawable f10567a;

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        this.f10567a = f8.l0.j(recyclerView.getContext(), 2131231412);
        int paddingStart = recyclerView.getPaddingStart();
        int width = recyclerView.getWidth() - recyclerView.getPaddingEnd();
        int childCount = recyclerView.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) childAt.getLayoutParams())).bottomMargin;
            this.f10567a.setBounds(paddingStart, bottom, width, this.f10567a.getIntrinsicHeight() + bottom);
            this.f10567a.draw(canvas);
        }
    }
}
