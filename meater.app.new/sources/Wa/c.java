package Wa;

import Oa.p;
import Xa.C1822f;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import jb.x;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.C3846c;
import kotlin.jvm.internal.C3862t;
import qb.b;
import vb.C4942f;
import yb.EnumC5149e;

/* compiled from: ReflectKotlinClass.kt */
/* loaded from: classes3.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f18480a = new c();

    private c() {
    }

    private final C4942f a(Class<?> cls) {
        int i10 = 0;
        while (cls.isArray()) {
            i10++;
            cls = cls.getComponentType();
        }
        if (!cls.isPrimitive()) {
            qb.b bVarE = C1822f.e(cls);
            qb.b bVarM = Qa.c.f14576a.m(bVarE.a());
            if (bVarM != null) {
                bVarE = bVarM;
            }
            return new C4942f(bVarE, i10);
        }
        if (!C3862t.b(cls, Void.TYPE)) {
            Oa.m mVarT = EnumC5149e.n(cls.getName()).t();
            C3862t.f(mVarT, "getPrimitiveType(...)");
            return i10 > 0 ? new C4942f(qb.b.f48178d.c(mVarT.s()), i10 - 1) : new C4942f(qb.b.f48178d.c(mVarT.u()), i10);
        }
        b.a aVar = qb.b.f48178d;
        qb.c cVarL = p.a.f13451f.l();
        C3862t.f(cVarL, "toSafe(...)");
        return new C4942f(aVar.c(cVarL), i10);
    }

    private final void c(Class<?> cls, x.d dVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Iterator itA = C3846c.a(cls.getDeclaredConstructors());
        while (itA.hasNext()) {
            Constructor<?> constructor = (Constructor) itA.next();
            qb.f fVar = qb.h.f48207j;
            m mVar = m.f18494a;
            C3862t.d(constructor);
            x.e eVarB = dVar.b(fVar, mVar.a(constructor));
            if (eVarB != null) {
                Iterator itA2 = C3846c.a(constructor.getDeclaredAnnotations());
                while (itA2.hasNext()) {
                    Annotation annotation = (Annotation) itA2.next();
                    C3862t.d(annotation);
                    f(eVarB, annotation);
                }
                Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                C3862t.d(parameterAnnotations);
                if (!(parameterAnnotations.length == 0)) {
                    int length = constructor.getParameterTypes().length - parameterAnnotations.length;
                    int length2 = parameterAnnotations.length;
                    for (int i10 = 0; i10 < length2; i10++) {
                        Iterator itA3 = C3846c.a(parameterAnnotations[i10]);
                        while (itA3.hasNext()) {
                            Annotation annotation2 = (Annotation) itA3.next();
                            Class<?> clsB = Aa.a.b(Aa.a.a(annotation2));
                            qb.b bVarE = C1822f.e(clsB);
                            C3862t.d(annotation2);
                            x.a aVarB = eVarB.b(i10 + length, bVarE, new b(annotation2));
                            if (aVarB != null) {
                                f18480a.h(aVarB, annotation2, clsB);
                            }
                        }
                    }
                }
                eVarB.a();
            }
        }
    }

    private final void d(Class<?> cls, x.d dVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Iterator itA = C3846c.a(cls.getDeclaredFields());
        while (itA.hasNext()) {
            Field field = (Field) itA.next();
            qb.f fVarT = qb.f.t(field.getName());
            C3862t.f(fVarT, "identifier(...)");
            m mVar = m.f18494a;
            C3862t.d(field);
            x.c cVarA = dVar.a(fVarT, mVar.b(field), null);
            if (cVarA != null) {
                Iterator itA2 = C3846c.a(field.getDeclaredAnnotations());
                while (itA2.hasNext()) {
                    Annotation annotation = (Annotation) itA2.next();
                    C3862t.d(annotation);
                    f(cVarA, annotation);
                }
                cVarA.a();
            }
        }
    }

    private final void e(Class<?> cls, x.d dVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Iterator itA = C3846c.a(cls.getDeclaredMethods());
        while (itA.hasNext()) {
            Method method = (Method) itA.next();
            qb.f fVarT = qb.f.t(method.getName());
            C3862t.f(fVarT, "identifier(...)");
            m mVar = m.f18494a;
            C3862t.d(method);
            x.e eVarB = dVar.b(fVarT, mVar.c(method));
            if (eVarB != null) {
                Iterator itA2 = C3846c.a(method.getDeclaredAnnotations());
                while (itA2.hasNext()) {
                    Annotation annotation = (Annotation) itA2.next();
                    C3862t.d(annotation);
                    f(eVarB, annotation);
                }
                Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                C3862t.f(parameterAnnotations, "getParameterAnnotations(...)");
                Annotation[][] annotationArr = parameterAnnotations;
                int length = annotationArr.length;
                for (int i10 = 0; i10 < length; i10++) {
                    Iterator itA3 = C3846c.a(annotationArr[i10]);
                    while (itA3.hasNext()) {
                        Annotation annotation2 = (Annotation) itA3.next();
                        Class<?> clsB = Aa.a.b(Aa.a.a(annotation2));
                        qb.b bVarE = C1822f.e(clsB);
                        C3862t.d(annotation2);
                        x.a aVarB = eVarB.b(i10, bVarE, new b(annotation2));
                        if (aVarB != null) {
                            f18480a.h(aVarB, annotation2, clsB);
                        }
                    }
                }
                eVarB.a();
            }
        }
    }

    private final void f(x.c cVar, Annotation annotation) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class<?> clsB = Aa.a.b(Aa.a.a(annotation));
        x.a aVarC = cVar.c(C1822f.e(clsB), new b(annotation));
        if (aVarC != null) {
            f18480a.h(aVarC, annotation, clsB);
        }
    }

    private final void g(x.a aVar, qb.f fVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class<?> enclosingClass = obj.getClass();
        if (C3862t.b(enclosingClass, Class.class)) {
            C3862t.e(obj, "null cannot be cast to non-null type java.lang.Class<*>");
            aVar.f(fVar, a((Class) obj));
            return;
        }
        if (i.f18487a.contains(enclosingClass)) {
            aVar.b(fVar, obj);
            return;
        }
        if (C1822f.l(enclosingClass)) {
            if (!enclosingClass.isEnum()) {
                enclosingClass = enclosingClass.getEnclosingClass();
            }
            C3862t.d(enclosingClass);
            qb.b bVarE = C1822f.e(enclosingClass);
            C3862t.e(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
            qb.f fVarT = qb.f.t(((Enum) obj).name());
            C3862t.f(fVarT, "identifier(...)");
            aVar.c(fVar, bVarE, fVarT);
            return;
        }
        if (Annotation.class.isAssignableFrom(enclosingClass)) {
            Class<?>[] interfaces = enclosingClass.getInterfaces();
            C3862t.f(interfaces, "getInterfaces(...)");
            Class<?> cls = (Class) C3831l.v0(interfaces);
            C3862t.d(cls);
            x.a aVarD = aVar.d(fVar, C1822f.e(cls));
            if (aVarD == null) {
                return;
            }
            C3862t.e(obj, "null cannot be cast to non-null type kotlin.Annotation");
            h(aVarD, (Annotation) obj, cls);
            return;
        }
        if (!enclosingClass.isArray()) {
            throw new UnsupportedOperationException("Unsupported annotation argument value (" + enclosingClass + "): " + obj);
        }
        x.b bVarE2 = aVar.e(fVar);
        if (bVarE2 == null) {
            return;
        }
        Class<?> componentType = enclosingClass.getComponentType();
        int i10 = 0;
        if (componentType.isEnum()) {
            C3862t.d(componentType);
            qb.b bVarE3 = C1822f.e(componentType);
            C3862t.e(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr = (Object[]) obj;
            int length = objArr.length;
            while (i10 < length) {
                Object obj2 = objArr[i10];
                C3862t.e(obj2, "null cannot be cast to non-null type kotlin.Enum<*>");
                qb.f fVarT2 = qb.f.t(((Enum) obj2).name());
                C3862t.f(fVarT2, "identifier(...)");
                bVarE2.b(bVarE3, fVarT2);
                i10++;
            }
        } else if (C3862t.b(componentType, Class.class)) {
            C3862t.e(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr2 = (Object[]) obj;
            int length2 = objArr2.length;
            while (i10 < length2) {
                Object obj3 = objArr2[i10];
                C3862t.e(obj3, "null cannot be cast to non-null type java.lang.Class<*>");
                bVarE2.e(a((Class) obj3));
                i10++;
            }
        } else if (Annotation.class.isAssignableFrom(componentType)) {
            C3862t.e(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr3 = (Object[]) obj;
            int length3 = objArr3.length;
            while (i10 < length3) {
                Object obj4 = objArr3[i10];
                C3862t.d(componentType);
                x.a aVarD2 = bVarE2.d(C1822f.e(componentType));
                if (aVarD2 != null) {
                    C3862t.e(obj4, "null cannot be cast to non-null type kotlin.Annotation");
                    h(aVarD2, (Annotation) obj4, componentType);
                }
                i10++;
            }
        } else {
            C3862t.e(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr4 = (Object[]) obj;
            int length4 = objArr4.length;
            while (i10 < length4) {
                bVarE2.c(objArr4[i10]);
                i10++;
            }
        }
        bVarE2.a();
    }

    private final void h(x.a aVar, Annotation annotation, Class<?> cls) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Iterator itA = C3846c.a(cls.getDeclaredMethods());
        while (itA.hasNext()) {
            Method method = (Method) itA.next();
            try {
                Object objInvoke = method.invoke(annotation, null);
                C3862t.d(objInvoke);
                qb.f fVarT = qb.f.t(method.getName());
                C3862t.f(fVarT, "identifier(...)");
                g(aVar, fVarT, objInvoke);
            } catch (IllegalAccessException unused) {
            }
        }
        aVar.a();
    }

    public final void b(Class<?> klass, x.c visitor) {
        C3862t.g(klass, "klass");
        C3862t.g(visitor, "visitor");
        Iterator itA = C3846c.a(klass.getDeclaredAnnotations());
        while (itA.hasNext()) {
            Annotation annotation = (Annotation) itA.next();
            C3862t.d(annotation);
            f(visitor, annotation);
        }
        visitor.a();
    }

    public final void i(Class<?> klass, x.d memberVisitor) {
        C3862t.g(klass, "klass");
        C3862t.g(memberVisitor, "memberVisitor");
        e(klass, memberVisitor);
        c(klass, memberVisitor);
        d(klass, memberVisitor);
    }
}
