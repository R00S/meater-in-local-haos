package cm.aptoide.p092pt.app;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p099v2.GenericResponseV2;
import cm.aptoide.p092pt.dataprovider.p097ws.p100v3.AddApkFlagRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p100v3.BaseBody;
import okhttp3.OkHttpClient;
import p456rx.Single;

/* loaded from: classes.dex */
public class FlagService {
    private final BodyInterceptor<BaseBody> bodyInterceptorV3;
    private final OkHttpClient okHttpClient;
    private final SharedPreferences sharedPreferences;
    private final TokenInvalidator tokenInvalidator;

    public FlagService(BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        this.bodyInterceptorV3 = bodyInterceptor;
        this.okHttpClient = okHttpClient;
        this.tokenInvalidator = tokenInvalidator;
        this.sharedPreferences = sharedPreferences;
    }

    public Single<GenericResponseV2> doApkFlagRequest(String str, String str2, String str3) {
        return AddApkFlagRequest.m7428of(str, str2, str3, this.bodyInterceptorV3, this.okHttpClient, this.tokenInvalidator, this.sharedPreferences).observe(true).m40085Z0();
    }
}
