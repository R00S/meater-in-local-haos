package cm.aptoide.p092pt.dataprovider.p097ws.p101v7;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.AbstractC2229V7;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.analyticsbody.DownloadInstallAnalyticsBaseBody;
import okhttp3.OkHttpClient;
import p456rx.C11234e;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class DownloadAnalyticsRequest extends AbstractC2229V7<BaseV7Response, DownloadInstallAnalyticsBaseBody> {
    private String action;
    private String context;
    private String name;

    protected DownloadAnalyticsRequest(DownloadInstallAnalyticsBaseBody downloadInstallAnalyticsBaseBody, String str, String str2, String str3, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        super(downloadInstallAnalyticsBaseBody, AbstractC2229V7.getHost(sharedPreferences), okHttpClient, factory, bodyInterceptor, tokenInvalidator);
        this.action = str;
        this.name = str2;
        this.context = str3;
    }

    /* renamed from: of */
    public static DownloadAnalyticsRequest m7438of(DownloadInstallAnalyticsBaseBody downloadInstallAnalyticsBaseBody, String str, String str2, String str3, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        return new DownloadAnalyticsRequest(downloadInstallAnalyticsBaseBody, str, str2, str3, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cm.aptoide.p092pt.dataprovider.WebService
    public C11234e<BaseV7Response> loadDataFromNetwork(AbstractC2229V7.Interfaces interfaces, boolean z) {
        return interfaces.addEvent(this.name, this.action, this.context, (DownloadInstallAnalyticsBaseBody) this.body);
    }
}
