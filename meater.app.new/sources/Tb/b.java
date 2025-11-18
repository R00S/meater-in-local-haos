package Tb;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: Sequences.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010(\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LTb/b;", "T", "LTb/h;", "LTb/c;", "sequence", "", "count", "<init>", "(LTb/h;I)V", "n", "a", "(I)LTb/h;", "", "iterator", "()Ljava/util/Iterator;", "LTb/h;", "b", "I", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b<T> implements h<T>, c<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h<T> sequence;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int count;

    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Tb/b$a", "", "Loa/F;", "b", "()V", "next", "()Ljava/lang/Object;", "", "hasNext", "()Z", "B", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "", "C", "I", "getLeft", "()I", "setLeft", "(I)V", "left", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Iterator<T>, Ca.a {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private final Iterator<T> iterator;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        private int left;

        a(b<T> bVar) {
            this.iterator = ((b) bVar).sequence.iterator();
            this.left = ((b) bVar).count;
        }

        private final void b() {
            while (this.left > 0 && this.iterator.hasNext()) {
                this.iterator.next();
                this.left--;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            b();
            return this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            b();
            return this.iterator.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(h<? extends T> sequence, int i10) {
        C3862t.g(sequence, "sequence");
        this.sequence = sequence;
        this.count = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
    }

    @Override // Tb.c
    public h<T> a(int n10) {
        int i10 = this.count + n10;
        return i10 < 0 ? new b(this, n10) : new b(this.sequence, i10);
    }

    @Override // Tb.h
    public Iterator<T> iterator() {
        return new a(this);
    }
}
