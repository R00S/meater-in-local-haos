package androidx.work.impl.utils.p017o;

import cm.aptoide.p092pt.account.AdultContentAnalytics;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p241e.p254e.p288c.p289a.p290a.InterfaceFutureC8955a;

/* compiled from: AbstractFuture.java */
/* renamed from: androidx.work.impl.utils.o.a */
/* loaded from: classes.dex */
public abstract class AbstractC0796a<V> implements InterfaceFutureC8955a<V> {

    /* renamed from: f */
    static final boolean f4926f = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", AdultContentAnalytics.UNLOCK));

    /* renamed from: g */
    private static final Logger f4927g = Logger.getLogger(AbstractC0796a.class.getName());

    /* renamed from: h */
    static final b f4928h;

    /* renamed from: i */
    private static final Object f4929i;

    /* renamed from: j */
    volatile Object f4930j;

    /* renamed from: k */
    volatile e f4931k;

    /* renamed from: l */
    volatile i f4932l;

    /* compiled from: AbstractFuture.java */
    /* renamed from: androidx.work.impl.utils.o.a$b */
    private static abstract class b {
        private b() {
        }

        /* renamed from: a */
        abstract boolean mo5196a(AbstractC0796a<?> abstractC0796a, e eVar, e eVar2);

        /* renamed from: b */
        abstract boolean mo5197b(AbstractC0796a<?> abstractC0796a, Object obj, Object obj2);

        /* renamed from: c */
        abstract boolean mo5198c(AbstractC0796a<?> abstractC0796a, i iVar, i iVar2);

        /* renamed from: d */
        abstract void mo5199d(i iVar, i iVar2);

        /* renamed from: e */
        abstract void mo5200e(i iVar, Thread thread);
    }

    /* compiled from: AbstractFuture.java */
    /* renamed from: androidx.work.impl.utils.o.a$c */
    private static final class c {

        /* renamed from: a */
        static final c f4933a;

        /* renamed from: b */
        static final c f4934b;

        /* renamed from: c */
        final boolean f4935c;

        /* renamed from: d */
        final Throwable f4936d;

        static {
            if (AbstractC0796a.f4926f) {
                f4934b = null;
                f4933a = null;
            } else {
                f4934b = new c(false, null);
                f4933a = new c(true, null);
            }
        }

        c(boolean z, Throwable th) {
            this.f4935c = z;
            this.f4936d = th;
        }
    }

    /* compiled from: AbstractFuture.java */
    /* renamed from: androidx.work.impl.utils.o.a$d */
    private static final class d {

        /* renamed from: a */
        static final d f4937a = new d(new a("Failure occurred while trying to finish a future."));

        /* renamed from: b */
        final Throwable f4938b;

        /* compiled from: AbstractFuture.java */
        /* renamed from: androidx.work.impl.utils.o.a$d$a */
        class a extends Throwable {
            a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f4938b = (Throwable) AbstractC0796a.m5179d(th);
        }
    }

    /* compiled from: AbstractFuture.java */
    /* renamed from: androidx.work.impl.utils.o.a$e */
    private static final class e {

        /* renamed from: a */
        static final e f4939a = new e(null, null);

        /* renamed from: b */
        final Runnable f4940b;

        /* renamed from: c */
        final Executor f4941c;

        /* renamed from: d */
        e f4942d;

        e(Runnable runnable, Executor executor) {
            this.f4940b = runnable;
            this.f4941c = executor;
        }
    }

    /* compiled from: AbstractFuture.java */
    /* renamed from: androidx.work.impl.utils.o.a$f */
    private static final class f extends b {

        /* renamed from: a */
        final AtomicReferenceFieldUpdater<i, Thread> f4943a;

        /* renamed from: b */
        final AtomicReferenceFieldUpdater<i, i> f4944b;

        /* renamed from: c */
        final AtomicReferenceFieldUpdater<AbstractC0796a, i> f4945c;

        /* renamed from: d */
        final AtomicReferenceFieldUpdater<AbstractC0796a, e> f4946d;

        /* renamed from: e */
        final AtomicReferenceFieldUpdater<AbstractC0796a, Object> f4947e;

        f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractC0796a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractC0796a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractC0796a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f4943a = atomicReferenceFieldUpdater;
            this.f4944b = atomicReferenceFieldUpdater2;
            this.f4945c = atomicReferenceFieldUpdater3;
            this.f4946d = atomicReferenceFieldUpdater4;
            this.f4947e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.work.impl.utils.p017o.AbstractC0796a.b
        /* renamed from: a */
        boolean mo5196a(AbstractC0796a<?> abstractC0796a, e eVar, e eVar2) {
            return this.f4946d.compareAndSet(abstractC0796a, eVar, eVar2);
        }

