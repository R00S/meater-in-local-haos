package kotlin.reflect.jvm.internal.impl.descriptors.p432p1;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;

/* compiled from: SimpleFunctionDescriptorImpl.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.g0 */
/* loaded from: classes2.dex */
public class C10650g0 extends AbstractC10666p implements InterfaceC10739y0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected C10650g0(InterfaceC10609m interfaceC10609m, InterfaceC10739y0 interfaceC10739y0, InterfaceC10620g interfaceC10620g, C10163f c10163f, InterfaceC10576b.a aVar, InterfaceC10741z0 interfaceC10741z0) {
        super(interfaceC10609m, interfaceC10739y0, interfaceC10620g, c10163f, aVar, interfaceC10741z0);
        if (interfaceC10609m == null) {
            m37849v(0);
        }
        if (interfaceC10620g == null) {
            m37849v(1);
        }
        if (c10163f == null) {
            m37849v(2);
        }
        if (aVar == null) {
            m37849v(3);
        }
        if (interfaceC10741z0 == null) {
            m37849v(4);
        }
    }

    /* renamed from: m1 */
    public static C10650g0 m37848m1(InterfaceC10609m interfaceC10609m, InterfaceC10620g interfaceC10620g, C10163f c10163f, InterfaceC10576b.a aVar, InterfaceC10741z0 interfaceC10741z0) {
        if (interfaceC10609m == null) {
            m37849v(5);
        }
        if (interfaceC10620g == null) {
            m37849v(6);
        }
        if (c10163f == null) {
            m37849v(7);
        }
        if (aVar == null) {
            m37849v(8);
        }
        if (interfaceC10741z0 == null) {
            m37849v(9);
        }
        return new C10650g0(interfaceC10609m, null, interfaceC10620g, c10163f, aVar, interfaceC10741z0);
    }

    /* renamed from: v */
    private static /* synthetic */ void m37849v(int i2) {
        String str = (i2 == 13 || i2 == 18 || i2 == 23 || i2 == 24 || i2 == 29 || i2 == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i2 == 13 || i2 == 18 || i2 == 23 || i2 == 24 || i2 == 29 || i2 == 30) ? 2 : 3];
        switch (i2) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 28:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
        }
        if (i2 == 13 || i2 == 18 || i2 == 23) {
            objArr[1] = "initialize";
        } else if (i2 == 24) {
            objArr[1] = "getOriginal";
        } else if (i2 == 29) {
            objArr[1] = "copy";
        } else if (i2 != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i2) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                break;
            case 25:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i2 != 13 && i2 != 18 && i2 != 23 && i2 != 24 && i2 != 29 && i2 != 30) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10666p
    /* renamed from: M0 */
    protected AbstractC10666p mo32906M0(InterfaceC10609m interfaceC10609m, InterfaceC10738y interfaceC10738y, InterfaceC10576b.a aVar, C10163f c10163f, InterfaceC10620g interfaceC10620g, InterfaceC10741z0 interfaceC10741z0) {
        if (interfaceC10609m == null) {
            m37849v(25);
        }
        if (aVar == null) {
            m37849v(26);
        }
        if (interfaceC10620g == null) {
            m37849v(27);
        }
        if (interfaceC10741z0 == null) {
            m37849v(28);
        }
        InterfaceC10739y0 interfaceC10739y0 = (InterfaceC10739y0) interfaceC10738y;
        if (c10163f == null) {
            c10163f = getName();
        }
        return new C10650g0(interfaceC10609m, interfaceC10739y0, interfaceC10620g, c10163f, aVar, interfaceC10741z0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10666p, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b
    /* renamed from: l1, reason: merged with bridge method [inline-methods] */
    public InterfaceC10739y0 mo36990k0(InterfaceC10609m interfaceC10609m, EnumC10583d0 enumC10583d0, AbstractC10730u abstractC10730u, InterfaceC10576b.a aVar, boolean z) {
        InterfaceC10739y0 interfaceC10739y0 = (InterfaceC10739y0) super.mo36990k0(interfaceC10609m, enumC10583d0, abstractC10730u, aVar, z);
        if (interfaceC10739y0 == null) {
            m37849v(29);
        }
        return interfaceC10739y0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10666p, kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10657k, kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10655j, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m
    /* renamed from: n1, reason: merged with bridge method [inline-methods] */
    public InterfaceC10739y0 mo37019a() {
        InterfaceC10739y0 interfaceC10739y0 = (InterfaceC10739y0) super.mo37019a();
        if (interfaceC10739y0 == null) {
            m37849v(24);
        }
        return interfaceC10739y0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10666p
    /* renamed from: o1, reason: merged with bridge method [inline-methods] */
    public C10650g0 mo37850S0(InterfaceC10735w0 interfaceC10735w0, InterfaceC10735w0 interfaceC10735w02, List<InterfaceC10735w0> list, List<? extends InterfaceC10587e1> list2, List<InterfaceC10599i1> list3, AbstractC10344e0 abstractC10344e0, EnumC10583d0 enumC10583d0, AbstractC10730u abstractC10730u) {
        if (list == null) {
            m37849v(14);
        }
        if (list2 == null) {
            m37849v(15);
        }
        if (list3 == null) {
            m37849v(16);
        }
        if (abstractC10730u == null) {
            m37849v(17);
        }
        C10650g0 c10650g0Mo33214p1 = mo33214p1(interfaceC10735w0, interfaceC10735w02, list, list2, list3, abstractC10344e0, enumC10583d0, abstractC10730u, null);
        if (c10650g0Mo33214p1 == null) {
            m37849v(18);
        }
        return c10650g0Mo33214p1;
    }

    /* renamed from: p1 */
    public C10650g0 mo33214p1(InterfaceC10735w0 interfaceC10735w0, InterfaceC10735w0 interfaceC10735w02, List<InterfaceC10735w0> list, List<? extends InterfaceC10587e1> list2, List<InterfaceC10599i1> list3, AbstractC10344e0 abstractC10344e0, EnumC10583d0 enumC10583d0, AbstractC10730u abstractC10730u, Map<? extends InterfaceC10573a.a<?>, ?> map) {
        if (list == null) {
            m37849v(19);
        }
        if (list2 == null) {
            m37849v(20);
        }
        if (list3 == null) {
            m37849v(21);
        }
        if (abstractC10730u == null) {
            m37849v(22);
        }
        super.mo37850S0(interfaceC10735w0, interfaceC10735w02, list, list2, list3, abstractC10344e0, enumC10583d0, abstractC10730u);
        if (map != null && !map.isEmpty()) {
            this.f41039I = new LinkedHashMap(map);
        }
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10666p, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10739y0
    /* renamed from: u */
    public InterfaceC10738y.a<? extends InterfaceC10739y0> mo36992u() {
        InterfaceC10738y.a aVarMo36992u = super.mo36992u();
        if (aVarMo36992u == null) {
            m37849v(30);
        }
        return aVarMo36992u;
    }
}
