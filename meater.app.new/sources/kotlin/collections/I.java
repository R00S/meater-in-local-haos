package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: Iterators.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lkotlin/collections/I;", "T", "", "Lkotlin/collections/G;", "iterator", "<init>", "(Ljava/util/Iterator;)V", "", "hasNext", "()Z", "b", "()Lkotlin/collections/G;", "B", "Ljava/util/Iterator;", "", "C", "I", "index", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class I<T> implements Iterator<IndexedValue<? extends T>>, Ca.a {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final Iterator<T> iterator;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private int index;

    /* JADX WARN: Multi-variable type inference failed */
    public I(Iterator<? extends T> iterator) {
        C3862t.g(iterator, "iterator");
        this.iterator = iterator;
    }

    @Override // java.util.Iterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final IndexedValue<T> next() {
        int i10 = this.index;
        this.index = i10 + 1;
        if (i10 < 0) {
            r.w();
        }
        return new IndexedValue<>(i10, this.iterator.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
