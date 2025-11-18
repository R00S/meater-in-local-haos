package cm.aptoide.p092pt.dataprovider.p097ws.p100v3;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.dataprovider.WebService;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p099v2.GenericResponseV2;
import cm.aptoide.p092pt.networking.BodyInterceptorV3;
import okhttp3.OkHttpClient;
import p456rx.C11234e;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class AddApkFlagRequest extends AbstractC2225V3<GenericResponseV2> {
    protected AddApkFlagRequest(BaseBody baseBody, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        super(baseBody, okHttpClient, factory, bodyInterceptor, tokenInvalidator, sharedPreferences);
    }

    /* renamed from: of */
    public static AddApkFlagRequest m7428of(String str, String str2, String str3, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        BaseBody baseBody = new BaseBody();
        baseBody.put("repo", str);
        baseBody.put("md5sum", str2);
        baseBody.put("flag", str3);
        baseBody.put("mode", BodyInterceptorV3.RESPONSE_MODE_JSON);
        return new AddApkFlagRequest(baseBody, bodyInterceptor, okHttpClient, WebService.getDefaultConverter(), tokenInvalidator, sharedPreferences);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cm.aptoide.p092pt.dataprovider.WebService
    public C11234e<GenericResponseV2> loadDataFromNetwork(Service service, boolean z) {
        return service.addApkFlag(this.map, z);
    }
}
