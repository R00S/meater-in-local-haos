package m8;

import java.util.Iterator;

/* compiled from: FluentIterable.java */
/* renamed from: m8.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4002q<E> implements Iterable<E> {

    /* renamed from: B, reason: collision with root package name */
    private final l8.l<Iterable<E>> f45370B;

    /* compiled from: FluentIterable.java */
    /* renamed from: m8.q$a */
    class a extends AbstractC4002q<E> {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Iterable f45371C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Iterable iterable, Iterable iterable2) {
            super(iterable);
            this.f45371C = iterable2;
        }

        @Override // java.lang.Iterable
        public Iterator<E> iterator() {
            return this.f45371C.iterator();
        }
    }

    protected AbstractC4002q() {
        this.f45370B = l8.l.a();
    }

    public static <E> AbstractC4002q<E> f(Iterable<E> iterable) {
        return iterable instanceof AbstractC4002q ? (AbstractC4002q) iterable : new a(iterable, iterable);
    }

    private Iterable<E> h() {
        return this.f45370B.e(this);
    }

    public final AbstractC4002q<E> c(l8.n<? super E> nVar) {
        return f(C3982E.c(h(), nVar));
    }

    public final AbstractC3979B<E> i() {
        return AbstractC3979B.B(h());
    }

    public String toString() {
        return C3982E.l(h());
    }

    AbstractC4002q(Iterable<E> iterable) {
        this.f45370B = l8.l.d(iterable);
    }
}
