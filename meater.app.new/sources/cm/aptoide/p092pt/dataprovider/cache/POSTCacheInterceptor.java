package cm.aptoide.p092pt.dataprovider.cache;

import cm.aptoide.p092pt.dataprovider.WebService;
import cm.aptoide.p092pt.logger.Logger;
import java.io.IOException;
import java.util.Iterator;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes.dex */
public class POSTCacheInterceptor implements Interceptor {
    private final String TAG = POSTCacheInterceptor.class.getSimpleName();
    private final Cache<Request, Response> cache;

    public POSTCacheInterceptor(Cache<Request, Response> cache) {
        this.cache = cache;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        if (!request.method().equalsIgnoreCase("POST")) {
            return chain.proceed(request);
        }
        Headers headers = request.headers();
        if (headers.size() > 0) {
            Iterator<String> it = headers.values(WebService.BYPASS_HEADER_KEY).iterator();
            while (it.hasNext()) {
                if (it.next().equalsIgnoreCase("true")) {
                    return chain.proceed(request);
                }
            }
        }
        if (this.cache.contains(request)) {
            Response response = this.cache.get(request);
            if (response != null) {
                Logger.getInstance().m8283v(this.TAG, String.format("cache hit '%s'", request.url()));
                return response;
            }
            Logger.getInstance().m8283v(this.TAG, String.format("cache hit but with null result '%s'", request.url()));
        }
        Logger.getInstance().m8283v(this.TAG, String.format("cache miss '%s'", request.url()));
        Response responseProceed = chain.proceed(request);
        if (responseProceed.isSuccessful()) {
            this.cache.put(request, responseProceed);
        }
        return responseProceed;
    }
}
