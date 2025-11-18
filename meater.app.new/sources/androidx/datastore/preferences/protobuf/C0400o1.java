package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: UnmodifiableLazyStringList.java */
/* renamed from: androidx.datastore.preferences.protobuf.o1 */
/* loaded from: classes.dex */
public class C0400o1 extends AbstractList<String> implements InterfaceC0372f0, RandomAccess {

    /* renamed from: f */
    private final InterfaceC0372f0 f2834f;

    /* compiled from: UnmodifiableLazyStringList.java */
    /* renamed from: androidx.datastore.preferences.protobuf.o1$a */
    class a implements ListIterator<String> {

        /* renamed from: f */
        ListIterator<String> f2835f;

        /* renamed from: g */
        final /* synthetic */ int f2836g;

        a(int i2) {
            this.f2836g = i2;
            this.f2835f = C0400o1.this.f2834f.listIterator(i2);
        }

        @Override // java.util.ListIterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f2835f.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return this.f2835f.previous();
        }

        @Override // java.util.ListIterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f2835f.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f2835f.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f2835f.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f2835f.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: UnmodifiableLazyStringList.java */
    /* renamed from: androidx.datastore.preferences.protobuf.o1$b */
    class b implements Iterator<String> {

        /* renamed from: f */
        Iterator<String> f2838f;

        b() {
            this.f2838f = C0400o1.this.f2834f.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f2838f.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f2838f.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C0400o1(InterfaceC0372f0 interfaceC0372f0) {
        this.f2834f = interfaceC0372f0;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0372f0
    /* renamed from: a0 */
    public void mo2671a0(AbstractC0377h abstractC0377h) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0372f0
    /* renamed from: c1 */
    public Object mo2672c1(int i2) {
        return this.f2834f.mo2672c1(i2);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public String get(int i2) {
        return (String) this.f2834f.get(i2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new b();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0372f0
    /* renamed from: j */
    public List<?> mo2676j() {
        return this.f2834f.mo2676j();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0372f0
    /* renamed from: k */
    public InterfaceC0372f0 mo2677k() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i2) {
        return new a(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f2834f.size();
    }
}
