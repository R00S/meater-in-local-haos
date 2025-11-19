package Tb;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: Sequences.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0002\u0010\f2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\t0\u0005H\u0000¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LTb/r;", "T", "R", "LTb/h;", "sequence", "Lkotlin/Function1;", "transformer", "<init>", "(LTb/h;LBa/l;)V", "", "iterator", "()Ljava/util/Iterator;", "E", "d", "(LBa/l;)LTb/h;", "a", "LTb/h;", "b", "LBa/l;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class r<T, R> implements h<R> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h<T> sequence;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Ba.l<T, R> transformer;

    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Tb/r$a", "", "next", "()Ljava/lang/Object;", "", "hasNext", "()Z", "B", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Iterator<R>, Ca.a {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private final Iterator<T> iterator;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ r<T, R> f16711C;

        a(r<T, R> rVar) {
            this.f16711C = rVar;
            this.iterator = ((r) rVar).sequence.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            return (R) ((r) this.f16711C).transformer.invoke(this.iterator.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r(h<? extends T> sequence, Ba.l<? super T, ? extends R> transformer) {
        C3862t.g(sequence, "sequence");
        C3862t.g(transformer, "transformer");
        this.sequence = sequence;
        this.transformer = transformer;
    }

    public final <E> h<E> d(Ba.l<? super R, ? extends Iterator<? extends E>> iterator) {
        C3862t.g(iterator, "iterator");
        return new f(this.sequence, this.transformer, iterator);
    }

    @Override // Tb.h
    public Iterator<R> iterator() {
        return new a(this);
    }
}
