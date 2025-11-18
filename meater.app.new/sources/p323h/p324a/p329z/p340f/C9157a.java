package p323h.p324a.p329z.p340f;

import java.util.concurrent.atomic.AtomicReference;
import p323h.p324a.p329z.p332c.InterfaceC9113e;

/* compiled from: MpscLinkedQueue.java */
/* renamed from: h.a.z.f.a */
/* loaded from: classes2.dex */
public final class C9157a<T> implements InterfaceC9113e<T> {

    /* renamed from: f */
    private final AtomicReference<a<T>> f35159f = new AtomicReference<>();

    /* renamed from: g */
    private final AtomicReference<a<T>> f35160g = new AtomicReference<>();

    /* compiled from: MpscLinkedQueue.java */
    /* renamed from: h.a.z.f.a$a */
    static final class a<E> extends AtomicReference<a<E>> {

        /* renamed from: f */
        private E f35161f;

        a() {
        }

        /* renamed from: a */
        public E m29320a() {
            E eM29321b = m29321b();
            m29324e(null);
            return eM29321b;
        }

        /* renamed from: b */
        public E m29321b() {
            return this.f35161f;
        }

        /* renamed from: c */
        public a<E> m29322c() {
            return get();
        }

        /* renamed from: d */
        public void m29323d(a<E> aVar) {
            lazySet(aVar);
        }

        /* renamed from: e */
        public void m29324e(E e2) {
            this.f35161f = e2;
        }

        a(E e2) {
            m29324e(e2);
        }
    }

    public C9157a() {
        a<T> aVar = new a<>();
        m29318d(aVar);
        m29319e(aVar);
    }

    /* renamed from: a */
    a<T> m29315a() {
        return this.f35160g.get();
    }

    /* renamed from: b */
    a<T> m29316b() {
        return this.f35160g.get();
    }

    /* renamed from: c */
    a<T> m29317c() {
        return this.f35159f.get();
    }

    @Override // p323h.p324a.p329z.p332c.InterfaceC9114f
    public void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    /* renamed from: d */
    void m29318d(a<T> aVar) {
        this.f35160g.lazySet(aVar);
    }

    /* renamed from: e */
    a<T> m29319e(a<T> aVar) {
        return this.f35159f.getAndSet(aVar);
    }

    @Override // p323h.p324a.p329z.p332c.InterfaceC9114f
    public boolean isEmpty() {
        return m29316b() == m29317c();
    }

    @Override // p323h.p324a.p329z.p332c.InterfaceC9114f
    public boolean offer(T t) {
        if (t == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        a<T> aVar = new a<>(t);
        m29319e(aVar).m29323d(aVar);
        return true;
    }

    @Override // p323h.p324a.p329z.p332c.InterfaceC9113e, p323h.p324a.p329z.p332c.InterfaceC9114f
    public T poll() {
        a<T> aVarM29322c;
        a<T> aVarM29315a = m29315a();
        a<T> aVarM29322c2 = aVarM29315a.m29322c();
        if (aVarM29322c2 != null) {
            T tM29320a = aVarM29322c2.m29320a();
            m29318d(aVarM29322c2);
            return tM29320a;
        }
        if (aVarM29315a == m29317c()) {
            return null;
        }
        do {
            aVarM29322c = aVarM29315a.m29322c();
        } while (aVarM29322c == null);
        T tM29320a2 = aVarM29322c.m29320a();
        m29318d(aVarM29322c);
        return tM29320a2;
    }
}
