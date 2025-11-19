package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: UnmodifiableLazyStringList.java */
/* loaded from: classes3.dex */
public class u extends AbstractList<String> implements RandomAccess, m {

    /* renamed from: B, reason: collision with root package name */
    private final m f44128B;

    /* compiled from: UnmodifiableLazyStringList.java */
    class a implements ListIterator<String> {

        /* renamed from: B, reason: collision with root package name */
        ListIterator<String> f44129B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ int f44130C;

        a(int i10) {
            this.f44130C = i10;
            this.f44129B = u.this.f44128B.listIterator(i10);
        }

        @Override // java.util.ListIterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f44129B.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return this.f44129B.previous();
        }

        @Override // java.util.ListIterator
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f44129B.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f44129B.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f44129B.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f44129B.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: UnmodifiableLazyStringList.java */
    class b implements Iterator<String> {

        /* renamed from: B, reason: collision with root package name */
        Iterator<String> f44132B;

        b() {
            this.f44132B = u.this.f44128B.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f44132B.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f44132B.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public u(m mVar) {
        this.f44128B = mVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m
    public d a1(int i10) {
        return this.f44128B.a1(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        return this.f44128B.get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m
    public List<?> l() {
        return this.f44128B.l();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i10) {
        return new a(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f44128B.size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m
    public void u1(d dVar) {
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m
    public m m() {
        return this;
    }
}
