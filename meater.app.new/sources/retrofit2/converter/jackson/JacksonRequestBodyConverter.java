package retrofit2.converter.jackson;

import com.fasterxml.jackson.databind.ObjectWriter;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Converter;

/* loaded from: classes3.dex */
final class JacksonRequestBodyConverter<T> implements Converter<T, RequestBody> {
    private static final MediaType MEDIA_TYPE = MediaType.parse("application/json; charset=UTF-8");
    private final ObjectWriter adapter;

    JacksonRequestBodyConverter(ObjectWriter objectWriter) {
        this.adapter = objectWriter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // retrofit2.Converter
    public /* bridge */ /* synthetic */ RequestBody convert(Object obj) throws IOException {
        return convert((JacksonRequestBodyConverter<T>) obj);
    }

    @Override // retrofit2.Converter
    public RequestBody convert(T t) throws IOException {
        return RequestBody.create(MEDIA_TYPE, this.adapter.writeValueAsBytes(t));
    }
}
