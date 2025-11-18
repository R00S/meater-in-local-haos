package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import okhttp3.HttpUrl;

/* compiled from: ArrayIterator.kt */
@Metadata(m32266d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\u000b\u001a\u00020\fH\u0096\u0002J\u000e\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u000eR\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m32267d2 = {"Lkotlin/jvm/internal/ArrayIterator;", "T", HttpUrl.FRAGMENT_ENCODE_SET, "array", HttpUrl.FRAGMENT_ENCODE_SET, "([Ljava/lang/Object;)V", "getArray", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "index", HttpUrl.FRAGMENT_ENCODE_SET, "hasNext", HttpUrl.FRAGMENT_ENCODE_SET, "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.a0.d.a, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
final class ArrayIterator<T> implements Iterator<T>, KMappedMarker {

    /* renamed from: f */
    private final T[] f37165f;

    /* renamed from: g */
    private int f37166g;

    public ArrayIterator(T[] tArr) {
        C9801m.m32346f(tArr, "array");
        this.f37165f = tArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f37166g < this.f37165f.length;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            T[] tArr = this.f37165f;
            int i2 = this.f37166g;
            this.f37166g = i2 + 1;
            return tArr[i2];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.f37166g--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
