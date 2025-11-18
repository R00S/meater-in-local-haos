package kotlin.reflect.p371y;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.C9872w;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import kotlin.reflect.p371y.internal.C9891g0;
import kotlin.reflect.p371y.internal.KCallableImpl;
import kotlin.reflect.p371y.internal.KPropertyImpl;
import kotlin.reflect.p371y.internal.KTypeImpl;
import kotlin.reflect.p371y.internal.calls.Caller;
import okhttp3.HttpUrl;

/* compiled from: ReflectJvmMapping.kt */
@Metadata(m32266d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010%\u001a\u0004\u0018\u00010&*\u00020'H\u0002\"/\u0010\u0000\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00038F¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u001b\u0010\b\u001a\u0004\u0018\u00010\t*\u0006\u0012\u0002\b\u00030\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u001b\u0010\r\u001a\u0004\u0018\u00010\u000e*\u0006\u0012\u0002\b\u00030\n8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u000e*\u0006\u0012\u0002\b\u00030\u00038F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\"\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u000e*\u0006\u0012\u0002\b\u00030\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\"\u0015\u0010\u0018\u001a\u00020\u0019*\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\"-\u0010\u001d\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0003\"\b\b\u0000\u0010\u0002*\u00020\u001e*\b\u0012\u0004\u0012\u0002H\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \"\u001b\u0010\u001d\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003*\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010!\"\u001b\u0010\"\u001a\b\u0012\u0002\b\u0003\u0018\u00010\n*\u00020\t8F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006("}, m32267d2 = {"javaConstructor", "Ljava/lang/reflect/Constructor;", "T", "Lkotlin/reflect/KFunction;", "getJavaConstructor$annotations", "(Lkotlin/reflect/KFunction;)V", "getJavaConstructor", "(Lkotlin/reflect/KFunction;)Ljava/lang/reflect/Constructor;", "javaField", "Ljava/lang/reflect/Field;", "Lkotlin/reflect/KProperty;", "getJavaField", "(Lkotlin/reflect/KProperty;)Ljava/lang/reflect/Field;", "javaGetter", "Ljava/lang/reflect/Method;", "getJavaGetter", "(Lkotlin/reflect/KProperty;)Ljava/lang/reflect/Method;", "javaMethod", "getJavaMethod", "(Lkotlin/reflect/KFunction;)Ljava/lang/reflect/Method;", "javaSetter", "Lkotlin/reflect/KMutableProperty;", "getJavaSetter", "(Lkotlin/reflect/KMutableProperty;)Ljava/lang/reflect/Method;", "javaType", "Ljava/lang/reflect/Type;", "Lkotlin/reflect/KType;", "getJavaType", "(Lkotlin/reflect/KType;)Ljava/lang/reflect/Type;", "kotlinFunction", HttpUrl.FRAGMENT_ENCODE_SET, "getKotlinFunction", "(Ljava/lang/reflect/Constructor;)Lkotlin/reflect/KFunction;", "(Ljava/lang/reflect/Method;)Lkotlin/reflect/KFunction;", "kotlinProperty", "getKotlinProperty", "(Ljava/lang/reflect/Field;)Lkotlin/reflect/KProperty;", "getKPackage", "Lkotlin/reflect/KDeclarationContainer;", "Ljava/lang/reflect/Member;", "kotlin-reflection"}, m32268k = 2, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.f0.y.c */
/* loaded from: classes.dex */
public final class C9876c {
    /* renamed from: a */
    public static final <T> Constructor<T> m32465a(KFunction<? extends T> kFunction) {
        Caller<?> callerMo32547z;
        C9801m.m32346f(kFunction, "<this>");
        KCallableImpl<?> kCallableImplM32557b = C9891g0.m32557b(kFunction);
        Member member = (kCallableImplM32557b == null || (callerMo32547z = kCallableImplM32557b.mo32547z()) == null) ? null : callerMo32547z.getMember();
        if (member instanceof Constructor) {
            return (Constructor) member;
        }
        return null;
    }

    /* renamed from: b */
    public static final Field m32466b(KProperty<?> kProperty) {
        C9801m.m32346f(kProperty, "<this>");
        KPropertyImpl<?> kPropertyImplM32559d = C9891g0.m32559d(kProperty);
        if (kPropertyImplM32559d != null) {
            return kPropertyImplM32559d.m37302K();
        }
        return null;
    }

    /* renamed from: c */
    public static final Method m32467c(KProperty<?> kProperty) {
        C9801m.m32346f(kProperty, "<this>");
        return m32468d(kProperty.getGetter());
    }

    /* renamed from: d */
    public static final Method m32468d(KFunction<?> kFunction) {
        Caller<?> callerMo32547z;
        C9801m.m32346f(kFunction, "<this>");
        KCallableImpl<?> kCallableImplM32557b = C9891g0.m32557b(kFunction);
        Member member = (kCallableImplM32557b == null || (callerMo32547z = kCallableImplM32557b.mo32547z()) == null) ? null : callerMo32547z.getMember();
        if (member instanceof Method) {
            return (Method) member;
        }
        return null;
    }

    /* renamed from: e */
    public static final Method m32469e(KMutableProperty<?> kMutableProperty) {
        C9801m.m32346f(kMutableProperty, "<this>");
        return m32468d(kMutableProperty.getSetter());
    }

    /* renamed from: f */
    public static final Type m32470f(KType kType) {
        C9801m.m32346f(kType, "<this>");
        Type typeMo32365j = ((KTypeImpl) kType).mo32365j();
        return typeMo32365j == null ? C9872w.m32456f(kType) : typeMo32365j;
    }
}
