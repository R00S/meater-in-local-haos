package com.bumptech.glide.load.engine;

import I6.a;
import android.util.Log;
import com.bumptech.glide.load.engine.h;
import com.bumptech.glide.load.engine.o;
import java.util.Map;
import java.util.concurrent.Executor;
import m6.C3972g;
import m6.EnumC3966a;
import m6.InterfaceC3970e;
import m6.InterfaceC3976k;
import o6.AbstractC4137a;
import o6.InterfaceC4139c;
import q6.InterfaceC4316a;
import q6.h;
import r1.InterfaceC4339f;
import r6.ExecutorServiceC4354a;

/* compiled from: Engine.java */
/* loaded from: classes2.dex */
public class j implements l, h.a, o.a {

    /* renamed from: i, reason: collision with root package name */
    private static final boolean f33172i = Log.isLoggable("Engine", 2);

    /* renamed from: a, reason: collision with root package name */
    private final p f33173a;

    /* renamed from: b, reason: collision with root package name */
    private final n f33174b;

    /* renamed from: c, reason: collision with root package name */
    private final q6.h f33175c;

    /* renamed from: d, reason: collision with root package name */
    private final b f33176d;

    /* renamed from: e, reason: collision with root package name */
    private final u f33177e;

    /* renamed from: f, reason: collision with root package name */
    private final c f33178f;

    /* renamed from: g, reason: collision with root package name */
    private final a f33179g;

    /* renamed from: h, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.a f33180h;

    /* compiled from: Engine.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        final h.e f33181a;

        /* renamed from: b, reason: collision with root package name */
        final InterfaceC4339f<h<?>> f33182b = I6.a.d(150, new C0457a());

        /* renamed from: c, reason: collision with root package name */
        private int f33183c;

        /* compiled from: Engine.java */
        /* renamed from: com.bumptech.glide.load.engine.j$a$a, reason: collision with other inner class name */
        class C0457a implements a.d<h<?>> {
            C0457a() {
            }

            @Override // I6.a.d
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public h<?> a() {
                a aVar = a.this;
                return new h<>(aVar.f33181a, aVar.f33182b);
            }
        }

        a(h.e eVar) {
            this.f33181a = eVar;
        }

