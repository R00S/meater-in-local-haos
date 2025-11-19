package vb;

import Hb.AbstractC1082f0;
import Hb.U;
import Ra.C1711y;
import Ra.H;
import Ra.InterfaceC1692e;
import kotlin.jvm.internal.C3862t;
import oa.C4170o;
import tb.C4597i;

/* compiled from: constantValues.kt */
/* loaded from: classes3.dex */
public final class k extends AbstractC4943g<C4170o<? extends qb.b, ? extends qb.f>> {

    /* renamed from: b, reason: collision with root package name */
    private final qb.b f51602b;

    /* renamed from: c, reason: collision with root package name */
    private final qb.f f51603c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(qb.b enumClassId, qb.f enumEntryName) {
        super(oa.v.a(enumClassId, enumEntryName));
        C3862t.g(enumClassId, "enumClassId");
        C3862t.g(enumEntryName, "enumEntryName");
        this.f51602b = enumClassId;
        this.f51603c = enumEntryName;
    }

    @Override // vb.AbstractC4943g
    public U a(H module) {
        AbstractC1082f0 abstractC1082f0U;
        C3862t.g(module, "module");
        InterfaceC1692e interfaceC1692eB = C1711y.b(module, this.f51602b);
        if (interfaceC1692eB != null) {
            if (!C4597i.A(interfaceC1692eB)) {
                interfaceC1692eB = null;
            }
            if (interfaceC1692eB != null && (abstractC1082f0U = interfaceC1692eB.u()) != null) {
                return abstractC1082f0U;
            }
        }
        return Jb.l.d(Jb.k.f7751Z0, this.f51602b.toString(), this.f51603c.toString());
    }

    public final qb.f c() {
        return this.f51603c;
    }

    @Override // vb.AbstractC4943g
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f51602b.h());
        sb2.append('.');
        sb2.append(this.f51603c);
        return sb2.toString();
    }
}
