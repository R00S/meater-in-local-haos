package kotlin.reflect.p371y.internal.p374j0.p400i;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10730u;
import kotlin.reflect.jvm.internal.impl.descriptors.C10728t;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10583d0;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10588f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10575a1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10602j1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10604k0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10635p;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10636p0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10677q;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10733v0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10735w0;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9914h;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9921o;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10161d;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10165h;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10350g0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10372n1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.InterfaceC10394e;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10427k;

/* compiled from: DescriptorUtils.java */
/* renamed from: kotlin.f0.y.e.j0.i.d */
/* loaded from: classes3.dex */
public class C10187d {

    /* renamed from: a */
    public static final C10160c f39506a = new C10160c("kotlin.jvm.JvmName");

    /* renamed from: A */
    public static boolean m35800A(InterfaceC10609m interfaceC10609m) {
        return m35803D(interfaceC10609m, EnumC10588f.ENUM_CLASS);
    }

    /* renamed from: B */
    public static boolean m35801B(InterfaceC10609m interfaceC10609m) {
        if (interfaceC10609m == null) {
            m35813a(36);
        }
        return m35803D(interfaceC10609m, EnumC10588f.ENUM_ENTRY);
    }

    /* renamed from: C */
    public static boolean m35802C(InterfaceC10609m interfaceC10609m) {
        return m35803D(interfaceC10609m, EnumC10588f.INTERFACE);
    }

    /* renamed from: D */
    private static boolean m35803D(InterfaceC10609m interfaceC10609m, EnumC10588f enumC10588f) {
        if (enumC10588f == null) {
            m35813a(37);
        }
        return (interfaceC10609m instanceof InterfaceC10585e) && ((InterfaceC10585e) interfaceC10609m).mo32878i() == enumC10588f;
    }

    /* renamed from: E */
    public static boolean m35804E(InterfaceC10609m interfaceC10609m) {
        if (interfaceC10609m == null) {
            m35813a(1);
        }
        while (interfaceC10609m != null) {
            if (m35833u(interfaceC10609m) || m35837y(interfaceC10609m)) {
                return true;
            }
            interfaceC10609m = interfaceC10609m.mo32876b();
        }
        return false;
    }

    /* renamed from: F */
    private static boolean m35805F(AbstractC10344e0 abstractC10344e0, InterfaceC10609m interfaceC10609m) {
        if (abstractC10344e0 == null) {
            m35813a(30);
        }
        if (interfaceC10609m == null) {
            m35813a(31);
        }
        InterfaceC10594h interfaceC10594hMo32887c = abstractC10344e0.mo35993O0().mo32887c();
        if (interfaceC10594hMo32887c == null) {
            return false;
        }
        InterfaceC10609m interfaceC10609mMo37019a = interfaceC10594hMo32887c.mo37019a();
        return (interfaceC10609mMo37019a instanceof InterfaceC10594h) && (interfaceC10609m instanceof InterfaceC10594h) && ((InterfaceC10594h) interfaceC10609m).mo32877h().equals(((InterfaceC10594h) interfaceC10609mMo37019a).mo32877h());
    }

    /* renamed from: G */
    public static boolean m35806G(InterfaceC10609m interfaceC10609m) {
        return (m35803D(interfaceC10609m, EnumC10588f.CLASS) || m35803D(interfaceC10609m, EnumC10588f.INTERFACE)) && ((InterfaceC10585e) interfaceC10609m).mo32879j() == EnumC10583d0.SEALED;
    }

    /* renamed from: H */
    public static boolean m35807H(InterfaceC10585e interfaceC10585e, InterfaceC10585e interfaceC10585e2) {
        if (interfaceC10585e == null) {
            m35813a(28);
        }
        if (interfaceC10585e2 == null) {
            m35813a(29);
        }
        return m35808I(interfaceC10585e.mo36400s(), interfaceC10585e2.mo37019a());
    }

