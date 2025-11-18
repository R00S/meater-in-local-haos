package p456rx.p460m;

/* compiled from: Actions.java */
/* renamed from: rx.m.c */
/* loaded from: classes3.dex */
public final class C11254c {

    /* renamed from: a */
    private static final b f42151a = new b();

    /* compiled from: Actions.java */
    /* renamed from: rx.m.c$a */
    static final class a<T> implements InterfaceC11253b<T> {

        /* renamed from: f */
        final InterfaceC11252a f42152f;

        public a(InterfaceC11252a interfaceC11252a) {
            this.f42152f = interfaceC11252a;
        }

        @Override // p456rx.p460m.InterfaceC11253b
        public void call(T t) {
            this.f42152f.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Actions.java */
    /* renamed from: rx.m.c$b */
    public static final class b<T0, T1, T2, T3, T4, T5, T6, T7, T8> implements InterfaceC11252a, InterfaceC11253b<T0> {
        b() {
        }

        @Override // p456rx.p460m.InterfaceC11252a
        public void call() {
        }

        @Override // p456rx.p460m.InterfaceC11253b
        public void call(T0 t0) {
        }
    }

    /* renamed from: a */
    public static <T0, T1, T2, T3, T4, T5, T6, T7, T8> b<T0, T1, T2, T3, T4, T5, T6, T7, T8> m40157a() {
        return f42151a;
    }

    /* renamed from: b */
    public static <T> InterfaceC11253b<T> m40158b(InterfaceC11252a interfaceC11252a) {
        return new a(interfaceC11252a);
    }
}
