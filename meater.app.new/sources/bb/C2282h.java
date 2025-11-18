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
import vb.y;

/* compiled from: JavaAnnotationMapper.kt */
/* renamed from: bb.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2282h extends C2277c {

    /* renamed from: h, reason: collision with root package name */
    static final /* synthetic */ Ia.m<Object>[] f30723h = {P.h(new G(P.b(C2282h.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: g, reason: collision with root package name */
    private final Gb.i f30724g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2282h(InterfaceC3508a interfaceC3508a, C3096k c10) {
        super(c10, interfaceC3508a, p.a.f13489y);
        C3862t.g(c10, "c");
        this.f30724g = c10.e().g(C2281g.f30722B);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map k() {
        return M.e(v.a(C2278d.f30713a.b(), new y("Deprecated in Java")));
    }

    @Override // bb.C2277c, Sa.c
    public Map<qb.f, AbstractC4943g<?>> b() {
        return (Map) Gb.m.a(this.f30724g, this, f30723h[0]);
    }
}
