package p456rx.p461n.p464c;

import java.util.concurrent.TimeUnit;
import p456rx.AbstractC11243h;
import p456rx.InterfaceC11246k;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p474t.C11425a;
import p456rx.p474t.C11429e;

/* compiled from: ImmediateScheduler.java */
/* renamed from: rx.n.c.f */
/* loaded from: classes3.dex */
public final class C11341f extends AbstractC11243h {

    /* renamed from: a */
    public static final C11341f f42795a = new C11341f();

    /* compiled from: ImmediateScheduler.java */
    /* renamed from: rx.n.c.f$a */
    final class a extends AbstractC11243h.a implements InterfaceC11246k {

        /* renamed from: f */
        final C11425a f42796f = new C11425a();

        a() {
        }

        @Override // p456rx.AbstractC11243h.a
        /* renamed from: c */
        public InterfaceC11246k mo40146c(InterfaceC11252a interfaceC11252a) {
            interfaceC11252a.call();
            return C11429e.m40676c();
        }

        @Override // p456rx.AbstractC11243h.a
        /* renamed from: d */
        public InterfaceC11246k mo40147d(InterfaceC11252a interfaceC11252a, long j2, TimeUnit timeUnit) {
            return mo40146c(new C11348m(interfaceC11252a, this, C11341f.this.now() + timeUnit.toMillis(j2)));
        }

        @Override // p456rx.InterfaceC11246k
        public boolean isUnsubscribed() {
            return this.f42796f.isUnsubscribed();
        }

        @Override // p456rx.InterfaceC11246k
        public void unsubscribe() {
            this.f42796f.unsubscribe();
        }
    }

    private C11341f() {
    }

    @Override // p456rx.AbstractC11243h
    public AbstractC11243h.a createWorker() {
        return new a();
    }
}
