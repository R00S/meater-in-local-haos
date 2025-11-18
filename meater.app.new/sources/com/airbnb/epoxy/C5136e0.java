package com.airbnb.epoxy;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: NotifyBlocker.java */
/* renamed from: com.airbnb.epoxy.e0 */
/* loaded from: classes.dex */
class C5136e0 extends RecyclerView.AbstractC0596i {

    /* renamed from: a */
    private boolean f12233a;

    C5136e0() {
    }

    /* renamed from: a */
    void m9289a() {
        this.f12233a = true;
    }

    /* renamed from: b */
    void m9290b() {
        this.f12233a = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0596i
    public void onChanged() {
        if (!this.f12233a) {
            throw new IllegalStateException("You cannot notify item changes directly. Call `requestModelBuild` instead.");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0596i
    public void onItemRangeChanged(int i2, int i3) {
        onChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0596i
    public void onItemRangeInserted(int i2, int i3) {
        onChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0596i
    public void onItemRangeMoved(int i2, int i3, int i4) {
        onChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0596i
    public void onItemRangeRemoved(int i2, int i3) {
        onChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0596i
    public void onItemRangeChanged(int i2, int i3, Object obj) {
        onChanged();
    }
}
