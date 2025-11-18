package p323h.p324a;

import java.util.concurrent.TimeUnit;
import p323h.p324a.p325a0.C9063a;
import p323h.p324a.p327x.InterfaceC9089c;
import p323h.p324a.p329z.p341g.C9166g;

/* compiled from: Scheduler.java */
/* renamed from: h.a.r */
/* loaded from: classes2.dex */
public abstract class AbstractC9081r {

    /* renamed from: a */
    static final long f34933a = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    /* compiled from: Scheduler.java */
    /* renamed from: h.a.r$a */
    static final class a implements InterfaceC9089c, Runnable {

        /* renamed from: f */
        final Runnable f34934f;

        /* renamed from: g */
        final b f34935g;

        /* renamed from: h */
        Thread f34936h;

        a(Runnable runnable, b bVar) {
            this.f34934f = runnable;
            this.f34935g = bVar;
        }

        @Override // p323h.p324a.p327x.InterfaceC9089c
        /* renamed from: k */
        public void mo29115k() {
            if (this.f34936h == Thread.currentThread()) {
                b bVar = this.f34935g;
                if (bVar instanceof C9166g) {
                    ((C9166g) bVar).m29363f();
                    return;
                }
            }
            this.f34935g.mo29115k();
        }

        @Override // p323h.p324a.p327x.InterfaceC9089c
        /* renamed from: q */
        public boolean mo29116q() {
            return this.f34935g.mo29116q();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f34936h = Thread.currentThread();
            try {
                this.f34934f.run();
            } finally {
                mo29115k();
                this.f34936h = null;
            }
        }
    }

    /* compiled from: Scheduler.java */
    /* renamed from: h.a.r$b */
    public static abstract class b implements InterfaceC9089c {
        /* renamed from: a */
        public long m29223a(TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        /* renamed from: b */
        public InterfaceC9089c mo29224b(Runnable runnable) {
            return mo29225c(runnable, 0L, TimeUnit.NANOSECONDS);
        }

        /* renamed from: c */
        public abstract InterfaceC9089c mo29225c(Runnable runnable, long j2, TimeUnit timeUnit);
    }

    /* renamed from: a */
    public abstract b mo29220a();

    /* renamed from: b */
    public InterfaceC9089c mo29221b(Runnable runnable) {
        return mo29222c(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    /* renamed from: c */
    public InterfaceC9089c mo29222c(Runnable runnable, long j2, TimeUnit timeUnit) {
        b bVarMo29220a = mo29220a();
        a aVar = new a(C9063a.m29149q(runnable), bVarMo29220a);
        bVarMo29220a.mo29225c(aVar, j2, timeUnit);
        return aVar;
    }
}
