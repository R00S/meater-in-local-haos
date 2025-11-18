package p456rx.schedulers;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p456rx.AbstractC11243h;
import p456rx.p461n.p464c.C11338c;
import p456rx.p461n.p464c.C11339d;
import p456rx.p461n.p464c.C11341f;
import p456rx.p461n.p464c.C11349n;
import p456rx.p461n.p464c.InterfaceC11346k;
import p456rx.p471q.C11409c;
import p456rx.p471q.C11412f;
import p456rx.p471q.C11413g;

/* loaded from: classes.dex */
public final class Schedulers {

    /* renamed from: a */
    private static final AtomicReference<Schedulers> f43067a = new AtomicReference<>();

    /* renamed from: b */
    private final AbstractC11243h f43068b;

    /* renamed from: c */
    private final AbstractC11243h f43069c;

    /* renamed from: d */
    private final AbstractC11243h f43070d;

    private Schedulers() {
        C11413g c11413gM40613f = C11412f.m40607c().m40613f();
        AbstractC11243h abstractC11243hM40622g = c11413gM40613f.m40622g();
        if (abstractC11243hM40622g != null) {
            this.f43068b = abstractC11243hM40622g;
        } else {
            this.f43068b = C11413g.m40615a();
        }
        AbstractC11243h abstractC11243hM40623i = c11413gM40613f.m40623i();
        if (abstractC11243hM40623i != null) {
            this.f43069c = abstractC11243hM40623i;
        } else {
            this.f43069c = C11413g.m40617c();
        }
        AbstractC11243h abstractC11243hM40624j = c11413gM40613f.m40624j();
        if (abstractC11243hM40624j != null) {
            this.f43070d = abstractC11243hM40624j;
        } else {
            this.f43070d = C11413g.m40619e();
        }
    }

    /* renamed from: a */
    private static Schedulers m40657a() {
        while (true) {
            AtomicReference<Schedulers> atomicReference = f43067a;
            Schedulers schedulers = atomicReference.get();
            if (schedulers != null) {
                return schedulers;
            }
            Schedulers schedulers2 = new Schedulers();
            if (atomicReference.compareAndSet(null, schedulers2)) {
                return schedulers2;
            }
            schedulers2.m40659b();
        }
    }

    public static AbstractC11243h computation() {
        return C11409c.m40574f(m40657a().f43068b);
    }

    public static AbstractC11243h from(Executor executor) {
        return new C11338c(executor);
    }

    public static AbstractC11243h immediate() {
        return C11341f.f42795a;
    }

    /* renamed from: io */
    public static AbstractC11243h m40658io() {
        return C11409c.m40579k(m40657a().f43069c);
    }

    public static AbstractC11243h newThread() {
        return C11409c.m40580l(m40657a().f43070d);
    }

    public static void reset() {
        Schedulers andSet = f43067a.getAndSet(null);
        if (andSet != null) {
            andSet.m40659b();
        }
    }

    public static void shutdown() {
        Schedulers schedulersM40657a = m40657a();
        schedulersM40657a.m40659b();
        synchronized (schedulersM40657a) {
            C11339d.f42790h.shutdown();
        }
    }

    public static void start() {
        Schedulers schedulersM40657a = m40657a();
        schedulersM40657a.m40660c();
        synchronized (schedulersM40657a) {
            C11339d.f42790h.start();
        }
    }

    public static TestScheduler test() {
        return new TestScheduler();
    }

    public static AbstractC11243h trampoline() {
        return C11349n.f42848a;
    }

    /* renamed from: b */
    synchronized void m40659b() {
        Object obj = this.f43068b;
        if (obj instanceof InterfaceC11346k) {
            ((InterfaceC11346k) obj).shutdown();
        }
        Object obj2 = this.f43069c;
        if (obj2 instanceof InterfaceC11346k) {
            ((InterfaceC11346k) obj2).shutdown();
        }
        Object obj3 = this.f43070d;
        if (obj3 instanceof InterfaceC11346k) {
            ((InterfaceC11346k) obj3).shutdown();
        }
    }

    /* renamed from: c */
    synchronized void m40660c() {
        Object obj = this.f43068b;
        if (obj instanceof InterfaceC11346k) {
            ((InterfaceC11346k) obj).start();
        }
        Object obj2 = this.f43069c;
        if (obj2 instanceof InterfaceC11346k) {
            ((InterfaceC11346k) obj2).start();
        }
        Object obj3 = this.f43070d;
        if (obj3 instanceof InterfaceC11346k) {
            ((InterfaceC11346k) obj3).start();
        }
    }
}
