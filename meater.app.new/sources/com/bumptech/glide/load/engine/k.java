package com.bumptech.glide.load.engine;

import I6.a;
import com.bumptech.glide.load.engine.h;
import com.bumptech.glide.load.engine.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import m6.EnumC3966a;
import m6.InterfaceC3970e;
import o6.InterfaceC4139c;
import r1.InterfaceC4339f;
import r6.ExecutorServiceC4354a;

/* compiled from: EngineJob.java */
/* loaded from: classes2.dex */
class k<R> implements h.b<R>, a.f {

    /* renamed from: a0, reason: collision with root package name */
    private static final c f33198a0 = new c();

    /* renamed from: B, reason: collision with root package name */
    final e f33199B;

    /* renamed from: C, reason: collision with root package name */
    private final I6.c f33200C;

    /* renamed from: D, reason: collision with root package name */
    private final o.a f33201D;

    /* renamed from: E, reason: collision with root package name */
    private final InterfaceC4339f<k<?>> f33202E;

    /* renamed from: F, reason: collision with root package name */
    private final c f33203F;

    /* renamed from: G, reason: collision with root package name */
    private final l f33204G;

    /* renamed from: H, reason: collision with root package name */
    private final ExecutorServiceC4354a f33205H;

    /* renamed from: I, reason: collision with root package name */
    private final ExecutorServiceC4354a f33206I;

    /* renamed from: J, reason: collision with root package name */
    private final ExecutorServiceC4354a f33207J;

    /* renamed from: K, reason: collision with root package name */
    private final ExecutorServiceC4354a f33208K;

    /* renamed from: L, reason: collision with root package name */
    private final AtomicInteger f33209L;

    /* renamed from: M, reason: collision with root package name */
    private InterfaceC3970e f33210M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f33211N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f33212O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f33213P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f33214Q;

    /* renamed from: R, reason: collision with root package name */
    private InterfaceC4139c<?> f33215R;

    /* renamed from: S, reason: collision with root package name */
    EnumC3966a f33216S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f33217T;

    /* renamed from: U, reason: collision with root package name */
    GlideException f33218U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f33219V;

    /* renamed from: W, reason: collision with root package name */
    o<?> f33220W;

    /* renamed from: X, reason: collision with root package name */
    private h<R> f33221X;

    /* renamed from: Y, reason: collision with root package name */
    private volatile boolean f33222Y;

    /* renamed from: Z, reason: collision with root package name */
    private boolean f33223Z;

    /* compiled from: EngineJob.java */
    private class a implements Runnable {

        /* renamed from: B, reason: collision with root package name */
        private final D6.h f33224B;

