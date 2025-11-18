package com.google.android.gms.internal.ads;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.ads.ex */
/* loaded from: classes2.dex */
final class C6652ex implements ListIterator<String> {

    /* renamed from: f */
    private ListIterator<String> f18837f;

    /* renamed from: g */
    private final /* synthetic */ int f18838g;

    /* renamed from: h */
    private final /* synthetic */ zzdqw f18839h;

    C6652ex(zzdqw zzdqwVar, int i2) {
        this.f18839h = zzdqwVar;
        this.f18838g = i2;
        this.f18837f = zzdqwVar.f25808f.listIterator(i2);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f18837f.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f18837f.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f18837f.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f18837f.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ String previous() {
        return this.f18837f.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f18837f.previousIndex();
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
