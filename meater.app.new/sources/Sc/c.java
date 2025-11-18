package Sc;

import Ba.l;
import Ba.p;
import Xc.KoinDefinition;
import Xc.d;
import Zc.f;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.P;
import oa.C4153F;

/* compiled from: KoinApplicationExt.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"LUc/b;", "Loa/F;", "c", "(LUc/b;)V", "Lbd/a;", "a", "Lbd/a;", "fragmentFactoryModule", "koin-android_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final bd.a f15716a = hd.b.b(false, new l() { // from class: Sc.a
        @Override // Ba.l
        public final Object invoke(Object obj) {
            return c.d((bd.a) obj);
        }
    }, 1, null);

    public static final void c(Uc.b bVar) {
        C3862t.g(bVar, "<this>");
        Uc.a.i(bVar.getKoin(), r.e(f15716a), false, false, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F d(bd.a module) {
        C3862t.g(module, "$this$module");
        p pVar = new p() { // from class: Sc.b
            @Override // Ba.p
            public final Object invoke(Object obj, Object obj2) {
                return c.e((fd.a) obj, (cd.a) obj2);
            }
        };
        f<?> fVar = new f<>(new Xc.b(ed.c.INSTANCE.a(), P.b(androidx.fragment.app.r.class), null, pVar, d.f19127B, r.m()));
        module.g(fVar);
        if (module.get_createdAtStart()) {
            module.h(fVar);
        }
        new KoinDefinition(module, fVar);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.fragment.app.r e(fd.a single, cd.a it) {
        C3862t.g(single, "$this$single");
        C3862t.g(it, "it");
        return new Rc.a(null, 1, 0 == true ? 1 : 0);
    }
}
