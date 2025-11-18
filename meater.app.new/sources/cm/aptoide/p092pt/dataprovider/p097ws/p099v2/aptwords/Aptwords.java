package cm.aptoide.p092pt.dataprovider.p097ws.p099v2.aptwords;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.dataprovider.BuildConfig;
import cm.aptoide.p092pt.dataprovider.WebService;
import cm.aptoide.p092pt.dataprovider.model.p094v2.GetAdsResponse;
import cm.aptoide.p092pt.dataprovider.p097ws.p099v2.aptwords.RegisterAdRefererRequest;
import cm.aptoide.p092pt.dataprovider.util.HashMapNotNull;
import cm.aptoide.p092pt.preferences.toolbox.ToolboxManager;
import okhttp3.OkHttpClient;
import p456rx.C11234e;
import retrofit2.Converter;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.POST;

/* loaded from: classes.dex */
abstract class Aptwords<U> extends WebService<Interfaces, U> {

    interface Interfaces {
        @FormUrlEncoded
        @POST("getAds")
        C11234e<GetAdsResponse> getAds(@FieldMap HashMapNotNull<String, String> hashMapNotNull, @Header(WebService.BYPASS_HEADER_KEY) boolean z);

        @FormUrlEncoded
        @POST("registerAdReferer")
        C11234e<RegisterAdRefererRequest.DefaultResponse> load(@FieldMap HashMapNotNull<String, String> hashMapNotNull);
    }

    Aptwords(OkHttpClient okHttpClient, Converter.Factory factory, SharedPreferences sharedPreferences) {
        super(Interfaces.class, okHttpClient, factory, getHost(sharedPreferences));
    }

    public static String getHost(SharedPreferences sharedPreferences) {
        StringBuilder sb = new StringBuilder();
        sb.append(ToolboxManager.isToolboxEnableHttpScheme(sharedPreferences) ? "http" : BuildConfig.APTOIDE_WEB_SERVICES_SCHEME);
        sb.append("://");
        sb.append(BuildConfig.APTOIDE_WEB_SERVICES_APTWORDS_HOST);
        sb.append("/api/2/");
        return sb.toString();
    }
}
