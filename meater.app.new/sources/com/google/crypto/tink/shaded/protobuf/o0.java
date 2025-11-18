package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: UnmodifiableLazyStringList.java */
/* loaded from: classes2.dex */
public class o0 extends AbstractList<String> implements E, RandomAccess {

    /* renamed from: B, reason: collision with root package name */
    private final E f37889B;

    /* compiled from: UnmodifiableLazyStringList.java */
    class a implements ListIterator<String> {

        /* renamed from: B, reason: collision with root package name */
        ListIterator<String> f37890B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ int f37891C;

        a(int i10) {
            this.f37891C = i10;
            this.f37890B = o0.this.f37889B.listIterator(i10);
        }

        @Override // java.util.ListIterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f37890B.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return this.f37890B.previous();
        }

        @Override // java.util.ListIterator
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f37890B.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f37890B.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f37890B.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f37890B.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: UnmodifiableLazyStringList.java */
    class b implements Iterator<String> {

        /* renamed from: B, reason: collision with root package name */
        Iterator<String> f37893B;

        b() {
            this.f37893B = o0.this.f37889B.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f37893B.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f37893B.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public o0(E e10) {
        this.f37889B = e10;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        return (String) this.f37889B.get(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.E
    public void g1(AbstractC2898h abstractC2898h) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new b();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.E
    public List<?> l() {
        return this.f37889B.l();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i10) {
        return new a(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.E
    public Object p(int i10) {
        return this.f37889B.p(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f37889B.size();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.E
    public E m() {
        return this;
    }
}
