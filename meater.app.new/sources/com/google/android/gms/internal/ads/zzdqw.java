package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class zzdqw extends AbstractList<String> implements zzdot, RandomAccess {

    /* renamed from: f */
    private final zzdot f25808f;

    public zzdqw(zzdot zzdotVar) {
        this.f25808f = zzdotVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdot
    /* renamed from: H */
    public final zzdot mo19766H() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        return (String) this.f25808f.get(i2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new C6689fx(this);
    }

    @Override // com.google.android.gms.internal.ads.zzdot
    /* renamed from: k1 */
    public final Object mo19767k1(int i2) {
        return this.f25808f.mo19767k1(i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i2) {
        return new C6652ex(this, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzdot
    /* renamed from: m */
    public final List<?> mo19768m() {
        return this.f25808f.mo19768m();
    }

    @Override // com.google.android.gms.internal.ads.zzdot
    /* renamed from: q0 */
    public final void mo19769q0(zzdmr zzdmrVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25808f.size();
    }
}
