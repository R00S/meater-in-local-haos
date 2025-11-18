package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public class zzdta<E> extends AbstractList<E> {

    /* renamed from: f */
    private static final zzdtc f25967f = zzdtc.m19860b(zzdta.class);

    /* renamed from: g */
    List<E> f25968g;

    /* renamed from: h */
    Iterator<E> f25969h;

    public zzdta(List<E> list, Iterator<E> it) {
        this.f25968g = list;
        this.f25969h = it;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i2) {
        if (this.f25968g.size() > i2) {
            return this.f25968g.get(i2);
        }
        if (!this.f25969h.hasNext()) {
            throw new NoSuchElementException();
        }
        this.f25968g.add(this.f25969h.next());
        return get(i2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new C6801iy(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        zzdtc zzdtcVar = f25967f;
        zzdtcVar.mo19858a("potentially expensive size() call");
        zzdtcVar.mo19858a("blowup running");
        while (this.f25969h.hasNext()) {
            this.f25968g.add(this.f25969h.next());
        }
        return this.f25968g.size();
    }
}
