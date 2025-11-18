package kotlin.reflect.p371y.internal;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10731u0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10733v0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.C10703d;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.C10711l;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.C10714o;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.C10717r;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.C10720u;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o;
import kotlin.reflect.p371y.internal.JvmFunctionSignature;
import kotlin.reflect.p371y.internal.JvmPropertySignature;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9917k;
import kotlin.reflect.p371y.internal.p374j0.p375b.EnumC9915i;
import kotlin.reflect.p371y.internal.p374j0.p375b.p377q.C9927a;
import kotlin.reflect.p371y.internal.p374j0.p375b.p377q.C9929c;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C10080z;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9957g0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p383k0.C9976b;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p383k0.C9979e;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p383k0.C9980f;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p387m0.InterfaceC10016a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10035l;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.C10106v;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10125d;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10130i;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10135n;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.C10112a;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.AbstractC10116d;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.C10121i;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10153e;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10186c;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10187d;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10189f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a;
import kotlin.reflect.p371y.internal.p374j0.p400i.p406u.EnumC10240e;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.C10293j;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.InterfaceC10285b;
import okhttp3.HttpUrl;

/* compiled from: RuntimeTypeMapper.kt */
@Metadata(m32266d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0012\u0010\u000e\u001a\u00020\u00042\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u0014H\u0002J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u0006\u0012\u0002\b\u00030\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u001c"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "JAVA_LANG_VOID", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "primitiveType", "Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;", "Ljava/lang/Class;", "getPrimitiveType", "(Ljava/lang/Class;)Lorg/jetbrains/kotlin/builtins/PrimitiveType;", "isKnownBuiltInFunction", HttpUrl.FRAGMENT_ENCODE_SET, "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "mapJvmClassToKotlinClassId", "klass", "mapJvmFunctionSignature", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "mapName", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "mapPropertySignature", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "possiblyOverriddenProperty", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "mapSignature", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "possiblySubstitutedFunction", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.f0.y.e.d0, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class RuntimeTypeMapper {

    /* renamed from: a */
    public static final RuntimeTypeMapper f37288a = new RuntimeTypeMapper();

    /* renamed from: b */
    private static final C10159b f37289b;

    static {
        C10159b c10159bM35408m = C10159b.m35408m(new C10160c("java.lang.Void"));
        C9801m.m32345e(c10159bM35408m, "topLevel(FqName(\"java.lang.Void\"))");
        f37289b = c10159bM35408m;
    }

    private RuntimeTypeMapper() {
    }

    /* renamed from: a */
    private final EnumC9915i m32515a(Class<?> cls) {
        if (cls.isPrimitive()) {
            return EnumC10240e.m36114k(cls.getSimpleName()).m36118x();
        }
        return null;
    }

    /* renamed from: b */
    private final boolean m32516b(InterfaceC10738y interfaceC10738y) {
        if (C10186c.m35797o(interfaceC10738y) || C10186c.m35798p(interfaceC10738y)) {
            return true;
        }
        return C9801m.m32341a(interfaceC10738y.getName(), C9927a.f37663e.m32912a()) && interfaceC10738y.mo37028f().isEmpty();
    }

    /* renamed from: d */
    private final JvmFunctionSignature.e m32517d(InterfaceC10738y interfaceC10738y) {
        return new JvmFunctionSignature.e(new AbstractC10116d.b(m32518e(interfaceC10738y), C10106v.m34039c(interfaceC10738y, false, false, 1, null)));
    }

    /* renamed from: e */
    private final String m32518e(InterfaceC10576b interfaceC10576b) {
        String strM33101b = C9957g0.m33101b(interfaceC10576b);
        if (strM33101b != null) {
            return strM33101b;
        }
        if (interfaceC10576b instanceof InterfaceC10731u0) {
            String strM35455k = C10235a.m36081o(interfaceC10576b).getName().m35455k();
            C9801m.m32345e(strM35455k, "descriptor.propertyIfAccessor.name.asString()");
            return C10080z.m33829b(strM35455k);
        }
        if (interfaceC10576b instanceof InterfaceC10733v0) {
            String strM35455k2 = C10235a.m36081o(interfaceC10576b).getName().m35455k();
            C9801m.m32345e(strM35455k2, "descriptor.propertyIfAccessor.name.asString()");
            return C10080z.m33832e(strM35455k2);
        }
        String strM35455k3 = interfaceC10576b.getName().m35455k();
        C9801m.m32345e(strM35455k3, "descriptor.name.asString()");
        return strM35455k3;
    }

    /* renamed from: c */
    public final C10159b m32519c(Class<?> cls) {
        C9801m.m32346f(cls, "klass");
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            C9801m.m32345e(componentType, "klass.componentType");
            EnumC9915i enumC9915iM32515a = m32515a(componentType);
            if (enumC9915iM32515a != null) {
                return new C10159b(C9917k.f37517r, enumC9915iM32515a.m32814q());
            }
            C10159b c10159bM35408m = C10159b.m35408m(C9917k.a.f37576i.m35441l());
            C9801m.m32345e(c10159bM35408m, "topLevel(StandardNames.FqNames.array.toSafe())");
            return c10159bM35408m;
        }
        if (C9801m.m32341a(cls, Void.TYPE)) {
            return f37289b;
        }
        EnumC9915i enumC9915iM32515a2 = m32515a(cls);
        if (enumC9915iM32515a2 != null) {
            return new C10159b(C9917k.f37517r, enumC9915iM32515a2.m32816v());
        }
        C10159b c10159bM38069a = C10703d.m38069a(cls);
        if (!c10159bM38069a.m35416k()) {
            C9929c c9929c = C9929c.f37667a;
            C10160c c10160cM35409b = c10159bM38069a.m35409b();
            C9801m.m32345e(c10160cM35409b, "classId.asSingleFqName()");
            C10159b c10159bM32928m = c9929c.m32928m(c10160cM35409b);
            if (c10159bM32928m != null) {
                return c10159bM32928m;
            }
        }
        return c10159bM38069a;
    }

    /* renamed from: f */
    public final JvmPropertySignature m32520f(InterfaceC10729t0 interfaceC10729t0) {
        C9801m.m32346f(interfaceC10729t0, "possiblyOverriddenProperty");
        InterfaceC10729t0 interfaceC10729t0Mo37019a = ((InterfaceC10729t0) C10187d.m35811L(interfaceC10729t0)).mo37019a();
        C9801m.m32345e(interfaceC10729t0Mo37019a, "unwrapFakeOverride(possi…rriddenProperty).original");
        if (interfaceC10729t0Mo37019a instanceof C10293j) {
            C10293j c10293j = (C10293j) interfaceC10729t0Mo37019a;
            C10135n c10135nM36386g1 = c10293j.mo36257E();
            AbstractC10749h.f<C10135n, C10112a.d> fVar = C10112a.f38494d;
            C9801m.m32345e(fVar, "propertySignature");
            C10112a.d dVar = (C10112a.d) C10153e.m35380a(c10135nM36386g1, fVar);
            if (dVar != null) {
                return new JvmPropertySignature.c(interfaceC10729t0Mo37019a, c10135nM36386g1, dVar, c10293j.mo36259Z(), c10293j.mo36258T());
            }
        } else if (interfaceC10729t0Mo37019a instanceof C9980f) {
            InterfaceC10741z0 interfaceC10741z0Mo32883t = ((C9980f) interfaceC10729t0Mo37019a).mo32883t();
            InterfaceC10016a interfaceC10016a = interfaceC10741z0Mo32883t instanceof InterfaceC10016a ? (InterfaceC10016a) interfaceC10741z0Mo32883t : null;
            InterfaceC10035l interfaceC10035lMo33568b = interfaceC10016a != null ? interfaceC10016a.mo33568b() : null;
            if (interfaceC10035lMo33568b instanceof C10717r) {
                return new JvmPropertySignature.a(((C10717r) interfaceC10035lMo33568b).mo38106U());
            }
            if (interfaceC10035lMo33568b instanceof C10720u) {
                Method methodMo38106U = ((C10720u) interfaceC10035lMo33568b).mo38106U();
                InterfaceC10733v0 setter = interfaceC10729t0Mo37019a.getSetter();
                InterfaceC10741z0 interfaceC10741z0Mo32883t2 = setter != null ? setter.mo32883t() : null;
                InterfaceC10016a interfaceC10016a2 = interfaceC10741z0Mo32883t2 instanceof InterfaceC10016a ? (InterfaceC10016a) interfaceC10741z0Mo32883t2 : null;
                InterfaceC10035l interfaceC10035lMo33568b2 = interfaceC10016a2 != null ? interfaceC10016a2.mo33568b() : null;
                C10720u c10720u = interfaceC10035lMo33568b2 instanceof C10720u ? (C10720u) interfaceC10035lMo33568b2 : null;
                return new JvmPropertySignature.b(methodMo38106U, c10720u != null ? c10720u.mo38106U() : null);
            }
            throw new KotlinReflectionInternalError("Incorrect resolution sequence for Java field " + interfaceC10729t0Mo37019a + " (source = " + interfaceC10035lMo33568b + ')');
        }
        InterfaceC10731u0 getter = interfaceC10729t0Mo37019a.getGetter();
        C9801m.m32343c(getter);
        JvmFunctionSignature.e eVarM32517d = m32517d(getter);
        InterfaceC10733v0 setter2 = interfaceC10729t0Mo37019a.getSetter();
        return new JvmPropertySignature.d(eVarM32517d, setter2 != null ? m32517d(setter2) : null);
    }

    /* renamed from: g */
    public final JvmFunctionSignature m32521g(InterfaceC10738y interfaceC10738y) {
        Method methodMo38106U;
        AbstractC10116d.b bVarM34266b;
        AbstractC10116d.b bVarM34268e;
        C9801m.m32346f(interfaceC10738y, "possiblySubstitutedFunction");
        InterfaceC10738y interfaceC10738yMo37019a = ((InterfaceC10738y) C10187d.m35811L(interfaceC10738y)).mo37019a();
        C9801m.m32345e(interfaceC10738yMo37019a, "unwrapFakeOverride(possi…titutedFunction).original");
        if (interfaceC10738yMo37019a instanceof InterfaceC10285b) {
            InterfaceC10285b interfaceC10285b = (InterfaceC10285b) interfaceC10738yMo37019a;
            InterfaceC10756o interfaceC10756oMo36257E = interfaceC10285b.mo36257E();
            if ((interfaceC10756oMo36257E instanceof C10130i) && (bVarM34268e = C10121i.f38607a.m34268e((C10130i) interfaceC10756oMo36257E, interfaceC10285b.mo36259Z(), interfaceC10285b.mo36258T())) != null) {
                return new JvmFunctionSignature.e(bVarM34268e);
            }
            if (!(interfaceC10756oMo36257E instanceof C10125d) || (bVarM34266b = C10121i.f38607a.m34266b((C10125d) interfaceC10756oMo36257E, interfaceC10285b.mo36259Z(), interfaceC10285b.mo36258T())) == null) {
                return m32517d(interfaceC10738yMo37019a);
            }
            InterfaceC10609m interfaceC10609mMo32876b = interfaceC10738y.mo32876b();
            C9801m.m32345e(interfaceC10609mMo32876b, "possiblySubstitutedFunction.containingDeclaration");
            return C10189f.m35840b(interfaceC10609mMo32876b) ? new JvmFunctionSignature.e(bVarM34266b) : new JvmFunctionSignature.d(bVarM34266b);
        }
        if (interfaceC10738yMo37019a instanceof C9979e) {
            InterfaceC10741z0 interfaceC10741z0Mo32883t = ((C9979e) interfaceC10738yMo37019a).mo32883t();
            InterfaceC10016a interfaceC10016a = interfaceC10741z0Mo32883t instanceof InterfaceC10016a ? (InterfaceC10016a) interfaceC10741z0Mo32883t : null;
            InterfaceC10035l interfaceC10035lMo33568b = interfaceC10016a != null ? interfaceC10016a.mo33568b() : null;
            C10720u c10720u = interfaceC10035lMo33568b instanceof C10720u ? (C10720u) interfaceC10035lMo33568b : null;
            if (c10720u != null && (methodMo38106U = c10720u.mo38106U()) != null) {
                return new JvmFunctionSignature.c(methodMo38106U);
            }
            throw new KotlinReflectionInternalError("Incorrect resolution sequence for Java method " + interfaceC10738yMo37019a);
        }
        if (!(interfaceC10738yMo37019a instanceof C9976b)) {
            if (m32516b(interfaceC10738yMo37019a)) {
                return m32517d(interfaceC10738yMo37019a);
            }
            throw new KotlinReflectionInternalError("Unknown origin of " + interfaceC10738yMo37019a + " (" + interfaceC10738yMo37019a.getClass() + ')');
        }
        InterfaceC10741z0 interfaceC10741z0Mo32883t2 = ((C9976b) interfaceC10738yMo37019a).mo32883t();
        InterfaceC10016a interfaceC10016a2 = interfaceC10741z0Mo32883t2 instanceof InterfaceC10016a ? (InterfaceC10016a) interfaceC10741z0Mo32883t2 : null;
        InterfaceC10035l interfaceC10035lMo33568b2 = interfaceC10016a2 != null ? interfaceC10016a2.mo33568b() : null;
        if (interfaceC10035lMo33568b2 instanceof C10714o) {
            return new JvmFunctionSignature.b(((C10714o) interfaceC10035lMo33568b2).mo38106U());
        }
        if (interfaceC10035lMo33568b2 instanceof C10711l) {
            C10711l c10711l = (C10711l) interfaceC10035lMo33568b2;
            if (c10711l.mo33601r()) {
                return new JvmFunctionSignature.a(c10711l.mo38048w());
            }
        }
        throw new KotlinReflectionInternalError("Incorrect resolution sequence for Java constructor " + interfaceC10738yMo37019a + " (" + interfaceC10035lMo33568b2 + ')');
    }
}
