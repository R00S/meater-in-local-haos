package cm.aptoide.p092pt.networking;

import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes.dex */
public class Pnp1AuthorizationInterceptor implements Interceptor {
    public static final String ACCESS_TOKEN_KEY = "access_token";
    private final AuthenticationPersistence authenticationPersistence;
    private long timeStamp = 0;
    private final TokenInvalidator tokenInvalidator;

    public Pnp1AuthorizationInterceptor(AuthenticationPersistence authenticationPersistence, TokenInvalidator tokenInvalidator) {
        this.authenticationPersistence = authenticationPersistence;
        this.tokenInvalidator = tokenInvalidator;
    }

    private synchronized void invalidateToken() {
        if (System.currentTimeMillis() - this.timeStamp > 5000) {
            this.tokenInvalidator.invalidateAccessToken().m39976d();
            this.timeStamp = System.currentTimeMillis();
        }
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        if (this.authenticationPersistence.getAuthentication().m39933y().m40633b().isAuthenticated()) {
            request = request.newBuilder().url(request.url().newBuilder().addQueryParameter("access_token", this.authenticationPersistence.getAuthentication().m39933y().m40633b().getAccessToken()).build()).build();
        }
        Response responseProceed = chain.proceed(request);
        if (responseProceed.code() != 401) {
            return responseProceed;
        }
        invalidateToken();
        return chain.proceed(request.newBuilder().url(request.url().newBuilder().setQueryParameter("access_token", this.authenticationPersistence.getAuthentication().m39933y().m40633b().getAccessToken()).build()).build());
    }
}