        <R> h<R> a(com.bumptech.glide.d dVar, Object obj, m mVar, InterfaceC3970e interfaceC3970e, int i10, int i11, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar, AbstractC4137a abstractC4137a, Map<Class<?>, InterfaceC3976k<?>> map, boolean z10, boolean z11, boolean z12, C3972g c3972g, h.b<R> bVar) {
            h hVar = (h) H6.k.d(this.f33182b.b());
            int i12 = this.f33183c;
            this.f33183c = i12 + 1;
            return hVar.B(dVar, obj, mVar, interfaceC3970e, i10, i11, cls, cls2, gVar, abstractC4137a, map, z10, z11, z12, c3972g, bVar, i12);
        }
    }

    /* compiled from: Engine.java */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        final ExecutorServiceC4354a f33185a;

        /* renamed from: b, reason: collision with root package name */
        final ExecutorServiceC4354a f33186b;

        /* renamed from: c, reason: collision with root package name */
        final ExecutorServiceC4354a f33187c;

        /* renamed from: d, reason: collision with root package name */
        final ExecutorServiceC4354a f33188d;

        /* renamed from: e, reason: collision with root package name */
        final l f33189e;

        /* renamed from: f, reason: collision with root package name */
        final o.a f33190f;

        /* renamed from: g, reason: collision with root package name */
        final InterfaceC4339f<k<?>> f33191g = I6.a.d(150, new a());

        /* compiled from: Engine.java */
        class a implements a.d<k<?>> {
            a() {
            }

            @Override // I6.a.d
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public k<?> a() {
                b bVar = b.this;
                return new k<>(bVar.f33185a, bVar.f33186b, bVar.f33187c, bVar.f33188d, bVar.f33189e, bVar.f33190f, bVar.f33191g);
            }
        }

        b(ExecutorServiceC4354a executorServiceC4354a, ExecutorServiceC4354a executorServiceC4354a2, ExecutorServiceC4354a executorServiceC4354a3, ExecutorServiceC4354a executorServiceC4354a4, l lVar, o.a aVar) {
            this.f33185a = executorServiceC4354a;
            this.f33186b = executorServiceC4354a2;
            this.f33187c = executorServiceC4354a3;
            this.f33188d = executorServiceC4354a4;
            this.f33189e = lVar;
            this.f33190f = aVar;
        }

        <R> k<R> a(InterfaceC3970e interfaceC3970e, boolean z10, boolean z11, boolean z12, boolean z13) {
            return ((k) H6.k.d(this.f33191g.b())).k(interfaceC3970e, z10, z11, z12, z13);
        }
    }

    /* compiled from: Engine.java */
    private static class c implements h.e {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC4316a.InterfaceC0669a f33193a;

        /* renamed from: b, reason: collision with root package name */
        private volatile InterfaceC4316a f33194b;

        c(InterfaceC4316a.InterfaceC0669a interfaceC0669a) {
            this.f33193a = interfaceC0669a;
        }

        @Override // com.bumptech.glide.load.engine.h.e
        public InterfaceC4316a a() {
            if (this.f33194b == null) {
                synchronized (this) {
                    try {
                        if (this.f33194b == null) {
                            this.f33194b = this.f33193a.e();
                        }
                        if (this.f33194b == null) {
                            this.f33194b = new q6.b();
                        }
                    } finally {
                    }
                }
            }
            return this.f33194b;
        }
    }

    /* compiled from: Engine.java */
    public class d {

        /* renamed from: a, reason: collision with root package name */
        private final k<?> f33195a;

        /* renamed from: b, reason: collision with root package name */
        private final D6.h f33196b;

        d(D6.h hVar, k<?> kVar) {
            this.f33196b = hVar;
            this.f33195a = kVar;
        }

        public void a() {
            synchronized (j.this) {
                this.f33195a.r(this.f33196b);
            }
        }
    }

    public j(q6.h hVar, InterfaceC4316a.InterfaceC0669a interfaceC0669a, ExecutorServiceC4354a executorServiceC4354a, ExecutorServiceC4354a executorServiceC4354a2, ExecutorServiceC4354a executorServiceC4354a3, ExecutorServiceC4354a executorServiceC4354a4, boolean z10) {
        this(hVar, interfaceC0669a, executorServiceC4354a, executorServiceC4354a2, executorServiceC4354a3, executorServiceC4354a4, null, null, null, null, null, null, z10);
    }

    private o<?> e(InterfaceC3970e interfaceC3970e) {
        InterfaceC4139c<?> interfaceC4139cD = this.f33175c.d(interfaceC3970e);
        if (interfaceC4139cD == null) {
            return null;
        }
        return interfaceC4139cD instanceof o ? (o) interfaceC4139cD : new o<>(interfaceC4139cD, true, true, interfaceC3970e, this);
    }

    private o<?> g(InterfaceC3970e interfaceC3970e) {
        o<?> oVarE = this.f33180h.e(interfaceC3970e);
        if (oVarE != null) {
            oVarE.b();
        }
        return oVarE;
    }

    private o<?> h(InterfaceC3970e interfaceC3970e) {
        o<?> oVarE = e(interfaceC3970e);
        if (oVarE != null) {
            oVarE.b();
            this.f33180h.a(interfaceC3970e, oVarE);
        }
        return oVarE;
    }

    private o<?> i(m mVar, boolean z10, long j10) {
        if (!z10) {
            return null;
        }
        o<?> oVarG = g(mVar);
        if (oVarG != null) {
            if (f33172i) {
                j("Loaded resource from active resources", j10, mVar);
            }
            return oVarG;
        }
        o<?> oVarH = h(mVar);
        if (oVarH == null) {
            return null;
        }
        if (f33172i) {
            j("Loaded resource from cache", j10, mVar);
        }
        return oVarH;
    }

    private static void j(String str, long j10, InterfaceC3970e interfaceC3970e) {
        Log.v("Engine", str + " in " + H6.g.a(j10) + "ms, key: " + interfaceC3970e);
    }

    private <R> d l(com.bumptech.glide.d dVar, Object obj, InterfaceC3970e interfaceC3970e, int i10, int i11, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar, AbstractC4137a abstractC4137a, Map<Class<?>, InterfaceC3976k<?>> map, boolean z10, boolean z11, C3972g c3972g, boolean z12, boolean z13, boolean z14, boolean z15, D6.h hVar, Executor executor, m mVar, long j10) {
        k<?> kVarA = this.f33173a.a(mVar, z15);
        if (kVarA != null) {
            kVarA.d(hVar, executor);
            if (f33172i) {
                j("Added to existing load", j10, mVar);
            }
            return new d(hVar, kVarA);
        }
        k<R> kVarA2 = this.f33176d.a(mVar, z12, z13, z14, z15);
        h<R> hVarA = this.f33179g.a(dVar, obj, mVar, interfaceC3970e, i10, i11, cls, cls2, gVar, abstractC4137a, map, z10, z11, z15, c3972g, kVarA2);
        this.f33173a.c(mVar, kVarA2);
        kVarA2.d(hVar, executor);
        kVarA2.s(hVarA);
        if (f33172i) {
            j("Started new load", j10, mVar);
        }
        return new d(hVar, kVarA2);
    }

    @Override // q6.h.a
    public void a(InterfaceC4139c<?> interfaceC4139c) {
        this.f33177e.a(interfaceC4139c, true);
    }

    @Override // com.bumptech.glide.load.engine.l
    public synchronized void b(k<?> kVar, InterfaceC3970e interfaceC3970e, o<?> oVar) {
        if (oVar != null) {
            try {
                if (oVar.f()) {
                    this.f33180h.a(interfaceC3970e, oVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f33173a.d(interfaceC3970e, kVar);
    }

    @Override // com.bumptech.glide.load.engine.o.a
    public void c(InterfaceC3970e interfaceC3970e, o<?> oVar) {
        this.f33180h.d(interfaceC3970e);
        if (oVar.f()) {
            this.f33175c.c(interfaceC3970e, oVar);
        } else {
            this.f33177e.a(oVar, false);
        }
    }

    @Override // com.bumptech.glide.load.engine.l
    public synchronized void d(k<?> kVar, InterfaceC3970e interfaceC3970e) {
        this.f33173a.d(interfaceC3970e, kVar);
    }

    public <R> d f(com.bumptech.glide.d dVar, Object obj, InterfaceC3970e interfaceC3970e, int i10, int i11, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar, AbstractC4137a abstractC4137a, Map<Class<?>, InterfaceC3976k<?>> map, boolean z10, boolean z11, C3972g c3972g, boolean z12, boolean z13, boolean z14, boolean z15, D6.h hVar, Executor executor) {
        long jB = f33172i ? H6.g.b() : 0L;
        m mVarA = this.f33174b.a(obj, interfaceC3970e, i10, i11, map, cls, cls2, c3972g);
        synchronized (this) {
            try {
                o<?> oVarI = i(mVarA, z12, jB);
                if (oVarI == null) {
                    return l(dVar, obj, interfaceC3970e, i10, i11, cls, cls2, gVar, abstractC4137a, map, z10, z11, c3972g, z12, z13, z14, z15, hVar, executor, mVarA, jB);
                }
                hVar.b(oVarI, EnumC3966a.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void k(InterfaceC4139c<?> interfaceC4139c) {
        if (!(interfaceC4139c instanceof o)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((o) interfaceC4139c).g();
    }

    j(q6.h hVar, InterfaceC4316a.InterfaceC0669a interfaceC0669a, ExecutorServiceC4354a executorServiceC4354a, ExecutorServiceC4354a executorServiceC4354a2, ExecutorServiceC4354a executorServiceC4354a3, ExecutorServiceC4354a executorServiceC4354a4, p pVar, n nVar, com.bumptech.glide.load.engine.a aVar, b bVar, a aVar2, u uVar, boolean z10) {
        this.f33175c = hVar;
        c cVar = new c(interfaceC0669a);
        this.f33178f = cVar;
        com.bumptech.glide.load.engine.a aVar3 = aVar == null ? new com.bumptech.glide.load.engine.a(z10) : aVar;
        this.f33180h = aVar3;
        aVar3.f(this);
        this.f33174b = nVar == null ? new n() : nVar;
        this.f33173a = pVar == null ? new p() : pVar;
        this.f33176d = bVar == null ? new b(executorServiceC4354a, executorServiceC4354a2, executorServiceC4354a3, executorServiceC4354a4, this, this) : bVar;
        this.f33179g = aVar2 == null ? new a(cVar) : aVar2;
        this.f33177e = uVar == null ? new u() : uVar;
        hVar.e(this);
    }
}
