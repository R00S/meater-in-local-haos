package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: AdapterListUpdateCallback.java */
/* renamed from: androidx.recyclerview.widget.b */
/* loaded from: classes.dex */
public final class C0621b implements InterfaceC0631l {

    /* renamed from: a */
    private final RecyclerView.AbstractC0594g f4076a;

    public C0621b(RecyclerView.AbstractC0594g abstractC0594g) {
        this.f4076a = abstractC0594g;
    }

    @Override // androidx.recyclerview.widget.InterfaceC0631l
    /* renamed from: a */
    public void mo4436a(int i2, int i3) {
        this.f4076a.notifyItemMoved(i2, i3);
    }

    @Override // androidx.recyclerview.widget.InterfaceC0631l
    /* renamed from: b */
    public void mo4437b(int i2, int i3) {
        this.f4076a.notifyItemRangeInserted(i2, i3);
    }

    @Override // androidx.recyclerview.widget.InterfaceC0631l
    /* renamed from: c */
    public void mo4438c(int i2, int i3) {
        this.f4076a.notifyItemRangeRemoved(i2, i3);
    }

    @Override // androidx.recyclerview.widget.InterfaceC0631l
    /* renamed from: d */
    public void mo4439d(int i2, int i3, Object obj) {
        this.f4076a.notifyItemRangeChanged(i2, i3, obj);
    }
}
