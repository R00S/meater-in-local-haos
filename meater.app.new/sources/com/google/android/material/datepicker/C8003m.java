package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C0629j;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SmoothCalendarLayoutManager.java */
/* renamed from: com.google.android.material.datepicker.m */
/* loaded from: classes2.dex */
class C8003m extends LinearLayoutManager {

    /* compiled from: SmoothCalendarLayoutManager.java */
    /* renamed from: com.google.android.material.datepicker.m$a */
    class a extends C0629j {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C0629j
        protected float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    C8003m(Context context, int i2, boolean z) {
        super(context, i2, z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C0613z c0613z, int i2) {
        a aVar = new a(recyclerView.getContext());
        aVar.setTargetPosition(i2);
        startSmoothScroll(aVar);
    }
}
