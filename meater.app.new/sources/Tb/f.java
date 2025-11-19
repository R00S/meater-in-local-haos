package Tb;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: Sequences.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004BC\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00020\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\fR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R&\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"LTb/f;", "T", "R", "E", "LTb/h;", "sequence", "Lkotlin/Function1;", "transformer", "", "iterator", "<init>", "(LTb/h;LBa/l;LBa/l;)V", "()Ljava/util/Iterator;", "a", "LTb/h;", "b", "LBa/l;", "c", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f<T, R, E> implements h<E> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h<T> sequence;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Ba.l<T, R> transformer;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Ba.l<R, Iterator<E>> iterator;

    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\u0004R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00018\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR*\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Tb/f$a", "", "", "b", "()Z", "next", "()Ljava/lang/Object;", "hasNext", "B", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "C", "getItemIterator", "setItemIterator", "(Ljava/util/Iterator;)V", "itemIterator", "", "D", "I", "getState", "()I", "setState", "(I)V", "state", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Iterator<E>, Ca.a {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private final Iterator<T> iterator;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        private Iterator<? extends E> itemIterator;

        /* renamed from: D, reason: collision with root package name and from kotlin metadata */
        private int state;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ f<T, R, E> f16682E;

        a(f<T, R, E> fVar) {
            this.f16682E = fVar;
            this.iterator = ((f) fVar).sequence.iterator();
        }

        private final boolean b() {
            Iterator<? extends E> it = this.itemIterator;
            if (it != null && it.hasNext()) {
                this.state = 1;
                return true;
            }
            while (this.iterator.hasNext()) {
                Iterator<? extends E> it2 = (Iterator) ((f) this.f16682E).iterator.invoke(((f) this.f16682E).transformer.invoke(this.iterator.next()));
                if (it2.hasNext()) {
                    this.itemIterator = it2;
                    this.state = 1;
                    return true;
                }
            }
            this.state = 2;
            this.itemIterator = null;
            return false;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.state;
            if (i10 == 1) {
                return true;
            }
            if (i10 == 2) {
                return false;
            }
            return b();
        }

        @Override // java.util.Iterator
        public E next() {
            int i10 = this.state;
            if (i10 == 2) {
                throw new NoSuchElementException();
            }
            if (i10 == 0 && !b()) {
                throw new NoSuchElementException();
            }
            this.state = 0;
            Iterator<? extends E> it = this.itemIterator;
            C3862t.d(it);
            return it.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(h<? extends T> sequence, Ba.l<? super T, ? extends R> transformer, Ba.l<? super R, ? extends Iterator<? extends E>> iterator) {
        C3862t.g(sequence, "sequence");
        C3862t.g(transformer, "transformer");
        C3862t.g(iterator, "iterator");
        this.sequence = sequence;
        this.transformer = transformer;
        this.iterator = iterator;
    }

    @Override // Tb.h
    public Iterator<E> iterator() {
        return new a(this);
    }
}