        a(D6.h hVar) {
            this.f33224B = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f33224B.d()) {
                synchronized (k.this) {
                    try {
                        if (k.this.f33199B.f(this.f33224B)) {
                            k.this.e(this.f33224B);
                        }
                        k.this.h();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    /* compiled from: EngineJob.java */
    private class b implements Runnable {

        /* renamed from: B, reason: collision with root package name */
        private final D6.h f33226B;

        b(D6.h hVar) {
            this.f33226B = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f33226B.d()) {
                synchronized (k.this) {
                    try {
                        if (k.this.f33199B.f(this.f33226B)) {
                            k.this.f33220W.b();
                            k.this.f(this.f33226B);
                            k.this.r(this.f33226B);
                        }
                        k.this.h();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    /* compiled from: EngineJob.java */
    static class c {
        c() {
        }

        public <R> o<R> a(InterfaceC4139c<R> interfaceC4139c, boolean z10, InterfaceC3970e interfaceC3970e, o.a aVar) {
            return new o<>(interfaceC4139c, z10, true, interfaceC3970e, aVar);
        }
    }

    /* compiled from: EngineJob.java */
    static final class d {

        /* renamed from: a, reason: collision with root package name */
        final D6.h f33228a;

        /* renamed from: b, reason: collision with root package name */
        final Executor f33229b;

        d(D6.h hVar, Executor executor) {
            this.f33228a = hVar;
            this.f33229b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f33228a.equals(((d) obj).f33228a);
            }
            return false;
        }

        public int hashCode() {
            return this.f33228a.hashCode();
        }
    }

    /* compiled from: EngineJob.java */
    static final class e implements Iterable<d> {

        /* renamed from: B, reason: collision with root package name */
        private final List<d> f33230B;

        e() {
            this(new ArrayList(2));
        }

        private static d i(D6.h hVar) {
            return new d(hVar, H6.e.a());
        }

        void c(D6.h hVar, Executor executor) {
            this.f33230B.add(new d(hVar, executor));
        }

        void clear() {
            this.f33230B.clear();
        }

        boolean f(D6.h hVar) {
            return this.f33230B.contains(i(hVar));
        }

        e h() {
            return new e(new ArrayList(this.f33230B));
        }

        boolean isEmpty() {
            return this.f33230B.isEmpty();
        }

        @Override // java.lang.Iterable
        public Iterator<d> iterator() {
            return this.f33230B.iterator();
        }

        void j(D6.h hVar) {
            this.f33230B.remove(i(hVar));
        }

        int size() {
            return this.f33230B.size();
        }

        e(List<d> list) {
            this.f33230B = list;
        }
    }

    k(ExecutorServiceC4354a executorServiceC4354a, ExecutorServiceC4354a executorServiceC4354a2, ExecutorServiceC4354a executorServiceC4354a3, ExecutorServiceC4354a executorServiceC4354a4, l lVar, o.a aVar, InterfaceC4339f<k<?>> interfaceC4339f) {
        this(executorServiceC4354a, executorServiceC4354a2, executorServiceC4354a3, executorServiceC4354a4, lVar, aVar, interfaceC4339f, f33198a0);
    }

    private ExecutorServiceC4354a i() {
        return this.f33212O ? this.f33207J : this.f33213P ? this.f33208K : this.f33206I;
    }

    private boolean l() {
        return this.f33219V || this.f33217T || this.f33222Y;
    }

    private synchronized void q() {
        if (this.f33210M == null) {
            throw new IllegalArgumentException();
        }
        this.f33199B.clear();
        this.f33210M = null;
        this.f33220W = null;
        this.f33215R = null;
        this.f33219V = false;
        this.f33222Y = false;
        this.f33217T = false;
        this.f33223Z = false;
        this.f33221X.K(false);
        this.f33221X = null;
        this.f33218U = null;
        this.f33216S = null;
        this.f33202E.a(this);
    }

    @Override // com.bumptech.glide.load.engine.h.b
    public void a(GlideException glideException) {
        synchronized (this) {
            this.f33218U = glideException;
        }
        m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.load.engine.h.b
    public void b(InterfaceC4139c<R> interfaceC4139c, EnumC3966a enumC3966a, boolean z10) {
        synchronized (this) {
            this.f33215R = interfaceC4139c;
            this.f33216S = enumC3966a;
            this.f33223Z = z10;
        }
        n();
    }

    @Override // com.bumptech.glide.load.engine.h.b
    public void c(h<?> hVar) {
        i().execute(hVar);
    }

    synchronized void d(D6.h hVar, Executor executor) {
        try {
            this.f33200C.c();
            this.f33199B.c(hVar, executor);
            if (this.f33217T) {
                j(1);
                executor.execute(new b(hVar));
            } else if (this.f33219V) {
                j(1);
                executor.execute(new a(hVar));
            } else {
                H6.k.a(!this.f33222Y, "Cannot add callbacks to a cancelled EngineJob");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    void e(D6.h hVar) {
        try {
            hVar.a(this.f33218U);
        } catch (Throwable th) {
            throw new com.bumptech.glide.load.engine.b(th);
        }
    }

    void f(D6.h hVar) {
        try {
            hVar.b(this.f33220W, this.f33216S, this.f33223Z);
        } catch (Throwable th) {
            throw new com.bumptech.glide.load.engine.b(th);
        }
    }

    void g() {
        if (l()) {
            return;
        }
        this.f33222Y = true;
        this.f33221X.s();
        this.f33204G.d(this, this.f33210M);
    }

    void h() {
        o<?> oVar;
        synchronized (this) {
            try {
                this.f33200C.c();
                H6.k.a(l(), "Not yet complete!");
                int iDecrementAndGet = this.f33209L.decrementAndGet();
                H6.k.a(iDecrementAndGet >= 0, "Can't decrement below 0");
                if (iDecrementAndGet == 0) {
                    oVar = this.f33220W;
                    q();
                } else {
                    oVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (oVar != null) {
            oVar.g();
        }
    }

    synchronized void j(int i10) {
        o<?> oVar;
        H6.k.a(l(), "Not yet complete!");
        if (this.f33209L.getAndAdd(i10) == 0 && (oVar = this.f33220W) != null) {
            oVar.b();
        }
    }

    synchronized k<R> k(InterfaceC3970e interfaceC3970e, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f33210M = interfaceC3970e;
        this.f33211N = z10;
        this.f33212O = z11;
        this.f33213P = z12;
        this.f33214Q = z13;
        return this;
    }

    void m() {
        synchronized (this) {
            try {
                this.f33200C.c();
                if (this.f33222Y) {
                    q();
                    return;
                }
                if (this.f33199B.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (this.f33219V) {
                    throw new IllegalStateException("Already failed once");
                }
                this.f33219V = true;
                InterfaceC3970e interfaceC3970e = this.f33210M;
                e eVarH = this.f33199B.h();
                j(eVarH.size() + 1);
                this.f33204G.b(this, interfaceC3970e, null);
                Iterator<d> it = eVarH.iterator();
                while (it.hasNext()) {
                    d next = it.next();
                    next.f33229b.execute(new a(next.f33228a));
                }
                h();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void n() {
        synchronized (this) {
            try {
                this.f33200C.c();
                if (this.f33222Y) {
                    this.f33215R.c();
                    q();
                    return;
                }
                if (this.f33199B.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (this.f33217T) {
                    throw new IllegalStateException("Already have resource");
                }
                this.f33220W = this.f33203F.a(this.f33215R, this.f33211N, this.f33210M, this.f33201D);
                this.f33217T = true;
                e eVarH = this.f33199B.h();
                j(eVarH.size() + 1);
                this.f33204G.b(this, this.f33210M, this.f33220W);
                Iterator<d> it = eVarH.iterator();
                while (it.hasNext()) {
                    d next = it.next();
                    next.f33229b.execute(new b(next.f33228a));
                }
                h();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    boolean o() {
        return this.f33214Q;
    }

    @Override // I6.a.f
    public I6.c p() {
        return this.f33200C;
    }

    synchronized void r(D6.h hVar) {
        try {
            this.f33200C.c();
            this.f33199B.j(hVar);
            if (this.f33199B.isEmpty()) {
                g();
                if (this.f33217T || this.f33219V) {
                    if (this.f33209L.get() == 0) {
                        q();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void s(h<R> hVar) {
        try {
            this.f33221X = hVar;
            (hVar.R() ? this.f33205H : i()).execute(hVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    k(ExecutorServiceC4354a executorServiceC4354a, ExecutorServiceC4354a executorServiceC4354a2, ExecutorServiceC4354a executorServiceC4354a3, ExecutorServiceC4354a executorServiceC4354a4, l lVar, o.a aVar, InterfaceC4339f<k<?>> interfaceC4339f, c cVar) {
        this.f33199B = new e();
        this.f33200C = I6.c.a();
        this.f33209L = new AtomicInteger();
        this.f33205H = executorServiceC4354a;
        this.f33206I = executorServiceC4354a2;
        this.f33207J = executorServiceC4354a3;
        this.f33208K = executorServiceC4354a4;
        this.f33204G = lVar;
        this.f33201D = aVar;
        this.f33202E = interfaceC4339f;
        this.f33203F = cVar;
    }
}
