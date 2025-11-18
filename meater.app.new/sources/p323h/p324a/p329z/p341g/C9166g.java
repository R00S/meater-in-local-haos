package p323h.p324a.p329z.p341g;

import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p323h.p324a.AbstractC9081r;
import p323h.p324a.p325a0.C9063a;
import p323h.p324a.p327x.InterfaceC9089c;
import p323h.p324a.p329z.p330a.EnumC9104d;
import p323h.p324a.p329z.p330a.InterfaceC9102b;

/* compiled from: NewThreadWorker.java */
/* renamed from: h.a.z.g.g */
/* loaded from: classes2.dex */
public class C9166g extends AbstractC9081r.b implements InterfaceC9089c {

    /* renamed from: f */
    private final ScheduledExecutorService f35238f;

    /* renamed from: g */
    volatile boolean f35239g;

    public C9166g(ThreadFactory threadFactory) {
        this.f35238f = C9170k.m29366a(threadFactory);
    }

    @Override // p323h.p324a.AbstractC9081r.b
    /* renamed from: b */
    public InterfaceC9089c mo29224b(Runnable runnable) {
        return mo29225c(runnable, 0L, null);
    }

    @Override // p323h.p324a.AbstractC9081r.b
    /* renamed from: c */
    public InterfaceC9089c mo29225c(Runnable runnable, long j2, TimeUnit timeUnit) {
        return this.f35239g ? EnumC9104d.INSTANCE : m29361d(runnable, j2, timeUnit, null);
    }

    /* renamed from: d */
    public RunnableC9169j m29361d(Runnable runnable, long j2, TimeUnit timeUnit, InterfaceC9102b interfaceC9102b) {
        RunnableC9169j runnableC9169j = new RunnableC9169j(C9063a.m29149q(runnable), interfaceC9102b);
        if (interfaceC9102b != null && !interfaceC9102b.mo29239b(runnableC9169j)) {
            return runnableC9169j;
        }
        try {
            runnableC9169j.m29365a(j2 <= 0 ? this.f35238f.submit((Callable) runnableC9169j) : this.f35238f.schedule((Callable) runnableC9169j, j2, timeUnit));
        } catch (RejectedExecutionException e2) {
            if (interfaceC9102b != null) {
                interfaceC9102b.mo29238a(runnableC9169j);
            }
            C9063a.m29147o(e2);
        }
        return runnableC9169j;
    }

    /* renamed from: e */
    public InterfaceC9089c m29362e(Runnable runnable, long j2, TimeUnit timeUnit) {
        CallableC9168i callableC9168i = new CallableC9168i(C9063a.m29149q(runnable));
        try {
            callableC9168i.m29347a(j2 <= 0 ? this.f35238f.submit(callableC9168i) : this.f35238f.schedule(callableC9168i, j2, timeUnit));
            return callableC9168i;
        } catch (RejectedExecutionException e2) {
            C9063a.m29147o(e2);
            return EnumC9104d.INSTANCE;
        }
    }

    /* renamed from: f */
    public void m29363f() {
        if (this.f35239g) {
            return;
        }
        this.f35239g = true;
        this.f35238f.shutdown();
    }

    @Override // p323h.p324a.p327x.InterfaceC9089c
    /* renamed from: k */
    public void mo29115k() {
        if (this.f35239g) {
            return;
        }
        this.f35239g = true;
        this.f35238f.shutdownNow();
    }

    @Override // p323h.p324a.p327x.InterfaceC9089c
    /* renamed from: q */
    public boolean mo29116q() {
        return this.f35239g;
    }
}
