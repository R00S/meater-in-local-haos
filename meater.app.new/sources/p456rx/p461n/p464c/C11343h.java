package p456rx.p461n.p464c;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p456rx.AbstractC11243h;
import p456rx.InterfaceC11246k;
import p456rx.exceptions.C11240a;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p461n.p466e.C11358g;
import p456rx.p461n.p466e.C11363l;
import p456rx.p461n.p466e.ThreadFactoryC11360i;
import p456rx.p471q.C11409c;
import p456rx.p474t.C11426b;
import p456rx.p474t.C11429e;

/* compiled from: NewThreadWorker.java */
/* renamed from: rx.n.c.h */
/* loaded from: classes3.dex */
public class C11343h extends AbstractC11243h.a implements InterfaceC11246k {

    /* renamed from: f */
    private static final boolean f42799f;

    /* renamed from: j */
    private static volatile Object f42803j;

    /* renamed from: l */
    private final ScheduledExecutorService f42805l;

    /* renamed from: m */
    volatile boolean f42806m;

    /* renamed from: k */
    private static final Object f42804k = new Object();

    /* renamed from: h */
    private static final ConcurrentHashMap<ScheduledThreadPoolExecutor, ScheduledThreadPoolExecutor> f42801h = new ConcurrentHashMap<>();

    /* renamed from: i */
    private static final AtomicReference<ScheduledExecutorService> f42802i = new AtomicReference<>();

    /* renamed from: g */
    public static final int f42800g = Integer.getInteger("rx.scheduler.jdk6.purge-frequency-millis", 1000).intValue();

    /* compiled from: NewThreadWorker.java */
    /* renamed from: rx.n.c.h$a */
    static class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C11343h.m40394h();
        }
    }

    static {
        boolean z = Boolean.getBoolean("rx.scheduler.jdk6.purge-force");
        int iM40433a = C11358g.m40433a();
        f42799f = !z && (iM40433a == 0 || iM40433a >= 21);
    }

    public C11343h(ThreadFactory threadFactory) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (!m40396m(scheduledExecutorServiceNewScheduledThreadPool) && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            m40395i((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool);
        }
        this.f42805l = scheduledExecutorServiceNewScheduledThreadPool;
    }

    /* renamed from: f */
    public static void m40392f(ScheduledExecutorService scheduledExecutorService) {
        f42801h.remove(scheduledExecutorService);
    }

    /* renamed from: g */
    static Method m40393g(ScheduledExecutorService scheduledExecutorService) throws SecurityException {
        for (Method method : scheduledExecutorService.getClass().getMethods()) {
            if (method.getName().equals("setRemoveOnCancelPolicy")) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1 && parameterTypes[0] == Boolean.TYPE) {
                    return method;
                }
            }
        }
        return null;
    }

    /* renamed from: h */
    static void m40394h() {
        try {
            Iterator<ScheduledThreadPoolExecutor> it = f42801h.keySet().iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor next = it.next();
                if (next.isShutdown()) {
                    it.remove();
                } else {
                    next.purge();
                }
            }
        } catch (Throwable th) {
            C11240a.m40140e(th);
            C11409c.m40578j(th);
        }
    }

    /* renamed from: i */
    public static void m40395i(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        while (true) {
            AtomicReference<ScheduledExecutorService> atomicReference = f42802i;
            if (atomicReference.get() != null) {
                break;
            }
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new ThreadFactoryC11360i("RxSchedulerPurge-"));
            if (atomicReference.compareAndSet(null, scheduledExecutorServiceNewScheduledThreadPool)) {
                a aVar = new a();
                int i2 = f42800g;
                scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(aVar, i2, i2, TimeUnit.MILLISECONDS);
                break;
            }
            scheduledExecutorServiceNewScheduledThreadPool.shutdownNow();
        }
        f42801h.putIfAbsent(scheduledThreadPoolExecutor, scheduledThreadPoolExecutor);
    }

    /* renamed from: m */
    public static boolean m40396m(ScheduledExecutorService scheduledExecutorService) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Method methodM40393g;
        if (f42799f) {
            if (scheduledExecutorService instanceof ScheduledThreadPoolExecutor) {
                Object obj = f42803j;
                Object obj2 = f42804k;
                if (obj == obj2) {
                    return false;
                }
                if (obj == null) {
                    methodM40393g = m40393g(scheduledExecutorService);
                    if (methodM40393g != null) {
                        obj2 = methodM40393g;
                    }
                    f42803j = obj2;
                } else {
                    methodM40393g = (Method) obj;
                }
            } else {
                methodM40393g = m40393g(scheduledExecutorService);
            }
            if (methodM40393g != null) {
                try {
                    methodM40393g.invoke(scheduledExecutorService, Boolean.TRUE);
                    return true;
                } catch (IllegalAccessException e2) {
                    C11409c.m40578j(e2);
                } catch (IllegalArgumentException e3) {
                    C11409c.m40578j(e3);
                } catch (InvocationTargetException e4) {
                    C11409c.m40578j(e4);
                }
            }
        }
        return false;
    }

    @Override // p456rx.AbstractC11243h.a
    /* renamed from: c */
    public InterfaceC11246k mo40146c(InterfaceC11252a interfaceC11252a) {
        return mo40147d(interfaceC11252a, 0L, null);
    }

    @Override // p456rx.AbstractC11243h.a
    /* renamed from: d */
    public InterfaceC11246k mo40147d(InterfaceC11252a interfaceC11252a, long j2, TimeUnit timeUnit) {
        return this.f42806m ? C11429e.m40676c() : m40397j(interfaceC11252a, j2, timeUnit);
    }

    @Override // p456rx.InterfaceC11246k
    public boolean isUnsubscribed() {
        return this.f42806m;
    }

    /* renamed from: j */
    public RunnableC11345j m40397j(InterfaceC11252a interfaceC11252a, long j2, TimeUnit timeUnit) {
        RunnableC11345j runnableC11345j = new RunnableC11345j(C11409c.m40585q(interfaceC11252a));
        runnableC11345j.m40402a(j2 <= 0 ? this.f42805l.submit(runnableC11345j) : this.f42805l.schedule(runnableC11345j, j2, timeUnit));
        return runnableC11345j;
    }

    /* renamed from: k */
    public RunnableC11345j m40398k(InterfaceC11252a interfaceC11252a, long j2, TimeUnit timeUnit, C11363l c11363l) {
        RunnableC11345j runnableC11345j = new RunnableC11345j(C11409c.m40585q(interfaceC11252a), c11363l);
        c11363l.m40464a(runnableC11345j);
        runnableC11345j.m40402a(j2 <= 0 ? this.f42805l.submit(runnableC11345j) : this.f42805l.schedule(runnableC11345j, j2, timeUnit));
        return runnableC11345j;
    }

    /* renamed from: l */
    public RunnableC11345j m40399l(InterfaceC11252a interfaceC11252a, long j2, TimeUnit timeUnit, C11426b c11426b) {
        RunnableC11345j runnableC11345j = new RunnableC11345j(C11409c.m40585q(interfaceC11252a), c11426b);
        c11426b.m40667a(runnableC11345j);
        runnableC11345j.m40402a(j2 <= 0 ? this.f42805l.submit(runnableC11345j) : this.f42805l.schedule(runnableC11345j, j2, timeUnit));
        return runnableC11345j;
    }

    @Override // p456rx.InterfaceC11246k
    public void unsubscribe() {
        this.f42806m = true;
        this.f42805l.shutdownNow();
        m40392f(this.f42805l);
    }
}
