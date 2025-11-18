package p241e.p294g.p295a.p296a;

import p456rx.p460m.InterfaceC11256e;
import p456rx.p460m.InterfaceCallableC11255d;

/* compiled from: Functions.java */
/* renamed from: e.g.a.a.a */
/* loaded from: classes2.dex */
public final class C8957a {

    /* renamed from: a */
    private static final a<Boolean> f34488a;

    /* renamed from: b */
    public static final InterfaceCallableC11255d<Boolean> f34489b;

    /* renamed from: c */
    public static final InterfaceC11256e<Object, Boolean> f34490c;

    /* compiled from: Functions.java */
    /* renamed from: e.g.a.a.a$a */
    private static final class a<T> implements InterfaceC11256e<Object, T>, InterfaceCallableC11255d<T> {

        /* renamed from: f */
        private final T f34491f;

        a(T t) {
            this.f34491f = t;
        }

        @Override // p456rx.p460m.InterfaceC11256e
        public T call(Object obj) {
            return this.f34491f;
        }

        @Override // p456rx.p460m.InterfaceCallableC11255d, java.util.concurrent.Callable
        public T call() {
            return this.f34491f;
        }
    }

    static {
        a<Boolean> aVar = new a<>(Boolean.TRUE);
        f34488a = aVar;
        f34489b = aVar;
        f34490c = aVar;
    }
}
