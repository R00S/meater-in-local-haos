package kotlin.reflect.p371y.internal.p425k0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: ConsPStack.java */
/* renamed from: kotlin.f0.y.e.k0.a */
/* loaded from: classes3.dex */
final class C10488a<E> implements Iterable<E> {

    /* renamed from: f */
    private static final C10488a<Object> f40502f = new C10488a<>();

    /* renamed from: g */
    final E f40503g;

    /* renamed from: h */
    final C10488a<E> f40504h;

    /* renamed from: i */
    private final int f40505i;

    /* compiled from: ConsPStack.java */
    /* renamed from: kotlin.f0.y.e.k0.a$a */
    private static class a<E> implements Iterator<E> {

        /* renamed from: f */
        private C10488a<E> f40506f;

        public a(C10488a<E> c10488a) {
            this.f40506f = c10488a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return ((C10488a) this.f40506f).f40505i > 0;
        }

        @Override // java.util.Iterator
        public E next() {
            C10488a<E> c10488a = this.f40506f;
            E e2 = c10488a.f40503g;
            this.f40506f = c10488a.f40504h;
            return e2;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private C10488a() {
        this.f40505i = 0;
        this.f40503g = null;
        this.f40504h = null;
    }

    /* renamed from: f */
    public static <E> C10488a<E> m37239f() {
        return (C10488a<E>) f40502f;
    }

    /* renamed from: g */
    private Iterator<E> m37240g(int i2) {
        return new a(m37242o(i2));
    }

    /* renamed from: i */
    private C10488a<E> m37241i(Object obj) {
        if (this.f40505i == 0) {
            return this;
        }
        if (this.f40503g.equals(obj)) {
            return this.f40504h;
        }
        C10488a<E> c10488aM37241i = this.f40504h.m37241i(obj);
        return c10488aM37241i == this.f40504h ? this : new C10488a<>(this.f40503g, c10488aM37241i);
    }

    /* renamed from: o */
    private C10488a<E> m37242o(int i2) {
        if (i2 < 0 || i2 > this.f40505i) {
            throw new IndexOutOfBoundsException();
        }
        return i2 == 0 ? this : this.f40504h.m37242o(i2 - 1);
    }

    public E get(int i2) {
        if (i2 < 0 || i2 > this.f40505i) {
            throw new IndexOutOfBoundsException();
        }
        try {
            return m37240g(i2).next();
        } catch (NoSuchElementException unused) {
            throw new IndexOutOfBoundsException("Index: " + i2);
        }
    }

    /* renamed from: h */
    public C10488a<E> m37243h(int i2) {
        return m37241i(get(i2));
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        return m37240g(0);
    }

    /* renamed from: n */
    public C10488a<E> m37244n(E e2) {
        return new C10488a<>(e2, this);
    }

    public int size() {
        return this.f40505i;
    }

    private C10488a(E e2, C10488a<E> c10488a) {
        this.f40503g = e2;
        this.f40504h = c10488a;
        this.f40505i = c10488a.f40505i + 1;
    }
}
