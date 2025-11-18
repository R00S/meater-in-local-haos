package m8;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: Collections2.java */
/* renamed from: m8.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3995j {

    /* compiled from: Collections2.java */
    /* renamed from: m8.j$a */
    static class a<E> extends AbstractCollection<E> {

        /* renamed from: B, reason: collision with root package name */
        final Collection<E> f45338B;

        /* renamed from: C, reason: collision with root package name */
        final l8.n<? super E> f45339C;

        a(Collection<E> collection, l8.n<? super E> nVar) {
            this.f45338B = collection;
            this.f45339C = nVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(E e10) {
            l8.m.d(this.f45339C.apply(e10));
            return this.f45338B.add(e10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            Iterator<? extends E> it = collection.iterator();
            while (it.hasNext()) {
                l8.m.d(this.f45339C.apply(it.next()));
            }
            return this.f45338B.addAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            C3982E.h(this.f45338B, this.f45339C);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (C3995j.c(this.f45338B, obj)) {
                return this.f45339C.apply(obj);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return C3995j.a(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return !C3982E.a(this.f45338B, this.f45339C);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<E> iterator() {
            return C3983F.i(this.f45338B.iterator(), this.f45339C);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            return contains(obj) && this.f45338B.remove(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            Iterator<E> it = this.f45338B.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f45339C.apply(next) && collection.contains(next)) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Iterator<E> it = this.f45338B.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f45339C.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            Iterator<E> it = this.f45338B.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                if (this.f45339C.apply(it.next())) {
                    i10++;
                }
            }
            return i10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return H.i(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) H.i(iterator()).toArray(tArr);
        }
    }

    static boolean a(Collection<?> collection, Collection<?> collection2) {
        Iterator<?> it = collection2.iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    static StringBuilder b(int i10) {
        C3994i.b(i10, "size");
        return new StringBuilder((int) Math.min(i10 * 8, 1073741824L));
    }

    static boolean c(Collection<?> collection, Object obj) {
        l8.m.l(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
