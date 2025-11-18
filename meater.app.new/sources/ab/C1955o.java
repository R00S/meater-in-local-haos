package ab;

import Ra.InterfaceC1689b;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1700m;
import Ra.InterfaceC1709w;
import Ra.Z;
import tb.C4597i;

/* compiled from: DescriptorsJvmAbiUtil.java */
/* renamed from: ab.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1955o {
    private static /* synthetic */ void a(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "companionObject";
        } else if (i10 != 3) {
            objArr[0] = "propertyDescriptor";
        } else {
            objArr[0] = "memberDescriptor";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil";
        if (i10 == 1) {
            objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
        } else if (i10 == 2) {
            objArr[2] = "isMappedIntrinsicCompanionObject";
        } else if (i10 != 3) {
            objArr[2] = "isPropertyWithBackingFieldInOuterClass";
        } else {
            objArr[2] = "hasJvmFieldAnnotation";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static boolean b(InterfaceC1689b interfaceC1689b) {
        InterfaceC1709w interfaceC1709wN0;
        if (interfaceC1689b == null) {
            a(3);
        }
        if ((interfaceC1689b instanceof Z) && (interfaceC1709wN0 = ((Z) interfaceC1689b).n0()) != null && interfaceC1709wN0.getAnnotations().P(C1927H.f20135b)) {
            return true;
        }
        return interfaceC1689b.getAnnotations().P(C1927H.f20135b);
    }

    public static boolean c(InterfaceC1700m interfaceC1700m) {
        if (interfaceC1700m == null) {
            a(1);
        }
        return C4597i.x(interfaceC1700m) && C4597i.w(interfaceC1700m.c()) && !d((InterfaceC1692e) interfaceC1700m);
    }

    public static boolean d(InterfaceC1692e interfaceC1692e) {
        if (interfaceC1692e == null) {
            a(2);
        }
        return Oa.e.a(Oa.d.f13314a, interfaceC1692e);
    }

    public static boolean e(Z z10) {
        if (z10 == null) {
            a(0);
        }
        if (z10.i() == InterfaceC1689b.a.FAKE_OVERRIDE) {
            return false;
        }
        if (c(z10.c())) {
            return true;
        }
        return C4597i.x(z10.c()) && b(z10);
    }
}
