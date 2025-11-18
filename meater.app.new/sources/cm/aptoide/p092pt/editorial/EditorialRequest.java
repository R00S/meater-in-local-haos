package cm.aptoide.p092pt.editorial;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.dataprovider.BuildConfig;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p096v7.EditorialCard;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.AbstractC2229V7;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;
import cm.aptoide.p092pt.preferences.toolbox.ToolboxManager;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import p456rx.C11234e;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class EditorialRequest extends AbstractC2229V7<EditorialCard, BaseBody> {
    private final String cardId;
    private final String slug;

    public EditorialRequest(BaseBody baseBody, String str, String str2, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        super(baseBody, getHost(sharedPreferences), okHttpClient, factory, bodyInterceptor, tokenInvalidator);
        this.cardId = str;
        this.slug = str2;
    }

    public static String getHost(SharedPreferences sharedPreferences) {
        StringBuilder sb = new StringBuilder();
        sb.append(ToolboxManager.isToolboxEnableHttpScheme(sharedPreferences) ? "http" : BuildConfig.APTOIDE_WEB_SERVICES_SCHEME);
        sb.append("://");
        sb.append(BuildConfig.APTOIDE_WEB_SERVICES_V7_HOST);
        sb.append("/api/7.20240701/");
        return sb.toString();
    }

    public static EditorialRequest ofWithCardId(String str, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        return new EditorialRequest(new BaseBody(), str, HttpUrl.FRAGMENT_ENCODE_SET, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }

    public static EditorialRequest ofWithSlug(String str, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        return new EditorialRequest(new BaseBody(), HttpUrl.FRAGMENT_ENCODE_SET, str, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cm.aptoide.p092pt.dataprovider.WebService
    public C11234e<EditorialCard> loadDataFromNetwork(AbstractC2229V7.Interfaces interfaces, boolean z) {
        return !HttpUrl.FRAGMENT_ENCODE_SET.equals(this.slug) ? interfaces.getEditorialFromSlug(this.slug, (BaseBody) this.body, true) : interfaces.getEditorialFromCardId(this.cardId, (BaseBody) this.body, true);
    }
}
