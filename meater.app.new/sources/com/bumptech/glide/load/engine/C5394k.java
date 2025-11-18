package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.C5351e;
import com.bumptech.glide.EnumC5353g;
import com.bumptech.glide.load.C5426i;
import com.bumptech.glide.load.EnumC5365a;
import com.bumptech.glide.load.InterfaceC5423f;
import com.bumptech.glide.load.InterfaceC5429l;
import com.bumptech.glide.load.engine.C5399p;
import com.bumptech.glide.load.engine.RunnableC5391h;
import com.bumptech.glide.load.engine.p123a0.C5373b;
import com.bumptech.glide.load.engine.p123a0.InterfaceC5372a;
import com.bumptech.glide.load.engine.p123a0.InterfaceC5379h;
import com.bumptech.glide.load.engine.p124b0.ExecutorServiceC5383a;
import com.bumptech.glide.p141p.InterfaceC5566i;
import com.bumptech.glide.p145r.C5592f;
import com.bumptech.glide.p145r.C5596j;
import com.bumptech.glide.p145r.p146l.C5598a;
import java.util.Map;
import java.util.concurrent.Executor;
import p024c.p052i.p059j.InterfaceC0956f;

/* compiled from: Engine.java */
/* renamed from: com.bumptech.glide.load.engine.k */
/* loaded from: classes.dex */
public class C5394k implements InterfaceC5396m, InterfaceC5379h.a, C5399p.a {

    /* renamed from: a */
    private static final boolean f13399a = Log.isLoggable("Engine", 2);

    /* renamed from: b */
    private final C5401r f13400b;

    /* renamed from: c */
    private final C5398o f13401c;

    /* renamed from: d */
    private final InterfaceC5379h f13402d;

    /* renamed from: e */
    private final b f13403e;

    /* renamed from: f */
    private final C5407x f13404f;

    /* renamed from: g */
    private final c f13405g;

    /* renamed from: h */
    private final a f13406h;

    /* renamed from: i */
    private final C5371a f13407i;

    /* compiled from: Engine.java */
    /* renamed from: com.bumptech.glide.load.engine.k$a */
    static class a {

        /* renamed from: a */
        final RunnableC5391h.e f13408a;

        /* renamed from: b */
        final InterfaceC0956f<RunnableC5391h<?>> f13409b = C5598a.m11068d(150, new C11455a());

        /* renamed from: c */
        private int f13410c;

        /* compiled from: Engine.java */
        /* renamed from: com.bumptech.glide.load.engine.k$a$a, reason: collision with other inner class name */
        class C11455a implements C5598a.d<RunnableC5391h<?>> {
            C11455a() {
            }

            @Override // com.bumptech.glide.p145r.p146l.C5598a.d
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public RunnableC5391h<?> mo10211a() {
                a aVar = a.this;
                return new RunnableC5391h<>(aVar.f13408a, aVar.f13409b);
            }
        }

        a(RunnableC5391h.e eVar) {
            this.f13408a = eVar;
        }

        /* renamed from: a */
        <R> RunnableC5391h<R> m10311a(C5351e c5351e, Object obj, C5397n c5397n, InterfaceC5423f interfaceC5423f, int i2, int i3, Class<?> cls, Class<R> cls2, EnumC5353g enumC5353g, AbstractC5393j abstractC5393j, Map<Class<?>, InterfaceC5429l<?>> map, boolean z, boolean z2, boolean z3, C5426i c5426i, RunnableC5391h.b<R> bVar) {
            RunnableC5391h runnableC5391h = (RunnableC5391h) C5596j.m11042d(this.f13409b.mo6061b());
            int i4 = this.f13410c;
            this.f13410c = i4 + 1;
            return runnableC5391h.m10275I(c5351e, obj, c5397n, interfaceC5423f, i2, i3, cls, cls2, enumC5353g, abstractC5393j, map, z, z2, z3, c5426i, bVar, i4);
        }
    }

    /* compiled from: Engine.java */
    /* renamed from: com.bumptech.glide.load.engine.k$b */
    static class b {

        /* renamed from: a */
        final ExecutorServiceC5383a f13412a;

        /* renamed from: b */
        final ExecutorServiceC5383a f13413b;

        /* renamed from: c */
        final ExecutorServiceC5383a f13414c;

        /* renamed from: d */
        final ExecutorServiceC5383a f13415d;

        /* renamed from: e */
        final InterfaceC5396m f13416e;

        /* renamed from: f */
        final InterfaceC0956f<C5395l<?>> f13417f = C5598a.m11068d(150, new a());

        /* compiled from: Engine.java */
        /* renamed from: com.bumptech.glide.load.engine.k$b$a */
        class a implements C5598a.d<C5395l<?>> {
            a() {
            }

            @Override // com.bumptech.glide.p145r.p146l.C5598a.d
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C5395l<?> mo10211a() {
                b bVar = b.this;
                return new C5395l<>(bVar.f13412a, bVar.f13413b, bVar.f13414c, bVar.f13415d, bVar.f13416e, bVar.f13417f);
            }
        }

