package La;

import kotlin.jvm.internal.AbstractC3849f;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.AbstractC3866x;
import kotlin.jvm.internal.C3859p;
import kotlin.jvm.internal.InterfaceC3858o;

/* compiled from: ReflectionFactoryImpl.java */
/* loaded from: classes3.dex */
public class b1 extends kotlin.jvm.internal.Q {
    private static AbstractC1422d0 k(AbstractC3849f abstractC3849f) {
        Ia.g owner = abstractC3849f.getOwner();
        return owner instanceof AbstractC1422d0 ? (AbstractC1422d0) owner : C1435k.f11231E;
    }

    @Override // kotlin.jvm.internal.Q
    public Ia.h a(C3859p c3859p) {
        return new C1432i0(k(c3859p), c3859p.getName(), c3859p.getSignature(), c3859p.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.Q
    public Ia.d b(Class cls) {
        return C1429h.k(cls);
    }

    @Override // kotlin.jvm.internal.Q
    public Ia.g c(Class cls, String str) {
        return C1429h.l(cls);
    }

    @Override // kotlin.jvm.internal.Q
    public Ia.j d(AbstractC3866x abstractC3866x) {
        return new C1436k0(k(abstractC3866x), abstractC3866x.getName(), abstractC3866x.getSignature(), abstractC3866x.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.Q
    public Ia.k e(kotlin.jvm.internal.z zVar) {
        return new C1440m0(k(zVar), zVar.getName(), zVar.getSignature(), zVar.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.Q
    public Ia.n f(kotlin.jvm.internal.D d10) {
        return new B0(k(d10), d10.getName(), d10.getSignature(), d10.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.Q
    public Ia.o g(kotlin.jvm.internal.F f10) {
        return new E0(k(f10), f10.getName(), f10.getSignature(), f10.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.Q
    public Ia.p h(kotlin.jvm.internal.H h10) {
        return new H0(k(h10), h10.getName(), h10.getSignature());
    }

    @Override // kotlin.jvm.internal.Q
    public String i(InterfaceC3858o interfaceC3858o) {
        C1432i0 c1432i0C;
        Ia.h hVarA = Ka.d.a(interfaceC3858o);
        return (hVarA == null || (c1432i0C = j1.c(hVarA)) == null) ? super.i(interfaceC3858o) : e1.f11201a.h(c1432i0C.Z());
    }

    @Override // kotlin.jvm.internal.Q
    public String j(AbstractC3864v abstractC3864v) {
        return i(abstractC3864v);
    }
}
