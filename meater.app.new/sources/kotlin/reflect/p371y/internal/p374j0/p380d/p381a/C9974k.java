package kotlin.reflect.p371y.internal.p374j0.p380d.p381a;

import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10734w;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9909c;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9910d;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10187d;

/* compiled from: DescriptorsJvmAbiUtil.java */
/* renamed from: kotlin.f0.y.e.j0.d.a.k */
/* loaded from: classes2.dex */
public final class C9974k {
    /* renamed from: a */
    private static /* synthetic */ void m33196a(int i2) {
        Object[] objArr = new Object[3];
        if (i2 == 1 || i2 == 2) {
            objArr[0] = "companionObject";
        } else if (i2 != 3) {
            objArr[0] = "propertyDescriptor";
        } else {
            objArr[0] = "memberDescriptor";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil";
        if (i2 == 1) {
            objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
        } else if (i2 == 2) {
            objArr[2] = "isMappedIntrinsicCompanionObject";
        } else if (i2 != 3) {
            objArr[2] = "isPropertyWithBackingFieldInOuterClass";
        } else {
            objArr[2] = "hasJvmFieldAnnotation";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* renamed from: b */
    public static boolean m33197b(InterfaceC10576b interfaceC10576b) {
        InterfaceC10734w interfaceC10734wMo37034q0;
        if (interfaceC10576b == null) {
            m33196a(3);
        }
        if ((interfaceC10576b instanceof InterfaceC10729t0) && (interfaceC10734wMo37034q0 = ((InterfaceC10729t0) interfaceC10576b).mo37034q0()) != null && interfaceC10734wMo37034q0.getAnnotations().mo33270R0(C10080z.f38330b)) {
            return true;
        }
        return interfaceC10576b.getAnnotations().mo33270R0(C10080z.f38330b);
    }

    /* renamed from: c */
    public static boolean m33198c(InterfaceC10609m interfaceC10609m) {
        if (interfaceC10609m == null) {
            m33196a(1);
        }
        return C10187d.m35836x(interfaceC10609m) && C10187d.m35835w(interfaceC10609m.mo32876b()) && !m33199d((InterfaceC10585e) interfaceC10609m);
    }

    /* renamed from: d */
    public static boolean m33199d(InterfaceC10585e interfaceC10585e) {
        if (interfaceC10585e == null) {
            m33196a(2);
        }
        return C9910d.m32702a(C9909c.f37450a, interfaceC10585e);
    }

    /* renamed from: e */
    public static boolean m33200e(InterfaceC10729t0 interfaceC10729t0) {
        if (interfaceC10729t0 == null) {
            m33196a(0);
        }
        if (interfaceC10729t0.mo37030i() == InterfaceC10576b.a.FAKE_OVERRIDE) {
            return false;
        }
        if (m33198c(interfaceC10729t0.mo32876b())) {
            return true;
        }
        return C10187d.m35836x(interfaceC10729t0.mo32876b()) && m33197b(interfaceC10729t0);
    }
}
