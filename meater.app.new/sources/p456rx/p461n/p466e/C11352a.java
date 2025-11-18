package p456rx.p461n.p466e;

import p456rx.InterfaceC11241f;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11253b;

/* compiled from: ActionObserver.java */
/* renamed from: rx.n.e.a */
/* loaded from: classes3.dex */
public final class C11352a<T> implements InterfaceC11241f<T> {

    /* renamed from: f */
    final InterfaceC11253b<? super T> f42860f;

    /* renamed from: g */
    final InterfaceC11253b<? super Throwable> f42861g;

    /* renamed from: h */
    final InterfaceC11252a f42862h;

    public C11352a(InterfaceC11253b<? super T> interfaceC11253b, InterfaceC11253b<? super Throwable> interfaceC11253b2, InterfaceC11252a interfaceC11252a) {
        this.f42860f = interfaceC11253b;
        this.f42861g = interfaceC11253b2;
        this.f42862h = interfaceC11252a;
    }

    @Override // p456rx.InterfaceC11241f
    public void onCompleted() {
        this.f42862h.call();
    }

    @Override // p456rx.InterfaceC11241f
    public void onError(Throwable th) {
        this.f42861g.call(th);
    }

    @Override // p456rx.InterfaceC11241f
    public void onNext(T t) {
        this.f42860f.call(t);
    }
}