        @Override // androidx.work.impl.utils.p017o.AbstractC0796a.b
        /* renamed from: b */
        boolean mo5197b(AbstractC0796a<?> abstractC0796a, Object obj, Object obj2) {
            return this.f4947e.compareAndSet(abstractC0796a, obj, obj2);
        }

        @Override // androidx.work.impl.utils.p017o.AbstractC0796a.b
        /* renamed from: c */
        boolean mo5198c(AbstractC0796a<?> abstractC0796a, i iVar, i iVar2) {
            return this.f4945c.compareAndSet(abstractC0796a, iVar, iVar2);
        }

        @Override // androidx.work.impl.utils.p017o.AbstractC0796a.b
        /* renamed from: d */
        void mo5199d(i iVar, i iVar2) {
            this.f4944b.lazySet(iVar, iVar2);
        }

        @Override // androidx.work.impl.utils.p017o.AbstractC0796a.b
        /* renamed from: e */
        void mo5200e(i iVar, Thread thread) {
            this.f4943a.lazySet(iVar, thread);
        }
    }

    /* compiled from: AbstractFuture.java */
    /* renamed from: androidx.work.impl.utils.o.a$g */
    private static final class g<V> implements Runnable {

        /* renamed from: f */
        final AbstractC0796a<V> f4948f;

        /* renamed from: g */
        final InterfaceFutureC8955a<? extends V> f4949g;

