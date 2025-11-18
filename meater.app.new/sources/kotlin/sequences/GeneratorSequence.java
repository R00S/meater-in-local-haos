package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.markers.KMappedMarker;
import okhttp3.HttpUrl;

/* compiled from: Sequences.kt */
@Metadata(m32266d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B+\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0007¢\u0006\u0002\u0010\bJ\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0096\u0002R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m32267d2 = {"Lkotlin/sequences/GeneratorSequence;", "T", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/sequences/Sequence;", "getInitialValue", "Lkotlin/Function0;", "getNextValue", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "iterator", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.g0.g, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
final class GeneratorSequence<T> implements Sequence<T> {

    /* renamed from: a */
    private final Function0<T> f40627a;

    /* renamed from: b */
    private final Function1<T, T> f40628b;

    /* compiled from: Sequences.kt */
    @Metadata(m32266d1 = {"\u0000#\n\u0000\n\u0002\u0010(\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\t\u0010\u0010\u001a\u00020\u0011H\u0096\u0002J\u000e\u0010\u0012\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0004R\u001e\u0010\u0002\u001a\u0004\u0018\u00018\u0000X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0007\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0013"}, m32267d2 = {"kotlin/sequences/GeneratorSequence$iterator$1", HttpUrl.FRAGMENT_ENCODE_SET, "nextItem", "getNextItem", "()Ljava/lang/Object;", "setNextItem", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "nextState", HttpUrl.FRAGMENT_ENCODE_SET, "getNextState", "()I", "setNextState", "(I)V", "calcNext", HttpUrl.FRAGMENT_ENCODE_SET, "hasNext", HttpUrl.FRAGMENT_ENCODE_SET, "next", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.g0.g$a */
    public static final class a implements Iterator<T>, KMappedMarker {

        /* renamed from: f */
        private T f40629f;

        /* renamed from: g */
        private int f40630g = -2;

        /* renamed from: h */
        final /* synthetic */ GeneratorSequence<T> f40631h;

        a(GeneratorSequence<T> generatorSequence) {
            this.f40631h = generatorSequence;
        }

        /* renamed from: b */
        private final void m37346b() {
            T t;
            if (this.f40630g == -2) {
                t = (T) ((GeneratorSequence) this.f40631h).f40627a.invoke();
            } else {
                Function1 function1 = ((GeneratorSequence) this.f40631h).f40628b;
                T t2 = this.f40629f;
                C9801m.m32343c(t2);
                t = (T) function1.invoke(t2);
            }
            this.f40629f = t;
            this.f40630g = t == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f40630g < 0) {
                m37346b();
            }
            return this.f40630g == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f40630g < 0) {
                m37346b();
            }
            if (this.f40630g == 0) {
                throw new NoSuchElementException();
            }
            T t = this.f40629f;
            C9801m.m32344d(t, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f40630g = -1;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GeneratorSequence(Function0<? extends T> function0, Function1<? super T, ? extends T> function1) {
        C9801m.m32346f(function0, "getInitialValue");
        C9801m.m32346f(function1, "getNextValue");
        this.f40627a = function0;
        this.f40628b = function1;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<T> iterator() {
        return new a(this);
    }
}
