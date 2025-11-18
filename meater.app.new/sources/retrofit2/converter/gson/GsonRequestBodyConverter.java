package retrofit2.converter.gson;

import com.google.gson.AbstractC8578q;
import com.google.gson.C8566e;
import com.google.gson.stream.C8587c;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import p353j.C9703f;
import retrofit2.Converter;

/* loaded from: classes3.dex */
final class GsonRequestBodyConverter<T> implements Converter<T, RequestBody> {
    private static final MediaType MEDIA_TYPE = MediaType.get("application/json; charset=UTF-8");
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final AbstractC8578q<T> adapter;
    private final C8566e gson;

    GsonRequestBodyConverter(C8566e c8566e, AbstractC8578q<T> abstractC8578q) {
        this.gson = c8566e;
        this.adapter = abstractC8578q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // retrofit2.Converter
    public /* bridge */ /* synthetic */ RequestBody convert(Object obj) throws IOException {
        return convert((GsonRequestBodyConverter<T>) obj);
    }

    @Override // retrofit2.Converter
    public RequestBody convert(T t) throws IOException {
        C9703f c9703f = new C9703f();
        C8587c c8587cM26930o = this.gson.m26930o(new OutputStreamWriter(c9703f.m32002D(), UTF_8));
        this.adapter.mo26939d(c8587cM26930o, t);
        c8587cM26930o.close();
        return RequestBody.create(MEDIA_TYPE, c9703f.mo32003D0());
    }
}
