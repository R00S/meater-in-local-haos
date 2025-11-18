package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.i1 */
/* loaded from: classes2.dex */
abstract class AbstractC7523i1<E> extends AbstractList<E> implements zzfl<E> {

    /* renamed from: f */
    private boolean f27765f = true;

    AbstractC7523i1() {
    }

    @Override // com.google.android.gms.internal.measurement.zzfl
    /* renamed from: I */
    public final void mo21144I() {
        this.f27765f = false;
    }

    @Override // com.google.android.gms.internal.measurement.zzfl
    /* renamed from: a */
    public boolean mo21145a() {
        return this.f27765f;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e2) {
        m21146c();
        return super.add(e2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        m21146c();
        return super.addAll(collection);
    }

    /* renamed from: c */
    protected final void m21146c() {
        if (!this.f27765f) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        m21146c();
        super.clear();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i2 = 0; i2 < size; i2++) {
            if (!get(i2).equals(list.get(i2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i2 = 0; i2 < size; i2++) {
            iHashCode = (iHashCode * 31) + get(i2).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        m21146c();
        return super.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> collection) {
        m21146c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> collection) {
        m21146c();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i2, Collection<? extends E> collection) {
        m21146c();
        return super.addAll(i2, collection);
    }
}
