package kotlin.reflect.p371y.internal.p374j0.p415l;

import java.util.HashSet;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10442i;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10444k;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10447n;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10448o;

/* compiled from: expandedTypeUtils.kt */
/* renamed from: kotlin.f0.y.e.j0.l.x */
/* loaded from: classes3.dex */
public final class C10455x {
    /* renamed from: a */
    public static final InterfaceC10442i m37129a(InterfaceC10369m1 interfaceC10369m1, InterfaceC10442i interfaceC10442i) {
        C9801m.m32346f(interfaceC10369m1, "<this>");
        C9801m.m32346f(interfaceC10442i, "inlineClassType");
        return m37130b(interfaceC10369m1, interfaceC10442i, new HashSet());
    }

    /* renamed from: b */
    private static final InterfaceC10442i m37130b(InterfaceC10369m1 interfaceC10369m1, InterfaceC10442i interfaceC10442i, HashSet<InterfaceC10447n> hashSet) {
        InterfaceC10442i interfaceC10442iM37130b;
        InterfaceC10442i interfaceC10442iMo35906C0;
        InterfaceC10447n interfaceC10447nMo35977w = interfaceC10369m1.mo35977w(interfaceC10442i);
        if (!hashSet.add(interfaceC10447nMo35977w)) {
            return null;
        }
        InterfaceC10448o interfaceC10448oMo35911F = interfaceC10369m1.mo35911F(interfaceC10447nMo35977w);
        if (interfaceC10448oMo35911F != null) {
            InterfaceC10442i interfaceC10442iMo35957m = interfaceC10369m1.mo35957m(interfaceC10448oMo35911F);
            interfaceC10442iM37130b = m37130b(interfaceC10369m1, interfaceC10442iMo35957m, hashSet);
            if (interfaceC10442iM37130b == null) {
                return null;
            }
            boolean z = interfaceC10369m1.mo35934a0(interfaceC10369m1.mo35977w(interfaceC10442iMo35957m)) || ((interfaceC10442iMo35957m instanceof InterfaceC10444k) && interfaceC10369m1.mo35910E0((InterfaceC10444k) interfaceC10442iMo35957m));
            if ((interfaceC10442iM37130b instanceof InterfaceC10444k) && interfaceC10369m1.mo35910E0((InterfaceC10444k) interfaceC10442iM37130b) && interfaceC10369m1.mo35964p0(interfaceC10442i) && z) {
                interfaceC10442iMo35906C0 = interfaceC10369m1.mo35906C0(interfaceC10442iMo35957m);
            } else if (!interfaceC10369m1.mo35964p0(interfaceC10442iM37130b) && interfaceC10369m1.mo35962o0(interfaceC10442i)) {
                interfaceC10442iMo35906C0 = interfaceC10369m1.mo35906C0(interfaceC10442iM37130b);
            }
            return interfaceC10442iMo35906C0;
        }
        if (!interfaceC10369m1.mo35934a0(interfaceC10447nMo35977w)) {
            return interfaceC10442i;
        }
        InterfaceC10442i interfaceC10442iMo35936b0 = interfaceC10369m1.mo35936b0(interfaceC10442i);
        if (interfaceC10442iMo35936b0 == null || (interfaceC10442iM37130b = m37130b(interfaceC10369m1, interfaceC10442iMo35936b0, hashSet)) == null) {
            return null;
        }
        if (interfaceC10369m1.mo35964p0(interfaceC10442i)) {
            return interfaceC10369m1.mo35964p0(interfaceC10442iM37130b) ? interfaceC10442i : ((interfaceC10442iM37130b instanceof InterfaceC10444k) && interfaceC10369m1.mo35910E0((InterfaceC10444k) interfaceC10442iM37130b)) ? interfaceC10442i : interfaceC10369m1.mo35906C0(interfaceC10442iM37130b);
        }
        return interfaceC10442iM37130b;
    }
}
