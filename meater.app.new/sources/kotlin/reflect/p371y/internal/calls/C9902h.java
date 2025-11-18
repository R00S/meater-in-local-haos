package kotlin.reflect.p371y.internal.calls;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10602j1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10606l;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10735w0;
import kotlin.reflect.p371y.internal.C9891g0;
import kotlin.reflect.p371y.internal.KotlinReflectionInternalError;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9914h;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10189f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10372n1;
import okhttp3.HttpUrl;

/* compiled from: InlineClassAwareCaller.kt */
@Metadata(m32266d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0000\u001a6\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\n\b\u0000\u0010\n*\u0004\u0018\u00010\u000b*\b\u0012\u0004\u0012\u0002H\n0\t2\u0006\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\rH\u0000\u001a\u0018\u0010\u000e\u001a\u00020\u000f*\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u0007\u001a\u00020\u0002H\u0000\u001a\u0018\u0010\u0011\u001a\u00020\u000f*\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u0007\u001a\u00020\u0002H\u0000\u001a\f\u0010\u0012\u001a\u00020\r*\u00020\u0002H\u0002\u001a\u0014\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0010*\u0004\u0018\u00010\u0014H\u0000\u001a\u0012\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0010*\u00020\u0001H\u0000\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0015"}, m32267d2 = {"expectedReceiverType", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "getExpectedReceiverType", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;)Lorg/jetbrains/kotlin/types/KotlinType;", "coerceToExpectedReceiverType", HttpUrl.FRAGMENT_ENCODE_SET, "descriptor", "createInlineClassAwareCallerIfNeeded", "Lkotlin/reflect/jvm/internal/calls/Caller;", "M", "Ljava/lang/reflect/Member;", "isDefault", HttpUrl.FRAGMENT_ENCODE_SET, "getBoxMethod", "Ljava/lang/reflect/Method;", "Ljava/lang/Class;", "getUnboxMethod", "hasInlineClassReceiver", "toInlineClass", "Lkotlin/reflect/jvm/internal/impl/descriptors/DeclarationDescriptor;", "kotlin-reflection"}, m32268k = 2, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.f0.y.e.i0.h */
/* loaded from: classes2.dex */
public final class C9902h {
    /* renamed from: a */
    public static final Object m32665a(Object obj, InterfaceC10576b interfaceC10576b) {
        AbstractC10344e0 abstractC10344e0M32669e;
        Class<?> clsM32673i;
        Method methodM32670f;
        C9801m.m32346f(interfaceC10576b, "descriptor");
        return (((interfaceC10576b instanceof InterfaceC10729t0) && C10189f.m35842d((InterfaceC10602j1) interfaceC10576b)) || (abstractC10344e0M32669e = m32669e(interfaceC10576b)) == null || (clsM32673i = m32673i(abstractC10344e0M32669e)) == null || (methodM32670f = m32670f(clsM32673i, interfaceC10576b)) == null) ? obj : methodM32670f.invoke(obj, new Object[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <M extends java.lang.reflect.Member> kotlin.reflect.p371y.internal.calls.Caller<M> m32666b(kotlin.reflect.p371y.internal.calls.Caller<? extends M> r5, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b r6, boolean r7) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C9801m.m32346f(r5, r0)
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.C9801m.m32346f(r6, r0)
            boolean r0 = kotlin.reflect.p371y.internal.p374j0.p400i.C10189f.m35839a(r6)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L66
            java.util.List r0 = r6.mo37028f()
            java.lang.String r3 = "descriptor.valueParameters"
            kotlin.jvm.internal.C9801m.m32345e(r0, r3)
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L27
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L27
        L25:
            r0 = 0
            goto L47
        L27:
            java.util.Iterator r0 = r0.iterator()
        L2b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L25
            java.lang.Object r3 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.i1 r3 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10599i1) r3
            kotlin.f0.y.e.j0.l.e0 r3 = r3.getType()
            java.lang.String r4 = "it.type"
            kotlin.jvm.internal.C9801m.m32345e(r3, r4)
            boolean r3 = kotlin.reflect.p371y.internal.p374j0.p400i.C10189f.m35841c(r3)
            if (r3 == 0) goto L2b
            r0 = 1
        L47:
            if (r0 != 0) goto L66
            kotlin.f0.y.e.j0.l.e0 r0 = r6.getReturnType()
            if (r0 == 0) goto L57
            boolean r0 = kotlin.reflect.p371y.internal.p374j0.p400i.C10189f.m35841c(r0)
            if (r0 != r1) goto L57
            r0 = 1
            goto L58
        L57:
            r0 = 0
        L58:
            if (r0 != 0) goto L66
            boolean r0 = r5 instanceof kotlin.reflect.p371y.internal.calls.BoundCaller
            if (r0 != 0) goto L65
            boolean r0 = m32671g(r6)
            if (r0 == 0) goto L65
            goto L66
        L65:
            r1 = 0
        L66:
            if (r1 == 0) goto L6e
            kotlin.f0.y.e.i0.g r0 = new kotlin.f0.y.e.i0.g
            r0.<init>(r6, r5, r7)
            r5 = r0
        L6e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.calls.C9902h.m32666b(kotlin.f0.y.e.i0.d, kotlin.reflect.jvm.internal.impl.descriptors.b, boolean):kotlin.f0.y.e.i0.d");
    }

    /* renamed from: c */
    public static /* synthetic */ Caller m32667c(Caller caller, InterfaceC10576b interfaceC10576b, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return m32666b(caller, interfaceC10576b, z);
    }

    /* renamed from: d */
    public static final Method m32668d(Class<?> cls, InterfaceC10576b interfaceC10576b) throws NoSuchMethodException, SecurityException {
        C9801m.m32346f(cls, "<this>");
        C9801m.m32346f(interfaceC10576b, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("box-impl", m32670f(cls, interfaceC10576b).getReturnType());
            C9801m.m32345e(declaredMethod, "{\n        getDeclaredMet…riptor).returnType)\n    }");
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new KotlinReflectionInternalError("No box method found in inline class: " + cls + " (calling " + interfaceC10576b + ')');
        }
    }

    /* renamed from: e */
    private static final AbstractC10344e0 m32669e(InterfaceC10576b interfaceC10576b) {
        InterfaceC10735w0 interfaceC10735w0Mo37032m0 = interfaceC10576b.mo37032m0();
        InterfaceC10735w0 interfaceC10735w0Mo37029f0 = interfaceC10576b.mo37029f0();
        if (interfaceC10735w0Mo37032m0 != null) {
            return interfaceC10735w0Mo37032m0.getType();
        }
        if (interfaceC10735w0Mo37029f0 == null) {
            return null;
        }
        if (interfaceC10576b instanceof InterfaceC10606l) {
            return interfaceC10735w0Mo37029f0.getType();
        }
        InterfaceC10609m interfaceC10609mMo32876b = interfaceC10576b.mo32876b();
        InterfaceC10585e interfaceC10585e = interfaceC10609mMo32876b instanceof InterfaceC10585e ? (InterfaceC10585e) interfaceC10609mMo32876b : null;
        if (interfaceC10585e != null) {
            return interfaceC10585e.mo36400s();
        }
        return null;
    }

    /* renamed from: f */
    public static final Method m32670f(Class<?> cls, InterfaceC10576b interfaceC10576b) throws NoSuchMethodException, SecurityException {
        C9801m.m32346f(cls, "<this>");
        C9801m.m32346f(interfaceC10576b, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", new Class[0]);
            C9801m.m32345e(declaredMethod, "{\n        getDeclaredMet…LINE_CLASS_MEMBERS)\n    }");
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new KotlinReflectionInternalError("No unbox method found in inline class: " + cls + " (calling " + interfaceC10576b + ')');
        }
    }

    /* renamed from: g */
    private static final boolean m32671g(InterfaceC10576b interfaceC10576b) {
        AbstractC10344e0 abstractC10344e0M32669e = m32669e(interfaceC10576b);
        return abstractC10344e0M32669e != null && C10189f.m35841c(abstractC10344e0M32669e);
    }

    /* renamed from: h */
    public static final Class<?> m32672h(InterfaceC10609m interfaceC10609m) {
        if (!(interfaceC10609m instanceof InterfaceC10585e) || !C10189f.m35840b(interfaceC10609m)) {
            return null;
        }
        InterfaceC10585e interfaceC10585e = (InterfaceC10585e) interfaceC10609m;
        Class<?> clsM32571p = C9891g0.m32571p(interfaceC10585e);
        if (clsM32571p != null) {
            return clsM32571p;
        }
        throw new KotlinReflectionInternalError("Class object for the class " + interfaceC10585e.getName() + " cannot be found (classId=" + C10235a.m36073g((InterfaceC10594h) interfaceC10609m) + ')');
    }

    /* renamed from: i */
    public static final Class<?> m32673i(AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(abstractC10344e0, "<this>");
        Class<?> clsM32672h = m32672h(abstractC10344e0.mo35993O0().mo32891w());
        if (clsM32672h == null) {
            return null;
        }
        if (!C10372n1.m36779l(abstractC10344e0)) {
            return clsM32672h;
        }
        AbstractC10344e0 abstractC10344e0M35843e = C10189f.m35843e(abstractC10344e0);
        if (abstractC10344e0M35843e == null || C10372n1.m36779l(abstractC10344e0M35843e) || AbstractC9914h.m32757r0(abstractC10344e0M35843e)) {
            return null;
        }
        return clsM32672h;
    }
}
