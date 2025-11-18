package cm.aptoide.p092pt.dataprovider.p097ws.p100v3;

import android.content.SharedPreferences;
import android.text.TextUtils;
import cm.aptoide.p092pt.BuildConfig;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p095v3.OAuth;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.networking.AuthenticationPersistence;
import cm.aptoide.p092pt.networking.BodyInterceptorV3;
import okhttp3.OkHttpClient;
import p456rx.C11234e;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class OAuth2AuthenticationRequest extends AbstractC2225V3<OAuth> {
    public OAuth2AuthenticationRequest(BaseBody baseBody, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        super(baseBody, okHttpClient, factory, bodyInterceptor, tokenInvalidator, sharedPreferences);
    }

    /* renamed from: of */
    public static OAuth2AuthenticationRequest m7432of(String str, String str2, String str3, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, String str4, String str5) {
        BaseBody baseBody = new BaseBody();
        baseBody.put("grant_type", "code");
        baseBody.put("client_id", BuildConfig.MARKET_NAME);
        baseBody.put("mode", BodyInterceptorV3.RESPONSE_MODE_JSON);
        if (str3 != null) {
            switch (str3) {
                case "APTOIDE":
                    baseBody.put("username", str);
                    baseBody.put("code", str2);
                    break;
                case "ABAN":
                    baseBody.put("oauthUserName", str);
                    baseBody.put("oauthToken", str2);
                    baseBody.put("authMode", str5);
                    break;
                case "FACEBOOK":
                case "GOOGLE":
                    baseBody.put("authMode", str5);
                    baseBody.put("oauthToken", str2);
                    break;
            }
        }
        if (!TextUtils.isEmpty(str4)) {
            baseBody.put("oem_id", str4);
        }
        return new OAuth2AuthenticationRequest(baseBody, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cm.aptoide.p092pt.dataprovider.WebService
    public C11234e<OAuth> loadDataFromNetwork(Service service, boolean z) {
        return service.oauth2Authentication(this.map, z);
    }

    /* renamed from: of */
    public static OAuth2AuthenticationRequest m7431of(String str, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, String str2) {
        BaseBody baseBody = new BaseBody();
        baseBody.put("grant_type", AuthenticationPersistence.ACCOUNT_REFRESH_TOKEN);
        baseBody.put("client_id", BuildConfig.MARKET_NAME);
        baseBody.put("mode", BodyInterceptorV3.RESPONSE_MODE_JSON);
        if (!TextUtils.isEmpty(str2)) {
            baseBody.put("oem_id", str2);
        }
        baseBody.put(AuthenticationPersistence.ACCOUNT_REFRESH_TOKEN, str);
        return new OAuth2AuthenticationRequest(baseBody, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }
}
