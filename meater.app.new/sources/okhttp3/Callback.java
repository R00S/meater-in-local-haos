package okhttp3;

import java.io.IOException;
import kotlin.Metadata;

/* compiled from: Callback.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m32267d2 = {"Lokhttp3/Callback;", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/Call;", "call", "Ljava/io/IOException;", "e", "Lkotlin/u;", "onFailure", "(Lokhttp3/Call;Ljava/io/IOException;)V", "Lokhttp3/Response;", "response", "onResponse", "(Lokhttp3/Call;Lokhttp3/Response;)V", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
/* loaded from: classes3.dex */
public interface Callback {
    void onFailure(Call call, IOException e2);

    void onResponse(Call call, Response response) throws IOException;
}
