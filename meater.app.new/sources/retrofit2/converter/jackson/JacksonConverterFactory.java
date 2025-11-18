package retrofit2.converter.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* loaded from: classes3.dex */
public final class JacksonConverterFactory extends Converter.Factory {
    private final ObjectMapper mapper;

    private JacksonConverterFactory(ObjectMapper objectMapper) {
        if (objectMapper == null) {
            throw new NullPointerException("mapper == null");
        }
        this.mapper = objectMapper;
    }

    public static JacksonConverterFactory create() {
        return create(new ObjectMapper());
    }

    @Override // retrofit2.Converter.Factory
    public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        return new JacksonRequestBodyConverter(this.mapper.writerWithType(this.mapper.getTypeFactory().constructType(type)));
    }

    @Override // retrofit2.Converter.Factory
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        return new JacksonResponseBodyConverter(this.mapper.reader(this.mapper.getTypeFactory().constructType(type)));
    }

    public static JacksonConverterFactory create(ObjectMapper objectMapper) {
        return new JacksonConverterFactory(objectMapper);
    }
}
