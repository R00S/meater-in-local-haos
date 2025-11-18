package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p383k0;

import java.util.List;
import kotlin.Pair;
import kotlin.collections.C10817u;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10730u;
import kotlin.reflect.jvm.internal.impl.descriptors.C10600j;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10583d0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10733v0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10642c0;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10644d0;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10646e0;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9914h;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.C10068r;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10186c;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10211g;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10326j;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;

/* compiled from: JavaPropertyDescriptor.java */
/* renamed from: kotlin.f0.y.e.j0.d.a.k0.f */
/* loaded from: classes2.dex */
public class C9980f extends C10642c0 implements InterfaceC9975a {

    /* renamed from: H */
    private final boolean f37953H;

    /* renamed from: I */
    private final Pair<InterfaceC10573a.a<?>, ?> f37954I;

    /* renamed from: J */
    private AbstractC10344e0 f37955J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected C9980f(InterfaceC10609m interfaceC10609m, InterfaceC10620g interfaceC10620g, EnumC10583d0 enumC10583d0, AbstractC10730u abstractC10730u, boolean z, C10163f c10163f, InterfaceC10741z0 interfaceC10741z0, InterfaceC10729t0 interfaceC10729t0, InterfaceC10576b.a aVar, boolean z2, Pair<InterfaceC10573a.a<?>, ?> pair) {
        super(interfaceC10609m, interfaceC10729t0, interfaceC10620g, enumC10583d0, abstractC10730u, z, c10163f, aVar, interfaceC10741z0, false, false, false, false, false, false);
        if (interfaceC10609m == null) {
            m33221v(0);
        }
        if (interfaceC10620g == null) {
            m33221v(1);
        }
        if (enumC10583d0 == null) {
            m33221v(2);
        }
        if (abstractC10730u == null) {
            m33221v(3);
        }
        if (c10163f == null) {
            m33221v(4);
        }
        if (interfaceC10741z0 == null) {
            m33221v(5);
        }
        if (aVar == null) {
            m33221v(6);
        }
        this.f37955J = null;
        this.f37953H = z2;
        this.f37954I = pair;
    }

    /* renamed from: g1 */
    public static C9980f m33220g1(InterfaceC10609m interfaceC10609m, InterfaceC10620g interfaceC10620g, EnumC10583d0 enumC10583d0, AbstractC10730u abstractC10730u, boolean z, C10163f c10163f, InterfaceC10741z0 interfaceC10741z0, boolean z2) {
        if (interfaceC10609m == null) {
            m33221v(7);
        }
        if (interfaceC10620g == null) {
            m33221v(8);
        }
        if (enumC10583d0 == null) {
            m33221v(9);
        }
        if (abstractC10730u == null) {
            m33221v(10);
        }
        if (c10163f == null) {
            m33221v(11);
        }
        if (interfaceC10741z0 == null) {
            m33221v(12);
        }
        return new C9980f(interfaceC10609m, interfaceC10620g, enumC10583d0, abstractC10730u, z, c10163f, interfaceC10741z0, null, InterfaceC10576b.a.DECLARATION, z2, null);
    }

