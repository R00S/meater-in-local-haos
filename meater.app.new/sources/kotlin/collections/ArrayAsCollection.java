package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C9779b;
import kotlin.jvm.internal.C9787f;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.markers.KMappedMarker;
import okhttp3.HttpUrl;

/* compiled from: Collections.kt */
@Metadata(m32266d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010(\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0006H\u0016J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0096\u0002J\u0015\u0010\u0018\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00190\u0004¢\u0006\u0002\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m32267d2 = {"Lkotlin/collections/ArrayAsCollection;", "T", HttpUrl.FRAGMENT_ENCODE_SET, "values", HttpUrl.FRAGMENT_ENCODE_SET, "isVarargs", HttpUrl.FRAGMENT_ENCODE_SET, "([Ljava/lang/Object;Z)V", "()Z", "size", HttpUrl.FRAGMENT_ENCODE_SET, "getSize", "()I", "getValues", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "contains", "element", "(Ljava/lang/Object;)Z", "containsAll", "elements", "isEmpty", "iterator", HttpUrl.FRAGMENT_ENCODE_SET, "toArray", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.w.h, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
final class ArrayAsCollection<T> implements Collection<T>, KMappedMarker {

    /* renamed from: f */
    private final T[] f41460f;

    /* renamed from: g */
    private final boolean f41461g;

    public ArrayAsCollection(T[] tArr, boolean z) {
        C9801m.m32346f(tArr, "values");
        this.f41460f = tArr;
        this.f41461g = z;
    }

    @Override // java.util.Collection
    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: c */
    public int m38646c() {
        return this.f41460f.length;
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object element) {
        return C10803n.m38764t(this.f41460f, element);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        C9801m.m32346f(elements, "elements");
        if (elements.isEmpty()) {
            return true;
        }
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f41460f.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return C9779b.m32281a(this.f41460f);
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
    public final /* bridge */ int size() {
        return m38646c();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return C10815t.m38880b(this.f41460f, this.f41461g);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        C9801m.m32346f(tArr, "array");
        return (T[]) C9787f.m32296b(this, tArr);
    }
}
