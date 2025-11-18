package p456rx.p474t;

import java.util.concurrent.atomic.AtomicReference;
import p456rx.InterfaceC11246k;
import p456rx.p460m.InterfaceC11252a;

/* compiled from: BooleanSubscription.java */
/* renamed from: rx.t.a */
/* loaded from: classes3.dex */
public final class C11425a implements InterfaceC11246k {

    /* renamed from: f */
    static final InterfaceC11252a f43084f = new a();

    /* renamed from: g */
    final AtomicReference<InterfaceC11252a> f43085g;

    /* compiled from: BooleanSubscription.java */
    /* renamed from: rx.t.a$a */
    static class a implements InterfaceC11252a {
        a() {
        }

        @Override // p456rx.p460m.InterfaceC11252a
        public void call() {
        }
    }

    public C11425a() {
        this.f43085g = new AtomicReference<>();
    }

    /* renamed from: a */
    public static C11425a m40664a() {
        return new C11425a();
    }

    /* renamed from: b */
    public static C11425a m40665b(InterfaceC11252a interfaceC11252a) {
        return new C11425a(interfaceC11252a);
    }

    @Override // p456rx.InterfaceC11246k
    public boolean isUnsubscribed() {
        return this.f43085g.get() == f43084f;
    }

    @Override // p456rx.InterfaceC11246k
    public void unsubscribe() {
        InterfaceC11252a andSet;
        InterfaceC11252a interfaceC11252a = this.f43085g.get();
        InterfaceC11252a interfaceC11252a2 = f43084f;
        if (interfaceC11252a == interfaceC11252a2 || (andSet = this.f43085g.getAndSet(interfaceC11252a2)) == null || andSet == interfaceC11252a2) {
            return;
        }
        andSet.call();
    }

    private C11425a(InterfaceC11252a interfaceC11252a) {
        this.f43085g = new AtomicReference<>(interfaceC11252a);
    }
}