    /* renamed from: I */
    public static boolean m35808I(AbstractC10344e0 abstractC10344e0, InterfaceC10609m interfaceC10609m) {
        if (abstractC10344e0 == null) {
            m35813a(32);
        }
        if (interfaceC10609m == null) {
            m35813a(33);
        }
        if (m35805F(abstractC10344e0, interfaceC10609m)) {
            return true;
        }
        Iterator<AbstractC10344e0> it = abstractC10344e0.mo35993O0().mo35998a().iterator();
        while (it.hasNext()) {
            if (m35808I(it.next(), interfaceC10609m)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: J */
    public static boolean m35809J(InterfaceC10609m interfaceC10609m) {
        return interfaceC10609m != null && (interfaceC10609m.mo32876b() instanceof InterfaceC10604k0);
    }

    /* renamed from: K */
    public static boolean m35810K(InterfaceC10602j1 interfaceC10602j1, AbstractC10344e0 abstractC10344e0) {
        if (interfaceC10602j1 == null) {
            m35813a(63);
        }
        if (abstractC10344e0 == null) {
            m35813a(64);
        }
        if (interfaceC10602j1.mo37031j0() || C10350g0.m36706a(abstractC10344e0)) {
            return false;
        }
        if (C10372n1.m36769b(abstractC10344e0)) {
            return true;
        }
        AbstractC9914h abstractC9914hM36072f = C10235a.m36072f(interfaceC10602j1);
        if (!AbstractC9914h.m32757r0(abstractC10344e0)) {
            InterfaceC10394e interfaceC10394e = InterfaceC10394e.f40181a;
            if (!interfaceC10394e.mo36919b(abstractC9914hM36072f.m32784W(), abstractC10344e0) && !interfaceC10394e.mo36919b(abstractC9914hM36072f.m32776K().mo36400s(), abstractC10344e0) && !interfaceC10394e.mo36919b(abstractC9914hM36072f.m32791i(), abstractC10344e0)) {
                C9921o c9921o = C9921o.f37628a;
                if (!C9921o.m32844d(abstractC10344e0)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: L */
    public static <D extends InterfaceC10576b> D m35811L(D d2) {
        if (d2 == null) {
            m35813a(59);
        }
        while (d2.mo37030i() == InterfaceC10576b.a.FAKE_OVERRIDE) {
            Collection<? extends InterfaceC10576b> collectionMo37027e = d2.mo37027e();
            if (collectionMo37027e.isEmpty()) {
                throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + d2);
            }
            d2 = (D) collectionMo37027e.iterator().next();
        }
        return d2;
    }

    /* renamed from: M */
    public static <D extends InterfaceC10677q> D m35812M(D d2) {
        if (d2 == null) {
            m35813a(61);
        }
        if (d2 instanceof InterfaceC10576b) {
            return m35811L((InterfaceC10576b) d2);
        }
        if (d2 == null) {
            m35813a(62);
        }
        return d2;
    }

    /* renamed from: a */
    private static /* synthetic */ void m35813a(int i2) {
        String str;
        int i3;
        switch (i2) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
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
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i2) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
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
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                i3 = 2;
                break;
            default:
                i3 = 3;
                break;
        }
        Object[] objArr = new Object[i3];
        switch (i2) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
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
            case 79:
            case 92:
            case 94:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
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
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
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
            case 30:
            case 32:
            case 45:
            case 64:
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
            case 65:
            case 66:
            case 67:
            case 74:
            case 75:
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
            case 63:
                objArr[0] = "variable";
                break;
            case 68:
                objArr[0] = "f";
                break;
            case 70:
                objArr[0] = "current";
                break;
            case 71:
                objArr[0] = "result";
                break;
            case 72:
                objArr[0] = "memberDescriptor";
                break;
            case 76:
            case 77:
            case 78:
                objArr[0] = "annotated";
                break;
            case 82:
            case 84:
            case 87:
            case 89:
                objArr[0] = "scope";
                break;
            case 85:
            case 88:
            case 90:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i2) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
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
            case 60:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 62:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 69:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 73:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 80:
            case 81:
                objArr[1] = "getContainingSourceFile";
                break;
            case 83:
                objArr[1] = "getAllDescriptors";
                break;
            case 86:
                objArr[1] = "getFunctionByName";
                break;
            case 91:
                objArr[1] = "getPropertyByName";
                break;
            case 93:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i2) {
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
            case 10:
            case 12:
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
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
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
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
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
            case 30:
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
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 63:
            case 64:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 65:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 66:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 67:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 68:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 70:
            case 71:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 72:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 74:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 75:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 76:
                objArr[2] = "getJvmName";
                break;
            case 77:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 78:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 79:
                objArr[2] = "getContainingSourceFile";
                break;
            case 82:
                objArr[2] = "getAllDescriptors";
                break;
            case 84:
            case 85:
                objArr[2] = "getFunctionByName";
                break;
            case 87:
            case 88:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 89:
            case 90:
                objArr[2] = "getPropertyByName";
                break;
            case 92:
                objArr[2] = "getDirectMember";
                break;
            case 94:
                objArr[2] = "isMethodOfAny";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i2) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
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
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: b */
    public static boolean m35814b(InterfaceC10609m interfaceC10609m, InterfaceC10609m interfaceC10609m2) {
        if (interfaceC10609m == null) {
            m35813a(16);
        }
        if (interfaceC10609m2 == null) {
            m35813a(17);
        }
        return m35819g(interfaceC10609m).equals(m35819g(interfaceC10609m2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    private static <D extends InterfaceC10573a> void m35815c(D d2, Set<D> set) {
        if (d2 == null) {
            m35813a(70);
        }
        if (set == 0) {
            m35813a(71);
        }
        if (set.contains(d2)) {
            return;
        }
        Iterator<? extends InterfaceC10573a> it = d2.mo37019a().mo37027e().iterator();
        while (it.hasNext()) {
            InterfaceC10573a interfaceC10573aMo37019a = it.next().mo37019a();
            m35815c(interfaceC10573aMo37019a, set);
            set.add(interfaceC10573aMo37019a);
        }
    }

    /* renamed from: d */
    public static <D extends InterfaceC10573a> Set<D> m35816d(D d2) {
        if (d2 == null) {
            m35813a(68);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m35815c(d2.mo37019a(), linkedHashSet);
        return linkedHashSet;
    }

    /* renamed from: e */
    public static InterfaceC10585e m35817e(AbstractC10344e0 abstractC10344e0) {
        if (abstractC10344e0 == null) {
            m35813a(45);
        }
        return m35818f(abstractC10344e0.mo35993O0());
    }

    /* renamed from: f */
    public static InterfaceC10585e m35818f(InterfaceC10345e1 interfaceC10345e1) {
        if (interfaceC10345e1 == null) {
            m35813a(46);
        }
        InterfaceC10585e interfaceC10585e = (InterfaceC10585e) interfaceC10345e1.mo32887c();
        if (interfaceC10585e == null) {
            m35813a(47);
        }
        return interfaceC10585e;
    }

    /* renamed from: g */
    public static InterfaceC10592g0 m35819g(InterfaceC10609m interfaceC10609m) {
        if (interfaceC10609m == null) {
            m35813a(21);
        }
        InterfaceC10592g0 interfaceC10592g0M35820h = m35820h(interfaceC10609m);
        if (interfaceC10592g0M35820h == null) {
            m35813a(22);
        }
        return interfaceC10592g0M35820h;
    }

    /* renamed from: h */
    public static InterfaceC10592g0 m35820h(InterfaceC10609m interfaceC10609m) {
        if (interfaceC10609m == null) {
            m35813a(23);
        }
        while (interfaceC10609m != null) {
            if (interfaceC10609m instanceof InterfaceC10592g0) {
                return (InterfaceC10592g0) interfaceC10609m;
            }
            if (interfaceC10609m instanceof InterfaceC10636p0) {
                return ((InterfaceC10636p0) interfaceC10609m).mo37752v0();
            }
            interfaceC10609m = interfaceC10609m.mo32876b();
        }
        return null;
    }

    /* renamed from: i */
    public static InterfaceC10592g0 m35821i(AbstractC10344e0 abstractC10344e0) {
        if (abstractC10344e0 == null) {
            m35813a(20);
        }
        InterfaceC10594h interfaceC10594hMo32887c = abstractC10344e0.mo35993O0().mo32887c();
        if (interfaceC10594hMo32887c == null) {
            return null;
        }
        return m35820h(interfaceC10594hMo32887c);
    }

    /* renamed from: j */
    public static InterfaceC10575a1 m35822j(InterfaceC10609m interfaceC10609m) {
        if (interfaceC10609m == null) {
            m35813a(79);
        }
        if (interfaceC10609m instanceof InterfaceC10733v0) {
            interfaceC10609m = ((InterfaceC10733v0) interfaceC10609m).mo37763B0();
        }
        if (interfaceC10609m instanceof InterfaceC10635p) {
            InterfaceC10575a1 interfaceC10575a1Mo33980a = ((InterfaceC10635p) interfaceC10609m).mo32883t().mo33980a();
            if (interfaceC10575a1Mo33980a == null) {
                m35813a(80);
            }
            return interfaceC10575a1Mo33980a;
        }
        InterfaceC10575a1 interfaceC10575a1 = InterfaceC10575a1.f40728a;
        if (interfaceC10575a1 == null) {
            m35813a(81);
        }
        return interfaceC10575a1;
    }

    /* renamed from: k */
    public static AbstractC10730u m35823k(InterfaceC10585e interfaceC10585e, boolean z) {
        if (interfaceC10585e == null) {
            m35813a(48);
        }
        EnumC10588f enumC10588fMo32878i = interfaceC10585e.mo32878i();
        if (enumC10588fMo32878i == EnumC10588f.ENUM_CLASS || enumC10588fMo32878i.m37681k()) {
            AbstractC10730u abstractC10730u = C10728t.f41216a;
            if (abstractC10730u == null) {
                m35813a(49);
            }
            return abstractC10730u;
        }
        if (m35806G(interfaceC10585e)) {
            if (z) {
                AbstractC10730u abstractC10730u2 = C10728t.f41218c;
                if (abstractC10730u2 == null) {
                    m35813a(50);
                }
                return abstractC10730u2;
            }
            AbstractC10730u abstractC10730u3 = C10728t.f41216a;
            if (abstractC10730u3 == null) {
                m35813a(51);
            }
            return abstractC10730u3;
        }
        if (m35833u(interfaceC10585e)) {
            AbstractC10730u abstractC10730u4 = C10728t.f41227l;
            if (abstractC10730u4 == null) {
                m35813a(52);
            }
            return abstractC10730u4;
        }
        AbstractC10730u abstractC10730u5 = C10728t.f41220e;
        if (abstractC10730u5 == null) {
            m35813a(53);
        }
        return abstractC10730u5;
    }

    /* renamed from: l */
    public static InterfaceC10735w0 m35824l(InterfaceC10609m interfaceC10609m) {
        if (interfaceC10609m == null) {
            m35813a(0);
        }
        if (interfaceC10609m instanceof InterfaceC10585e) {
            return ((InterfaceC10585e) interfaceC10609m).mo37677K0();
        }
        return null;
    }

    /* renamed from: m */
    public static C10161d m35825m(InterfaceC10609m interfaceC10609m) {
        if (interfaceC10609m == null) {
            m35813a(2);
        }
        C10160c c10160cM35827o = m35827o(interfaceC10609m);
        return c10160cM35827o != null ? c10160cM35827o.m35428j() : m35828p(interfaceC10609m);
    }

    /* renamed from: n */
    public static C10160c m35826n(InterfaceC10609m interfaceC10609m) {
        if (interfaceC10609m == null) {
            m35813a(3);
        }
        C10160c c10160cM35827o = m35827o(interfaceC10609m);
        if (c10160cM35827o == null) {
            c10160cM35827o = m35828p(interfaceC10609m).m35441l();
        }
        if (c10160cM35827o == null) {
            m35813a(4);
        }
        return c10160cM35827o;
    }

    /* renamed from: o */
    private static C10160c m35827o(InterfaceC10609m interfaceC10609m) {
        if (interfaceC10609m == null) {
            m35813a(5);
        }
        if ((interfaceC10609m instanceof InterfaceC10592g0) || C10427k.m37054m(interfaceC10609m)) {
            return C10160c.f39250a;
        }
        if (interfaceC10609m instanceof InterfaceC10636p0) {
            return ((InterfaceC10636p0) interfaceC10609m).mo37750d();
        }
        if (interfaceC10609m instanceof InterfaceC10604k0) {
            return ((InterfaceC10604k0) interfaceC10609m).mo37712d();
        }
        return null;
    }

    /* renamed from: p */
    private static C10161d m35828p(InterfaceC10609m interfaceC10609m) {
        if (interfaceC10609m == null) {
            m35813a(6);
        }
        C10161d c10161dM35433c = m35825m(interfaceC10609m.mo32876b()).m35433c(interfaceC10609m.getName());
        if (c10161dM35433c == null) {
            m35813a(7);
        }
        return c10161dM35433c;
    }

    /* renamed from: q */
    public static <D extends InterfaceC10609m> D m35829q(InterfaceC10609m interfaceC10609m, Class<D> cls) {
        if (cls == null) {
            m35813a(18);
        }
        return (D) m35830r(interfaceC10609m, cls, true);
    }

    /* renamed from: r */
    public static <D extends InterfaceC10609m> D m35830r(InterfaceC10609m interfaceC10609m, Class<D> cls, boolean z) {
        if (cls == null) {
            m35813a(19);
        }
        if (interfaceC10609m == null) {
            return null;
        }
        if (z) {
            interfaceC10609m = (D) interfaceC10609m.mo32876b();
        }
        while (interfaceC10609m != null) {
            if (cls.isInstance(interfaceC10609m)) {
                return (D) interfaceC10609m;
            }
            interfaceC10609m = (D) interfaceC10609m.mo32876b();
        }
        return null;
    }

    /* renamed from: s */
    public static InterfaceC10585e m35831s(InterfaceC10585e interfaceC10585e) {
        if (interfaceC10585e == null) {
            m35813a(44);
        }
        Iterator<AbstractC10344e0> it = interfaceC10585e.mo32877h().mo35998a().iterator();
        while (it.hasNext()) {
            InterfaceC10585e interfaceC10585eM35817e = m35817e(it.next());
            if (interfaceC10585eM35817e.mo32878i() != EnumC10588f.INTERFACE) {
                return interfaceC10585eM35817e;
            }
        }
        return null;
    }

    /* renamed from: t */
    public static boolean m35832t(InterfaceC10609m interfaceC10609m) {
        return m35803D(interfaceC10609m, EnumC10588f.ANNOTATION_CLASS);
    }

    /* renamed from: u */
    public static boolean m35833u(InterfaceC10609m interfaceC10609m) {
        if (interfaceC10609m == null) {
            m35813a(34);
        }
        return m35834v(interfaceC10609m) && interfaceC10609m.getName().equals(C10165h.f39266b);
    }

    /* renamed from: v */
    public static boolean m35834v(InterfaceC10609m interfaceC10609m) {
        return m35803D(interfaceC10609m, EnumC10588f.CLASS);
    }

    /* renamed from: w */
    public static boolean m35835w(InterfaceC10609m interfaceC10609m) {
        return m35834v(interfaceC10609m) || m35800A(interfaceC10609m);
    }

    /* renamed from: x */
    public static boolean m35836x(InterfaceC10609m interfaceC10609m) {
        return m35803D(interfaceC10609m, EnumC10588f.OBJECT) && ((InterfaceC10585e) interfaceC10609m).mo32857A();
    }

    /* renamed from: y */
    public static boolean m35837y(InterfaceC10609m interfaceC10609m) {
        return (interfaceC10609m instanceof InterfaceC10677q) && ((InterfaceC10677q) interfaceC10609m).getVisibility() == C10728t.f41221f;
    }

    /* renamed from: z */
    public static boolean m35838z(InterfaceC10585e interfaceC10585e, InterfaceC10585e interfaceC10585e2) {
        if (interfaceC10585e == null) {
            m35813a(26);
        }
        if (interfaceC10585e2 == null) {
            m35813a(27);
        }
        Iterator<AbstractC10344e0> it = interfaceC10585e.mo32877h().mo35998a().iterator();
        while (it.hasNext()) {
            if (m35805F(it.next(), interfaceC10585e2.mo37019a())) {
                return true;
            }
        }
        return false;
    }
}
