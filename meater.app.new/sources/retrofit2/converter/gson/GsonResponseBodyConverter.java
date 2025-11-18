package retrofit2.converter.gson;

import com.google.gson.AbstractC8578q;
import com.google.gson.C8566e;
import com.google.gson.JsonIOException;
import com.google.gson.stream.C8585a;
import com.google.gson.stream.EnumC8586b;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Converter;

/* loaded from: classes3.dex */
final class GsonResponseBodyConverter<T> implements Converter<ResponseBody, T> {
    private final AbstractC8578q<T> adapter;
    private final C8566e gson;

    GsonResponseBodyConverter(C8566e c8566e, AbstractC8578q<T> abstractC8578q) {
        this.gson = c8566e;
        this.adapter = abstractC8578q;
    }

    @Override // retrofit2.Converter
    public T convert(ResponseBody responseBody) throws IOException {
        C8585a c8585aM26929n = this.gson.m26929n(responseBody.charStream());
        try {
            T tMo26938b = this.adapter.mo26938b(c8585aM26929n);
            if (c8585aM26929n.mo27001Q() == EnumC8586b.END_DOCUMENT) {
                return tMo26938b;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            responseBody.close();
        }
    }
}
