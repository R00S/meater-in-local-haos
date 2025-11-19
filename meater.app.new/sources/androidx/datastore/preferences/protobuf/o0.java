package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: UnmodifiableLazyStringList.java */
/* loaded from: classes.dex */
public class o0 extends AbstractList<String> implements E, RandomAccess {

    /* renamed from: B, reason: collision with root package name */
    private final E f25012B;

    /* compiled from: UnmodifiableLazyStringList.java */
    class a implements ListIterator<String> {

        /* renamed from: B, reason: collision with root package name */
        ListIterator<String> f25013B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ int f25014C;

        a(int i10) {
            this.f25014C = i10;
            this.f25013B = o0.this.f25012B.listIterator(i10);
        }

        @Override // java.util.ListIterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f25013B.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return this.f25013B.previous();
        }

        @Override // java.util.ListIterator
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f25013B.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f25013B.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f25013B.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f25013B.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: UnmodifiableLazyStringList.java */
    class b implements Iterator<String> {

        /* renamed from: B, reason: collision with root package name */
        Iterator<String> f25016B;

        b() {
            this.f25016B = o0.this.f25012B.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f25016B.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f25016B.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public o0(E e10) {
        this.f25012B = e10;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        return (String) this.f25012B.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public void i0(AbstractC2062h abstractC2062h) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new b();
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public List<?> l() {
        return this.f25012B.l();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i10) {
        return new a(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public Object p(int i10) {
        return this.f25012B.p(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f25012B.size();
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public E m() {
        return this;
    }
}