        b(ExecutorServiceC5383a executorServiceC5383a, ExecutorServiceC5383a executorServiceC5383a2, ExecutorServiceC5383a executorServiceC5383a3, ExecutorServiceC5383a executorServiceC5383a4, InterfaceC5396m interfaceC5396m) {
            this.f13412a = executorServiceC5383a;
            this.f13413b = executorServiceC5383a2;
            this.f13414c = executorServiceC5383a3;
            this.f13415d = executorServiceC5383a4;
            this.f13416e = interfaceC5396m;
        }

        /* renamed from: a */
        <R> C5395l<R> m10313a(InterfaceC5423f interfaceC5423f, boolean z, boolean z2, boolean z3, boolean z4) {
            return ((C5395l) C5596j.m11042d(this.f13417f.mo6061b())).m10325k(interfaceC5423f, z, z2, z3, z4);
        }
    }

    /* compiled from: Engine.java */
    /* renamed from: com.bumptech.glide.load.engine.k$c */
    private static class c implements RunnableC5391h.e {

        /* renamed from: a */
        private final InterfaceC5372a.a f13419a;

        /* renamed from: b */
        private volatile InterfaceC5372a f13420b;

        c(InterfaceC5372a.a aVar) {
            this.f13419a = aVar;
        }

        @Override // com.bumptech.glide.load.engine.RunnableC5391h.e
        /* renamed from: a */
        public InterfaceC5372a mo10289a() {
            if (this.f13420b == null) {
                synchronized (this) {
                    if (this.f13420b == null) {
                        this.f13420b = this.f13419a.mo10181c();
                    }
                    if (this.f13420b == null) {
                        this.f13420b = new C5373b();
                    }
                }
            }
            return this.f13420b;
        }
    }

    /* compiled from: Engine.java */
    /* renamed from: com.bumptech.glide.load.engine.k$d */
    public class d {

        /* renamed from: a */
        private final C5395l<?> f13421a;

        /* renamed from: b */
        private final InterfaceC5566i f13422b;

        d(InterfaceC5566i interfaceC5566i, C5395l<?> c5395l) {
            this.f13422b = interfaceC5566i;
            this.f13421a = c5395l;
        }

        /* renamed from: a */
        public void m10315a() {
            synchronized (C5394k.this) {
                this.f13421a.m10329q(this.f13422b);
            }
        }
    }

    public C5394k(InterfaceC5379h interfaceC5379h, InterfaceC5372a.a aVar, ExecutorServiceC5383a executorServiceC5383a, ExecutorServiceC5383a executorServiceC5383a2, ExecutorServiceC5383a executorServiceC5383a3, ExecutorServiceC5383a executorServiceC5383a4, boolean z) {
        this(interfaceC5379h, aVar, executorServiceC5383a, executorServiceC5383a2, executorServiceC5383a3, executorServiceC5383a4, null, null, null, null, null, null, z);
    }

    /* renamed from: e */
    private C5399p<?> m10302e(InterfaceC5423f interfaceC5423f) {
        InterfaceC5404u<?> interfaceC5404uMo10192d = this.f13402d.mo10192d(interfaceC5423f);
        if (interfaceC5404uMo10192d == null) {
            return null;
        }
        return interfaceC5404uMo10192d instanceof C5399p ? (C5399p) interfaceC5404uMo10192d : new C5399p<>(interfaceC5404uMo10192d, true, true);
    }

    /* renamed from: g */
    private C5399p<?> m10303g(InterfaceC5423f interfaceC5423f, boolean z) {
        if (!z) {
            return null;
        }
        C5399p<?> c5399pM10175e = this.f13407i.m10175e(interfaceC5423f);
        if (c5399pM10175e != null) {
            c5399pM10175e.m10338a();
        }
        return c5399pM10175e;
    }

    /* renamed from: h */
    private C5399p<?> m10304h(InterfaceC5423f interfaceC5423f, boolean z) {
        if (!z) {
            return null;
        }
        C5399p<?> c5399pM10302e = m10302e(interfaceC5423f);
        if (c5399pM10302e != null) {
            c5399pM10302e.m10338a();
            this.f13407i.m10171a(interfaceC5423f, c5399pM10302e);
        }
        return c5399pM10302e;
    }

    /* renamed from: i */
    private static void m10305i(String str, long j2, InterfaceC5423f interfaceC5423f) {
        Log.v("Engine", str + " in " + C5592f.m11027a(j2) + "ms, key: " + interfaceC5423f);
    }

