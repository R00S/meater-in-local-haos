package p024c.p042f.p043a;

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

/* compiled from: AbstractResolvableFuture.java */
/* renamed from: c.f.a.a */
/* loaded from: classes.dex */
public abstract class AbstractC0875a<V> implements InterfaceFutureC8955a<V> {

    /* renamed from: f */
    static final boolean f5764f = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", AdultContentAnalytics.UNLOCK));

    /* renamed from: g */
    private static final Logger f5765g = Logger.getLogger(AbstractC0875a.class.getName());

    /* renamed from: h */
    static final b f5766h;

    /* renamed from: i */
    private static final Object f5767i;

    /* renamed from: j */
    volatile Object f5768j;

    /* renamed from: k */
    volatile e f5769k;

    /* renamed from: l */
    volatile i f5770l;

    /* compiled from: AbstractResolvableFuture.java */
    /* renamed from: c.f.a.a$b */
    private static abstract class b {
        private b() {
        }

        /* renamed from: a */
        abstract boolean mo5507a(AbstractC0875a<?> abstractC0875a, e eVar, e eVar2);

        /* renamed from: b */
        abstract boolean mo5508b(AbstractC0875a<?> abstractC0875a, Object obj, Object obj2);

        /* renamed from: c */
        abstract boolean mo5509c(AbstractC0875a<?> abstractC0875a, i iVar, i iVar2);

        /* renamed from: d */
        abstract void mo5510d(i iVar, i iVar2);

        /* renamed from: e */
        abstract void mo5511e(i iVar, Thread thread);
    }

    /* compiled from: AbstractResolvableFuture.java */
    /* renamed from: c.f.a.a$c */
    private static final class c {

        /* renamed from: a */
        static final c f5771a;

        /* renamed from: b */
        static final c f5772b;

        /* renamed from: c */
        final boolean f5773c;

        /* renamed from: d */
        final Throwable f5774d;

        static {
            if (AbstractC0875a.f5764f) {
                f5772b = null;
                f5771a = null;
            } else {
                f5772b = new c(false, null);
                f5771a = new c(true, null);
            }
        }

