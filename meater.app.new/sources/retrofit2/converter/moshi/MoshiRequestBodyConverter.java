package retrofit2.converter.moshi;

import com.squareup.moshi.AbstractC8716f;
import com.squareup.moshi.AbstractC8725o;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import p353j.C9703f;
import retrofit2.Converter;

/* loaded from: classes3.dex */
final class MoshiRequestBodyConverter<T> implements Converter<T, RequestBody> {
    private static final MediaType MEDIA_TYPE = MediaType.get("application/json; charset=UTF-8");
    private final AbstractC8716f<T> adapter;

    MoshiRequestBodyConverter(AbstractC8716f<T> abstractC8716f) {
        this.adapter = abstractC8716f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // retrofit2.Converter
    public /* bridge */ /* synthetic */ RequestBody convert(Object obj) throws IOException {
        return convert((MoshiRequestBodyConverter<T>) obj);
    }

    @Override // retrofit2.Converter
    public RequestBody convert(T t) throws IOException {
        C9703f c9703f = new C9703f();
        this.adapter.toJson(AbstractC8725o.m27770p(c9703f), (AbstractC8725o) t);
        return RequestBody.create(MEDIA_TYPE, c9703f.mo32003D0());
    }
}
