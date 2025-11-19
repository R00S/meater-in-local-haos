package m8;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import m8.C3995j;

/* compiled from: Sets.java */
/* loaded from: classes2.dex */
public final class d0 {

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: Sets.java */
    class a<E> extends f<E> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Set f45318B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Set f45319C;

        /* compiled from: Sets.java */
        /* renamed from: m8.d0$a$a, reason: collision with other inner class name */
        class C0612a extends AbstractC3987b<E> {

            /* renamed from: D, reason: collision with root package name */
            final Iterator<? extends E> f45320D;

            /* renamed from: E, reason: collision with root package name */
            final Iterator<? extends E> f45321E;

            C0612a() {
                this.f45320D = a.this.f45318B.iterator();
                this.f45321E = a.this.f45319C.iterator();
            }

            @Override // m8.AbstractC3987b
            protected E b() {
                if (this.f45320D.hasNext()) {
                    return this.f45320D.next();
                }
                while (this.f45321E.hasNext()) {
                    E next = this.f45321E.next();
                    if (!a.this.f45318B.contains(next)) {
                        return next;
                    }
                }
                return d();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Set set, Set set2) {
            super(null);
            this.f45318B = set;
            this.f45319C = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public j0<E> iterator() {
            return new C0612a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f45318B.contains(obj) || this.f45319C.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f45318B.isEmpty() && this.f45319C.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int size = this.f45318B.size();
            Iterator<E> it = this.f45319C.iterator();
            while (it.hasNext()) {
                if (!this.f45318B.contains(it.next())) {
                    size++;
                }
            }
            return size;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: Sets.java */
    class b<E> extends f<E> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Set f45323B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Set f45324C;

        /* compiled from: Sets.java */
        class a extends AbstractC3987b<E> {

            /* renamed from: D, reason: collision with root package name */
            final Iterator<E> f45325D;

            a() {
                this.f45325D = b.this.f45323B.iterator();
            }

            @Override // m8.AbstractC3987b
            protected E b() {
                while (this.f45325D.hasNext()) {
                    E next = this.f45325D.next();
                    if (b.this.f45324C.contains(next)) {
                        return next;
                    }
                }
                return d();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Set set, Set set2) {
            super(null);
            this.f45323B = set;
            this.f45324C = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: c */
        public j0<E> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f45323B.contains(obj) && this.f45324C.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return this.f45323B.containsAll(collection) && this.f45324C.containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return Collections.disjoint(this.f45324C, this.f45323B);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator<E> it = this.f45323B.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                if (this.f45324C.contains(it.next())) {
                    i10++;
                }
            }
            return i10;
        }
    }

    /* compiled from: Sets.java */
    private static class c<E> extends C3995j.a<E> implements Set<E> {
        c(Set<E> set, l8.n<? super E> nVar) {
            super(set, nVar);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return d0.a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return d0.d(this);
        }
    }

    /* compiled from: Sets.java */
    private static class d<E> extends c<E> implements SortedSet<E> {
        d(SortedSet<E> sortedSet, l8.n<? super E> nVar) {
            super(sortedSet, nVar);
        }

        @Override // java.util.SortedSet
        public Comparator<? super E> comparator() {
            return ((SortedSet) this.f45338B).comparator();
        }

        @Override // java.util.SortedSet
        public E first() {
            return (E) C3983F.j(this.f45338B.iterator(), this.f45339C);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> headSet(E e10) {
            return new d(((SortedSet) this.f45338B).headSet(e10), this.f45339C);
        }

        @Override // java.util.SortedSet
        public E last() {
            SortedSet sortedSetHeadSet = (SortedSet) this.f45338B;
            while (true) {
                E e10 = (Object) sortedSetHeadSet.last();
                if (this.f45339C.apply(e10)) {
                    return e10;
                }
                sortedSetHeadSet = sortedSetHeadSet.headSet(e10);
            }
        }

        @Override // java.util.SortedSet
        public SortedSet<E> subSet(E e10, E e11) {
            return new d(((SortedSet) this.f45338B).subSet(e10, e11), this.f45339C);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> tailSet(E e10) {
            return new d(((SortedSet) this.f45338B).tailSet(e10), this.f45339C);
        }
    }

    /* compiled from: Sets.java */
    static abstract class e<E> extends AbstractSet<E> {
        e() {
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return d0.i(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) l8.m.l(collection));
        }
    }

    /* compiled from: Sets.java */
    public static abstract class f<E> extends AbstractSet<E> {
        /* synthetic */ f(a aVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean add(E e10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public abstract j0<E> iterator();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        private f() {
        }
    }

    static boolean a(Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <E> Set<E> b(Set<E> set, l8.n<? super E> nVar) {
        if (set instanceof SortedSet) {
            return c((SortedSet) set, nVar);
        }
        if (!(set instanceof c)) {
            return new c((Set) l8.m.l(set), (l8.n) l8.m.l(nVar));
        }
        c cVar = (c) set;
        return new c((Set) cVar.f45338B, l8.o.b(cVar.f45339C, nVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> SortedSet<E> c(SortedSet<E> sortedSet, l8.n<? super E> nVar) {
        if (!(sortedSet instanceof c)) {
            return new d((SortedSet) l8.m.l(sortedSet), (l8.n) l8.m.l(nVar));
        }
        c cVar = (c) sortedSet;
        return new d((SortedSet) cVar.f45338B, l8.o.b(cVar.f45339C, nVar));
    }

    static int d(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    public static <E> f<E> e(Set<E> set, Set<?> set2) {
        l8.m.m(set, "set1");
        l8.m.m(set2, "set2");
        return new b(set, set2);
    }

    public static <E> HashSet<E> f() {
        return new HashSet<>();
    }

    public static <E> HashSet<E> g(int i10) {
        return new HashSet<>(L.a(i10));
    }

    public static <E> Set<E> h() {
        return Collections.newSetFromMap(L.h());
    }

    static boolean i(Set<?> set, Collection<?> collection) {
        l8.m.l(collection);
        if (collection instanceof P) {
            collection = ((P) collection).N();
        }
        return (!(collection instanceof Set) || collection.size() <= set.size()) ? j(set, collection.iterator()) : C3983F.p(set.iterator(), collection);
    }

    static boolean j(Set<?> set, Iterator<?> it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }

    public static <E> f<E> k(Set<? extends E> set, Set<? extends E> set2) {
        l8.m.m(set, "set1");
        l8.m.m(set2, "set2");
        return new a(set, set2);
    }
}
