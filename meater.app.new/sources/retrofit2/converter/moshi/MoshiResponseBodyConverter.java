package retrofit2.converter.moshi;

import com.squareup.moshi.AbstractC8716f;
import com.squareup.moshi.AbstractC8719i;
import com.squareup.moshi.JsonDataException;
import java.io.IOException;
import okhttp3.ResponseBody;
import p353j.C9710i;
import p353j.InterfaceC9709h;
import retrofit2.Converter;

/* loaded from: classes3.dex */
final class MoshiResponseBodyConverter<T> implements Converter<ResponseBody, T> {
    private static final C9710i UTF8_BOM = C9710i.m32084q("EFBBBF");
    private final AbstractC8716f<T> adapter;

    MoshiResponseBodyConverter(AbstractC8716f<T> abstractC8716f) {
        this.adapter = abstractC8716f;
    }

    @Override // retrofit2.Converter
    public T convert(ResponseBody responseBody) throws IOException {
        InterfaceC9709h bodySource = responseBody.getBodySource();
        try {
            if (bodySource.mo32059v0(0L, UTF8_BOM)) {
                bodySource.skip(r3.m32093P());
            }
            AbstractC8719i abstractC8719iM27698z = AbstractC8719i.m27698z(bodySource);
            T tFromJson = this.adapter.fromJson(abstractC8719iM27698z);
            if (abstractC8719iM27698z.mo27699A() == AbstractC8719i.b.END_DOCUMENT) {
                return tFromJson;
            }
            throw new JsonDataException("JSON document was not fully consumed.");
        } finally {
            responseBody.close();
        }
    }
}
