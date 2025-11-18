package p241e.p294g.p306b;

import p241e.p294g.p306b.C8990e;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11253b;

/* compiled from: BehaviorRelay.java */
/* renamed from: e.g.b.a */
/* loaded from: classes.dex */
public class C8986a<T> extends AbstractC8989d<T, T> {

    /* renamed from: g */
    private static final Object[] f34559g = new Object[0];

    /* renamed from: h */
    private final C8990e<T> f34560h;

    /* compiled from: BehaviorRelay.java */
    /* renamed from: e.g.b.a$a */
    /* loaded from: classes2.dex */
    static class a implements InterfaceC11253b<C8990e.b<T>> {

        /* renamed from: f */
        final /* synthetic */ C8990e f34561f;

        a(C8990e c8990e) {
            this.f34561f = c8990e;
        }

        @Override // p456rx.p460m.InterfaceC11253b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(C8990e.b<T> bVar) {
            bVar.m28604b(this.f34561f.m28597d());
        }
    }

    protected C8986a(C11234e.a<T> aVar, C8990e<T> c8990e) {
        super(aVar);
        this.f34560h = c8990e;
    }

    /* renamed from: f1 */
    public static <T> C8986a<T> m28588f1() {
        return m28589g1(null, false);
    }

    /* renamed from: g1 */
    private static <T> C8986a<T> m28589g1(T t, boolean z) {
        C8990e c8990e = new C8990e();
        if (z) {
            c8990e.m28601h(C8987b.m28592b(t));
        }
        c8990e.f34567i = new a(c8990e);
        return new C8986a<>(c8990e, c8990e);
    }

    @Override // p456rx.p460m.InterfaceC11253b
    public void call(T t) {
        if (this.f34560h.m28597d() == null || this.f34560h.f34565g) {
            Object objM28592b = C8987b.m28592b(t);
            for (C8990e.b<T> bVar : this.f34560h.m28598e(objM28592b)) {
                bVar.m28605d(objM28592b);
            }
        }
    }
}
