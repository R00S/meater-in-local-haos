package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.markers.KMappedMarker;
import okhttp3.HttpUrl;

/* compiled from: Iterators.kt */
@Metadata(m32266d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\tH\u0086\u0002J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m32267d2 = {"Lkotlin/collections/IndexingIterator;", "T", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/collections/IndexedValue;", "iterator", "(Ljava/util/Iterator;)V", "index", HttpUrl.FRAGMENT_ENCODE_SET, "hasNext", HttpUrl.FRAGMENT_ENCODE_SET, "next", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.w.j0, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class IndexingIterator<T> implements Iterator<IndexedValue<? extends T>>, KMappedMarker {

    /* renamed from: f */
    private final Iterator<T> f41467f;

    /* renamed from: g */
    private int f41468g;

    /* JADX WARN: Multi-variable type inference failed */
    public IndexingIterator(Iterator<? extends T> it) {
        C9801m.m32346f(it, "iterator");
        this.f41467f = it;
    }

    @Override // java.util.Iterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final IndexedValue<T> next() {
        int i2 = this.f41468g;
        this.f41468g = i2 + 1;
        if (i2 < 0) {
            C10817u.m38898t();
        }
        return new IndexedValue<>(i2, this.f41467f.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f41467f.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
