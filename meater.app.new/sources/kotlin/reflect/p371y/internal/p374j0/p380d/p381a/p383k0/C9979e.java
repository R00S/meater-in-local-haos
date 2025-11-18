package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p383k0;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10730u;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10583d0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10599i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10735w0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10739y0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10650g0;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10186c;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p422m.C10480p;

/* compiled from: JavaMethodDescriptor.java */
/* renamed from: kotlin.f0.y.e.j0.d.a.k0.e */
/* loaded from: classes2.dex */
public class C9979e extends C10650g0 implements InterfaceC9975a {

    /* renamed from: J */
    public static final InterfaceC10573a.a<InterfaceC10599i1> f37942J = new a();

    /* renamed from: K */
    public static final InterfaceC10573a.a<Boolean> f37943K = new b();

    /* renamed from: L */
    private c f37944L;

    /* renamed from: M */
    private final boolean f37945M;

    /* compiled from: JavaMethodDescriptor.java */
    /* renamed from: kotlin.f0.y.e.j0.d.a.k0.e$a */
    static class a implements InterfaceC10573a.a<InterfaceC10599i1> {
        a() {
        }
    }

    /* compiled from: JavaMethodDescriptor.java */
    /* renamed from: kotlin.f0.y.e.j0.d.a.k0.e$b */
    static class b implements InterfaceC10573a.a<Boolean> {
        b() {
        }
    }

    /* compiled from: JavaMethodDescriptor.java */
    /* renamed from: kotlin.f0.y.e.j0.d.a.k0.e$c */
    private enum c {
        NON_STABLE_DECLARED(false, false),
        STABLE_DECLARED(true, false),
        NON_STABLE_SYNTHESIZED(false, true),
        STABLE_SYNTHESIZED(true, true);


        /* renamed from: k */
        public final boolean f37951k;

        /* renamed from: l */
        public final boolean f37952l;

        c(boolean z, boolean z2) {
            this.f37951k = z;
            this.f37952l = z2;
        }

        /* renamed from: g */
        private static /* synthetic */ void m33218g(int i2) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor$ParameterNamesStatus", "get"));
        }

