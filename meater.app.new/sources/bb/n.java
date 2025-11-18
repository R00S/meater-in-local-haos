package bb;

import Oa.p;
import db.C3096k;
import hb.InterfaceC3508a;
import hb.InterfaceC3509b;
import hb.InterfaceC3512e;
import hb.InterfaceC3520m;
import java.util.Map;
import kotlin.collections.M;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.P;
import oa.v;
import vb.AbstractC4943g;

/* compiled from: JavaAnnotationMapper.kt */
/* loaded from: classes3.dex */
public final class n extends C2277c {

    /* renamed from: h, reason: collision with root package name */
    static final /* synthetic */ Ia.m<Object>[] f30731h = {P.h(new G(P.b(n.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: g, reason: collision with root package name */
    private final Gb.i f30732g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(InterfaceC3508a annotation, C3096k c10) {
        super(c10, annotation, p.a.f13414H);
        C3862t.g(annotation, "annotation");
        C3862t.g(c10, "c");
        this.f30732g = c10.e().g(new m(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map k(n nVar) {
        InterfaceC3509b interfaceC3509bD = nVar.d();
        AbstractC4943g<?> abstractC4943gD = interfaceC3509bD instanceof InterfaceC3512e ? C2280f.f30719a.d(((InterfaceC3512e) nVar.d()).e()) : interfaceC3509bD instanceof InterfaceC3520m ? C2280f.f30719a.d(r.e(nVar.d())) : null;
        Map mapE = abstractC4943gD != null ? M.e(v.a(C2278d.f30713a.d(), abstractC4943gD)) : null;
        return mapE == null ? M.h() : mapE;
    }

    @Override // bb.C2277c, Sa.c
    public Map<qb.f, AbstractC4943g<Object>> b() {
        return (Map) Gb.m.a(this.f30732g, this, f30731h[0]);
    }
}
