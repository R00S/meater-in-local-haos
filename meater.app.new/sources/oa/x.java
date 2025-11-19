package oa;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.C3853j;
import kotlin.jvm.internal.C3862t;

/* compiled from: UByteArray.kt */
@Aa.b
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\b\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#J\u001b\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010 \u001a\u00020\u001c8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u0012\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0017\u0088\u0001 \u0092\u0001\u00020\u001c\u0082\u0002\u0004\n\u0002\b!¨\u0006$"}, d2 = {"Loa/x;", "", "Loa/w;", "", "index", "w", "([BI)B", "", "B", "([B)Ljava/util/Iterator;", "element", "", "h", "([BB)Z", "elements", "i", "([BLjava/util/Collection;)Z", "A", "([B)Z", "", "D", "([B)Ljava/lang/String;", "z", "([B)I", "", "other", "j", "([BLjava/lang/Object;)Z", "", "[B", "getStorage$annotations", "()V", "storage", "y", "size", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class x implements Collection<w>, Ca.a {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final byte[] storage;

    /* compiled from: UByteArray.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0002H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b!¨\u0006\u0012"}, d2 = {"Loa/x$a;", "", "Loa/w;", "", "array", "<init>", "([B)V", "", "hasNext", "()Z", "b", "()B", "B", "[B", "", "C", "I", "index", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a implements Iterator<w>, Ca.a {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private final byte[] array;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        private int index;

        public a(byte[] array) {
            C3862t.g(array, "array");
            this.array = array;
        }

        public byte b() {
            int i10 = this.index;
            byte[] bArr = this.array;
            if (i10 >= bArr.length) {
                throw new NoSuchElementException(String.valueOf(this.index));
            }
            this.index = i10 + 1;
            return w.j(bArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.array.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ w next() {
            return w.c(b());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static boolean A(byte[] bArr) {
        return bArr.length == 0;
    }

    public static Iterator<w> B(byte[] bArr) {
        return new a(bArr);
    }

    public static String D(byte[] bArr) {
        return "UByteArray(storage=" + Arrays.toString(bArr) + ')';
    }

    public static boolean h(byte[] bArr, byte b10) {
        return C3831l.P(bArr, b10);
    }

    public static boolean i(byte[] bArr, Collection<w> elements) {
        C3862t.g(elements, "elements");
        Collection<w> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof w) || !C3831l.P(bArr, ((w) obj).getData())) {
                return false;
            }
        }
        return true;
    }

    public static boolean j(byte[] bArr, Object obj) {
        return (obj instanceof x) && C3862t.b(bArr, ((x) obj).getStorage());
    }

    public static final byte w(byte[] bArr, int i10) {
        return w.j(bArr[i10]);
    }

    public static int y(byte[] bArr) {
        return bArr.length;
    }

    public static int z(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    /* renamed from: E, reason: from getter */
    public final /* synthetic */ byte[] getStorage() {
        return this.storage;
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(w wVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends w> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean c(byte b10) {
        return h(this.storage, b10);
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof w) {
            return c(((w) obj).getData());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        C3862t.g(elements, "elements");
        return i(this.storage, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return j(this.storage, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return z(this.storage);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return A(this.storage);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<w> iterator() {
        return B(this.storage);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return C3853j.a(this);
    }

    public String toString() {
        return D(this.storage);
    }

    @Override // java.util.Collection
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public int size() {
        return y(this.storage);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        C3862t.g(array, "array");
        return (T[]) C3853j.b(this, array);
    }
}
