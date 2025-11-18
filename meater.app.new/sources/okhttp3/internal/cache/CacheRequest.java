package okhttp3.internal.cache;

import java.io.IOException;
import kotlin.Metadata;
import okhttp3.HttpUrl;
import p353j.InterfaceC9696b0;

/* compiled from: CacheRequest.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m32267d2 = {"Lokhttp3/internal/cache/CacheRequest;", HttpUrl.FRAGMENT_ENCODE_SET, "Lj/b0;", "body", "()Lj/b0;", "Lkotlin/u;", "abort", "()V", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
/* loaded from: classes3.dex */
public interface CacheRequest {
    void abort();

    InterfaceC9696b0 body() throws IOException;
}
