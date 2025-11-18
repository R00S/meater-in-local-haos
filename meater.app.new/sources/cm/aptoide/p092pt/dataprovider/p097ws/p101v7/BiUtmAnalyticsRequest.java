package cm.aptoide.p092pt.dataprovider.p097ws.p101v7;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.AbstractC2229V7;
import okhttp3.OkHttpClient;
import p456rx.C11234e;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class BiUtmAnalyticsRequest extends AbstractC2229V7<BaseV7Response, BiUtmAnalyticsRequestBody> {
    private final String action;
    private final String context;
    private final String name;

    private BiUtmAnalyticsRequest(String str, String str2, String str3, BiUtmAnalyticsRequestBody biUtmAnalyticsRequestBody, OkHttpClient okHttpClient, Converter.Factory factory, BodyInterceptor bodyInterceptor, SharedPreferences sharedPreferences, TokenInvalidator tokenInvalidator) {
        super(biUtmAnalyticsRequestBody, AbstractC2229V7.getHost(sharedPreferences), okHttpClient, factory, bodyInterceptor, tokenInvalidator);
        this.action = str;
        this.name = str2;
        this.context = str3;
    }

    /* renamed from: of */
    public static BiUtmAnalyticsRequest m7437of(String str, String str2, String str3, BiUtmAnalyticsRequestBody biUtmAnalyticsRequestBody, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, SharedPreferences sharedPreferences, TokenInvalidator tokenInvalidator) {
        return new BiUtmAnalyticsRequest(str, str2, str3, biUtmAnalyticsRequestBody, okHttpClient, factory, bodyInterceptor, sharedPreferences, tokenInvalidator);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cm.aptoide.p092pt.dataprovider.WebService
    public C11234e<BaseV7Response> loadDataFromNetwork(AbstractC2229V7.Interfaces interfaces, boolean z) {
        return interfaces.addEvent(this.name, this.action, this.context, (BiUtmAnalyticsRequestBody) this.body);
    }
}
