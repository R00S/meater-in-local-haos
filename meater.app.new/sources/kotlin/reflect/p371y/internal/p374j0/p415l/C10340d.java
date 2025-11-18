package kotlin.reflect.p371y.internal.p374j0.p415l;

import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10440g;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10442i;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10444k;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10446m;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10449p;

/* compiled from: AbstractStrictEqualityTypeChecker.kt */
/* renamed from: kotlin.f0.y.e.j0.l.d */
/* loaded from: classes3.dex */
public final class C10340d {

    /* renamed from: a */
    public static final C10340d f40047a = new C10340d();

    private C10340d() {
    }

    /* renamed from: a */
    private final boolean m36597a(InterfaceC10449p interfaceC10449p, InterfaceC10444k interfaceC10444k, InterfaceC10444k interfaceC10444k2) {
        if (interfaceC10449p.mo35951j(interfaceC10444k) == interfaceC10449p.mo35951j(interfaceC10444k2) && interfaceC10449p.mo35929W(interfaceC10444k) == interfaceC10449p.mo35929W(interfaceC10444k2)) {
            if ((interfaceC10449p.mo35970s0(interfaceC10444k) == null) == (interfaceC10449p.mo35970s0(interfaceC10444k2) == null) && interfaceC10449p.mo35902A0(interfaceC10449p.mo35937c(interfaceC10444k), interfaceC10449p.mo35937c(interfaceC10444k2))) {
                if (interfaceC10449p.mo35972t0(interfaceC10444k, interfaceC10444k2)) {
                    return true;
                }
                int iMo35951j = interfaceC10449p.mo35951j(interfaceC10444k);
                for (int i2 = 0; i2 < iMo35951j; i2++) {
                    InterfaceC10446m interfaceC10446mMo35946g0 = interfaceC10449p.mo35946g0(interfaceC10444k, i2);
                    InterfaceC10446m interfaceC10446mMo35946g02 = interfaceC10449p.mo35946g0(interfaceC10444k2, i2);
                    if (interfaceC10449p.mo35918L(interfaceC10446mMo35946g0) != interfaceC10449p.mo35918L(interfaceC10446mMo35946g02)) {
                        return false;
                    }
                    if (!interfaceC10449p.mo35918L(interfaceC10446mMo35946g0) && (interfaceC10449p.mo35952j0(interfaceC10446mMo35946g0) != interfaceC10449p.mo35952j0(interfaceC10446mMo35946g02) || !m36598c(interfaceC10449p, interfaceC10449p.mo35980x0(interfaceC10446mMo35946g0), interfaceC10449p.mo35980x0(interfaceC10446mMo35946g02)))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private final boolean m36598c(InterfaceC10449p interfaceC10449p, InterfaceC10442i interfaceC10442i, InterfaceC10442i interfaceC10442i2) {
        if (interfaceC10442i == interfaceC10442i2) {
            return true;
        }
        InterfaceC10444k interfaceC10444kMo35933a = interfaceC10449p.mo35933a(interfaceC10442i);
        InterfaceC10444k interfaceC10444kMo35933a2 = interfaceC10449p.mo35933a(interfaceC10442i2);
        if (interfaceC10444kMo35933a != null && interfaceC10444kMo35933a2 != null) {
            return m36597a(interfaceC10449p, interfaceC10444kMo35933a, interfaceC10444kMo35933a2);
        }
        InterfaceC10440g interfaceC10440gMo35919M = interfaceC10449p.mo35919M(interfaceC10442i);
        InterfaceC10440g interfaceC10440gMo35919M2 = interfaceC10449p.mo35919M(interfaceC10442i2);
        return interfaceC10440gMo35919M != null && interfaceC10440gMo35919M2 != null && m36597a(interfaceC10449p, interfaceC10449p.mo35945g(interfaceC10440gMo35919M), interfaceC10449p.mo35945g(interfaceC10440gMo35919M2)) && m36597a(interfaceC10449p, interfaceC10449p.mo35941e(interfaceC10440gMo35919M), interfaceC10449p.mo35941e(interfaceC10440gMo35919M2));
    }

    /* renamed from: b */
    public final boolean m36599b(InterfaceC10449p interfaceC10449p, InterfaceC10442i interfaceC10442i, InterfaceC10442i interfaceC10442i2) {
        C9801m.m32346f(interfaceC10449p, "context");
        C9801m.m32346f(interfaceC10442i, "a");
        C9801m.m32346f(interfaceC10442i2, "b");
        return m36598c(interfaceC10449p, interfaceC10442i, interfaceC10442i2);
    }
}