        c(boolean z, Throwable th) {
            this.f5773c = z;
            this.f5774d = th;
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    /* renamed from: c.f.a.a$d */
    private static final class d {

        /* renamed from: a */
        static final d f5775a = new d(new a("Failure occurred while trying to finish a future."));

        /* renamed from: b */
        final Throwable f5776b;

        /* compiled from: AbstractResolvableFuture.java */
        /* renamed from: c.f.a.a$d$a */
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
            this.f5776b = (Throwable) AbstractC0875a.m5499x(th);
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    /* renamed from: c.f.a.a$e */
    private static final class e {

        /* renamed from: a */
        static final e f5777a = new e(null, null);

        /* renamed from: b */
        final Runnable f5778b;

        /* renamed from: c */
        final Executor f5779c;

        /* renamed from: d */
        e f5780d;

        e(Runnable runnable, Executor executor) {
            this.f5778b = runnable;
            this.f5779c = executor;
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    /* renamed from: c.f.a.a$f */
    private static final class f extends b {

        /* renamed from: a */
        final AtomicReferenceFieldUpdater<i, Thread> f5781a;

        /* renamed from: b */
        final AtomicReferenceFieldUpdater<i, i> f5782b;

        /* renamed from: c */
        final AtomicReferenceFieldUpdater<AbstractC0875a, i> f5783c;

        /* renamed from: d */
        final AtomicReferenceFieldUpdater<AbstractC0875a, e> f5784d;

        /* renamed from: e */
        final AtomicReferenceFieldUpdater<AbstractC0875a, Object> f5785e;

        f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractC0875a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractC0875a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractC0875a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f5781a = atomicReferenceFieldUpdater;
            this.f5782b = atomicReferenceFieldUpdater2;
            this.f5783c = atomicReferenceFieldUpdater3;
            this.f5784d = atomicReferenceFieldUpdater4;
            this.f5785e = atomicReferenceFieldUpdater5;
        }

        @Override // p024c.p042f.p043a.AbstractC0875a.b
        /* renamed from: a */
        boolean mo5507a(AbstractC0875a<?> abstractC0875a, e eVar, e eVar2) {
            return this.f5784d.compareAndSet(abstractC0875a, eVar, eVar2);
        }

        @Override // p024c.p042f.p043a.AbstractC0875a.b
        /* renamed from: b */
        boolean mo5508b(AbstractC0875a<?> abstractC0875a, Object obj, Object obj2) {
            return this.f5785e.compareAndSet(abstractC0875a, obj, obj2);
        }

        @Override // p024c.p042f.p043a.AbstractC0875a.b
        /* renamed from: c */
        boolean mo5509c(AbstractC0875a<?> abstractC0875a, i iVar, i iVar2) {
            return this.f5783c.compareAndSet(abstractC0875a, iVar, iVar2);
        }

        @Override // p024c.p042f.p043a.AbstractC0875a.b
        /* renamed from: d */
        void mo5510d(i iVar, i iVar2) {
            this.f5782b.lazySet(iVar, iVar2);
        }

        @Override // p024c.p042f.p043a.AbstractC0875a.b
        /* renamed from: e */
        void mo5511e(i iVar, Thread thread) {
            this.f5781a.lazySet(iVar, thread);
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    /* renamed from: c.f.a.a$g */
    private static final class g<V> implements Runnable {

        /* renamed from: f */
        final AbstractC0875a<V> f5786f;

        /* renamed from: g */
        final InterfaceFutureC8955a<? extends V> f5787g;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f5786f.f5768j != this) {
                return;
            }
            if (AbstractC0875a.f5766h.mo5508b(this.f5786f, this, AbstractC0875a.m5492F(this.f5787g))) {
                AbstractC0875a.m5489A(this.f5786f);
            }
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    /* renamed from: c.f.a.a$h */
    private static final class h extends b {
        h() {
            super();
        }

        @Override // p024c.p042f.p043a.AbstractC0875a.b
        /* renamed from: a */
        boolean mo5507a(AbstractC0875a<?> abstractC0875a, e eVar, e eVar2) {
            synchronized (abstractC0875a) {
                if (abstractC0875a.f5769k != eVar) {
                    return false;
                }
                abstractC0875a.f5769k = eVar2;
                return true;
            }
        }

        @Override // p024c.p042f.p043a.AbstractC0875a.b
        /* renamed from: b */
        boolean mo5508b(AbstractC0875a<?> abstractC0875a, Object obj, Object obj2) {
            synchronized (abstractC0875a) {
                if (abstractC0875a.f5768j != obj) {
                    return false;
                }
                abstractC0875a.f5768j = obj2;
                return true;
            }
        }

        @Override // p024c.p042f.p043a.AbstractC0875a.b
        /* renamed from: c */
        boolean mo5509c(AbstractC0875a<?> abstractC0875a, i iVar, i iVar2) {
            synchronized (abstractC0875a) {
                if (abstractC0875a.f5770l != iVar) {
                    return false;
                }
                abstractC0875a.f5770l = iVar2;
                return true;
            }
        }

        @Override // p024c.p042f.p043a.AbstractC0875a.b
        /* renamed from: d */
        void mo5510d(i iVar, i iVar2) {
            iVar.f5790c = iVar2;
        }

        @Override // p024c.p042f.p043a.AbstractC0875a.b
        /* renamed from: e */
        void mo5511e(i iVar, Thread thread) {
            iVar.f5789b = thread;
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    /* renamed from: c.f.a.a$i */
    private static final class i {

        /* renamed from: a */
        static final i f5788a = new i(false);

        /* renamed from: b */
        volatile Thread f5789b;

        /* renamed from: c */
        volatile i f5790c;

        i(boolean z) {
        }

        /* renamed from: a */
        void m5512a(i iVar) {
            AbstractC0875a.f5766h.mo5510d(this, iVar);
        }

        /* renamed from: b */
        void m5513b() {
            Thread thread = this.f5789b;
            if (thread != null) {
                this.f5789b = null;
                LockSupport.unpark(thread);
            }
        }

        i() {
            AbstractC0875a.f5766h.mo5511e(this, Thread.currentThread());
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "b"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0875a.class, i.class, "l"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0875a.class, e.class, "k"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0875a.class, Object.class, "j"));
            th = null;
        } catch (Throwable th) {
            th = th;
            hVar = new h();
        }
        f5766h = hVar;
        if (th != null) {
            f5765g.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f5767i = new Object();
    }

    protected AbstractC0875a() {
    }

    /* renamed from: A */
    static void m5489A(AbstractC0875a<?> abstractC0875a) {
        e eVar = null;
        while (true) {
            abstractC0875a.m5494J();
            abstractC0875a.mo5506u();
            e eVarM5500y = abstractC0875a.m5500y(eVar);
            while (eVarM5500y != null) {
                eVar = eVarM5500y.f5780d;
                Runnable runnable = eVarM5500y.f5778b;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    abstractC0875a = gVar.f5786f;
                    if (abstractC0875a.f5768j == gVar) {
                        if (f5766h.mo5508b(abstractC0875a, gVar, m5492F(gVar.f5787g))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    m5490D(runnable, eVarM5500y.f5779c);
                }
                eVarM5500y = eVar;
            }
            return;
        }
    }

    /* renamed from: D */
    private static void m5490D(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            f5765g.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: E */
    private V m5491E(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw m5498v("Task was cancelled.", ((c) obj).f5774d);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f5776b);
        }
        if (obj == f5767i) {
            return null;
        }
        return obj;
    }

    /* renamed from: F */
    static Object m5492F(InterfaceFutureC8955a<?> interfaceFutureC8955a) {
        if (interfaceFutureC8955a instanceof AbstractC0875a) {
            Object obj = ((AbstractC0875a) interfaceFutureC8955a).f5768j;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            return cVar.f5773c ? cVar.f5774d != null ? new c(false, cVar.f5774d) : c.f5772b : obj;
        }
        boolean zIsCancelled = interfaceFutureC8955a.isCancelled();
        if ((!f5764f) && zIsCancelled) {
            return c.f5772b;
        }
        try {
            Object objM5493G = m5493G(interfaceFutureC8955a);
            return objM5493G == null ? f5767i : objM5493G;
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

    /* renamed from: G */
    static <V> V m5493G(Future<V> future) throws ExecutionException {
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

    /* renamed from: J */
    private void m5494J() {
        i iVar;
        do {
            iVar = this.f5770l;
        } while (!f5766h.mo5509c(this, iVar, i.f5788a));
        while (iVar != null) {
            iVar.m5513b();
            iVar = iVar.f5790c;
        }
    }

    /* renamed from: K */
    private void m5495K(i iVar) {
        iVar.f5789b = null;
        while (true) {
            i iVar2 = this.f5770l;
            if (iVar2 == i.f5788a) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f5790c;
                if (iVar2.f5789b != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f5790c = iVar4;
                    if (iVar3.f5789b == null) {
                        break;
                    }
                } else if (!f5766h.mo5509c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    /* renamed from: N */
    private String m5496N(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    /* renamed from: q */
    private void m5497q(StringBuilder sb) {
        try {
            Object objM5493G = m5493G(this);
            sb.append("SUCCESS, result=[");
            sb.append(m5496N(objM5493G));
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

    /* renamed from: v */
    private static CancellationException m5498v(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* renamed from: x */
    static <T> T m5499x(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: y */
    private e m5500y(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f5769k;
        } while (!f5766h.mo5507a(this, eVar2, e.f5777a));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f5780d;
            eVar4.f5780d = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    /* renamed from: H */
    protected void m5501H() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: I */
    protected String m5502I() {
        Object obj = this.f5768j;
        if (obj instanceof g) {
            return "setFuture=[" + m5496N(((g) obj).f5787g) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* renamed from: L */
    protected boolean m5503L(V v) {
        if (v == null) {
            v = (V) f5767i;
        }
        if (!f5766h.mo5508b(this, null, v)) {
            return false;
        }
        m5489A(this);
        return true;
    }

    /* renamed from: M */
    protected boolean m5504M(Throwable th) {
        if (!f5766h.mo5508b(this, null, new d((Throwable) m5499x(th)))) {
            return false;
        }
        m5489A(this);
        return true;
    }

    /* renamed from: O */
    protected final boolean m5505O() {
        Object obj = this.f5768j;
        return (obj instanceof c) && ((c) obj).f5773c;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.f5768j;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        c cVar = f5764f ? new c(z, new CancellationException("Future.cancel() was called.")) : z ? c.f5771a : c.f5772b;
        boolean z2 = false;
        AbstractC0875a<V> abstractC0875a = this;
        while (true) {
            if (f5766h.mo5508b(abstractC0875a, obj, cVar)) {
                if (z) {
                    abstractC0875a.m5501H();
                }
                m5489A(abstractC0875a);
                if (!(obj instanceof g)) {
                    return true;
                }
                InterfaceFutureC8955a<? extends V> interfaceFutureC8955a = ((g) obj).f5787g;
                if (!(interfaceFutureC8955a instanceof AbstractC0875a)) {
                    interfaceFutureC8955a.cancel(z);
                    return true;
                }
                abstractC0875a = (AbstractC0875a) interfaceFutureC8955a;
                obj = abstractC0875a.f5768j;
                if (!(obj == null) && !(obj instanceof g)) {
                    return true;
                }
                z2 = true;
            } else {
                obj = abstractC0875a.f5768j;
                if (!(obj instanceof g)) {
                    return z2;
                }
            }
        }
    }

    @Override // p241e.p254e.p288c.p289a.p290a.InterfaceFutureC8955a
    /* renamed from: g */
    public final void mo5190g(Runnable runnable, Executor executor) {
        m5499x(runnable);
        m5499x(executor);
        e eVar = this.f5769k;
        if (eVar != e.f5777a) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f5780d = eVar;
                if (f5766h.mo5507a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f5769k;
                }
            } while (eVar != e.f5777a);
        }
        m5490D(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final V get(long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f5768j;
        if ((obj != null) && (!(obj instanceof g))) {
            return m5491E(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f5770l;
            if (iVar != i.f5788a) {
                i iVar2 = new i();
                do {
                    iVar2.m5512a(iVar);
                    if (f5766h.mo5509c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m5495K(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f5768j;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return m5491E(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m5495K(iVar2);
                    } else {
                        iVar = this.f5770l;
                    }
                } while (iVar != i.f5788a);
            }
            return m5491E(this.f5768j);
        }
        while (nanos > 0) {
            Object obj3 = this.f5768j;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return m5491E(obj3);
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
        return this.f5768j instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof g)) & (this.f5768j != null);
    }

    public String toString() {
        String strM5502I;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m5497q(sb);
        } else {
            try {
                strM5502I = m5502I();
            } catch (RuntimeException e2) {
                strM5502I = "Exception thrown from implementation: " + e2.getClass();
            }
            if (strM5502I != null && !strM5502I.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strM5502I);
                sb.append("]");
            } else if (isDone()) {
                m5497q(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: u */
    protected void mo5506u() {
    }

    @Override // java.util.concurrent.Future
    public final V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f5768j;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return m5491E(obj2);
            }
            i iVar = this.f5770l;
            if (iVar != i.f5788a) {
                i iVar2 = new i();
                do {
                    iVar2.m5512a(iVar);
                    if (f5766h.mo5509c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f5768j;
                            } else {
                                m5495K(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return m5491E(obj);
                    }
                    iVar = this.f5770l;
                } while (iVar != i.f5788a);
            }
            return m5491E(this.f5768j);
        }
        throw new InterruptedException();
    }
}
