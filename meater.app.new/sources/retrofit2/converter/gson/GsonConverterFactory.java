package retrofit2.converter.gson;

import com.google.gson.C8566e;
import com.google.gson.p219u.C8619a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* loaded from: classes3.dex */
public final class GsonConverterFactory extends Converter.Factory {
    private final C8566e gson;

    private GsonConverterFactory(C8566e c8566e) {
        this.gson = c8566e;
    }

    public static GsonConverterFactory create() {
        return create(new C8566e());
    }

    @Override // retrofit2.Converter.Factory
    public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        return new GsonRequestBodyConverter(this.gson, this.gson.m26926j(C8619a.get(type)));
    }

    @Override // retrofit2.Converter.Factory
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        return new GsonResponseBodyConverter(this.gson, this.gson.m26926j(C8619a.get(type)));
    }

    public static GsonConverterFactory create(C8566e c8566e) {
        if (c8566e != null) {
            return new GsonConverterFactory(c8566e);
        }
        throw new NullPointerException("gson == null");
    }
}
