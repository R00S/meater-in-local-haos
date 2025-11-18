package cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.GetStoreMeta;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.AbstractC2229V7;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;
import okhttp3.OkHttpClient;
import p456rx.C11234e;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class GetMyStoreMetaRequest extends AbstractC2229V7<GetStoreMeta, BaseBody> {
    public GetMyStoreMetaRequest(BaseBody baseBody, String str, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator) {
        super(baseBody, str, okHttpClient, factory, bodyInterceptor, tokenInvalidator);
    }

    /* renamed from: of */
    public static GetMyStoreMetaRequest m7489of(BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        return new GetMyStoreMetaRequest(new BaseBody(), AbstractC2229V7.getHost(sharedPreferences), bodyInterceptor, okHttpClient, factory, tokenInvalidator);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cm.aptoide.p092pt.dataprovider.WebService
    public C11234e<GetStoreMeta> loadDataFromNetwork(AbstractC2229V7.Interfaces interfaces, boolean z) {
        return interfaces.getMyStoreMeta((BaseBody) this.body, z);
    }
}
