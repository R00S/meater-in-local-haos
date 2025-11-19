package s;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: SparseArray.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\u001a\u001d\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "Ls/Y;", "Lkotlin/collections/J;", "a", "(Ls/Y;)Lkotlin/collections/J;", "", "b", "(Ls/Y;)Ljava/util/Iterator;", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a0 {

    /* compiled from: SparseArray.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"s/a0$a", "Lkotlin/collections/J;", "", "hasNext", "()Z", "", "b", "()I", "B", "I", "getIndex", "setIndex", "(I)V", "index", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends kotlin.collections.J {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Y<T> f48693C;

        a(Y<T> y10) {
            this.f48693C = y10;
        }

        @Override // kotlin.collections.J
        public int b() {
            Y<T> y10 = this.f48693C;
            int i10 = this.index;
            this.index = i10 + 1;
            return y10.m(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.f48693C.q();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SparseArray.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"s/a0$b", "", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "", "B", "I", "getIndex", "()I", "setIndex", "(I)V", "index", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b<T> implements Iterator<T>, Ca.a {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Y<T> f48695C;

        b(Y<T> y10) {
            this.f48695C = y10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.f48695C.q();
        }

        @Override // java.util.Iterator
        public T next() {
            Y<T> y10 = this.f48695C;
            int i10 = this.index;
            this.index = i10 + 1;
            return y10.r(i10);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final <T> kotlin.collections.J a(Y<T> y10) {
        C3862t.g(y10, "<this>");
        return new a(y10);
    }

    public static final <T> Iterator<T> b(Y<T> y10) {
        C3862t.g(y10, "<this>");
        return new b(y10);
    }
}
