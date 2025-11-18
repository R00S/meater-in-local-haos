package bb;

import Hb.AbstractC1082f0;
import Ra.h0;
import db.C3096k;
import hb.InterfaceC3508a;
import hb.InterfaceC3509b;
import java.util.Collection;
import java.util.Map;
import kotlin.collections.M;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.P;
import vb.AbstractC4943g;

/* compiled from: JavaAnnotationMapper.kt */
/* renamed from: bb.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2277c implements cb.g {

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ Ia.m<Object>[] f30707f = {P.h(new G(P.b(C2277c.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};

    /* renamed from: a, reason: collision with root package name */
    private final qb.c f30708a;

    /* renamed from: b, reason: collision with root package name */
    private final h0 f30709b;

    /* renamed from: c, reason: collision with root package name */
    private final Gb.i f30710c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3509b f30711d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f30712e;

    public C2277c(C3096k c10, InterfaceC3508a interfaceC3508a, qb.c fqName) {
        h0 NO_SOURCE;
        Collection<InterfaceC3509b> collectionB;
        C3862t.g(c10, "c");
        C3862t.g(fqName, "fqName");
        this.f30708a = fqName;
        if (interfaceC3508a == null || (NO_SOURCE = c10.a().t().a(interfaceC3508a)) == null) {
            NO_SOURCE = h0.f15158a;
            C3862t.f(NO_SOURCE, "NO_SOURCE");
        }
        this.f30709b = NO_SOURCE;
        this.f30710c = c10.e().g(new C2276b(c10, this));
        this.f30711d = (interfaceC3508a == null || (collectionB = interfaceC3508a.b()) == null) ? null : (InterfaceC3509b) r.k0(collectionB);
        boolean z10 = false;
        if (interfaceC3508a != null && interfaceC3508a.e()) {
            z10 = true;
        }
        this.f30712e = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC1082f0 h(C3096k c3096k, C2277c c2277c) {
        AbstractC1082f0 abstractC1082f0U = c3096k.d().q().o(c2277c.f()).u();
        C3862t.f(abstractC1082f0U, "getDefaultType(...)");
        return abstractC1082f0U;
    }

    @Override // Sa.c
    public Map<qb.f, AbstractC4943g<?>> b() {
        return M.h();
    }

    protected final InterfaceC3509b d() {
        return this.f30711d;
    }

    @Override // cb.g
    public boolean e() {
        return this.f30712e;
    }

    @Override // Sa.c
    public qb.c f() {
        return this.f30708a;
    }

    @Override // Sa.c
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public AbstractC1082f0 a() {
        return (AbstractC1082f0) Gb.m.a(this.f30710c, this, f30707f[0]);
    }

    @Override // Sa.c
    public h0 j() {
        return this.f30709b;
    }
}
