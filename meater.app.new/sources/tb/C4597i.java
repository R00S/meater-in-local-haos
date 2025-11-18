package tb;

import Hb.M0;
import Hb.U;
import Hb.Y;
import Hb.y0;
import Ra.AbstractC1707u;
import Ra.C1706t;
import Ra.E;
import Ra.EnumC1693f;
import Ra.H;
import Ra.InterfaceC1688a;
import Ra.InterfaceC1689b;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1695h;
import Ra.InterfaceC1700m;
import Ra.InterfaceC1703p;
import Ra.InterfaceC1704q;
import Ra.N;
import Ra.V;
import Ra.b0;
import Ra.c0;
import Ra.i0;
import Ra.u0;
import com.apptionlabs.meater_app.data.Config;
import com.apptionlabs.meater_app.data.Temperature;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import xb.C5087e;

/* compiled from: DescriptorUtils.java */
/* renamed from: tb.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4597i {

    /* renamed from: a, reason: collision with root package name */
    public static final qb.c f50014a = new qb.c("kotlin.jvm.JvmName");

    public static boolean A(InterfaceC1700m interfaceC1700m) {
        return D(interfaceC1700m, EnumC1693f.f15145E);
    }

    public static boolean B(InterfaceC1700m interfaceC1700m) {
        if (interfaceC1700m == null) {
            a(36);
        }
        return D(interfaceC1700m, EnumC1693f.f15146F);
    }

    public static boolean C(InterfaceC1700m interfaceC1700m) {
        return D(interfaceC1700m, EnumC1693f.f15144D);
    }

    private static boolean D(InterfaceC1700m interfaceC1700m, EnumC1693f enumC1693f) {
        if (enumC1693f == null) {
            a(37);
        }
        return (interfaceC1700m instanceof InterfaceC1692e) && ((InterfaceC1692e) interfaceC1700m).i() == enumC1693f;
    }

    public static boolean E(InterfaceC1700m interfaceC1700m) {
        if (interfaceC1700m == null) {
            a(1);
        }
        while (interfaceC1700m != null) {
            if (u(interfaceC1700m) || y(interfaceC1700m)) {
                return true;
            }
            interfaceC1700m = interfaceC1700m.c();
        }
        return false;
    }

    private static boolean F(U u10, InterfaceC1700m interfaceC1700m) {
        if (u10 == null) {
            a(30);
        }
        if (interfaceC1700m == null) {
            a(31);
        }
        InterfaceC1695h interfaceC1695hT = u10.O0().t();
        if (interfaceC1695hT == null) {
            return false;
        }
        InterfaceC1700m interfaceC1700mB = interfaceC1695hT.L0();
        return (interfaceC1700mB instanceof InterfaceC1695h) && (interfaceC1700m instanceof InterfaceC1695h) && ((InterfaceC1695h) interfaceC1700m).l().equals(((InterfaceC1695h) interfaceC1700mB).l());
    }

    public static boolean G(InterfaceC1700m interfaceC1700m) {
        return (D(interfaceC1700m, EnumC1693f.f15143C) || D(interfaceC1700m, EnumC1693f.f15144D)) && ((InterfaceC1692e) interfaceC1700m).m() == E.f15107D;
    }

    public static boolean H(InterfaceC1692e interfaceC1692e, InterfaceC1692e interfaceC1692e2) {
        if (interfaceC1692e == null) {
            a(28);
        }
        if (interfaceC1692e2 == null) {
            a(29);
        }
        return I(interfaceC1692e.u(), interfaceC1692e2.L0());
    }

    public static boolean I(U u10, InterfaceC1700m interfaceC1700m) {
        if (u10 == null) {
            a(32);
        }
        if (interfaceC1700m == null) {
            a(33);
        }
        if (F(u10, interfaceC1700m)) {
            return true;
        }
        Iterator<U> it = u10.O0().s().iterator();
        while (it.hasNext()) {
            if (I(it.next(), interfaceC1700m)) {
                return true;
            }
        }
        return false;
    }

    public static boolean J(InterfaceC1700m interfaceC1700m) {
        return interfaceC1700m != null && (interfaceC1700m.c() instanceof N);
    }

    public static boolean K(u0 u0Var, U u10) {
        if (u0Var == null) {
            a(66);
        }
        if (u10 == null) {
            a(67);
        }
        if (u0Var.h0() || Y.a(u10)) {
            return false;
        }
        if (M0.b(u10)) {
            return true;
        }
        Oa.j jVarM = C5087e.m(u0Var);
        if (!Oa.j.s0(u10)) {
            Ib.e eVar = Ib.e.f6980a;
            if (!eVar.c(jVarM.W(), u10) && !eVar.c(jVarM.K().u(), u10) && !eVar.c(jVarM.i(), u10) && !Oa.t.d(u10)) {
                return false;
            }
        }
        return true;
    }

    public static <D extends InterfaceC1689b> D L(D d10) {
        if (d10 == null) {
            a(59);
        }
        while (d10.i() == InterfaceC1689b.a.FAKE_OVERRIDE) {
            Collection<? extends InterfaceC1689b> collectionG = d10.g();
            if (collectionG.isEmpty()) {
                throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + d10);
            }
            d10 = (D) collectionG.iterator().next();
        }
        return d10;
    }

    public static <D extends InterfaceC1704q> D M(D d10) {
        if (d10 == null) {
            a(64);
        }
        if (d10 instanceof InterfaceC1689b) {
            return L((InterfaceC1689b) d10);
        }
        if (d10 == null) {
            a(65);
        }
        return d10;
    }

    private static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case 7:
            case 9:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case Temperature.MAX_AMBIENT_BLOCK /* 60 */:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 7:
            case 9:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case Temperature.MAX_AMBIENT_BLOCK /* 60 */:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 15:
            case 21:
            case 23:
            case 24:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 59:
            case 61:
            case 64:
            case 82:
            case 95:
            case 97:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case Temperature.MAX_AMBIENT_BLOCK /* 60 */:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case Config.NEED_HELP_PROBE_TOTAL_DISCONNECTIONS_THRESHOLD /* 30 */:
            case 32:
            case 45:
            case 67:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case 48:
            case 54:
            case 68:
            case 69:
            case 70:
            case 77:
            case 78:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 66:
                objArr[0] = "variable";
                break;
            case 71:
                objArr[0] = "f";
                break;
            case 73:
                objArr[0] = "current";
                break;
            case 74:
                objArr[0] = "result";
                break;
            case 75:
                objArr[0] = "memberDescriptor";
                break;
            case 79:
            case 80:
            case 81:
                objArr[0] = "annotated";
                break;
            case 85:
            case 87:
            case Temperature.MAX_TEMPERATURE_FOR_ESTIMATE /* 90 */:
            case 92:
                objArr[0] = "scope";
                break;
            case 88:
            case 91:
            case 93:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case Temperature.MAX_AMBIENT_BLOCK /* 60 */:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 62:
            case 63:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case 65:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 72:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 76:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 83:
            case 84:
                objArr[1] = "getContainingSourceFile";
                break;
            case 86:
                objArr[1] = "getAllDescriptors";
                break;
            case 89:
                objArr[1] = "getFunctionByName";
                break;
            case 94:
                objArr[1] = "getPropertyByName";
                break;
            case 96:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i10) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case Temperature.MAX_AMBIENT_BLOCK /* 60 */:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case Config.NEED_HELP_PROBE_TOTAL_DISCONNECTIONS_THRESHOLD /* 30 */:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "isTopLevelOrInnerClass";
                break;
            case 59:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 61:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case 64:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 66:
            case 67:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 69:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 70:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 71:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 73:
            case 74:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 75:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 77:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 78:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 79:
                objArr[2] = "getJvmName";
                break;
            case 80:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 81:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 82:
                objArr[2] = "getContainingSourceFile";
                break;
            case 85:
                objArr[2] = "getAllDescriptors";
                break;
            case 87:
            case 88:
                objArr[2] = "getFunctionByName";
                break;
            case Temperature.MAX_TEMPERATURE_FOR_ESTIMATE /* 90 */:
            case 91:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 92:
            case 93:
                objArr[2] = "getPropertyByName";
                break;
            case 95:
                objArr[2] = "getDirectMember";
                break;
            case 97:
                objArr[2] = "isMethodOfAny";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 7:
            case 9:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case Temperature.MAX_AMBIENT_BLOCK /* 60 */:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static boolean b(InterfaceC1700m interfaceC1700m, InterfaceC1700m interfaceC1700m2) {
        if (interfaceC1700m == null) {
            a(16);
        }
        if (interfaceC1700m2 == null) {
            a(17);
        }
        return g(interfaceC1700m).equals(g(interfaceC1700m2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <D extends InterfaceC1688a> void c(D d10, Set<D> set) {
        if (d10 == null) {
            a(73);
        }
        if (set == 0) {
            a(74);
        }
        if (set.contains(d10)) {
            return;
        }
        Iterator<? extends InterfaceC1688a> it = d10.L0().g().iterator();
        while (it.hasNext()) {
            InterfaceC1688a interfaceC1688aB = it.next().L0();
            c(interfaceC1688aB, set);
            set.add(interfaceC1688aB);
        }
    }

    public static <D extends InterfaceC1688a> Set<D> d(D d10) {
        if (d10 == null) {
            a(71);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        c(d10.L0(), linkedHashSet);
        return linkedHashSet;
    }

    public static InterfaceC1692e e(U u10) {
        if (u10 == null) {
            a(45);
        }
        return f(u10.O0());
    }

    public static InterfaceC1692e f(y0 y0Var) {
        if (y0Var == null) {
            a(46);
        }
        InterfaceC1692e interfaceC1692e = (InterfaceC1692e) y0Var.t();
        if (interfaceC1692e == null) {
            a(47);
        }
        return interfaceC1692e;
    }

    public static H g(InterfaceC1700m interfaceC1700m) {
        if (interfaceC1700m == null) {
            a(21);
        }
        H hI = i(interfaceC1700m);
        if (hI == null) {
            a(22);
        }
        return hI;
    }

    public static H h(U u10) {
        if (u10 == null) {
            a(20);
        }
        InterfaceC1695h interfaceC1695hT = u10.O0().t();
        if (interfaceC1695hT == null) {
            return null;
        }
        return i(interfaceC1695hT);
    }

    public static H i(InterfaceC1700m interfaceC1700m) {
        if (interfaceC1700m == null) {
            a(23);
        }
        while (interfaceC1700m != null) {
            if (interfaceC1700m instanceof H) {
                return (H) interfaceC1700m;
            }
            if (interfaceC1700m instanceof V) {
                return ((V) interfaceC1700m).s0();
            }
            interfaceC1700m = interfaceC1700m.c();
        }
        return null;
    }

    public static i0 j(InterfaceC1700m interfaceC1700m) {
        if (interfaceC1700m == null) {
            a(82);
        }
        if (interfaceC1700m instanceof b0) {
            interfaceC1700m = ((b0) interfaceC1700m).A0();
        }
        if (interfaceC1700m instanceof InterfaceC1703p) {
            i0 i0VarA = ((InterfaceC1703p) interfaceC1700m).j().a();
            if (i0VarA == null) {
                a(83);
            }
            return i0VarA;
        }
        i0 i0Var = i0.f15159a;
        if (i0Var == null) {
            a(84);
        }
        return i0Var;
    }

    public static AbstractC1707u k(InterfaceC1692e interfaceC1692e, boolean z10) {
        if (interfaceC1692e == null) {
            a(48);
        }
        EnumC1693f enumC1693fI = interfaceC1692e.i();
        if (enumC1693fI == EnumC1693f.f15145E || enumC1693fI.j()) {
            AbstractC1707u abstractC1707u = C1706t.f15166a;
            if (abstractC1707u == null) {
                a(49);
            }
            return abstractC1707u;
        }
        if (G(interfaceC1692e)) {
            if (z10) {
                AbstractC1707u abstractC1707u2 = C1706t.f15168c;
                if (abstractC1707u2 == null) {
                    a(50);
                }
                return abstractC1707u2;
            }
            AbstractC1707u abstractC1707u3 = C1706t.f15166a;
            if (abstractC1707u3 == null) {
                a(51);
            }
            return abstractC1707u3;
        }
        if (u(interfaceC1692e)) {
            AbstractC1707u abstractC1707u4 = C1706t.f15177l;
            if (abstractC1707u4 == null) {
                a(52);
            }
            return abstractC1707u4;
        }
        AbstractC1707u abstractC1707u5 = C1706t.f15170e;
        if (abstractC1707u5 == null) {
            a(53);
        }
        return abstractC1707u5;
    }

    public static c0 l(InterfaceC1700m interfaceC1700m) {
        if (interfaceC1700m == null) {
            a(0);
        }
        if (interfaceC1700m instanceof InterfaceC1692e) {
            return ((InterfaceC1692e) interfaceC1700m).K0();
        }
        return null;
    }

    public static qb.d m(InterfaceC1700m interfaceC1700m) {
        if (interfaceC1700m == null) {
            a(2);
        }
        qb.c cVarO = o(interfaceC1700m);
        return cVarO != null ? cVarO.j() : p(interfaceC1700m);
    }

    public static qb.c n(InterfaceC1700m interfaceC1700m) {
        if (interfaceC1700m == null) {
            a(3);
        }
        qb.c cVarO = o(interfaceC1700m);
        if (cVarO == null) {
            cVarO = p(interfaceC1700m).l();
        }
        if (cVarO == null) {
            a(4);
        }
        return cVarO;
    }

    private static qb.c o(InterfaceC1700m interfaceC1700m) {
        if (interfaceC1700m == null) {
            a(5);
        }
        if ((interfaceC1700m instanceof H) || Jb.l.m(interfaceC1700m)) {
            return qb.c.f48182c;
        }
        if (interfaceC1700m instanceof V) {
            return ((V) interfaceC1700m).f();
        }
        if (interfaceC1700m instanceof N) {
            return ((N) interfaceC1700m).f();
        }
        return null;
    }

    private static qb.d p(InterfaceC1700m interfaceC1700m) {
        if (interfaceC1700m == null) {
            a(6);
        }
        qb.d dVarC = m(interfaceC1700m.c()).c(interfaceC1700m.getName());
        if (dVarC == null) {
            a(7);
        }
        return dVarC;
    }

    public static <D extends InterfaceC1700m> D q(InterfaceC1700m interfaceC1700m, Class<D> cls) {
        if (cls == null) {
            a(18);
        }
        return (D) r(interfaceC1700m, cls, true);
    }

    public static <D extends InterfaceC1700m> D r(InterfaceC1700m interfaceC1700m, Class<D> cls, boolean z10) {
        if (cls == null) {
            a(19);
        }
        if (interfaceC1700m == null) {
            return null;
        }
        if (z10) {
            interfaceC1700m = (D) interfaceC1700m.c();
        }
        while (interfaceC1700m != null) {
            if (cls.isInstance(interfaceC1700m)) {
                return (D) interfaceC1700m;
            }
            interfaceC1700m = (D) interfaceC1700m.c();
        }
        return null;
    }

    public static InterfaceC1692e s(InterfaceC1692e interfaceC1692e) {
        if (interfaceC1692e == null) {
            a(44);
        }
        Iterator<U> it = interfaceC1692e.l().s().iterator();
        while (it.hasNext()) {
            InterfaceC1692e interfaceC1692eE = e(it.next());
            if (interfaceC1692eE.i() != EnumC1693f.f15144D) {
                return interfaceC1692eE;
            }
        }
        return null;
    }

    public static boolean t(InterfaceC1700m interfaceC1700m) {
        return D(interfaceC1700m, EnumC1693f.f15147G);
    }

    public static boolean u(InterfaceC1700m interfaceC1700m) {
        if (interfaceC1700m == null) {
            a(34);
        }
        return v(interfaceC1700m) && interfaceC1700m.getName().equals(qb.h.f48199b);
    }

    public static boolean v(InterfaceC1700m interfaceC1700m) {
        return D(interfaceC1700m, EnumC1693f.f15143C);
    }

    public static boolean w(InterfaceC1700m interfaceC1700m) {
        return v(interfaceC1700m) || A(interfaceC1700m);
    }

    public static boolean x(InterfaceC1700m interfaceC1700m) {
        return D(interfaceC1700m, EnumC1693f.f15148H) && ((InterfaceC1692e) interfaceC1700m).y();
    }

    public static boolean y(InterfaceC1700m interfaceC1700m) {
        return (interfaceC1700m instanceof InterfaceC1704q) && ((InterfaceC1704q) interfaceC1700m).getVisibility() == C1706t.f15171f;
    }

    public static boolean z(InterfaceC1692e interfaceC1692e, InterfaceC1692e interfaceC1692e2) {
        if (interfaceC1692e == null) {
            a(26);
        }
        if (interfaceC1692e2 == null) {
            a(27);
        }
        Iterator<U> it = interfaceC1692e.l().s().iterator();
        while (it.hasNext()) {
            if (F(it.next(), interfaceC1692e2.L0())) {
                return true;
            }
        }
        return false;
    }
}