        /* renamed from: k */
        public static c m33219k(boolean z, boolean z2) {
            c cVar = z ? z2 ? STABLE_SYNTHESIZED : STABLE_DECLARED : z2 ? NON_STABLE_SYNTHESIZED : NON_STABLE_DECLARED;
            if (cVar == null) {
                m33218g(0);
            }
            return cVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected C9979e(InterfaceC10609m interfaceC10609m, InterfaceC10739y0 interfaceC10739y0, InterfaceC10620g interfaceC10620g, C10163f c10163f, InterfaceC10576b.a aVar, InterfaceC10741z0 interfaceC10741z0, boolean z) {
        super(interfaceC10609m, interfaceC10739y0, interfaceC10620g, c10163f, aVar, interfaceC10741z0);
        if (interfaceC10609m == null) {
            m33213v(0);
        }
        if (interfaceC10620g == null) {
            m33213v(1);
        }
        if (c10163f == null) {
            m33213v(2);
        }
        if (aVar == null) {
            m33213v(3);
        }
        if (interfaceC10741z0 == null) {
            m33213v(4);
        }
        this.f37944L = null;
        this.f37945M = z;
    }

    /* renamed from: q1 */
    public static C9979e m33212q1(InterfaceC10609m interfaceC10609m, InterfaceC10620g interfaceC10620g, C10163f c10163f, InterfaceC10741z0 interfaceC10741z0, boolean z) {
        if (interfaceC10609m == null) {
            m33213v(5);
        }
        if (interfaceC10620g == null) {
            m33213v(6);
        }
        if (c10163f == null) {
            m33213v(7);
        }
        if (interfaceC10741z0 == null) {
            m33213v(8);
        }
        return new C9979e(interfaceC10609m, null, interfaceC10620g, c10163f, InterfaceC10576b.a.DECLARATION, interfaceC10741z0, z);
    }

    /* renamed from: v */
    private static /* synthetic */ void m33213v(int i2) {
        String str = (i2 == 13 || i2 == 18 || i2 == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i2 == 13 || i2 == 18 || i2 == 21) ? 2 : 3];
        switch (i2) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i2 == 13) {
            objArr[1] = "initialize";
        } else if (i2 == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i2 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i2) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i2 != 13 && i2 != 18 && i2 != 21) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10666p, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a
    /* renamed from: G */
    public boolean mo33204G() {
        return this.f37944L.f37952l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10666p
    /* renamed from: R0 */
    public boolean mo33205R0() {
        return this.f37944L.f37951k;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10650g0
    /* renamed from: p1 */
    public C10650g0 mo33214p1(InterfaceC10735w0 interfaceC10735w0, InterfaceC10735w0 interfaceC10735w02, List<InterfaceC10735w0> list, List<? extends InterfaceC10587e1> list2, List<InterfaceC10599i1> list3, AbstractC10344e0 abstractC10344e0, EnumC10583d0 enumC10583d0, AbstractC10730u abstractC10730u, Map<? extends InterfaceC10573a.a<?>, ?> map) {
        if (list == null) {
            m33213v(9);
        }
        if (list2 == null) {
            m33213v(10);
        }
        if (list3 == null) {
            m33213v(11);
        }
        if (abstractC10730u == null) {
            m33213v(12);
        }
        C10650g0 c10650g0Mo33214p1 = super.mo33214p1(interfaceC10735w0, interfaceC10735w02, list, list2, list3, abstractC10344e0, enumC10583d0, abstractC10730u, map);
        m37927g1(C10480p.f40431a.m37186a(c10650g0Mo33214p1).m37197a());
        if (c10650g0Mo33214p1 == null) {
            m33213v(13);
        }
        return c10650g0Mo33214p1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10650g0, kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10666p
    /* renamed from: r1, reason: merged with bridge method [inline-methods] */
    public C9979e mo32906M0(InterfaceC10609m interfaceC10609m, InterfaceC10738y interfaceC10738y, InterfaceC10576b.a aVar, C10163f c10163f, InterfaceC10620g interfaceC10620g, InterfaceC10741z0 interfaceC10741z0) {
        if (interfaceC10609m == null) {
            m33213v(14);
        }
        if (aVar == null) {
            m33213v(15);
        }
        if (interfaceC10620g == null) {
            m33213v(16);
        }
        if (interfaceC10741z0 == null) {
            m33213v(17);
        }
        InterfaceC10739y0 interfaceC10739y0 = (InterfaceC10739y0) interfaceC10738y;
        if (c10163f == null) {
            c10163f = getName();
        }
        C9979e c9979e = new C9979e(interfaceC10609m, interfaceC10739y0, interfaceC10620g, c10163f, aVar, interfaceC10741z0, this.f37945M);
        c9979e.m33217t1(mo33205R0(), mo33204G());
        return c9979e;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p383k0.InterfaceC9975a
    /* renamed from: s1, reason: merged with bridge method [inline-methods] */
    public C9979e mo33201y(AbstractC10344e0 abstractC10344e0, List<AbstractC10344e0> list, AbstractC10344e0 abstractC10344e02, Pair<InterfaceC10573a.a<?>, ?> pair) {
        if (list == null) {
            m33213v(19);
        }
        if (abstractC10344e02 == null) {
            m33213v(20);
        }
        C9979e c9979e = (C9979e) mo36992u().mo36995b(C9982h.m33225a(list, mo37028f(), this)).mo37000g(abstractC10344e02).mo37004k(abstractC10344e0 == null ? null : C10186c.m35790h(this, abstractC10344e0, InterfaceC10620g.f40808c.m37735b())).mo36994a().mo36999f().mo36996c();
        if (pair != null) {
            c9979e.m37921V0(pair.m37648c(), pair.m37649d());
        }
        if (c9979e == null) {
            m33213v(21);
        }
        return c9979e;
    }

    /* renamed from: t1 */
    public void m33217t1(boolean z, boolean z2) {
        this.f37944L = c.m33219k(z, z2);
    }
}
