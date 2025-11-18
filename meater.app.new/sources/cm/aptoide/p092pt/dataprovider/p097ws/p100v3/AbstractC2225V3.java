package cm.aptoide.p092pt.dataprovider.p097ws.p100v3;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.dataprovider.BuildConfig;
import cm.aptoide.p092pt.dataprovider.WebService;
import cm.aptoide.p092pt.dataprovider.exception.AptoideWsV3Exception;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p095v3.BaseV3Response;
import cm.aptoide.p092pt.dataprovider.model.p095v3.ErrorResponse;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.preferences.toolbox.ToolboxManager;
import java.io.IOException;
import java.util.Iterator;
import okhttp3.OkHttpClient;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11256e;
import retrofit2.Converter;
import retrofit2.adapter.rxjava.HttpException;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v3.V3 */
/* loaded from: classes.dex */
public abstract class AbstractC2225V3<U> extends WebService<Service, U> {
    protected static final String BASE_HOST = "https://webservices.aptoide.com/webservices/3/";
    private final String INVALID_ACCESS_TOKEN_CODE;
    private boolean accessTokenRetry;
    private final BodyInterceptor<BaseBody> bodyInterceptor;
    protected final BaseBody map;
    private final TokenInvalidator tokenInvalidator;

    protected AbstractC2225V3(String str, BaseBody baseBody, BodyInterceptor<BaseBody> bodyInterceptor, TokenInvalidator tokenInvalidator) {
        super(Service.class, new OkHttpClient(), WebService.getDefaultConverter(), str);
        this.INVALID_ACCESS_TOKEN_CODE = "invalid_token";
        this.accessTokenRetry = false;
        this.map = baseBody;
        this.bodyInterceptor = bodyInterceptor;
        this.tokenInvalidator = tokenInvalidator;
    }

    public static String getErrorMessage(BaseV3Response baseV3Response) {
        StringBuilder sb = new StringBuilder();
        if (baseV3Response == null || baseV3Response.getErrors() == null) {
            sb.append("Server returned null response.");
        } else {
            Iterator<ErrorResponse> it = baseV3Response.getErrors().iterator();
            while (it.hasNext()) {
                sb.append(it.next().msg);
                sb.append(". ");
            }
            if (sb.length() == 0) {
                sb.append("Server failed with empty error list.");
            }
        }
        return sb.toString();
    }

    public static String getHost(SharedPreferences sharedPreferences) {
        StringBuilder sb = new StringBuilder();
        sb.append(ToolboxManager.isToolboxEnableHttpScheme(sharedPreferences) ? "http" : BuildConfig.APTOIDE_WEB_SERVICES_SCHEME);
        sb.append("://");
        sb.append(BuildConfig.APTOIDE_WEB_SERVICES_HOST);
        sb.append("/webservices/3/");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$observe$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7435c(boolean z, Throwable th) {
        if (th instanceof HttpException) {
            try {
                GenericResponseV3 genericResponseV3 = (GenericResponseV3) this.converterFactory.responseBodyConverter(GenericResponseV3.class, null, null).convert(((HttpException) th).response().errorBody());
                if (!"invalid_token".equals(genericResponseV3.getError())) {
                    AptoideWsV3Exception aptoideWsV3Exception = new AptoideWsV3Exception(th);
                    aptoideWsV3Exception.setBaseResponse(genericResponseV3);
                    return C11234e.m40017C(aptoideWsV3Exception);
                }
                if (!this.accessTokenRetry) {
                    this.accessTokenRetry = true;
                    return this.tokenInvalidator.invalidateAccessToken().m39974b(observe(z));
                }
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        return C11234e.m40017C(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$observe$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7436d(final boolean z, BaseBody baseBody) {
        return super.observe(z).m40104o0(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v3.a
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8555f.m7435c(z, (Throwable) obj);
            }
        });
    }

    @Override // cm.aptoide.p092pt.dataprovider.WebService
    public C11234e<U> observe(final boolean z) {
        return (C11234e<U>) this.bodyInterceptor.intercept(this.map).m39922k(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v3.b
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8557f.m7436d(z, (BaseBody) obj);
            }
        });
    }

    protected AbstractC2225V3(BaseBody baseBody, OkHttpClient okHttpClient, Converter.Factory factory, BodyInterceptor<BaseBody> bodyInterceptor, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        super(Service.class, okHttpClient, factory, getHost(sharedPreferences));
        this.INVALID_ACCESS_TOKEN_CODE = "invalid_token";
        this.accessTokenRetry = false;
        this.map = baseBody;
        this.bodyInterceptor = bodyInterceptor;
        this.tokenInvalidator = tokenInvalidator;
    }

    protected AbstractC2225V3(OkHttpClient okHttpClient, Converter.Factory factory, BodyInterceptor<BaseBody> bodyInterceptor, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        this(new BaseBody(), okHttpClient, factory, bodyInterceptor, tokenInvalidator, sharedPreferences);
    }
}
