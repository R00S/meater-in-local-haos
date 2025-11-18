package cm.aptoide.p092pt.dataprovider.p097ws.p101v7;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.database.room.RoomStore;
import cm.aptoide.p092pt.dataprovider.BuildConfig;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.AbstractC2229V7;
import cm.aptoide.p092pt.preferences.toolbox.ToolboxManager;
import com.fasterxml.jackson.annotation.JsonProperty;
import okhttp3.OkHttpClient;
import p456rx.C11234e;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class SimpleSetStoreRequest extends AbstractC2229V7<BaseV7Response, Body> {

    public static class Body extends BaseBody {
        private String storeName;
        private StoreProperties storeProperties;

        public Body(String str, String str2, String str3) {
            this.storeName = str;
            this.storeProperties = new StoreProperties(str2, str3);
        }

        public String getStoreName() {
            return this.storeName;
        }

        public StoreProperties getStoreProperties() {
            return this.storeProperties;
        }

        public void setStoreName(String str) {
            this.storeName = str;
        }

        public void setStoreProperties(StoreProperties storeProperties) {
            this.storeProperties = storeProperties;
        }
    }

    public static class StoreProperties {

        @JsonProperty("description")
        private String description;

        @JsonProperty(RoomStore.THEME)
        private String theme;

        public StoreProperties(String str, String str2) {
            this.theme = str;
            this.description = str2;
        }

        public String getDescription() {
            return this.description;
        }

        public String getTheme() {
            return this.theme;
        }

        public void setDescription(String str) {
            this.description = str;
        }

        public void setTheme(String str) {
            this.theme = str;
        }
    }

    private SimpleSetStoreRequest(Body body, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        super(body, getHost(sharedPreferences), okHttpClient, factory, bodyInterceptor, tokenInvalidator);
    }

    public static String getHost(SharedPreferences sharedPreferences) {
        StringBuilder sb = new StringBuilder();
        sb.append(ToolboxManager.isToolboxEnableHttpScheme(sharedPreferences) ? "http" : BuildConfig.APTOIDE_WEB_SERVICES_SCHEME);
        sb.append("://");
        sb.append(BuildConfig.APTOIDE_WEB_SERVICES_WRITE_V7_HOST);
        sb.append("/api/7/");
        return sb.toString();
    }

    /* renamed from: of */
    public static SimpleSetStoreRequest m7465of(String str, String str2, String str3, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        return new SimpleSetStoreRequest(new Body(str, str2, str3), bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cm.aptoide.p092pt.dataprovider.WebService
    public C11234e<BaseV7Response> loadDataFromNetwork(AbstractC2229V7.Interfaces interfaces, boolean z) {
        return interfaces.editStore((Body) this.body);
    }
}
