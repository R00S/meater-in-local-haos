package bb;

import Oa.p;
import db.C3096k;
import hb.InterfaceC3508a;
import java.util.Map;
import kotlin.collections.M;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.P;
import oa.v;
import vb.AbstractC4943g;

/* compiled from: JavaAnnotationMapper.kt */
/* loaded from: classes3.dex */
public final class l extends C2277c {

    /* renamed from: h, reason: collision with root package name */
    static final /* synthetic */ Ia.m<Object>[] f30728h = {P.h(new G(P.b(l.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: g, reason: collision with root package name */
    private final Gb.i f30729g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(InterfaceC3508a annotation, C3096k c10) {
        super(c10, annotation, p.a.f13422L);
        C3862t.g(annotation, "annotation");
        C3862t.g(c10, "c");
        this.f30729g = c10.e().g(new k(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map k(l lVar) {
        AbstractC4943g<?> abstractC4943gB = C2280f.f30719a.b(lVar.d());
        Map mapE = abstractC4943gB != null ? M.e(v.a(C2278d.f30713a.c(), abstractC4943gB)) : null;
        return mapE == null ? M.h() : mapE;
    }

    @Override // bb.C2277c, Sa.c
    public Map<qb.f, AbstractC4943g<?>> b() {
        return (Map) Gb.m.a(this.f30729g, this, f30728h[0]);
    }
}
