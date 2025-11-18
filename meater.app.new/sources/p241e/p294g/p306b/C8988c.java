package p241e.p294g.p306b;

import p241e.p294g.p306b.C8990e;
import p456rx.C11234e;

/* compiled from: PublishRelay.java */
/* renamed from: e.g.b.c */
/* loaded from: classes.dex */
public class C8988c<T> extends AbstractC8989d<T, T> {

    /* renamed from: g */
    private final C8990e<T> f34563g;

    protected C8988c(C11234e.a<T> aVar, C8990e<T> c8990e) {
        super(aVar);
        this.f34563g = c8990e;
    }

    /* renamed from: f1 */
    public static <T> C8988c<T> m28593f1() {
        C8990e c8990e = new C8990e();
        return new C8988c<>(c8990e, c8990e);
    }

    @Override // p456rx.p460m.InterfaceC11253b
    public void call(T t) {
        for (C8990e.b<T> bVar : this.f34563g.m28599f()) {
            bVar.onNext(t);
        }
    }
}
