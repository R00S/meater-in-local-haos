package m8;

import java.util.NoSuchElementException;

/* compiled from: AbstractIndexedListIterator.java */
/* renamed from: m8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC3986a<E> extends k0<E> {

    /* renamed from: B, reason: collision with root package name */
    private final int f45272B;

    /* renamed from: C, reason: collision with root package name */
    private int f45273C;

    protected AbstractC3986a(int i10, int i11) {
        l8.m.n(i11, i10);
        this.f45272B = i10;
        this.f45273C = i11;
    }

    protected abstract E b(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f45273C < this.f45272B;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f45273C > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f45273C;
        this.f45273C = i10 + 1;
        return b(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f45273C;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f45273C - 1;
        this.f45273C = i10;
        return b(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f45273C - 1;
    }
}
