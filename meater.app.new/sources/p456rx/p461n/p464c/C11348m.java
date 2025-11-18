package p456rx.p461n.p464c;

import p456rx.AbstractC11243h;
import p456rx.exceptions.C11240a;
import p456rx.p460m.InterfaceC11252a;

/* compiled from: SleepingAction.java */
/* renamed from: rx.n.c.m */
/* loaded from: classes3.dex */
class C11348m implements InterfaceC11252a {

    /* renamed from: f */
    private final InterfaceC11252a f42845f;

    /* renamed from: g */
    private final AbstractC11243h.a f42846g;

    /* renamed from: h */
    private final long f42847h;

    public C11348m(InterfaceC11252a interfaceC11252a, AbstractC11243h.a aVar, long j2) {
        this.f42845f = interfaceC11252a;
        this.f42846g = aVar;
        this.f42847h = j2;
    }

    @Override // p456rx.p460m.InterfaceC11252a
    public void call() throws InterruptedException {
        if (this.f42846g.isUnsubscribed()) {
            return;
        }
        long jMo40145b = this.f42847h - this.f42846g.mo40145b();
        if (jMo40145b > 0) {
            try {
                Thread.sleep(jMo40145b);
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                C11240a.m40138c(e2);
            }
        }
        if (this.f42846g.isUnsubscribed()) {
            return;
        }
        this.f42845f.call();
    }
}
