package com.apptionlabs.meater_app.views;

import android.graphics.Rect;
import android.util.SparseBooleanArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SpacingItemDecoration.java */
/* loaded from: /tmp/meat/meat/classes.dex */
public class r1 extends RecyclerView.o {

    /* renamed from: a, reason: collision with root package name */
    private final SparseBooleanArray f10608a;

    /* renamed from: b, reason: collision with root package name */
    private final Rect f10609b;

    private r1(Rect rect, int... iArr) {
        this.f10609b = rect;
        this.f10608a = new SparseBooleanArray();
        for (int i10 : iArr) {
            this.f10608a.put(i10, true);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        if (this.f10608a.get(recyclerView.j0(view))) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(this.f10609b);
        }
    }

    private r1(int i10, int i11, int i12, int i13) {
        this(new Rect(i10, i11, i12, i13), new int[0]);
    }

    public r1(int i10) {
        this(i10, i10, i10, i10);
    }
}
