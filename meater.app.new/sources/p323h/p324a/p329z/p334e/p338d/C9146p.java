package p323h.p324a.p329z.p334e.p338d;

import io.reactivex.exceptions.C9240a;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import p000.C0000a;
import p323h.p324a.AbstractC9076m;
import p323h.p324a.InterfaceC9079p;
import p323h.p324a.InterfaceC9080q;
import p323h.p324a.p325a0.C9063a;
import p323h.p324a.p328y.InterfaceC9098f;
import p323h.p324a.p329z.p330a.EnumC9104d;
import p323h.p324a.p329z.p331b.C9108b;
import p323h.p324a.p329z.p332c.InterfaceC9110b;

/* compiled from: ObservableScalarXMap.java */
/* renamed from: h.a.z.e.d.p */
/* loaded from: classes2.dex */
public final class C9146p {

    /* compiled from: ObservableScalarXMap.java */
    /* renamed from: h.a.z.e.d.p$a */
    public static final class a<T> extends AtomicInteger implements InterfaceC9110b<T>, Runnable {

        /* renamed from: f */
        final InterfaceC9080q<? super T> f35116f;

        /* renamed from: g */
        final T f35117g;

        public a(InterfaceC9080q<? super T> interfaceC9080q, T t) {
            this.f35116f = interfaceC9080q;
            this.f35117g = t;
        }

        @Override // p323h.p324a.p329z.p332c.InterfaceC9114f
        public void clear() {
            lazySet(3);
        }

        @Override // p323h.p324a.p329z.p332c.InterfaceC9111c
        /* renamed from: g */
        public int mo29259g(int i2) {
            if ((i2 & 1) == 0) {
                return 0;
            }
            lazySet(1);
            return 1;
        }

        @Override // p323h.p324a.p329z.p332c.InterfaceC9114f
        public boolean isEmpty() {
            return get() != 1;
        }

        @Override // p323h.p324a.p327x.InterfaceC9089c
        /* renamed from: k */
        public void mo29115k() {
            set(3);
        }

        @Override // p323h.p324a.p329z.p332c.InterfaceC9114f
        public boolean offer(T t) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // p323h.p324a.p329z.p332c.InterfaceC9114f
        public T poll() throws Exception {
            if (get() != 1) {
                return null;
            }
            lazySet(3);
            return this.f35117g;
        }

        @Override // p323h.p324a.p327x.InterfaceC9089c
        /* renamed from: q */
        public boolean mo29116q() {
            return get() == 3;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                this.f35116f.onNext(this.f35117g);
                if (get() == 2) {
                    lazySet(3);
                    this.f35116f.mo29218a();
                }
            }
        }
    }

    /* compiled from: ObservableScalarXMap.java */
    /* renamed from: h.a.z.e.d.p$b */
    static final class b<T, R> extends AbstractC9076m<R> {

        /* renamed from: f */
        final T f35118f;

        /* renamed from: g */
        final InterfaceC9098f<? super T, ? extends InterfaceC9079p<? extends R>> f35119g;

        b(T t, InterfaceC9098f<? super T, ? extends InterfaceC9079p<? extends R>> interfaceC9098f) {
            this.f35118f = t;
            this.f35119g = interfaceC9098f;
        }

        @Override // p323h.p324a.AbstractC9076m
        /* renamed from: x */
        public void mo29214x(InterfaceC9080q<? super R> interfaceC9080q) {
            try {
                InterfaceC9079p interfaceC9079p = (InterfaceC9079p) C9108b.m29271c(this.f35119g.mo4660a(this.f35118f), "The mapper returned a null ObservableSource");
                if (!(interfaceC9079p instanceof Callable)) {
                    interfaceC9079p.mo29199a(interfaceC9080q);
                    return;
                }
                try {
                    Object objCall = ((Callable) interfaceC9079p).call();
                    if (objCall == null) {
                        EnumC9104d.m29256v(interfaceC9080q);
                        return;
                    }
                    a aVar = new a(interfaceC9080q, objCall);
                    interfaceC9080q.mo29219b(aVar);
                    aVar.run();
                } catch (Throwable th) {
                    C9240a.m30000a(th);
                    EnumC9104d.m29257x(th, interfaceC9080q);
                }
            } catch (Throwable th2) {
                EnumC9104d.m29257x(th2, interfaceC9080q);
            }
        }
    }

    /* renamed from: a */
    public static <T, U> AbstractC9076m<U> m29309a(T t, InterfaceC9098f<? super T, ? extends InterfaceC9079p<? extends U>> interfaceC9098f) {
        return C9063a.m29145m(new b(t, interfaceC9098f));
    }

    /* renamed from: b */
    public static <T, R> boolean m29310b(InterfaceC9079p<T> interfaceC9079p, InterfaceC9080q<? super R> interfaceC9080q, InterfaceC9098f<? super T, ? extends InterfaceC9079p<? extends R>> interfaceC9098f) {
        if (!(interfaceC9079p instanceof Callable)) {
            return false;
        }
        try {
            C0000a c0000a = (Object) ((Callable) interfaceC9079p).call();
            if (c0000a == null) {
                EnumC9104d.m29256v(interfaceC9080q);
                return true;
            }
            try {
                InterfaceC9079p interfaceC9079p2 = (InterfaceC9079p) C9108b.m29271c(interfaceC9098f.mo4660a(c0000a), "The mapper returned a null ObservableSource");
                if (interfaceC9079p2 instanceof Callable) {
                    try {
                        Object objCall = ((Callable) interfaceC9079p2).call();
                        if (objCall == null) {
                            EnumC9104d.m29256v(interfaceC9080q);
                            return true;
                        }
                        a aVar = new a(interfaceC9080q, objCall);
                        interfaceC9080q.mo29219b(aVar);
                        aVar.run();
                    } catch (Throwable th) {
                        C9240a.m30000a(th);
                        EnumC9104d.m29257x(th, interfaceC9080q);
                        return true;
                    }
                } else {
                    interfaceC9079p2.mo29199a(interfaceC9080q);
                }
                return true;
            } catch (Throwable th2) {
                C9240a.m30000a(th2);
                EnumC9104d.m29257x(th2, interfaceC9080q);
                return true;
            }
        } catch (Throwable th3) {
            C9240a.m30000a(th3);
            EnumC9104d.m29257x(th3, interfaceC9080q);
            return true;
        }
    }
}
