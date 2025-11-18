package com.airbnb.epoxy;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: EpoxyDiffLogger.java */
/* renamed from: com.airbnb.epoxy.p */
/* loaded from: classes.dex */
public class C5155p extends RecyclerView.AbstractC0596i {

    /* renamed from: a */
    private final String f12261a;

    public C5155p(String str) {
        this.f12261a = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0596i
    public void onItemRangeChanged(int i2, int i3) {
        Log.d(this.f12261a, "Item range changed. Start: " + i2 + " Count: " + i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0596i
    public void onItemRangeInserted(int i2, int i3) {
        Log.d(this.f12261a, "Item range inserted. Start: " + i2 + " Count: " + i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0596i
    public void onItemRangeMoved(int i2, int i3, int i4) {
        Log.d(this.f12261a, "Item moved. From: " + i2 + " To: " + i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0596i
    public void onItemRangeRemoved(int i2, int i3) {
        Log.d(this.f12261a, "Item range removed. Start: " + i2 + " Count: " + i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0596i
    public void onItemRangeChanged(int i2, int i3, Object obj) {
        if (obj == null) {
            onItemRangeChanged(i2, i3);
            return;
        }
        Log.d(this.f12261a, "Item range changed with payloads. Start: " + i2 + " Count: " + i3);
    }
}
