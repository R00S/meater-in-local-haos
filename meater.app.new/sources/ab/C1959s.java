package ab;

import Ra.InterfaceC1688a;
import Ra.InterfaceC1692e;
import Ra.Z;
import eb.C3272d;
import kotlin.jvm.internal.C3862t;
import tb.InterfaceC4598j;

/* compiled from: FieldOverridabilityCondition.kt */
/* renamed from: ab.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1959s implements InterfaceC4598j {
    @Override // tb.InterfaceC4598j
    public InterfaceC4598j.b a(InterfaceC1688a superDescriptor, InterfaceC1688a subDescriptor, InterfaceC1692e interfaceC1692e) {
        C3862t.g(superDescriptor, "superDescriptor");
        C3862t.g(subDescriptor, "subDescriptor");
        if (!(subDescriptor instanceof Z) || !(superDescriptor instanceof Z)) {
            return InterfaceC4598j.b.UNKNOWN;
        }
        Z z10 = (Z) subDescriptor;
        Z z11 = (Z) superDescriptor;
        return !C3862t.b(z10.getName(), z11.getName()) ? InterfaceC4598j.b.UNKNOWN : (C3272d.a(z10) && C3272d.a(z11)) ? InterfaceC4598j.b.OVERRIDABLE : (C3272d.a(z10) || C3272d.a(z11)) ? InterfaceC4598j.b.INCOMPATIBLE : InterfaceC4598j.b.UNKNOWN;
    }

    @Override // tb.InterfaceC4598j
    public InterfaceC4598j.a b() {
        return InterfaceC4598j.a.BOTH;
    }
}