        g(AbstractC0796a<V> abstractC0796a, InterfaceFutureC8955a<? extends V> interfaceFutureC8955a) {
            this.f4948f = abstractC0796a;
            this.f4949g = interfaceFutureC8955a;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f4948f.f4930j != this) {
                return;
            }
            if (AbstractC0796a.f4928h.mo5197b(this.f4948f, this, AbstractC0796a.m5184j(this.f4949g))) {
                AbstractC0796a.m5181f(this.f4948f);
            }
        }
    }

    /* compiled from: AbstractFuture.java */
    /* renamed from: androidx.work.impl.utils.o.a$h */
    private static final class h extends b {
        h() {
            super();
        }

        @Override // androidx.work.impl.utils.p017o.AbstractC0796a.b
        /* renamed from: a */
        boolean mo5196a(AbstractC0796a<?> abstractC0796a, e eVar, e eVar2) {
            synchronized (abstractC0796a) {
                if (abstractC0796a.f4931k != eVar) {
                    return false;
                }
                abstractC0796a.f4931k = eVar2;
                return true;
            }
        }

        @Override // androidx.work.impl.utils.p017o.AbstractC0796a.b
        /* renamed from: b */
        boolean mo5197b(AbstractC0796a<?> abstractC0796a, Object obj, Object obj2) {
            synchronized (abstractC0796a) {
                if (abstractC0796a.f4930j != obj) {
                    return false;
                }
                abstractC0796a.f4930j = obj2;
                return true;
            }
        }

        @Override // androidx.work.impl.utils.p017o.AbstractC0796a.b
        /* renamed from: c */
        boolean mo5198c(AbstractC0796a<?> abstractC0796a, i iVar, i iVar2) {
            synchronized (abstractC0796a) {
                if (abstractC0796a.f4932l != iVar) {
                    return false;
                }
                abstractC0796a.f4932l = iVar2;
                return true;
            }
        }

        @Override // androidx.work.impl.utils.p017o.AbstractC0796a.b
        /* renamed from: d */
        void mo5199d(i iVar, i iVar2) {
            iVar.f4952c = iVar2;
        }

        @Override // androidx.work.impl.utils.p017o.AbstractC0796a.b
        /* renamed from: e */
        void mo5200e(i iVar, Thread thread) {
            iVar.f4951b = thread;
        }
    }

    /* compiled from: AbstractFuture.java */
    /* renamed from: androidx.work.impl.utils.o.a$i */
    private static final class i {

        /* renamed from: a */
        static final i f4950a = new i(false);

        /* renamed from: b */
        volatile Thread f4951b;

        /* renamed from: c */
        volatile i f4952c;

        i(boolean z) {
        }

        /* renamed from: a */
        void m5201a(i iVar) {
            AbstractC0796a.f4928h.mo5199d(this, iVar);
        }

        /* renamed from: b */
        void m5202b() {
            Thread thread = this.f4951b;
            if (thread != null) {
                this.f4951b = null;
                LockSupport.unpark(thread);
            }
        }

        i() {
            AbstractC0796a.f4928h.mo5200e(this, Thread.currentThread());
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "b"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0796a.class, i.class, "l"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0796a.class, e.class, "k"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0796a.class, Object.class, "j"));
            th = null;
        } catch (Throwable th) {
            th = th;
            hVar = new h();
        }
        f4928h = hVar;
        if (th != null) {
            f4927g.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f4929i = new Object();
    }

    protected AbstractC0796a() {
    }

    /* renamed from: a */
    private void m5177a(StringBuilder sb) {
        try {
            Object objM5185l = m5185l(this);
            sb.append("SUCCESS, result=[");
            sb.append(m5188t(objM5185l));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    /* renamed from: c */
    private static CancellationException m5178c(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* renamed from: d */
    static <T> T m5179d(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: e */
    private e m5180e(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f4931k;
        } while (!f4928h.mo5196a(this, eVar2, e.f4939a));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f4942d;
            eVar4.f4942d = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    /* renamed from: f */
    static void m5181f(AbstractC0796a<?> abstractC0796a) {
        e eVar = null;
        while (true) {
            abstractC0796a.m5186o();
            abstractC0796a.m5189b();
            e eVarM5180e = abstractC0796a.m5180e(eVar);
            while (eVarM5180e != null) {
                eVar = eVarM5180e.f4942d;
                Runnable runnable = eVarM5180e.f4940b;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    abstractC0796a = gVar.f4948f;
                    if (abstractC0796a.f4930j == gVar) {
                        if (f4928h.mo5197b(abstractC0796a, gVar, m5184j(gVar.f4949g))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    m5182h(runnable, eVarM5180e.f4941c);
                }
                eVarM5180e = eVar;
            }
            return;
        }
    }

    /* renamed from: h */
    private static void m5182h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            f4927g.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    private V m5183i(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw m5178c("Task was cancelled.", ((c) obj).f4936d);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f4938b);
        }
        if (obj == f4929i) {
            return null;
        }
        return obj;
    }

    /* renamed from: j */
    static Object m5184j(InterfaceFutureC8955a<?> interfaceFutureC8955a) {
        if (interfaceFutureC8955a instanceof AbstractC0796a) {
            Object obj = ((AbstractC0796a) interfaceFutureC8955a).f4930j;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            return cVar.f4935c ? cVar.f4936d != null ? new c(false, cVar.f4936d) : c.f4934b : obj;
        }
        boolean zIsCancelled = interfaceFutureC8955a.isCancelled();
        if ((!f4926f) && zIsCancelled) {
            return c.f4934b;
        }
        try {
            Object objM5185l = m5185l(interfaceFutureC8955a);
            return objM5185l == null ? f4929i : objM5185l;
        } catch (CancellationException e2) {
            if (zIsCancelled) {
                return new c(false, e2);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + interfaceFutureC8955a, e2));
        } catch (ExecutionException e3) {
            return new d(e3.getCause());
        } catch (Throwable th) {
            return new d(th);
        }
    }

    /* renamed from: l */
    private static <V> V m5185l(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    /* renamed from: o */
    private void m5186o() {
        i iVar;
        do {
            iVar = this.f4932l;
        } while (!f4928h.mo5198c(this, iVar, i.f4950a));
        while (iVar != null) {
            iVar.m5202b();
            iVar = iVar.f4952c;
        }
    }

    /* renamed from: p */
    private void m5187p(i iVar) {
        iVar.f4951b = null;
        while (true) {
            i iVar2 = this.f4932l;
            if (iVar2 == i.f4950a) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f4952c;
                if (iVar2.f4951b != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f4952c = iVar4;
                    if (iVar3.f4951b == null) {
                        break;
                    }
                } else if (!f4928h.mo5198c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    /* renamed from: t */
    private String m5188t(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    /* renamed from: b */
    protected void m5189b() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.f4930j;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        c cVar = f4926f ? new c(z, new CancellationException("Future.cancel() was called.")) : z ? c.f4933a : c.f4934b;
        boolean z2 = false;
        AbstractC0796a<V> abstractC0796a = this;
        while (true) {
            if (f4928h.mo5197b(abstractC0796a, obj, cVar)) {
                if (z) {
                    abstractC0796a.m5191m();
                }
                m5181f(abstractC0796a);
                if (!(obj instanceof g)) {
                    return true;
                }
                InterfaceFutureC8955a<? extends V> interfaceFutureC8955a = ((g) obj).f4949g;
                if (!(interfaceFutureC8955a instanceof AbstractC0796a)) {
                    interfaceFutureC8955a.cancel(z);
                    return true;
                }
                abstractC0796a = (AbstractC0796a) interfaceFutureC8955a;
                obj = abstractC0796a.f4930j;
                if (!(obj == null) && !(obj instanceof g)) {
                    return true;
                }
                z2 = true;
            } else {
                obj = abstractC0796a.f4930j;
                if (!(obj instanceof g)) {
                    return z2;
                }
            }
        }
    }

    @Override // p241e.p254e.p288c.p289a.p290a.InterfaceFutureC8955a
    /* renamed from: g */
    public final void mo5190g(Runnable runnable, Executor executor) {
        m5179d(runnable);
        m5179d(executor);
        e eVar = this.f4931k;
        if (eVar != e.f4939a) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f4942d = eVar;
                if (f4928h.mo5196a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f4931k;
                }
            } while (eVar != e.f4939a);
        }
        m5182h(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final V get(long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f4930j;
        if ((obj != null) && (!(obj instanceof g))) {
            return m5183i(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f4932l;
            if (iVar != i.f4950a) {
                i iVar2 = new i();
                do {
                    iVar2.m5201a(iVar);
                    if (f4928h.mo5198c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m5187p(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f4930j;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return m5183i(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m5187p(iVar2);
                    } else {
                        iVar = this.f4932l;
                    }
                } while (iVar != i.f4950a);
            }
            return m5183i(this.f4930j);
        }
        while (nanos > 0) {
            Object obj3 = this.f4930j;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return m5183i(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j3 = -nanos;
            long jConvert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String str3 = str2 + jConvert + " " + lowerCase;
                if (z) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f4930j instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof g)) & (this.f4930j != null);
    }

    /* renamed from: m */
    protected void m5191m() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: n */
    protected String m5192n() {
        Object obj = this.f4930j;
        if (obj instanceof g) {
            return "setFuture=[" + m5188t(((g) obj).f4949g) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* renamed from: q */
    protected boolean mo5193q(V v) {
        if (v == null) {
            v = (V) f4929i;
        }
        if (!f4928h.mo5197b(this, null, v)) {
            return false;
        }
        m5181f(this);
        return true;
    }

    /* renamed from: r */
    protected boolean mo5194r(Throwable th) {
        if (!f4928h.mo5197b(this, null, new d((Throwable) m5179d(th)))) {
            return false;
        }
        m5181f(this);
        return true;
    }

    /* renamed from: s */
    protected boolean mo5195s(InterfaceFutureC8955a<? extends V> interfaceFutureC8955a) {
        d dVar;
        m5179d(interfaceFutureC8955a);
        Object obj = this.f4930j;
        if (obj == null) {
            if (interfaceFutureC8955a.isDone()) {
                if (!f4928h.mo5197b(this, null, m5184j(interfaceFutureC8955a))) {
                    return false;
                }
                m5181f(this);
                return true;
            }
            g gVar = new g(this, interfaceFutureC8955a);
            if (f4928h.mo5197b(this, null, gVar)) {
                try {
                    interfaceFutureC8955a.mo5190g(gVar, EnumC0797b.INSTANCE);
                } catch (Throwable th) {
                    try {
                        dVar = new d(th);
                    } catch (Throwable unused) {
                        dVar = d.f4937a;
                    }
                    f4928h.mo5197b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.f4930j;
        }
        if (obj instanceof c) {
            interfaceFutureC8955a.cancel(((c) obj).f4935c);
        }
        return false;
    }

    public String toString() {
        String strM5192n;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m5177a(sb);
        } else {
            try {
                strM5192n = m5192n();
            } catch (RuntimeException e2) {
                strM5192n = "Exception thrown from implementation: " + e2.getClass();
            }
            if (strM5192n != null && !strM5192n.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strM5192n);
                sb.append("]");
            } else if (isDone()) {
                m5177a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f4930j;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return m5183i(obj2);
            }
            i iVar = this.f4932l;
            if (iVar != i.f4950a) {
                i iVar2 = new i();
                do {
                    iVar2.m5201a(iVar);
                    if (f4928h.mo5198c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f4930j;
                            } else {
                                m5187p(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return m5183i(obj);
                    }
                    iVar = this.f4932l;
                } while (iVar != i.f4950a);
            }
            return m5183i(this.f4930j);
        }
        throw new InterruptedException();
    }
}
