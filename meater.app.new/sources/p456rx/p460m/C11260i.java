package p456rx.p460m;

/* compiled from: Functions.java */
/* renamed from: rx.m.i */
/* loaded from: classes3.dex */
public final class C11260i {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: Functions.java */
    /* renamed from: rx.m.i$a */
    static class a<R> implements InterfaceC11259h<R> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC11257f f42153a;

        a(InterfaceC11257f interfaceC11257f) {
            this.f42153a = interfaceC11257f;
        }

        @Override // p456rx.p460m.InterfaceC11259h
        public R call(Object... objArr) {
            if (objArr.length == 2) {
                return (R) this.f42153a.mo6865a(objArr[0], objArr[1]);
            }
            throw new IllegalArgumentException("Func2 expecting 2 arguments.");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: Functions.java */
    /* renamed from: rx.m.i$b */
    static class b<R> implements InterfaceC11259h<R> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC11258g f42154a;

        b(InterfaceC11258g interfaceC11258g) {
            this.f42154a = interfaceC11258g;
        }

        @Override // p456rx.p460m.InterfaceC11259h
        public R call(Object... objArr) {
            if (objArr.length == 3) {
                return (R) this.f42154a.mo6864a(objArr[0], objArr[1], objArr[2]);
            }
            throw new IllegalArgumentException("Func3 expecting 3 arguments.");
        }
    }

    /* renamed from: a */
    public static <T0, T1, R> InterfaceC11259h<R> m40159a(InterfaceC11257f<? super T0, ? super T1, ? extends R> interfaceC11257f) {
        return new a(interfaceC11257f);
    }

    /* renamed from: b */
    public static <T0, T1, T2, R> InterfaceC11259h<R> m40160b(InterfaceC11258g<? super T0, ? super T1, ? super T2, ? extends R> interfaceC11258g) {
        return new b(interfaceC11258g);
    }
}
