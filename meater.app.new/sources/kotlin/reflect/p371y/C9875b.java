package kotlin.reflect.p371y;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C10813s;
import kotlin.jvm.internal.C9790g0;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10588f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.p371y.internal.KTypeImpl;
import kotlin.reflect.p371y.internal.KotlinReflectionInternalError;

/* compiled from: KTypesJvm.kt */
@Metadata(m32266d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001c\u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\"\u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0003\u0010\b¨\u0006\t"}, m32267d2 = {"jvmErasure", "Lkotlin/reflect/KClass;", "Lkotlin/reflect/KClassifier;", "getJvmErasure", "(Lkotlin/reflect/KClassifier;)Lkotlin/reflect/KClass;", "Lkotlin/reflect/KType;", "getJvmErasure$annotations", "(Lkotlin/reflect/KType;)V", "(Lkotlin/reflect/KType;)Lkotlin/reflect/KClass;", "kotlin-reflection"}, m32268k = 2, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.f0.y.b */
/* loaded from: classes.dex */
public final class C9875b {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final KClass<?> m32463a(KClassifier kClassifier) {
        InterfaceC10585e interfaceC10585e;
        KClass<?> kClassM32464b;
        C9801m.m32346f(kClassifier, "<this>");
        if (kClassifier instanceof KClass) {
            return (KClass) kClassifier;
        }
        if (!(kClassifier instanceof KTypeParameter)) {
            throw new KotlinReflectionInternalError("Cannot calculate JVM erasure for type: " + kClassifier);
        }
        List<KType> upperBounds = ((KTypeParameter) kClassifier).getUpperBounds();
        Iterator<T> it = upperBounds.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            KType kType = (KType) next;
            C9801m.m32344d(kType, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
            InterfaceC10594h interfaceC10594hMo32891w = ((KTypeImpl) kType).getF40589g().mo35993O0().mo32891w();
            interfaceC10585e = interfaceC10594hMo32891w instanceof InterfaceC10585e ? (InterfaceC10585e) interfaceC10594hMo32891w : null;
            if ((interfaceC10585e == null || interfaceC10585e.mo32878i() == EnumC10588f.INTERFACE || interfaceC10585e.mo32878i() == EnumC10588f.ANNOTATION_CLASS) ? false : true) {
                interfaceC10585e = next;
                break;
            }
        }
        KType kType2 = (KType) interfaceC10585e;
        if (kType2 == null) {
            kType2 = (KType) C10813s.m38832W(upperBounds);
        }
        return (kType2 == null || (kClassM32464b = m32464b(kType2)) == null) ? C9790g0.m32298b(Object.class) : kClassM32464b;
    }

    /* renamed from: b */
    public static final KClass<?> m32464b(KType kType) {
        KClass<?> kClassM32463a;
        C9801m.m32346f(kType, "<this>");
        KClassifier kClassifierMo32437c = kType.mo32437c();
        if (kClassifierMo32437c != null && (kClassM32463a = m32463a(kClassifierMo32437c)) != null) {
            return kClassM32463a;
        }
        throw new KotlinReflectionInternalError("Cannot calculate JVM erasure for type: " + kType);
    }
}
