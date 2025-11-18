package p456rx.p461n.p462a;

import java.util.concurrent.TimeUnit;
import p456rx.AbstractC11243h;
import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.exceptions.C11240a;
import p456rx.p460m.InterfaceC11252a;

/* compiled from: OnSubscribeTimerPeriodically.java */
/* renamed from: rx.n.a.g0 */
/* loaded from: classes3.dex */
public final class C11280g0 implements C11234e.a<Long> {

    /* renamed from: f */
    final long f42284f;

    /* renamed from: g */
    final long f42285g;

    /* renamed from: h */
    final TimeUnit f42286h;

    /* renamed from: i */
    final AbstractC11243h f42287i;

    /* compiled from: OnSubscribeTimerPeriodically.java */
    /* renamed from: rx.n.a.g0$a */
    class a implements InterfaceC11252a {

        /* renamed from: f */
        long f42288f;

        /* renamed from: g */
        final /* synthetic */ AbstractC11245j f42289g;

        /* renamed from: h */
        final /* synthetic */ AbstractC11243h.a f42290h;

        a(AbstractC11245j abstractC11245j, AbstractC11243h.a aVar) {
            this.f42289g = abstractC11245j;
            this.f42290h = aVar;
        }

        @Override // p456rx.p460m.InterfaceC11252a
        public void call() {
            try {
                AbstractC11245j abstractC11245j = this.f42289g;
                long j2 = this.f42288f;
                this.f42288f = 1 + j2;
                abstractC11245j.onNext(Long.valueOf(j2));
            } catch (Throwable th) {
                try {
                    this.f42290h.unsubscribe();
                } finally {
                    C11240a.m40141f(th, this.f42289g);
                }
            }
        }
    }

    public C11280g0(long j2, long j3, TimeUnit timeUnit, AbstractC11243h abstractC11243h) {
        this.f42284f = j2;
        this.f42285g = j3;
        this.f42286h = timeUnit;
        this.f42287i = abstractC11243h;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11245j<? super Long> abstractC11245j) {
        AbstractC11243h.a aVarCreateWorker = this.f42287i.createWorker();
        abstractC11245j.add(aVarCreateWorker);
        aVarCreateWorker.mo40148e(new a(abstractC11245j, aVarCreateWorker), this.f42284f, this.f42285g, this.f42286h);
    }
}
