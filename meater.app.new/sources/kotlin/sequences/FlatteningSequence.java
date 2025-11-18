package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.markers.KMappedMarker;
import okhttp3.HttpUrl;

/* compiled from: Sequences.kt */
@Metadata(m32266d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u0002H\u00030\u0004BA\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\t0\u0007¢\u0006\u0002\u0010\nJ\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\tH\u0096\u0002R \u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m32267d2 = {"Lkotlin/sequences/FlatteningSequence;", "T", "R", "E", "Lkotlin/sequences/Sequence;", "sequence", "transformer", "Lkotlin/Function1;", "iterator", HttpUrl.FRAGMENT_ENCODE_SET, "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.g0.f, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public final class FlatteningSequence<T, R, E> implements Sequence<E> {

    /* renamed from: a */
    private final Sequence<T> f40621a;

    /* renamed from: b */
    private final Function1<T, R> f40622b;

    /* renamed from: c */
    private final Function1<R, Iterator<E>> f40623c;

    /* compiled from: Sequences.kt */
    @Metadata(m32266d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\t\u001a\u00020\nH\u0002J\t\u0010\u000b\u001a\u00020\nH\u0096\u0002J\u000e\u0010\f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\rR\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0004¨\u0006\u000e"}, m32267d2 = {"kotlin/sequences/FlatteningSequence$iterator$1", HttpUrl.FRAGMENT_ENCODE_SET, "itemIterator", "getItemIterator", "()Ljava/util/Iterator;", "setItemIterator", "(Ljava/util/Iterator;)V", "iterator", "getIterator", "ensureItemIterator", HttpUrl.FRAGMENT_ENCODE_SET, "hasNext", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.g0.f$a */
    public static final class a implements Iterator<E>, KMappedMarker {

        /* renamed from: f */
        private final Iterator<T> f40624f;

        /* renamed from: g */
        private Iterator<? extends E> f40625g;

        /* renamed from: h */
        final /* synthetic */ FlatteningSequence<T, R, E> f40626h;

        a(FlatteningSequence<T, R, E> flatteningSequence) {
            this.f40626h = flatteningSequence;
            this.f40624f = ((FlatteningSequence) flatteningSequence).f40621a.iterator();
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
        
            return true;
         */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final boolean m37343b() {
            /*
                r5 = this;
                java.util.Iterator<? extends E> r0 = r5.f40625g
                r1 = 1
                r2 = 0
                if (r0 == 0) goto Le
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                if (r0 == 0) goto L14
                r0 = 0
                r5.f40625g = r0
            L14:
                java.util.Iterator<? extends E> r0 = r5.f40625g
                if (r0 != 0) goto L45
                java.util.Iterator<T> r0 = r5.f40624f
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L21
                return r2
            L21:
                java.util.Iterator<T> r0 = r5.f40624f
                java.lang.Object r0 = r0.next()
                kotlin.g0.f<T, R, E> r3 = r5.f40626h
                kotlin.a0.c.l r3 = kotlin.sequences.FlatteningSequence.m37340b(r3)
                kotlin.g0.f<T, R, E> r4 = r5.f40626h
                kotlin.a0.c.l r4 = kotlin.sequences.FlatteningSequence.m37342d(r4)
                java.lang.Object r0 = r4.invoke(r0)
                java.lang.Object r0 = r3.invoke(r0)
                java.util.Iterator r0 = (java.util.Iterator) r0
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L14
                r5.f40625g = r0
            L45:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.FlatteningSequence.a.m37343b():boolean");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return m37343b();
        }

        @Override // java.util.Iterator
        public E next() {
            if (!m37343b()) {
                throw new NoSuchElementException();
            }
            Iterator<? extends E> it = this.f40625g;
            C9801m.m32343c(it);
            return it.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FlatteningSequence(Sequence<? extends T> sequence, Function1<? super T, ? extends R> function1, Function1<? super R, ? extends Iterator<? extends E>> function12) {
        C9801m.m32346f(sequence, "sequence");
        C9801m.m32346f(function1, "transformer");
        C9801m.m32346f(function12, "iterator");
        this.f40621a = sequence;
        this.f40622b = function1;
        this.f40623c = function12;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<E> iterator() {
        return new a(this);
    }
}
