package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p435a;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.collections.C10795j;
import kotlin.jvm.C9752a;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.C10703d;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9917k;
import kotlin.reflect.p371y.internal.p374j0.p375b.EnumC9915i;
import kotlin.reflect.p371y.internal.p374j0.p375b.p377q.C9929c;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10165h;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10210f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p406u.EnumC10240e;

/* compiled from: ReflectKotlinClass.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.a.c */
/* loaded from: classes2.dex */
final class C10686c {

    /* renamed from: a */
    public static final C10686c f41141a = new C10686c();

    private C10686c() {
    }

    /* renamed from: a */
    private final C10210f m38015a(Class<?> cls) {
        int i2 = 0;
        while (cls.isArray()) {
            i2++;
            cls = cls.getComponentType();
            C9801m.m32345e(cls, "currentClass.componentType");
        }
        if (!cls.isPrimitive()) {
            C10159b c10159bM38069a = C10703d.m38069a(cls);
            C9929c c9929c = C9929c.f37667a;
            C10160c c10160cM35409b = c10159bM38069a.m35409b();
            C9801m.m32345e(c10160cM35409b, "javaClassId.asSingleFqName()");
            C10159b c10159bM32928m = c9929c.m32928m(c10160cM35409b);
            if (c10159bM32928m != null) {
                c10159bM38069a = c10159bM32928m;
            }
            return new C10210f(c10159bM38069a, i2);
        }
        if (C9801m.m32341a(cls, Void.TYPE)) {
            C10159b c10159bM35408m = C10159b.m35408m(C9917k.a.f37570f.m35441l());
            C9801m.m32345e(c10159bM35408m, "topLevel(StandardNames.FqNames.unit.toSafe())");
            return new C10210f(c10159bM35408m, i2);
        }
        EnumC9915i enumC9915iM36118x = EnumC10240e.m36114k(cls.getName()).m36118x();
        C9801m.m32345e(enumC9915iM36118x, "get(currentClass.name).primitiveType");
        if (i2 > 0) {
            C10159b c10159bM35408m2 = C10159b.m35408m(enumC9915iM36118x.m32813k());
            C9801m.m32345e(c10159bM35408m2, "topLevel(primitiveType.arrayTypeFqName)");
            return new C10210f(c10159bM35408m2, i2 - 1);
        }
        C10159b c10159bM35408m3 = C10159b.m35408m(enumC9915iM36118x.m32815u());
        C9801m.m32345e(c10159bM35408m3, "topLevel(primitiveType.typeFqName)");
        return new C10210f(c10159bM35408m3, i2);
    }

