package cm.aptoide.p092pt.dataprovider.p097ws.p101v7;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.dataprovider.BuildConfig;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.AbstractC2229V7;
import cm.aptoide.p092pt.preferences.toolbox.ToolboxManager;
import okhttp3.OkHttpClient;
import p456rx.C11234e;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class SetUserRequest extends AbstractC2229V7<BaseV7Response, Body> {

    public static class Body extends BaseBody {
        public UserProperties userProperties;
        public String user_access;

        public Body(String str, String str2) {
            this.user_access = str;
            this.userProperties = new UserProperties(str2);
        }

        public UserProperties getUserProperties() {
            return this.userProperties;
        }

        public String getUser_access() {
            return this.user_access;
        }

        public void setUserProperties(UserProperties userProperties) {
            this.userProperties = userProperties;
        }

        public void setUser_access(String str) {
            this.user_access = str;
        }
    }

    public static class UserProperties {
        private String name;

        public UserProperties(String str) {
            this.name = str;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String str) {
            this.name = str;
        }
    }

    protected SetUserRequest(Body body, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
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
    public static SetUserRequest m7463of(String str, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        return new SetUserRequest(new Body(str, null), bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }

    public static SetUserRequest ofWithName(String str, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        return new SetUserRequest(new Body(null, str), bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cm.aptoide.p092pt.dataprovider.WebService
    public C11234e<BaseV7Response> loadDataFromNetwork(AbstractC2229V7.Interfaces interfaces, boolean z) {
        return interfaces.setUser((Body) this.body);
    }
}
