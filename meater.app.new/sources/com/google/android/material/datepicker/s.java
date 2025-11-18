package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SmoothCalendarLayoutManager.java */
/* loaded from: classes2.dex */
class s extends LinearLayoutManager {

    /* compiled from: SmoothCalendarLayoutManager.java */
    class a extends androidx.recyclerview.widget.m {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.m
        protected float v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    s(Context context, int i10, boolean z10) {
        super(context, i10, z10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public void N1(RecyclerView recyclerView, RecyclerView.C c10, int i10) {
        a aVar = new a(recyclerView.getContext());
        aVar.p(i10);
        O1(aVar);
    }
}
