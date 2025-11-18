package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p383k0;

import java.util.List;
import kotlin.Pair;
import kotlin.collections.C10817u;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10647f;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10186c;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;

/* compiled from: JavaClassConstructorDescriptor.java */
/* renamed from: kotlin.f0.y.e.j0.d.a.k0.b */
/* loaded from: classes2.dex */
public class C9976b extends C10647f implements InterfaceC9975a {

    /* renamed from: K */
    private Boolean f37937K;

    /* renamed from: L */
    private Boolean f37938L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected C9976b(InterfaceC10585e interfaceC10585e, C9976b c9976b, InterfaceC10620g interfaceC10620g, boolean z, InterfaceC10576b.a aVar, InterfaceC10741z0 interfaceC10741z0) {
        super(interfaceC10585e, c9976b, interfaceC10620g, z, aVar, interfaceC10741z0);
        if (interfaceC10585e == null) {
            m33203v(0);
        }
        if (interfaceC10620g == null) {
            m33203v(1);
        }
        if (aVar == null) {
            m33203v(2);
        }
        if (interfaceC10741z0 == null) {
            m33203v(3);
        }
        this.f37937K = null;
        this.f37938L = null;
    }

    /* renamed from: u1 */
    public static C9976b m33202u1(InterfaceC10585e interfaceC10585e, InterfaceC10620g interfaceC10620g, boolean z, InterfaceC10741z0 interfaceC10741z0) {
        if (interfaceC10585e == null) {
            m33203v(4);
        }
        if (interfaceC10620g == null) {
            m33203v(5);
        }
        if (interfaceC10741z0 == null) {
            m33203v(6);
        }
        return new C9976b(interfaceC10585e, null, interfaceC10620g, z, InterfaceC10576b.a.DECLARATION, interfaceC10741z0);
    }

    /* renamed from: v */
    private static /* synthetic */ void m33203v(int i2) {
        String str = (i2 == 11 || i2 == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i2 == 11 || i2 == 18) ? 2 : 3];
        switch (i2) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i2 == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i2 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i2) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i2 != 11 && i2 != 18) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10666p, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a
    /* renamed from: G */
    public boolean mo33204G() {
        return this.f37938L.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10666p
    /* renamed from: R0 */
    public boolean mo33205R0() {
        return this.f37937K.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10666p
    /* renamed from: Z0 */
    public void mo33206Z0(boolean z) {
        this.f37937K = Boolean.valueOf(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10666p
    /* renamed from: a1 */
    public void mo33207a1(boolean z) {
        this.f37938L = Boolean.valueOf(z);
    }

    /* renamed from: t1 */
    protected C9976b m33209t1(InterfaceC10585e interfaceC10585e, C9976b c9976b, InterfaceC10576b.a aVar, InterfaceC10741z0 interfaceC10741z0, InterfaceC10620g interfaceC10620g) {
        if (interfaceC10585e == null) {
            m33203v(12);
        }
        if (aVar == null) {
            m33203v(13);
        }
        if (interfaceC10741z0 == null) {
            m33203v(14);
        }
        if (interfaceC10620g == null) {
            m33203v(15);
        }
        return new C9976b(interfaceC10585e, c9976b, interfaceC10620g, this.f40971J, aVar, interfaceC10741z0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10647f
    /* renamed from: v1, reason: merged with bridge method [inline-methods] */
    public C9976b mo32906M0(InterfaceC10609m interfaceC10609m, InterfaceC10738y interfaceC10738y, InterfaceC10576b.a aVar, C10163f c10163f, InterfaceC10620g interfaceC10620g, InterfaceC10741z0 interfaceC10741z0) {
        if (interfaceC10609m == null) {
            m33203v(7);
        }
        if (aVar == null) {
            m33203v(8);
        }
        if (interfaceC10620g == null) {
            m33203v(9);
        }
        if (interfaceC10741z0 == null) {
            m33203v(10);
        }
        if (aVar == InterfaceC10576b.a.DECLARATION || aVar == InterfaceC10576b.a.SYNTHESIZED) {
            C9976b c9976bM33209t1 = m33209t1((InterfaceC10585e) interfaceC10609m, (C9976b) interfaceC10738y, aVar, interfaceC10741z0, interfaceC10620g);
            c9976bM33209t1.mo33206Z0(mo33205R0());
            c9976bM33209t1.mo33207a1(mo33204G());
            return c9976bM33209t1;
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + interfaceC10609m + "\nkind: " + aVar);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p383k0.InterfaceC9975a
    /* renamed from: w1, reason: merged with bridge method [inline-methods] */
    public C9976b mo33201y(AbstractC10344e0 abstractC10344e0, List<AbstractC10344e0> list, AbstractC10344e0 abstractC10344e02, Pair<InterfaceC10573a.a<?>, ?> pair) {
        if (list == null) {
            m33203v(16);
        }
        if (abstractC10344e02 == null) {
            m33203v(17);
        }
        C9976b c9976bMo32906M0 = mo32906M0(mo32876b(), null, mo37030i(), null, getAnnotations(), mo32883t());
        c9976bMo32906M0.mo37850S0(abstractC10344e0 == null ? null : C10186c.m35790h(c9976bMo32906M0, abstractC10344e0, InterfaceC10620g.f40808c.m37735b()), mo37029f0(), C10817u.m38888j(), getTypeParameters(), C9982h.m33225a(list, mo37028f(), c9976bMo32906M0), abstractC10344e02, mo32879j(), getVisibility());
        if (pair != null) {
            c9976bMo32906M0.m37921V0(pair.m37648c(), pair.m37649d());
        }
        return c9976bMo32906M0;
    }
}
