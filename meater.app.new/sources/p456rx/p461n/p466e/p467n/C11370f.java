package p456rx.p461n.p466e.p467n;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p456rx.p461n.p466e.p468o.C11382j;

/* compiled from: SpscExactAtomicArrayQueue.java */
/* renamed from: rx.n.e.n.f */
/* loaded from: classes3.dex */
public final class C11370f<T> extends AtomicReferenceArray<T> implements Queue<T> {

    /* renamed from: f */
    final int f42938f;

    /* renamed from: g */
    final int f42939g;

    /* renamed from: h */
    final AtomicLong f42940h;

    /* renamed from: i */
    final AtomicLong f42941i;

    public C11370f(int i2) {
        super(C11382j.m40536b(i2));
        int length = length();
        this.f42938f = length - 1;
        this.f42939g = length - i2;
        this.f42940h = new AtomicLong();
        this.f42941i = new AtomicLong();
    }

    @Override // java.util.Queue, java.util.Collection
    public boolean add(T t) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public T element() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f42940h == this.f42941i;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public boolean offer(T t) {
        t.getClass();
        long j2 = this.f42940h.get();
        int i2 = this.f42938f;
        if (get(((int) (this.f42939g + j2)) & i2) != null) {
            return false;
        }
        this.f42940h.lazySet(j2 + 1);
        lazySet(i2 & ((int) j2), t);
        return true;
    }

    @Override // java.util.Queue
    public T peek() {
        return get(this.f42938f & ((int) this.f42941i.get()));
    }

    @Override // java.util.Queue
    public T poll() {
        long j2 = this.f42941i.get();
        int i2 = ((int) j2) & this.f42938f;
        T t = get(i2);
        if (t == null) {
            return null;
        }
        this.f42941i.lazySet(j2 + 1);
        lazySet(i2, null);
        return t;
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public int size() {
        long j2 = this.f42941i.get();
        while (true) {
            long j3 = this.f42940h.get();
            long j4 = this.f42941i.get();
            if (j2 == j4) {
                return (int) (j3 - j4);
            }
            j2 = j4;
        }
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public T remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public <E> E[] toArray(E[] eArr) {
        throw new UnsupportedOperationException();
    }
}
