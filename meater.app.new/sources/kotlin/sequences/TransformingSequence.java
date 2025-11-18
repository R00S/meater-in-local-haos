package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.markers.KMappedMarker;
import okhttp3.HttpUrl;

/* compiled from: Sequences.kt */
@Metadata(m32266d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00020\u0003B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0002\u0010\u0007J3\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\t0\u0003\"\u0004\b\u0002\u0010\t2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\t0\u000b0\u0006H\u0000¢\u0006\u0002\b\fJ\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0096\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m32267d2 = {"Lkotlin/sequences/TransformingSequence;", "T", "R", "Lkotlin/sequences/Sequence;", "sequence", "transformer", "Lkotlin/Function1;", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)V", "flatten", "E", "iterator", HttpUrl.FRAGMENT_ENCODE_SET, "flatten$kotlin_stdlib", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.g0.p, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public final class TransformingSequence<T, R> implements Sequence<R> {

    /* renamed from: a */
    private final Sequence<T> f40646a;

    /* renamed from: b */
    private final Function1<T, R> f40647b;

    /* compiled from: Sequences.kt */
    @Metadata(m32266d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0005\u001a\u00020\u0006H\u0096\u0002J\u000e\u0010\u0007\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\t"}, m32267d2 = {"kotlin/sequences/TransformingSequence$iterator$1", HttpUrl.FRAGMENT_ENCODE_SET, "iterator", "getIterator", "()Ljava/util/Iterator;", "hasNext", HttpUrl.FRAGMENT_ENCODE_SET, "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.g0.p$a */
    public static final class a implements Iterator<R>, KMappedMarker {

        /* renamed from: f */
        private final Iterator<T> f40648f;

        /* renamed from: g */
        final /* synthetic */ TransformingSequence<T, R> f40649g;

        a(TransformingSequence<T, R> transformingSequence) {
            this.f40649g = transformingSequence;
            this.f40648f = ((TransformingSequence) transformingSequence).f40646a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f40648f.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            return (R) ((TransformingSequence) this.f40649g).f40647b.invoke(this.f40648f.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TransformingSequence(Sequence<? extends T> sequence, Function1<? super T, ? extends R> function1) {
        C9801m.m32346f(sequence, "sequence");
        C9801m.m32346f(function1, "transformer");
        this.f40646a = sequence;
        this.f40647b = function1;
    }

    /* renamed from: d */
    public final <E> Sequence<E> m37404d(Function1<? super R, ? extends Iterator<? extends E>> function1) {
        C9801m.m32346f(function1, "iterator");
        return new FlatteningSequence(this.f40646a, this.f40647b, function1);
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<R> iterator() {
        return new a(this);
    }
}
