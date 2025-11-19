package N4;

import Xc.KoinDefinition;
import android.content.Context;
import com.apptionlabs.meater_app.data.NetworkConstant;
import ed.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.P;
import oa.C4153F;
import q4.InterfaceC4286b;
import r4.InterfaceC4344a;

/* compiled from: SingletonModule.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lbd/a;", "a", "Lbd/a;", "g", "()Lbd/a;", "singleton_module", "app_playstoreLiveRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final bd.a f12517a = hd.b.b(false, new Ba.l() { // from class: N4.a
        @Override // Ba.l
        public final Object invoke(Object obj) {
            return g.h((bd.a) obj);
        }
    }, 1, null);

    public static final bd.a g() {
        return f12517a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F h(bd.a module) {
        C3862t.g(module, "$this$module");
        Ba.p pVar = new Ba.p() { // from class: N4.b
            @Override // Ba.p
            public final Object invoke(Object obj, Object obj2) {
                return g.i((fd.a) obj, (cd.a) obj2);
            }
        };
        c.Companion companion = ed.c.INSTANCE;
        dd.c cVarA = companion.a();
        Xc.d dVar = Xc.d.f19127B;
        Zc.f<?> fVar = new Zc.f<>(new Xc.b(cVarA, P.b(NetworkConstant.class), null, pVar, dVar, kotlin.collections.r.m()));
        module.g(fVar);
        if (module.get_createdAtStart()) {
            module.h(fVar);
        }
        new KoinDefinition(module, fVar);
        Ba.p pVar2 = new Ba.p() { // from class: N4.c
            @Override // Ba.p
            public final Object invoke(Object obj, Object obj2) {
                return g.j((fd.a) obj, (cd.a) obj2);
            }
        };
        Zc.f<?> fVar2 = new Zc.f<>(new Xc.b(companion.a(), P.b(I5.a.class), null, pVar2, dVar, kotlin.collections.r.m()));
        module.g(fVar2);
        if (module.get_createdAtStart()) {
            module.h(fVar2);
        }
        new KoinDefinition(module, fVar2);
        Ba.p pVar3 = new Ba.p() { // from class: N4.d
            @Override // Ba.p
            public final Object invoke(Object obj, Object obj2) {
                return g.k((fd.a) obj, (cd.a) obj2);
            }
        };
        Zc.f<?> fVar3 = new Zc.f<>(new Xc.b(companion.a(), P.b(E5.a.class), null, pVar3, dVar, kotlin.collections.r.m()));
        module.g(fVar3);
        if (module.get_createdAtStart()) {
            module.h(fVar3);
        }
        new KoinDefinition(module, fVar3);
        Ba.p pVar4 = new Ba.p() { // from class: N4.e
            @Override // Ba.p
            public final Object invoke(Object obj, Object obj2) {
                return g.l((fd.a) obj, (cd.a) obj2);
            }
        };
        Zc.f<?> fVar4 = new Zc.f<>(new Xc.b(companion.a(), P.b(I5.d.class), null, pVar4, dVar, kotlin.collections.r.m()));
        module.g(fVar4);
        if (module.get_createdAtStart()) {
            module.h(fVar4);
        }
        new KoinDefinition(module, fVar4);
        Ba.p pVar5 = new Ba.p() { // from class: N4.f
            @Override // Ba.p
            public final Object invoke(Object obj, Object obj2) {
                return g.m((fd.a) obj, (cd.a) obj2);
            }
        };
        Zc.f<?> fVar5 = new Zc.f<>(new Xc.b(companion.a(), P.b(InterfaceC4344a.class), null, pVar5, dVar, kotlin.collections.r.m()));
        module.g(fVar5);
        if (module.get_createdAtStart()) {
            module.h(fVar5);
        }
        new KoinDefinition(module, fVar5);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NetworkConstant i(fd.a single, cd.a it) {
        C3862t.g(single, "$this$single");
        C3862t.g(it, "it");
        return new NetworkConstant((InterfaceC4286b) single.c(P.b(InterfaceC4286b.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final I5.a j(fd.a single, cd.a it) {
        C3862t.g(single, "$this$single");
        C3862t.g(it, "it");
        return new I5.a((Context) single.c(P.b(Context.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final E5.a k(fd.a single, cd.a it) {
        C3862t.g(single, "$this$single");
        C3862t.g(it, "it");
        return new E5.a((Context) single.c(P.b(Context.class), null, null), (I5.a) single.c(P.b(I5.a.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final I5.d l(fd.a single, cd.a it) {
        C3862t.g(single, "$this$single");
        C3862t.g(it, "it");
        return new I5.d((NetworkConstant) single.c(P.b(NetworkConstant.class), null, null), (s4.c) single.c(P.b(s4.c.class), null, null), (G5.a) single.c(P.b(G5.a.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4344a m(fd.a single, cd.a it) {
        C3862t.g(single, "$this$single");
        C3862t.g(it, "it");
        return new E4.b();
    }
}
