package nd;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* compiled from: ServiceMethod.java */
/* loaded from: classes3.dex */
abstract class u<T> {
    u() {
    }

    static <T> u<T> b(t tVar, Method method) {
        r rVarB = r.b(tVar, method);
        Type genericReturnType = method.getGenericReturnType();
        if (x.j(genericReturnType)) {
            throw x.m(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        }
        if (genericReturnType != Void.TYPE) {
            return j.f(tVar, method, rVarB);
        }
        throw x.m(method, "Service methods cannot return void.", new Object[0]);
    }

    abstract T a(Object[] objArr);
}
