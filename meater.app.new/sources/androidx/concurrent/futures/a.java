package androidx.concurrent.futures;

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

/* compiled from: AbstractResolvableFuture.java */
/* loaded from: classes.dex */
public abstract class a<V> implements com.google.common.util.concurrent.f<V> {

    /* renamed from: E, reason: collision with root package name */
    static final boolean f23760E = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: F, reason: collision with root package name */
    private static final Logger f23761F = Logger.getLogger(a.class.getName());

    /* renamed from: G, reason: collision with root package name */
    static final b f23762G;

    /* renamed from: H, reason: collision with root package name */
    private static final Object f23763H;

    /* renamed from: B, reason: collision with root package name */
    volatile Object f23764B;

    /* renamed from: C, reason: collision with root package name */
    volatile e f23765C;

    /* renamed from: D, reason: collision with root package name */
    volatile i f23766D;

    /* compiled from: AbstractResolvableFuture.java */
    private static abstract class b {
        private b() {
        }

        abstract boolean a(a<?> aVar, e eVar, e eVar2);

        abstract boolean b(a<?> aVar, Object obj, Object obj2);

        abstract boolean c(a<?> aVar, i iVar, i iVar2);

        abstract void d(i iVar, i iVar2);

        abstract void e(i iVar, Thread thread);
    }

    /* compiled from: AbstractResolvableFuture.java */
    private static final class c {

        /* renamed from: c, reason: collision with root package name */
        static final c f23767c;

        /* renamed from: d, reason: collision with root package name */
        static final c f23768d;

        /* renamed from: a, reason: collision with root package name */
        final boolean f23769a;

        /* renamed from: b, reason: collision with root package name */
        final Throwable f23770b;

        static {
            if (a.f23760E) {
                f23768d = null;
                f23767c = null;
            } else {
                f23768d = new c(false, null);
                f23767c = new c(true, null);
            }
        }

