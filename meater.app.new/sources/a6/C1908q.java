package a6;

import Xc.KoinDefinition;
import a4.InterfaceC1889a;
import android.content.Context;
import b4.InterfaceC2226a;
import b6.C2249a;
import b6.C2250b;
import d4.InterfaceC3041a;
import e4.InterfaceC3196a;
import ed.c;
import g6.C3428a;
import h6.InterfaceC3491a;
import i6.C3629a;
import j6.InterfaceC3748a;
import java.io.File;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.P;
import nd.f;
import nd.t;
import oa.C4153F;
import oc.C4183c;
import oc.EnumC4177A;
import oc.z;
import r4.InterfaceC4344a;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u000e\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0005\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0002\"\u0014\u0010\t\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0002\"\u0017\u0010\r\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lbd/a;", "a", "Lbd/a;", "user_network_module", "b", "device_network_module", "c", "recipe_network_module", "d", "network_constant_module", "e", "t", "()Lbd/a;", "network_module", "network_playstoreLiveRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* renamed from: a6.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1908q {

    /* renamed from: a, reason: collision with root package name */
    private static final bd.a f20082a = hd.b.b(false, new Ba.l() { // from class: a6.a
        @Override // Ba.l
        public final Object invoke(Object obj) {
            return C1908q.E((bd.a) obj);
        }
    }, 1, null);

    /* renamed from: b, reason: collision with root package name */
    private static final bd.a f20083b = hd.b.b(false, new Ba.l() { // from class: a6.h
        @Override // Ba.l
        public final Object invoke(Object obj) {
            return C1908q.q((bd.a) obj);
        }
    }, 1, null);

    /* renamed from: c, reason: collision with root package name */
    private static final bd.a f20084c = hd.b.b(false, new Ba.l() { // from class: a6.i
        @Override // Ba.l
        public final Object invoke(Object obj) {
            return C1908q.B((bd.a) obj);
        }
    }, 1, null);

    /* renamed from: d, reason: collision with root package name */
    private static final bd.a f20085d = hd.b.b(false, new Ba.l() { // from class: a6.j
        @Override // Ba.l
        public final Object invoke(Object obj) {
            return C1908q.u((bd.a) obj);
        }
    }, 1, null);

    /* renamed from: e, reason: collision with root package name */
    private static final bd.a f20086e = hd.b.b(false, new Ba.l() { // from class: a6.k
        @Override // Ba.l
        public final Object invoke(Object obj) {
            return C1908q.w((bd.a) obj);
        }
    }, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4183c A(fd.a single, cd.a it) {
        C3862t.g(single, "$this$single");
        C3862t.g(it, "it");
        Object objC = single.c(P.b(Context.class), null, null);
        C3862t.e(objC, "null cannot be cast to non-null type android.content.Context");
        return new C4183c(new File(((Context) objC).getCacheDir(), "http_disk_cache"), 10485760);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F B(bd.a module) {
        C3862t.g(module, "$this$module");
        Ba.p pVar = new Ba.p() { // from class: a6.d
            @Override // Ba.p
            public final Object invoke(Object obj, Object obj2) {
                return C1908q.C((fd.a) obj, (cd.a) obj2);
            }
        };
        c.Companion companion = ed.c.INSTANCE;
        dd.c cVarA = companion.a();
        Xc.d dVar = Xc.d.f19128C;
        Zc.a aVar = new Zc.a(new Xc.b(cVarA, P.b(InterfaceC3491a.class), null, pVar, dVar, r.m()));
        module.g(aVar);
        new KoinDefinition(module, aVar);
        Ba.p pVar2 = new Ba.p() { // from class: a6.e
            @Override // Ba.p
            public final Object invoke(Object obj, Object obj2) {
                return C1908q.D((fd.a) obj, (cd.a) obj2);
            }
        };
        Zc.a aVar2 = new Zc.a(new Xc.b(companion.a(), P.b(InterfaceC3041a.class), null, pVar2, dVar, r.m()));
        module.g(aVar2);
        new KoinDefinition(module, aVar2);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3491a C(fd.a factory, cd.a it) {
        C3862t.g(factory, "$this$factory");
        C3862t.g(it, "it");
        return (InterfaceC3491a) ((t) factory.c(P.b(t.class), null, null)).b(InterfaceC3491a.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3041a D(fd.a factory, cd.a it) {
        C3862t.g(factory, "$this$factory");
        C3862t.g(it, "it");
        return new C3428a((InterfaceC3491a) factory.c(P.b(InterfaceC3491a.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F E(bd.a module) {
        C3862t.g(module, "$this$module");
        Ba.p pVar = new Ba.p() { // from class: a6.f
            @Override // Ba.p
            public final Object invoke(Object obj, Object obj2) {
                return C1908q.F((fd.a) obj, (cd.a) obj2);
            }
        };
        c.Companion companion = ed.c.INSTANCE;
        dd.c cVarA = companion.a();
        Xc.d dVar = Xc.d.f19128C;
        Zc.a aVar = new Zc.a(new Xc.b(cVarA, P.b(InterfaceC3748a.class), null, pVar, dVar, r.m()));
        module.g(aVar);
        new KoinDefinition(module, aVar);
        Ba.p pVar2 = new Ba.p() { // from class: a6.g
            @Override // Ba.p
            public final Object invoke(Object obj, Object obj2) {
                return C1908q.G((fd.a) obj, (cd.a) obj2);
            }
        };
        Zc.a aVar2 = new Zc.a(new Xc.b(companion.a(), P.b(InterfaceC3196a.class), null, pVar2, dVar, r.m()));
        module.g(aVar2);
        new KoinDefinition(module, aVar2);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3748a F(fd.a factory, cd.a it) {
        C3862t.g(factory, "$this$factory");
        C3862t.g(it, "it");
        return (InterfaceC3748a) ((t) factory.c(P.b(t.class), null, null)).b(InterfaceC3748a.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3196a G(fd.a factory, cd.a it) {
        C3862t.g(factory, "$this$factory");
        C3862t.g(it, "it");
        return new C3629a((InterfaceC3748a) factory.c(P.b(InterfaceC3748a.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F q(bd.a module) {
        C3862t.g(module, "$this$module");
        Ba.p pVar = new Ba.p() { // from class: a6.p
            @Override // Ba.p
            public final Object invoke(Object obj, Object obj2) {
                return C1908q.r((fd.a) obj, (cd.a) obj2);
            }
        };
        c.Companion companion = ed.c.INSTANCE;
        dd.c cVarA = companion.a();
        Xc.d dVar = Xc.d.f19128C;
        Zc.a aVar = new Zc.a(new Xc.b(cVarA, P.b(Z5.a.class), null, pVar, dVar, r.m()));
        module.g(aVar);
        new KoinDefinition(module, aVar);
        Ba.p pVar2 = new Ba.p() { // from class: a6.b
            @Override // Ba.p
            public final Object invoke(Object obj, Object obj2) {
                return C1908q.s((fd.a) obj, (cd.a) obj2);
            }
        };
        Zc.a aVar2 = new Zc.a(new Xc.b(companion.a(), P.b(InterfaceC2226a.class), null, pVar2, dVar, r.m()));
        module.g(aVar2);
        new KoinDefinition(module, aVar2);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Z5.a r(fd.a factory, cd.a it) {
        C3862t.g(factory, "$this$factory");
        C3862t.g(it, "it");
        return (Z5.a) ((t) factory.c(P.b(t.class), null, null)).b(Z5.a.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC2226a s(fd.a factory, cd.a it) {
        C3862t.g(factory, "$this$factory");
        C3862t.g(it, "it");
        return new Y5.a((Z5.a) factory.c(P.b(Z5.a.class), null, null));
    }

    public static final bd.a t() {
        return f20086e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F u(bd.a module) {
        C3862t.g(module, "$this$module");
        Ba.p pVar = new Ba.p() { // from class: a6.c
            @Override // Ba.p
            public final Object invoke(Object obj, Object obj2) {
                return C1908q.v((fd.a) obj, (cd.a) obj2);
            }
        };
        Zc.a aVar = new Zc.a(new Xc.b(ed.c.INSTANCE.a(), P.b(InterfaceC1889a.class), null, pVar, Xc.d.f19128C, r.m()));
        module.g(aVar);
        new KoinDefinition(module, aVar);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC1889a v(fd.a factory, cd.a it) {
        C3862t.g(factory, "$this$factory");
        C3862t.g(it, "it");
        return new X5.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F w(bd.a module) {
        C3862t.g(module, "$this$module");
        Ba.p pVar = new Ba.p() { // from class: a6.l
            @Override // Ba.p
            public final Object invoke(Object obj, Object obj2) {
                return C1908q.x((fd.a) obj, (cd.a) obj2);
            }
        };
        c.Companion companion = ed.c.INSTANCE;
        dd.c cVarA = companion.a();
        Xc.d dVar = Xc.d.f19127B;
        Zc.f<?> fVar = new Zc.f<>(new Xc.b(cVarA, P.b(z.class), null, pVar, dVar, r.m()));
        module.g(fVar);
        if (module.get_createdAtStart()) {
            module.h(fVar);
        }
        new KoinDefinition(module, fVar);
        Ba.p pVar2 = new Ba.p() { // from class: a6.m
            @Override // Ba.p
            public final Object invoke(Object obj, Object obj2) {
                return C1908q.y((fd.a) obj, (cd.a) obj2);
            }
        };
        Zc.f<?> fVar2 = new Zc.f<>(new Xc.b(companion.a(), P.b(t.class), null, pVar2, dVar, r.m()));
        module.g(fVar2);
        if (module.get_createdAtStart()) {
            module.h(fVar2);
        }
        new KoinDefinition(module, fVar2);
        Ba.p pVar3 = new Ba.p() { // from class: a6.n
            @Override // Ba.p
            public final Object invoke(Object obj, Object obj2) {
                return C1908q.z((fd.a) obj, (cd.a) obj2);
            }
        };
        Zc.f<?> fVar3 = new Zc.f<>(new Xc.b(companion.a(), P.b(f.a.class), null, pVar3, dVar, r.m()));
        module.g(fVar3);
        if (module.get_createdAtStart()) {
            module.h(fVar3);
        }
        new KoinDefinition(module, fVar3);
        Ba.p pVar4 = new Ba.p() { // from class: a6.o
            @Override // Ba.p
            public final Object invoke(Object obj, Object obj2) {
                return C1908q.A((fd.a) obj, (cd.a) obj2);
            }
        };
        Zc.f<?> fVar4 = new Zc.f<>(new Xc.b(companion.a(), P.b(C4183c.class), null, pVar4, dVar, r.m()));
        module.g(fVar4);
        if (module.get_createdAtStart()) {
            module.h(fVar4);
        }
        new KoinDefinition(module, fVar4);
        module.f(f20082a, f20083b, f20085d, f20084c);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z x(fd.a single, cd.a it) {
        C3862t.g(single, "$this$single");
        C3862t.g(it, "it");
        z.a aVarK = new z.a().f(new oc.k(0, 5L, TimeUnit.MINUTES)).K(r.e(EnumC4177A.HTTP_1_1));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return aVarK.L(15L, timeUnit).N(15L, timeUnit).M(true).e((C4183c) single.c(P.b(C4183c.class), null, null)).a(new C2249a((Context) single.c(P.b(Context.class), null, null))).c(new C2250b((Context) single.c(P.b(Context.class), null, null), (InterfaceC4344a) single.c(P.b(InterfaceC4344a.class), null, null))).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t y(fd.a single, cd.a it) {
        C3862t.g(single, "$this$single");
        C3862t.g(it, "it");
        return new t.b().b("https://api.cloud.meater.com/").g((z) single.c(P.b(z.class), null, null)).a(new X5.d()).a((f.a) single.c(P.b(f.a.class), null, null)).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f.a z(fd.a single, cd.a it) {
        C3862t.g(single, "$this$single");
        C3862t.g(it, "it");
        od.a aVarF = od.a.f();
        C3862t.f(aVarF, "create(...)");
        return aVarF;
    }
}
