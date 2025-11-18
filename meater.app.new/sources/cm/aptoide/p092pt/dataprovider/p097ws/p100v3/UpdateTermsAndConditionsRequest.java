package cm.aptoide.p092pt.dataprovider.p097ws.p100v3;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p095v3.BaseV3Response;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import okhttp3.OkHttpClient;
import p456rx.C11234e;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class UpdateTermsAndConditionsRequest extends AbstractC2225V3<BaseV3Response> {
    private UpdateTermsAndConditionsRequest(BaseBody baseBody, OkHttpClient okHttpClient, Converter.Factory factory, BodyInterceptor<BaseBody> bodyInterceptor, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        super(baseBody, okHttpClient, factory, bodyInterceptor, tokenInvalidator, sharedPreferences);
    }

    /* renamed from: of */
    public static UpdateTermsAndConditionsRequest m7434of(BodyInterceptor<BaseBody> bodyInterceptor, Converter.Factory factory, OkHttpClient okHttpClient, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        return new UpdateTermsAndConditionsRequest(new BaseBody(), okHttpClient, factory, bodyInterceptor, tokenInvalidator, sharedPreferences);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cm.aptoide.p092pt.dataprovider.WebService
    public C11234e<BaseV3Response> loadDataFromNetwork(Service service, boolean z) {
        return service.updateTermsAndConditions(this.map, z);
    }
}