    /* renamed from: v */
    private static /* synthetic */ void m33221v(int i2) {
        String str = i2 != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i2 != 21 ? 3 : 2];
        switch (i2) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i2 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i2) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i2 == 21) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10662m0, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a
    /* renamed from: G */
    public boolean mo33204G() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10642c0
    /* renamed from: Q0 */
    protected C10642c0 mo33222Q0(InterfaceC10609m interfaceC10609m, EnumC10583d0 enumC10583d0, AbstractC10730u abstractC10730u, InterfaceC10729t0 interfaceC10729t0, InterfaceC10576b.a aVar, C10163f c10163f, InterfaceC10741z0 interfaceC10741z0) {
        if (interfaceC10609m == null) {
            m33221v(13);
        }
        if (enumC10583d0 == null) {
            m33221v(14);
        }
        if (abstractC10730u == null) {
            m33221v(15);
        }
        if (aVar == null) {
            m33221v(16);
        }
        if (c10163f == null) {
            m33221v(17);
        }
        if (interfaceC10741z0 == null) {
            m33221v(18);
        }
        return new C9980f(interfaceC10609m, getAnnotations(), enumC10583d0, abstractC10730u, mo37031j0(), c10163f, interfaceC10741z0, interfaceC10729t0, aVar, this.f37953H, this.f37954I);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10642c0
    /* renamed from: a1 */
    public void mo33223a1(AbstractC10344e0 abstractC10344e0) {
        if (abstractC10344e0 == null) {
            m33221v(22);
        }
        this.f37955J = abstractC10344e0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10642c0, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a
    /* renamed from: i0 */
    public <V> V mo33224i0(InterfaceC10573a.a<V> aVar) {
        Pair<InterfaceC10573a.a<?>, ?> pair = this.f37954I;
        if (pair == null || !pair.m37648c().equals(aVar)) {
            return null;
        }
        return (V) this.f37954I.m37649d();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10642c0, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10602j1
    public boolean isConst() {
        AbstractC10344e0 type = getType();
        return this.f37953H && C10600j.m37699a(type) && (!C10068r.m33776i(type) || AbstractC9914h.m32760u0(type));
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p383k0.InterfaceC9975a
    /* renamed from: y */
    public InterfaceC9975a mo33201y(AbstractC10344e0 abstractC10344e0, List<AbstractC10344e0> list, AbstractC10344e0 abstractC10344e02, Pair<InterfaceC10573a.a<?>, ?> pair) {
        C10644d0 c10644d0;
        C10646e0 c10646e0;
        if (list == null) {
            m33221v(19);
        }
        if (abstractC10344e02 == null) {
            m33221v(20);
        }
        InterfaceC10729t0 interfaceC10729t0Mo37019a = mo37019a() == this ? null : mo37019a();
        C9980f c9980f = new C9980f(mo32876b(), getAnnotations(), mo32879j(), getVisibility(), mo37031j0(), getName(), mo32883t(), interfaceC10729t0Mo37019a, mo37030i(), this.f37953H, pair);
        C10644d0 getter = getGetter();
        if (getter != null) {
            c10644d0 = c10644d0;
            C10644d0 c10644d02 = new C10644d0(c9980f, getter.getAnnotations(), getter.mo32879j(), getter.getVisibility(), getter.mo37773V(), getter.mo32885z(), getter.isInline(), mo37030i(), interfaceC10729t0Mo37019a == null ? null : interfaceC10729t0Mo37019a.getGetter(), getter.mo32883t());
            c10644d0.m37770O0(getter.mo37774d0());
            c10644d0.m37828R0(abstractC10344e02);
        } else {
            c10644d0 = null;
        }
        InterfaceC10733v0 setter = getSetter();
        if (setter != null) {
            C10646e0 c10646e02 = new C10646e0(c9980f, setter.getAnnotations(), setter.mo32879j(), setter.getVisibility(), setter.mo37773V(), setter.mo32885z(), setter.isInline(), mo37030i(), interfaceC10729t0Mo37019a == null ? null : interfaceC10729t0Mo37019a.getSetter(), setter.mo32883t());
            c10646e02.m37770O0(c10646e02.mo37774d0());
            c10646e02.m37837S0(setter.mo37028f().get(0));
            c10646e0 = c10646e02;
        } else {
            c10646e0 = null;
        }
        c9980f.m37790W0(c10644d0, c10646e0, mo37034q0(), mo37033n0());
        c9980f.m37793b1(m37791X0());
        Function0<InterfaceC10326j<AbstractC10211g<?>>> function0 = this.f41029m;
        if (function0 != null) {
            c9980f.m37909L0(this.f41028l, function0);
        }
        c9980f.mo36993x0(mo37027e());
        c9980f.m37794c1(abstractC10344e02, getTypeParameters(), mo37029f0(), abstractC10344e0 == null ? null : C10186c.m35790h(this, abstractC10344e0, InterfaceC10620g.f40808c.m37735b()), C10817u.m38888j());
        return c9980f;
    }
}
