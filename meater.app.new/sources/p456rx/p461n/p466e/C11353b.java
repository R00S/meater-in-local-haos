package p456rx.p461n.p466e;

import p456rx.AbstractC11245j;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11253b;

/* compiled from: ActionSubscriber.java */
/* renamed from: rx.n.e.b */
/* loaded from: classes3.dex */
public final class C11353b<T> extends AbstractC11245j<T> {

    /* renamed from: f */
    final InterfaceC11253b<? super T> f42863f;

    /* renamed from: g */
    final InterfaceC11253b<Throwable> f42864g;

    /* renamed from: h */
    final InterfaceC11252a f42865h;

    public C11353b(InterfaceC11253b<? super T> interfaceC11253b, InterfaceC11253b<Throwable> interfaceC11253b2, InterfaceC11252a interfaceC11252a) {
        this.f42863f = interfaceC11253b;
        this.f42864g = interfaceC11253b2;
        this.f42865h = interfaceC11252a;
    }

    @Override // p456rx.InterfaceC11241f
    public void onCompleted() {
        this.f42865h.call();
    }

    @Override // p456rx.InterfaceC11241f
    public void onError(Throwable th) {
        this.f42864g.call(th);
    }

    @Override // p456rx.InterfaceC11241f
    public void onNext(T t) {
        this.f42863f.call(t);
    }
}
