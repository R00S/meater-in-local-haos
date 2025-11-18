package com.google.android.gms.internal.measurement;

import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.j4 */
/* loaded from: classes2.dex */
final class C7532j4 implements ListIterator<String> {

    /* renamed from: f */
    private ListIterator<String> f27779f;

    /* renamed from: g */
    private final /* synthetic */ int f27780g;

    /* renamed from: h */
    private final /* synthetic */ zzia f27781h;

    C7532j4(zzia zziaVar, int i2) {
        this.f27781h = zziaVar;
        this.f27780g = i2;
        this.f27779f = zziaVar.f28176f.listIterator(i2);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f27779f.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f27779f.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f27779f.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f27779f.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ String previous() {
        return this.f27779f.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f27779f.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }
}
