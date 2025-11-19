package nd;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import oc.AbstractC4179C;
import oc.E;

/* compiled from: Converter.java */
/* loaded from: classes3.dex */
public interface f<F, T> {

    /* compiled from: Converter.java */
    public static abstract class a {
        protected static Type a(int i10, ParameterizedType parameterizedType) {
            return x.g(i10, parameterizedType);
        }

        protected static Class<?> b(Type type) {
            return x.h(type);
        }

        public f<?, AbstractC4179C> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, t tVar) {
            return null;
        }

        public f<E, ?> d(Type type, Annotation[] annotationArr, t tVar) {
            return null;
        }

        public f<?, String> e(Type type, Annotation[] annotationArr, t tVar) {
            return null;
        }
    }

    T a(F f10);
}
