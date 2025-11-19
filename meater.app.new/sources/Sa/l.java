package Sa;

import Hb.AbstractC1082f0;
import Hb.U;
import Ra.h0;
import java.util.Map;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4165j;
import oa.EnumC4168m;
import oa.InterfaceC4164i;
import vb.AbstractC4943g;

/* compiled from: BuiltInAnnotationDescriptor.kt */
/* loaded from: classes3.dex */
public final class l implements c {

    /* renamed from: a, reason: collision with root package name */
    private final Oa.j f15635a;

    /* renamed from: b, reason: collision with root package name */
    private final qb.c f15636b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<qb.f, AbstractC4943g<?>> f15637c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f15638d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC4164i f15639e;

    /* JADX WARN: Multi-variable type inference failed */
    public l(Oa.j builtIns, qb.c fqName, Map<qb.f, ? extends AbstractC4943g<?>> allValueArguments, boolean z10) {
        C3862t.g(builtIns, "builtIns");
        C3862t.g(fqName, "fqName");
        C3862t.g(allValueArguments, "allValueArguments");
        this.f15635a = builtIns;
        this.f15636b = fqName;
        this.f15637c = allValueArguments;
        this.f15638d = z10;
        this.f15639e = C4165j.b(EnumC4168m.f46627C, new k(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC1082f0 d(l lVar) {
        return lVar.f15635a.o(lVar.f()).u();
    }

    @Override // Sa.c
    public U a() {
        Object value = this.f15639e.getValue();
        C3862t.f(value, "getValue(...)");
        return (U) value;
    }

    @Override // Sa.c
    public Map<qb.f, AbstractC4943g<?>> b() {
        return this.f15637c;
    }

    @Override // Sa.c
    public qb.c f() {
        return this.f15636b;
    }

    @Override // Sa.c
    public h0 j() {
        h0 NO_SOURCE = h0.f15158a;
        C3862t.f(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    public /* synthetic */ l(Oa.j jVar, qb.c cVar, Map map, boolean z10, int i10, C3854k c3854k) {
        this(jVar, cVar, map, (i10 & 8) != 0 ? false : z10);
    }
}
