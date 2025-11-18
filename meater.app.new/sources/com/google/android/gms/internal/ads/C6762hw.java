package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.hw */
/* loaded from: classes2.dex */
final class C6762hw<E> extends AbstractC7388yt<E> {

    /* renamed from: g */
    private static final C6762hw<Object> f19248g;

    /* renamed from: h */
    private final List<E> f19249h;

    static {
        C6762hw<Object> c6762hw = new C6762hw<>(new ArrayList(0));
        f19248g = c6762hw;
        c6762hw.mo16108x0();
    }

    private C6762hw(List<E> list) {
        this.f19249h = list;
    }

    /* renamed from: f */
    public static <E> C6762hw<E> m15318f() {
        return (C6762hw<E>) f19248g;
    }

    @Override // com.google.android.gms.internal.ads.zzdoj
    /* renamed from: N */
    public final /* synthetic */ zzdoj mo14989N(int i2) {
        if (i2 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i2);
        arrayList.addAll(this.f19249h);
        return new C6762hw(arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, E e2) {
        m16106c();
        this.f19249h.add(i2, e2);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i2) {
        return this.f19249h.get(i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final E remove(int i2) {
        m16106c();
        E eRemove = this.f19249h.remove(i2);
        ((AbstractList) this).modCount++;
        return eRemove;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i2, E e2) {
        m16106c();
        E e3 = this.f19249h.set(i2, e2);
        ((AbstractList) this).modCount++;
        return e3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19249h.size();
    }
}
