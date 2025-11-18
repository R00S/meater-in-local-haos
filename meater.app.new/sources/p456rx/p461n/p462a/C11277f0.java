package p456rx.p461n.p462a;

import java.util.concurrent.TimeUnit;
import p456rx.AbstractC11243h;
import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.exceptions.C11240a;
import p456rx.p460m.InterfaceC11252a;

/* compiled from: OnSubscribeTimerOnce.java */
/* renamed from: rx.n.a.f0 */
/* loaded from: classes3.dex */
public final class C11277f0 implements C11234e.a<Long> {

    /* renamed from: f */
    final long f42266f;

    /* renamed from: g */
    final TimeUnit f42267g;

    /* renamed from: h */
    final AbstractC11243h f42268h;

    /* compiled from: OnSubscribeTimerOnce.java */
    /* renamed from: rx.n.a.f0$a */
    class a implements InterfaceC11252a {

        /* renamed from: f */
        final /* synthetic */ AbstractC11245j f42269f;

        a(AbstractC11245j abstractC11245j) {
            this.f42269f = abstractC11245j;
        }

        @Override // p456rx.p460m.InterfaceC11252a
        public void call() {
            try {
                this.f42269f.onNext(0L);
                this.f42269f.onCompleted();
            } catch (Throwable th) {
                C11240a.m40141f(th, this.f42269f);
            }
        }
    }

    public C11277f0(long j2, TimeUnit timeUnit, AbstractC11243h abstractC11243h) {
        this.f42266f = j2;
        this.f42267g = timeUnit;
        this.f42268h = abstractC11243h;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11245j<? super Long> abstractC11245j) {
        AbstractC11243h.a aVarCreateWorker = this.f42268h.createWorker();
        abstractC11245j.add(aVarCreateWorker);
        aVarCreateWorker.mo40147d(new a(abstractC11245j), this.f42266f, this.f42267g);
    }
}