    @Override // com.bumptech.glide.load.engine.p123a0.InterfaceC5379h.a
    /* renamed from: a */
    public void mo10199a(InterfaceC5404u<?> interfaceC5404u) {
        this.f13404f.m10360a(interfaceC5404u);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5396m
    /* renamed from: b */
    public synchronized void mo10306b(C5395l<?> c5395l, InterfaceC5423f interfaceC5423f, C5399p<?> c5399p) {
        if (c5399p != null) {
            c5399p.m10345h(interfaceC5423f, this);
            if (c5399p.m10343f()) {
                this.f13407i.m10171a(interfaceC5423f, c5399p);
            }
            this.f13400b.m10350d(interfaceC5423f, c5395l);
        } else {
            this.f13400b.m10350d(interfaceC5423f, c5395l);
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5396m
    /* renamed from: c */
    public synchronized void mo10307c(C5395l<?> c5395l, InterfaceC5423f interfaceC5423f) {
        this.f13400b.m10350d(interfaceC5423f, c5395l);
    }

    @Override // com.bumptech.glide.load.engine.C5399p.a
    /* renamed from: d */
    public synchronized void mo10308d(InterfaceC5423f interfaceC5423f, C5399p<?> c5399p) {
        this.f13407i.m10174d(interfaceC5423f);
        if (c5399p.m10343f()) {
            this.f13402d.mo10191c(interfaceC5423f, c5399p);
        } else {
            this.f13404f.m10360a(c5399p);
        }
    }

    /* renamed from: f */
    public synchronized <R> d m10309f(C5351e c5351e, Object obj, InterfaceC5423f interfaceC5423f, int i2, int i3, Class<?> cls, Class<R> cls2, EnumC5353g enumC5353g, AbstractC5393j abstractC5393j, Map<Class<?>, InterfaceC5429l<?>> map, boolean z, boolean z2, C5426i c5426i, boolean z3, boolean z4, boolean z5, boolean z6, InterfaceC5566i interfaceC5566i, Executor executor) {
        boolean z7 = f13399a;
        long jM11028b = z7 ? C5592f.m11028b() : 0L;
        C5397n c5397nM10337a = this.f13401c.m10337a(obj, interfaceC5423f, i2, i3, map, cls, cls2, c5426i);
        C5399p<?> c5399pM10303g = m10303g(c5397nM10337a, z3);
        if (c5399pM10303g != null) {
            interfaceC5566i.mo10948b(c5399pM10303g, EnumC5365a.MEMORY_CACHE);
            if (z7) {
                m10305i("Loaded resource from active resources", jM11028b, c5397nM10337a);
            }
            return null;
        }
        C5399p<?> c5399pM10304h = m10304h(c5397nM10337a, z3);
        if (c5399pM10304h != null) {
            interfaceC5566i.mo10948b(c5399pM10304h, EnumC5365a.MEMORY_CACHE);
            if (z7) {
                m10305i("Loaded resource from cache", jM11028b, c5397nM10337a);
            }
            return null;
        }
        C5395l<?> c5395lM10348a = this.f13400b.m10348a(c5397nM10337a, z6);
        if (c5395lM10348a != null) {
            c5395lM10348a.m10319d(interfaceC5566i, executor);
            if (z7) {
                m10305i("Added to existing load", jM11028b, c5397nM10337a);
            }
            return new d(interfaceC5566i, c5395lM10348a);
        }
        C5395l<R> c5395lM10313a = this.f13403e.m10313a(c5397nM10337a, z3, z4, z5, z6);
        RunnableC5391h<R> runnableC5391hM10311a = this.f13406h.m10311a(c5351e, obj, c5397nM10337a, interfaceC5423f, i2, i3, cls, cls2, enumC5353g, abstractC5393j, map, z, z2, z6, c5426i, c5395lM10313a);
        this.f13400b.m10349c(c5397nM10337a, c5395lM10313a);
        c5395lM10313a.m10319d(interfaceC5566i, executor);
        c5395lM10313a.m10330r(runnableC5391hM10311a);
        if (z7) {
            m10305i("Started new load", jM11028b, c5397nM10337a);
        }
        return new d(interfaceC5566i, c5395lM10313a);
    }

    /* renamed from: j */
    public void m10310j(InterfaceC5404u<?> interfaceC5404u) {
        if (!(interfaceC5404u instanceof C5399p)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((C5399p) interfaceC5404u).m10344g();
    }

    C5394k(InterfaceC5379h interfaceC5379h, InterfaceC5372a.a aVar, ExecutorServiceC5383a executorServiceC5383a, ExecutorServiceC5383a executorServiceC5383a2, ExecutorServiceC5383a executorServiceC5383a3, ExecutorServiceC5383a executorServiceC5383a4, C5401r c5401r, C5398o c5398o, C5371a c5371a, b bVar, a aVar2, C5407x c5407x, boolean z) {
        this.f13402d = interfaceC5379h;
        c cVar = new c(aVar);
        this.f13405g = cVar;
        C5371a c5371a2 = c5371a == null ? new C5371a(z) : c5371a;
        this.f13407i = c5371a2;
        c5371a2.m10176f(this);
        this.f13401c = c5398o == null ? new C5398o() : c5398o;
        this.f13400b = c5401r == null ? new C5401r() : c5401r;
        this.f13403e = bVar == null ? new b(executorServiceC5383a, executorServiceC5383a2, executorServiceC5383a3, executorServiceC5383a4, this) : bVar;
        this.f13406h = aVar2 == null ? new a(cVar) : aVar2;
        this.f13404f = c5407x == null ? new C5407x() : c5407x;
        interfaceC5379h.mo10193e(this);
    }
}