    /* renamed from: c */
    private final void m38016c(Class<?> cls, InterfaceC10101q.d dVar) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Constructor<?>[] constructorArr;
        int i2;
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        C9801m.m32345e(declaredConstructors, "klass.declaredConstructors");
        int length = declaredConstructors.length;
        int i3 = 0;
        while (i3 < length) {
            Constructor<?> constructor = declaredConstructors[i3];
            C10163f c10163f = C10165h.f39273i;
            C10696m c10696m = C10696m.f41155a;
            C9801m.m32345e(constructor, "constructor");
            InterfaceC10101q.e eVarMo33850b = dVar.mo33850b(c10163f, c10696m.m38036a(constructor));
            if (eVarMo33850b == null) {
                constructorArr = declaredConstructors;
                i2 = length;
            } else {
                Annotation[] declaredAnnotations = constructor.getDeclaredAnnotations();
                C9801m.m32345e(declaredAnnotations, "constructor.declaredAnnotations");
                for (Annotation annotation : declaredAnnotations) {
                    C9801m.m32345e(annotation, "annotation");
                    m38019f(eVarMo33850b, annotation);
                }
                Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                C9801m.m32345e(parameterAnnotations, "parameterAnnotations");
                if (!(parameterAnnotations.length == 0)) {
                    int length2 = constructor.getParameterTypes().length - parameterAnnotations.length;
                    int length3 = parameterAnnotations.length;
                    for (int i4 = 0; i4 < length3; i4++) {
                        Annotation[] annotationArr = parameterAnnotations[i4];
                        C9801m.m32345e(annotationArr, "annotations");
                        int length4 = annotationArr.length;
                        int i5 = 0;
                        while (i5 < length4) {
                            Annotation annotation2 = annotationArr[i5];
                            Class<?> clsM32276b = C9752a.m32276b(C9752a.m32275a(annotation2));
                            Constructor<?>[] constructorArr2 = declaredConstructors;
                            int i6 = length;
                            C10159b c10159bM38069a = C10703d.m38069a(clsM32276b);
                            int i7 = length2;
                            C9801m.m32345e(annotation2, "annotation");
                            InterfaceC10101q.a aVarMo33851c = eVarMo33850b.mo33851c(i4 + length2, c10159bM38069a, new C10685b(annotation2));
                            if (aVarMo33851c != null) {
                                f41141a.m38021h(aVarMo33851c, annotation2, clsM32276b);
                            }
                            i5++;
                            declaredConstructors = constructorArr2;
                            length = i6;
                            length2 = i7;
                        }
                    }
                }
                constructorArr = declaredConstructors;
                i2 = length;
                eVarMo33850b.mo32695a();
            }
            i3++;
            declaredConstructors = constructorArr;
            length = i2;
        }
    }

    /* renamed from: d */
    private final void m38017d(Class<?> cls, InterfaceC10101q.d dVar) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Field[] declaredFields = cls.getDeclaredFields();
        C9801m.m32345e(declaredFields, "klass.declaredFields");
        for (Field field : declaredFields) {
            C10163f c10163fM35454x = C10163f.m35454x(field.getName());
            C9801m.m32345e(c10163fM35454x, "identifier(field.name)");
            C10696m c10696m = C10696m.f41155a;
            C9801m.m32345e(field, "field");
            InterfaceC10101q.c cVarMo33849a = dVar.mo33849a(c10163fM35454x, c10696m.m38037b(field), null);
            if (cVarMo33849a != null) {
                Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
                C9801m.m32345e(declaredAnnotations, "field.declaredAnnotations");
                for (Annotation annotation : declaredAnnotations) {
                    C9801m.m32345e(annotation, "annotation");
                    m38019f(cVarMo33849a, annotation);
                }
                cVarMo33849a.mo32695a();
            }
        }
    }

    /* renamed from: e */
    private final void m38018e(Class<?> cls, InterfaceC10101q.d dVar) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Method[] methodArr;
        Method[] declaredMethods = cls.getDeclaredMethods();
        C9801m.m32345e(declaredMethods, "klass.declaredMethods");
        int length = declaredMethods.length;
        int i2 = 0;
        while (i2 < length) {
            Method method = declaredMethods[i2];
            C10163f c10163fM35454x = C10163f.m35454x(method.getName());
            C9801m.m32345e(c10163fM35454x, "identifier(method.name)");
            C10696m c10696m = C10696m.f41155a;
            C9801m.m32345e(method, "method");
            InterfaceC10101q.e eVarMo33850b = dVar.mo33850b(c10163fM35454x, c10696m.m38038c(method));
            if (eVarMo33850b == null) {
                methodArr = declaredMethods;
            } else {
                Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                C9801m.m32345e(declaredAnnotations, "method.declaredAnnotations");
                for (Annotation annotation : declaredAnnotations) {
                    C9801m.m32345e(annotation, "annotation");
                    m38019f(eVarMo33850b, annotation);
                }
                Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                C9801m.m32345e(parameterAnnotations, "method.parameterAnnotations");
                int length2 = parameterAnnotations.length;
                for (int i3 = 0; i3 < length2; i3++) {
                    Annotation[] annotationArr = parameterAnnotations[i3];
                    C9801m.m32345e(annotationArr, "annotations");
                    int length3 = annotationArr.length;
                    int i4 = 0;
                    while (i4 < length3) {
                        Annotation annotation2 = annotationArr[i4];
                        Class<?> clsM32276b = C9752a.m32276b(C9752a.m32275a(annotation2));
                        C10159b c10159bM38069a = C10703d.m38069a(clsM32276b);
                        Method[] methodArr2 = declaredMethods;
                        C9801m.m32345e(annotation2, "annotation");
                        InterfaceC10101q.a aVarMo33851c = eVarMo33850b.mo33851c(i3, c10159bM38069a, new C10685b(annotation2));
                        if (aVarMo33851c != null) {
                            f41141a.m38021h(aVarMo33851c, annotation2, clsM32276b);
                        }
                        i4++;
                        declaredMethods = methodArr2;
                    }
                }
                methodArr = declaredMethods;
                eVarMo33850b.mo32695a();
            }
            i2++;
            declaredMethods = methodArr;
        }
    }

    /* renamed from: f */
    private final void m38019f(InterfaceC10101q.c cVar, Annotation annotation) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Class<?> clsM32276b = C9752a.m32276b(C9752a.m32275a(annotation));
        InterfaceC10101q.a aVarMo32696b = cVar.mo32696b(C10703d.m38069a(clsM32276b), new C10685b(annotation));
        if (aVarMo32696b != null) {
            f41141a.m38021h(aVarMo32696b, annotation, clsM32276b);
        }
    }

    /* renamed from: g */
    private final void m38020g(InterfaceC10101q.a aVar, C10163f c10163f, Object obj) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Class<?> enclosingClass = obj.getClass();
        if (C9801m.m32341a(enclosingClass, Class.class)) {
            C9801m.m32344d(obj, "null cannot be cast to non-null type java.lang.Class<*>");
            aVar.mo33896b(c10163f, m38015a((Class) obj));
            return;
        }
        if (C10692i.f41148a.contains(enclosingClass)) {
            aVar.mo33897c(c10163f, obj);
            return;
        }
        if (C10703d.m38075g(enclosingClass)) {
            if (!enclosingClass.isEnum()) {
                enclosingClass = enclosingClass.getEnclosingClass();
            }
            C9801m.m32345e(enclosingClass, "if (clazz.isEnum) clazz else clazz.enclosingClass");
            C10159b c10159bM38069a = C10703d.m38069a(enclosingClass);
            C9801m.m32344d(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
            C10163f c10163fM35454x = C10163f.m35454x(((Enum) obj).name());
            C9801m.m32345e(c10163fM35454x, "identifier((value as Enum<*>).name)");
            aVar.mo33898d(c10163f, c10159bM38069a, c10163fM35454x);
            return;
        }
        if (Annotation.class.isAssignableFrom(enclosingClass)) {
            Class<?>[] interfaces = enclosingClass.getInterfaces();
            C9801m.m32345e(interfaces, "clazz.interfaces");
            Class<?> cls = (Class) C10795j.m38661N(interfaces);
            C9801m.m32345e(cls, "annotationClass");
            InterfaceC10101q.a aVarMo33899e = aVar.mo33899e(c10163f, C10703d.m38069a(cls));
            if (aVarMo33899e == null) {
                return;
            }
            C9801m.m32344d(obj, "null cannot be cast to non-null type kotlin.Annotation");
            m38021h(aVarMo33899e, (Annotation) obj, cls);
            return;
        }
        if (!enclosingClass.isArray()) {
            throw new UnsupportedOperationException("Unsupported annotation argument value (" + enclosingClass + "): " + obj);
        }
        InterfaceC10101q.b bVarMo33900f = aVar.mo33900f(c10163f);
        if (bVarMo33900f == null) {
            return;
        }
        Class<?> componentType = enclosingClass.getComponentType();
        int i2 = 0;
        if (componentType.isEnum()) {
            C9801m.m32345e(componentType, "componentType");
            C10159b c10159bM38069a2 = C10703d.m38069a(componentType);
            C9801m.m32344d(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr = (Object[]) obj;
            int length = objArr.length;
            while (i2 < length) {
                Object obj2 = objArr[i2];
                C9801m.m32344d(obj2, "null cannot be cast to non-null type kotlin.Enum<*>");
                C10163f c10163fM35454x2 = C10163f.m35454x(((Enum) obj2).name());
                C9801m.m32345e(c10163fM35454x2, "identifier((element as Enum<*>).name)");
                bVarMo33900f.mo33907c(c10159bM38069a2, c10163fM35454x2);
                i2++;
            }
        } else if (C9801m.m32341a(componentType, Class.class)) {
            C9801m.m32344d(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr2 = (Object[]) obj;
            int length2 = objArr2.length;
            while (i2 < length2) {
                Object obj3 = objArr2[i2];
                C9801m.m32344d(obj3, "null cannot be cast to non-null type java.lang.Class<*>");
                bVarMo33900f.mo33909e(m38015a((Class) obj3));
                i2++;
            }
        } else if (Annotation.class.isAssignableFrom(componentType)) {
            C9801m.m32344d(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr3 = (Object[]) obj;
            int length3 = objArr3.length;
            while (i2 < length3) {
                Object obj4 = objArr3[i2];
                C9801m.m32345e(componentType, "componentType");
                InterfaceC10101q.a aVarMo33908d = bVarMo33900f.mo33908d(C10703d.m38069a(componentType));
                if (aVarMo33908d != null) {
                    C9801m.m32344d(obj4, "null cannot be cast to non-null type kotlin.Annotation");
                    m38021h(aVarMo33908d, (Annotation) obj4, componentType);
                }
                i2++;
            }
        } else {
            C9801m.m32344d(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr4 = (Object[]) obj;
            int length4 = objArr4.length;
            while (i2 < length4) {
                bVarMo33900f.mo33906b(objArr4[i2]);
                i2++;
            }
        }
        bVarMo33900f.mo33905a();
    }

    /* renamed from: h */
    private final void m38021h(InterfaceC10101q.a aVar, Annotation annotation, Class<?> cls) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Method[] declaredMethods = cls.getDeclaredMethods();
        C9801m.m32345e(declaredMethods, "annotationType.declaredMethods");
        for (Method method : declaredMethods) {
            try {
                Object objInvoke = method.invoke(annotation, new Object[0]);
                C9801m.m32343c(objInvoke);
                C10163f c10163fM35454x = C10163f.m35454x(method.getName());
                C9801m.m32345e(c10163fM35454x, "identifier(method.name)");
                m38020g(aVar, c10163fM35454x, objInvoke);
            } catch (IllegalAccessException unused) {
            }
        }
        aVar.mo33903a();
    }

    /* renamed from: b */
    public final void m38022b(Class<?> cls, InterfaceC10101q.c cVar) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C9801m.m32346f(cls, "klass");
        C9801m.m32346f(cVar, "visitor");
        Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
        C9801m.m32345e(declaredAnnotations, "klass.declaredAnnotations");
        for (Annotation annotation : declaredAnnotations) {
            C9801m.m32345e(annotation, "annotation");
            m38019f(cVar, annotation);
        }
        cVar.mo32695a();
    }

    /* renamed from: i */
    public final void m38023i(Class<?> cls, InterfaceC10101q.d dVar) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C9801m.m32346f(cls, "klass");
        C9801m.m32346f(dVar, "memberVisitor");
        m38018e(cls, dVar);
        m38016c(cls, dVar);
        m38017d(cls, dVar);
    }
}
