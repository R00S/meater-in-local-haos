package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* loaded from: classes3.dex */
public interface Converter<F, T> {

    /* loaded from: classes.dex */
    public static abstract class Factory {
        protected static Type getParameterUpperBound(int i2, ParameterizedType parameterizedType) {
            return Utils.getParameterUpperBound(i2, parameterizedType);
        }

        protected static Class<?> getRawType(Type type) {
            return Utils.getRawType(type);
        }

        public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
            return null;
        }

        public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
            return null;
        }

        public Converter<?, String> stringConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
            return null;
        }
    }

    T convert(F f2) throws IOException;
}
