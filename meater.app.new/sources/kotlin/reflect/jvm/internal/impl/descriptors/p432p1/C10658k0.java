package kotlin.reflect.jvm.internal.impl.descriptors.p432p1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10581c1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10187d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10330n;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10350g0;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10384r1;

/* compiled from: TypeParameterDescriptorImpl.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.k0 */
/* loaded from: classes2.dex */
public class C10658k0 extends AbstractC10645e {

    /* renamed from: p */
    private final Function1<AbstractC10344e0, Void> f40998p;

    /* renamed from: q */
    private final List<AbstractC10344e0> f40999q;

    /* renamed from: r */
    private boolean f41000r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private C10658k0(InterfaceC10609m interfaceC10609m, InterfaceC10620g interfaceC10620g, boolean z, EnumC10384r1 enumC10384r1, C10163f c10163f, int i2, InterfaceC10741z0 interfaceC10741z0, Function1<AbstractC10344e0, Void> function1, InterfaceC10581c1 interfaceC10581c1, InterfaceC10330n interfaceC10330n) {
        super(interfaceC10330n, interfaceC10609m, interfaceC10620g, c10163f, enumC10384r1, z, i2, interfaceC10741z0, interfaceC10581c1);
        if (interfaceC10609m == null) {
            m37878v(19);
        }
        if (interfaceC10620g == null) {
            m37878v(20);
        }
        if (enumC10384r1 == null) {
            m37878v(21);
        }
        if (c10163f == null) {
            m37878v(22);
        }
        if (interfaceC10741z0 == null) {
            m37878v(23);
        }
        if (interfaceC10581c1 == null) {
            m37878v(24);
        }
        if (interfaceC10330n == null) {
            m37878v(25);
        }
        this.f40999q = new ArrayList(1);
        this.f41000r = false;
        this.f40998p = function1;
    }

    /* renamed from: O0 */
    private void m37871O0() {
        if (this.f41000r) {
            return;
        }
        throw new IllegalStateException("Type parameter descriptor is not initialized: " + m37877V0());
    }

    /* renamed from: P0 */
    private void m37872P0() {
        if (this.f41000r) {
            throw new IllegalStateException("Type parameter descriptor is already initialized: " + m37877V0());
        }
    }

    /* renamed from: Q0 */
    public static C10658k0 m37873Q0(InterfaceC10609m interfaceC10609m, InterfaceC10620g interfaceC10620g, boolean z, EnumC10384r1 enumC10384r1, C10163f c10163f, int i2, InterfaceC10741z0 interfaceC10741z0, Function1<AbstractC10344e0, Void> function1, InterfaceC10581c1 interfaceC10581c1, InterfaceC10330n interfaceC10330n) {
        if (interfaceC10609m == null) {
            m37878v(12);
        }
        if (interfaceC10620g == null) {
            m37878v(13);
        }
        if (enumC10384r1 == null) {
            m37878v(14);
        }
        if (c10163f == null) {
            m37878v(15);
        }
        if (interfaceC10741z0 == null) {
            m37878v(16);
        }
        if (interfaceC10581c1 == null) {
            m37878v(17);
        }
        if (interfaceC10330n == null) {
            m37878v(18);
        }
        return new C10658k0(interfaceC10609m, interfaceC10620g, z, enumC10384r1, c10163f, i2, interfaceC10741z0, function1, interfaceC10581c1, interfaceC10330n);
    }

    /* renamed from: R0 */
    public static C10658k0 m37874R0(InterfaceC10609m interfaceC10609m, InterfaceC10620g interfaceC10620g, boolean z, EnumC10384r1 enumC10384r1, C10163f c10163f, int i2, InterfaceC10741z0 interfaceC10741z0, InterfaceC10330n interfaceC10330n) {
        if (interfaceC10609m == null) {
            m37878v(6);
        }
        if (interfaceC10620g == null) {
            m37878v(7);
        }
        if (enumC10384r1 == null) {
            m37878v(8);
        }
        if (c10163f == null) {
            m37878v(9);
        }
        if (interfaceC10741z0 == null) {
            m37878v(10);
        }
        if (interfaceC10330n == null) {
            m37878v(11);
        }
        return m37873Q0(interfaceC10609m, interfaceC10620g, z, enumC10384r1, c10163f, i2, interfaceC10741z0, null, InterfaceC10581c1.a.f40737a, interfaceC10330n);
    }

    /* renamed from: S0 */
    public static InterfaceC10587e1 m37875S0(InterfaceC10609m interfaceC10609m, InterfaceC10620g interfaceC10620g, boolean z, EnumC10384r1 enumC10384r1, C10163f c10163f, int i2, InterfaceC10330n interfaceC10330n) {
        if (interfaceC10609m == null) {
            m37878v(0);
        }
        if (interfaceC10620g == null) {
            m37878v(1);
        }
        if (enumC10384r1 == null) {
            m37878v(2);
        }
        if (c10163f == null) {
            m37878v(3);
        }
        if (interfaceC10330n == null) {
            m37878v(4);
        }
        C10658k0 c10658k0M37874R0 = m37874R0(interfaceC10609m, interfaceC10620g, z, enumC10384r1, c10163f, i2, InterfaceC10741z0.f41247a, interfaceC10330n);
        c10658k0M37874R0.m37879N0(C10235a.m36072f(interfaceC10609m).m32805y());
        c10658k0M37874R0.m37881W0();
        return c10658k0M37874R0;
    }

    /* renamed from: T0 */
    private void m37876T0(AbstractC10344e0 abstractC10344e0) {
        if (C10350g0.m36706a(abstractC10344e0)) {
            return;
        }
        this.f40999q.add(abstractC10344e0);
    }

    /* renamed from: V0 */
    private String m37877V0() {
        return getName() + " declared in " + C10187d.m35825m(mo32876b());
    }

    /* renamed from: v */
    private static /* synthetic */ void m37878v(int i2) {
        String str = (i2 == 5 || i2 == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i2 == 5 || i2 == 28) ? 2 : 3];
        switch (i2) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
        }
        if (i2 == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i2 != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i2) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i2 != 5 && i2 != 28) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10645e
    /* renamed from: L0 */
    protected void mo33497L0(AbstractC10344e0 abstractC10344e0) {
        if (abstractC10344e0 == null) {
            m37878v(27);
        }
        Function1<AbstractC10344e0, Void> function1 = this.f40998p;
        if (function1 == null) {
            return;
        }
        function1.invoke(abstractC10344e0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10645e
    /* renamed from: M0 */
    protected List<AbstractC10344e0> mo33498M0() {
        m37871O0();
        List<AbstractC10344e0> list = this.f40999q;
        if (list == null) {
            m37878v(28);
        }
        return list;
    }

    /* renamed from: N0 */
    public void m37879N0(AbstractC10344e0 abstractC10344e0) {
        if (abstractC10344e0 == null) {
            m37878v(26);
        }
        m37872P0();
        m37876T0(abstractC10344e0);
    }

    /* renamed from: U0 */
    public boolean m37880U0() {
        return this.f41000r;
    }

    /* renamed from: W0 */
    public void m37881W0() {
        m37872P0();
        this.f41000r = true;
    }
}