        c(boolean z10, Throwable th) {
            this.f23769a = z10;
            this.f23770b = th;
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    private static final class d {

        /* renamed from: b, reason: collision with root package name */
        static final d f23771b = new d(new C0344a("Failure occurred while trying to finish a future."));

        /* renamed from: a, reason: collision with root package name */
        final Throwable f23772a;

        /* compiled from: AbstractResolvableFuture.java */
        /* renamed from: androidx.concurrent.futures.a$d$a, reason: collision with other inner class name */
        class C0344a extends Throwable {
            C0344a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f23772a = (Throwable) a.s(th);
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    private static final class e {

        /* renamed from: d, reason: collision with root package name */
        static final e f23773d = new e(null, null);

        /* renamed from: a, reason: collision with root package name */
        final Runnable f23774a;

        /* renamed from: b, reason: collision with root package name */
        final Executor f23775b;

        /* renamed from: c, reason: collision with root package name */
        e f23776c;

        e(Runnable runnable, Executor executor) {
            this.f23774a = runnable;
            this.f23775b = executor;
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    private static final class f extends b {

        /* renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, Thread> f23777a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, i> f23778b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, i> f23779c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, e> f23780d;

        /* renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, Object> f23781e;

        f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f23777a = atomicReferenceFieldUpdater;
            this.f23778b = atomicReferenceFieldUpdater2;
            this.f23779c = atomicReferenceFieldUpdater3;
            this.f23780d = atomicReferenceFieldUpdater4;
            this.f23781e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f23780d, aVar, eVar, eVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f23781e, aVar, obj, obj2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a<?> aVar, i iVar, i iVar2) {
            return androidx.concurrent.futures.b.a(this.f23779c, aVar, iVar, iVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void d(i iVar, i iVar2) {
            this.f23778b.lazySet(iVar, iVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void e(i iVar, Thread thread) {
            this.f23777a.lazySet(iVar, thread);
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    private static final class g<V> implements Runnable {

        /* renamed from: B, reason: collision with root package name */
        final a<V> f23782B;

        /* renamed from: C, reason: collision with root package name */
        final com.google.common.util.concurrent.f<? extends V> f23783C;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f23782B.f23764B != this) {
                return;
            }
            if (a.f23762G.b(this.f23782B, this, a.x(this.f23783C))) {
                a.u(this.f23782B);
            }
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    private static final class h extends b {
        h() {
            super();
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f23765C != eVar) {
                        return false;
                    }
                    aVar.f23765C = eVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                try {
                    if (aVar.f23764B != obj) {
                        return false;
                    }
                    aVar.f23764B = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a<?> aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f23766D != iVar) {
                        return false;
                    }
                    aVar.f23766D = iVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        void d(i iVar, i iVar2) {
            iVar.f23786b = iVar2;
        }

        @Override // androidx.concurrent.futures.a.b
        void e(i iVar, Thread thread) {
            iVar.f23785a = thread;
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    private static final class i {

        /* renamed from: c, reason: collision with root package name */
        static final i f23784c = new i(false);

        /* renamed from: a, reason: collision with root package name */
        volatile Thread f23785a;

        /* renamed from: b, reason: collision with root package name */
        volatile i f23786b;

        i(boolean z10) {
        }

        void a(i iVar) {
            a.f23762G.d(this, iVar);
        }

        void b() {
            Thread thread = this.f23785a;
            if (thread != null) {
                this.f23785a = null;
                LockSupport.unpark(thread);
            }
        }

        i() {
            a.f23762G.e(this, Thread.currentThread());
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, i.class, "D"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "C"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "B"));
            th = null;
        } catch (Throwable th) {
            th = th;
            hVar = new h();
        }
        f23762G = hVar;
        if (th != null) {
            f23761F.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f23763H = new Object();
    }

    protected a() {
    }

    private void B() {
        i iVar;
        do {
            iVar = this.f23766D;
        } while (!f23762G.c(this, iVar, i.f23784c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f23786b;
        }
    }

    private void C(i iVar) {
        iVar.f23785a = null;
        while (true) {
            i iVar2 = this.f23766D;
            if (iVar2 == i.f23784c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f23786b;
                if (iVar2.f23785a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f23786b = iVar4;
                    if (iVar3.f23785a == null) {
                        break;
                    }
                } else if (!f23762G.c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    private String F(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    private void j(StringBuilder sb2) {
        try {
            Object objY = y(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(F(objY));
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e10) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e10.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e11) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e11.getCause());
            sb2.append("]");
        }
    }

    private static CancellationException p(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    static <T> T s(T t10) {
        t10.getClass();
        return t10;
    }

    private e t(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f23765C;
        } while (!f23762G.a(this, eVar2, e.f23773d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f23776c;
            eVar4.f23776c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    static void u(a<?> aVar) {
        e eVar = null;
        while (true) {
            aVar.B();
            aVar.n();
            e eVarT = aVar.t(eVar);
            while (eVarT != null) {
                eVar = eVarT.f23776c;
                Runnable runnable = eVarT.f23774a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    aVar = gVar.f23782B;
                    if (aVar.f23764B == gVar) {
                        if (f23762G.b(aVar, gVar, x(gVar.f23783C))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    v(runnable, eVarT.f23775b);
                }
                eVarT = eVar;
            }
            return;
        }
    }

    private static void v(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f23761F.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V w(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw p("Task was cancelled.", ((c) obj).f23770b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f23772a);
        }
        if (obj == f23763H) {
            return null;
        }
        return obj;
    }

    static Object x(com.google.common.util.concurrent.f<?> fVar) {
        if (fVar instanceof a) {
            Object obj = ((a) fVar).f23764B;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            return cVar.f23769a ? cVar.f23770b != null ? new c(false, cVar.f23770b) : c.f23768d : obj;
        }
        boolean zIsCancelled = fVar.isCancelled();
        if ((!f23760E) && zIsCancelled) {
            return c.f23768d;
        }
        try {
            Object objY = y(fVar);
            return objY == null ? f23763H : objY;
        } catch (CancellationException e10) {
            if (zIsCancelled) {
                return new c(false, e10);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + fVar, e10));
        } catch (ExecutionException e11) {
            return new d(e11.getCause());
        } catch (Throwable th) {
            return new d(th);
        }
    }

    static <V> V y(Future<V> future) {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                v10 = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String A() {
        Object obj = this.f23764B;
        if (obj instanceof g) {
            return "setFuture=[" + F(((g) obj).f23783C) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    protected boolean D(V v10) {
        if (v10 == null) {
            v10 = (V) f23763H;
        }
        if (!f23762G.b(this, null, v10)) {
            return false;
        }
        u(this);
        return true;
    }

    protected boolean E(Throwable th) {
        if (!f23762G.b(this, null, new d((Throwable) s(th)))) {
            return false;
        }
        u(this);
        return true;
    }

    protected final boolean G() {
        Object obj = this.f23764B;
        return (obj instanceof c) && ((c) obj).f23769a;
    }

    @Override // com.google.common.util.concurrent.f
    public final void c(Runnable runnable, Executor executor) {
        s(runnable);
        s(executor);
        e eVar = this.f23765C;
        if (eVar != e.f23773d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f23776c = eVar;
                if (f23762G.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f23765C;
                }
            } while (eVar != e.f23773d);
        }
        v(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        Object obj = this.f23764B;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        c cVar = f23760E ? new c(z10, new CancellationException("Future.cancel() was called.")) : z10 ? c.f23767c : c.f23768d;
        a<V> aVar = this;
        boolean z11 = false;
        while (true) {
            if (f23762G.b(aVar, obj, cVar)) {
                if (z10) {
                    aVar.z();
                }
                u(aVar);
                if (!(obj instanceof g)) {
                    return true;
                }
                com.google.common.util.concurrent.f<? extends V> fVar = ((g) obj).f23783C;
                if (!(fVar instanceof a)) {
                    fVar.cancel(z10);
                    return true;
                }
                aVar = (a) fVar;
                obj = aVar.f23764B;
                if (!(obj == null) && !(obj instanceof g)) {
                    return true;
                }
                z11 = true;
            } else {
                obj = aVar.f23764B;
                if (!(obj instanceof g)) {
                    return z11;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final V get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f23764B;
        if ((obj != null) && (!(obj instanceof g))) {
            return w(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f23766D;
            if (iVar != i.f23784c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f23762G.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                C(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f23764B;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return w(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        C(iVar2);
                    } else {
                        iVar = this.f23766D;
                    }
                } while (iVar != i.f23784c);
            }
            return w(this.f23764B);
        }
        while (nanos > 0) {
            Object obj3 = this.f23764B;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return w(obj3);
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
        String str = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j11 = -nanos;
            long jConvert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(jConvert);
            boolean z10 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String str3 = str2 + jConvert + " " + lowerCase;
                if (z10) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z10) {
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
        return this.f23764B instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof g)) & (this.f23764B != null);
    }

    public String toString() {
        String strA;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            j(sb2);
        } else {
            try {
                strA = A();
            } catch (RuntimeException e10) {
                strA = "Exception thrown from implementation: " + e10.getClass();
            }
            if (strA != null && !strA.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(strA);
                sb2.append("]");
            } else if (isDone()) {
                j(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    protected void n() {
    }

    protected void z() {
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f23764B;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return w(obj2);
            }
            i iVar = this.f23766D;
            if (iVar != i.f23784c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f23762G.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f23764B;
                            } else {
                                C(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return w(obj);
                    }
                    iVar = this.f23766D;
                } while (iVar != i.f23784c);
            }
            return w(this.f23764B);
        }
        throw new InterruptedException();
    }
}
